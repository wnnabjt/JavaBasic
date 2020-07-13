package Demo06Serialize;

/*
    java.io.ObjectOutputStream extends OutputStream
    ObjectOutputStream：对象的序列化流
    作用：把对象以流的方式写入到文件中保存

    构造方法：
        ObjectOutputStream(OutputStream out) 创建写入指定OutputStream的ObjectOutputStream。
        参数：OutputStream：字节输出流
    特有的成员方法：
        void writeObject(Object obj) 将指定的对象写入 ObjectOutputStream

    使用步骤：
        1.创建ObjectOutputStream对象，构造方法中传递字节输出流
        2.使用ObjectOutputStream对象中的方法writeObject，把对象写入到文件中
        3.释放资源

    【注意事项】：
        需要进行序列化或者反序列化的类，必须实现Serializable接口。
        该接口类似于标记的意思，只有被标记的类才能进行序列化和反序列化。

    【transient】：当不想类中的某个变量被序列化时，就是用transient修饰，不被修饰的参数，默认值为零。
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerialize {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream oop = new ObjectOutputStream(new FileOutputStream("day10-code\\src\\Demo06Serialize\\a.txt"));
        oop.writeObject(new Student("张子枫", 18));
        oop.writeObject(new Student("刘子枫", 18));
        oop.writeObject(new Student("李子枫", 18));
        oop.flush();
        oop.close();
    }

}
