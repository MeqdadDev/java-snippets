public class Main {

    public static void main(String[] args) {

        Account a1 = new Account();
        a1.insert(4451238, "Mohammad", 10000);
        a1.deposit(12000);
        a1.withdraw(2000);
        a1.checkBalance();
        System.out.println(a1.toString());

        Account a2 = new Account();
        a2.insert(8540254, "Meqdad", 40000);
        a2.deposit(3000);
        a2.withdraw(1500);
        a2.checkBalance();
        System.out.println(a2.toString());

        Account a3 = new Account();
        a3.insert(7542, "Ashraf", 5000);
        a3.deposit(1000);
        a3.withdraw(6800);
        a3.checkBalance();
        System.out.println(a3.toString());
    }
}
