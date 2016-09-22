package com.wandoujia.p4.community.http.b;

import com.wandoujia.p4.community.http.d.s;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;

public final class j extends i<CommunityTopicModel>
{
  protected final String a()
  {
    return "";
  }

  protected final n<CommunityTopicModel> c(int paramInt1, int paramInt2)
  {
    com.wandoujia.p4.subscribe.http.a.a locala = new com.wandoujia.p4.subscribe.http.a.a();
    ((s)locala.getRequestBuilder()).a(paramInt1).b(paramInt2).setAttachDefaultCookie(true);
    return (n)com.wandoujia.p4.a.b().execute(locala);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.b.j
 * JD-Core Version:    0.6.0
 */