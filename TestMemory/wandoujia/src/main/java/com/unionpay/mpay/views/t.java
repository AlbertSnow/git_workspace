package com.unionpay.mpay.views;

import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.mpay.b.c;
import com.unionpay.mpay.utils.UPPayEngine;
import com.unionpay.mpay.widgets.k;
import java.util.List;

final class t
  implements View.OnClickListener
{
  t(ao paramao)
  {
  }

  public final void onClick(View paramView)
  {
    this.a.b.a(c.ab.B);
    String str1;
    if (this.a.g())
    {
      str1 = "0";
      if (!this.a.g())
        break label71;
    }
    label71: Object[] arrayOfObject;
    for (String str2 = this.a.a.C; ; str2 = String.format("\"card\":\"%s\"", arrayOfObject))
    {
      this.a.e.a(str1, str2);
      return;
      str1 = "1";
      break;
      arrayOfObject = new Object[1];
      arrayOfObject[0] = ((com.unionpay.pboctransaction.model.b)this.a.a.h.get(this.a.a.B)).a();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.t
 * JD-Core Version:    0.6.0
 */