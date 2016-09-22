package com.wandoujia.p4.app.detail.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.view.p;

final class a
  implements TextWatcher
{
  a(AppCommentsFragment paramAppCommentsFragment)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if (paramEditable.toString().length() > 1000)
    {
      AppCommentsFragment localAppCommentsFragment = this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(-1000 + paramEditable.length());
      String str = localAppCommentsFragment.getString(2131624497, arrayOfObject);
      p.a(JupiterApplication.e(), str, p.b).a();
      AppCommentsFragment.a(this.a).setEnabled(false);
      return;
    }
    AppCommentsFragment.a(this.a).setEnabled(true);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.fragment.a
 * JD-Core Version:    0.6.0
 */