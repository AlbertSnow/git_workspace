package com.wandoujia.launcher;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.MemoryUtil;
import com.wandoujia.game_launcher.lib.R.string;
import com.wandoujia.launcher.view.SpeedUpView;
import com.wandoujia.launcher_base.view.stateful.a.f;
import com.wandoujia.launcher_base.view.stateful.view.SuggestionView;

final class b extends f
{
  private SuggestionView a;

  b(a parama, SuggestionView paramSuggestionView)
  {
    this.a = paramSuggestionView;
  }

  public final boolean a(com.wandoujia.launcher_base.view.button.a.a parama)
  {
    if (!AppManager.a().h(parama.d()))
    {
      com.wandoujia.launcher.launcher.b.c.a().b(parama.d());
      return true;
    }
    if (!a.a(this.b))
    {
      AppManager.a();
      AppManager.b(parama.d());
      Context localContext2 = GlobalConfig.getAppContext();
      int i = R.string.app_launcher_tips;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = parama.a();
      String str2 = localContext2.getString(i, arrayOfObject);
      Toast.makeText(GlobalConfig.getAppContext(), str2, 0).show();
      return true;
    }
    Context localContext1 = GlobalConfig.getAppContext();
    long l = MemoryUtil.getAvailMemory(localContext1);
    MemoryUtil.killAllProcesses(localContext1, parama.d());
    String str1 = a.a(l, MemoryUtil.getAvailMemory(localContext1), parama.a());
    View localView = this.a.getIcon();
    SpeedUpView localSpeedUpView = new SpeedUpView(localContext1);
    localSpeedUpView.setIcon(parama.b());
    localSpeedUpView.setMsg(str1);
    localSpeedUpView.a(a.a(localView), a.b(localView));
    new Handler().postDelayed(new c(parama), 500L);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.b
 * JD-Core Version:    0.6.0
 */