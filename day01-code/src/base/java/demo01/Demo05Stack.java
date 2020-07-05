package base.java.demo01;

/*
Java的内存需要划分为5个部分：

1.栈(Stack):存放的是方法中的局部变量，方法的运行一定要在栈中。
    局部变量：方法的参数，或者是方法体内的变量。
    作用域：一旦超出作用域，立刻从栈中消失。
2.堆(Heap)：凡事new出来的东西，都在堆当中。
    堆中存放的东西都有一个地址值：16进制。
    堆中存放的数据都有默认值，规则和new相同。
3.方法去(Method Area)：存储.class相关信息，包含方法的信息。
4.本地方法栈(Native Method Stack)：与操作系统相关。
5.寄存器(PC Register)：与CPU相关。
 */

public class Demo05Stack {
}
