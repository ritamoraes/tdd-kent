package currency;

public abstract class Money {

    protected int amount;

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public abstract Money times(int multiplier);

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }


    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount &&
                getClass().equals(money.getClass());
    }
}
