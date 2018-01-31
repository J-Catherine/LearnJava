public class Jan31st_10{
    private static int M = 2000000;
    private static void p10(){
        long sum = 0;
        boolean[] m = new boolean[M];
        for(int i = 0; i < M; i++){
            m[i] = true;
        }
        for(int i=2; i < M; i++){
            if(m[i]){
                sum += i;
                for(int j = 2 * i; j < M; j += i){
                    m[j] = false;
                }
            }
        }
        System.out.println(sum);

    }
    public static void main(String[] args){
        p10();
    }
}