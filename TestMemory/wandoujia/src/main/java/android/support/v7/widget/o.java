package android.support.v7.widget;

final class o
{
  int a;
  int b;
  int c;

  o(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    o localo;
    do
    {
      do
      {
        return true;
        if ((paramObject == null) || (getClass() != paramObject.getClass()))
          return false;
        localo = (o)paramObject;
        if (this.a != localo.a)
          return false;
      }
      while ((this.a == 3) && (Math.abs(this.c - this.b) == 1) && (this.c == localo.b) && (this.b == localo.c));
      if (this.c != localo.c)
        return false;
    }
    while (this.b == localo.b);
    return false;
  }

  public final int hashCode()
  {
    return 31 * (31 * this.a + this.b) + this.c;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[");
    String str;
    switch (this.a)
    {
    default:
      str = "??";
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return str + ",s:" + this.b + "c:" + this.c + "]";
      str = "add";
      continue;
      str = "rm";
      continue;
      str = "up";
      continue;
      str = "mv";
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.o
 * JD-Core Version:    0.6.0
 */