package com.wandoujia.ripple_framework.log;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.api.proto.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;

public abstract class h
  implements View.OnClickListener
{
  private Model a;
  private long b = 0L;

  public h()
  {
    this(null);
  }

  public h(Model paramModel)
  {
    this(paramModel, 0);
  }

  private h(Model paramModel, byte paramByte)
  {
    this.a = paramModel;
  }

  public final h a(View paramView, Logger.Module paramModule, ViewLogPackage.Element paramElement, Action paramAction)
  {
    if (TextUtils.isEmpty(paramAction.intent));
    for (String str = paramAction.url; ; str = paramAction.intent)
      return a(paramView, paramModule, paramElement, str);
  }

  public final h a(View paramView, Logger.Module paramModule, ViewLogPackage.Element paramElement, ViewLogPackage.Action paramAction, String paramString, Long paramLong)
  {
    i.k().h().a(paramView, paramModule, paramElement, paramAction, paramString, paramLong).a(paramView, this.a);
    return this;
  }

  public final h a(View paramView, Logger.Module paramModule, ViewLogPackage.Element paramElement, String paramString)
  {
    return a(paramView, paramModule, paramElement, ViewLogPackage.Action.REDIRECT, paramString, null);
  }

  public abstract boolean a(View paramView);

  public final void onClick(View paramView)
  {
    if (SystemClock.elapsedRealtime() - this.b < 300L);
    do
      return;
    while (!a(paramView));
    this.b = SystemClock.elapsedRealtime();
    Context localContext = paramView.getContext();
    if ((localContext instanceof BaseActivity))
    {
      ((BaseActivity)localContext).onLogClick(paramView);
      return;
    }
    i.k().h().c(paramView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.log.h
 * JD-Core Version:    0.6.0
 */