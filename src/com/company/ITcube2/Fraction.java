package com.company.ITcube2;

public class Fraction {
    int numerator, denumerator;

    Fraction(int numerator, int denumerator) {
        this.numerator = numerator;
        if (denumerator == 0) {
            System.out.println("На 0 делить нельзя");
            throw new ArithmeticException();
        }
        this.denumerator = denumerator;
    }

    String print() {
        return numerator + "/" + denumerator;
    }

    void add(Fraction other) {
        this.numerator = this.numerator * other.denumerator + this.denumerator * other.numerator;
        this.denumerator *= other.denumerator;
    }

    void sub(Fraction other) {
        this.numerator = this.numerator * other.denumerator - this.denumerator * other.numerator;
        this.denumerator *= other.denumerator;
    }

    void mult(Fraction other) {
        this.numerator *= other.numerator;
        this.denumerator *= other.denumerator;
    }

    void div(Fraction other) {
        this.numerator *= other.denumerator;
        this.denumerator *= other.numerator;
    }

    void gcd() {
        if (numerator == 0){
            this.denumerator = 0;
        }
        int a = this.numerator;
        int b = this.denumerator;
        if (a < b)
            a = Swap.swap(b, b = a);
        while (true) {
            int remainder = a % b;
            if (remainder == 0)
                break;
            a = b;
            b = remainder;
        }
        this.numerator /=b;
        this.denumerator /=b;
    }
}
