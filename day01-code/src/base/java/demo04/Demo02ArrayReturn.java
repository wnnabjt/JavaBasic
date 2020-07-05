package base.java.demo04;

public class Demo02ArrayReturn {

    public static int[] caculate(int a, int b, int c) {
        int[] array = new int[2];
        array[0] = a + b + c;
        array[1] = (array[0] / 3);
        return array;
    }

    public static void main(String[] args) {
        int a[] = caculate(1, 2, 3);
        System.out.println("总和" + a[0]);
        System.out.println("平均" + a[1]);
    }

}
