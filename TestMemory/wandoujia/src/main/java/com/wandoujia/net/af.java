package com.wandoujia.net;

final class af extends HttpTransaction
{
  public af(a parama, long paramLong, AsyncHttpRequest paramAsyncHttpRequest)
  {
    super(parama, paramLong, paramAsyncHttpRequest);
  }

  protected final void a(boolean paramBoolean)
  {
    if (l())
    {
      this.g = (-1 + this.g);
      this.c.a(3000 * (2 - this.g), new Object[] { this });
      return;
    }
    this.c.a(6, new Object[] { this });
  }

  protected final void e()
  {
    a locala = this.c;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = Long.valueOf(0L);
    arrayOfObject[2] = Long.valueOf(this.a.e());
    locala.a(4, arrayOfObject);
    j();
  }

  protected final void f()
  {
    this.a.b(k());
    this.c.a(7, new Object[] { this });
  }

  protected final HttpTransaction g()
  {
    af localaf = new af(this.c, this.d, this.b);
    localaf.g = this.g;
    return localaf;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.af
 * JD-Core Version:    0.6.0
 */