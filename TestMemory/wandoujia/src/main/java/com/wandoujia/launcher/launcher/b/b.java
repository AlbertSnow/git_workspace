package com.wandoujia.launcher.launcher.b;

import android.content.Context;
import android.support.v4.app.d;
import android.text.TextUtils;
import com.wandoujia.base.utils.LauncherUtil;
import com.wandoujia.launcher.e.a;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class b
{
  private static final Map<String, String> a = new HashMap();

  static
  {
    if ("en".equals(Locale.getDefault().getLanguage()))
    {
      a.put("com.baidu.gamecenter", "My Game");
      a.put("com.cleanmaster.mguard_cn", "Games");
    }
    while (true)
    {
      a.put("com.qihoo.appstore", "我的游戏");
      a.put("com.taobao.appcenter", "我的游戏");
      a.put("com.sogou.gamecenter", "");
      return;
      a.put("com.baidu.gamecenter", "我的游戏");
      a.put("com.cleanmaster.mguard_cn", "游戏");
    }
  }

  public static void a(Context paramContext)
  {
    long l = d.h();
    int i;
    String str;
    if ((l == 0L) || (System.currentTimeMillis() - l >= 86400000L))
    {
      i = 1;
      if (i != 0)
      {
        if (android.support.v4.app.b.i(paramContext, a.a(paramContext)))
          break label101;
        if (!TextUtils.isEmpty(LauncherUtil.getAuthorityFromPermission(paramContext, "READ_SETTINGS")))
          break label94;
        str = "unknown";
      }
    }
    while (true)
    {
      android.support.v4.app.b.a(TaskEvent.Status.END, TaskEvent.Result.SUCCESS, TaskEvent.Action.OPEN, android.support.v4.app.b.a("game_launcher", ViewLogPackage.Element.ICON, ViewLogPackage.Action.OPEN, "check_shortcut_icon_exists"), str);
      d.c(System.currentTimeMillis());
      return;
      i = 0;
      break;
      label94: str = "gone";
      continue;
      label101: str = "existed";
    }
  }

  public static boolean a()
  {
    long l = d.f();
    return (l == 0L) || (System.currentTimeMillis() - l >= 86400000L);
  }

  public static boolean b()
  {
    long l = d.g();
    if (l == 0L);
    do
      return true;
    while (System.currentTimeMillis() - l >= 86400000L);
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.b.b
 * JD-Core Version:    0.6.0
 */