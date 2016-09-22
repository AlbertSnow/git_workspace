package com.wandoujia.p4.community.http.a;

import com.wandoujia.p4.community.http.d.y;
import com.wandoujia.rpc.http.delegate.GZipHttpDelegate;
import com.wandoujia.rpc.http.processor.RawProcessor;

public final class an extends GZipHttpDelegate<y, String>
{
  public an()
  {
    super(new y(), new RawProcessor());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.a.an
 * JD-Core Version:    0.6.0
 */