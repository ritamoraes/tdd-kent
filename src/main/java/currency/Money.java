package currency;

public class Money implements Expression{

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

   public  Money times(int multiplier){
       return new Money(amount * multiplier,currency);
   }



    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount &&
                currency().equals(money.currency());
    }

    public String currency(){
        return currency;
    }

    @Override
    public String toString() {
        return "amount=" + amount +
                ", currency='" + currency;
    }

    public Expression plus(Money addend) {

        return new Money(amount + addend.amount, currency);
    }
}
