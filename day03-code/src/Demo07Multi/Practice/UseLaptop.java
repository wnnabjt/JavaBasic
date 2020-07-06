package Demo07Multi.Practice;

public class UseLaptop {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.open();

        Usb mouse = new Mouse();
        Usb keyboard = new Keyboard();

        laptop.useDevice(mouse);
        laptop.useDevice(keyboard);

        laptop.close();
    }

}
