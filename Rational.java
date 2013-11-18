// Philipp Steinmann
// Period 9
// HW 27
// 2013-11-18


public class Rational {
    private int _numerator;
    private int _denominator;
    
    public Rational() {
        _numerator = 0;
        _denominator = 0;
    }

    public Rational(int numerator, int denominator) {
        if (denominator != 0) {
            _numerator = numerator;
            _denominator = denominator;
        }

        else
            _numerator = 0;
            _denominator = 0;
    }
}
