import java.util.Iterator;

final class dc
  implements Iterator
{
  private int a;
  private int b;
  private int c;
  private boolean d = false;

  dc(db paramdb, int paramInt)
  {
    this.a = paramInt;
    this.b = paramdb.a();
  }

  public final boolean hasNext()
  {
    return this.c < this.b;
  }

  public final Object next()
  {
    Object localObject = this.e.a(this.c, this.a);
    this.c = (1 + this.c);
    this.d = true;
    return localObject;
  }

  public final void remove()
  {
    if (!this.d)
      throw new IllegalStateException();
    this.c = (-1 + this.c);
    this.b = (-1 + this.b);
    this.d = false;
    this.e.a(this.c);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     dc
 * JD-Core Version:    0.6.0
 */