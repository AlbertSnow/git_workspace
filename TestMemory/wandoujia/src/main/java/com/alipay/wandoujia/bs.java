package com.alipay.wandoujia;

import android.support.v4.app.b;
import android.support.v4.app.d;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import org.json.JSONException;
import org.json.JSONObject;

public final class bs extends bw
{
  private EditText b;

  protected final int a()
  {
    return d.f("mini_ui_textarea");
  }

  public final void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
  }

  public final int e()
  {
    EditText localEditText = this.b;
    bz.a(localEditText);
    if (localEditText != null)
      return localEditText.getId();
    return 0;
  }

  public final JSONObject h()
  {
    JSONObject localJSONObject = v();
    try
    {
      localJSONObject.put(c(), this.b.getText().toString());
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
 * Qualified Name:     com.alipay.wandoujia.bs
 * JD-Core Version:    0.6.0
 */