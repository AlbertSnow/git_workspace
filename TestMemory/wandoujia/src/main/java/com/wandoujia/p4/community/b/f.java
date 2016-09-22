package com.wandoujia.p4.community.b;

import android.app.Activity;
import android.app.Dialog;
import com.wandoujia.mvc.Action;

public final class f
  implements Action
{
  private final com.wandoujia.p4.community.http.a.a a;
  private final Activity b;
  private final String c;
  private Dialog d;

  public f(com.wandoujia.p4.community.http.a.a parama, Activity paramActivity, String paramString)
  {
    this.a = parama;
    this.b = paramActivity;
    this.c = paramString;
  }

  private void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.d = com.wandoujia.p4.community.utils.a.a(this.b, paramString1, paramString2, paramString4, new g(this), paramString3, new h(this));
  }

  public final void execute()
  {
    if ((this.a instanceof com.wandoujia.p4.community.http.a.f))
    {
      a(this.b.getString(2131624444), this.b.getString(2131624446), this.b.getString(2131624445), this.b.getString(2131624330));
      return;
    }
    a(this.b.getString(2131624598), this.b.getString(2131624442), this.b.getString(2131624552), this.b.getString(2131624330));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.f
 * JD-Core Version:    0.6.0
 */