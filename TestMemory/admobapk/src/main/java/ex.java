public enum ex
{
  static
  {
    a = new ex("NORMAL", 1);
    c = new ex("HIGH", 2);
    d = new ex("IMMEDIATE", 3);
    ex[] arrayOfex = new ex[4];
    arrayOfex[0] = b;
    arrayOfex[1] = a;
    arrayOfex[2] = c;
    arrayOfex[3] = d;
    e = arrayOfex;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ex
 * JD-Core Version:    0.6.0
 */