package com.wandoujia.p4.account.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.Timer;
import java.util.TimerTask;

final class r
  implements TextWatcher
{
  r(AccountChangePasswordActivity paramAccountChangePasswordActivity)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if (AccountChangePasswordActivity.a(this.a) != null)
    {
      AccountChangePasswordActivity.a(this.a).removeTextChangedListener(AccountChangePasswordActivity.b(this.a));
      AccountChangePasswordActivity.a(this.a).setTransformationMethod(null);
      AccountChangePasswordActivity.a(this.a).addTextChangedListener(AccountChangePasswordActivity.b(this.a));
      AccountChangePasswordActivity.a(this.a).setSelection(AccountChangePasswordActivity.a(this.a).getText().length());
      if (AccountChangePasswordActivity.c(this.a) == null)
        AccountChangePasswordActivity.a(this.a, new Timer());
      if (AccountChangePasswordActivity.d(this.a) != null)
      {
        AccountChangePasswordActivity.d(this.a).cancel();
        AccountChangePasswordActivity.c(this.a).purge();
      }
      AccountChangePasswordActivity.a(this.a, new s(this));
    }
    try
    {
      AccountChangePasswordActivity.c(this.a).schedule(AccountChangePasswordActivity.d(this.a), 1000L);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
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
 * Qualified Name:     com.wandoujia.p4.account.activity.r
 * JD-Core Version:    0.6.0
 */