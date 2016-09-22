package com.android.volley.toolbox;

import com.android.volley.Request;
import com.android.volley.j;
import com.android.volley.k;
import com.wandoujia.nirvana.framework.network.a.a;
import java.io.UnsupportedEncodingException;

public final class x extends Request<String>
{
  private final k<String> a;

  private x(String paramString, k<String> paramk, j paramj)
  {
    super(0, paramString, paramj);
    this.a = paramk;
  }

  public x(String paramString, k<String> paramk, j paramj, byte paramByte)
  {
    this(paramString, paramk, paramj);
  }

  protected final com.wandoujia.p4.app.detail.model.b<String> a(a parama)
  {
    try
    {
      str = new String(parama.a, android.support.v4.app.b.a(parama.b));
      return com.wandoujia.p4.app.detail.model.b.a(str, android.support.v4.app.b.a(parama));
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        String str = new String(parama.a);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.x
 * JD-Core Version:    0.6.0
 */