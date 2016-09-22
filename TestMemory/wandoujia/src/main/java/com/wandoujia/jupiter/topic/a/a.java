package com.wandoujia.jupiter.topic.a;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.wandoujia.api.proto.Action;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class a extends c
{
  protected final void a(Model paramModel)
  {
    ((TextView)e().findViewById(2131492998)).setTextColor(e().getResources().getColor(2131362232));
    h().a(2131492972).f(8);
    TextView localTextView = (TextView)e().findViewById(2131492866);
    if (!TextUtils.isEmpty(paramModel.t().text))
      localTextView.setText(paramModel.t().text);
    localTextView.setTextColor(e().getResources().getColor(2131362232));
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localTextView.getLayoutParams();
    localLayoutParams.gravity = 21;
    localTextView.setLayoutParams(localLayoutParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.topic.a.a
 * JD-Core Version:    0.6.0
 */