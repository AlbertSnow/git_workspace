package com.wandoujia.jupiter.activity;

import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.h;
import com.wandoujia.jupiter.share.SharePlatformEnum;
import com.wandoujia.jupiter.share.ShareUtil.ShareContentType;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.LoadingView;

public class ShareActivity extends BaseActivity
{
  private long a;
  private Model b;
  private ShareUtil.ShareContentType c;
  private LoadingView d;
  private View e;
  private View f;
  private View g;
  private View h;
  private View i;
  private View j;
  private View k;

  private void a()
  {
    super.finish();
    overridePendingTransition(0, 0);
  }

  private void a(Bundle paramBundle)
  {
    this.b = ((Model)paramBundle.getParcelable("share_model"));
    this.c = ShareUtil.ShareContentType.valueOf(paramBundle.getString("share_type"));
  }

  @TargetApi(11)
  public void finish()
  {
    if (!SystemUtil.aboveApiLevel(11))
    {
      a();
      return;
    }
    t localt = new t(this);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    ArgbEvaluator localArgbEvaluator = new ArgbEvaluator();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(getResources().getColor(2131361872));
    arrayOfObject[1] = Integer.valueOf(getResources().getColor(2131362159));
    ValueAnimator localValueAnimator1 = ValueAnimator.ofObject(localArgbEvaluator, arrayOfObject);
    localValueAnimator1.addUpdateListener(new r(this));
    localValueAnimator1.addListener(localt);
    float f1 = (float)this.a;
    ValueAnimator localValueAnimator2 = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    localValueAnimator2.setInterpolator(new DecelerateInterpolator());
    localValueAnimator2.addUpdateListener(new s(this, f1));
    localAnimatorSet.play(localValueAnimator1).with(localValueAnimator2);
    localAnimatorSet.setDuration(200L);
    localAnimatorSet.start();
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    TaskEvent.Result localResult1;
    if (paramInt1 == 10103)
    {
      localResult1 = TaskEvent.Result.SUCCESS;
      if (paramInt2 != 0)
        break label77;
    }
    label77: for (TaskEvent.Result localResult2 = TaskEvent.Result.CANCEL; ; localResult2 = localResult1)
    {
      ((Logger)h.k().a("log")).a(new TaskEvent.Builder().action(TaskEvent.Action.SHARE).result(localResult2).result_info(SharePlatformEnum.QQ.name()), new ExtraPackage.Builder());
      return;
    }
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (SystemUtil.aboveApiLevel(11))
    {
      AnimatorSet localAnimatorSet = new AnimatorSet();
      ArgbEvaluator localArgbEvaluator = new ArgbEvaluator();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(getResources().getColor(2131362159));
      arrayOfObject[1] = Integer.valueOf(getResources().getColor(2131361872));
      ValueAnimator localValueAnimator1 = ValueAnimator.ofObject(localArgbEvaluator, arrayOfObject);
      localValueAnimator1.addUpdateListener(new p(this));
      float f1 = (float)this.a;
      ValueAnimator localValueAnimator2 = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      localValueAnimator2.setInterpolator(new DecelerateInterpolator());
      localValueAnimator2.addUpdateListener(new q(this, f1));
      localAnimatorSet.play(localValueAnimator1).with(localValueAnimator2);
      localAnimatorSet.setDuration(200L);
      localAnimatorSet.start();
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903257);
    this.e = findViewById(2131493597);
    this.f = findViewById(2131493599);
    this.g = findViewById(2131493598);
    this.i = findViewById(2131493601);
    this.j = findViewById(2131493600);
    this.h = findViewById(2131493573);
    this.d = ((LoadingView)findViewById(2131493564));
    this.k = findViewById(2131493596);
    this.a = getResources().getDimensionPixelOffset(2131427860);
    this.rootView = findViewById(2131492888);
    if (!SystemUtil.aboveApiLevel(11))
      findViewById(2131492888).setBackgroundColor(getResources().getColor(2131361872));
    if (paramBundle != null)
      a(paramBundle);
    while (true)
    {
      k localk = new k(this);
      this.rootView.setOnClickListener(new n(this));
      this.k.setOnTouchListener(new o());
      this.e.setOnClickListener(localk);
      this.f.setOnClickListener(localk);
      this.g.setOnClickListener(localk);
      this.i.setOnClickListener(localk);
      this.j.setOnClickListener(localk);
      this.h.setOnClickListener(localk);
      return;
      a(getIntent().getExtras());
    }
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent.getExtras());
  }

  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    a(paramBundle);
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putParcelable("share_model", this.b);
    paramBundle.putString("share_type", this.c.name());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.ShareActivity
 * JD-Core Version:    0.6.0
 */