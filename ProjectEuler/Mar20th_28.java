public class Mar20th_28{
    private static void p28(){
        int sum = 0;
        for(int i = 3; i <= 1001; i += 2){
            sum += 4 * i * i - 6 * i + 6;
        }
        sum += 1;
        System.out.println(sum);
        System.out.println(Integer.MAX_VALUE);
    }
    public static void main(String[] args){
        p28();
    }
}