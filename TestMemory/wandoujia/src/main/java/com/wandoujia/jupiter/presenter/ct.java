package com.wandoujia.jupiter.presenter;

import android.text.Html;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

final class ct extends c
{
  protected final void a(Model paramModel)
  {
    String str = paramModel.q();
    TextView localTextView = (TextView)e();
    if (TextUtils.isEmpty(str))
      e().setVisibility(4);
    while (true)
    {
      localTextView.setLines(1);
      localTextView.setMaxLines(1);
      localTextView.setEllipsize(TextUtils.TruncateAt.END);
      return;
      localTextView.setVisibility(0);
      localTextView.setText(Html.fromHtml(str));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ct
 * JD-Core Version:    0.6.0
 */