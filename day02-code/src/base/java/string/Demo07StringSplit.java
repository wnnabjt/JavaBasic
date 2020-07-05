package base.java.string;

/*
分割字符串的方法：
public String[] split(String regex):按照参数的规则，将字符串切分为若干部分

注意事项：
split方法的参数其实是一个正则表达式，今后学习。
如果按照英文句点"."作为分割字符串，参数要写成"\\.";

 */

public class Demo07StringSplit {

    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] arrayA = str1.split(",");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }

        String str2 = "XXX.YYY.ZZZ";
        String[] arrayB = str2.split("\\.");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }
    }

}
