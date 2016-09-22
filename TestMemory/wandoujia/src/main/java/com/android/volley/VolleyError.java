package com.android.volley;

import com.wandoujia.nirvana.framework.network.a.a;

public class VolleyError extends Exception
{
  public final a networkResponse$bcf5f14;

  public VolleyError()
  {
    this.networkResponse$bcf5f14 = null;
  }

  public VolleyError(a parama)
  {
    this.networkResponse$bcf5f14 = parama;
  }

  public VolleyError(String paramString)
  {
    super(paramString);
    this.networkResponse$bcf5f14 = null;
  }

  public VolleyError(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    this.networkResponse$bcf5f14 = null;
  }

  public VolleyError(Throwable paramThrowable)
  {
    super(paramThrowable);
    this.networkResponse$bcf5f14 = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.VolleyError
 * JD-Core Version:    0.6.0
 */