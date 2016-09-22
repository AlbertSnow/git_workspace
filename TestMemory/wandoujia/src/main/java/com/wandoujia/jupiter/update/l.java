package com.wandoujia.jupiter.update;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.ripple_framework.c.bs;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.StatefulButton;

final class l extends bs
{
  private StatefulButton i;
  private String j;

  public l(StatefulButton paramStatefulButton)
  {
    super(paramStatefulButton);
    this.i = paramStatefulButton;
    this.j = paramStatefulButton.getText().toString();
  }

  public final void a()
  {
  }

  public final void a(UpdateNotification.DownloadState paramDownloadState)
  {
    int k = 2131362249;
    String str = "";
    int m;
    switch (k.b[paramDownloadState.ordinal()])
    {
    default:
      m = 2130838376;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      this.i.setBackgroundResource(m);
      this.i.setText(str);
      this.i.setTextColor(this.i.getContext().getResources().getColorStateList(k));
      return;
      str = this.j;
      m = 2130838376;
      continue;
      str = this.i.getContext().getResources().getString(2131625549);
      k = 2131361992;
      m = 2130838378;
      continue;
      str = this.i.getContext().getResources().getString(2131625327);
      k = 2131361992;
      m = 2130838378;
    }
  }

  public final void a(Model paramModel)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.update.l
 * JD-Core Version:    0.6.0
 */