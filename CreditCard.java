public class CreditCard {

    private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(0);
        this.creditLimit = new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }
    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void makePayment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}