public class Rational {

  private int numerator;
  private int denominator;

  // constructors

  public Rational(int numerator, int denominator) {
    if(denominator == 0)
      denominator = 1;
    if(denominator < 0)
      numerator = numberator *-1;
      denominator = denominator *-1;
      
      reduce()
  }

  // getters

  public int getNumerator() {
     return numerator;
  }

  public int getDenominator() {
     return denominator;
  }

  // instance methods

  public Rational plus(Rational other) {
    
  }

  public static Rational plus(Rational a, Rational b) {
    int commomDenominator = denominator *getDenominator();
    Rational a= numerator*getDenominator();
    Rational b=getNumerator()*denominator;
    Rational plus = numerator1 + numerator2;
    
    return new RationalNumber(plus, commonDenominator);
  }

  // Transforms this number into its reduced form

  private void reduce() {
    if(numerator != 0)
    {
      int common=gcd(Math.abs(numerator), denominator);
      
      numerator = numerator / common;
      denominator = denominator / common;
  }

  // Euclid's algorithm for calculating the greatest common divisor
  private int gcd(int a, int b) {
    // Note that the loop below, as-is, will time out on negative inputs.
    // The gcd should always be a positive number.
    // Add code here to pre-process the inputs so this doesn't happen.

    while (a != b) {
      if (a > b) {
         a = a - b;
      } else {
         b = b - a;
      }
    }
    return a;
  }

  public int compareTo(Rational other) {
    Rational a = this;
        int lhs = a.num * b.den;
        int rhs = a.den * b.num;
        if (lhs < rhs) return -1;
        if (lhs > rhs) return +1;
        return 0;
  }

  public boolean equals(Rational other) {
    return( numerator == getNumerator()&& denominator == getDenominator() );
  }

  public String toString() {
    String result;
    if (denominator == 1) {
        result = numerator + "";
      
      
    else {
     if(denominator == 0)
       result = "0";
     else 
        result = numerator + "/" + denominator;
       
    }
    return result;
  }
}
