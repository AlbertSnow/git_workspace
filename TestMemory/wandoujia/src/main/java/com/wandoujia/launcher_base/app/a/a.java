package com.wandoujia.launcher_base.app.a;

import android.content.Context;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.mvc.Action;

public final class a
  implements Action
{
  private Context a;
  private String b;
  private String c;

  public a(Context paramContext, String paramString1, String paramString2)
  {
    this.a = paramContext;
    this.b = paramString1;
    this.c = paramString2;
  }

  public final void execute()
  {
    if (com.wandoujia.rootkit.b.a().c())
    {
      com.wandoujia.launcher_base.app.a.a(this.a, this.c, new b(this), new c());
      return;
    }
    com.wandoujia.launcher_base.utils.a.a(this.b, "general");
    AppManager.a().b(this.b, false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.app.a.a
 * JD-Core Version:    0.6.0
 */