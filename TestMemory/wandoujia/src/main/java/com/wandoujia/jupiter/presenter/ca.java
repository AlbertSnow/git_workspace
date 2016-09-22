package com.wandoujia.jupiter.presenter;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.android.volley.VolleyError;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.HttpResponse;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.k;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.model.d;
import com.wandoujia.ripple_framework.view.LoadingView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ca extends c
{
  protected com.wandoujia.ripple_framework.a.b a;
  private com.wandoujia.nirvana.framework.ui.a g;
  private Runnable h;

  private static ViewGroup.LayoutParams a(d paramd, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams == null)
      paramLayoutParams = new ViewGroup.LayoutParams(-1, -2);
    if (paramd.a() == 2)
    {
      paramLayoutParams.height = paramd.d();
      return paramLayoutParams;
    }
    paramLayoutParams.height = -2;
    return paramLayoutParams;
  }

  private static void a(FrameLayout paramFrameLayout, View paramView)
  {
    int i = -1 + paramFrameLayout.getChildCount();
    if (i >= 0)
    {
      if (paramFrameLayout.getChildAt(i) == paramView)
        paramFrameLayout.getChildAt(i).setVisibility(0);
      while (true)
      {
        i--;
        break;
        paramFrameLayout.getChildAt(i).setVisibility(8);
      }
    }
  }

  protected static boolean b(Model paramModel)
  {
    if ((paramModel != null) && (paramModel.Q() != null) && (paramModel.Q().b() != null) && (paramModel.Q().b().b() != null) && (paramModel.Q().b().b().detail != null) && (paramModel.Q().b().b().detail.app_detail != null))
      return "GAME".equalsIgnoreCase(paramModel.Q().b().b().detail.app_detail.app_type);
    return false;
  }

  protected ViewGroup a(ViewGroup paramViewGroup)
  {
    return (ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903384);
  }

  protected ViewGroup a(ViewGroup paramViewGroup1, ViewGroup paramViewGroup2, d paramd)
  {
    if (paramViewGroup2 == null)
    {
      ViewGroup localViewGroup = a(paramViewGroup1);
      paramViewGroup1.addView(localViewGroup, a(paramd, null));
      return localViewGroup;
    }
    paramViewGroup2.setLayoutParams(a(paramd, paramViewGroup2.getLayoutParams()));
    return paramViewGroup2;
  }

  protected Model a(HttpResponse paramHttpResponse, Model paramModel)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramHttpResponse.entity.iterator();
    while (localIterator.hasNext())
      localArrayList.add(new Model((Entity)localIterator.next()));
    List localList = com.wandoujia.jupiter.d.a.a(localArrayList, b());
    paramModel.Q().b().a(localList);
    return paramModel;
  }

  public void a()
  {
    super.a();
    if (this.a != null)
      this.a.f();
    if (this.g != null)
      this.g.a();
    if (this.h != null)
      JupiterApplication.a().removeCallbacks(this.h);
  }

  protected void a(FrameLayout paramFrameLayout, d paramd)
  {
    switch (paramd.a())
    {
    default:
      return;
    case 0:
      a(paramFrameLayout, paramFrameLayout.getChildAt(0));
      return;
    case 2:
      this.h = new cb(this, paramd);
      JupiterApplication.a().postDelayed(this.h, 300L);
    case 1:
    }
    b(paramFrameLayout, paramd);
  }

  protected final void a(VolleyError paramVolleyError)
  {
    p.a(f(), paramVolleyError, p.a).a();
    if ((this.g != null) && (this.g.a != null))
      ((LoadingView)this.g.a.findViewById(2131492899)).d();
  }

  protected final void a(Model paramModel)
  {
    if (this.a != null)
      this.a.f();
    if (!(e() instanceof FrameLayout));
    for (int i = 0; i == 0; i = 1)
      return;
    a((FrameLayout)e(), paramModel.Q());
  }

  protected final void a(d paramd)
  {
    String str = paramd.c();
    int i = android.support.v4.app.b.a(j().a(), i());
    if (i >= 0)
      a(str, i(), i);
  }

  protected void a(String paramString, Model paramModel, int paramInt)
  {
    this.a = new com.wandoujia.ripple_framework.a.b(String.format("http://apis.wandoujia.com/apps/v1/%s/guess?format=proto", new Object[] { paramString }), new cc(this, paramModel, paramInt), new cd(this));
    this.a.u();
  }

  protected int b()
  {
    return 3;
  }

  protected final void b(FrameLayout paramFrameLayout, d paramd)
  {
    ViewGroup localViewGroup = a(paramFrameLayout, h().a(2131493640).i(), paramd);
    if (this.g == null)
      this.g = aa.q(localViewGroup, j());
    while (true)
    {
      this.g.a(paramd.b());
      a(paramFrameLayout, localViewGroup);
      return;
      this.g.a();
    }
  }

  protected final void c(Model paramModel)
  {
    Model localModel = android.support.v4.app.b.C();
    List localList = paramModel.Q().b().B();
    localList.add(0, localModel);
    if (localList.size() >= b())
      localList.remove(-1 + localList.size());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ca
 * JD-Core Version:    0.6.0
 */