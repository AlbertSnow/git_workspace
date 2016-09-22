package com.android.volley.toolbox;

import com.android.volley.Request;
import com.android.volley.j;
import com.android.volley.k;
import com.wandoujia.nirvana.framework.network.a.a;
import com.wandoujia.p4.app.detail.model.b;

public abstract class t<T> extends Request<T>
{
  private static final String a = String.format("application/json; charset=%s", new Object[] { "utf-8" });
  private final k<T> b;

  public t(String paramString, k<T> paramk, j paramj)
  {
    super(0, paramString, paramj);
    this.b = paramk;
  }

  protected abstract b<T> a(a parama);

  protected final void a(T paramT)
  {
    this.b.onResponse(paramT);
  }

  public final String i()
  {
    return a;
  }

  public final byte[] j()
  {
    return null;
  }

  public final String l()
  {
    return a;
  }

  public final byte[] m()
  {
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.t
 * JD-Core Version:    0.6.0
 */