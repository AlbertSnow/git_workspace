package android.support.v7.widget;

import android.text.Editable;
import android.text.TextWatcher;

final class cu
  implements TextWatcher
{
  cu(SearchView paramSearchView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    SearchView.a(this.a, paramCharSequence);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.cu
 * JD-Core Version:    0.6.0
 */