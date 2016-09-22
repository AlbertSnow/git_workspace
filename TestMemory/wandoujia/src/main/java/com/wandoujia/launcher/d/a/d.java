package com.wandoujia.launcher.d.a;

import com.wandoujia.launcher.d.b.b;
import com.wandoujia.p4.community.http.a.aa;
import com.wandoujia.p4.community.http.d.q;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import com.wandoujia.rpc.http.delegate.GZipHttpDelegate;

public final class d extends GZipHttpDelegate<q, CommunityTopicModel>
{
  public d()
  {
    super(new b(), new e());
  }

  public d(String paramString)
  {
    super(new q(paramString), new aa());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.d.a.d
 * JD-Core Version:    0.6.0
 */