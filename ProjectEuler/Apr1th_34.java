public class Apr1th_34{
    private static void p34(){
        int[] a = {1,1,2,6,24,120,720,5040,40320,362880};
        int sum = 0;
        int res = 0;
        for(int i = 3; i < 362881; i++){
            sum = 0;
            for(int temp = i; temp > 0;){
                sum += a[(temp % 10)];
                temp /= 10;
            }
            if(sum == i){
                res += sum;
                System.out.println(i);
            }
        }
        System.out.println(res);
    }
    private static int findGreatestCommonFactor(int a, int b){
        int temp = b;
        for(int i = temp; i >= 1; i--){
			if(a % i == 0 && b % i == 0){
				return i;
			}
        }
        return 1;
    }

    private static void p33(){
        //int[] a ={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,}
        double f1 = 0.0, f2 = 0.0;
        int proi = 1, proj =1;
        for(int i = 11; i < 100; i++){
            for(int j = 10; j < i; j++){
                f1 = (j * 1.0) / i;
                int a0 = i / 10, a1 = i % 10;
                int b0 = j / 10, b1 = j % 10;
                int tempi = 0, tempj = 0;
                //int[] d = new int[10];
                if(a0 == b0 && a0 != 0){
                    tempi = a1;
                    tempj =  b1;
                }
                else if(a0 == b1 && a0 != 0){
                    tempi = a1;
                    tempj =  b0;
                }
                else if(a1 == b0 && a1 != 0){
                    tempi = a0;
                    tempj = b1;
                }
                else if(a1 == b1 && a1 != 0){
                    tempi = a0;
                    tempj =  b0;
                }
                f2 = (tempj*1.0) / tempi;
                if(f1 == f2){
                    proi *= tempi;
                    proj *= tempj;
                    System.out.printf("i:%d j:%d tempi:%d tempj:%d\n", i,j,tempi,tempj);
                }
            }
        }
        int x = findGreatestCommonFactor(proi, proj);
        System.out.println(proi / x);
    }
    public static void main(String[] args){
        //p34();
        p33();
    }
}