package com.wandoujia.account.fragment;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageButton;
import android.widget.TextView;

final class cl
  implements TextWatcher
{
  cl(AccountResetPasswordFragment paramAccountResetPasswordFragment)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    int i = 8;
    AccountResetPasswordFragment.e(this.a).setVisibility(i);
    ImageButton localImageButton = AccountResetPasswordFragment.k(this.a);
    if (TextUtils.isEmpty(paramEditable.toString()));
    while (true)
    {
      localImageButton.setVisibility(i);
      return;
      i = 0;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.cl
 * JD-Core Version:    0.6.0
 */