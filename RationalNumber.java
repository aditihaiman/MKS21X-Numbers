public class RationalNumber extends RealNumber {
  private int numer;
  private int denom;

  public RationalNumber(int val1, int val2){
    super(0);
    if (val2 = 0) {
      numer = 0;
      denom = 1;
    }
    else {
    numer = val1;
    denom = val2;
    }
  }

  public double getValue(){
    return this.numer / this.denom;
  }

  public int getNumerator() {
    return this.numer;
  }

  public int getDenominator() {
    return this.denom;
  }

  public RationalNumber reciprocal() {
    return 0;
  }

  public String toString(){
    return "rational";
  }

  public RationalNumber add(double val){
    return 0;
  }

  public RationalNumber subtract(double val){}

  public RationalNumber multiply(double val){}

  public RationalNumber divide(double val){}


}
