package com.wandoujia.p4.community.views;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

final class t
  implements TextWatcher
{
  t(InternalLinkTextView paramInternalLinkTextView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    Editable localEditable = InternalLinkTextView.a(this.a, paramEditable);
    if (localEditable != null)
    {
      this.a.removeTextChangedListener(InternalLinkTextView.a(this.a));
      if ((InternalLinkTextView.b(this.a) == null) || (InternalLinkTextView.c(this.a) == null))
        break label87;
      this.a.setText(TextUtils.replace(localEditable, InternalLinkTextView.b(this.a), InternalLinkTextView.c(this.a)));
    }
    while (true)
    {
      this.a.addTextChangedListener(InternalLinkTextView.a(this.a));
      return;
      label87: this.a.setText(localEditable);
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
 * Qualified Name:     com.wandoujia.p4.community.views.t
 * JD-Core Version:    0.6.0
 */