import java.io.*;
import java.math.*;

public class Feb8th_20{
    private static void p16(){
        int[] muti = new int[100000];
        int posnum = 1; //位数
        int sum = 0;
        //初始化muti数组
        muti[0] = 1;
        for(int i = 1; i < 100000; i++){
            muti[i] = 0;
        }
        for(int j = 0; j < 1000; j++){
            for(int i = 0; i < posnum; i++){
                muti[i] += muti[i];
            }
            for(int i = 0; i < posnum; i++){
                if(muti[i] > 9){
                    muti[i] -= 10;
                    muti[i+1]++;
                }
            }
            if(muti[posnum]>0){  
                posnum ++;
            }
        }
        for(int i = 0; i < posnum; i++){
            sum += muti[i];
        }
        System.out.println(sum);
    }

    private static int p18(int i, int j, int[][] data){
        //两种选择：data[i+1][j],data[i+1][j+1]
        //f(i+1,j) or f(i+1,j+1)
        int sum = data[i][j];
        if(i < 14){
            int left = p18(i+1, j, data);
            int right = p18(i+1, j+1, data); 
            sum += Math.max(left, right);
        }
        return sum;
    }

    private static void p18_main(){
        String s = "";
        int[][] data = new int[15][15];
        try {  
            FileInputStream in = new FileInputStream("./p18.data"); // 读取文件路径  
            byte bs[] = new byte[in.available()];  
            in.read(bs);
            s = new String(bs);
            in.close();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }

        String[] ss = s.split("\n|\r| ");
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < i + 1; j++){
                data[i][j] = Integer.parseInt(ss[(1+i)*i/2+i + j]);
            }
        }

        int x = p18(0,0,data);
        System.out.println(x);
    }

    private static void p17(){

    }

    private static void p20(){
        
    }
    
    public static void main(String[] args){
        //p16();
        p18_main();
    }
}