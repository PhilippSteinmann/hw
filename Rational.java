/*
Philipp Steinmann
Period 9
HW 27
2013-11-18
http:www.stuycs.org/courses/ap-computer-science/brownmykolyk/hw/hw27
*/ public class Rational {
    public int _numerator;
    public int _denominator;
    
    public Rational() {
        _numerator = 0;
        _denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this();
        if (denominator != 0) {
            _numerator = numerator;
            _denominator = denominator;
            reduce();
        }
    }

    public float floatValue() {
        return (float) _numerator / _denominator;
    }
    
    public void multiply (Rational other) {
        _numerator *= other._numerator;
        _denominator *= other._denominator;
        reduce();
    }
    
    public void divide (Rational other) {
        _numerator *= other._denominator;
        _denominator *= other._numerator;
        reduce();
    }

    public void add (Rational other) {
        _numerator = (_numerator * other._denominator) +
                     (other._numerator * _denominator);

        _denominator *= other._denominator;
        reduce();
    }

    public void subtract(Rational other) {
        _numerator = (_numerator * other._denominator) -
                     (other._numerator * _denominator);

        _denominator *= other._denominator;
        reduce();
    }

    public int gcd(int a, int b) {
        int greater = a > b ? a : b;
        int lesser = greater == b ? a : b;
        int remainder = 1;

        remainder = greater % lesser;

        int answer = lesser;
        
        if (remainder > 0)
            answer = gcd(lesser, remainder);

        return answer;
    }

    public void reduce() {
        int factor = gcd(_numerator, _denominator);
        _numerator /= factor;
        _denominator /= factor;
    }
    
    public String toString() {
        return _numerator + " / " + _denominator;
    }

    public static void main(String[] spaghetti) {
        Rational drafting = new Rational(9, 16);
        System.out.print(drafting);
        System.out.println(" = " + drafting.floatValue());

        Rational half = new Rational(1, 2);
        Rational two = new Rational(2, 1);
        Rational four = new Rational(4, 1);

        drafting.multiply(two);
        System.out.println(drafting + " = " + drafting.floatValue() + " \t\t(doubled)");

        drafting.divide(four);
        System.out.println(drafting + " = " + drafting.floatValue() + " \t(halved)");

        drafting.multiply(two);
        drafting.add(half);
        System.out.println(drafting + " = " + drafting.floatValue() + " \t(added 1/2) ");

        drafting.subtract(half);
        drafting.subtract(half);
        System.out.println(drafting + " = " + drafting.floatValue() + " \t(subtracted 1/2) ");
    }
}
