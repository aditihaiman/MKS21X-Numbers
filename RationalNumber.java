public class RationalNumber extends RealNumber {
  private double numer;
  private double denom;

  public RationalNumber(double val1, double val2){
    super(0);
  }

  public double getRationalNum(){
    return 1;
  }

  public String toString(){
    return "rational";
  }

  public void setRationalNum(double val1, double val2){
    numer = val1;
    denom = val2;
  }

  public void addTo(double val){}

  public void subtract(double val){}

  public void multiplyBy(double val){}

  public void divideBy(double val){}

  public void powerTo(double val){}

}
