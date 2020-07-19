package Demo08AnnotationUseToMultiMethodTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CheckTest {

    public static void main(String[] args) throws IOException {
        Demo01Calculator cal = new Demo01Calculator();
        Class calClass = cal.getClass();
        Method[] methods = calClass.getMethods();

        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            if(method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(cal);
                } catch (Exception e) {
                    number ++;
                    bw.write(method.getName() + "方法出现了异常");
                    bw.newLine();
                    bw.write("异常的名称" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因是" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("---------------------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现了" + number + "次异常");
        bw.flush();
        bw.close();
    }

}
