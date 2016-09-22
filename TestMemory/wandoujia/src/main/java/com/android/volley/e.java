package com.android.volley;

import com.wandoujia.p4.app.detail.model.b;

final class e
  implements Runnable
{
  private final Request a;
  private final b b;
  private final Runnable c;

  public e(Request paramRequest, b paramb, Runnable paramRunnable)
  {
    this.a = paramRequest;
    this.b = paramb;
    this.c = paramRunnable;
  }

  public final void run()
  {
    if (this.a.g())
      this.a.b("canceled-at-delivery");
    label50: label91: label108: label118: 
    while (true)
    {
      return;
      int i;
      if (this.b.c == null)
      {
        i = 1;
        if (i == 0)
          break label91;
        this.a.a(this.b.a);
        if (!this.b.d)
          break label108;
        this.a.a("intermediate-response");
      }
      while (true)
      {
        if (this.c == null)
          break label118;
        this.c.run();
        return;
        i = 0;
        break;
        this.a.b(this.b.c);
        break label50;
        this.a.b("done");
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.e
 * JD-Core Version:    0.6.0
 */