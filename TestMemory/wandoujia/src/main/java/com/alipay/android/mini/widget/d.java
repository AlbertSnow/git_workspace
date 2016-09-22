package com.alipay.android.mini.widget;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

final class d
  implements TextWatcher
{
  private int a = 0;
  private int b = 0;
  private boolean c = false;
  private int d = 0;
  private char[] e;
  private StringBuffer f = new StringBuffer();
  private int g = 0;

  d(c paramc)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    int i;
    int j;
    int k;
    int m;
    label51: String str;
    if (this.c)
    {
      this.d = c.b(this.h).getSelectionEnd();
      i = 0;
      if (i < this.f.length())
        break label186;
      j = 1 + c.a(this.h);
      k = 0;
      m = 0;
      if (m < this.f.length())
        break label217;
      if (k > this.g)
        this.d += k - this.g;
      this.e = new char[this.f.length()];
      this.f.getChars(0, this.f.length(), this.e, 0);
      str = this.f.toString();
      if (this.d <= str.length())
        break label266;
      this.d = str.length();
    }
    while (true)
    {
      c.b(this.h).setText(str);
      Selection.setSelection(c.b(this.h).getText(), this.d);
      this.c = false;
      return;
      label186: if (this.f.charAt(i) == ' ')
      {
        this.f.deleteCharAt(i);
        break;
      }
      i++;
      break;
      label217: if ((m == c.a(this.h)) || ((m - c.a(this.h)) % j == 0))
      {
        this.f.insert(m, ' ');
        k++;
      }
      m++;
      break label51;
      label266: if (this.d >= 0)
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
    if ((this.b == this.a) || (this.b <= -1 + c.a(this.h)) || (this.c))
    {
      this.c = false;
      return;
    }
    this.c = true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.d
 * JD-Core Version:    0.6.0
 */