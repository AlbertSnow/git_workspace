package com.wandoujia.p4.community.b;

import android.app.Activity;
import android.app.ProgressDialog;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.mvc.Action;

public final class af
  implements Action
{
  private Activity a;
  private ProgressDialog b;
  private String c;
  private String d;
  private String e;
  private String f;

  public af(Activity paramActivity, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.c = paramString1;
    this.a = paramActivity;
    this.d = paramString4;
    this.e = paramString2;
    this.f = paramString3;
  }

  public final void execute()
  {
    this.b = ProgressDialog.show(this.a, this.a.getString(2131625498), this.a.getString(2131624532));
    ThreadPool.execute(new ag(this, 0));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.af
 * JD-Core Version:    0.6.0
 */