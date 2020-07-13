package Demo03Properties;

/*
    java.util.Properties集合 extendsHashTable<k, v> implements Map<k, v>
    Properties类表示了一个持久的属性集。Properties可保存在流中或从流中加载。
    Properties集合是唯一一个和IO流相结合的集合。
        可以使用Properties集合中的方法store，把集合中的临时数据持久化写入到硬盘中存储。
        可以使用Properties集合中的方法load，把硬盘中保存的文件(键值对)，读取到集合中使用。

    属性列表中每个键及其对应值都是一个字符串。
        Properties集合是一个双列集合，key和value都默认是String类型。

    Properties集合有一些操作字符串的特有方法：
        Object setProperty(String key, String value) 调用的是Hashtable的put方法。
        String getProperty(String key)，通过key值，找到其对应的value值。与Hashtable中的get相仿
        Set<String> stringPropertyNames() 返回此属性列表中的键集，相当于Map集合方法中的keySet方法。
 */

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {

    public static void main(String[] args) throws IOException {
//        demo01();
//        demo02();
        demo03();
    }

    private static void demo03() throws IOException {
        /*
            可以使用Properties集合中的方法load，把硬盘中保存的文件(键值对)，读取到集合中使用。
            void load(InputStream inStream)
            void load(Reader reader)
            参数：
                InputStream inStream：字节输入流，不能读取含有中文的键值对
                Reader reader：字符输入流，可以读取含有中文的键值对

            使用步骤：
                1.创建Properties集合对象
                2.创建字节/字符输入流，使其指向要读取的文件
                3.使用Properties集合的load方法读取保存键值对的文件
                4.遍历Properties集合。
         */
        Properties prop = new Properties();
        prop.load(new FileReader("day10-code\\src\\Demo02CharacterStream\\a.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            System.out.println(key + "=" + prop.getProperty(key));
        }
    }

    private static void demo02() {
        /*
            使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储。
            void store(OutputStream out, String comments)
            void store(Writer writer, String comments)
            参数：
                OutputStream：字节输出流：不能写入中文
                Writer writer：字符输出流，可以写入中文
                String comments：注释，用来解释说明保存的文件是做什么用的
                    不能使用中文，会产生乱码，默认是Unicode编码
                    一般使用""空字符串

            使用步骤：
                1.创建Properties集合对象，添加数据。
                2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地。
                3.使用Properties中的store方法，把集合中的临时数据持久化的写入到硬盘中存储
                4.释放资源
         */
        Properties prop = new Properties();
        prop.setProperty("迪丽热巴", "18");
        prop.setProperty("古力娜扎", "28");
        prop.setProperty("玛尔扎哈", "35");
        try(Writer fw = new FileWriter("day10-code\\src\\Demo02CharacterStream\\a.txt")) {
            prop.store(fw, "");
        } catch(IOException e) {
            System.out.println(e);
        }
    }


    private static void demo01() {
        Properties prop = new Properties();
        prop.setProperty("迪丽热巴", "18");
        prop.setProperty("古力娜扎", "28");
        prop.setProperty("玛尔扎哈", "35");

        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            System.out.println(key + "=" + prop.getProperty(key));
        }


    }

}
