package com.wandoujia.account.fragment;

import android.app.ProgressDialog;
import com.wandoujia.account.R.string;
import com.wandoujia.account.dto.Platform;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.listener.b;

final class bf
  implements b
{
  bf(AccountModifyProfileFragment paramAccountModifyProfileFragment)
  {
  }

  public final void a()
  {
    if (this.a.e != null)
      this.a.e.dismiss();
    if ((AccountModifyProfileFragment.i(this.a) == Platform.SINA) || (AccountModifyProfileFragment.i(this.a) == Platform.QQ) || (AccountModifyProfileFragment.i(this.a) == Platform.RENREN))
      AccountModifyProfileFragment.a(this.a, AccountModifyProfileFragment.i(this.a).getPlatform().toLowerCase());
  }

  public final void a(WandouResponse paramWandouResponse)
  {
    if (this.a.e != null)
      this.a.e.dismiss();
    if (paramWandouResponse.getError() != 1000010)
      AccountModifyProfileFragment.a(this.a, this.a.getString(R.string.account_sdk_bind_failure), paramWandouResponse);
  }

  public final void b()
  {
    if (AccountModifyProfileFragment.i(this.a) == Platform.SINA)
    {
      if (this.a.e != null)
        this.a.e.dismiss();
      this.a.e = ProgressDialog.show(this.a.getActivity(), "", this.a.getString(R.string.account_sdk_bind_waiting));
      this.a.e.show();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.bf
 * JD-Core Version:    0.6.0
 */