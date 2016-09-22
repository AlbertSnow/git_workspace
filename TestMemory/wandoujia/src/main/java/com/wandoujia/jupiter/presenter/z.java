package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.HttpResponse;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.k;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class z extends ca
{
  private ac g = new ac(this, 0);

  protected final ViewGroup a(ViewGroup paramViewGroup)
  {
    return (ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903289);
  }

  protected final ViewGroup a(ViewGroup paramViewGroup1, ViewGroup paramViewGroup2, com.wandoujia.ripple_framework.model.d paramd)
  {
    ViewGroup localViewGroup = super.a(paramViewGroup1, paramViewGroup2, paramd);
    LinearLayout localLinearLayout = (LinearLayout)localViewGroup.findViewById(2131493645);
    if (i().Q().a() == 3);
    for (int i = 0; ; i = (int)localViewGroup.getContext().getResources().getDimension(2131427647))
    {
      ((ViewGroup.MarginLayoutParams)localLinearLayout.getLayoutParams()).setMargins(i, 0, 0, 0);
      return localViewGroup;
    }
  }

  protected final Model a(HttpResponse paramHttpResponse, Model paramModel)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramHttpResponse.entity.iterator();
    while (localIterator.hasNext())
      localArrayList.add(new Model((Entity)localIterator.next()));
    paramModel.Q().b().a(localArrayList);
    return paramModel;
  }

  public final void a()
  {
    com.wandoujia.p4.account.manager.d.a().d().b(this.g);
    super.a();
  }

  protected final void a(FrameLayout paramFrameLayout, com.wandoujia.ripple_framework.model.d paramd)
  {
    switch (paramd.a())
    {
    default:
      super.a(paramFrameLayout, paramd);
      return;
    case 4:
      a(i().Q());
      b(paramFrameLayout, paramd);
      return;
    case 3:
    }
    b(paramFrameLayout, paramd);
    com.wandoujia.p4.account.manager.d.a().d().a(this.g);
  }

  protected final void a(String paramString, Model paramModel, int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    if (!TextUtils.isEmpty(paramModel.F().app_type));
    for (String str = paramModel.F().app_type.toLowerCase(); ; str = paramModel.f().toString().toLowerCase())
    {
      arrayOfObject[0] = str;
      arrayOfObject[1] = paramString;
      this.a = new com.wandoujia.ripple_framework.a.b(String.format("http://apis.wandoujia.com/five/v2/%ss/%s/related", arrayOfObject), new aa(this, paramModel, paramInt), new ab(this));
      this.a.u();
      return;
    }
  }

  protected final int b()
  {
    return 2147483647;
  }

  protected final void c()
  {
    if (i().Q().a() != 3)
      return;
    i().Q().a(4);
    int i = android.support.v4.app.b.a(j().a(), i());
    j().a().a(i, i());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.z
 * JD-Core Version:    0.6.0
 */