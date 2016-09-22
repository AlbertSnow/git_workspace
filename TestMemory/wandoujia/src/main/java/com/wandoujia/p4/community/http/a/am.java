package com.wandoujia.p4.community.http.a;

import com.wandoujia.p4.community.http.d.x;
import com.wandoujia.rpc.http.delegate.GZipHttpDelegate;
import com.wandoujia.rpc.http.processor.RawProcessor;

public final class am extends GZipHttpDelegate<x, String>
{
  public am()
  {
    super(new x(), new RawProcessor());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.a.am
 * JD-Core Version:    0.6.0
 */