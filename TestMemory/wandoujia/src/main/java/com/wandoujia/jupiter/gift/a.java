package com.wandoujia.jupiter.gift;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.p4.gift.http.model.GiftBeanModels.GiftBeanCdKey;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.StatefulButton;
import com.wandoujia.ripple_framework.view.ab;

public final class a
  implements ab
{
  public static void a(Activity paramActivity)
  {
    com.wandoujia.ripple_framework.view.a.h localh = new com.wandoujia.ripple_framework.view.a.h(paramActivity).a(true);
    localh.a(paramActivity.getString(2131624871)).b(paramActivity.getString(2131624872)).b(paramActivity.getString(2131624330), null).c(paramActivity.getString(2131624156), new f(paramActivity)).a(paramActivity.getString(2131624158), new e(paramActivity));
    localh.b().setCanceledOnTouchOutside(true);
  }

  public static void a(Activity paramActivity, GiftBeanModels.GiftBeanCdKey paramGiftBeanCdKey)
  {
    com.wandoujia.ripple_framework.view.a.h localh = new com.wandoujia.ripple_framework.view.a.h(paramActivity).a(paramActivity.getString(2131624871));
    localh.b(paramGiftBeanCdKey.getData()).a(paramActivity.getString(2131624891), new h(paramActivity)).b(paramActivity.getString(2131624564), null);
    localh.b().setCanceledOnTouchOutside(true);
  }

  public static void a(Activity paramActivity, Model paramModel)
  {
    String str = paramActivity.getString(2131624885);
    new com.wandoujia.ripple_framework.view.a.h(paramActivity).a(paramActivity.getString(2131624871)).b(str).b(paramActivity.getString(2131624564), null).a(paramActivity.getString(2131624875), new g(paramModel, paramActivity)).b().setCanceledOnTouchOutside(true);
  }

  public static void a(Activity paramActivity, String paramString1, String paramString2, boolean paramBoolean)
  {
    com.wandoujia.ripple_framework.view.a.h localh = new com.wandoujia.ripple_framework.view.a.h(paramActivity).a(true);
    if (paramBoolean);
    for (String str = paramActivity.getString(2131624884); ; str = paramActivity.getString(2131624881))
    {
      localh.a(paramActivity.getString(2131624871)).b(String.format(str, new Object[] { paramString1 })).b(paramActivity.getString(2131624936), null).a(paramActivity.getString(2131624576), new d(paramActivity, paramString1, paramString2));
      localh.b().setCanceledOnTouchOutside(true);
      return;
    }
  }

  public final void a(View paramView)
  {
    ((TextView)paramView.findViewById(2131492998)).setText(2131624878);
    ((StatefulButton)paramView.findViewById(2131492866)).setText(2131624727);
    paramView.findViewById(2131492866).setOnClickListener(new b());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.gift.a
 * JD-Core Version:    0.6.0
 */