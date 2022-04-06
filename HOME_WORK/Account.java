import java.util.*;

public class Account {
    private int id;
    private double balance;
    private double annualinterestrate;
    private Date datecreated;

    public Account() {
        this(0, 0.0, 0.0);
    }

    public Account(int id, double balance, double annualinterestrate) {
        this.id = id;
        this.balance = balance;
        this.annualinterestrate = annualinterestrate;
        this.datecreated = new Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAnnualinterestrate(double annualinterestrate) {
        this.annualinterestrate = annualinterestrate;
    }

    public double getAnnualinterestrate() {
        return this.annualinterestrate;
    }

    public Date getDatecreated() {
        return this.datecreated;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            return true;
        }
        return false;
    }
}
