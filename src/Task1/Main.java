package Task1;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            customers.add(new Customer(""+i,""+i,""+i));
        }
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}
