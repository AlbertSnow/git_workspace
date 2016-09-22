package com.wandoujia.account.fragment;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.wandoujia.account.R.string;
import com.wandoujia.account.widget.AccountEditText;

final class bl
  implements View.OnFocusChangeListener
{
  bl(AccountRegisterFragment paramAccountRegisterFragment)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      AccountRegisterFragment.f(this.a).setHint(R.string.account_sdk_password_least_length);
      return;
    }
    AccountRegisterFragment.f(this.a).setHint(R.string.account_sdk_password_hint);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.bl
 * JD-Core Version:    0.6.0
 */