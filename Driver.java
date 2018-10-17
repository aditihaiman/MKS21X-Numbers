public class Driver{
  public static void main(String[] args) {
    RealNumber a = new RealNumber(15);
    RealNumber b = new RealNumber(0);
    RealNumber c = new RealNumber(3);

    System.out.println(a.getValue()); // 15.0
    System.out.println(b);  // 0.0
    System.out.println(b.toString()); // 0.0
    System.out.println(a.add(c)); // 18.0
    System.out.println(a.subtract(c)); // 12.0
    System.out.println(c.subtract(a)); // -12.0
    System.out.println(a.multiply(c)); // 45.0
    System.out.println(a.multiply(b)); // 0.0
    System.out.println(a.divide(c)); // 5.0
    System.out.println(c.divide(a)); // 0.2
    System.out.println(a.divide(b)); // Infinity
    System.out.println("\n");

    RationalNumber d = new RationalNumber(1, 2);
    RationalNumber e = new RationalNumber(2, 8);
    RationalNumber f = new RationalNumber(0, 5);
    RationalNumber g = new RationalNumber(7, 0);
    RationalNumber h = new RationalNumber(3, -4);

    System.out.println(d); // 1/2
    System.out.println(e); // 1/4
    System.out.println(g); // 0/1
    System.out.println(h); // -3/4
    System.out.println(d.getValue()); // 0.5
    System.out.println(e.getValue()); // 0.25
    System.out.println(f.getValue()); // 0.0
    System.out.println(g.getValue()); // 0.0
    System.out.println(d.getNumerator()); // 1
    System.out.println(f.getNumerator()); // 0
    System.out.println(g.getNumerator()); // 0
    System.out.println(d.getDenominator()); // 2
    System.out.println(f.getDenominator()); // 1
    System.out.println(g.getDenominator()); // 1
    System.out.println(f.reciprocal()); // 0/1
    System.out.println(f.equals(g)); // true
    System.out.println(d.multiply(e)); // 1/8
    System.out.println(d.multiply(g)); // 0/1
    System.out.println(e.divide(f)); // 0/1
    System.out.println(d.add(e)); // 3/4
    System.out.println(f.subtract(g)); // 0/1
    System.out.println(e.subtract(d)); // -1/4
    System.out.println(h.subtract(e)); // -1/1
    System.out.println(h.add(a)); // 14.25
    System.out.println(d.divide(b)); // Infinity

  }

}
