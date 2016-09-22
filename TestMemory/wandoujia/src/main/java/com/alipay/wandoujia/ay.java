package com.alipay.wandoujia;

import android.support.v4.app.d;
import android.widget.TextView;
import com.wandoujia.jupiter.d.a;
import org.json.JSONObject;

public final class ay extends bw
{
  private a b;
  private TextView c = null;

  protected final int a()
  {
    return d.f("mini_ui_link");
  }

  public final void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    this.b = a.a(paramJSONObject, "onclick");
  }

  public final int e()
  {
    TextView localTextView = this.c;
    int i = 0;
    if (localTextView != null)
    {
      bz.a(this.c);
      i = this.c.getId();
    }
    return i;
  }

  public final JSONObject h()
  {
    return v();
  }

  public final void i()
  {
    super.i();
    this.c = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ay
 * JD-Core Version:    0.6.0
 */