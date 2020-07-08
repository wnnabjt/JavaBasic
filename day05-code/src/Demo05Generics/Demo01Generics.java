package Demo05Generics;

/*

集合不适用泛型，默认类型就是Object类型，可以存储任意类型的数据。
弊端：不安全。
原因：如果使用Object类型，所有类型都可以存储，当我们需要对某一部分数据进行操作的时候，有时需要将Object类型向下转型。
但是并不能确定我们存储的数据到底是什么类型，所以就会村子类型转换错误的异常。

使用泛型的好处：
1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型。
2.把运行期(代码运行之后报错)异常，提升到了编译期(写代码时报错)
弊端：
    泛型是什么类型，集合就只能存储什么类型。

 */

import java.util.ArrayList;

public class Demo01Generics {

    public static void main(String[] args) {

    }

}
