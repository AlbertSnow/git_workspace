package com.wandoujia.jupiter.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.by;
import android.support.v7.widget.cc;
import android.support.v7.widget.cf;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.AnimatorSet.Builder;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.api.proto.MorphData;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.jupiter.morph.c;
import com.wandoujia.jupiter.p;
import com.wandoujia.jupiter.presenter.aa;
import com.wandoujia.jupiter.presenter.bk;
import com.wandoujia.jupiter.share.ShareUtil.ShareContentType;
import com.wandoujia.jupiter.toolbar.JupiterToolbar;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.ripple_framework.adapter.f;
import com.wandoujia.ripple_framework.c.bs;
import com.wandoujia.ripple_framework.fragment.BaseListFragment;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.Anchor;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import com.wandoujia.ripple_framework.view.SwipeBackContainer;
import com.wandoujia.ripple_framework.view.bj;
import java.util.HashMap;
import java.util.List;

public class ReviewFragment extends ListFragment
{
  private cf A = new af(this);
  private View b;
  private View c;
  private SwipeBackContainer m;
  private int n;
  private boolean o;
  private bh p;
  private View q;
  private boolean r = false;
  private JupiterToolbar s;
  private ViewGroup t;
  private View u;
  private int v;
  private com.wandoujia.nirvana.framework.ui.recycler.g w;
  private Model x;
  private boolean y = false;
  private Anchor z;

  public static ReviewFragment a(String paramString1, String paramString2, Anchor paramAnchor)
  {
    ReviewFragment localReviewFragment = new ReviewFragment();
    Bundle localBundle = BaseListFragment.a(paramString1, paramString2, null);
    localBundle.putParcelable("anchor", paramAnchor);
    localReviewFragment.setArguments(localBundle);
    return localReviewFragment;
  }

  private void e()
  {
    this.m.a();
    this.g.b(this.A);
    this.toolbarViewBinder.a(null);
    if (this.p != null)
      this.p.b(false);
  }

  private void r()
  {
    if (this.q == null);
    ViewGroup localViewGroup;
    do
    {
      return;
      localViewGroup = (ViewGroup)this.q.getParent();
    }
    while (localViewGroup == null);
    localViewGroup.removeView(this.q);
    this.q = null;
  }

  protected final int a()
  {
    return 2130903352;
  }

  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    p localp = new p(paramString);
    localp.a(false);
    localp.a(new bg(this));
    return localp;
  }

  public final void a(DataLoadListener.Op paramOp, com.wandoujia.nirvana.framework.network.page.g<Model> paramg)
  {
    super.a(paramOp, paramg);
    if ((!this.j.b()) && (!this.y))
    {
      this.y = true;
      ai localai = new ai(this, android.support.v4.app.d.a(getActivity(), 2130903354));
      localai.a(this.x);
      this.l.b(localai);
      this.l.b();
    }
    if (CollectionUtils.isEmpty(this.j.c()));
    do
    {
      return;
      this.h.a(true);
      if (!this.r)
        r();
      if (!this.o)
      {
        this.o = true;
        this.w = new an(this, (ViewGroup)android.support.v4.app.d.a(this.g, 2130903356));
        ((com.wandoujia.jupiter.a.d)this.g.getAdapter()).a(this.w);
        this.g.getAdapter().b();
      }
      this.w.a(this.x);
    }
    while (this.x == null);
    if ((this.x.B() != null) && (this.x.B().size() > 0))
    {
      HashMap localHashMap = c.a((Model)this.x.B().get(0));
      if (localHashMap.containsKey("title"))
        setTitle(((MorphData)localHashMap.get("title")).value);
    }
    if ((this.s != null) && (this.s.getListener() != null))
      this.s.getListener().a(this.x);
    com.wandoujia.nirvana.framework.ui.a locala = (com.wandoujia.nirvana.framework.ui.a)this.t.getTag(2131492995);
    if (locala == null)
    {
      locala = aa.a(this.t, null).b(2131492866, new bs()).b(2131492998, new ax()).b(2131492903, new aw()).a(2131493650, new bk(this.t.getContext())).a(2131493634, new au());
      this.t.setTag(2131492995, locala);
    }
    while (true)
    {
      locala.a(this.x);
      return;
      locala.a();
    }
  }

  public final void a(Model paramModel)
  {
    this.x = paramModel;
  }

  protected final cc b()
  {
    return new ah(g());
  }

  protected void finish()
  {
    if (getActivity() != null)
    {
      this.m.setEnabled(false);
      getActivity().onBackPressed();
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
    e();
    return true;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.z = ((Anchor)getArguments().getParcelable("anchor"));
  }

  public void onDestroy()
  {
    if (this.t != null)
    {
      com.wandoujia.nirvana.framework.ui.a locala = (com.wandoujia.nirvana.framework.ui.a)this.t.getTag(2131492995);
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
    this.u = paramView.findViewById(2131493639);
    this.t = ((ViewGroup)paramView.findViewById(2131493603));
    this.q = paramView.findViewById(2131493638);
    paramView.findViewById(2131493001).setVisibility(8);
    this.h.setSwipeRefreshEnabled(false);
    this.h.a(false);
    int i = getResources().getDimensionPixelSize(2131427941) + getResources().getDimensionPixelSize(2131427675) + android.support.v4.app.i.a(1.0F, getActivity());
    int j;
    if (SystemUtil.aboveApiLevel(19))
    {
      j = getResources().getDimensionPixelSize(2131427943);
      this.v = (j + i);
      this.n = getResources().getDimensionPixelSize(2131427599);
      this.m.setBackgroundView(this.b);
      this.m.setOnAnimListener(new ay(this));
      this.m.setScrollStateGetter(new az(this));
      ViewHelper.setTranslationY(this.c, this.n);
      this.g.a(this.A);
      this.m.setTargetTransListener(new ba(this));
      bj localbj = createToolbarViewBinder(this.g);
      if (localbj != null)
      {
        this.p = new bh(this.u, this.g, this.v);
        localbj.a(this.p);
        localbj.a(this.toolbarScrollerY);
      }
      this.toolbar.setNavigationOnClickListener(new bb(this));
      if (this.z == null)
        break label765;
      Anchor localAnchor = this.z;
      this.r = true;
      View localView1 = this.c;
      View localView2 = this.b;
      AsyncImageView localAsyncImageView = (AsyncImageView)this.q;
      ViewHelper.setAlpha(this.m, 0.0F);
      float f = localAnchor.b / localAnchor.c;
      localAnchor.a = (int)(localAnchor.a - ViewHelper.getTranslationY(localView1));
      ViewHelper.setPivotY(localView1, localAnchor.c * localAnchor.a / (localAnchor.c - localAnchor.b));
      ViewHelper.setScaleY(localView1, f);
      ViewHelper.setAlpha(localView2, 0.0F);
      ViewHelper.setAlpha(localView1, 0.0F);
      AnimatorSet localAnimatorSet = new AnimatorSet();
      if (SystemUtil.aboveApiLevel(11))
        localView1.setLayerType(2, null);
      ValueAnimator localValueAnimator1 = ValueAnimator.ofFloat(new float[] { 1.0F });
      localValueAnimator1.setDuration(650L);
      localValueAnimator1.setInterpolator(new DecelerateInterpolator());
      localValueAnimator1.addUpdateListener(new bc(localView2));
      ValueAnimator localValueAnimator2 = ValueAnimator.ofFloat(new float[] { 1.0F });
      localValueAnimator2.setDuration(350L);
      localValueAnimator2.setInterpolator(new DecelerateInterpolator());
      localValueAnimator2.addUpdateListener(new bd(localView1));
      ValueAnimator localValueAnimator3 = ValueAnimator.ofFloat(new float[] { 1.0F });
      localValueAnimator3.setDuration(300L);
      localValueAnimator3.setInterpolator(new DecelerateInterpolator());
      localValueAnimator3.addUpdateListener(new be(localView1, f));
      ValueAnimator localValueAnimator4 = ValueAnimator.ofFloat(new float[] { 1.0F });
      localValueAnimator4.setDuration(200L);
      localValueAnimator4.setInterpolator(new DecelerateInterpolator());
      localValueAnimator4.addUpdateListener(new bf(this));
      localAnimatorSet.addListener(new ag(this, localAsyncImageView));
      localAnimatorSet.play(localValueAnimator1).with(localValueAnimator2);
      localAnimatorSet.play(localValueAnimator3).after(localValueAnimator2);
      localAnimatorSet.play(localValueAnimator4).after(localValueAnimator3);
      localAnimatorSet.start();
    }
    while (true)
    {
      this.s = ((JupiterToolbar)paramView.findViewById(2131493121));
      this.s.getListener().a(ShareUtil.ShareContentType.REVIEW_SINGLE);
      return;
      j = 0;
      break;
      label765: r();
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
 * Qualified Name:     com.wandoujia.jupiter.fragment.ReviewFragment
 * JD-Core Version:    0.6.0
 */