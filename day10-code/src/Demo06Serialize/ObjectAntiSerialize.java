package Demo06Serialize;

/*
    java.io.ObjectInputStream extends InputStream
    ObjectInputStream：对象的反序列化流
    作用：把文件中保存的对象，以流的方式读取出来使用。

    构造方法：
        ObjectInputStream(InputStream in) 创建从指定的InputStream读取的ObjectInputStream。
        参数：InputStream in：字节输入流

    特有的成员方法：
        Object readObject() 从ObjectInputStream读取对象

    使用步骤：
        1.创建一个ObjectInputStream对象，构造方法中传递字节输入流
        2.使用ObjectInputStream对象的readObject读取保存对象的文件
        3.释放资源
        4.使用读取到的对象

    当我们将一个对对象序列化时，存储序列化的文件会存储该对象对应的类的序列号serialVersionUID。
    当该文件夹执行反序列化时，JVM会再次对比对象对应的类的序列号和txt中的serialVersionUID。一致时会发生发序列化，否则
    产生InvalidClassException异常。

    【如何解决】？
        我们可以在类的定义中自己定义一个serialVersionUID，这个变量必须是static和final修饰的long类型常量。
        这样的话，无论我们是否重新编译java文件，生成的class文件的serialVersionUID不会改变。
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ObjectAntiSerialize {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10-code\\src\\Demo06Serialize\\a.txt"));
        Object obj = ois.readObject();
        System.out.println(obj);
        ois.close();
    }

}
