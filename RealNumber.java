public class RealNumber {
  private double num;

  public RealNumber(double x) {
    num = x;
  }

  public double add(RealNumber val){
    return this.getValue() + val.getValue();
  }

  public double subtract(RealNumber val){
    return this.getValue() - val.getValue();
  }

  public double multiply(RealNumber val){
    return this.getValue() * val.getValue();
  }

  public double divide(RealNumber val){
    return this.getValue() / val.getValue();
  }

  public double getValue() {
    return num;
  }

  public String toString() {
    return "" + num;
  }
}
