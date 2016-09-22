package com.wandoujia.jupiter;

import com.android.volley.j;
import com.android.volley.k;
import com.wandoujia.api.proto.HttpResponse;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.nirvana.framework.network.b;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.Config;
import com.wandoujia.ripple_framework.model.Model;
import java.util.HashMap;
import java.util.Map;

public class p extends com.wandoujia.ripple_framework.model.a
{
  public p(String paramString)
  {
    super(paramString, new com.wandoujia.jupiter.a.a());
    this.b.putAll(a(this.b));
  }

  public p(String paramString, e<Model> parame)
  {
    super(paramString, com.wandoujia.ripple_framework.d.a.a(parame, new com.wandoujia.jupiter.a.a()));
    this.b.putAll(a(this.b));
  }

  public p(String paramString, e<Model> parame, Map<String, String> paramMap)
  {
    super(paramString, parame, a(paramMap));
  }

  public p(String paramString, Map<String, String> paramMap)
  {
    this(paramString, null, a(paramMap));
  }

  private static Map<String, String> a(Map<String, String> paramMap)
  {
    if (paramMap == null)
      paramMap = new HashMap();
    paramMap.put("vc", String.valueOf(SystemUtil.getVersionCode(JupiterApplication.e())));
    paramMap.put("channel", Config.d());
    return paramMap;
  }

  protected final b<HttpResponse> a(HttpResponse paramHttpResponse, k<HttpResponse> paramk, j paramj)
  {
    b localb = super.a(paramHttpResponse, paramk, paramj);
    if (localb != null)
      localb.a(null);
    return localb;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.p
 * JD-Core Version:    0.6.0
 */