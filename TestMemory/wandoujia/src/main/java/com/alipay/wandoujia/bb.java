package com.alipay.wandoujia;

import android.support.v4.app.b;
import android.support.v4.app.d;
import android.util.SparseArray;
import android.view.View;
import android.widget.RadioGroup;
import org.json.JSONException;
import org.json.JSONObject;

public final class bb extends bw
{
  private RadioGroup b;
  private SparseArray c;

  protected final int a()
  {
    return d.f("mini_ui_radio");
  }

  public final int e()
  {
    RadioGroup localRadioGroup = this.b;
    bz.a(localRadioGroup);
    if (localRadioGroup != null)
      return localRadioGroup.getId();
    return 0;
  }

  public final JSONObject h()
  {
    JSONObject localJSONObject = v();
    try
    {
      localJSONObject.put(c(), this.c.get(this.b.getCheckedRadioButtonId()));
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      b.b(localJSONException);
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
 * Qualified Name:     com.alipay.wandoujia.bb
 * JD-Core Version:    0.6.0
 */