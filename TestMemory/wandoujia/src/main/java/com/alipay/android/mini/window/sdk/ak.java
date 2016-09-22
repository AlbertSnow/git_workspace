package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.support.v4.app.b;
import android.view.ViewGroup;
import android.view.Window;
import com.alipay.wandoujia.am;
import com.alipay.wandoujia.bd;
import com.alipay.wandoujia.c;
import com.alipay.wandoujia.ra;
import org.json.JSONException;
import org.json.JSONObject;

public final class ak extends au
{
  private bd g;
  private String h;

  protected ak(bd parambd)
  {
    super(parambd);
    this.g = parambd;
  }

  public final void a(Activity paramActivity, ViewGroup paramViewGroup)
  {
    paramActivity.getWindow().setLayout(-2, -2);
    paramActivity.getWindow().setBackgroundDrawable(null);
    if (paramViewGroup != null)
      paramViewGroup.removeAllViews();
    b.a(paramActivity, this.h);
  }

  protected final boolean a(ra paramra)
  {
    return false;
  }

  public final boolean a(Object paramObject, am paramam)
  {
    if ((paramam != null) && (paramam.b() == ra.d))
      this.g.c().g();
    return true;
  }

  public final void b(JSONObject paramJSONObject)
  {
    if (paramJSONObject.has("msg"))
      this.h = paramJSONObject.optString("msg");
    while (true)
    {
      return;
      if (!paramJSONObject.has("params"))
        continue;
      try
      {
        JSONObject localJSONObject = paramJSONObject.getJSONObject("params");
        if (!localJSONObject.has("msg"))
          continue;
        this.h = localJSONObject.getString("msg");
        return;
      }
      catch (JSONException localJSONException)
      {
      }
    }
  }

  protected final boolean b(ra paramra)
  {
    return false;
  }

  protected final boolean c()
  {
    return false;
  }

  public final void i()
  {
    super.i();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.ak
 * JD-Core Version:    0.6.0
 */