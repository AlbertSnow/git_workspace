package com.wandoujia.p4.app.detail.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

final class l
  implements TextWatcher
{
  l(SendCommentActivity paramSendCommentActivity)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if (paramEditable.toString().length() > 1000)
    {
      SendCommentActivity localSendCommentActivity = this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(-1000 + paramEditable.length());
      String str = localSendCommentActivity.getString(2131624497, arrayOfObject);
      SendCommentActivity.f(this.a).setText(str);
      SendCommentActivity.f(this.a).setVisibility(0);
      return;
    }
    SendCommentActivity.f(this.a).setVisibility(8);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.activity.l
 * JD-Core Version:    0.6.0
 */