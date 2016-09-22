package com.wandoujia.ripple_framework.a;

import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.j;
import com.android.volley.k;
import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.c;
import java.io.UnsupportedEncodingException;

public class a<T> extends Request<T>
{
  private final c a;
  private final Class<T> b;
  private final k<T> c;

  public a(String paramString, Class<T> paramClass, k<T> paramk, j paramj, c paramc)
  {
    super(0, paramString, paramj);
    this.b = paramClass;
    this.c = paramk;
    this.a = paramc;
  }

  protected final com.wandoujia.p4.app.detail.model.b<T> a(com.wandoujia.nirvana.framework.network.a.a parama)
  {
    try
    {
      String str = new String(parama.a, "utf-8");
      com.wandoujia.p4.app.detail.model.b localb = com.wandoujia.p4.app.detail.model.b.a(this.a.a(str, this.b), android.support.v4.app.b.a(parama));
      return localb;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      return com.wandoujia.p4.app.detail.model.b.a(new ParseError(localUnsupportedEncodingException));
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
    }
    return com.wandoujia.p4.app.detail.model.b.a(new ParseError(localJsonSyntaxException));
  }

  protected final void a(T paramT)
  {
    this.c.onResponse(paramT);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.a.a
 * JD-Core Version:    0.6.0
 */