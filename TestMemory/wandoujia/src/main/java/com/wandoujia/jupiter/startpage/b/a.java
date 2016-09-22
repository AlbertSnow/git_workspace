package com.wandoujia.jupiter.startpage.b;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.ripple_framework.model.Model;

public final class a extends com.wandoujia.ripple_framework.c.c
{
  protected final void a(Model paramModel)
  {
    h().a(2131493724).a().setOnClickListener(new b());
    TextView localTextView = (TextView)h().a(2131492866).a();
    localTextView.setText(JupiterApplication.e().getString(2131625555));
    localTextView.setOnClickListener(new c());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.startpage.b.a
 * JD-Core Version:    0.6.0
 */