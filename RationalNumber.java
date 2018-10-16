public class RationalNumber extends RealNumber {
  private int numer, denom;

  public RationalNumber(int val1, int val2){
    super(0.0);
    if (val2 == 0) {
      numer = 0;
      denom = 1;
    }
    else {
    numer = val1;
    denom = val2;
    }
    this.reduce();
  }

  public double getValue(){
    return this.getNumerator() / (this.getDenominator() * 1.0);
  }

  public int getNumerator() {
    return this.numer;
  }

  public int getDenominator() {
    return this.denom;
  }

  public RationalNumber reciprocal() {
    return new RationalNumber(this.getDenominator(), this.getNumerator());
  }

  public boolean equals(RationalNumber other) {
    return (this.getNumerator() == other.getNumerator()) && (this.getDenominator() == other.getDenominator());
  }

  public String toString(){
    return this.getNumerator() + "/" + this.getDenominator();
  }

  private static int gcd(int a, int b) {
    if (b==0) {return a;}
    return gcd(b, a%b);
  }

  private void reduce(){
    int gcd = gcd(this.numer, this.denom);
    this.numer = this.numer / gcd;
    this.denom = this.denom / gcd;
    if (this.denom < 0) {
      this.numer *= -1;
      this.denom *= -1;
    }
  }

  public RationalNumber add(RationalNumber val){
    return new RationalNumber(this.numer * val.denom + val.numer * this.denom, this.denom * val.denom);
  }

  public RationalNumber subtract(RationalNumber val){
    return this.add(val.multiply(new RationalNumber(-1, 1)));
  }

  public RationalNumber multiply(RationalNumber val){
    return new RationalNumber(this.numer * val.numer, this.denom * val.denom);
  }

  public RationalNumber divide(RationalNumber val){
    return this.multiply(val.reciprocal());
  }


}
