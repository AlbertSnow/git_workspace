package com.wandoujia.p4.community.http.b;

import com.wandoujia.p4.community.http.a.x;
import com.wandoujia.p4.community.http.d.o;
import com.wandoujia.p4.community.http.model.CommunityRankingModel;

public final class e extends i<CommunityRankingModel>
{
  private String b;
  private String c;

  public e(String paramString1, String paramString2)
  {
    this.b = paramString1;
    this.c = paramString2;
  }

  protected final String a()
  {
    return this.b + "*" + this.c;
  }

  protected final n<CommunityRankingModel> c(int paramInt1, int paramInt2)
  {
    x localx = new x();
    ((o)localx.getRequestBuilder()).b(this.c).a(this.b).a(paramInt1).b(paramInt2);
    return (n)com.wandoujia.p4.a.b().execute(localx);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.b.e
 * JD-Core Version:    0.6.0
 */