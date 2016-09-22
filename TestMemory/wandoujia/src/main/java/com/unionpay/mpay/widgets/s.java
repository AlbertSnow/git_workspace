package com.unionpay.mpay.widgets;

import android.content.Context;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import org.json.JSONObject;

public final class s extends n
{
  private TextWatcher g = new aa(this);

  public s(Context paramContext, int paramInt, JSONObject paramJSONObject)
  {
    super(paramContext, paramInt, paramJSONObject, 1014, 0);
    this.f.a(this.g);
    this.f.a(new InputFilter.LengthFilter(23));
    this.f.a(2);
  }

  public final boolean a()
  {
    if (this.b)
      return true;
    String str = b();
    if ((13 <= str.length()) && (19 >= str.length()))
    {
      int i = str.length();
      int j = i - 2;
      int k = 0;
      int m = j;
      int n = 0;
      while (m >= 0)
      {
        int i3 = '￐' + str.charAt(m);
        if (k % 2 == 0)
        {
          int i4 = i3 * 2;
          i3 = i4 / 10 + i4 % 10;
        }
        n += i3;
        m--;
        k++;
      }
      int i1;
      if (n % 10 == 0)
      {
        i1 = 48;
        if (i1 != str.charAt(i - 1))
          break label159;
      }
      label159: for (int i2 = 1; ; i2 = 0)
      {
        if (i2 == 0)
          break label165;
        return true;
        i1 = (char)(48 + (10 - n % 10));
        break;
      }
    }
    label165: return false;
  }

  public final String b()
  {
    return this.f.b().replace(" ", "");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.s
 * JD-Core Version:    0.6.0
 */