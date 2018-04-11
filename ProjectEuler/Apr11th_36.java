public class Apr11th_36{
    private static boolean IsPalindromes(int sys, int i){
        int temp = i;
        int[] a = new int[21];
        int j = 0;
        for(j = 0; temp != 0; j++){ //j is the length of i
            a[j] = temp % sys;
            temp /= sys;
        }
        for(int k = 0; k < j/2; k++){
            if(a[k] != a[j-1-k]){
                return false;
            }
        }
        return true;
    }
    private static void p36(){
        int sum = 0;
        for(int i = 1; i < 1000000; i++){
            if(IsPalindromes(2,i) && IsPalindromes(10, i)){
                //System.out.println(i);
                sum += i;
            }  
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        p36();
    }
}