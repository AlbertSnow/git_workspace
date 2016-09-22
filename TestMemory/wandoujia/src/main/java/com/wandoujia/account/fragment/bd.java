package com.wandoujia.account.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class bd
  implements DialogInterface.OnClickListener
{
  bd(AccountModifyProfileFragment paramAccountModifyProfileFragment)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
      AccountModifyProfileFragment.d(this.a);
      return;
    case 1:
    }
    AccountModifyProfileFragment.e(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.bd
 * JD-Core Version:    0.6.0
 */