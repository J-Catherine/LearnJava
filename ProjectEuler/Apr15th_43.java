public class Apr15th_43{
    static int N = 10000 + 10;
    static int[] a = new int[N];
    private static void p43(){
        int ans = -1;
        int n = 10000;
        for(int i = 1; i <= n; ++i)
        {
            a[i] = i * (3*i - 1) / 2;
            for(int j = 1; j < i; ++j)
            {
                if(binary_search(a+1, a+1+i, a[i]-a[j]) && binary_search(a+1, a+1+i, a[i]-a[j]*2))
                {
                    ans = a[i] - a[j]*2;
                    break;
                }
            }
            if(ans != -1)
                break;
        }
        printf("%d\n", ans);
        }
    }
        public static void main(String[] args){
            p43();
        }
    }