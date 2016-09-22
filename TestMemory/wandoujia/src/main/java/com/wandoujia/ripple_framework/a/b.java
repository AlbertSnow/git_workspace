package com.wandoujia.ripple_framework.a;

import com.android.volley.j;
import com.android.volley.k;
import com.wandoujia.api.proto.HttpResponse;
import com.wandoujia.nirvana.framework.network.a;
import com.wandoujia.nirvana.framework.network.f;
import com.wandoujia.ripple_framework.i;
import java.util.Map;

public class b extends b<HttpResponse>
{
  public b(String paramString, k<HttpResponse> paramk, j paramj)
  {
    this(paramString, null, HttpResponse.class, paramk, paramj, 0);
  }

  private b(String paramString, Map<String, String> paramMap, Class<T> paramClass, k<T> paramk, j paramj)
  {
    super(0, paramString, paramMap, (a)i.k().a("api_context"), paramClass, paramk, paramj);
  }

  public b(String paramString, Map<String, String> paramMap, Class<T> paramClass, k<T> paramk, j paramj, byte paramByte)
  {
    this(paramString, paramMap, paramClass, paramk, paramj);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.a.b
 * JD-Core Version:    0.6.0
 */