package com.wandoujia.p4.community.http.b;

import com.wandoujia.base.log.Log;
import com.wandoujia.p4.community.http.d.p;
import com.wandoujia.p4.community.http.model.CommunityReplyInfo;
import com.wandoujia.p4.community.http.model.CommunityReplyModel;

public final class h extends i<CommunityReplyModel>
{
  private final String b;

  public h(String paramString)
  {
    this.b = paramString;
  }

  protected final String a()
  {
    return this.b;
  }

  protected final n<CommunityReplyModel> c(int paramInt1, int paramInt2)
  {
    if (paramInt2 > 100)
      paramInt2 = 100;
    com.wandoujia.launcher.d.a.a locala = new com.wandoujia.launcher.d.a.a(this.b);
    ((p)locala.getRequestBuilder()).a(paramInt1).b(paramInt2).setAttachDefaultCookie(true);
    CommunityReplyInfo localCommunityReplyInfo = (CommunityReplyInfo)com.wandoujia.p4.a.b().execute(locala);
    Log.d("ugc", "fetch reply list count " + localCommunityReplyInfo.getTotal(), new Object[0]);
    return localCommunityReplyInfo;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.b.h
 * JD-Core Version:    0.6.0
 */