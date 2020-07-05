package base.java.API;
import java.util.Scanner;

/*
Scanner类的功能：可以实现键盘输入数据到程序当中。

引用类型的一般步骤：
1.导包 format: import 包路径.类名称
如果需要使用的目标类，和当前类位于同一个包下，则可以省略包语句不写。
只有java.lang包下的内容不需要导包，其他的包都需要import导包。
2.创建 format： 类名称 对象名 = new 类名称();
3.使用 对象名.成员方法();

注意事项：Scanner输入的值其实全是String，使用nextInt可以将该String转换为int类型，其他也一样。
 */

public class Demo01Scanner {

    public static void main(String[] args) {
        //System.in代表从键盘输入
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        String str = sc.next();
        System.out.println(str);
    }
}
