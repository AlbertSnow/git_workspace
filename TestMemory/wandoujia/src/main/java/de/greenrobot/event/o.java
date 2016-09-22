package de.greenrobot.event;

final class o
{
  final Object a;
  final m b;
  volatile boolean c;

  o(Object paramObject, m paramm)
  {
    this.a = paramObject;
    this.b = paramm;
    this.c = true;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof o;
    int i = 0;
    if (bool1)
    {
      o localo = (o)paramObject;
      Object localObject1 = this.a;
      Object localObject2 = localo.a;
      i = 0;
      if (localObject1 == localObject2)
      {
        boolean bool2 = this.b.equals(localo.b);
        i = 0;
        if (bool2)
          i = 1;
      }
    }
    return i;
  }

  public final int hashCode()
  {
    return this.a.hashCode() + this.b.d.hashCode();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     de.greenrobot.event.o
 * JD-Core Version:    0.6.0
 */