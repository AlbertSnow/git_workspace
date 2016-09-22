package com.alipay.android.mini.window.sdk;

import com.alipay.wandoujia.am;
import com.alipay.wandoujia.ra;
import com.wandoujia.jupiter.d.a;

final class ap extends am
{
  ap(ao paramao, ra paramra)
  {
    super(paramra);
  }

  public final String a(String paramString)
  {
    if ("name".equals(paramString))
      return ao.a(this.a).g();
    if ("host".equals(paramString))
      return ao.a(this.a).h();
    if ("params".equals(paramString))
      return ao.a(this.a).i();
    if ("enctype".equals(paramString))
      return ao.a(this.a).k();
    if ("request_param".equals(paramString))
      return ao.a(this.a).l();
    if ("validate".equals(paramString))
      return String.valueOf(ao.a(this.a).m());
    if ("https".equals(paramString))
      return String.valueOf(ao.a(this.a).n());
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.ap
 * JD-Core Version:    0.6.0
 */