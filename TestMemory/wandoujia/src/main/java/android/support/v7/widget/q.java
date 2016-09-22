package android.support.v7.widget;

final class q
{
  private long a = 0L;
  private q b;

  private void b()
  {
    if (this.b == null)
      this.b = new q();
  }

  final void a()
  {
    while (true)
    {
      this.a = 0L;
      if (this.b == null)
        break;
      this = this.b;
    }
  }

  final void a(int paramInt)
  {
    while (paramInt >= 64)
    {
      b();
      this = this.b;
      paramInt -= 64;
    }
    this.a |= 1L << paramInt;
  }

  final void a(int paramInt, boolean paramBoolean)
  {
    int i = paramInt;
    q localq1 = this;
    while (i >= 64)
    {
      localq1.b();
      localq1 = localq1.b;
      i -= 64;
    }
    boolean bool;
    if ((0x0 & localq1.a) != 0L)
    {
      bool = true;
      label46: long l = (1L << i) - 1L;
      localq1.a = (l & localq1.a | (localq1.a & (l ^ 0xFFFFFFFF)) << 1);
      if (!paramBoolean)
        break label130;
      localq1.a(i);
    }
    while (true)
    {
      if ((!bool) && (localq1.b == null))
        return;
      localq1.b();
      localq1 = localq1.b;
      paramBoolean = bool;
      i = 0;
      break;
      bool = false;
      break label46;
      label130: q localq2 = localq1;
      while (true)
      {
        if (i < 64)
          break label161;
        if (localq2.b == null)
          break;
        localq2 = localq2.b;
        i -= 64;
      }
      label161: localq2.a &= (0xFFFFFFFF ^ 1L << i);
    }
  }

  final boolean b(int paramInt)
  {
    while (paramInt >= 64)
    {
      b();
      this = this.b;
      paramInt -= 64;
    }
    return (this.a & 1L << paramInt) != 0L;
  }

  final boolean c(int paramInt)
  {
    while (paramInt >= 64)
    {
      b();
      this = this.b;
      paramInt -= 64;
    }
    long l1 = 1L << paramInt;
    if ((l1 & this.a) != 0L);
    for (int i = 1; ; i = 0)
    {
      this.a &= (l1 ^ 0xFFFFFFFF);
      long l2 = l1 - 1L;
      this.a = (l2 & this.a | Long.rotateRight(this.a & (l2 ^ 0xFFFFFFFF), 1));
      if (this.b != null)
      {
        if (this.b.b(0))
          a(63);
        this.b.c(0);
      }
      return i;
    }
  }

  final int d(int paramInt)
  {
    if (this.b == null)
    {
      if (paramInt >= 64)
        return Long.bitCount(this.a);
      return Long.bitCount(this.a & (1L << paramInt) - 1L);
    }
    if (paramInt < 64)
      return Long.bitCount(this.a & (1L << paramInt) - 1L);
    return this.b.d(paramInt - 64) + Long.bitCount(this.a);
  }

  public final String toString()
  {
    if (this.b == null)
      return Long.toBinaryString(this.a);
    return this.b.toString() + "xx" + Long.toBinaryString(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.q
 * JD-Core Version:    0.6.0
 */