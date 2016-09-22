package com.wandoujia.account.fragment;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageButton;
import android.widget.TextView;

final class v
  implements TextWatcher
{
  v(AccountForgetPasswordFragment paramAccountForgetPasswordFragment)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AccountForgetPasswordFragment.b(this.a).setVisibility(8);
    if (TextUtils.isEmpty(paramEditable.toString()))
    {
      AccountForgetPasswordFragment.d(this.a).setVisibility(8);
      return;
    }
    AccountForgetPasswordFragment.d(this.a).setVisibility(0);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.v
 * JD-Core Version:    0.6.0
 */