import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.*;

public class Mar6th_22{
    private static void p22(){
        //读入
        String s="0";
        try {  
            FileInputStream in = new FileInputStream("./p22.data"); // 读取文件路径  
            byte bs[] = new byte[in.available()];  
            in.read(bs);
            s = new String(bs);
            in.close();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }
        

        List<String> list = new ArrayList<>();
        String[] ss = s.split(",");
        int n = 0;
        for(String res : ss){
            String temps = res.substring(1, res.length() - 1);
            list.add(temps);
        }
        Collections.sort(list);//sort names

        int count = 1;
        int sum = 0;
        for(String ls : list){
            int tempsum = 0;
            for(int i = 0; i < ls.length(); i++){
                tempsum += ls.charAt(i) - 'A' + 1;
            }
            sum += count * tempsum;
            count++;
        }
        System.out.print(sum);
    }
    public static void main(String[] args){
        p22();
    }
}