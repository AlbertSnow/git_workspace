package com.wandoujia.p4.app_launcher.e;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.android.volley.k;
import com.wandoujia.api.proto.HttpResponse;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.udid.UDIDUtil;
import java.util.HashMap;
import java.util.Map;

public final class b
  implements j, k<HttpResponse>
{
  private final Map<String, String> a = new HashMap();

  public final void a()
  {
    this.a.put("max", Integer.valueOf(50).toString());
    this.a.put("udid", UDIDUtil.a(GlobalConfig.getAppContext()));
    new com.wandoujia.ripple_framework.a.b("http://apis.wandoujia.com/five/v2/al/recommended", this.a, HttpResponse.class, this, this, 0).u();
  }

  public final void onErrorResponse(VolleyError paramVolleyError)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.e.b
 * JD-Core Version:    0.6.0
 */