package com.wandoujia.p4.community.http.a;

import com.wandoujia.p4.community.http.d.ag;
import com.wandoujia.rpc.http.delegate.GZipHttpDelegate;
import com.wandoujia.rpc.http.processor.RawProcessor;

public final class ba extends GZipHttpDelegate<ag, String>
{
  public ba()
  {
    super(new ag(), new RawProcessor());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.a.ba
 * JD-Core Version:    0.6.0
 */