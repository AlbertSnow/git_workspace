package com.wandoujia.p4.http.b;

import com.wandoujia.entities.app.AppLiteInfo;
import com.wandoujia.gson.b.a;
import com.wandoujia.p4.http.request.d;
import com.wandoujia.rpc.http.delegate.CacheableGZipHttpDelegate;
import java.util.List;

public final class g extends CacheableGZipHttpDelegate<d, List<AppLiteInfo>>
{
  public g()
  {
    super(new d(), new i());
  }

  public final a<List<AppLiteInfo>> getTypeToken()
  {
    return new h();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.b.g
 * JD-Core Version:    0.6.0
 */