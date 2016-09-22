package com.alipay.squareup.picasso;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class f
{
  private final Context a;
  private Loader b;
  private ExecutorService c;
  private Cache d;

  public f(Context paramContext)
  {
    if (paramContext == null)
      throw new IllegalArgumentException("Context must not be null.");
    this.a = paramContext.getApplicationContext();
  }

  public final Picasso a()
  {
    Context localContext = this.a;
    if (this.b == null)
      this.b = p.a(localContext);
    if (this.d == null)
      this.d = new c(localContext);
    if (this.c == null)
      this.c = Executors.newFixedThreadPool(3, new r());
    k localk = new k();
    return new Picasso(localContext, this.b, this.c, this.d, localk);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.f
 * JD-Core Version:    0.6.0
 */