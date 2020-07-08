package Demo05Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo06Generics {

    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(123.45);
        doubleArrayList.add(34.56);
        out(doubleArrayList);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("古力娜扎");
        stringArrayList.add("玛尔扎哈");
        out(stringArrayList);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<Object> objectArrayList = new ArrayList<>();

        out1(doubleArrayList);
        out1(integerArrayList);
//        out1(stringArrayList); String不是Number类的子类

//        out2(integerArrayList); int不是String的父类
        out2(stringArrayList);
        out2(objectArrayList);

    }

    public static void out(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void out1(ArrayList<? extends Number> list) {
        Iterator<?> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void out2(ArrayList<? super String> list) {
        Iterator<?> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
