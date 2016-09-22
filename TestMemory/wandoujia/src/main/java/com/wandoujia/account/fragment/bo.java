package com.wandoujia.account.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.account.dto.WandouResponse;

final class bo
  implements DialogInterface.OnClickListener
{
  bo(AccountRegisterFragment paramAccountRegisterFragment, WandouResponse paramWandouResponse)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.a.getError() == 1000001)
      AccountRegisterFragment.e(this.b);
    paramDialogInterface.dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.bo
 * JD-Core Version:    0.6.0
 */