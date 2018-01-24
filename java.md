# Java

GitHub 是一种托管服务，为Git 仓库提供存储空间，还提供了方便的Web 界面。它提供了多种处理代码的方式。



###主要特性

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

        ​