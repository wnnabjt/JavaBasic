package Demo08Final;

/*
当用final关键字修饰局部变量时，该局部变量的值也不能再发生改变。
当局部变量是基本类型时，他的值不再发生变化。
当局部变量是引用类型时，他的地址值不再发生变化。
 */

public class Demo03JuBuVariable {

    final String str1 = "郭靖";

//    str1 = "黄蓉"; //此方法不可行，因为str1的地址已经不能发生改变了

}
