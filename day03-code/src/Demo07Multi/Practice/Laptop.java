package Demo07Multi.Practice;

import java.security.Key;

public class Laptop {

    public void open() {
        System.out.println("电脑开机");
    }

    public void close() {
        System.out.println("电脑关机");
    }

    public void useDevice(Usb usb) {
        usb.open();
        if(usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if(usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.close();
    }

}
