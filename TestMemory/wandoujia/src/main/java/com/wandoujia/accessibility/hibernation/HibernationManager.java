package com.wandoujia.accessibility.hibernation;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.wandoujia.accessibility.hibernation.activity.BoosterHomeActivity;
import com.wandoujia.accessibility.hibernation.view.AppHibernatingView;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.MemoryUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HibernationManager extends BroadcastReceiver
{
  private static final Long a = Long.valueOf(3000L);
  private static final Long b = Long.valueOf(250L);
  private static final Long c = Long.valueOf(200L);
  private static HibernationManager d = null;
  private static ComponentName e;
  private int f = 0;
  private final List<String> g = new ArrayList();
  private boolean h = false;
  private final Handler i = new Handler(Looper.getMainLooper());
  private final List<String> j = new ArrayList();
  private final List<String> k = new ArrayList();
  private final List<String> l = new ArrayList();
  private final List<String> m = new ArrayList();
  private AppHibernatingView n;
  private com.wandoujia.accessibility.hibernation.view.g o = new c(this);
  private Context p;
  private boolean q;
  private final Set<String> r = com.wandoujia.accessibility.a.a.i();
  private final Set<String> s = com.wandoujia.accessibility.a.a.j();
  private Runnable t = new b(this);
  private PhoneStateListener u;
  private BroadcastReceiver v = new HibernationManager.2(this);

  private HibernationManager()
  {
    this.r.addAll(com.wandoujia.accessibility.a.a.i());
    this.s.addAll(com.wandoujia.accessibility.a.a.j());
  }

  public static ComponentName a(Context paramContext)
  {
    Intent localIntent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
    localIntent.setData(Uri.fromParts("package", paramContext.getPackageName(), null));
    List localList = paramContext.getPackageManager().queryIntentActivities(localIntent, 0);
    ComponentName localComponentName;
    if ((localList == null) || (localList.size() == 0))
      localComponentName = null;
    while (true)
    {
      e = localComponentName;
      return localComponentName;
      localList.size();
      ActivityInfo localActivityInfo = ((ResolveInfo)localList.get(0)).activityInfo;
      String str = localActivityInfo.packageName;
      if (localActivityInfo.targetActivity != null)
      {
        localComponentName = new ComponentName(str, localActivityInfo.name);
        continue;
      }
      localComponentName = null;
    }
  }

  public static HibernationManager a()
  {
    if (d == null)
      d = new HibernationManager();
    return d;
  }

  private void a(String paramString)
  {
    this.n.a(paramString);
    Intent localIntent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
    localIntent.setData(Uri.fromParts("package", paramString, null));
    this.p.startActivity(localIntent);
    this.i.postDelayed(this.t, a.longValue());
  }

  public static String b()
  {
    if (e == null)
      return "";
    return e.getPackageName();
  }

  private void g()
  {
    this.i.postDelayed(new d(this), b.longValue());
  }

  private void h()
  {
    if (this.q)
    {
      GlobalConfig.getAppContext().unregisterReceiver(this);
      this.q = false;
    }
    this.h = false;
    this.j.clear();
    this.k.clear();
    this.g.clear();
    this.f = 0;
    this.l.clear();
    this.m.clear();
    this.i.removeCallbacks(this.t);
    a.d();
    BoosterHomeActivity.a(this.p, true);
  }

  public final void a(Map<String, Long> paramMap, Context paramContext)
  {
    if ((paramMap.size() == 0) || (this.h))
      return;
    this.p = paramContext;
    IntentFilter localIntentFilter1 = new IntentFilter();
    localIntentFilter1.addAction("android.intent.action.SCREEN_OFF");
    this.p.registerReceiver(this.v, localIntentFilter1);
    if (this.u == null)
      this.u = new e(this);
    ((TelephonyManager)paramContext.getSystemService("phone")).listen(this.u, 32);
    if (this.n == null)
      this.n = AppHibernatingView.a(GlobalConfig.getAppContext());
    this.n.a(GlobalConfig.getAppContext(), paramMap, this.o);
    this.g.addAll(paramMap.keySet());
    this.h = true;
    IntentFilter localIntentFilter2 = new IntentFilter("android.intent.action.PACKAGE_RESTARTED");
    localIntentFilter2.addDataScheme("package");
    GlobalConfig.getAppContext().registerReceiver(this, localIntentFilter2);
    this.q = true;
    List localList = this.g;
    int i1 = this.f;
    this.f = (i1 + 1);
    a((String)localList.get(i1));
    this.i.post(new f(this));
  }

  public final void c()
  {
    h();
    g();
  }

  public final List<String> d()
  {
    return CollectionUtils.copyFrom(this.l);
  }

  public final List<String> e()
  {
    ArrayList localArrayList = new ArrayList(MemoryUtil.findAllRunningPackage(GlobalConfig.getAppContext()));
    this.l.clear();
    this.m.clear();
    Iterator localIterator1 = localArrayList.iterator();
    Set localSet1 = com.wandoujia.accessibility.a.a.k();
    Set localSet2 = com.wandoujia.accessibility.a.a.l();
    while (localIterator1.hasNext())
    {
      String str3 = (String)localIterator1.next();
      if (!MemoryUtil.isAppKillable(GlobalConfig.getAppContext(), str3))
      {
        localIterator1.remove();
        continue;
      }
      if (localSet1.size() > 0)
      {
        if (localSet1.contains(str3))
        {
          localIterator1.remove();
          continue;
        }
      }
      else
        try
        {
          if ((0x1 & GlobalConfig.getAppContext().getPackageManager().getPackageInfo(str3, 64).applicationInfo.flags) == 1)
            localIterator1.remove();
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
        }
      if (((localSet2.size() <= 0) || (!localSet2.contains(str3))) && ((localSet2.size() != 0) || (!h.a(str3)) || (!localSet2.contains(str3))))
        continue;
      this.l.add(str3);
      localIterator1.remove();
    }
    Iterator localIterator2 = this.l.iterator();
    while (localIterator2.hasNext())
    {
      String str2 = (String)localIterator2.next();
      if (!this.s.contains(str2))
        continue;
      localArrayList.add(str2);
      localIterator2.remove();
    }
    Iterator localIterator3 = localArrayList.iterator();
    while (localIterator3.hasNext())
    {
      String str1 = (String)localIterator3.next();
      if (!this.r.contains(str1))
        continue;
      this.l.add(str1);
      localIterator3.remove();
    }
    this.m.addAll(localArrayList);
    return localArrayList;
  }

  public final boolean f()
  {
    return this.h;
  }

  @TargetApi(16)
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (!this.h)
      return;
    String str = paramIntent.getDataString().substring(8);
    this.j.add(str);
    this.i.removeCallbacks(this.t);
    this.n.a(str, true);
    if (this.f < this.g.size())
    {
      this.i.postDelayed(new g(this), c.longValue());
      return;
    }
    h();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.HibernationManager
 * JD-Core Version:    0.6.0
 */