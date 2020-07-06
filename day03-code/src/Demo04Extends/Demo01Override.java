package Demo04Extends;

/*
方法覆盖重写的注意事项：

1.必须保证父子类之间的方法名称相同，参数列表也相同。
@Override：写在方法前面，用来检测子类中的方法是不是有效的正确覆盖重写。
这个注解就算不写，只要满足重写要求，也是正确的覆盖重写。

2.子类方法的返回值必须【小于等于】父类方法的返回值类型。
小扩展提示：java.lang.Object类是所有类的公共最高父类（祖宗类）， java.lang.String就是Object的子类。

3.子类方法的权限必须【大于等于】父类方法的权限修饰符。
小扩展提示：public > protected > (default) > private
备注：(default)不是关键字，而是什么都不写留空，例如 int num;


4.当重写一个方法但需要父类的该方法的完整版时，在子类重写方法的开头写super.方法名();

 */

import org.w3c.dom.ls.LSOutput;

public class Demo01Override {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("=========");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }

}

