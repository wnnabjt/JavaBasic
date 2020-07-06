package Demo04Extends;

public class NewPhone extends Phone {

    @Override
    public void show() {
        super.show(); // 直接将父类中show方法的全体拿到这里再编辑自己添加的新内容
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }

}
