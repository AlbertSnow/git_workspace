package android.support.v7.widget;

final class as
{
  public final int a;
  public final int b;

  public as(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }

  final int a()
  {
    return this.b - this.a;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    as localas;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localas = (as)paramObject;
      if (this.b != localas.b)
        return false;
    }
    while (this.a == localas.a);
    return false;
  }

  public final int hashCode()
  {
    return 31 * this.a + this.b;
  }

  public final String toString()
  {
    return "[" + this.a + ", " + this.b + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.as
 * JD-Core Version:    0.6.0
 */