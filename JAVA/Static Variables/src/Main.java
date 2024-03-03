import Account.Account;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Account obj1=new Account();
        obj1.setAccountNo(20195390598L);
        obj1.setCustomerName("jitendra sahoo");
        obj1.setBalance(10000F);
        Account.setRoi(3.5F);
        System.out.println(obj1.getAccountNo());
        System.out.println(obj1.getCustomerName());
        System.out.println(obj1.getBalance());
        System.out.println(Account.getRoi());
        System.out.println(obj1.calculateInterest(4));
    }


}