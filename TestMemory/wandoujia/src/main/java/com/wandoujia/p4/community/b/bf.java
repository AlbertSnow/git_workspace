package com.wandoujia.p4.community.b;

import android.app.Activity;
import android.content.res.Resources;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.utils.a;

public final class bf
  implements Action
{
  private final Activity a;
  private final String b;
  private final String c;

  public bf(Activity paramActivity, String paramString1, String paramString2)
  {
    this.a = paramActivity;
    this.b = paramString1;
    this.c = paramString2;
  }

  public final void execute()
  {
    a.a(this.a, this.a.getString(2131624523), this.a.getResources().getString(2131624526), this.a.getString(2131624524), new bg(), this.a.getString(2131624523), new bh(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.bf
 * JD-Core Version:    0.6.0
 */