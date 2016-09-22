package com.wandoujia.jupiter.homepage.splashwindow;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.api.proto.BadgeEnum.Badge;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public class SplashView extends RelativeLayout
{
  private static final double a = Math.tan(Math.toRadians(45.0D));
  private static final int b = (int)GlobalConfig.getAppContext().getResources().getDimension(2131427742);
  private static final int c = (int)GlobalConfig.getAppContext().getResources().getDimension(2131427564);
  private int d = -1;
  private float e;
  private float f;
  private float g;
  private int h;
  private AsyncImageView i;
  private AsyncImageView j;
  private AsyncImageView k;
  private View l;
  private View m;
  private View n;
  private View o;
  private View p;
  private int q;
  private int r;
  private float s;
  private float t;
  private boolean u;
  private h v;
  private CountDownTimer w;
  private int x = 0;
  private j y;
  private Model z;

  public SplashView(Context paramContext)
  {
    super(paramContext);
  }

  public SplashView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SplashView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }

  @TargetApi(21)
  public SplashView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a();
  }

  private void a()
  {
    this.h = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
    LayoutInflater.from(getContext()).inflate(2130903582, this, true);
    this.i = ((AsyncImageView)findViewById(2131493743));
    this.j = ((AsyncImageView)findViewById(2131492998));
    this.k = ((AsyncImageView)findViewById(2131493721));
    this.l = findViewById(2131493574);
    this.m = findViewById(2131493663);
    this.n = findViewById(2131493519);
    this.o = findViewById(2131493733);
    this.p = findViewById(2131493664);
    getBackground().setAlpha(255);
    this.w = new a(this);
  }

  private void a(float paramFloat)
  {
    float f1 = Math.min(k.c(), Math.max(0.0F, this.g - paramFloat));
    float f2 = getScrollY();
    float f3 = Math.round(f1);
    scrollTo(0, (int)f3);
    ViewHelper.setY(this.i, f3);
    float f4 = 1.0F - f3 / k.h();
    boolean bool = f3 < k.h();
    float f5 = 0.0F;
    if (!bool);
    while (true)
    {
      ViewHelper.setAlpha(this.k, f5);
      ViewHelper.setAlpha(this.m, f5);
      ViewHelper.setAlpha(this.p, f5);
      if (f3 < k.h())
        getBackground().setAlpha(255);
      while (true)
      {
        float f7 = f3 / k.c();
        float f8 = 1.0F - f7 * (1.0F - 1.0F * k.n() / this.r);
        ViewHelper.setScaleX(this.j, f8);
        int i1 = (int)(this.q - f7 * (this.q - k.o()));
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.j.getLayoutParams();
        localLayoutParams.height = i1;
        this.j.setLayoutParams(localLayoutParams);
        int i2 = (int)(this.q - f7 * (this.q - b));
        RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)this.o.getLayoutParams();
        localLayoutParams1.height = i2;
        this.o.setLayoutParams(localLayoutParams1);
        float f9 = f3 - f7 * (this.s - c + this.q - b);
        ViewHelper.setTranslationY(this.o, f9);
        ViewHelper.setTranslationY(this.k, f9);
        ViewGroup.LayoutParams localLayoutParams2 = this.i.getLayoutParams();
        localLayoutParams2.height = Math.max(k.b(), (int)(paramFloat + this.t));
        this.i.setLayoutParams(localLayoutParams2);
        getScrollX();
        int i3 = (int)f3;
        getScrollX();
        int i4 = (int)f2;
        if (this.y != null)
          this.y.a(i3, i4);
        return;
        float f6 = 1.0F * (f3 - k.h()) / (k.c() - k.h());
        getBackground().setAlpha(255 - (int)(f6 * 255.0F));
      }
      f5 = f4;
    }
  }

  private void b()
  {
    if (this.w != null)
    {
      this.w.cancel();
      this.w = null;
    }
  }

  private void c()
  {
    if (getScrollY() != k.c())
    {
      this.v = new h(this, getScrollY(), k.c(), 0);
      this.v.start();
      return;
    }
    d();
  }

  private void d()
  {
    if (this.y != null)
      this.y.a();
    getBackground().setAlpha(255);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.v != null);
    do
    {
      return true;
      switch (paramMotionEvent.getActionMasked())
      {
      default:
      case 0:
      }
    }
    while (this.x != 0);
    return false;
    this.e = paramMotionEvent.getX();
    this.f = paramMotionEvent.getY();
    this.g = getScrollY();
    this.d = paramMotionEvent.getPointerId(0);
    return true;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i2;
    if (this.v != null)
      i2 = 1;
    int i1;
    do
    {
      return i2;
      i1 = paramMotionEvent.findPointerIndex(this.d);
      i2 = 0;
    }
    while (i1 == -1);
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    float f3 = f1 - this.e;
    float f4 = f2 - this.f;
    switch (paramMotionEvent.getActionMasked())
    {
    case 4:
    case 5:
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    case 6:
    }
    while (true)
    {
      return true;
      this.e = paramMotionEvent.getX();
      this.f = paramMotionEvent.getY();
      this.g = getScrollY();
      this.d = paramMotionEvent.getPointerId(0);
      this.t = this.i.getHeight();
      continue;
      switch (this.x)
      {
      case 1:
      default:
      case 0:
      case 2:
      }
      while (true)
      {
        this.u = true;
        break;
        if ((Math.abs(f4 / f3) > a) && (Math.abs(f4) > this.h));
        for (int i3 = 1; ; i3 = 0)
        {
          int i4 = 0;
          if (i3 != 0)
            i4 = 2;
          this.x = i4;
          if (this.x == 0)
            break;
          this.e = f1;
          this.f = f2;
          b();
          if (this.z == null)
            break;
          i.k().h().a(Logger.Module.SPLASH, ViewLogPackage.Action.WIPE, "splash_manual_splash_up", Long.valueOf(1L), this.z.a());
          break;
        }
        a(f4);
      }
      this.x = 0;
      if (this.u)
      {
        c();
        continue;
      }
      if (f2 > this.l.getHeight())
        continue;
      b();
      performClick();
      c();
    }
  }

  public void setModel(Model paramModel)
  {
    this.z = paramModel;
    List localList = paramModel.v();
    if (localList.size() >= 3)
    {
      i.k().a("splash_ad_cache");
      this.k.setImageLoadedListener(new b(this));
      this.j.setImageLoadedListener(new d(this));
      this.i.setImageLoadedListener(new e(this));
      this.i.e(com.wandoujia.jupiter.homepage.b.a.a(((Image)localList.get(0)).url), 2131362159);
      this.j.e(com.wandoujia.jupiter.homepage.b.a.a(((Image)localList.get(2)).url), 2131362159);
      this.k.e(com.wandoujia.jupiter.homepage.b.a.a(((Image)localList.get(1)).url), 2131362159);
    }
    if ((paramModel.R() != null) && ((paramModel.R().intValue() & BadgeEnum.Badge.SPREAD.getValue()) != 0))
      this.n.setVisibility(0);
    while (true)
    {
      setOnClickListener(new g(paramModel));
      this.w.start();
      i.k().h().a(Logger.Module.SPLASH, ViewLogPackage.Action.REDIRECT, "splash_show", Long.valueOf(1L), paramModel.a());
      return;
      this.n.setVisibility(8);
    }
  }

  public void setScrollListener(j paramj)
  {
    this.y = paramj;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.splashwindow.SplashView
 * JD-Core Version:    0.6.0
 */