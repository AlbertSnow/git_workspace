package com.wandoujia.logv3.toolkit;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.support.v4.app.b;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.wandoujia.logv3.c;
import com.wandoujia.logv3.f;
import com.wandoujia.logv3.model.packages.ApplicationActiveEvent.Builder;
import com.wandoujia.logv3.model.packages.ApplicationCrashEvent.Builder;
import com.wandoujia.logv3.model.packages.ApplicationCrashEvent.Type;
import com.wandoujia.logv3.model.packages.ApplicationStartEvent;
import com.wandoujia.logv3.model.packages.ApplicationStartEvent.Reason;
import com.wandoujia.logv3.model.packages.ClickEvent.Builder;
import com.wandoujia.logv3.model.packages.ConsumptionEvent.Builder;
import com.wandoujia.logv3.model.packages.EventPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage;
import com.wandoujia.logv3.model.packages.LogReportEvent.Builder;
import com.wandoujia.logv3.model.packages.ShowEvent.Builder;
import com.wandoujia.logv3.model.packages.ShowEvent.Type;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.UrlPackage;
import com.wandoujia.logv3.model.packages.UrlPackage.Builder;
import com.wandoujia.logv3.model.packages.UrlPackage.Vertical;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.model.packages.ViewLogPackage.IndexPackage;
import java.util.LinkedList;
import java.util.List;

final class x extends v
{
  private ViewLogPackage b;
  private ViewLogPackage c;
  private ViewLogPackage d;
  private ViewLogPackage e;
  private z f;
  private ViewLogPackage g;
  private z h;

  x(Context paramContext, c paramc)
  {
    super(paramContext, paramc);
  }

  private ViewLogPackage.Builder a(View paramView, boolean paramBoolean, z paramz)
  {
    String str1 = k(paramView);
    al localal = l(paramView);
    ViewLogPackage.IndexPackage localIndexPackage = m(paramView);
    ViewLogPackage.Builder localBuilder1 = new ViewLogPackage.Builder();
    ViewLogPackage.Builder localBuilder2 = localBuilder1.module(str1).name(localal.c).action(localal.b).element(localal.a).value(localal.d);
    UrlPackage.Builder localBuilder3;
    aa localaa1;
    if (paramBoolean)
    {
      y localy1 = new y(0);
      localBuilder3 = new UrlPackage.Builder();
      if ((z.a(this.f) != null) && (!TextUtils.isEmpty(z.a(this.f).a())))
        y.a(localy1, z.a(this.f));
      if (!TextUtils.isEmpty(z.b(this.f)))
        y.a(localy1, z.b(this.f));
      if (z.c(this.f) != null)
        y.a(localy1, z.c(this.f));
      if (z.d(this.f) != null)
        localBuilder3.vertical(z.d(this.f));
      localaa1 = y.a(localy1);
    }
    UrlPackage.Builder localBuilder4;
    aa localaa2;
    for (UrlPackage localUrlPackage = localBuilder3.url(localaa1.a).normalized_url(localaa1.b).build(); ; localUrlPackage = localBuilder4.url(localaa2.a).normalized_url(localaa2.b).build())
    {
      localBuilder2.url_package(localUrlPackage);
      if (localIndexPackage != null)
        localBuilder1.index(localIndexPackage);
      return localBuilder1;
      if (paramz == null)
        paramz = this.f;
      y localy2 = new y(0);
      localBuilder4 = new UrlPackage.Builder();
      if (paramz != null)
      {
        if ((z.a(paramz) != null) && (!TextUtils.isEmpty(z.a(paramz).a())))
          y.a(localy2, z.a(paramz));
        if (!TextUtils.isEmpty(z.b(paramz)))
          y.a(localy2, z.b(paramz));
        if (z.c(paramz) != null)
          y.a(localy2, z.c(paramz));
        if (z.d(paramz) != null)
          localBuilder4.vertical(z.d(paramz));
      }
      UrlPackage.Vertical localVertical = v.g(paramView);
      ak localak = v.h(paramView);
      String str2 = v.i(paramView);
      List localList = j(paramView);
      if ((localak != null) && (!TextUtils.isEmpty(localak.a())))
        y.a(localy2, localak);
      if (!TextUtils.isEmpty(str2))
        y.a(localy2, str2);
      if (localList != null)
        y.a(localy2, localList);
      if (localVertical != null)
        localBuilder4.vertical(localVertical);
      localaa2 = y.a(localy2);
    }
  }

  private void a(String paramString)
  {
    if (this.b == null)
      this.c = null;
    do
    {
      do
        return;
      while ((paramString == null) && (this.b.url_package.url == null));
      if ((paramString != null) && (this.b.url_package.url != null))
        continue;
      this.c = new ViewLogPackage.Builder(this.b).build();
      return;
    }
    while ((paramString.equals(this.b.url_package.url)) || (TextUtils.equals(paramString.split("#")[0], this.b.url_package.url.split("#")[0])));
    this.c = new ViewLogPackage.Builder(this.b).build();
  }

  private boolean a(View paramView, boolean paramBoolean)
  {
    a(paramView, ViewLogPackage.Element.PAGE, null, null);
    if (paramBoolean)
    {
      this.f = t(paramView);
      if (this.f != null)
        break label119;
    }
    label119: ViewLogPackage.Builder localBuilder;
    LogReportEvent.Builder localBuilder1;
    EventPackage.Builder localBuilder2;
    ShowEvent.Builder localBuilder3;
    do
    {
      return false;
      this.f = new z(0);
      z.a(this.f, g(paramView));
      z.a(this.f, h(paramView));
      z.a(this.f, i(paramView));
      z.a(this.f, j(paramView));
      if ((z.a(this.f) != null) || (z.b(this.f) != null))
        break;
      this.f = null;
      return false;
      localBuilder = a(paramView, true, null);
      localBuilder1 = new LogReportEvent.Builder();
      localBuilder2 = new EventPackage.Builder();
      localBuilder3 = new ShowEvent.Builder();
    }
    while ((localBuilder.url_package == null) || (TextUtils.isEmpty(localBuilder.url_package.url)) || ((this.e != null) && (this.e.url_package != null) && (this.e.url_package.url != null) && (this.e.url_package.url.equals(localBuilder.url_package.url))));
    a(localBuilder.url_package.url);
    this.d = new ViewLogPackage.Builder(this.e).build();
    this.e = localBuilder.build();
    localBuilder3.type(ShowEvent.Type.PAGE).view(localBuilder.build()).from_page(new ViewLogPackage.Builder(this.d).build()).refer_click(new ViewLogPackage.Builder(this.b).build()).from_click(new ViewLogPackage.Builder(this.c).build());
    localBuilder2.show_event(localBuilder3.build());
    localBuilder1.event_package(localBuilder2.build());
    localBuilder1.extra_package(n(paramView).build());
    this.a.onEvent(localBuilder1.real_time(Boolean.valueOf(true)));
    return true;
  }

  private static void b(View paramView, List<View> paramList)
  {
    ViewGroup localViewGroup;
    if ((paramView instanceof ViewGroup))
    {
      localViewGroup = (ViewGroup)paramView;
      if (!(localViewGroup instanceof ViewPager))
        break label43;
      View localView2 = b.a((ViewPager)localViewGroup);
      if (localView2 != null)
        paramList.add(localView2);
    }
    while (true)
    {
      return;
      label43: for (int i = 0; i < localViewGroup.getChildCount(); i++)
      {
        View localView1 = localViewGroup.getChildAt(i);
        if (v.s(localView1))
          continue;
        paramList.add(localView1);
      }
    }
  }

  private static void f()
  {
    if (Looper.getMainLooper() != Looper.myLooper())
      throw new IllegalStateException("Must be called in UI thread.");
  }

  private static z t(View paramView)
  {
    View localView1 = paramView.getRootView();
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(localView1);
    while (!localLinkedList.isEmpty())
    {
      View localView2 = (View)localLinkedList.remove(0);
      b(localView2, localLinkedList);
      UrlPackage.Vertical localVertical = v.g(localView2);
      ak localak = v.h(localView2);
      String str = v.i(localView2);
      List localList = j(localView2);
      if ((localak == null) && (str == null))
        continue;
      z localz = new z(0);
      z.a(localz, localVertical);
      z.a(localz, str);
      z.a(localz, localak);
      z.a(localz, localList);
      return localz;
    }
    return null;
  }

  public final void a()
  {
    LogReportEvent.Builder localBuilder = new LogReportEvent.Builder();
    EventPackage.Builder localBuilder1 = new EventPackage.Builder();
    localBuilder1.active_event(new ApplicationActiveEvent.Builder().build());
    localBuilder.event_package(localBuilder1.build());
    ExtraPackage.Builder localBuilder2 = new ExtraPackage.Builder();
    localBuilder2.device_package(this.a.a());
    localBuilder.extra_package(localBuilder2.build());
    this.a.onEvent(localBuilder.real_time(Boolean.valueOf(true)));
  }

  public final void a(Context paramContext)
  {
    if (!(paramContext instanceof Activity))
      return;
    f();
    a(((Activity)paramContext).getWindow().getDecorView(), true);
  }

  public final void a(View paramView)
  {
    f();
    a(paramView, false);
  }

  public final void a(View paramView1, View paramView2)
  {
    f();
    z localz = t(paramView1);
    if (localz == null)
      return;
    try
    {
      b.c(paramView2);
      ViewLogPackage.Builder localBuilder = a(paramView2, false, localz);
      LogReportEvent.Builder localBuilder1 = new LogReportEvent.Builder();
      EventPackage.Builder localBuilder2 = new EventPackage.Builder();
      ShowEvent.Builder localBuilder3 = new ShowEvent.Builder();
      localBuilder3.type(ShowEvent.Type.CARD).view(localBuilder.build()).from_page(new ViewLogPackage.Builder(this.d).build()).refer_click(new ViewLogPackage.Builder(this.b).build()).from_click(new ViewLogPackage.Builder(this.c).build());
      localBuilder2.show_event(localBuilder3.build());
      localBuilder1.event_package(localBuilder2.build());
      localBuilder1.extra_package(n(paramView2).build());
      this.a.onEvent(localBuilder1.real_time(Boolean.valueOf(true)));
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
    }
  }

  public final void a(ApplicationCrashEvent.Type paramType, String paramString)
  {
    ApplicationCrashEvent.Builder localBuilder = new ApplicationCrashEvent.Builder();
    localBuilder.detail(paramString).type(paramType);
    localBuilder.view(this.e);
    LogReportEvent.Builder localBuilder1 = new LogReportEvent.Builder();
    EventPackage.Builder localBuilder2 = new EventPackage.Builder();
    localBuilder2.crash_event(localBuilder.build());
    localBuilder1.event_package(localBuilder2.build());
    ExtraPackage.Builder localBuilder3 = new ExtraPackage.Builder();
    localBuilder3.device_package(this.a.a());
    localBuilder1.extra_package(localBuilder3.build());
    if (paramType == ApplicationCrashEvent.Type.ANR)
    {
      this.a.onEvent(localBuilder1.real_time(Boolean.valueOf(false)));
      return;
    }
    this.a.onEventSync(localBuilder1);
  }

  public final void a(ConsumptionEvent.Builder paramBuilder, ExtraPackage.Builder paramBuilder1)
  {
    paramBuilder.view(this.e).from_page(this.d);
    LogReportEvent.Builder localBuilder = new LogReportEvent.Builder();
    EventPackage.Builder localBuilder1 = new EventPackage.Builder();
    localBuilder1.consumption_event(paramBuilder.build());
    localBuilder.event_package(localBuilder1.build());
    localBuilder.extra_package(paramBuilder1.build());
    this.a.onEvent(localBuilder.real_time(Boolean.valueOf(true)));
  }

  public final void a(ConsumptionEvent.Builder paramBuilder, ExtraPackage.Builder paramBuilder1, ViewLogPackage paramViewLogPackage)
  {
    paramBuilder.view(paramViewLogPackage).from_page(this.d);
    LogReportEvent.Builder localBuilder = new LogReportEvent.Builder();
    EventPackage.Builder localBuilder1 = new EventPackage.Builder();
    localBuilder1.consumption_event(paramBuilder.build());
    localBuilder.event_package(localBuilder1.build());
    localBuilder.extra_package(paramBuilder1.build());
    this.a.onEvent(localBuilder.real_time(Boolean.valueOf(true)));
  }

  public final void a(LaunchSourcePackage paramLaunchSourcePackage, ApplicationStartEvent paramApplicationStartEvent)
  {
    f();
    if (paramApplicationStartEvent.reason == ApplicationStartEvent.Reason.NEW)
    {
      this.b = null;
      this.c = null;
      this.d = null;
      d();
    }
    if (paramApplicationStartEvent.reason != ApplicationStartEvent.Reason.RESTART)
      this.a.a(paramLaunchSourcePackage);
    LogReportEvent.Builder localBuilder = new LogReportEvent.Builder();
    EventPackage.Builder localBuilder1 = new EventPackage.Builder();
    localBuilder1.start_event(paramApplicationStartEvent);
    localBuilder.event_package(localBuilder1.build());
    localBuilder.extra_package(new ExtraPackage.Builder().build());
    this.a.onEvent(localBuilder.real_time(Boolean.valueOf(true)));
  }

  public final void a(TaskEvent.Builder paramBuilder, ExtraPackage.Builder paramBuilder1)
  {
    LogReportEvent.Builder localBuilder = new LogReportEvent.Builder();
    EventPackage.Builder localBuilder1 = new EventPackage.Builder();
    localBuilder1.task_event(paramBuilder.build());
    localBuilder.event_package(localBuilder1.build());
    localBuilder.extra_package(paramBuilder1.build());
    this.a.onEvent(localBuilder.real_time(Boolean.valueOf(false)));
  }

  public final void b(View paramView)
  {
    f();
    a(paramView, ViewLogPackage.Element.PAGE, null, null);
    this.f = t(paramView);
    if (this.f == null);
    ViewLogPackage.Builder localBuilder;
    do
    {
      return;
      localBuilder = a(paramView, true, null);
    }
    while ((localBuilder.url_package == null) || (TextUtils.isEmpty(localBuilder.url_package.url)) || ((this.e != null) && (this.e.url_package != null) && (this.e.url_package.url != null) && (this.e.url_package.url.equals(localBuilder.url_package.url))));
    a(localBuilder.url_package.url);
    this.d = new ViewLogPackage.Builder(this.e).build();
    this.e = localBuilder.build();
  }

  public final void b(View paramView1, View paramView2)
  {
    f();
    z localz = t(paramView1);
    if (localz == null)
      return;
    try
    {
      b.c(paramView2);
      ViewLogPackage.Builder localBuilder = a(paramView2, false, localz);
      LogReportEvent.Builder localBuilder1 = new LogReportEvent.Builder();
      EventPackage.Builder localBuilder2 = new EventPackage.Builder();
      ClickEvent.Builder localBuilder3 = new ClickEvent.Builder();
      a(localBuilder.url_package.url);
      localBuilder3.click(localBuilder.build()).refer_click(new ViewLogPackage.Builder(this.b).build()).from_click(new ViewLogPackage.Builder(this.c).build());
      this.b = localBuilder.build();
      localBuilder2.click_event(localBuilder3.build());
      localBuilder1.event_package(localBuilder2.build());
      localBuilder1.extra_package(n(paramView2).build());
      this.a.onEvent(localBuilder1.real_time(Boolean.valueOf(true)));
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
    }
  }

  public final void c(View paramView)
  {
    f();
    try
    {
      b.c(paramView);
      ViewLogPackage.Builder localBuilder = a(paramView, false, null);
      LogReportEvent.Builder localBuilder1 = new LogReportEvent.Builder();
      EventPackage.Builder localBuilder2 = new EventPackage.Builder();
      ShowEvent.Builder localBuilder3 = new ShowEvent.Builder();
      localBuilder3.type(ShowEvent.Type.CARD).view(localBuilder.build()).from_page(new ViewLogPackage.Builder(this.d).build()).refer_click(new ViewLogPackage.Builder(this.b).build()).from_click(new ViewLogPackage.Builder(this.c).build());
      localBuilder2.show_event(localBuilder3.build());
      localBuilder1.event_package(localBuilder2.build());
      localBuilder1.extra_package(n(paramView).build());
      this.a.onEvent(localBuilder1.real_time(Boolean.valueOf(true)));
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
    }
  }

  public final void d()
  {
    f();
    this.f = null;
    this.e = null;
  }

  public final void d(View paramView)
  {
    f();
    try
    {
      b.c(paramView);
      ViewLogPackage.Builder localBuilder = a(paramView, false, null);
      LogReportEvent.Builder localBuilder1 = new LogReportEvent.Builder();
      EventPackage.Builder localBuilder2 = new EventPackage.Builder();
      ClickEvent.Builder localBuilder3 = new ClickEvent.Builder();
      a(localBuilder.url_package.url);
      localBuilder3.click(localBuilder.build()).refer_click(new ViewLogPackage.Builder(this.b).build()).from_click(new ViewLogPackage.Builder(this.c).build());
      this.b = localBuilder.build();
      localBuilder2.click_event(localBuilder3.build());
      localBuilder1.event_package(localBuilder2.build());
      localBuilder1.extra_package(n(paramView).build());
      this.a.onEvent(localBuilder1.real_time(Boolean.valueOf(true)));
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
    }
  }

  public final void e()
  {
    f();
    if (this.g != null)
    {
      this.e = this.g;
      this.f = this.h;
      this.g = null;
      this.h = null;
    }
  }

  public final void e(View paramView)
  {
    f();
    if (this.g != null);
    ViewLogPackage localViewLogPackage;
    z localz;
    do
    {
      return;
      localViewLogPackage = this.e;
      localz = this.f;
    }
    while (!a(paramView, true));
    this.g = localViewLogPackage;
    this.h = localz;
  }

  public final ViewLogPackage f(View paramView)
  {
    if (paramView == null);
    UrlPackage.Builder localBuilder;
    aa localaa;
    String str;
    al localal;
    ViewLogPackage.IndexPackage localIndexPackage;
    ViewLogPackage.Builder localBuilder1;
    do
    {
      y localy;
      z localz;
      do
      {
        return null;
        localy = new y(0);
        localBuilder = new UrlPackage.Builder();
        localz = new z(0);
        z.a(localz, g(paramView));
        z.a(localz, h(paramView));
        z.a(localz, i(paramView));
        z.a(localz, j(paramView));
      }
      while ((z.a(localz) == null) && (z.b(localz) == null));
      if ((z.a(localz) != null) && (!TextUtils.isEmpty(z.a(localz).a())))
        y.a(localy, z.a(localz));
      if (!TextUtils.isEmpty(z.b(localz)))
        y.a(localy, z.b(localz));
      if (z.c(localz) != null)
        y.a(localy, z.c(localz));
      if (z.d(localz) != null)
        localBuilder.vertical(z.d(localz));
      localaa = y.a(localy);
      str = k(paramView);
      localal = l(paramView);
      localIndexPackage = m(paramView);
      localBuilder1 = new ViewLogPackage.Builder();
    }
    while (localal == null);
    localBuilder1.module(str).name(localal.c).action(localal.b).element(localal.a).value(localal.d).url_package(localBuilder.url(localaa.a).normalized_url(localaa.b).build());
    if (localIndexPackage != null)
      localBuilder1.index(localIndexPackage);
    return localBuilder1.build();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.x
 * JD-Core Version:    0.6.0
 */