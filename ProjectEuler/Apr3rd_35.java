public class Apr3rd_35{
    private static boolean isPrime(int b){
        double tmp = Math.sqrt(b);
        for(int i = 2; i <= tmp; i++){
            if(b % i == 0){
                return false;
            }
        }
        return true;
    }
    private static void p35(){
        String str = "";
        String s = "";
        for(int i =0; i < 1000000; i++){
            str = String.valueOf(i);
            char[] array = str.toCharArray();
            for (int j = 0; j < array.length; j++){
            }
        }
    }
    public static void main(String[] args){
        p35();
    }
} 