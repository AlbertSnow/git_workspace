package com.unionpay.mpay.widgets;

import android.text.Editable;
import android.text.TextWatcher;

final class aa
  implements TextWatcher
{
  private boolean a = true;
  private int b;
  private boolean c = false;

  aa(s params)
  {
  }

  private String a(CharSequence paramCharSequence, int paramInt)
  {
    int i = 0;
    int j = paramCharSequence.length();
    StringBuffer localStringBuffer = new StringBuffer();
    for (int k = 0; k < j; k++)
    {
      char c1 = paramCharSequence.charAt(k);
      if (c1 != ' ')
      {
        i++;
        if ((k != 0) && ((i & 0x3) == 1))
          localStringBuffer.append(' ');
      }
      if (k == paramInt)
        this.b = localStringBuffer.length();
      if (c1 == ' ')
        continue;
      localStringBuffer.append(c1);
    }
    if (paramInt == j)
      this.b = localStringBuffer.length();
    return localStringBuffer.toString();
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 1) && (paramInt3 == 0) && (paramCharSequence.charAt(paramInt1) == ' '))
      this.c = true;
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!this.a)
      return;
    Object localObject;
    if (this.c)
    {
      localObject = paramCharSequence.subSequence(0, paramInt1 - 1);
      if (paramInt1 < paramCharSequence.length())
        localObject = localObject.toString() + paramCharSequence.subSequence(paramInt1, paramCharSequence.length());
      paramInt1--;
      this.c = false;
    }
    while (true)
    {
      this.a = false;
      String str = a((CharSequence)localObject, paramInt1 + paramInt3);
      this.d.f.b(str);
      h localh = this.d.f;
      if (this.b <= 23);
      for (int i = this.b; ; i = 23)
      {
        localh.b(i);
        this.a = true;
        return;
      }
      localObject = paramCharSequence;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.aa
 * JD-Core Version:    0.6.0
 */