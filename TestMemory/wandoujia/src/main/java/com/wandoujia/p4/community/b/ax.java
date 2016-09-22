package com.wandoujia.p4.community.b;

import android.os.AsyncTask;
import android.support.v4.app.b;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;

public final class ax
  implements Action
{
  private final String a;
  private final String b;
  private final az c;
  private AsyncTask<Void, Void, CommunityGroupModel> d = new ay(this);

  public ax(String paramString1, String paramString2, az paramaz)
  {
    this.a = paramString2;
    this.b = paramString1;
    this.c = paramaz;
  }

  public final void execute()
  {
    b.a(this.d, new Void[0]);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.ax
 * JD-Core Version:    0.6.0
 */