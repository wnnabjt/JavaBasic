package Demo03FunctionalInterface.Practice;

/*
    给定一个数组中包含多条"姓名,性别"的信息，要求只保留名字为四个字的女生。
 */

import java.util.ArrayList;
import java.util.function.Predicate;

public class InvalidInfoDelete {

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "玛尔扎哈,男", "赵丽颖,女"};
        ArrayList<String> validInfo = new ArrayList<>();
        for (String info : arr) {
            String[] split = info.split(",");
            if(checkInfo(split, s -> s[0].length() == 4, s -> s[1].equals("女"))) {
                validInfo.add(info);
            }
        }
        System.out.println(validInfo);
    }

    public static boolean checkInfo(String[] str, Predicate<String[]> pred1, Predicate<String[]> pred2) {
        return pred1.and(pred2).test(str);
    }

}
