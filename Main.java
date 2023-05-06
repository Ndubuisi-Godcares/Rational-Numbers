package ExceptionHandling;
public class Main {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int den1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);
            int den2 = Integer.parseInt(args[3]);
            Rational r1 = new Rational(num1, den1);
            Rational r2 = new Rational(num2, den2);
            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
            System.out.println("r1 + r2 = " + r1.add(r2));
            System.out.println("r1 - r2 = " + r1.subtract(r2));
            System.out.println("r1 * r2 = " + r1.multiply(r2));
            System.out.println("r1 / r2 = " + r1.divide(r2));
            System.out.println("|r1| = " + r1.abs());
            System.out.println("|r2| = " + r2.abs());
            System.out.println("r1 as double = " + r1.toDouble());
            System.out.println("r2 as double = " + r2.toDouble());
            System.out.println("r1 compared to r2 = " + r1.compareTo(r2));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}