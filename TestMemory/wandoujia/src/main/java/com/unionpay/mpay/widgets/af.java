package com.unionpay.mpay.widgets;

import android.content.Context;
import android.text.InputFilter.LengthFilter;
import java.util.Calendar;
import org.json.JSONObject;

public final class af extends n
{
  public af(Context paramContext, int paramInt, JSONObject paramJSONObject)
  {
    super(paramContext, paramInt, paramJSONObject, 1015);
    this.f.a(new InputFilter.LengthFilter(4));
    this.f.a(2);
  }

  public final boolean a()
  {
    String str = b();
    if (4 == str.length())
    {
      int i = Integer.parseInt(str.substring(0, 2));
      int j = Integer.parseInt(str.substring(2));
      int k = Calendar.getInstance().get(1) % 100;
      int m = 1 + Calendar.getInstance().get(2);
      if ((i > 0) && (i <= 12) && ((j > k) || ((j == k) && (i >= m))));
      for (int n = 1; n != 0; n = 0)
        return true;
    }
    return false;
  }

  public final String b()
  {
    return this.f.b().trim();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.af
 * JD-Core Version:    0.6.0
 */