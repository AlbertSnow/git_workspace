package android.support.v7.widget;

import android.support.v4.view.bg;
import android.view.View;

public abstract class co
{
  public final View a;
  int b = -1;
  int c = -1;
  int d = -1;
  int e = -1;
  co f = null;
  co g = null;
  RecyclerView h;
  private long i = -1L;
  private int j;
  private int k = 0;
  private ch l = null;

  public co(View paramView)
  {
    if (paramView == null)
      throw new IllegalArgumentException("itemView may not be null");
    this.a = paramView;
  }

  final void a()
  {
    this.c = -1;
    this.e = -1;
  }

  final void a(int paramInt)
  {
    this.j = (paramInt | this.j);
  }

  final void a(int paramInt1, int paramInt2)
  {
    this.j = (this.j & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }

  final void a(int paramInt, boolean paramBoolean)
  {
    if (this.c == -1)
      this.c = this.b;
    if (this.e == -1)
      this.e = this.b;
    if (paramBoolean)
      this.e = (paramInt + this.e);
    this.b = (paramInt + this.b);
    if (this.a.getLayoutParams() != null)
      ((RecyclerView.LayoutParams)this.a.getLayoutParams()).c = true;
  }

  final void a(ch paramch)
  {
    this.l = paramch;
  }

  public final void a(boolean paramBoolean)
  {
    int m;
    if (paramBoolean)
    {
      m = -1 + this.k;
      this.k = m;
      if (this.k >= 0)
        break label53;
      this.k = 0;
      new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ").append(this);
    }
    label53: 
    do
    {
      return;
      m = 1 + this.k;
      break;
      if ((paramBoolean) || (this.k != 1))
        continue;
      this.j = (0x10 | this.j);
      return;
    }
    while ((!paramBoolean) || (this.k != 0));
    this.j = (0xFFFFFFEF & this.j);
  }

  final boolean b()
  {
    return (0x80 & this.j) != 0;
  }

  @Deprecated
  public final int c()
  {
    if (this.e == -1)
      return this.b;
    return this.e;
  }

  public final int d()
  {
    if (this.e == -1)
      return this.b;
    return this.e;
  }

  public final int e()
  {
    if (this.h == null)
      return -1;
    return RecyclerView.a(this.h, this);
  }

  final boolean f()
  {
    return this.l != null;
  }

  final void g()
  {
    this.l.b(this);
  }

  final boolean h()
  {
    return (0x20 & this.j) != 0;
  }

  final void i()
  {
    this.j = (0xFFFFFFDF & this.j);
  }

  final void j()
  {
    this.j = (0xFFFFFEFF & this.j);
  }

  final boolean k()
  {
    return (0x4 & this.j) != 0;
  }

  final boolean l()
  {
    return (0x2 & this.j) != 0;
  }

  final boolean m()
  {
    return (0x40 & this.j) != 0;
  }

  final boolean n()
  {
    return (0x1 & this.j) != 0;
  }

  final boolean o()
  {
    return (0x8 & this.j) != 0;
  }

  final boolean p()
  {
    return (0x20C & this.j) != 0;
  }

  final boolean q()
  {
    return (0x100 & this.j) != 0;
  }

  final void r()
  {
    this.j = 0;
    this.b = -1;
    this.c = -1;
    this.i = -1L;
    this.e = -1;
    this.k = 0;
    this.f = null;
    this.g = null;
  }

  public final boolean s()
  {
    return ((0x10 & this.j) == 0) && (!bg.c(this.a));
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.b + " id=" + this.i + ", oldPos=" + this.c + ", pLpos:" + this.e);
    if (f())
      localStringBuilder.append(" scrap");
    if (k())
      localStringBuilder.append(" invalid");
    if (!n())
      localStringBuilder.append(" unbound");
    if (l())
      localStringBuilder.append(" update");
    if (o())
      localStringBuilder.append(" removed");
    if (b())
      localStringBuilder.append(" ignored");
    if (m())
      localStringBuilder.append(" changed");
    if (q())
      localStringBuilder.append(" tmpDetached");
    if (!s())
      localStringBuilder.append(" not recyclable(" + this.k + ")");
    if (((0x200 & this.j) != 0) || (k()));
    for (int m = 1; ; m = 0)
    {
      if (m != 0)
        localStringBuilder.append("undefined adapter position");
      if (this.a.getParent() == null)
        localStringBuilder.append(" no parent");
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.co
 * JD-Core Version:    0.6.0
 */