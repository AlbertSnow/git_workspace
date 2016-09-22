package com.wandoujia.jupiter.presenter;

import android.text.TextUtils;
import android.widget.TextView;
import com.wandoujia.api.proto.Action;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class dt extends c
{
  protected final void a(Model paramModel)
  {
    TextView localTextView = (TextView)e();
    if ((paramModel.t() != null) && (!TextUtils.isEmpty(paramModel.t().text)))
      localTextView.setText(paramModel.t().text);
    while (true)
    {
      localTextView.setOnClickListener(new du());
      return;
      localTextView.setText(2131624002);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.dt
 * JD-Core Version:    0.6.0
 */