package com.wandoujia.game_launcher.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.AsyncTaskUtils;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.entities.app.AppLiteInfo;
import com.wandoujia.game_launcher.lib.R.drawable;
import com.wandoujia.game_launcher.lib.R.id;
import com.wandoujia.game_launcher.lib.R.layout;
import com.wandoujia.game_launcher.lib.R.string;
import com.wandoujia.launcher.LauncherConfig;
import com.wandoujia.launcher.LauncherConfig.LauncherType;
import com.wandoujia.launcher.j;
import com.wandoujia.launcher.launcher.models.LauncherSuggestionModel;
import com.wandoujia.launcher.launcher.models.SimpleAppInfo;
import com.wandoujia.launcher.p;
import com.wandoujia.launcher_base.launcher.c.m;
import com.wandoujia.launcher_base.launcher.fragment.HomeFragment;
import com.wandoujia.logv3.model.packages.GameLauncherPackage;
import com.wandoujia.logv3.model.packages.GameLauncherPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.online_config.ConfigStorage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GLHomeFragment extends HomeFragment
  implements com.wandoujia.launcher.launcher.b.g
{
  private m b = new a(this);
  private com.wandoujia.launcher_base.launcher.a.a c;
  private List<SimpleAppInfo> d;
  private List<LauncherSuggestionModel> e;
  private com.wandoujia.game_launcher.b.a f;
  private List<com.wandoujia.launcher.a> g;
  private List<com.wandoujia.launcher.a> h;
  private com.wandoujia.launcher_base.launcher.b.a i;
  private boolean j = true;

  private static void b(int paramInt)
  {
    GameLauncherPackage localGameLauncherPackage = android.support.v4.app.b.M();
    GameLauncherPackage.Builder localBuilder = new GameLauncherPackage.Builder();
    localBuilder.game_count(Integer.valueOf(paramInt));
    android.support.v4.app.b.a(localBuilder.build());
    if ((localGameLauncherPackage == null) || (localGameLauncherPackage.game_count.intValue() != paramInt))
      android.support.v4.app.b.a(TaskEvent.Status.END, TaskEvent.Result.SUCCESS, TaskEvent.Action.OPEN, android.support.v4.app.b.a("game_launcher", ViewLogPackage.Element.PAGE, ViewLogPackage.Action.OPEN, "check_game_count"), String.valueOf(paramInt));
  }

  private void d()
  {
    int k;
    int m;
    label44: View localView;
    TextView localTextView;
    if ((LauncherConfig.b() == LauncherConfig.LauncherType.NATIVE_GL) && (!AppManager.a().h("com.wandoujia.game_launcher")))
    {
      k = 1;
      if (k != 0)
      {
        if (SystemUtil.getMetricsSize(getActivity().getWindowManager()) <= 160)
          break label191;
        m = 1;
        if (m != 0)
        {
          com.wandoujia.online_config.c.a();
          if (ConfigStorage.a("enable_gl_bottom_upgrade", true))
          {
            localView = LayoutInflater.from(getActivity()).inflate(R.layout.snackbar_upgrade_label, null, false);
            localTextView = (TextView)localView.findViewById(R.id.bottom_upgrade_title);
            if (!j.c())
              break label196;
            localTextView.setText(R.string.bottom_upgrade_title_with_apk);
          }
        }
      }
    }
    while (true)
    {
      localView.setOnClickListener(new b(this));
      a(localView);
      android.support.v4.app.b.a(TaskEvent.Status.END, TaskEvent.Result.SUCCESS, TaskEvent.Action.OPEN, android.support.v4.app.b.a("game_launcher_upgrade", ViewLogPackage.Element.PAGE, ViewLogPackage.Action.OPEN, "show_upgrade_bar"), "");
      return;
      if (LauncherConfig.b() == LauncherConfig.LauncherType.APK_GL)
      {
        int n = SystemUtil.getVersionCode(GlobalConfig.getAppContext());
        com.wandoujia.online_config.c.a();
        if (com.wandoujia.online_config.c.e() > n)
        {
          k = 1;
          break;
        }
      }
      k = 0;
      break;
      label191: m = 0;
      break label44;
      label196: localTextView.setText(R.string.bottom_upgrade_title_no_apk);
    }
  }

  private void e()
  {
    this.c.d();
    if (SystemUtil.aboveApiLevel(11))
    {
      if (this.f == null)
      {
        this.f = new com.wandoujia.game_launcher.b.a();
        this.f.a(new com.wandoujia.launcher_base.utils.g(4, 4));
      }
      this.c.a(this.f);
    }
    this.c.a(new com.wandoujia.launcher_base.launcher.b.b());
    if (CollectionUtils.isEmpty(this.d))
    {
      com.wandoujia.launcher_base.launcher.b.c localc = new com.wandoujia.launcher_base.launcher.b.c();
      localc.a(new com.wandoujia.launcher_base.utils.g(4, 2));
      localc.a(getString(R.string.tip_no_game));
      this.c.a(localc);
    }
    while (true)
    {
      this.c.a(new com.wandoujia.launcher_base.launcher.b.d());
      if (CollectionUtils.isEmpty(this.e))
        break;
      if (!CollectionUtils.isEmpty(this.d))
        this.c.a(new com.wandoujia.launcher_base.launcher.b.e(R.layout.game_launcher_suggestion_title_cell, new com.wandoujia.launcher_base.utils.g(4, 1)));
      if (this.h == null)
      {
        this.h = new ArrayList();
        int k = 0;
        while (true)
          if (k < this.e.size())
          {
            AppLiteInfo localAppLiteInfo = ((LauncherSuggestionModel)this.e.get(k)).getAppLiteInfo();
            this.h.add(new com.wandoujia.launcher.a(new com.wandoujia.launcher_base.view.button.a.b(localAppLiteInfo)).a("game_suggestion", k).a(false));
            k++;
            continue;
            if (this.g == null)
            {
              this.g = new ArrayList();
              for (int m = 0; m < this.d.size(); m++)
                this.g.add(new com.wandoujia.launcher.a(new com.wandoujia.game_launcher.models.a((SimpleAppInfo)this.d.get(m))).a("local_game", m).a(true));
            }
            Iterator localIterator2 = this.g.iterator();
            while (localIterator2.hasNext())
            {
              com.wandoujia.launcher.a locala2 = (com.wandoujia.launcher.a)localIterator2.next();
              this.c.a(locala2);
            }
            break;
          }
      }
      Iterator localIterator1 = this.h.iterator();
      while (localIterator1.hasNext())
      {
        com.wandoujia.launcher.a locala1 = (com.wandoujia.launcher.a)localIterator1.next();
        this.c.a(locala1);
      }
    }
    if ((this.d != null) && (this.e != null))
      this.c.a(this.i);
    this.c.e();
    if ((SystemUtil.aboveApiLevel(11)) && (this.j))
    {
      if (!SystemUtil.aboveApiLevel(11))
        break label540;
      b().a(1);
    }
    while (true)
    {
      this.j = false;
      return;
      label540: b().a(0);
    }
  }

  protected final void a()
  {
    super.a();
    com.wandoujia.launcher.launcher.b.c.a().a(this);
    this.i = new com.wandoujia.launcher_base.launcher.b.a();
    this.i.a(R.drawable.ic_search_light, getString(R.string.title_search_game), new c(this));
    this.i.b(R.drawable.ic_game_light, getString(R.string.title_find_game), new d(this));
    this.c = new com.wandoujia.launcher_base.launcher.a.a();
    com.wandoujia.launcher_base.launcher.c.d locald = b();
    locald.a(this.b);
    locald.a(this.c);
    this.d = com.wandoujia.launcher.launcher.b.c.a().c();
    this.e = com.wandoujia.launcher.launcher.b.c.a().e();
    if (!CollectionUtils.isEmpty(this.d))
    {
      this.g = null;
      e();
      b(this.d.size());
    }
    while (true)
    {
      AsyncTaskUtils.runAsyncTask(new f(this, 0), new Void[0]);
      d();
      return;
      AsyncTaskUtils.runAsyncTask(new e(this, 0), new Void[0]);
    }
  }

  public final void a(List<SimpleAppInfo> paramList)
  {
    if ((!isAdded()) || (paramList == null))
      return;
    this.d = paramList;
    this.g = null;
    e();
    b(this.d.size());
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    de.greenrobot.event.c.a().a(this);
  }

  public void onDestroy()
  {
    super.onDestroy();
    de.greenrobot.event.c.a().c(this);
  }

  public void onEventMainThread(p paramp)
  {
    if ("show_bottom_label".equals(paramp.a()))
      d();
    do
      return;
    while (!"hide_bottom_label".equals(paramp.a()));
    c();
    android.support.v4.app.b.a(TaskEvent.Status.END, TaskEvent.Result.SUCCESS, TaskEvent.Action.OPEN, android.support.v4.app.b.a("game_launcher_upgrade", ViewLogPackage.Element.PAGE, ViewLogPackage.Action.OPEN, "hide_upgrade_bar"), "");
  }

  public void onResume()
  {
    super.onResume();
    e();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.fragments.GLHomeFragment
 * JD-Core Version:    0.6.0
 */