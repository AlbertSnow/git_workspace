package com.wandoujia.p4.community.b;

import android.app.Activity;
import com.wandoujia.mvc.Action;

public final class bk
  implements Action
{
  private final Activity a;
  private final String b;
  private final boolean c;

  public bk(Activity paramActivity, String paramString, boolean paramBoolean)
  {
    this.a = paramActivity;
    this.b = paramString;
    this.c = paramBoolean;
  }

  public final void execute()
  {
    new Thread(new bl(this)).start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.bk
 * JD-Core Version:    0.6.0
 */