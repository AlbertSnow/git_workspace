package com.unionpay.mpay.widgets;

import android.view.ViewGroup.MarginLayoutParams;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.ScrollView;
import com.unionpay.mpay.a.a;

final class i
  implements PopupWindow.OnDismissListener
{
  i(f paramf)
  {
  }

  public final void onDismiss()
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)f.a(this.a).getLayoutParams();
    localMarginLayoutParams.bottomMargin = a.a;
    localMarginLayoutParams.height = f.b(this.a);
    f.a(this.a).setLayoutParams(localMarginLayoutParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.i
 * JD-Core Version:    0.6.0
 */