package by.epam.learn.chapter5.a3;

//операции со счетом
public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account("BY12 0001");

        account.deposit(1000);
        account.withdraw(200);
        account.pay("Интернет-провайдер", 350);

        System.out.println("Операции со счетом:");
        // тип внутреннего класса записывается через имя внешнего: Account.Operation
        for (Account.Operation operation : account.getOperations()) {
            System.out.println(operation);
        }
    }
}
