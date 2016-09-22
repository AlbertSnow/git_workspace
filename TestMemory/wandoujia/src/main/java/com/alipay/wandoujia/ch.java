package com.alipay.wandoujia;

import android.support.v4.app.d;
import android.view.View;
import android.widget.CheckBox;
import org.json.JSONObject;

public final class ch extends bw
{
  private CheckBox b;
  private boolean c = true;
  private boolean d = false;

  protected final int a()
  {
    return d.f("mini_ui_checkbox");
  }

  public final void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    this.d = paramJSONObject.optBoolean("disable");
    this.c = paramJSONObject.optBoolean("must");
  }

  public final int e()
  {
    CheckBox localCheckBox = this.b;
    bz.a(localCheckBox);
    if (localCheckBox != null)
      return localCheckBox.getId();
    return 0;
  }

  public final boolean f()
  {
    if (!this.c);
    do
      return true;
    while ((this.b == null) || (!o()) || ((this.c) && (this.b.isChecked())));
    return false;
  }

  public final boolean g()
  {
    return f();
  }

  public final JSONObject h()
  {
    JSONObject localJSONObject = v();
    if (this.b.isChecked());
    try
    {
      localJSONObject.put(c(), n().toString());
      return localJSONObject;
    }
    catch (Exception localException)
    {
    }
    return localJSONObject;
  }

  public final void i()
  {
    super.i();
    this.b = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ch
 * JD-Core Version:    0.6.0
 */