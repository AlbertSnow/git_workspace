package com.unionpay.mpay.widgets;

import android.content.Context;
import android.text.InputFilter.LengthFilter;
import org.json.JSONObject;

public final class a extends n
{
  public a(Context paramContext, int paramInt, JSONObject paramJSONObject)
  {
    super(paramContext, paramInt, paramJSONObject, 1014);
    this.f.a(new InputFilter.LengthFilter(3));
    this.f.a(2);
  }

  public final boolean a()
  {
    return 3 == b().length();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.a
 * JD-Core Version:    0.6.0
 */