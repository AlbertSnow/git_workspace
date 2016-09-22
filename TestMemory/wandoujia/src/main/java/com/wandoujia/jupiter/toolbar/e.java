package com.wandoujia.jupiter.toolbar;

import android.text.Editable;
import android.text.TextWatcher;

final class e
  implements TextWatcher
{
  e(JupiterToolbarForSearch paramJupiterToolbarForSearch)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    JupiterToolbarForSearch.b(this.a);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.toolbar.e
 * JD-Core Version:    0.6.0
 */