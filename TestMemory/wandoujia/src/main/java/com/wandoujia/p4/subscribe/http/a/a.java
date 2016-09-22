package com.wandoujia.p4.subscribe.http.a;

import com.wandoujia.p4.community.http.a.ab;
import com.wandoujia.p4.community.http.d.s;
import com.wandoujia.p4.community.http.model.CommunityTopicInfo;
import com.wandoujia.p4.subscribe.http.model.SubscribeOnBoardModel.OnBoardType;
import com.wandoujia.rpc.http.delegate.GZipHttpDelegate;

public final class a extends GZipHttpDelegate<s, CommunityTopicInfo>
{
  public a()
  {
    super(new s(), new ab());
  }

  public a(SubscribeOnBoardModel.OnBoardType paramOnBoardType, String paramString)
  {
    super(new com.wandoujia.p4.subscribe.http.request.a(paramOnBoardType, paramString), new b());
  }

  public a(String paramString)
  {
    super(new s().a(paramString), new ab());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.http.a.a
 * JD-Core Version:    0.6.0
 */