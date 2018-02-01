import java.io.*;

public class Feb1st_11{
    private static void p11(){
        String s = "";
        int[][] data = new int[20][20];
        try {  
            FileInputStream in = new FileInputStream("./p11.data"); // 读取文件路径  
            byte bs[] = new byte[in.available()];  
            in.read(bs);
            s = new String(bs);
            in.close();  
        } catch (Exception e) {  
            e.printStackTrace();
        }
        
        String[] ss = s.split("\n");
        for(int i = 0; i < 20; i++){
            String[] sss = ss[i].split(" ");
            for(int j = 0; j < 19; j++){
                data[i][j] = Integer.parseInt(sss[j]);
            }
            String[] ssss = sss[19].split("\r");
            data[i][19] = Integer.parseInt(ssss[0]);
        }

        // for(int i = 0; i < 20; i++){
        //     for(int j = 0; j < 19; j++){
        //        System.out.printf("%02d ",data[i][j]);
        //     }
        //     System.out.printf("%02d\n",data[i][19]);
        // }

        int i = 0, j = 0;
        int temp = 0, result = 0;
        for(i = 0; i < 20; i++)
        {
            for(j = 0; j < 17; j++)
            {
                temp = data[i][j] * data[i][j+1] * data[i][j+2] * data[i][j+3];
                result = result > temp ? result : temp;
            }
        }

        for(i = 0; i < 17; i++)
        {
            for(j = 0; j < 20; j++)
            {
                temp = data[i][j] * data[i+1][j] * data[i+2][j] * data[i+3][j];
                result = result > temp ? result : temp;
            }
        }

        for(i = 0; i < 17; i++)
        {
            for(j = 0; j < 17; j++)
            {
                temp = data[i][j] * data[i+1][j+1] * data[i+2][j+2] * data[i+3][j+3];
                result = result > temp ? result : temp;
            }
        }


        for(i = 3; i < 20; i++)
        {
            for(j = 0; j < 17; j++)
            {
                temp = data[i][j] * data[i-1][j+1] * data[i-2][j+2] * data[i-3][j+3];
                result = result > temp ? result : temp;
            }
        }

        System.out.println(result);
    }

    
    public static void main(String[] args){
        p11();
    }
}