package com.unionpay.mpay.widgets;

import android.content.Context;
import android.text.InputFilter.LengthFilter;
import com.unionpay.mpay.utils.e;
import org.json.JSONObject;

public final class ad extends n
{
  private int g = 0;

  public ad(Context paramContext, int paramInt, JSONObject paramJSONObject)
  {
    super(paramContext, paramInt, paramJSONObject, 1021);
    String str = e.a(paramJSONObject, "maxLength");
    if ((str != null) && (str.length() > 0));
    for (this.g = Integer.getInteger(str).intValue(); ; this.g = 23)
    {
      this.f.a(new InputFilter.LengthFilter(this.g));
      return;
    }
  }

  public final boolean a()
  {
    if (this.b);
    do
      return true;
    while (this.g >= b().length());
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.ad
 * JD-Core Version:    0.6.0
 */