public class Mar31th_32{
    private static int sum = 0;
    // private static void cycle(int m, int[] dic){
        
    // }
    private static void p32(int m, int n){
        int a[] = {1, 10, 100, 1000, 10000};
        
        String si = "", sj = "", sk = "";
        int prod = 0;
        int flag = 1;
        int[] dic = new int[10];
        int[] dic3 = new int[10000];
        for(int i = a[m-1]; i < a[m]; i++){
            flag = 1;
            si = String.valueOf(i);
            for(int k = 0; k < 10; k++){
                dic[k] = 0;
            }
            for(int k = 0; k < m; k++){
                int tempc = si.charAt(k)-48;
                if(dic[tempc] == 0){
                    dic[tempc] = 1;
                }
                else{
                    flag = 0;
                    break;
                }
            }
            if(flag == 0){
                continue;
            } 
            
            int[] dic2 = new int[10];
            
            for(int j = a[n-1] - 1; j < a[n]; j++){
                flag = 1;
                sj = String.valueOf(j);
                for(int t = 0; t < 10; t++){
                    dic2[t] = dic[t];
                }
                for(int k = 0; k < n; k++){
                    int tempc = sj.charAt(k)-48;
                    if(dic2[tempc] == 0){
                        dic2[tempc] = 1;
                    }
                    else{
                        flag = 0;
                        break;
                    }
                }
                if(flag == 0){
                    continue;
                }


                prod = i * j;;
                sk = String.valueOf(prod);
                if(prod < 10000){
                    for(int k = 0; k < 4; k++){
                        int tempc = sk.charAt(k)-48;
                        if(dic2[tempc] == 0){
                            dic2[tempc] = 1;
                        }
                        else{
                            flag = 0;
                            break;
                        }
                    }
                    for(int r = 1; r < 10; r++){
                        if(dic2[r] == 0){
                            flag = 0;
                            break;
                        }
                    }

                    if(flag == 1){
                        if(dic3[prod] == 0){
                            sum += prod;
                            dic3[prod] = 1;
                            System.out.printf("%s * %s = %s\n",si,sj,prod);
                        }
                        
                    }
                }
            }
        }
        
    }
    public static void main(String[]args){
        p32(1,4);
        p32(2,3);
        System.out.println(sum);
    }

}