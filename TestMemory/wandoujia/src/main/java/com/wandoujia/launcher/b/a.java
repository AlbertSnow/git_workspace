package com.wandoujia.launcher.b;

import android.content.Context;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.appmanager.LocalAppChangedListener.Error;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.game_launcher.lib.R.string;

public final class a extends LocalAppChangedListener
{
  private Context a;

  public a(Context paramContext)
  {
    this.a = paramContext;
  }

  private String a(String paramString)
  {
    LocalAppInfo localLocalAppInfo = AppManager.a().f(paramString);
    if (localLocalAppInfo == null)
      return this.a.getString(R.string.vertical_title_app);
    return localLocalAppInfo.getTitle();
  }

  public final void a(LocalAppInfo paramLocalAppInfo, boolean paramBoolean)
  {
    if (paramBoolean)
      com.wandoujia.launcher_base.app.a.a(this.a, paramLocalAppInfo.getTitle());
  }

  public final void a(String paramString, LocalAppChangedListener.Error paramError, boolean paramBoolean)
  {
    if (paramBoolean)
      com.wandoujia.launcher_base.app.a.a(this.a, a(paramString), paramError);
  }

  public final void a(String paramString, LocalAppInfo paramLocalAppInfo, boolean paramBoolean)
  {
    Context localContext;
    if (paramBoolean)
    {
      localContext = this.a;
      if (paramLocalAppInfo != null)
        break label26;
    }
    label26: for (String str = ""; ; str = paramLocalAppInfo.getTitle())
    {
      com.wandoujia.launcher_base.app.a.b(localContext, str);
      return;
    }
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
      com.wandoujia.launcher_base.app.a.c(this.a, a(paramString));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.b.a
 * JD-Core Version:    0.6.0
 */