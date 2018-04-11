public class Apr11th_37{
    private static boolean IsPrime(int i){
        if(i == 1){
            return false;
        }
        double temp = Math.sqrt(i);
        for(int j = 2; j <= temp; j++){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
    private static boolean IsSpecial(int i){
        int temp = i;
        int[] a = new int[30];
        int l = 0;
        for(l = 0; temp != 0; l++){
            if(!IsPrime(temp)){
                return false;
            }
            a[l] = temp % 10;
            temp /= 10;
        }
        int val = 0;
        for(int j = 0; j < l; j++){
            for(int k = 0; k < j; k++){
                a[j] *= 10;
            }
            val += a[j];
            if(!IsPrime(val)){
                return false;
            }
        }
        return true;
    }
    private static void p37(){
        int sum = 0;
        for(int i = 0, j = 11; i < 11; j++){
            if(IsSpecial(j)){
                i++;
                sum += j;
                System.out.println(j);
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        p37();
    }
}