package com.alipay.wandoujia;

import android.text.TextUtils;
import com.wandoujia.jupiter.d.a;
import org.json.JSONObject;

public final class al extends ai
{
  private int a;
  private boolean b = false;

  protected al(t paramt, u paramu)
  {
    super(paramt, paramu);
  }

  public final void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    if (paramJSONObject.has("form"))
    {
      JSONObject localJSONObject = paramJSONObject.optJSONObject("form");
      String str = localJSONObject.optString("type");
      a(Boolean.parseBoolean(localJSONObject.optString("oneTime")));
      if (TextUtils.equals("page", str))
      {
        this.b = true;
        this.a = 9;
      }
      do
        while (true)
        {
          return;
          if (!TextUtils.equals("toast", str))
            break;
          a locala = a.a(localJSONObject, "onload");
          this.a = 6;
          if ((locala == null) || (ra.a$65b37f89(locala) != ra.r))
            continue;
          this.a = 10;
          return;
        }
      while (TextUtils.equals("confirm", str));
      this.b = localJSONObject.optBoolean("fullscreen", false);
      this.a = 4;
      return;
    }
    if (qb.a(paramJSONObject.optString("status")) == qb.h)
    {
      this.a = -10;
      return;
    }
    this.a = 8;
  }

  public final boolean e()
  {
    return (this.a == 4) || (this.a == 9) || (this.a == 10);
  }

  public final int f()
  {
    return this.a;
  }

  public final boolean h()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.al
 * JD-Core Version:    0.6.0
 */