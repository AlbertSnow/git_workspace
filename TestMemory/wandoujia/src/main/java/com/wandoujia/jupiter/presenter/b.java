package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.subscribe.PublisherButtonPresenter;
import com.wandoujia.ripple_framework.action.ActionType;
import com.wandoujia.ripple_framework.c.bs;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.StatefulButton;

public final class b extends com.wandoujia.ripple_framework.c.c
{
  private bs a;
  private PublisherButtonPresenter g;

  public static void a(View paramView, Action paramAction)
  {
    a(paramView, paramAction, null);
  }

  private static void a(View paramView, Action paramAction, Model paramModel)
  {
    if (paramAction != null)
    {
      b(paramView, paramAction);
      paramView.setOnClickListener(new d(paramModel, paramAction));
    }
  }

  private static void a(View paramView, String paramString)
  {
    if (((paramView instanceof TextView)) && (!TextUtils.isEmpty(paramString)))
      ((TextView)paramView).setText(paramString);
  }

  private static void b(View paramView, Action paramAction)
  {
    a(paramView, paramAction.text);
  }

  public final void a()
  {
    super.a();
    if (this.a != null)
      this.a.a();
    if (this.g != null)
      this.g.a();
  }

  protected final void a(Model paramModel)
  {
    switch (g.a[paramModel.f().ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    do
    {
      a(e(), paramModel.b().action_positive, paramModel);
      return;
      if (((e() instanceof StatefulButton)) && (paramModel.F() != null))
      {
        if (this.a == null)
          this.a = new c((StatefulButton)e());
        this.a.a(paramModel);
        return;
      }
      a(e(), paramModel.b().action_positive, paramModel);
      return;
      if (((e() instanceof StatefulButton)) && (paramModel.I() != null))
      {
        if (this.g == null)
          this.g = new PublisherButtonPresenter((StatefulButton)e());
        this.g.a(paramModel);
        return;
      }
      a(e(), paramModel.b().action_positive, paramModel);
      return;
      if ((e() instanceof StatefulButton))
      {
        ((StatefulButton)e()).setTextColor(e().getContext().getResources().getColorStateList(2131362249));
        e().setBackgroundResource(2130837822);
      }
      a(e(), paramModel.b().action, paramModel);
      a(e(), JupiterApplication.e().getString(2131625257));
      return;
    }
    while ((paramModel.b().action_positive == null) || ((paramModel.b().action_positive.type.intValue() != ActionType.CLEAR_DOWNLOAD_COMPLETE_APP.ordinal()) && (paramModel.b().action_positive.type.intValue() != ActionType.CLEAR_DOWNLOAD_COMPLETE_MM.ordinal())));
    View localView = e();
    Action localAction = paramModel.b().action_positive;
    b(localView, localAction);
    localView.setOnClickListener(new e(localAction));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.b
 * JD-Core Version:    0.6.0
 */