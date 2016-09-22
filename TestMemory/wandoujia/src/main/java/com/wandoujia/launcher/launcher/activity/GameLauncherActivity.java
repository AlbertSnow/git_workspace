package com.wandoujia.launcher.launcher.activity;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.b;
import android.support.v4.app.q;
import android.view.Window;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.ActivityLeakUtil;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.game_launcher.fragments.GLHomeFragment;
import com.wandoujia.game_launcher.lib.R.id;
import com.wandoujia.game_launcher.lib.R.layout;
import com.wandoujia.launcher.LauncherConfig;
import com.wandoujia.launcher.LauncherConfig.LauncherType;
import com.wandoujia.launcher_base.activity.LauncherBaseActivity;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.online_config.c;

public class GameLauncherActivity extends LauncherBaseActivity
{
  private boolean a = false;

  public void finish()
  {
    super.finish();
    overridePendingTransition(0, 0);
  }

  protected void onCreate(Bundle paramBundle)
  {
    int i = 1;
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    if (SystemUtil.aboveApiLevel(19))
    {
      getWindow().setFlags(67108864, 67108864);
      getWindow().setFlags(134217728, 134217728);
    }
    setContentView(R.layout.content_frame);
    getSupportFragmentManager().a().b(R.id.content_frame, new GLHomeFragment()).a();
    android.support.v4.app.d.d(System.currentTimeMillis());
    if (b.E() == 0L)
    {
      long l7 = System.currentTimeMillis() / 86400000L;
      SharedPreferences.Editor localEditor3 = b.D().edit();
      localEditor3.putLong("KEY_FIRST_LAUNCH_GL_DAY", l7);
      SharePrefSubmitor.submit(localEditor3);
    }
    long l1 = System.currentTimeMillis() / 86400000L;
    long l2 = b.E();
    if (((l2 == 0L) || (l2 == l1)) && (!b.D().getBoolean("KEY_ONBOARD_KNOWN", false)))
      ThreadPool.execute(new a(this));
    c.a();
    long l3;
    long l4;
    long l5;
    int j;
    if (c.g())
    {
      l3 = System.currentTimeMillis() / 86400000L;
      l4 = b.D().getLong("KEY_LAST_ALERT_GL_TIME", 0L) / 86400000L;
      l5 = b.D().getInt("KEY_LAST_ALERT_GL_VC", 0);
      c.a();
      j = c.j();
      if ((LauncherConfig.b() != LauncherConfig.LauncherType.NATIVE_GL) || (AppManager.a().h("com.wandoujia.game_launcher")))
        break label403;
      c.a();
      if ((!c.k()) && (l3 == b.E()))
        break label398;
      c.a();
      if (c.e() <= l5)
        break label381;
    }
    while (true)
    {
      if (i != 0)
      {
        com.wandoujia.launcher.e.a.a(new d(this));
        long l6 = System.currentTimeMillis();
        SharedPreferences.Editor localEditor1 = b.D().edit();
        localEditor1.putLong("KEY_LAST_ALERT_GL_TIME", l6);
        SharePrefSubmitor.submit(localEditor1);
        c.a();
        int m = c.e();
        SharedPreferences.Editor localEditor2 = b.D().edit();
        localEditor2.putInt("KEY_LAST_ALERT_GL_VC", m);
        SharePrefSubmitor.submit(localEditor2);
      }
      return;
      label381: if ((j > 0) && (l3 - l4 >= j))
        continue;
      label398: label403: int k;
      do
      {
        do
        {
          do
          {
            do
            {
              i = 0;
              break;
            }
            while (LauncherConfig.b() != LauncherConfig.LauncherType.APK_GL);
            c.a();
          }
          while ((!c.k()) && (l3 == b.E()));
          c.a();
          if (c.e() > l5)
            break;
          k = SystemUtil.getVersionCode(GlobalConfig.getAppContext());
        }
        while ((j <= 0) || (l3 - l4 < j));
        c.a();
      }
      while (c.e() <= k);
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    ActivityLeakUtil.fixInputMethodManagerLeak(this);
    v.b().d();
    this.a = true;
  }

  protected void onStart()
  {
    super.onStart();
    b.q(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.activity.GameLauncherActivity
 * JD-Core Version:    0.6.0
 */