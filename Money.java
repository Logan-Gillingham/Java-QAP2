public class Money {

    private double dollars;
    private long cents;

    public Money(double dollars) {
        this.dollars = dollars;
        this.cents = Math.round((dollars - Math.floor(dollars)) * 100);
        if (cents < 0) {
            cents += 100;
            dollars--;
        }
    }

    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

    @Override
    public String toString() {
        return "$" + String.format("%.02f", dollars);
    }

    public int compareTo(Money other) {
        if (dollars > other.dollars) {
            return 1;
        } else if (dollars < other.dollars) {
            return -1;
        } else {
            return Integer.compare((int) cents, (int)other.cents);
        }
    }

    public Money add(Money other) {
        double totalDollars = dollars + other.dollars;
        long totalCents = cents + other.cents;
        if (totalCents >= 100) {
            totalDollars++;
            totalCents -= 100;
        }
        return new Money(totalDollars);
    }

    public Money subtract(Money other) {
        double totalDollars = dollars - other.dollars;
        long totalCents = cents - other.cents;
        if (totalCents < 0) {
            totalDollars--;
            totalCents += 100;
        }
        return new Money(totalDollars);
    }
}