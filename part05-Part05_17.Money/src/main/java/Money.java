
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }

    public Money minus(Money decreaser) {
        // Find out whether using the decreaser will leave a negative amount, in which case I'm creating an object that is 0,0;
        int amount1 = 0;
        int amount2 = 0;
        amount1 = this.euros * 100 + this.cents;
        amount2 = decreaser.euros * 100 + decreaser.cents;

        if (amount1 <= amount2) {
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
        // The new amount will be above 0 so we need to take the euros and cents away from one another.
            else {
                if (this.cents < decreaser.cents) { // To account for cents being less than the cents being taken away, this function minuses a euro and adds 100 to the cents to do the calculation.
                    // I dont have to worry about the cents being less and the euros being less because the first if statement removes that possibility.
                Money newMoney = new Money((this.euros - 1) - decreaser.euros, (this.cents + 100) - decreaser.cents);
                return newMoney;
            }
            else { // if cents are more then its straight forward.
                    Money newMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
                    return newMoney;
                }
            }
        }


    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
