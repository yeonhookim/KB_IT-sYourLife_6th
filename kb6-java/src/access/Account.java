package access;

import org.w3c.dom.ls.LSOutput;

public class Account {
    int total;

    Account(int init) {
        this.total = init;
    }
    void deposit(int amount) {
        this.total += amount;
    }
    void withdraw(int   amount) {
        this.total -= amount;
    }

}