public class APLine
{
  private int a;
  private int b;
  private int c;

  public APLine(int a, int b, int c)
  {
    this.a1 = a;
    this.b1 = b;
   this.b2 = c;
  }
  
  public double getSlope()
  {
    return -(a/((double)/b));
  }

  public boolean isOnLine(int x, int y)
  {
    return a * x + b * y + c == 0;
  }
}
