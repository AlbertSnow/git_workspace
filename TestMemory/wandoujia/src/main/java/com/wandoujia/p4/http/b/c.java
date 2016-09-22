package com.wandoujia.p4.http.b;

import com.wandoujia.entities.app.AppDetailInfo;
import com.wandoujia.gson.b.a;
import com.wandoujia.p4.http.request.b;
import com.wandoujia.rpc.http.delegate.CacheableGZipHttpDelegate;

public final class c extends CacheableGZipHttpDelegate<b, AppDetailInfo>
{
  public c()
  {
    super(new d(), new f(0));
  }

  public final a<AppDetailInfo> getTypeToken()
  {
    return new e();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.b.c
 * JD-Core Version:    0.6.0
 */