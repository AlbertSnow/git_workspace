package com.wandoujia.p4.community.fragmant;

import android.text.Editable;
import android.text.TextWatcher;

final class v
  implements TextWatcher
{
  v(CommunityPostContentFragment paramCommunityPostContentFragment)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    CommunityPostContentFragment.a(this.a, paramEditable.toString());
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.v
 * JD-Core Version:    0.6.0
 */