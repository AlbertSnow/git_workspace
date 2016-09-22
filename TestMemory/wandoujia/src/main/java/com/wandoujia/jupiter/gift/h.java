package com.wandoujia.jupiter.gift;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.wandoujia.p4.account.activity.AccountProfileActivity;

final class h
  implements DialogInterface.OnClickListener
{
  h(Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent(this.a, AccountProfileActivity.class);
    this.a.startActivity(localIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.gift.h
 * JD-Core Version:    0.6.0
 */