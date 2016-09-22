package com.wandoujia.jupiter.library.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.jupiter.c.h;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.p4.subscribe.core.SubscribeManager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.ba;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class a extends ba
{
  private Model b;
  private List<String> c = new ArrayList();
  private boolean d;
  private b e = new b(this, 0);
  private c f;
  private com.wandoujia.p4.subscribe.core.b g;

  public a(View paramView, Model paramModel, c paramc)
  {
    super(paramView);
    this.b = paramModel;
    SubscribeManager.a().a(this.e);
    this.f = paramc;
    this.g = new h(paramView.getContext(), paramModel);
  }

  private String a(int paramInt)
  {
    return (String)this.c.get(paramInt);
  }

  public final int getCount()
  {
    if (com.wandoujia.jupiter.subscribe.a.a.b(this.b));
    for (int i = 2131230758; ; i = 2131230723)
    {
      this.c = Arrays.asList(this.a.getContext().getResources().getStringArray(i));
      return this.c.size();
    }
  }

  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramInt == 0);
    View localView;
    for (Object localObject = com.wandoujia.p4.utils.c.a(paramViewGroup, 2130903322); ; localObject = localView)
    {
      this.d = true;
      return localObject;
      localView = com.wandoujia.p4.utils.c.a(paramViewGroup, 2130903321);
      ((TextView)localView.findViewById(2131493602)).setText(a(paramInt));
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView == null) || (!TextUtils.equals("NON_DROPDOWN", paramView.getTag().toString())))
    {
      paramView = com.wandoujia.p4.utils.c.a(paramViewGroup, 2130903320);
      paramView.setTag("NON_DROPDOWN");
    }
    if (this.d)
      this.d = false;
    switch (paramInt)
    {
    default:
      return paramView;
    case 1:
    }
    int i;
    View localView;
    String str;
    Logger localLogger;
    Logger.Module localModule;
    ViewLogPackage.Element localElement;
    if (com.wandoujia.jupiter.subscribe.a.a.b(this.b))
    {
      SubscribeManager.a().f(paramView.getContext(), this.g);
      i = 0;
      this.a.setEnabled(false);
      localView = this.a;
      str = this.b.F().package_name;
      localLogger = i.k().h();
      localModule = Logger.Module.ME_APPS;
      localElement = ViewLogPackage.Element.ICON;
      if (i == 0)
        break label190;
    }
    label190: for (ViewLogPackage.Action localAction = ViewLogPackage.Action.MARK_FAVORITE; ; localAction = ViewLogPackage.Action.UNMARK_FAVORITE)
    {
      localLogger.a(localView, localModule, localElement, localAction, str, null).c(localView);
      return paramView;
      SubscribeManager.a().e(paramView.getContext(), this.g);
      i = 1;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.a.a
 * JD-Core Version:    0.6.0
 */