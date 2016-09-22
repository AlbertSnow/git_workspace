package com.unionpay.mpay.widgets;

import android.view.View;
import android.view.View.OnClickListener;

final class aj
  implements View.OnClickListener
{
  aj(UPPinWidget paramUPPinWidget)
  {
  }

  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    int j = UPPinWidget.b(this.a);
    if (i == 10)
      UPPinWidget.c(this.a);
    do
      while (true)
      {
        return;
        if (i != 20)
          break;
        if (j <= 0)
          continue;
        this.a.deleteOnce(UPPinWidget.d(this.a));
        UPPinWidget.e(this.a);
        String str2 = this.a.f.b().toString().substring(0, j - 1);
        this.a.f.b(str2);
        this.a.f.b(str2.length());
        return;
      }
    while (UPPinWidget.b(this.a) == 6);
    this.a.appendOnce(UPPinWidget.d(this.a), Integer.toString(i));
    if (j == 0);
    for (String str1 = "*"; ; str1 = this.a.f.b() + "*")
    {
      this.a.f.b(str1);
      this.a.f.b(str1.length());
      UPPinWidget.f(this.a);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.aj
 * JD-Core Version:    0.6.0
 */