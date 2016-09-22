package com.wandoujia.ripple_framework.c;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;

public final class br extends c
{
  protected final void a(Model paramModel)
  {
    ViewGroup.LayoutParams localLayoutParams = e().getLayoutParams();
    TextView localTextView = h().a(R.id.title).j();
    Object localObject = paramModel.o();
    if (TextUtils.isEmpty((CharSequence)localObject))
      localObject = b.a(e().getContext(), paramModel.F());
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      if ((localTextView.getLayoutParams() instanceof LinearLayout.LayoutParams))
      {
        LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localTextView.getLayoutParams();
        localLayoutParams1.height = -1;
        localTextView.setLayoutParams(localLayoutParams1);
      }
      h().a(R.id.sub_title).f(8);
      localLayoutParams.height = i.k().g().getResources().getDimensionPixelOffset(R.dimen.jupiter_card_mini_height);
      if (!TextUtils.isEmpty(paramModel.b().symbol))
        break label228;
      h().a(R.id.symbol).f(8);
      label155: if (!paramModel.N())
        break label246;
      e().setBackgroundColor(e().getResources().getColor(R.color.white_no_transparency));
    }
    while (true)
    {
      e().setLayoutParams(localLayoutParams);
      return;
      h().a(R.id.sub_title).f(0);
      localLayoutParams.height = i.k().g().getResources().getDimensionPixelOffset(R.dimen.jupiter_card_mini_height_with_sub);
      break;
      label228: h().a(R.id.symbol).f(0);
      break label155;
      label246: e().setBackgroundColor(e().getResources().getColor(R.color.transparent));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.br
 * JD-Core Version:    0.6.0
 */