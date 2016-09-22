package com.wandoujia.p4.pay.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

class PayFragment$1
  implements TextWatcher
{
  public void afterTextChanged(Editable paramEditable)
  {
    Button localButton;
    if (PayFragment.access$000(this.this$0).getVisibility() != 0)
    {
      localButton = PayFragment.access$100(this.this$0);
      if (paramEditable.length() <= 0)
        break label38;
    }
    label38: for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      return;
    }
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.1
 * JD-Core Version:    0.6.0
 */