package com.wandoujia.jupiter.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.by;
import android.support.v7.widget.cc;
import android.support.v7.widget.cf;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout.LayoutParams;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.AnimatorSet.Builder;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.jupiter.app.model.AppType;
import com.wandoujia.jupiter.presenter.eu;
import com.wandoujia.jupiter.toolbar.JupiterToolbar;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.navigation.b;
import com.wandoujia.ripple_framework.view.Anchor;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import com.wandoujia.ripple_framework.view.SwipeBackContainer;
import com.wandoujia.ripple_framework.view.bj;

public class DetailFragment extends ListFragment
{
  private int A;
  private com.wandoujia.nirvana.framework.ui.recycler.g B;
  private cf C = new d(this);
  private final LocalAppChangedListener D = new r(this);
  private View b;
  private View c;
  private SwipeBackContainer m;
  private int n;
  private boolean o;
  private boolean p;
  private String q;
  private ab r;
  private Anchor s;
  private String t;
  private int u;
  private View v;
  private boolean w = false;
  private JupiterToolbar x;
  private ViewGroup y;
  private View z;

  public static DetailFragment a(String paramString1, Anchor paramAnchor, String paramString2, int paramInt, String paramString3, String paramString4)
  {
    DetailFragment localDetailFragment = new DetailFragment();
    if (TextUtils.isEmpty(paramString4))
      paramString4 = "wdj://apps/" + paramString1;
    if (TextUtils.isEmpty(paramString3))
      paramString3 = String.format("http://apis.wandoujia.com/apps/v1/%s", new Object[] { paramString1 });
    Bundle localBundle = a(paramString4, paramString3, null);
    localBundle.putString("packageName", paramString1);
    localBundle.putParcelable("anchor", paramAnchor);
    localBundle.putString("iconUrl", paramString2);
    localBundle.putInt("iconBitmapKey", paramInt);
    localDetailFragment.setArguments(localBundle);
    return localDetailFragment;
  }

  private boolean r()
  {
    if ((this.j == null) || (CollectionUtils.isEmpty(this.j.c())))
      return false;
    Boolean localBoolean = (Boolean)((Model)this.j.a(0)).a(2131492906);
    if (localBoolean == null)
      return true;
    return localBoolean.booleanValue();
  }

  private void s()
  {
    this.m.a();
    this.g.b(this.C);
    this.toolbarViewBinder.a(null);
    if (this.r != null)
      this.r.b(false);
  }

  private void t()
  {
    if (this.v == null);
    ViewGroup localViewGroup;
    do
    {
      return;
      localViewGroup = (ViewGroup)this.v.getParent();
    }
    while (localViewGroup == null);
    localViewGroup.removeView(this.v);
    this.v = null;
  }

  protected final int a()
  {
    return 2130903288;
  }

  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    z localz = new z(paramString);
    localz.a(false);
    return localz;
  }

  public final void a(DataLoadListener.Op paramOp, com.wandoujia.nirvana.framework.network.page.g<Model> paramg)
  {
    super.a(paramOp, paramg);
    if (CollectionUtils.isEmpty(this.j.c()))
      return;
    this.h.a(true);
    if (!this.w)
      t();
    if (!this.p)
    {
      this.p = true;
      this.B = new g(this, (ViewGroup)android.support.v4.app.d.a(this.g, 2130903292));
      ((com.wandoujia.jupiter.a.d)this.g.getAdapter()).a(this.B);
      this.g.getAdapter().b();
    }
    Model localModel = (Model)this.j.a(0);
    this.B.a(localModel);
    com.wandoujia.nirvana.framework.ui.a locala;
    if ((localModel.f() == ContentTypeEnum.ContentType.APP) && (localModel.g() == TemplateTypeEnum.TemplateType.DETAIL_HEADER))
    {
      setTitle(localModel.n());
      if ((this.x != null) && (this.x.getListener() != null))
        this.x.getListener().a(localModel);
      locala = (com.wandoujia.nirvana.framework.ui.a)this.y.getTag(2131492995);
      if (locala != null)
        break label445;
      locala = com.wandoujia.jupiter.presenter.aa.a(this.y, null).b(2131492972, new eu(true));
      this.y.setTag(2131492995, locala);
    }
    while (true)
    {
      locala.a(localModel);
      if ((!this.j.b()) && (!this.o) && (r()))
      {
        this.o = true;
        n localn = new n((ViewGroup)android.support.v4.app.d.a(this.g, 2130903287), localModel);
        ((com.wandoujia.jupiter.a.d)this.g.getAdapter()).b(localn);
        this.g.getAdapter().b();
        TaskEvent.Builder localBuilder = new TaskEvent.Builder();
        localBuilder.action(TaskEvent.Action.VIEW_EVENT);
        localBuilder.view_log_package(new ViewLogPackage.Builder().action(ViewLogPackage.Action.REDIRECT).module(Logger.Module.UI.name().toLowerCase()).name("detail_feedback").element(ViewLogPackage.Element.CARD).value(Long.valueOf(0L)).build());
        ExtraPackage.Builder localBuilder1 = new ExtraPackage.Builder();
        localBuilder1.content_package(new ContentPackage.Builder().identity(this.q).title(this.title).build());
        com.wandoujia.ripple_framework.i.k().h().a(localBuilder, localBuilder1);
      }
      pageLoaded();
      return;
      label445: locala.a();
    }
  }

  protected final cc b()
  {
    return new aa(g());
  }

  public final int c()
  {
    return 0;
  }

  public final String d()
  {
    return this.k;
  }

  protected void finish()
  {
    if (getActivity() != null)
    {
      this.m.setEnabled(false);
      getActivity().onBackPressed();
    }
  }

  protected boolean initializePageUri(View paramView)
  {
    if (super.initializePageUri(paramView))
      return true;
    Boolean localBoolean;
    if (CollectionUtils.isEmpty(this.j.c()))
      localBoolean = null;
    while ((localBoolean == null) || (this.q == null))
    {
      return false;
      Model localModel = (Model)this.j.a(0);
      if ((localModel.f() != ContentTypeEnum.ContentType.APP) || (localModel.F() == null))
      {
        localBoolean = null;
        continue;
      }
      localBoolean = Boolean.valueOf(AppType.APP.getName().toUpperCase().equals(localModel.F().app_type));
    }
    Logger localLogger = com.wandoujia.ripple_framework.i.k().h();
    StringBuilder localStringBuilder = new StringBuilder();
    if (localBoolean.booleanValue());
    for (String str = "wdj://apps"; ; str = "wdj://games")
    {
      localLogger.a(paramView, str + "/" + this.q);
      return true;
    }
  }

  public boolean isSystemBarEnabled()
  {
    return true;
  }

  public boolean onBackPressed()
  {
    if (!this.m.isEnabled())
      return super.onBackPressed();
    s();
    return true;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.q = getArguments().getString("packageName");
    this.s = ((Anchor)getArguments().getParcelable("anchor"));
    this.t = getArguments().getString("iconUrl");
    this.u = getArguments().getInt("iconBitmapKey", -1);
    ((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).a(this.D);
  }

  public void onDestroy()
  {
    ((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).b(this.D);
    if (this.y != null)
    {
      com.wandoujia.nirvana.framework.ui.a locala = (com.wandoujia.nirvana.framework.ui.a)this.y.getTag(2131492995);
      if (locala != null)
        locala.a();
    }
    super.onDestroy();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.b = paramView.findViewById(2131493635);
    this.c = paramView.findViewById(2131493636);
    this.m = ((SwipeBackContainer)paramView.findViewById(2131493637));
    this.z = paramView.findViewById(2131493639);
    this.y = ((ViewGroup)paramView.findViewById(2131493603));
    this.v = paramView.findViewById(2131493638);
    paramView.findViewById(2131493001).setVisibility(8);
    this.h.setSwipeRefreshEnabled(false);
    this.h.a(false);
    int i = getResources().getDimensionPixelSize(2131427941) + getResources().getDimensionPixelSize(2131427675) + android.support.v4.app.i.a(1.0F, getActivity());
    int j;
    int k;
    label349: Anchor localAnchor;
    String str;
    View localView1;
    AsyncImageView localAsyncImageView;
    if (SystemUtil.aboveApiLevel(19))
    {
      j = getResources().getDimensionPixelSize(2131427943);
      this.A = (j + i);
      this.n = getResources().getDimensionPixelSize(2131427599);
      this.m.setBackgroundView(this.b);
      this.m.setOnAnimListener(new s(this));
      this.m.setScrollStateGetter(new t(this));
      ViewHelper.setTranslationY(this.c, this.n);
      this.g.a(this.C);
      this.m.setTargetTransListener(new u(this));
      bj localbj = createToolbarViewBinder(this.g);
      if (localbj != null)
      {
        this.r = new ab(this.z, this.g, this.A);
        localbj.a(this.r);
        localbj.a(this.toolbarScrollerY);
      }
      this.toolbar.setNavigationOnClickListener(new v(this));
      if ((TextUtils.isEmpty(this.t)) && (this.u < 0))
        break label1009;
      k = 1;
      if ((this.s == null) || (k == 0))
        break label1067;
      localAnchor = this.s;
      str = this.t;
      int i1 = this.u;
      this.w = true;
      localView1 = this.c;
      View localView2 = this.b;
      localAsyncImageView = (AsyncImageView)this.v;
      if (!TextUtils.isEmpty(str))
        break label1015;
      com.wandoujia.ripple_framework.view.e.a(localAsyncImageView, (Bitmap)((b)com.wandoujia.ripple_framework.i.k().a("holder")).a(i1));
      label438: ViewHelper.setAlpha(this.m, 0.0F);
      float f1 = localAnchor.b / localAnchor.c;
      localAnchor.a = (int)(localAnchor.a - ViewHelper.getTranslationY(localView1));
      if (localAnchor.c != localAnchor.b)
        break label1033;
      ViewHelper.setPivotY(localView1, localAnchor.c / 2);
      f1 = 2.0F;
      label508: ViewHelper.setScaleY(localView1, f1);
      ViewHelper.setAlpha(localView2, 0.0F);
      ViewHelper.setAlpha(localView1, 0.0F);
      Context localContext = localAsyncImageView.getContext();
      int i2 = getResources().getDimensionPixelSize(2131427575);
      int i3 = getResources().getDimensionPixelSize(2131427575);
      int i4 = (int)((android.support.v4.app.i.b(localContext) - i2) / 2.0F);
      int i5 = localAnchor.e - i4;
      int i6 = localAnchor.d - localContext.getResources().getDimensionPixelSize(2131427572);
      float f2 = localAnchor.f / i2;
      float f3 = localAnchor.g / i3;
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localAsyncImageView.getLayoutParams();
      localLayoutParams.leftMargin = i4;
      if (SystemUtil.aboveApiLevel(11))
        localAsyncImageView.setLayerType(2, null);
      localAsyncImageView.setLayoutParams(localLayoutParams);
      ViewHelper.setTranslationX(localAsyncImageView, i5);
      ViewHelper.setTranslationY(localAsyncImageView, i6);
      ViewHelper.setPivotX(localAsyncImageView, 0.0F);
      ViewHelper.setPivotY(localAsyncImageView, 0.0F);
      ViewHelper.setScaleX(localAsyncImageView, f2);
      ViewHelper.setScaleY(localAsyncImageView, f3);
      AnimatorSet localAnimatorSet = new AnimatorSet();
      if (SystemUtil.aboveApiLevel(11))
        localView1.setLayerType(2, null);
      ValueAnimator localValueAnimator1 = ValueAnimator.ofFloat(new float[] { 1.0F });
      localValueAnimator1.setDuration(650L);
      localValueAnimator1.setInterpolator(new DecelerateInterpolator());
      localValueAnimator1.addUpdateListener(new w(localView2));
      ValueAnimator localValueAnimator2 = ValueAnimator.ofFloat(new float[] { 1.0F });
      localValueAnimator2.setDuration(350L);
      localValueAnimator2.setInterpolator(new DecelerateInterpolator());
      localValueAnimator2.addUpdateListener(new x(localView1));
      ValueAnimator localValueAnimator3 = ValueAnimator.ofFloat(new float[] { 1.0F });
      localValueAnimator3.setDuration(300L);
      localValueAnimator3.setInterpolator(new DecelerateInterpolator());
      localValueAnimator3.addUpdateListener(new y(localView1, f1, localAsyncImageView, i5, i6, f2, f3));
      ValueAnimator localValueAnimator4 = ValueAnimator.ofFloat(new float[] { 1.0F });
      localValueAnimator4.setDuration(200L);
      localValueAnimator4.setInterpolator(new DecelerateInterpolator());
      localValueAnimator4.addUpdateListener(new e(this));
      localAnimatorSet.addListener(new f(this, localAsyncImageView));
      localAnimatorSet.play(localValueAnimator1).with(localValueAnimator2);
      localAnimatorSet.play(localValueAnimator3).after(localValueAnimator2);
      localAnimatorSet.play(localValueAnimator4).after(localValueAnimator3);
      localAnimatorSet.start();
    }
    while (true)
    {
      this.x = ((JupiterToolbar)paramView.findViewById(2131493121));
      return;
      j = 0;
      break;
      label1009: k = 0;
      break label349;
      label1015: new com.wandoujia.ripple_framework.view.e();
      com.wandoujia.ripple_framework.view.e.a(localAsyncImageView, str);
      break label438;
      label1033: ViewHelper.setPivotY(localView1, localAnchor.c * localAnchor.a / (localAnchor.c - localAnchor.b));
      break label508;
      label1067: t();
      FragmentActivity localFragmentActivity = getActivity();
      Animation localAnimation1 = AnimationUtils.loadAnimation(localFragmentActivity, 2130968596);
      localAnimation1.setDuration(200L);
      this.h.startAnimation(localAnimation1);
      this.c.startAnimation(localAnimation1);
      localAnimation1.start();
      Animation localAnimation2 = AnimationUtils.loadAnimation(localFragmentActivity, 17432576);
      localAnimation2.setDuration(200L);
      this.b.setAnimation(localAnimation2);
      localAnimation2.start();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.DetailFragment
 * JD-Core Version:    0.6.0
 */