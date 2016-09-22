package com.wandoujia.jupiter.c;

import android.text.TextUtils;
import com.android.volley.j;
import com.android.volley.k;
import com.wandoujia.api.proto.HttpResponse;
import com.wandoujia.nirvana.framework.network.a;
import com.wandoujia.nirvana.framework.network.f;

public final class g extends f<HttpResponse>
{
  private String a;

  private g(int paramInt, String paramString1, String paramString2, a parama, k paramk, j paramj)
  {
    super(paramInt, paramString1, null, parama, HttpResponse.class, paramk, paramj);
    this.a = paramString2;
  }

  public static g a(String paramString1, String paramString2, a parama, k paramk, j paramj)
  {
    return new g(1, String.format("http://apis.wandoujia.com/five/v2/favorites/%s/%s", new Object[] { paramString1, paramString2 }), String.format("{itemType:%s, packageName:%s}", new Object[] { paramString1, paramString2 }), parama, paramk, paramj);
  }

  public static g b(String paramString1, String paramString2, a parama, k paramk, j paramj)
  {
    return new g(3, String.format("http://apis.wandoujia.com/five/v2/favorites/%s/%s", new Object[] { paramString1, paramString2 }), null, parama, paramk, paramj);
  }

  public final byte[] m()
  {
    if (TextUtils.isEmpty(this.a))
      return null;
    return this.a.getBytes();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.c.g
 * JD-Core Version:    0.6.0
 */