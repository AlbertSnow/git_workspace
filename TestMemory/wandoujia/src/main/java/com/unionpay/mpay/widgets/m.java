package com.unionpay.mpay.widgets;

import android.content.Context;
import org.json.JSONObject;

public abstract class m extends ah
  implements ah.a
{
  public m(Context paramContext, JSONObject paramJSONObject)
  {
    super(paramContext, paramJSONObject);
  }

  public final String q()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if ((j() != null) && (b() != null))
    {
      localStringBuffer.append("\"");
      localStringBuffer.append(j());
      localStringBuffer.append("\":");
      localStringBuffer.append("\"");
      localStringBuffer.append(b());
      localStringBuffer.append("\"");
    }
    return localStringBuffer.toString();
  }

  public final void r()
  {
    o();
    p();
  }

  public final void s()
  {
    n();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.m
 * JD-Core Version:    0.6.0
 */