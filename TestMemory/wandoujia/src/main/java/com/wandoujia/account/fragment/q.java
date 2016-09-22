package com.wandoujia.account.fragment;

import android.content.res.Resources;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.widget.TextView;
import com.wandoujia.account.R.color;
import com.wandoujia.account.R.string;
import com.wandoujia.account.dto.AccountVerification.AccountVerificationMethod;

final class q extends CountDownTimer
{
  q(AccountCheckVerificationFragment paramAccountCheckVerificationFragment, Fragment paramFragment)
  {
    super(30000L, 1000L);
  }

  public final void onFinish()
  {
    if ((this.b.getActivity() != null) && (this.b.isAdded()))
    {
      if (AccountCheckVerificationFragment.c(this.b) != AccountVerification.AccountVerificationMethod.EMAIL)
        break label88;
      AccountCheckVerificationFragment.g(this.b).setText(this.a.getString(R.string.account_sdk_verification_email_resend_complete));
    }
    while (true)
    {
      AccountCheckVerificationFragment.g(this.b).setClickable(true);
      AccountCheckVerificationFragment.g(this.b).setTextColor(this.b.getResources().getColor(R.color.account_sdk_holo_blue));
      return;
      label88: if (AccountCheckVerificationFragment.c(this.b) != AccountVerification.AccountVerificationMethod.SMS)
        continue;
      AccountCheckVerificationFragment.g(this.b).setText(this.a.getString(R.string.account_sdk_verification_tel_resend_complete));
    }
  }

  public final void onTick(long paramLong)
  {
    if (this.b.isAdded())
    {
      if (AccountCheckVerificationFragment.c(this.b) == AccountVerification.AccountVerificationMethod.EMAIL)
      {
        TextView localTextView2 = AccountCheckVerificationFragment.g(this.b);
        Fragment localFragment2 = this.a;
        int j = R.string.account_sdk_verification_email_resend_hint;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Long.valueOf(paramLong / 1000L);
        localTextView2.setText(localFragment2.getString(j, arrayOfObject2));
      }
      do
        return;
      while (AccountCheckVerificationFragment.c(this.b) != AccountVerification.AccountVerificationMethod.SMS);
      TextView localTextView1 = AccountCheckVerificationFragment.g(this.b);
      Fragment localFragment1 = this.a;
      int i = R.string.account_sdk_verification_tel_resend_hint;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(paramLong / 1000L);
      localTextView1.setText(localFragment1.getString(i, arrayOfObject1));
      return;
    }
    AccountCheckVerificationFragment.h(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.q
 * JD-Core Version:    0.6.0
 */