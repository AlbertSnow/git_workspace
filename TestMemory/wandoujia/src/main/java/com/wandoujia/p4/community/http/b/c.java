package com.wandoujia.p4.community.http.b;

import com.wandoujia.p4.community.http.a.t;
import com.wandoujia.p4.community.http.model.CommunityNotificationModel;

public final class c extends i<CommunityNotificationModel>
{
  protected final String a()
  {
    return null;
  }

  protected final n<CommunityNotificationModel> c(int paramInt1, int paramInt2)
  {
    t localt = new t();
    ((com.wandoujia.p4.community.http.d.n)localt.getRequestBuilder()).a(paramInt1).b(paramInt2).setAttachDefaultCookie(true);
    return (n)com.wandoujia.p4.a.b().execute(localt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.b.c
 * JD-Core Version:    0.6.0
 */