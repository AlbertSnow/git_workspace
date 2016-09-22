package com.alipay.android.mini.widget;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

final class h
  implements TextWatcher
{
  private int a = 0;
  private int b = 0;
  private boolean c = false;
  private int d = 0;
  private char[] e;
  private StringBuffer f = new StringBuffer();
  private int g = 0;

  h(g paramg)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    int i;
    int j;
    int k;
    label40: String str;
    if (this.c)
    {
      this.d = g.b(this.h).getSelectionEnd();
      i = 0;
      if (i < this.f.length())
        break label175;
      j = 0;
      k = 0;
      if (k < this.f.length())
        break label206;
      if (j > this.g)
        this.d += j - this.g;
      this.e = new char[this.f.length()];
      this.f.getChars(0, this.f.length(), this.e, 0);
      str = this.f.toString();
      if (this.d <= str.length())
        break label240;
      this.d = str.length();
    }
    while (true)
    {
      g.b(this.h).setText(str);
      Selection.setSelection(g.b(this.h).getText(), this.d);
      this.c = false;
      return;
      label175: if (this.f.charAt(i) == ' ')
      {
        this.f.deleteCharAt(i);
        break;
      }
      i++;
      break;
      label206: if ((k == 3) || (k == 8))
      {
        this.f.insert(k, ' ');
        j++;
      }
      k++;
      break label40;
      label240: if (this.d >= 0)
        continue;
      this.d = 0;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    this.a = paramCharSequence.length();
    if (this.f.length() > 0)
      this.f.delete(0, this.f.length());
    this.g = 0;
    while (true)
    {
      if (i >= paramCharSequence.length())
        return;
      if (paramCharSequence.charAt(i) == ' ')
        this.g = (1 + this.g);
      i++;
    }
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = paramCharSequence.length();
    this.f.append(paramCharSequence.toString());
    if ((this.b == this.a) || (this.b <= -1 + g.a(this.h)) || (this.c))
    {
      this.c = false;
      return;
    }
    this.c = true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.h
 * JD-Core Version:    0.6.0
 */