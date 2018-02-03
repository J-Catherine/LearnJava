+   第一题

    可以考虑用 “容斥原理” ——简化速度

+   第二题

    斐波那契数列。扫一遍

+   第三题

    唯一分解定理

+   第四题

    从i=999开始倒着算，j=i，结束条件是 i^2 < max 依次减下去，判断乘出来的数是否是质数，如果是，和当前最大的比

+   第五题

    nn的方法：辗转相除法（最小公倍数）

    yuer的方法：判断每个质数需要乘几次

+   第六题

    没什么好说的

+   第七题

    找第10001个质数。好难哇！

    Euler筛查法——不会写

    暴力做的.....

+   第八题

    读入很麻烦

    ```java
    //把所有内容都当做字符串读入
    String s="0";
            try {  
                FileInputStream in = new FileInputStream("./p8.data"); // 读取文件路径  
                byte bs[] = new byte[in.available()];  
                in.read(bs);
                s = new String(bs);
                in.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }
    ```

+   第九题

    枚举就好啦


+   第十题

    欧拉筛法

    找出一个质数后把所有它的倍数都标记掉

+   第十一题

    读入4个for循环（上下对角线）

    ```java
            String[] ss = s.split("\n|\r| ");
    		//用\n和\r还有空格分隔字符串（表示——正则表达式*-以后学）

            for(int i = 0; i < 20; i++){
                for(int j = 0; j < 20; j++){
                    data[i][j] = Integer.parseInt(ss[i*21+j]);//21是回车
                }
            }
    ```

+   第十二题

    先找出三角形数（n(n+1)/2）


