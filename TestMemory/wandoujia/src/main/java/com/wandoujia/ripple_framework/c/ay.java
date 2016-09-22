package com.wandoujia.ripple_framework.c;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.StatefulButton;

public final class ay extends c
{
  protected final void a(Model paramModel)
  {
    int i;
    if (h().a(R.id.jupiter_card_title).f())
    {
      i = R.id.jupiter_card_title;
      if ((!TextUtils.isEmpty(paramModel.q())) || (!TextUtils.isEmpty(paramModel.F().tagline)) || (!TextUtils.isEmpty(paramModel.F().description)))
        break label234;
      View localView2 = h().a(i).a();
      RelativeLayout.LayoutParams localLayoutParams3 = (RelativeLayout.LayoutParams)localView2.getLayoutParams();
      localLayoutParams3.topMargin = localView2.getResources().getDimensionPixelOffset(R.dimen.card_title_margin_top);
      localView2.setLayoutParams(localLayoutParams3);
      StatefulButton localStatefulButton2 = (StatefulButton)h().a(R.id.action_button).a();
      RelativeLayout.LayoutParams localLayoutParams4 = (RelativeLayout.LayoutParams)localStatefulButton2.getLayoutParams();
      localLayoutParams4.topMargin = localStatefulButton2.getResources().getDimensionPixelOffset(R.dimen.card_button_margin_top);
      localStatefulButton2.setLayoutParams(localLayoutParams4);
      h().b(R.id.description).f(8);
      label169: if (!CollectionUtils.isEmpty(paramModel.b().tag))
        break label349;
      h().b(R.id.tag).f(4);
    }
    while (true)
    {
      if (!TextUtils.isEmpty(paramModel.b().symbol))
        break label367;
      h().b(R.id.symbol).f(8);
      return;
      i = R.id.title;
      break;
      label234: h().b(R.id.description).f(0);
      View localView1 = h().a(i).a();
      RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)localView1.getLayoutParams();
      localLayoutParams1.topMargin = localView1.getResources().getDimensionPixelOffset(R.dimen.title_margin_with_description);
      localView1.setLayoutParams(localLayoutParams1);
      StatefulButton localStatefulButton1 = (StatefulButton)h().a(R.id.action_button).a();
      RelativeLayout.LayoutParams localLayoutParams2 = (RelativeLayout.LayoutParams)localStatefulButton1.getLayoutParams();
      localLayoutParams2.topMargin = localStatefulButton1.getResources().getDimensionPixelOffset(R.dimen.button_margin_with_description);
      localStatefulButton1.setLayoutParams(localLayoutParams2);
      break label169;
      label349: h().b(R.id.tag).f(0);
    }
    label367: h().b(R.id.symbol).f(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.ay
 * JD-Core Version:    0.6.0
 */