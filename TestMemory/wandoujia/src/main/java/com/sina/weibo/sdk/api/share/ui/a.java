package com.sina.weibo.sdk.api.share.ui;

import android.text.Editable;
import android.text.Selection;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

final class a extends InputConnectionWrapper
{
  a(EditBlogView paramEditBlogView, InputConnection paramInputConnection)
  {
    super(paramInputConnection, false);
  }

  public final boolean commitText(CharSequence paramCharSequence, int paramInt)
  {
    Editable localEditable = this.a.getEditableText();
    new String(localEditable.toString());
    int i = Selection.getSelectionStart(localEditable);
    int j = Selection.getSelectionEnd(localEditable);
    int k;
    int m;
    if ((i != -1) && (j != -1))
    {
      k = this.a.a(i);
      m = this.a.a(j);
      if (k <= m)
        break label128;
    }
    while (true)
    {
      if ((m != i) || (k != j))
        Selection.setSelection(localEditable, m, k);
      if (m != k)
        this.a.getText().delete(m, k);
      return super.commitText(paramCharSequence, paramInt);
      label128: int n = m;
      m = k;
      k = n;
    }
  }

  public final boolean setComposingText(CharSequence paramCharSequence, int paramInt)
  {
    Editable localEditable = this.a.getEditableText();
    new String(localEditable.toString());
    int i = Selection.getSelectionStart(localEditable);
    int j = Selection.getSelectionEnd(localEditable);
    int k;
    int m;
    if ((i != -1) && (j != -1))
    {
      k = this.a.a(i);
      m = this.a.a(j);
      if (k <= m)
        break label128;
    }
    while (true)
    {
      if ((m != i) || (k != j))
        Selection.setSelection(localEditable, m, k);
      if (m != k)
        this.a.getText().delete(m, k);
      return super.setComposingText(paramCharSequence, paramInt);
      label128: int n = m;
      m = k;
      k = n;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.api.share.ui.a
 * JD-Core Version:    0.6.0
 */