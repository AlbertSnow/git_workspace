public final class aia
{
  public final String a;
  private final aib b;
  private final aii c;
  private final aig d;
  private final aij e;

  public aia(String paramString, aib paramaib, aig paramaig)
  {
    anw.a(paramaib, "Cannot construct an Api with a null ClientBuilder");
    anw.a(paramaig, "Cannot construct an Api with a null ClientKey");
    this.a = paramString;
    this.b = paramaib;
    this.c = null;
    this.d = paramaig;
    this.e = null;
  }

  public final aib a()
  {
    if (this.b != null);
    for (boolean bool = true; ; bool = false)
    {
      anw.a(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
      return this.b;
    }
  }

  public final aid b()
  {
    if (this.d != null)
      return this.d;
    throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aia
 * JD-Core Version:    0.6.0
 */