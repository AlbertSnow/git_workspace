package com.wandoujia.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioGroup;
import com.wandoujia.account.dto.AccountVerification;
import com.wandoujia.account.dto.AccountVerificationGroup;

final class s
  implements View.OnClickListener
{
  s(AccountChooseVerificationFragment paramAccountChooseVerificationFragment)
  {
  }

  public final void onClick(View paramView)
  {
    int i = AccountChooseVerificationFragment.a(this.a).getCheckedRadioButtonId();
    if ((AccountChooseVerificationFragment.b(this.a) != null) && (i >= 0) && (i < AccountChooseVerificationFragment.b(this.a).size()))
    {
      AccountVerification localAccountVerification = AccountChooseVerificationFragment.b(this.a).getVerifications()[i];
      ((e)this.a.getParentFragment()).a(AccountChooseVerificationFragment.b(this.a).getToken(), localAccountVerification);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.s
 * JD-Core Version:    0.6.0
 */