package com.wandoujia.ripple_framework.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.b;
import android.support.v4.app.r;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.cg;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.ActivityLeakUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.util.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BaseActivity extends FragmentActivity
  implements r, com.wandoujia.logv3.toolkit.h, com.wandoujia.ripple_framework.model.h, com.wandoujia.ripple_framework.navigation.c, com.wandoujia.ripple_framework.util.q
{
  private static final String JUPITER_PACKAGE_NAME = "com.wandoujia.phoenix2";
  private static final String NEPTUNE_PACKAGE_NAME = "com.wandoujia.neptune";
  private static final String RIPPLE_PACKAGE_NAME = "com.wandoujia";
  protected Map<String, com.wandoujia.nirvana.framework.network.page.a> allList = new HashMap();
  protected View currentPopPage;
  private a listener$f39a40a = new a(this, 0);
  protected View rootView;
  protected m systemBarTintManager;

  private void debug(String paramString)
  {
    Log.d(getClass().getSimpleName(), paramString, new Object[0]);
  }

  private void setBrightness()
  {
    int i = SystemUtil.getScreenBrightness(this);
    float f1 = i / 255.0F;
    float f2 = 1.0F - 0.5F * i / 255.0F;
    if ("Night".equals(i.k().e()))
    {
      setWindowBrightness(this, f1 * f2);
      return;
    }
    setWindowBrightness(this, i);
  }

  public static void setWindowBrightness(Activity paramActivity, float paramFloat)
  {
    setWindowBrightness(paramActivity.getWindow(), paramFloat);
  }

  public static void setWindowBrightness(Window paramWindow, float paramFloat)
  {
    WindowManager.LayoutParams localLayoutParams = paramWindow.getAttributes();
    localLayoutParams.screenBrightness = paramFloat;
    paramWindow.setAttributes(localLayoutParams);
  }

  private void traverseThemable(View paramView)
  {
    int i = 0;
    if ((paramView instanceof com.wandoujia.ripple_framework.theme.c))
      ((com.wandoujia.ripple_framework.theme.c)paramView).a();
    if ((paramView instanceof RecyclerView))
    {
      ((RecyclerView)paramView).setItemViewCacheSize(0);
      ((RecyclerView)paramView).getRecycledViewPool().a();
      ((RecyclerView)paramView).setItemViewCacheSize(2);
    }
    if ((paramView instanceof ViewGroup))
    {
      int j = ((ViewGroup)paramView).getChildCount();
      while (i < j)
      {
        traverseThemable(((ViewGroup)paramView).getChildAt(i));
        i++;
      }
    }
  }

  public com.wandoujia.nirvana.framework.network.page.a addList(com.wandoujia.nirvana.framework.network.page.a parama)
  {
    if (this.allList.containsKey(parama.a()))
    {
      debug("Add list success, hit cache, " + parama.a());
      return (com.wandoujia.nirvana.framework.network.page.a)this.allList.get(parama.a());
    }
    debug("Add list success, miss cache, " + parama.a());
    this.allList.put(parama.a(), parama);
    return parama;
  }

  protected void applyTheme()
  {
    b.a(getWindow(), R.color.bg_default);
  }

  public void clearList()
  {
    Iterator localIterator = this.allList.entrySet().iterator();
    while (localIterator.hasNext())
      ((com.wandoujia.nirvana.framework.network.page.a)((Map.Entry)localIterator.next()).getValue()).l();
    this.allList.clear();
  }

  protected Intent createBackIntent()
  {
    if (getClass().equals(com.wandoujia.ripple_framework.h.j().i()))
      return null;
    Intent localIntent = new Intent(this, com.wandoujia.ripple_framework.h.j().i());
    localIntent.addFlags(268435456);
    localIntent.addFlags(32768);
    localIntent.putExtra("is_back_intent", true);
    return localIntent;
  }

  protected boolean customSystemTintBar()
  {
    return ("com.wandoujia".equalsIgnoreCase(getPackageName())) || ("com.wandoujia.neptune".equalsIgnoreCase(getPackageName()));
  }

  public BaseFragment findCurrentFragment()
  {
    return (BaseFragment)getSupportFragmentManager().a(16908290);
  }

  public com.wandoujia.nirvana.framework.network.page.a findList(String paramString)
  {
    return (com.wandoujia.nirvana.framework.network.page.a)this.allList.get(paramString);
  }

  public ViewLogPackage getCurrentPagePackage()
  {
    if (this.currentPopPage != null)
      return com.wandoujia.ripple_framework.h.j().h().f(this.currentPopPage);
    BaseFragment localBaseFragment = findCurrentFragment();
    if (localBaseFragment != null)
    {
      View localView = ((BaseFragment)localBaseFragment).getPageView();
      if (localView != null)
        return com.wandoujia.ripple_framework.h.j().h().f(localView);
    }
    return null;
  }

  protected String getIntentUri()
  {
    Intent localIntent = getIntent();
    if (localIntent != null)
    {
      if (!TextUtils.isEmpty(localIntent.getDataString()))
        return localIntent.getDataString();
      return localIntent.getStringExtra("page_intent_uri");
    }
    return null;
  }

  protected int getSystemBarColor()
  {
    try
    {
      int i = getResources().getColor(b.m(R.color.system_bar_color));
      return i;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
    }
    return 0;
  }

  public m getSystemBarTintManager()
  {
    return this.systemBarTintManager;
  }

  public boolean navigateTo(String paramString)
  {
    return navigateTo(paramString, 16908290);
  }

  protected boolean navigateTo(String paramString, int paramInt)
  {
    Fragment localFragment = getSupportFragmentManager().a(paramInt);
    return ((localFragment instanceof com.wandoujia.ripple_framework.navigation.c)) && (localFragment.isVisible()) && (((com.wandoujia.ripple_framework.navigation.c)localFragment).navigateTo(paramString));
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.rootView = findViewById(16908290);
    if (("com.wandoujia".equals(GlobalConfig.getAppContext().getPackageName())) || ("com.wandoujia.neptune".equals(GlobalConfig.getAppContext().getPackageName())))
    {
      applyTheme();
      setBrightness();
    }
    ((de.greenrobot.event.c)i.k().a("event_bus")).a(this.listener$f39a40a);
  }

  public void onBackPressed()
  {
    BaseFragment localBaseFragment = findCurrentFragment();
    if ((localBaseFragment == null) || (!localBaseFragment.onBackPressed()))
      try
      {
        if (("com.wandoujia.phoenix2".equalsIgnoreCase(getPackageName())) && (isTaskRoot()))
        {
          Intent localIntent = createBackIntent();
          if (localIntent != null)
          {
            startActivity(localIntent);
            finish();
            return;
          }
        }
        super.onBackPressed();
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
      }
  }

  public void onBackStackChanged()
  {
    if (this.systemBarTintManager == null);
    BaseFragment localBaseFragment;
    do
    {
      return;
      localBaseFragment = findCurrentFragment();
    }
    while (localBaseFragment == null);
    localBaseFragment.renderSystemBar(true);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    v.b().a(this, getIntent(), paramBundle);
    getSupportFragmentManager().a(this);
    if ((customSystemTintBar()) && (SystemUtil.aboveApiLevel(19)))
    {
      this.systemBarTintManager = new m(this);
      this.systemBarTintManager.a(getSystemBarColor());
    }
    pageLoaded();
  }

  protected void onDestroy()
  {
    super.onDestroy();
    clearList();
    v.b().a(this);
    getSupportFragmentManager().b(this);
    ActivityLeakUtil.fixInputMethodManagerLeak(this);
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ((de.greenrobot.event.c)i.k().a("event_bus")).c(this.listener$f39a40a);
  }

  public void onLogCardShow(View paramView)
  {
    if (this.currentPopPage != null)
      com.wandoujia.ripple_framework.h.j().h().b(this.currentPopPage, paramView);
    View localView;
    do
    {
      BaseFragment localBaseFragment;
      do
      {
        return;
        localBaseFragment = findCurrentFragment();
      }
      while (localBaseFragment == null);
      localView = ((BaseFragment)localBaseFragment).getPageView();
    }
    while (localView == null);
    com.wandoujia.ripple_framework.h.j().h().b(localView, paramView);
  }

  public void onLogClick(View paramView)
  {
    if (this.currentPopPage != null)
      com.wandoujia.ripple_framework.h.j().h().a(this.currentPopPage, paramView);
    View localView;
    do
    {
      BaseFragment localBaseFragment;
      do
      {
        return;
        localBaseFragment = findCurrentFragment();
      }
      while (localBaseFragment == null);
      localView = localBaseFragment.getPageView();
    }
    while (localView == null);
    com.wandoujia.ripple_framework.h.j().h().a(localView, paramView);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    v.b().a(this, getIntent());
  }

  public void onPageLoaded()
  {
    this.currentPopPage = null;
    BaseFragment localBaseFragment = findCurrentFragment();
    if (localBaseFragment != null)
    {
      View localView = localBaseFragment.getPageView();
      if (localView != null)
        com.wandoujia.ripple_framework.h.j().h().a(localView);
    }
  }

  protected void onPause()
  {
    super.onPause();
  }

  protected void onRestart()
  {
    super.onRestart();
    v.b().b(this, getIntent());
  }

  protected void onResume()
  {
    super.onResume();
    updateCurrentPage();
    de.greenrobot.event.c localc = (de.greenrobot.event.c)com.wandoujia.ripple_framework.h.j().a("event_bus");
    if (localc != null)
      localc.d(new j(EventBusManager.Type.APP_IN_FOREGROUND, null));
  }

  protected void onStart()
  {
    super.onStart();
  }

  protected void onUserLeaveHint()
  {
    super.onUserLeaveHint();
    v.b().b(this);
  }

  protected void pageLoaded()
  {
    onPageLoaded();
  }

  public void popPopupWindow()
  {
    this.currentPopPage = null;
  }

  public void pushPopupWindow(View paramView)
  {
    com.wandoujia.ripple_framework.h.j().h().a(paramView, ViewLogPackage.Element.PAGE, ViewLogPackage.Action.POPUP);
    if (com.wandoujia.ripple_framework.h.j().h().f(paramView) != null)
      this.currentPopPage = paramView;
  }

  public com.wandoujia.nirvana.framework.network.page.a removeList(String paramString)
  {
    return (com.wandoujia.nirvana.framework.network.page.a)this.allList.remove(paramString);
  }

  public void updateCurrentPage()
  {
    this.currentPopPage = null;
    BaseFragment localBaseFragment = findCurrentFragment();
    if (localBaseFragment != null)
    {
      View localView = localBaseFragment.getPageView();
      if (localView != null)
        com.wandoujia.ripple_framework.h.j().h().b(localView);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.activity.BaseActivity
 * JD-Core Version:    0.6.0
 */