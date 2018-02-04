import java.io.*;

public class Feb4th_13{
    private static void p13(){
        //读入
        String s="0";
        try {  
            FileInputStream in = new FileInputStream("./p13.data"); // 读取文件路径  
            byte bs[] = new byte[in.available()];  
            in.read(bs);
            s = new String(bs);
            in.close();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }
        String[] ss = s.split("\n");
        //System.out.println(ss[0]);
        int [][] data = new int[100][52];

        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 50; j++){
                data[i][j+2] = Integer.parseInt(ss[i].substring(j,j+1));
            }
            data[i][0] = 0;
            data[i][1] = 0;
        }

        int[] sum = new int[52];

        for(int i = 0; i < 100; i++){
            for(int j = 51; j >= 0; j--){
                sum[j] += data[i][j];
                if(sum[j] / 10 != 0){
                    sum[j-1] += 1;
                    sum[j] %= 10; 
                }
            }
        }

        int x = 2;
        if(sum[0] != 0){
            x = 0;
        }            
        else if(sum[1] != 0){
            x = 1;
        }

        for(int i = 0; i < 10; i++){
            System.out.print(sum[x + i]);
        }
    }

    public static void main(String[] args){
        p13();
    }
}