package com.wandoujia.account.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageButton;
import com.wandoujia.account.widget.AccountEditText;

final class bh
  implements TextWatcher
{
  bh(AccountRegisterFragment paramAccountRegisterFragment)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if (AccountRegisterFragment.a(this.a).getText().toString().length() > 0)
    {
      AccountRegisterFragment.b(this.a).setVisibility(0);
      return;
    }
    AccountRegisterFragment.b(this.a).setVisibility(8);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.bh
 * JD-Core Version:    0.6.0
 */