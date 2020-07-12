package Demo04Lambda;

/*
lambda表达式的标准格式：
    由三部分组成：
    1.一些参数
    2.一个箭头
    3.一段代码
    format：(参数列表) -> {一些重写方法的代码};
    解释说明：
        ()：接口中抽象方法的参数列表
        ->：传递的意思，将参数传递给方法体{}
        {}：重写接口的抽象方法的方法体

lambda表达式：可推导，可省略

凡是根据上下文推导出来的内容，都可以省略不写
可以省略的内容：
1.(参数列表)：括号中参数列表的数据类型可以省略不写
2.(参数列表)：括号中过的参数如果只有一个，那么类型和括号都可以省略
3.{一些代码}：如果{}中的代码只有一行，无论是否有返回值，都可以省略({}, return, 分号)
    注意：如果要省略，({}, return, 分号)必须一起省略。
【注意】：省略实例见其他java代码

使用Lambda表达式的前提：
1.Lambda表达式必须有接口，且要求接口中有且仅有一个抽象方法。
2.使用Lambda必须具有上下文推断。
也就是方法的参数或者局部变量类型必须为Lambda对应的接口类型，才能使用Lambda作为该接口的实例。

【】：有且仅有一个抽象方法的接口，称为函数式接口。
 */

public class Lambda {

    public static void main(String[] args) {
        /*使用匿名内部类的方式创建一个线程*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "一个新的线程创建成功了");
            }
        }).start();

        /*使用Lambda表达式来实现多线程*/
        new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "一个新的线程创建成功了");
            }
        ).start();
        //Eg:Omit
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "一个新的线程创建成功了")).start();
    }

}
