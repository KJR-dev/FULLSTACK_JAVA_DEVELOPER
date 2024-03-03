// Define a class Account to represent a bank account. Create accountNumber, customerName, balance as instance members
// and rateOfInterest as static variable.Provide member functions for the following operations
//A. Set account number
//B. Set customer name
//C. Set balance
//D. Set rate of interest
//E. Calculate simple interest (take time as an argument)
//F. Get account number
//G. Get balance
//H. Get customer name

package Account;

public class Account {
    private long accountNo;
    private String customerName;
    private float balance;
    private static float roi;

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public static float getRoi() {
        return roi;
    }

    public static void setRoi(float roi) {
        Account.roi = roi;
    }
    public double calculateInterest(int time){
        return balance*roi*time/100;
    }
}
