# Java

GitHub 是一种托管服务，为Git 仓库提供存储空间，还提供了方便的Web 界面。它提供了多种处理代码的方式。



### 主要特性

Java语言不使用指针，而是引用。并提供了自动的废料收集，使得程序员不必为内存管理而担忧。

- Java语言是面向对象的：

  Java语言提供类、接口和继承等面向对象的特性，为了简单起见，只支持类之间的单继承，但支持接口之间的多继承，并支持类与接口之间的实现机制（关键字为implements）。

  Java语言全面支持动态绑定，而C++语言只对虚函数使用动态绑定。总之，Java语言是一个纯的面向对象程序设计语言。



**高级语言**：如Java、 Python、 C、 C++、 Ruby 和 JavaScript 要想运行用高级语言编写的程序，必须将其转换为**低级语言**，即“机器语言”。

**高级语言特点**：编程容易、可移植的（用高级语言编写的程序只需做少量修改甚至无需修改，就可在不同类型的计算机上运行。用低级语言编写的程序只能在一种计算机上运行，必须重写才能在其他计算机上运行 ）

+   将高级语言转换为低级语言的程序：解释器和编译器。 

    解释器（interpreter）读取并执行用高级语言编写的程序，这意味着程序怎么说它就怎么做。它每次处理程序的一小部分，即交替地读取代码行并执行计算 

    编译器（compiler）读取并转换整个程序，然后才开始运行程序。在这种情况下，用高级语言编写的程序称为源代码（source code），而转换得到的程序称为目标代码（object code）或可执行程序（executable）。程序编译后可反复执行，无需在每次执行前都进行转换。因此，**编译型程序的运行速度通常比解释型程序更快**。 

Java 既是**解释型的又是编译型的**。 Java 编译器不将程序直接转换为机器语言，而是生成字节码（byte code）。字节码类似于机器语言，解释起来既轻松又快捷，同时也是可移植的，即可在一台机器上编译程序，在另一台机器上运行生成的字节码。运行字节码的解释器被称为 Java 虚拟机（Java Virtual Machine， JVM） 

+   Java 程序由**类**定义和**方法**定义组成
    +   方法由语句（statement）组成。语句是一行执行基本操作的代码。	e.g. main是一种方法
      +   类（class）是方法的集合，类的首字母应该大写，**类必须与其所属的文件同名**。e.g. 类Hello存储在Hello.java中



**应先编写少量可正确运行的代码，再逐步修改和调试，最终得到一个提供所需功能的程序**





### 打印

```java
public class Hello {
    public static void main(String[] args) {
    	// 生成一些简单的输出
      	System.out.print("ABC"); //不换行打印一行
      	System.out.println("Hello, World!"); //“打印一行并换行”—— println
      	System.out.print("Hello!\nHow are you doing?\n"); // \n和How之间没有空格
        System.out.println("She said \"Hello!\" to me."); //字符串中包含引号时用\转义字符
	}
}
```

要在同一行输出多个值，通常使用多条print 语句，并在最后使用一条println 语句。



### 变量和运算符

基本

```java
String lastName;
int hour, minute;
double pi;
pi = 3.14159;

import java.util.Scanner; //导入Scanner类
public class Echo {
	public static void main(String[] args) {
	String line;
	Scanner in = new Scanner(System.in);
	System.out.print("Type something: ");
	line = in.nextLine();
	System.out.println("You said: " + line);
	System.out.print("Type something else: ");
	line = in.nextLine();
	System.out.println("You also said: " + line);
	}
}
```



### 输入和输出

+   System类
    +   提供了与运行程序的系统或环境相关的方法，以及特殊值System.out，这个值提供了显示输出的方法，其中包括println。

        ```java
        System.out.println(System.out);
        /*
        结果如下：
        java.io.PrintStream@685d72cd
        */
        ```

    +   System.out 是一个PrintStream，而PrintStream 是在java.io 包中定义的。包（package）是一组相关的类；java.io 包含用于I/O（输入和输出）的类。

        @ 后面的数字和字母是System.out 的十六进制地址（address）。值的地址指的是值在计算机内存中的位置，可能随计算机而异。在这个示例中，地址为685d72cd，但如果你运行这些代码，可能会得到不同的地址。

    +   特殊值System.in，这是一个InputStream，提供了从键盘读取输入的方法。这些方法用起来并不那么容易


+   Scanner类

    +   处理输入

        ```java
        import java.util.Scanner; //导入
        Scanner in = new Scanner(System.in); //创建一个Scanner 对象，声明了一个名为in 的Scanner 变量

        //nextLine：从键盘读取一行输入，并返回一个String。
        ```

    +   Scanner类的bug

        先读取String 再读取int 时，一切都正常，但如果先读取int 再读取String，将发生怪异的事情。

        nextLine（）方法的结束符只是Enter键，即nextLine（）方法返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的

+   设置输出的格式

    +   使用print 或println 输出double 值时，最多显示16 位小数：System.out.print(4.0 / 3.0);

    +   System.out 提供了另一个方法printf，让你对输出格式有更大的控制权，printf 中的f 指的是“格式化”

        printf 也不在末尾换行

        ```java
        System.out.printf("Four thirds = %.3f", 4.0 / 3.0);
        /*
        括号中第一个值为格式字符串（format string），指定了输出的显示方式。
        格式说明符（format specifier）：以百分号打头的特殊序列。%.3f：显示为浮点数，并舍入到三位小数。
        输出结果：
        Four thirds = 1.333
        */

        int inch = 100;
        double cm = inch * CM_PER_INCH;
        System.out.printf("%d in = %f cm\n", inch, cm);
        /*
        结果如下：
        100 in = 254.000000 cm
        */
        ```

        ​

### void方法

+   Math类的方法

    +   组合

        +   与数学函数一样，Java 方法也是可以组合的，这意味着可在一个表达式中包含另一个表达式。例如，

        ```java
        //将任何表达式用作方法的实参
        double x = Math.cos(angle + Math.PI / 2.0);
        //将一个方法的结果用作另一个方法的实参
        double x = Math.exp(Math.log(10.0));
        ```




### 逻辑

栈图是个好东西



### 值方法

+   重载

    多个方法同名，但每个方法接受的参数不同。



### 循环

+   封装和泛化

    封装：如果某一能够正确运行，就将它们封装到一个方法中，并再次测试。
    泛化：如果这个方法没问题，就将其中的字面量替换为变量和形参。



### 数组

```java
//声明
int[] counts;
double[] values;

//建立
counts = new int[4];
values = new double[size];

//创建数组
int[] counts = new int[4];
double[] values = new double[size];
```

+   显示数组

    ```java
    int[] a = {1, 2, 3, 4};
    System.out.println(a);
    /*
    输出:
    [I@bf3f7e0
    方括号表明值是一个数组，I 表示整数，余下的内容是这个数组的地址
    */
    ```

    工具类java.util.Arrays，这个类提供了处理数组的方法。其中一个方法toString，用于返回数组的字符串表示。

    ```java
    System.out.println(Arrays.toString(a));
    /*
    输出如下：
    [1, 2, 3, 4]
    */
    ```

+   复制数组

    直接赋值 `double[] b = a;` 这种方法只能使a、b两个变量**指向**同一个数组，a 和b 只是表示同一样东西的不同名称

    而要复制数组本身而不是指向它的引用，那么就必须创建一个新的数组，并将旧数组中的每个元素都复制到新数组中

    或者选择是使用 java.util.Arrays，它提供了复制数组的方法 copyOf `double[] b = Arrays.copyOf(a, 3);` ，其中的第二个参数用来指定要复制的元素个数

+   数组长度

    内置常量length

+   随机数

    ```java
    java.util.Random //生成伪随机数
      
    //这个类的方法nextInt 接受int 实参n，并返回一个位于0~n-1（闭区间）的随机数。

    public static int[] randomArray(int size) {
    	Random random = new Random();
    	int[] a = new int[size];
    	for (int i = 0; i < a.length; i++) {
    		a[i] = random.nextInt(100); //0~99 的随机数来填充
    	}
    	return a;
    }

    int numValues = 8;
    int[] array = randomArray(numValues);
    printArray(array);
    ```

+   改进的for循环

    ```java
    for (int i = 0; i < values.length; i++) {
    	System.out.println(values[i]);
    }

    for (int value : values) {
    	System.out.println(value);
    }

    //两种形式等价。
    //for (int value : values)可以理解为for(value in values)对于values 中的每个值value
    ```



### 字符串

+   字符

    字符串提供了提取字符的方法charAt，这个方法会返回一个char

    ```java
    String fruit = "banana";
    char letter = fruit.charAt(0);//表示要提取位置0 处的字符b
    ```

    在Unicode 中，每个字符由一个字符编码表示，我们可将字符编码视为整数。大写的希腊字母的字符编码为913~937，因此我们可以像下面这样显示希腊字母表：

    ```java
    System.out.print("Greek alphabet: ");
    for (int i = 913; i <= 937; i++) {
    	System.out.print((char) i); //使用了类型转换将指定范围内的每个整数都转换为相应的字符。
    }
    System.out.println();
    ```

+   字符串是不可以修改的

    字符串提供了方法toUpperCase 和toLowerCase，它们可分别转换为大写和小写。

    ```java
    String name = "Alan Turing";
    String upperName = name.toUpperCase();
    /*
    upperName 将指向字符串"ALAN TURING"，但name 依然指向字符串"Alan Turing"。
    */
    ```

    replace方法，它在字符串中查找并替换指定的子串。

    ```java
    String text = "Computer Science is fun!";
    text = text.replace("Computer Science", "CS");//将"Computer Science" 替换为"CS"
    /*
    它调用text.replace，然后text.replace方法返回一个引用，该引用指向新字符串"CS is fun!"。然后它将这个引用赋给变量text，使其不再指向原来的字符串。
    */
    ```

+   子串

    方法substring 返回一个新的字符串，其中包含已有字符串中从指定索引到末尾的字符。

    ```java
    • fruit.substring(0) 返回"banana"
    • fruit.substring(2) 返回"nana"
    • fruit.substring(6) 返回""
      
    //（起始，终止）
    • fruit.substring(0, 3) 返回"ban"
    • fruit.substring(2, 5) 返回"nan"
    • fruit.substring(6, 6) 返回""
    ```

+   查找字符串 indexOf

    indexOf 方法返回的是字符第一次出现处的索引

    ```java
    String fruit = "banana";
    int index = fruit.indexOf('a');

    //第二个实参，指定从字符串的什么位置开始查找。
    int index = fruit.indexOf('a', 2); //从fruit[2]开始查找（包括[2]的字符'n'）
    ```

+   字符串比较

    **运算符 == 通过比较引用来判断两个变量指向的是否为同一个对象** （不建议比较两个字符串是否相等，有时会出现错误答案）

    正确方法——使用方法 equals：

    ```java
    //对name1 调用equals，并将实参指定为name2。如果两个字符串包含相同的字符，方法equals 将返回true，否则返回false

    if (name1.equals(name2)) {
    	System.out.println("The names are the same.");
    }
    ```

    如果两个字符串不同，可用compareTo 来确定按字母表顺序排列时哪个字符串在前：

    compareTo 方法的返回值为两个字符串中第一个不同的字符的差——name1[i]-name2[i]

    ```java
    //name1[i]-name2[i]

    int diff = name1.compareTo(name2);
    if (diff == 0) {
    	System.out.println("The names are the same.");
    } else if (diff < 0) {
    	System.out.println("name1 comes before name2.");
    } else if (diff > 0) {
    	System.out.println("name2 comes before name1.");
    }
    ```

    **equals 和compareTo 都区分大小写。** （大写字母在小写字母前）

+   设置字符串格式

    ```
    String.format("%02d:%02d %s", hour, minute, ampm);
    ```

    格式说明符%02d 表示将整数显示为两位（不够两位就添加前导零），因此 timeString(19, 5) 返回字符串"07:05 PM"。

+   包装类

    Java 库包含与每种基本类型对应的类，这些类被称为包装类

    与char对应的包装类为Characte；与int 对应的包装类为Integer；其他包装类包括Boolean、Long 和Double。这些包装类都位于java.lang 包中，因此无需导入就可使用。

    每个包装类都定义了常量MIN_VALUE 和MAX_VALUE。例如，Integer.MIN_VALUE 的值为-2147483648，而Integer.MAX_VALUE 的值为2147483647。

    例子：

    字符串转换为其他类型：`Integer.parseInt(str)` 将字符串转换为整数

    返回值的字符串表示：toString 方法`String str = Integer.toString(num);`

+   命令行实参

    ```
    java class 10 -3 55 0 14
    ```

    ​


### 对象

对象（object）是提供一系列方法的数据集合。例如，String 是一个字符串集合，提供了charAt 和substring 等方法。

+   Point对象

    +   用于表示笛卡尔平面中的位置坐标，在 java.awt 包中 `import java.awt.Point;`

        ```java
        import java.awt.Point;

        Point blank;
        blank = new Point(3, 4);
        System.out.println(blank);
        /*
        输出：java.awt.Point[x=3,y=4]
        */
        ```

    +   属性：属于对象的变量通常称为属性或字段

    +   返回对象

        ```java
        public static Point findCenter(Rectangle box) {
            int x = box.x + box.width / 2;
            int y = box.y + box.height / 2;
            return new Point(x, y); //创建了一个新的Point 对象，并返回一个指向该对象的引用
        }
        ```

        **将对象赋给变量时，赋给变量的实际上是指向对象的引用**

    +   类图

        +   由统一建模语言（Unified Modeling Language，UML）定义的一种概述类设计的标准方式。
        +   上半部分列出了属性，下半部分列出了方法
        +   状态图描述的是程序运行时的对象和变量，而类图描述的是编译时的源代码。



### 类

数据封装（data encapsulation）

+   构造函数

    +   • 构造函数与类同名；
        • 构造函数没有返回类型（因此没有返回值）；
        • 不使用关键字static

    +   构造函数可以**重载**

        一种常见的做法：在提供一个不接受任何参数的构造函数（如前面的构造函数）的同时，提供一个“值构造函数”

        ```java
        public Time(int hour, int minute, double second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        ```

+   获取方法和设置方法

    私有变量可在当前类（如Time）中访问，但如果试图在其他类中访问它们（如继承），编译器会报错。可提供 “获取方法” 和 “设置方法”：

    ```java
    //获取方法-在Time类中
    public int getHour() {
    	return this.hour;
    }
    public int getMinute() {
    	return this.minute;
    }

    //设置方法-在Time类中
    public void setHour(int hour) {
    	this.hour = hour;
    }
    public void setMinute(int minute) {
    	this.minute = minute;
    }
    ```

+   方法toString

    每种对象类型都有一个名为toString 的方法，用于返回对象的字符串表示

    实例方法（非静态方法static）：必须通过类（这里是Time）的实例来调用

    ```java
    public String toString() {
    	return String.format("%02d:%02d:%04.1f\n",this.hour, this.minute, this.second);
    } //toString 中的this 与time 指的是同一个对象。

    Time time = new Time(11, 59, 59.9);
    String s = time.toString();
    System.out.println(time);
    ```

+   方法equals

    运算符== 检查两个对象是否相同（identical），即指的是否是同一个对象。

    方法equals 检查两个对象是否相等（equivalent），即它们的值是否相同。

+   纯方法和非纯方法

    +   纯方法——静态方法

        返回类的引用

        • 它们没有修改形参；
        • 它们没有任何“副作用”，如打印；
        • 它们的返回值完全取决于形参，而不受任何其他状态的影响。

    +   非纯方法

        直接修改当前的Time 对象，而不是创建并返回一个新的Time 对象——修改对象状态（实例变量）

        ```java
        //纯方法
        public static Time add(Time t1, Time t2) {
        	Time sum = new Time();
        	sum.hour = t1.hour + t2.hour;
        	sum.minute = t1.minute + t2.minute;
        	sum.second = t1.second + t2.second;
        	return sum;
        }

        //非纯方法
        public void increment(double seconds) {
            this.second += seconds;
            while (this.second >= 60.0) {
                this.second -= 60.0;
                this.minute += 1;
            }
            while (this.minute >= 60) {
                this.minute -= 60;
                this.hour += 1;
            }
        }
        ```




### 对象数组

+   类变量

    在类定义中声明，使用了关键词static 对其进行标识。它们创建于程序开始运行（或所属类首次被使用）时，直到程序结束才消失。类变量由其所属类的所有实例共享。

    ```java
    public class Card {
        public static final String[] RANKS = {
            null, "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};
        public static final String[] SUITS = {
        	"Clubs", "Diamonds", "Hearts", "Spades"};
        	
        // 这里为实例变量和构造函数
        public String toString() {
        	return RANKS[this.rank] + " of " + SUITS[this.suit];
        }
    }
    ```

    类变量常用于存储多个地方要用到的常量值。在这种情况下，还应将它们声明为final。

    请注意，决定将变量声明为static 或final 时，需要考虑两个不同的因素：**如果变量由所有实例共享，那么就将其声明为static；如果变量为常量，就应将其声明为final。**

    **对于static final 变量来说，一种常用的命名约定是采用全大写**

+   方法compareTo

    需要制定规则，比如在点数相同但是花色不同时指明哪个更重要

+   Card对象是不可修改的

    为此，只要不提供任何非纯方法（包括设置方法）就可以了。但以后还可能有人傻乎乎地添加非纯方法。为防范这种情况，可
    **将实例变量声明为final 的**：

    ```java
    public class Card {
    private final int rank;
    private final int suit;
    ...
    }
    ```

+   二分法查找

    (1) 选择一个位于low 和high 之间的索引（mid），并将该索引处的Card 对象同目标进行比较。

    (2) 如果找到目标，就返回这个索引。
    (3) 如果mid 处的Card 对象比目标小，就在范围mid + 1 到high 中搜索。
    (4) 如果mid 处的Card 对象比目标大，就在范围low 到mid - 1 中搜索。

    ```java
    public static int binarySearch(Card[] cards, Card target) {
        int low = 0;
        int high = cards.length - 1;
        while (low <= high) {
        	int mid = (low + high) / 2; 					 // 第1步
        	int comp = cards[mid].compareTo(target);
        	if (comp == 0) { 								// 第2步
        		return mid;
            } else if (comp < 0) { 							 // 第3步
            	low = mid + 1;
            } else { 										// 第4步
            	high = mid - 1;
            }
        }
        return -1;
    }
    ```

+   二分法的递归调用

    ```java
    public static int binarySearch(Card[] cards, Card target, int low, int high) {
        if (high < low) {
        	return -1;
        }
        int mid = (low + high) / 2; 							 // 第1步
        int comp = cards[mid].compareTo(target);
        if (comp == 0) { 										// 第2步
        	return mid;
        } else if (comp < 0) { 									 // 第3步
        	return binarySearch(cards, target, mid + 1, high);
        } else { 												// 第4步
        	return binarySearch(cards, target, low, mid - 1);
        }
    }
    ```



### 数组对象

