package Task2;
public class Main {
    public static void main(String[] args) {
        Cafe c = new Cafe();
        c.loadMenuData();
        for (String co : c.coffeeMenu) {
            System.out.println(co);
        }
    }
}
