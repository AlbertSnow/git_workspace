package com.wandoujia.p4.community.b;

import android.app.Activity;
import android.content.res.Resources;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.utils.a;

public final class n
  implements Action
{
  private String a;
  private Activity b;

  public n(String paramString, Activity paramActivity)
  {
    this.a = paramString;
    this.b = paramActivity;
  }

  public final void execute()
  {
    a.a(this.b, this.b.getString(2131624455), this.b.getResources().getString(2131624453), this.b.getString(2131624452), new o(), this.b.getString(2131624454), new p(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.n
 * JD-Core Version:    0.6.0
 */