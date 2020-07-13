package Demo06Serialize.Practice;

/*
    将多个Student类进行序列化，由于序列化不支持多对象读取，因此我们将Student装入集合中，将集合序列化。
    然后反序列化即可。
 */

import java.io.*;
import java.util.ArrayList;

public class MultiObjectSerialize {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 18));
        list.add(new Student("李四", 19));
        list.add(new Student("王五", 20));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("" +
                "day10-code\\src\\Demo06Serialize\\Practice\\a.txt"));
        oos.writeObject(list);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("" +
                "day10-code\\src\\Demo06Serialize\\Practice\\a.txt"));

        ArrayList<Student> o = (ArrayList<Student>)ois.readObject();
        System.out.println(o);
        oos.close();
        ois.close();
    }

}
