/*
Philipp Steinmann
Period 9
HW 27
2013-11-18
http:www.stuycs.org/courses/ap-computer-science/brownmykolyk/hw/hw27
*/

public class Rational {
    private int _numerator;
    private int _denominator;
    
    public Rational() {
        _numerator = 0;
        _denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this();
        if (denominator != 0) {
            _numerator = numerator;
            _denominator = denominator;
        }
    }

    public float floatValue() {
        return (float) _numerator / _denominator;
    }
    
    public void multiply (Rational other) {
        _numerator *= other.getNumerator();
        _denominator *= other.getDenominator();
    }
    
    public void divide (Rational other) {
        _numerator *= other.getDenominator();
        _denominator *= other.getNumerator();
    }
    
    public int getNumerator() {
        return _numerator;
    }
    
    public int getDenominator() {
        return _denominator;
    }

    public String toString() {
        return _numerator + " / " + _denominator;
    }

    public static void main(String[] spaghetti) {
        Rational drafting = new Rational(9, 16);
        System.out.print(drafting);
        System.out.println(" = " + drafting.floatValue());

        Rational two = new Rational(2, 1);
        Rational four = new Rational(4, 1);

        drafting.multiply(two);
        System.out.println(drafting + " (doubled)");

        drafting.divide(four);
        System.out.println(drafting + " (halved)");
    }
}
