package android.support.v7.widget;

public class av
{
  static final av a = GridLayout.a();
  final boolean b;
  final as c;
  final an d;
  final float e;

  private av(boolean paramBoolean, int paramInt1, int paramInt2, an paraman, float paramFloat)
  {
    this(paramBoolean, new as(paramInt1, paramInt1 + paramInt2), paraman, paramFloat);
  }

  private av(boolean paramBoolean, as paramas, an paraman, float paramFloat)
  {
    this.b = paramBoolean;
    this.c = paramas;
    this.d = paraman;
    this.e = paramFloat;
  }

  public final an a(boolean paramBoolean)
  {
    if (this.d != GridLayout.b)
      return this.d;
    if (this.e == 0.0F)
    {
      if (paramBoolean)
        return GridLayout.c;
      return GridLayout.d;
    }
    return GridLayout.e;
  }

  final av a(as paramas)
  {
    return new av(this.b, paramas, this.d, this.e);
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    av localav;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localav = (av)paramObject;
      if (!this.d.equals(localav.d))
        return false;
    }
    while (this.c.equals(localav.c));
    return false;
  }

  public int hashCode()
  {
    return 31 * this.c.hashCode() + this.d.hashCode();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.av
 * JD-Core Version:    0.6.0
 */