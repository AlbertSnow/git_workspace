package com.wandoujia.logv3.toolkit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.wandoujia.base.log.Log;
import com.wandoujia.log.R.id;
import com.wandoujia.logv3.c;
import com.wandoujia.logv3.f;
import com.wandoujia.logv3.model.packages.ApplicationCrashEvent.Builder;
import com.wandoujia.logv3.model.packages.ApplicationCrashEvent.Type;
import com.wandoujia.logv3.model.packages.ApplicationStartEvent;
import com.wandoujia.logv3.model.packages.CardPackage;
import com.wandoujia.logv3.model.packages.ConsumptionEvent.Builder;
import com.wandoujia.logv3.model.packages.ContentPackage;
import com.wandoujia.logv3.model.packages.DeviceStatusPackage;
import com.wandoujia.logv3.model.packages.DownloadPackage;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.FeedPackage;
import com.wandoujia.logv3.model.packages.GameLauncherPackage;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage;
import com.wandoujia.logv3.model.packages.ResourcePackage;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.UrlPackage.Vertical;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.model.packages.ViewLogPackage.IndexPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage.IndexPackage.Builder;
import com.wandoujia.logv3.toolkit.treebuilder.PopupLogTreeBuilder;
import com.wandoujia.logv3.toolkit.treebuilder.a;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class v
  implements g, k
{
  private static final String b = v.class.getSimpleName();
  private static final int c = R.id.tag_log_page_vertical;
  private static final int d = R.id.tag_log_page_uri;
  private static final int e = R.id.tag_log_page_uri_params;
  private static final int f = R.id.tag_log_page_uri_anchor;
  private static final int g = R.id.tag_log_module;
  private static final int h = R.id.tag_log_view_packages;
  private static final int i = R.id.tag_log_index_packages;
  private static final int j = R.id.tag_log_extra_packages;
  private static final int k = R.id.tag_log_view_enable_card_show;
  private static final int l = R.id.tag_log_view_enable_sub_card_show;
  private static final int m = R.id.tag_log_forbidden_page_show;
  private static v n;
  private static Context o;
  private static w p;
  protected final f a;
  private final c q;
  private final e r;
  private final LaunchLogger s;
  private final l t;

  protected v(Context paramContext, c paramc)
  {
    this.q = paramc;
    this.r = new e(this);
    this.s = new LaunchLogger(this);
    this.a = com.wandoujia.logv3.b.a(paramContext, paramc);
    this.t = new l(this.a);
  }

  public static void a(Context paramContext, c paramc)
  {
    if (n != null)
      return;
    n = new x(paramContext, paramc);
    Thread.setDefaultUncaughtExceptionHandler(new ae(paramContext));
  }

  public static void a(w paramw, Context paramContext)
  {
    p = paramw;
    o = paramContext;
  }

  public static v b()
  {
    if (n == null)
      a(o, p.a());
    return n;
  }

  private static void f()
  {
    if (Looper.getMainLooper() != Looper.myLooper())
      throw new IllegalStateException("Must be called in UI thread.");
  }

  public static UrlPackage.Vertical g(View paramView)
  {
    Object localObject = paramView.getTag(c);
    if ((localObject instanceof UrlPackage.Vertical))
      return (UrlPackage.Vertical)localObject;
    return null;
  }

  public static ak h(View paramView)
  {
    Object localObject = paramView.getTag(d);
    if ((localObject instanceof ak))
      return (ak)localObject;
    return null;
  }

  public static String i(View paramView)
  {
    Object localObject = paramView.getTag(f);
    if ((localObject instanceof String))
      return (String)localObject;
    return null;
  }

  public static List<BasicNameValuePair> j(View paramView)
  {
    Object localObject = paramView.getTag(e);
    if ((localObject instanceof List))
      return (List)localObject;
    return null;
  }

  public static String k(View paramView)
  {
    Object localObject = paramView.getTag(g);
    if ((localObject instanceof String))
      return (String)localObject;
    return null;
  }

  public static al l(View paramView)
  {
    Object localObject = paramView.getTag(h);
    if ((localObject instanceof al))
      return (al)localObject;
    return null;
  }

  public static ViewLogPackage.IndexPackage m(View paramView)
  {
    Object localObject = paramView.getTag(i);
    if ((localObject instanceof ViewLogPackage.IndexPackage))
      return (ViewLogPackage.IndexPackage)localObject;
    return null;
  }

  public static ExtraPackage.Builder n(View paramView)
  {
    ExtraPackage.Builder localBuilder = (ExtraPackage.Builder)paramView.getTag(j);
    if (localBuilder == null)
    {
      localBuilder = new ExtraPackage.Builder();
      paramView.setTag(j, localBuilder);
    }
    return localBuilder;
  }

  public static boolean p(View paramView)
  {
    return paramView.getTag(k) != null;
  }

  public static boolean r(View paramView)
  {
    return paramView.getTag(l) != null;
  }

  public static boolean s(View paramView)
  {
    return paramView.getTag(m) != null;
  }

  private static ab t(View paramView)
  {
    while (true)
    {
      try
      {
        if (PopupLogTreeBuilder.b(paramView) != null)
        {
          i1 = 1;
          if (i1 == 0)
            continue;
          Object localObject = new PopupLogTreeBuilder();
          return ((com.wandoujia.logv3.toolkit.treebuilder.b)localObject).a(paramView);
          localObject = new a();
          continue;
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        ae.a(localRuntimeException);
        return null;
      }
      int i1 = 0;
    }
  }

  public final LaunchSourcePackage a(Intent paramIntent)
  {
    return this.q.a(paramIntent);
  }

  public final v a(View paramView, int paramInt)
  {
    a(paramView, new ViewLogPackage.IndexPackage.Builder(m(paramView)).index(Integer.valueOf(paramInt)).build());
    return this;
  }

  public final v a(View paramView, CardPackage paramCardPackage)
  {
    n(paramView).card_package(paramCardPackage);
    return this;
  }

  public final v a(View paramView, ContentPackage paramContentPackage)
  {
    n(paramView).content_package(paramContentPackage);
    return this;
  }

  public final v a(View paramView, DeviceStatusPackage paramDeviceStatusPackage)
  {
    n(paramView).device_status_package(paramDeviceStatusPackage);
    return this;
  }

  public final v a(View paramView, DownloadPackage paramDownloadPackage)
  {
    n(paramView).download_package(paramDownloadPackage);
    return this;
  }

  public final v a(View paramView, FeedPackage paramFeedPackage)
  {
    n(paramView).feed_package(paramFeedPackage);
    return this;
  }

  public final v a(View paramView, GameLauncherPackage paramGameLauncherPackage)
  {
    n(paramView).game_launcher_package(paramGameLauncherPackage);
    return this;
  }

  public final v a(View paramView, ResourcePackage paramResourcePackage)
  {
    n(paramView).resource_package(paramResourcePackage);
    return this;
  }

  public final v a(View paramView, ViewLogPackage.Element paramElement, ViewLogPackage.Action paramAction, String paramString)
  {
    paramView.setTag(h, new al(paramElement, paramAction, paramString));
    return this;
  }

  public final v a(View paramView, ViewLogPackage.Element paramElement, ViewLogPackage.Action paramAction, String paramString, Long paramLong)
  {
    paramView.setTag(h, new al(paramElement, paramAction, paramString, paramLong));
    return this;
  }

  public final v a(View paramView, ViewLogPackage.IndexPackage paramIndexPackage)
  {
    paramView.setTag(i, paramIndexPackage);
    return this;
  }

  public final v a(View paramView, ak paramak)
  {
    paramView.setTag(d, paramak);
    return this;
  }

  public final v a(View paramView, String paramString)
  {
    paramView.setTag(g, paramString);
    return this;
  }

  public final v a(View paramView, List<BasicNameValuePair> paramList)
  {
    if ((paramView.getTag(d) == null) && (paramView.getTag(f) == null))
      return this;
    paramView.setTag(e, paramList);
    return this;
  }

  public void a()
  {
    this.t.a();
  }

  public final void a(Activity paramActivity)
  {
    this.s.a(paramActivity);
  }

  public final void a(Activity paramActivity, Intent paramIntent)
  {
    this.s.a(paramActivity, paramIntent);
  }

  public final void a(Activity paramActivity, Intent paramIntent, Bundle paramBundle)
  {
    this.s.a(paramActivity, paramIntent, paramBundle);
  }

  public void a(Context paramContext)
  {
    if (!(paramContext instanceof Activity))
    {
      Log.w(b, "logPageShow get a Context that is not an Activity", new Object[0]);
      return;
    }
    try
    {
      f();
      View localView = ((Activity)paramContext).getWindow().getDecorView();
      a(localView, ViewLogPackage.Element.PAGE, null, null);
      ab localab = t(localView);
      this.t.a(localab);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      ae.a(localRuntimeException);
    }
  }

  public void a(View paramView)
  {
    throw new RuntimeException("Stub!");
  }

  public void a(View paramView1, View paramView2)
  {
    throw new RuntimeException("Stub!");
  }

  public void a(ApplicationCrashEvent.Type paramType, String paramString)
  {
    ApplicationCrashEvent.Builder localBuilder = new ApplicationCrashEvent.Builder();
    localBuilder.detail(paramString).type(paramType);
    this.t.a(localBuilder);
  }

  public void a(ConsumptionEvent.Builder paramBuilder, ExtraPackage.Builder paramBuilder1)
  {
    this.t.a(paramBuilder, paramBuilder1);
  }

  public void a(ConsumptionEvent.Builder paramBuilder, ExtraPackage.Builder paramBuilder1, ViewLogPackage paramViewLogPackage)
  {
    throw new RuntimeException("Stub!");
  }

  public void a(LaunchSourcePackage paramLaunchSourcePackage, ApplicationStartEvent paramApplicationStartEvent)
  {
    this.t.a(paramLaunchSourcePackage, paramApplicationStartEvent);
  }

  public void a(TaskEvent.Builder paramBuilder, ExtraPackage.Builder paramBuilder1)
  {
    this.t.a(paramBuilder, paramBuilder1);
  }

  public final void b(Activity paramActivity)
  {
    this.s.b(paramActivity);
  }

  public final void b(Activity paramActivity, Intent paramIntent)
  {
    this.s.b(paramActivity, paramIntent);
  }

  public void b(View paramView)
  {
    throw new RuntimeException("Stub!");
  }

  public void b(View paramView1, View paramView2)
  {
    throw new RuntimeException("Stub!");
  }

  public final e c()
  {
    return this.r;
  }

  public void c(View paramView)
  {
    try
    {
      f();
      android.support.v4.app.b.c(paramView);
      this.t.b(t(paramView));
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      ae.a(localRuntimeException);
    }
  }

  public void d()
  {
    try
    {
      f();
      this.t.b();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      ae.a(localRuntimeException);
    }
  }

  public void d(View paramView)
  {
    try
    {
      f();
      android.support.v4.app.b.c(paramView);
      this.t.c(t(paramView));
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      ae.a(localRuntimeException);
    }
  }

  public void e()
  {
  }

  public void e(View paramView)
  {
  }

  public ViewLogPackage f(View paramView)
  {
    throw new RuntimeException("Stub!");
  }

  public final v o(View paramView)
  {
    if (paramView.getTag(k) == null)
    {
      Object localObject = new Object();
      paramView.setTag(k, localObject);
    }
    return this;
  }

  public final v q(View paramView)
  {
    if (paramView.getTag(l) == null)
    {
      Object localObject = new Object();
      paramView.setTag(l, localObject);
    }
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.v
 * JD-Core Version:    0.6.0
 */