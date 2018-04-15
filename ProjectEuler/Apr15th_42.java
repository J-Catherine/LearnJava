import java.io.*;

public class Apr15th_42{
    static int[] tri = new int[2000];
    private static void TriNum(){
        int temp = 0;
        for(int n = 1; temp < 1170; n++){
            temp = n * (n + 1) / 2;
            tri[temp] = 1;
            
        }
    }
    private static void p42(){
        String s = "0";
        try {  
            FileInputStream in = new FileInputStream("./p42.data");
            byte bs[] = new byte[in.available()];  
            in.read(bs);
            s = new String(bs);
            in.close();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }

        TriNum();
        int count = 0;
        int[] d = new int[100];
        for(int i = 65, j = 1; i < 91; i++, j++){
            d[i] = j;
            //System.out.printf("%d:",d[i]);
        }
        int temp = 0, value = 0;
        for(int j = 0; j < 16345; j++){
            temp = s.charAt(j);
            //System.out.printf("%d  ",temp);
            if(temp == 34 && value > 0){
                if(tri[value] == 1){
                    count++;
                }
                j++;
                value = 0;
                continue;
            }
            value += d[temp];
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        p42();
    }
}
//"A","ABILITY","ABLE","ABOUT","