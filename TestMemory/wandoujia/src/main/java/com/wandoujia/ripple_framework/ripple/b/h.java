package com.wandoujia.ripple_framework.ripple.b;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class h extends c
{
  protected final void a(Model paramModel)
  {
    h().b(R.id.title).a(paramModel.n()).e();
    if (!TextUtils.isEmpty(paramModel.r()))
    {
      h().b(R.id.snippet).a(paramModel.r()).e();
      View localView2 = h().b(R.id.action_bar).a();
      FrameLayout.LayoutParams localLayoutParams2 = (FrameLayout.LayoutParams)localView2.getLayoutParams();
      localLayoutParams2.gravity = 85;
      localView2.setLayoutParams(localLayoutParams2);
      return;
    }
    h().b(R.id.snippet).c();
    View localView1 = h().b(R.id.action_bar).a();
    FrameLayout.LayoutParams localLayoutParams1 = (FrameLayout.LayoutParams)localView1.getLayoutParams();
    localLayoutParams1.gravity = 21;
    localView1.setLayoutParams(localLayoutParams1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.b.h
 * JD-Core Version:    0.6.0
 */