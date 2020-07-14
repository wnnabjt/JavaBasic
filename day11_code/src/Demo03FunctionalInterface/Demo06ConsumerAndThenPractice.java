package Demo03FunctionalInterface;

/*
    要求，将数组中的字符串按照指定格式打印。
    input：String[] arr = {"迪丽热巴,女", "古力娜扎,女", "玛尔扎哈,男"}
    output：姓名：迪丽热巴。性别：女。
            ...
 */

import java.util.function.Consumer;

public class Demo06ConsumerAndThenPractice {

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "玛尔扎哈,男"};
        for (String message : arr) {
            String[] tempStr = message.split(",");
            printMessage(tempStr, (s) -> {
                System.out.print("姓名：" + s[0] + " ");
            }, (s) -> {
                System.out.println("性别：" + s[1]);
            });
        }
    }

    public static void printMessage(String[] tempStr, Consumer<String[]> con1, Consumer<String[]> con2) {
        con1.andThen(con2).accept(tempStr);
    }

}
