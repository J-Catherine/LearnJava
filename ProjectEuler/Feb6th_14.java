public class Feb6th_14{
    private static int[][]f = new int[21][21];
    private static int p14(int r, int c){
        int sum = 0;
        if(f[r][c] > 0)//!很重要，否则时间复杂度是O(2^40)
            return f[r][c];
        if(r > 0){ 
            sum += p14(r-1, c);
        }
        if(c > 0){
            sum += p14(r, c -1);
        }
        f[r][c] = sum;
        return sum;
        //f(r,c) = f(r-1,c) + f(r,c-1)
    }
    public static void main(String[] args){
        int N = 20;
        for(int i = 0; i <= 20; i++){
            for(int j = 0;j <= 20; j++){
                f[i][j] = -1;
            }
        }
        f[0][0] = 1;
        int x = p14(20,20);
        System.out.print(x);
    }
}