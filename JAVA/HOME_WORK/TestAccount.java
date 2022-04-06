public class TestAccount {
    public static void main(String[] args) {
        Account testAccount=new Account(1120,25000.00,6.0);
        testAccount.withdraw(3000.00);
        testAccount.deposit(4000.00);
        System.out.println("Account Details :-");
        System.out.println("_______________");
        System.out.println("ID :- "+testAccount.getId());
        System.out.println("Balance :- "+testAccount.getBalance());
        System.out.println("Annual rate of interest :- "+testAccount.getAnnualinterestrate());
        System.out.println("Date :- "+testAccount.getDatecreated());
    }
}
