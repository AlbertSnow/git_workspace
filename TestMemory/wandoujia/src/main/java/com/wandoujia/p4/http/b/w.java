package com.wandoujia.p4.http.b;

import com.wandoujia.entities.app.TagAppsInfo;
import com.wandoujia.gson.b.a;
import com.wandoujia.p4.http.request.a.f;
import com.wandoujia.rpc.http.delegate.CacheableGZipHttpDelegate;
import java.util.List;

public final class w extends CacheableGZipHttpDelegate<f, List<TagAppsInfo>>
{
  public w()
  {
    super(new f(), new y());
  }

  public final a<List<TagAppsInfo>> getTypeToken()
  {
    return new x();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.b.w
 * JD-Core Version:    0.6.0
 */