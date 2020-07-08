package Demo03PackageClass;

/*
基本类型和字符串类型之间可以相互转换。
基本类型 --> 字符串类型
1.基本类型数值 + ""。
2.使用包装类中的静态方法。
    static Sting toString(Integer i)
3.使用String类的静态方法。
    static String valueOf(int i)

字符串 --> 基本类型
    使用包装类中的静态方法parseXxxx("字符串")
    eg:
        static int parseInteger(String s);
 */

public class DemoReverseInBaseDateAndString {

    public static void main(String[] args) {
        Integer num = 1;
        String integerStr = num + "";
        System.out.println(integerStr);

        int num1 = 10;
        String intStr = num1 + "";
        System.out.println(intStr);

        String integerStr1 = num.toString();
        System.out.println(integerStr1);

        String str = String.valueOf(123);
        System.out.println(str);

        String strInteger = "2134434";
        int num3 = Integer.parseInt(strInteger);
        System.out.println(num3);
    }

}
