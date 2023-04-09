public class Main {

    public static void main(String[] args) {

        Account myAccount = new Account("999", 500,
                "tester", "myemail@tester.com",
                "+994 999");

        System.out.println(myAccount.getNumber());
        System.out.println(myAccount.getBalance());

        myAccount.withdrawFunds(100.0);
        myAccount.depositFunds(250);
        myAccount.withdrawFunds(50);

        myAccount.withdrawFunds(200);

        myAccount.depositFunds(100);
        myAccount.withdrawFunds(45.55);
        myAccount.withdrawFunds(54.46);

        myAccount.withdrawFunds(54.45);
    }
}
