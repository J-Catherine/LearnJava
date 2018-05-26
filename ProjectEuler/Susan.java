public class Susan{
    public static void main(String [] args){
        int c = 0;
        for(int i = 1; i < 37; i++){
            for(int j = 1; j<=i && j < 37; j++){
                for(int k = 1;k<=j && k < 37; k++){
                    if( i * j * k == 36){
                        c++;
                        System.out.printf("%d-  i:%d  j:%d  k:%d\n",c, i , j, k) ;
                    }
                }
            }
        }
    }
}