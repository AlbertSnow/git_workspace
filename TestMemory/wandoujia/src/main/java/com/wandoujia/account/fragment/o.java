package com.wandoujia.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.wandoujia.account.R.string;
import com.wandoujia.account.dto.AccountVerification.AccountVerificationMethod;
import com.wandoujia.account.g.i;
import com.wandoujia.account.g.k;

final class o
  implements View.OnClickListener
{
  o(AccountCheckVerificationFragment paramAccountCheckVerificationFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (AccountCheckVerificationFragment.b(this.a))
    {
      this.a.b(this.a.getString(R.string.account_sdk_verification_waiting));
      if (AccountCheckVerificationFragment.c(this.a) == AccountVerification.AccountVerificationMethod.EMAIL)
        new Thread(new i("confirm", AccountCheckVerificationFragment.d(this.a), AccountCheckVerificationFragment.c(this.a).name(), AccountCheckVerificationFragment.e(this.a), this.a.f)).start();
    }
    else
    {
      return;
    }
    new Thread(new k("confirm", AccountCheckVerificationFragment.d(this.a), AccountCheckVerificationFragment.c(this.a).name(), AccountCheckVerificationFragment.f(this.a).getText().toString(), AccountCheckVerificationFragment.e(this.a), this.a.f)).start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.o
 * JD-Core Version:    0.6.0
 */