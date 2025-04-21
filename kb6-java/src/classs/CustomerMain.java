package classs;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("김지민", 25, 10000, false);
        customer1.printCustomerInfo();

        Customer customer2 = new Customer();
        customer2.printCustomerInfo();

    }
}
