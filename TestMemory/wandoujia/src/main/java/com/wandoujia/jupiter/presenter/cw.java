package com.wandoujia.jupiter.presenter;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

final class cw extends c
{
  protected final void a(Model paramModel)
  {
    ((TextView)e()).setText(2131625532);
    ((TextView)e()).setTextColor(e().getResources().getColor(2131361992));
    e().setBackgroundResource(2130838378);
    e().setOnTouchListener(new cx());
    e().setOnClickListener(new cy(paramModel, paramModel));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cw
 * JD-Core Version:    0.6.0
 */