public class Account {
    private int accountNo;
    private String name;
    private float amount;

    public void insert(int accountNo, String name, float amount) {
        this.accountNo = accountNo;
        this.name = name;
        this.amount = amount;
    }

    public void deposit(float depositAmount) {
        if (depositAmount > 0)
            this.amount += depositAmount;
        System.out.println(depositAmount + " deposited");
    }

    public void withdraw(float withdrawAmount) {
        if (withdrawAmount <= this.amount)
            this.amount -= withdrawAmount;
        else {
            System.out.println("Not enough balance");
        }

        System.out.println(withdrawAmount + " withdrawn");
    }

    public void checkBalance() {
        System.out.println("Your Balance = " + this.amount);
    }

    @Override
    public String toString() {
        return "Account{" + "accountNo=" + accountNo + ", name=" + name + ", amount=" + amount + '}';
    }

}
