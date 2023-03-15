package Task1;

public class Customer {
    private String fritsName;
    private String lastName;
    private String userName;
    private int id;

    public Customer(String fritsName, String lastName, String userName) {
        this.fritsName = fritsName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public String getFritsName() {
        return fritsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" + "fritsName=\"" + fritsName + "\"" + ", lastName=\"" + lastName + "\"" + ", userName=\"" + userName + "\"" + ", id=" + id +"}";
    }
}
