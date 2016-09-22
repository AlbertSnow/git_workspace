package com.alipay.wandoujia;

import android.support.v4.app.b;
import android.support.v4.app.d;
import android.view.View;
import android.widget.Spinner;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class cj extends bw
{
  private Map b;
  private Spinner c;
  private List d;
  private String e;

  protected final int a()
  {
    return d.f("mini_ui_combobox");
  }

  public final void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    this.e = paramJSONObject.optString("label");
  }

  public final int e()
  {
    Spinner localSpinner = this.c;
    bz.a(localSpinner);
    if (localSpinner != null)
      return localSpinner.getId();
    return 0;
  }

  public final JSONObject h()
  {
    JSONObject localJSONObject = v();
    try
    {
      localJSONObject.put(c(), this.b.get(this.c.getSelectedItem()));
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
    this.c = null;
    this.e = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.cj
 * JD-Core Version:    0.6.0
 */