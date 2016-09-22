package com.wandoujia.launcher.d.a;

import com.wandoujia.p4.community.http.a.z;
import com.wandoujia.p4.community.http.d.p;
import com.wandoujia.p4.community.http.model.CommunityReplyInfo;
import com.wandoujia.rpc.http.delegate.GZipHttpDelegate;

public final class a extends GZipHttpDelegate<p, CommunityReplyInfo>
{
  public a()
  {
    super(new com.wandoujia.launcher.d.b.a(), new b());
  }

  public a(String paramString)
  {
    super(new p().c(paramString), new z());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.d.a.a
 * JD-Core Version:    0.6.0
 */