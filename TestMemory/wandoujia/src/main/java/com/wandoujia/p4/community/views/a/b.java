package com.wandoujia.p4.community.views.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.mvc.Action;
import java.util.Map;

final class b
  implements DialogInterface.OnClickListener
{
  b(String[] paramArrayOfString, Map paramMap)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = this.a[paramInt];
    Action localAction = (Action)this.b.get(str);
    if (localAction != null)
      localAction.execute();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.a.b
 * JD-Core Version:    0.6.0
 */