package com.wandoujia.jupiter.homepage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.account.listener.IAccountListener;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Image;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.activity.DexLoadingActivity;
import com.wandoujia.jupiter.homepage.splashwindow.SplashView;
import com.wandoujia.jupiter.search.model.SearchTypeForHint;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.p4.account.manager.d;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import com.wandoujia.ripple_framework.j;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.slidingtab.PagerSlidingTabStrip;
import java.util.Collections;
import java.util.List;

public class HomePageFragment extends BaseFragment
  implements com.wandoujia.ripple_framework.navigation.c
{
  private static final int a = JupiterApplication.e().getResources().getDimensionPixelSize(2131427691);
  private static final int b = android.support.v4.app.i.a(80.0F, JupiterApplication.e());
  private com.wandoujia.jupiter.search.view.a A;
  private int B;
  private boolean C = false;
  private boolean D;
  private final b E = new g(this);
  private final com.sina.weibo.sdk.api.share.i F = new h(this);
  private boolean c = true;
  private int d = 0;
  private final IAccountListener e = new w(this, 0);
  private View f;
  private View g;
  private ImageView h;
  private View i;
  private View j;
  private View k;
  private View l;
  private AsyncImageView m;
  private AsyncImageView n;
  private View o;
  private PagerSlidingTabStrip p;
  private ViewPager q;
  private c r;
  private com.wandoujia.ripple_framework.model.g s;
  private LinearLayout t;
  private SplashView u;
  private com.wandoujia.jupiter.homepage.a.a v;
  private boolean w = false;
  private TextView x;
  private boolean y = false;
  private String z;

  private void a(Model paramModel)
  {
    List localList = paramModel.v();
    if (localList.size() >= 3)
    {
      com.wandoujia.ripple_framework.i.k().a("splash_ad_cache");
      this.n.setImageLoadedListener(new q(this));
      this.m.e(com.wandoujia.jupiter.homepage.b.a.a(((Image)localList.get(0)).url), 2131361863);
      this.n.e(com.wandoujia.jupiter.homepage.b.a.a(((Image)localList.get(2)).url), 2131361863);
    }
    this.n.setOnClickListener(new s(paramModel));
    com.wandoujia.ripple_framework.i.k().h().a(Logger.Module.SPLASH, ViewLogPackage.Action.REDIRECT, "cover_show", Long.valueOf(1L), paramModel.a());
  }

  private void a(String paramString)
  {
    if (this.q == null)
      return;
    int i1;
    if ((this.s == null) || (CollectionUtils.isEmpty(this.s.c())))
      i1 = 0;
    while (true)
    {
      int i2;
      if ((!TextUtils.isEmpty(paramString)) && (!CollectionUtils.isEmpty(this.s.c())))
      {
        boolean bool = CollectionUtils.isEmpty(e());
        i2 = 0;
        if (bool);
      }
      while (true)
      {
        if (i2 < e().size())
        {
          Model localModel = a(i2);
          if ((localModel != null) && (localModel.t() != null) && (android.support.v4.app.b.j(localModel.t().intent, paramString)))
          {
            this.z = paramString;
            i1 = i2;
          }
        }
        else
        {
          this.q.setCurrentItem(i1);
          this.q.post(new n(this, i1));
          return;
          List localList = e();
          for (i1 = 0; ; i1++)
          {
            if (i1 >= localList.size())
              break label202;
            if (((Model)localList.get(i1)).g() == TemplateTypeEnum.TemplateType.DEFAULT_TAB)
              break;
          }
        }
        i2++;
      }
      label202: i1 = 0;
    }
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    Resources localResources = this.j.getContext().getResources();
    FrameLayout.LayoutParams localLayoutParams1 = (FrameLayout.LayoutParams)this.g.getLayoutParams();
    int i1;
    int i2;
    label48: int i3;
    label85: int i4;
    label122: int i5;
    label164: int i6;
    label199: int i7;
    label213: int i8;
    label229: int i9;
    int i10;
    label280: label291: int i11;
    label307: ImageView localImageView;
    if (paramBoolean2)
    {
      i1 = com.wandoujia.jupiter.homepage.splashwindow.k.g();
      localLayoutParams1.topMargin = i1;
      if (!paramBoolean1)
        break label357;
      i2 = com.wandoujia.jupiter.homepage.splashwindow.k.b();
      localLayoutParams1.height = i2;
      this.g.setLayoutParams(localLayoutParams1);
      FrameLayout.LayoutParams localLayoutParams2 = (FrameLayout.LayoutParams)this.t.getLayoutParams();
      if (!paramBoolean2)
        break label370;
      i3 = com.wandoujia.jupiter.homepage.splashwindow.k.g();
      localLayoutParams2.topMargin = i3;
      this.t.setLayoutParams(localLayoutParams2);
      FrameLayout.LayoutParams localLayoutParams3 = (FrameLayout.LayoutParams)this.o.getLayoutParams();
      if (!paramBoolean1)
        break label376;
      i4 = 2131427687;
      localLayoutParams3.height = (int)localResources.getDimension(i4);
      this.o.setLayoutParams(localLayoutParams3);
      FrameLayout.LayoutParams localLayoutParams4 = (FrameLayout.LayoutParams)this.l.getLayoutParams();
      if (!paramBoolean1)
        break label384;
      i5 = com.wandoujia.jupiter.homepage.splashwindow.k.b();
      localLayoutParams4.height = i5;
      this.l.setLayoutParams(localLayoutParams4);
      FrameLayout.LayoutParams localLayoutParams5 = (FrameLayout.LayoutParams)this.j.getLayoutParams();
      if (!paramBoolean1)
        break label397;
      i6 = 0;
      localLayoutParams5.bottomMargin = i6;
      i7 = 0;
      if (!paramBoolean1)
        break label409;
      localLayoutParams5.rightMargin = i7;
      if (!paramBoolean1)
        break label422;
      i8 = 2131427704;
      localLayoutParams5.topMargin = (int)localResources.getDimension(i8);
      this.j.setLayoutParams(localLayoutParams5);
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.x.getLayoutParams();
      i9 = (int)localResources.getDimension(2131427849);
      if (!paramBoolean1)
        break label430;
      i10 = i9;
      localLayoutParams.leftMargin = i10;
      if (!paramBoolean1)
        break label443;
      localLayoutParams.rightMargin = i9;
      if (!paramBoolean1)
        break label456;
      i11 = 2131427688;
      localLayoutParams.topMargin = (int)localResources.getDimension(i11);
      this.x.setLayoutParams(localLayoutParams);
      localImageView = this.h;
      if (!paramBoolean1)
        break label464;
    }
    label384: label397: label409: label422: label430: label443: label456: label464: for (int i12 = 2130838323; ; i12 = 2130838322)
    {
      localImageView.setImageResource(i12);
      return;
      i1 = 0;
      break;
      label357: i2 = (int)localResources.getDimension(2131427686);
      break label48;
      label370: i3 = 0;
      break label85;
      label376: i4 = 2131427683;
      break label122;
      i5 = (int)localResources.getDimension(2131427686);
      break label164;
      i6 = (int)localResources.getDimension(2131427691);
      break label199;
      i7 = (int)localResources.getDimension(2131427694);
      break label213;
      i8 = 2131427685;
      break label229;
      i10 = (int)localResources.getDimension(2131427721);
      break label280;
      i9 = (int)localResources.getDimension(2131427850);
      break label291;
      i11 = 2131427684;
      break label307;
    }
  }

  private void d()
  {
    com.wandoujia.jupiter.p localp = new com.wandoujia.jupiter.p("http://apis.wandoujia.com/five/v1/index?format=proto", com.wandoujia.jupiter.util.a.a());
    localp.a(com.wandoujia.jupiter.util.a.a);
    this.s = localp;
    this.s.a(new m(this));
    this.s.i();
  }

  private List<Model> e()
  {
    if ((this.s != null) && (!CollectionUtils.isEmpty(this.s.c())))
      return ((Model)this.s.c().get(0)).B();
    return Collections.EMPTY_LIST;
  }

  private static int f()
  {
    if (com.wandoujia.jupiter.homepage.splashwindow.k.j())
      return com.wandoujia.jupiter.homepage.splashwindow.k.m();
    return a.e();
  }

  private void g()
  {
    this.w = false;
    this.r = null;
    d();
  }

  public final int a()
  {
    return this.B;
  }

  public final Model a(int paramInt)
  {
    return (Model)e().get(paramInt);
  }

  public final void a(Intent paramIntent)
  {
    String str2;
    String str1;
    if (paramIntent != null)
    {
      Bundle localBundle = paramIntent.getExtras();
      str2 = null;
      if (localBundle != null)
        str2 = paramIntent.getExtras().getString("page_intent_uri");
      if ((TextUtils.isEmpty(str2)) && (paramIntent.getData() != null))
        str1 = paramIntent.getDataString();
    }
    while (true)
    {
      if (str1 != null);
      for (boolean bool = true; ; bool = false)
      {
        getArguments().putBoolean("CAN_SHOW_SPLASH_WINDOW", bool);
        if (!TextUtils.isEmpty(str1))
          a(str1);
        return;
      }
      str1 = str2;
      continue;
      str1 = null;
    }
  }

  public View getPageView()
  {
    if ((this.r == null) || (this.q == null))
      return null;
    Fragment localFragment = this.r.e(this.q.getCurrentItem());
    if ((localFragment instanceof BaseFragment))
      return ((BaseFragment)localFragment).getPageView();
    return null;
  }

  protected boolean initializePageUri(View paramView)
  {
    return false;
  }

  public boolean navigateTo(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
      this.z = paramString;
    com.wandoujia.ripple_framework.i.k().a("navigation");
    ViewPager localViewPager = this.q;
    List localList = e();
    int i1 = 0;
    if (localList != null);
    for (int i2 = 0; ; i2++)
    {
      int i3 = localList.size();
      i1 = 0;
      if (i2 < i3)
      {
        Model localModel = (Model)localList.get(i2);
        if ((paramString == null) || (localModel.t() == null) || (!android.support.v4.app.b.j(paramString, localModel.t().intent)))
          continue;
        localViewPager.setCurrentItem(i2);
        i1 = 1;
      }
      return i1;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    d.a().d().a(this.e);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return android.support.v4.app.b.a(paramViewGroup, 2130903311);
  }

  public void onDestroy()
  {
    d.a().d().b(this.e);
    super.onDestroy();
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    ((de.greenrobot.event.c)com.wandoujia.ripple_framework.i.k().a("event_bus")).c(this);
    if (this.A != null)
      this.A.c();
  }

  public void onEventMainThread(j paramj)
  {
    if ((paramj.a == EventBusManager.Type.HOMEPAGE_REFRESH) || (EventBusManager.Type.DROP_ALL_SUBSCRIPTION.equals(paramj.a)) || (paramj.a == EventBusManager.Type.NEW_FOLLOW_USER))
      g();
  }

  public void onResume()
  {
    super.onResume();
    if (this.C)
    {
      this.q.post(new f(this));
      this.C = false;
    }
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    if (getArguments() != null)
      this.z = getArguments().getString("page_intent_uri");
    this.g = paramView.findViewById(2131493682);
    this.f = paramView.findViewById(2131493683);
    this.q = ((ViewPager)paramView.findViewById(2131493142));
    this.p = ((PagerSlidingTabStrip)paramView.findViewById(2131493688));
    this.x = ((TextView)paramView.findViewById(2131493685));
    this.j = paramView.findViewById(2131493681);
    this.i = paramView.findViewById(2131493687);
    this.h = ((ImageView)paramView.findViewById(2131493686));
    this.k = paramView.findViewById(2131493605);
    this.l = paramView.findViewById(2131493677);
    this.n = ((AsyncImageView)paramView.findViewById(2131493679));
    this.m = ((AsyncImageView)paramView.findViewById(2131493678));
    this.t = ((LinearLayout)paramView.findViewById(2131493676));
    this.u = ((SplashView)paramView.findViewById(2131493680));
    this.o = paramView.findViewById(2131493684);
    this.h.setOnClickListener(new o(this));
    Bundle localBundle = getArguments();
    boolean bool;
    if ((localBundle != null) && (localBundle.getBoolean("CAN_SHOW_SPLASH_WINDOW")) && (com.wandoujia.jupiter.homepage.splashwindow.k.j()))
    {
      bool = true;
      this.D = bool;
      if (this.D)
        break label409;
      com.wandoujia.jupiter.homepage.splashwindow.k.a(false);
      if (!com.wandoujia.jupiter.homepage.splashwindow.k.j())
        break label391;
      a(true, false);
      Model localModel2 = com.wandoujia.jupiter.homepage.splashwindow.k.k();
      if (localModel2 != null)
        a(localModel2);
    }
    while (true)
    {
      d();
      this.x.setOnClickListener(new k(this));
      this.A = new com.wandoujia.jupiter.search.view.a(JupiterApplication.e(), this.x, true);
      this.A.a(SearchTypeForHint.STARTPAGE);
      ((de.greenrobot.event.c)com.wandoujia.ripple_framework.i.k().a("event_bus")).a(this);
      this.q.a(new l(this));
      DexLoadingActivity.a(paramView.getContext());
      return;
      bool = false;
      break;
      label391: a(false, false);
      this.n.setVisibility(8);
      continue;
      label409: this.u.setVisibility(0);
      ViewHelper.setAlpha(this.o, 0.0F);
      this.o.setVisibility(8);
      this.j.setVisibility(8);
      ViewHelper.setAlpha(this.j, 0.0F);
      ViewHelper.setAlpha(this.k, 0.0F);
      ViewHelper.setAlpha(this.p, 0.0F);
      if (this.v != null)
        ViewHelper.setAlpha(this.v.c_(), 0.0F);
      com.wandoujia.jupiter.homepage.splashwindow.k.a(true);
      com.wandoujia.jupiter.homepage.splashwindow.k.e();
      a(true, true);
      this.u.setScrollListener(new p(this));
      Model localModel1 = com.wandoujia.jupiter.homepage.splashwindow.k.k();
      if (localModel1 == null)
        continue;
      this.u.setModel(localModel1);
      a(localModel1);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.HomePageFragment
 * JD-Core Version:    0.6.0
 */