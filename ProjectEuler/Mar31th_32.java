public class Mar31th_32 {
    private static int sum = 0;

    private static int cycle(int m, int i, int[] dic) {
        int flag = 1;
        String si = String.valueOf(i);
        for (int k = 0; k < m; k++) {
            int tempc = si.charAt(k) - 48;
            if (dic[tempc] == 0) {
                dic[tempc] = 1;
            } else {
                flag = 0;
                break;
            }
        }
        return flag;
    }

    private static void p32(int m, int n) {
        int a[] = { 1, 10, 100, 1000, 10000 };
        int prod = 0;
        int flag = 1;
        int[] dic = new int[10];
        int[] dic3 = new int[10000];
        for (int i = a[m - 1]; i < a[m]; i++) { 
            for (int k = 0; k < 10; k++) {
                dic[k] = 0;
            }
            flag = cycle(m, i, dic);
            if (flag == 0) {
                continue;
            }

            int[] dic2 = new int[10];

            for (int j = a[n - 1] - 1; j < a[n]; j++) {
                for (int t = 0; t < 10; t++) {
                    dic2[t] = dic[t];
                }
                flag = cycle(n, j, dic2);
                if (flag == 0) {
                    continue;
                }

                prod = i * j;
                if (prod < 10000) {
                    flag = cycle(4, prod, dic2);
                    for (int r = 1; r < 10; r++) {
                        if (dic2[r] == 0) {
                            flag = 0;
                            break;
                        }
                    }

                    if (flag == 1) {
                        if (dic3[prod] == 0) {
                            sum += prod;
                            dic3[prod] = 1;
                            System.out.printf("%d * %d = %s\n", i, j, prod);
                        }

                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        p32(1, 4);
        p32(2, 3);
        System.out.println(sum);
    }

}