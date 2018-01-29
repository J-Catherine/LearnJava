import java.io.*;

public class Jan29th_9{
    public static void p8() {
        // ReadFile
        String s="0";
        try {  
            FileInputStream in = new FileInputStream("./p8.data"); // 读取文件路径  
            byte bs[] = new byte[in.available()];  
            in.read(bs);
            s = new String(bs);
            in.close();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }
        int[] si = new int[1000];
        for(int i=0,j=0; i < 1000; i++,j++){
            if(s.charAt(j)<48||s.charAt(j)>57){
                j+=2;
            }
            si[i] = Integer.parseInt(s.substring(j,j+1));
        }

        long product = 1;
        long max = 0;
        int begin = -1;
        for(int i = 0; i < 13; i++){
            product *= si[i];
        }
        for(int i = 13; i < 1000; i++){
            if(product > max){
                max = product;
                begin = i - 13;
            }
            if(si[i-13] != 0){
                product /= si[i-13];
                product *= si[i];
            }
            else{
                product = 1;
                for(int j = i-12; j <= i; j++){
                    product *= si[j];
                }
            }
        }
        System.out.print(si[begin]);
        for(int i = 1; i < 13; i++){
            System.out.printf("*%d",si[i + begin]);
        }
        System.out.print("=");
        System.out.println(max);
    }


    public static void main(String[] args){
        //String a = ""
        p8();
    }
}