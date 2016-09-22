package com.wandoujia.p4.gift.a;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.wandoujia.p4.account.activity.AccountProfileActivity;

final class i
  implements DialogInterface.OnClickListener
{
  i(g paramg)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent(c.a(this.a.a), AccountProfileActivity.class);
    c.a(this.a.a).startActivity(localIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.a.i
 * JD-Core Version:    0.6.0
 */