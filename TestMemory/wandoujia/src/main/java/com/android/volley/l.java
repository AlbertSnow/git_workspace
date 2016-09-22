package com.android.volley;

import android.os.Handler;
import com.wandoujia.p4.app.detail.model.b;
import java.util.concurrent.Executor;

public final class l
{
  private final Executor a;

  public l(Handler paramHandler)
  {
    this.a = new d(paramHandler);
  }

  public final void a(Request<?> paramRequest, VolleyError paramVolleyError)
  {
    paramRequest.a("post-error");
    b localb = b.a(paramVolleyError);
    this.a.execute(new e(paramRequest, localb, null));
  }

  public final void a(Request<?> paramRequest, b<?> paramb)
  {
    a(paramRequest, paramb, null);
  }

  public final void a(Request<?> paramRequest, b<?> paramb, Runnable paramRunnable)
  {
    paramRequest.r();
    paramRequest.a("post-response");
    this.a.execute(new e(paramRequest, paramb, paramRunnable));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.l
 * JD-Core Version:    0.6.0
 */