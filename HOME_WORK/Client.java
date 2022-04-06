public class Client {
    private int id;
    private String name;
    private String phone; 
    private ArrayList<Account> account;    
    public Client(int id,String name,String phone) {
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.account=ArrayList<Account>();
    }
    public boolean addAccounts(Account account) {
        account.add(account);
        return true;        
    }
    public boolean removeAccount(int id) {
        for (Account acc : account) {
            if (acc.getId==id) {
                account.remove(account);
                return true;
            }
            return false;
        }
    }

}
