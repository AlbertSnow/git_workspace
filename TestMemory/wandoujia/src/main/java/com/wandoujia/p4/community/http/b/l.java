package com.wandoujia.p4.community.http.b;

import android.text.TextUtils;
import com.wandoujia.p4.community.http.a.p;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;

public final class l extends i<CommunityGroupModel>
{
  private String b;
  private String c = "game";

  public l(String paramString1, String paramString2)
  {
    this.b = paramString1;
    this.c = paramString2;
  }

  protected final String a()
  {
    return this.b + "*" + this.c;
  }

  protected final n<CommunityGroupModel> c(int paramInt1, int paramInt2)
  {
    if ((com.wandoujia.account.a.z()) && (!TextUtils.isEmpty(com.wandoujia.account.a.t())))
    {
      p localp = new p();
      ((com.wandoujia.p4.community.http.d.l)localp.getRequestBuilder()).c(this.c).a(com.wandoujia.account.a.t()).b(this.b).a(paramInt1).b(paramInt2).setAttachDefaultCookie(true);
      return (n)com.wandoujia.p4.a.b().execute(localp);
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.b.l
 * JD-Core Version:    0.6.0
 */