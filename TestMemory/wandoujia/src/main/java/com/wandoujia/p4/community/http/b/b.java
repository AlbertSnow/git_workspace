package com.wandoujia.p4.community.http.b;

import com.wandoujia.p4.community.http.a.k;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;

public final class b extends i<CommunityGroupModel>
{
  private String b = "game";

  public b(String paramString)
  {
    this.b = paramString;
  }

  protected final String a()
  {
    return null;
  }

  protected final n<CommunityGroupModel> c(int paramInt1, int paramInt2)
  {
    k localk = new k();
    if ("balloting".equals(this.b))
      ((com.wandoujia.p4.community.http.d.i)localk.getRequestBuilder()).b(this.b);
    while (true)
    {
      ((com.wandoujia.p4.community.http.d.i)localk.getRequestBuilder()).a(paramInt1).b(paramInt2).setAttachDefaultCookie(true);
      return (n)com.wandoujia.p4.a.b().execute(localk);
      ((com.wandoujia.p4.community.http.d.i)localk.getRequestBuilder()).a(this.b);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.b.b
 * JD-Core Version:    0.6.0
 */