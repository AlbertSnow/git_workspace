package com.wandoujia.ripple_framework.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.logv3.toolkit.ak;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.drawable;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.h;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.theme.ThemeType;
import com.wandoujia.ripple_framework.util.m;
import com.wandoujia.ripple_framework.util.p;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.bj;
import java.util.ArrayList;

public abstract class BaseFragment extends Fragment
{
  public static final String EXTRA_INTENT_URI = "page_intent_uri";
  public static final String EXTRA_NAVIGATE_URI = "navigate_uri";
  public static final String EXTRA_TITLE = "title";
  public static final String EXTRA_URI_PARAM = "page_uri_param";
  private static final String JUPITER_PACKAGE_NAME = "com.wandoujia.phoenix2";
  public static final String KEY_FORCE_CLOSE_TOOLBAR = "force_close_toolbar";
  private static final String KEY_TOOLBAR_Y = "toolbar_y";
  private static final String RIPPLE_PACKAGE_NAME = "com.wandoujia";
  private com.wandoujia.nirvana.framework.ui.a themeCardPresenter;
  protected String title;
  protected Toolbar toolbar;
  protected ViewGroup toolbarContainer;
  protected View toolbarDeco;
  protected View toolbarMargin;
  protected int toolbarScrollerY;
  protected bj toolbarViewBinder;
  protected boolean windowTranslucentStatus = false;

  private m getSystemBarTintManager()
  {
    if (!(getActivity() instanceof com.wandoujia.ripple_framework.util.q))
      return null;
    return ((com.wandoujia.ripple_framework.util.q)getActivity()).getSystemBarTintManager();
  }

  protected final ViewGroup createToolbarMenu(int paramInt)
  {
    if (this.toolbar == null)
      return null;
    ViewGroup localViewGroup = (ViewGroup)android.support.v4.app.b.b(getActivity(), paramInt);
    this.toolbar.addView(localViewGroup);
    return localViewGroup;
  }

  protected final bj createToolbarViewBinder(ObservableRecyclerView paramObservableRecyclerView)
  {
    if (this.toolbar == null)
      return null;
    this.toolbarViewBinder = new bj();
    paramObservableRecyclerView.a(new d(this, paramObservableRecyclerView));
    return this.toolbarViewBinder;
  }

  protected void finish()
  {
    if (!isAdded())
      return;
    try
    {
      getActivity().getSupportFragmentManager().c();
      return;
    }
    catch (Exception localException)
    {
      getActivity().finish();
    }
  }

  public ViewLogPackage getCurrentPagePackage()
  {
    View localView = getPageView();
    if (localView != null)
      return h.j().h().f(localView);
    return null;
  }

  protected CharSequence getDefaultTitle()
  {
    return getActivity().getTitle();
  }

  protected int getNavigationIcon()
  {
    return R.drawable.back_black;
  }

  public String getPageUri()
  {
    return null;
  }

  public View getPageView()
  {
    View localView = getView();
    if (localView == null);
    ak localak;
    String str;
    do
    {
      return null;
      localak = v.h(localView);
      str = v.i(localView);
    }
    while ((localak == null) && (str == null));
    return localView;
  }

  public com.wandoujia.ripple_framework.theme.a getThemePresenter()
  {
    return new com.wandoujia.ripple_framework.theme.a().a(R.id.toolbar, ThemeType.BACKGROUND, R.color.bg_default).a(R.id.toolbar_deco, ThemeType.BACKGROUND, R.color.divider).a(new b(this));
  }

  protected Toolbar getToolbar()
  {
    for (Object localObject = this; ((Fragment)localObject).getParentFragment() != null; localObject = ((Fragment)localObject).getParentFragment());
    if ((localObject instanceof BaseFragment))
      return ((BaseFragment)localObject).toolbar;
    return (Toolbar)null;
  }

  @Deprecated
  protected boolean initializePageUri(View paramView)
  {
    if (getArguments() == null);
    String str;
    do
    {
      return false;
      str = getArguments().getString("page_intent_uri");
    }
    while (str == null);
    ArrayList localArrayList = getArguments().getParcelableArrayList("page_uri_param");
    if (localArrayList == null)
      h.j().h().a(paramView, str);
    while (true)
    {
      return true;
      h.j().h().a(paramView, str, localArrayList);
    }
  }

  protected void initializeToolbar(View paramView, Bundle paramBundle)
  {
    int i;
    if ((getArguments() != null) && (getArguments().getBoolean("force_close_toolbar", false)))
    {
      i = 1;
      this.toolbarContainer = ((ViewGroup)paramView.findViewById(R.id.toolbar_container));
      this.toolbar = ((Toolbar)paramView.findViewById(R.id.toolbar));
      this.toolbarDeco = paramView.findViewById(R.id.toolbar_deco);
      this.toolbarMargin = paramView.findViewById(R.id.toolbar_margin);
      if ((this.toolbarMargin != null) && ((getActivity() instanceof com.wandoujia.ripple_framework.util.q)))
      {
        m localm = ((com.wandoujia.ripple_framework.util.q)getActivity()).getSystemBarTintManager();
        if ((localm != null) && (localm.a() != null))
          this.toolbarMargin.getLayoutParams().height = localm.a().b();
      }
      if (SystemUtil.aboveApiLevel(19))
      {
        TypedArray localTypedArray = getActivity().getTheme().obtainStyledAttributes(new int[] { 16843759 });
        this.windowTranslucentStatus = localTypedArray.getBoolean(0, false);
        localTypedArray.recycle();
      }
      setToolbarMarginVisibility(0);
      if (this.toolbar != null)
        break label197;
    }
    label197: label218: 
    do
    {
      do
      {
        return;
        i = 0;
        break;
        if (i == 0)
          break label218;
      }
      while (this.toolbarContainer == null);
      this.toolbarContainer.setVisibility(8);
      return;
      setTitle(getDefaultTitle());
      this.toolbar.setTitleTextColor(getResources().getColor(R.color.text_color_black));
      if (getNavigationIcon() == 0)
        continue;
      this.toolbar.setNavigationIcon(getNavigationIcon());
      this.toolbar.setNavigationOnClickListener(new c(this));
    }
    while (!GlobalConfig.getAppContext().getPackageName().startsWith("com.wandoujia.phoenix2"));
    this.toolbar.setNavigationIcon(R.drawable.ic_back_dark);
    this.toolbar.setBackgroundColor(getResources().getColor(R.color.green_primary));
    this.toolbar.setTitleTextColor(getResources().getColor(R.color.text_color_white));
  }

  protected boolean isSystemBarEnabled()
  {
    return false;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (((getActivity() instanceof BaseActivity)) && (((BaseActivity)getActivity()).findCurrentFragment() == this))
      renderSystemBar(false);
    if (this.themeCardPresenter != null)
      this.themeCardPresenter.a(null);
  }

  public boolean onBackPressed()
  {
    Log.d(getClass().getSimpleName(), "On back", new Object[0]);
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    if (this.themeCardPresenter != null)
      this.themeCardPresenter.a();
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putInt("toolbar_y", this.toolbarScrollerY);
  }

  public void onStart()
  {
    super.onStart();
    pageLoaded();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.themeCardPresenter = new com.wandoujia.nirvana.framework.ui.a(paramView);
    if ((getThemePresenter() != null) && ("com.wandoujia".equals(GlobalConfig.getAppContext().getPackageName())))
      this.themeCardPresenter.a(getThemePresenter());
    initializeToolbar(paramView, paramBundle);
    if ((getArguments() != null) && (!TextUtils.isEmpty(getArguments().getString("title"))))
      setTitle(getArguments().getString("title"));
  }

  public void onViewStateRestored(Bundle paramBundle)
  {
    super.onViewStateRestored(paramBundle);
    if (paramBundle != null)
    {
      this.toolbarScrollerY = paramBundle.getInt("toolbar_y", 0);
      if (this.toolbarViewBinder != null)
        this.toolbarViewBinder.a(this.toolbarScrollerY);
    }
  }

  @Deprecated
  protected final void pageLoaded()
  {
    if (!initializePageUri(getView()));
    FragmentActivity localFragmentActivity;
    do
    {
      return;
      localFragmentActivity = getActivity();
    }
    while (!(localFragmentActivity instanceof BaseActivity));
    ((BaseActivity)localFragmentActivity).onPageLoaded();
  }

  public void renderSystemBar(boolean paramBoolean)
  {
    m localm = getSystemBarTintManager();
    if (localm == null)
      return;
    localm.a(isSystemBarEnabled(), paramBoolean);
  }

  public void setSystemBarColor(int paramInt)
  {
    m localm = getSystemBarTintManager();
    if (localm == null)
      return;
    localm.a(paramInt);
  }

  protected void setTitle(CharSequence paramCharSequence)
  {
    Toolbar localToolbar = getToolbar();
    if (localToolbar != null)
      localToolbar.setTitle(paramCharSequence);
  }

  protected void setToolbarMarginVisibility(int paramInt)
  {
    if ((this.windowTranslucentStatus) && (this.toolbarMargin != null))
      this.toolbarMargin.setVisibility(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.fragment.BaseFragment
 * JD-Core Version:    0.6.0
 */