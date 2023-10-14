package exercises.exercise1_2_17;

public class Rational {

    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational plus(Rational b) {
        int resultNumerator = this.numerator;
        int resulDenominator = this.denominator;
        int tempNumerator1 = this.numerator;
        int tempDenominator1 = this.denominator;
        int tempNumerator2 = this.numerator;
        int tempDenominator2 = this.denominator;

        if (this.denominator == b.denominator) {
            resultNumerator = this.numerator + b.numerator;
        } else {
            tempDenominator1 = this.denominator * b.denominator;
            tempNumerator1 = this.numerator * b.denominator;

            tempDenominator2 = this.denominator * b.denominator;
            tempNumerator2 = b.numerator * this.denominator;

            tempNumerator1 = tempNumerator1 + tempNumerator2;
            int gcd = gcd(tempNumerator1, tempDenominator1);

            resultNumerator = tempNumerator1/gcd;
            resulDenominator = tempDenominator1/gcd;
        }

        return new Rational(resultNumerator, resulDenominator);
    }

    public Rational minus(Rational b) {
        int resultNumerator = this.numerator;
        int resulDenominator = this.denominator;
        int tempNumerator1 = this.numerator;
        int tempDenominator1 = this.denominator;
        int tempNumerator2 = this.numerator;
        int tempDenominator2 = this.denominator;

        if (this.denominator == b.denominator) {
            resultNumerator = this.numerator - b.numerator;
        } else {
            tempDenominator1 = this.denominator * b.denominator;
            tempNumerator1 = this.numerator * b.denominator;

            tempDenominator2 = this.denominator * b.denominator;
            tempNumerator2 = b.numerator * this.denominator;

            tempNumerator1 = tempNumerator1 - tempNumerator2;
            int gcd = gcd(tempNumerator1, tempDenominator1);

            resultNumerator = tempNumerator1/gcd;
            resulDenominator = tempDenominator1/gcd;
        }

        return new Rational(resultNumerator, resulDenominator);
    }

    public Rational times(Rational b) {
        int resultNumerator = this.numerator;
        int resulDenominator = this.denominator;
        int tempNumerator1 = this.numerator;
        int tempDenominator1 = this.denominator;

        tempDenominator1 = this.denominator * b.denominator;
        tempNumerator1 = this.numerator * b.numerator;

        int gcd = gcd(tempNumerator1, tempDenominator1);

        resultNumerator = tempNumerator1 / gcd;
        resulDenominator = tempDenominator1 / gcd;

        return new Rational(resultNumerator, resulDenominator);
    }

    public Rational divides(Rational b) {
        int resultNumerator = this.numerator;
        int resulDenominator = this.denominator;
        int tempNumerator1 = this.numerator;
        int tempDenominator1 = this.denominator;

        tempDenominator1 = this.denominator * b.numerator;
        tempNumerator1 = this.numerator * b.denominator;

        int gcd = gcd(tempNumerator1, tempDenominator1);

        resultNumerator = tempNumerator1 / gcd;
        resulDenominator = tempDenominator1 / gcd;

        return new Rational(resultNumerator, resulDenominator);
    }

    private int gcd(int p, int q){
        if (q==0) return p;
        int r = p % q;
        return gcd(q,r);
    }

    public boolean equals(Rational that) {
        if (this.numerator != that.numerator) return false;
        if (this.denominator != that.denominator) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
