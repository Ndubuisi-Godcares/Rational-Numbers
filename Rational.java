package ExceptionHandling;
public class Rational {
    private int numerator;
    private int denominator;
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public Rational add(Rational other) {
        int num = numerator * other.denominator + other.numerator * denominator;
        int den = denominator * other.denominator;
        return new Rational(num, den);
    }
    public Rational subtract(Rational other) {
        int num = numerator * other.denominator - other.numerator * denominator;
        int den = denominator * other.denominator;
        return new Rational(num, den);
    }
    public Rational multiply(Rational other) {
        int num = numerator * other.numerator;
        int den = denominator * other.denominator;
        return new Rational(num, den);
    }
    public Rational divide(Rational other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int num = numerator * other.denominator;
        int den = denominator * other.numerator;
        return new Rational(num, den);
    }
    public double toDouble() {
        return (double) numerator / denominator;
    }
    public Rational abs() {
        int num = Math.abs(numerator);
        int den = Math.abs(denominator);
        return new Rational(num, den);
    }
    public int compareTo(Rational other) {
        int num1 = numerator * other.denominator;
        int num2 = other.numerator * denominator;
        return Integer.compare(num1, num2);
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);

    }
}
