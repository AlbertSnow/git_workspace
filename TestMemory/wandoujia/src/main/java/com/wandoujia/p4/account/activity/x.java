package com.wandoujia.p4.account.activity;

import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;

final class x extends Handler
{
  x(AccountChangePasswordActivity paramAccountChangePasswordActivity)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
      return;
    case 0:
    }
    AccountChangePasswordActivity.a(this.a).removeTextChangedListener(AccountChangePasswordActivity.b(this.a));
    AccountChangePasswordActivity.a(this.a).setTransformationMethod(new PasswordTransformationMethod());
    AccountChangePasswordActivity.a(this.a).setSelection(AccountChangePasswordActivity.a(this.a).getText().length());
    AccountChangePasswordActivity.a(this.a).addTextChangedListener(AccountChangePasswordActivity.b(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.x
 * JD-Core Version:    0.6.0
 */