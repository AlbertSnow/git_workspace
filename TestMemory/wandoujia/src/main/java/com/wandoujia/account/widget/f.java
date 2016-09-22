package com.wandoujia.account.widget;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Timer;
import java.util.TimerTask;

final class f
  implements TextWatcher
{
  f(AccountEditText paramAccountEditText)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if (this.a != null)
    {
      this.a.removeTextChangedListener(AccountEditText.a(this.a));
      this.a.setTransformationMethod(null);
      this.a.addTextChangedListener(AccountEditText.a(this.a));
      this.a.setSelection(this.a.getText().length());
      if (AccountEditText.b(this.a) == null)
        AccountEditText.a(this.a, new Timer());
      if (AccountEditText.c(this.a) != null)
      {
        AccountEditText.c(this.a).cancel();
        AccountEditText.b(this.a).purge();
      }
      AccountEditText.a(this.a, new g(this));
    }
    try
    {
      AccountEditText.b(this.a).schedule(AccountEditText.c(this.a), 1000L);
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
 * Qualified Name:     com.wandoujia.account.widget.f
 * JD-Core Version:    0.6.0
 */