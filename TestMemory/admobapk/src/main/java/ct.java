public final class ct
{
  public int a;
  public cv b;
  public cu c;
  public boolean d;
  public boolean e;
  public boolean f;
  public boolean g;
  public boolean h;

  public final void a(cu paramcu)
  {
    if (this.c == null)
      throw new IllegalStateException("No listener register");
    if (this.c != paramcu)
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    this.c = null;
  }

  public final void a(cv paramcv)
  {
    if (this.b == null)
      throw new IllegalStateException("No listener register");
    if (this.b != paramcv)
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    this.b = null;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    cz.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    localStringBuilder.append(this.a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ct
 * JD-Core Version:    0.6.0
 */