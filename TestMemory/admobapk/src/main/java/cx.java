import java.util.Map;

final class cx extends db
{
  cx(cw paramcw)
  {
  }

  protected final int a()
  {
    return this.d.c;
  }

  protected final int a(Object paramObject)
  {
    return this.d.a(paramObject);
  }

  protected final Object a(int paramInt1, int paramInt2)
  {
    return this.d.b[(paramInt2 + (paramInt1 << 1))];
  }

  protected final Object a(int paramInt, Object paramObject)
  {
    return this.d.a(paramInt, paramObject);
  }

  protected final void a(int paramInt)
  {
    this.d.d(paramInt);
  }

  protected final void a(Object paramObject1, Object paramObject2)
  {
    this.d.put(paramObject1, paramObject2);
  }

  protected final int b(Object paramObject)
  {
    return this.d.b(paramObject);
  }

  protected final Map b()
  {
    return this.d;
  }

  protected final void c()
  {
    this.d.clear();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     cx
 * JD-Core Version:    0.6.0
 */