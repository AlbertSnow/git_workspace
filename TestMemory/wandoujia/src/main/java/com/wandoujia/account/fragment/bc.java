package com.wandoujia.account.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.account.a;
import com.wandoujia.account.dto.Platform;
import com.wandoujia.account.f.b;

final class bc
  implements DialogInterface.OnClickListener
{
  bc(AccountModifyProfileFragment paramAccountModifyProfileFragment)
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
      AccountModifyProfileFragment.e(this.a);
      return;
    case 2:
      if (a.d() > 0L)
      {
        AccountModifyProfileFragment.a(this.a, Platform.SINA.getPlatform().toLowerCase());
        return;
      }
      AccountModifyProfileFragment.a(this.a, Platform.SINA);
      this.a.f.a(Platform.SINA, this.a.getActivity(), AccountModifyProfileFragment.f(this.a), "chooseAvatar");
      return;
    case 3:
      if (a.e() > 0L)
      {
        AccountModifyProfileFragment.a(this.a, Platform.QQ.getPlatform().toLowerCase());
        return;
      }
      AccountModifyProfileFragment.a(this.a, Platform.QQ);
      this.a.f.a(Platform.QQ, this.a.getActivity(), AccountModifyProfileFragment.f(this.a), "chooseAvatar");
      return;
    case 4:
    }
    if (a.f() > 0L)
    {
      AccountModifyProfileFragment.a(this.a, Platform.RENREN.getPlatform().toLowerCase());
      return;
    }
    AccountModifyProfileFragment.a(this.a, Platform.RENREN);
    this.a.f.a(Platform.RENREN, this.a.getActivity(), AccountModifyProfileFragment.f(this.a), "chooseAvatar");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.bc
 * JD-Core Version:    0.6.0
 */