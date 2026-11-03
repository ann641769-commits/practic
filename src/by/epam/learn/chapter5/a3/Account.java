package by.epam.learn.chapter5.a3;

import java.util.ArrayList;

//класс Счет с внутренним классом Операция
public class Account {
    private String number;   // номер счета
    private double balance;  // остаток
    private ArrayList<Operation> operations = new ArrayList<>();

    public Account(String number) {
        this.number = number;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    // внутренний класс: хранит информацию об одной операции со счетом
    public class Operation {
        private String type;
        private double amount;

        public Operation(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return type + ": " + amount + " (счет " + number + ")";
        }
    }

    // поступление
    public void deposit(double amount) {
        balance += amount;
        operations.add(new Operation("Поступление", amount));
    }

    // снятие
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Недостаточно средств.");
            return;
        }
        balance -= amount;
        operations.add(new Operation("Снятие", amount));
    }

    // платеж
    public void pay(String receiver, double amount) {
        if (amount > balance) {
            System.out.println("Недостаточно средств.");
            return;
        }
        balance -= amount;
        operations.add(new Operation("Платеж (" + receiver + ")", amount));
    }
}
