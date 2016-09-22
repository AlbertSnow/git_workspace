package com.wandoujia.p4.gift.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.List;

final class b
  implements DialogInterface.OnClickListener
{
  b(a parama, List paramList)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    f localf = new f(this.b, 0);
    List[] arrayOfList = new List[1];
    arrayOfList[0] = this.a;
    android.support.v4.app.b.a(localf, arrayOfList);
    paramDialogInterface.dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.b.b
 * JD-Core Version:    0.6.0
 */