package com.alipay.wandoujia;

import android.app.Activity;
import android.support.v4.app.b;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class bm extends bw
{
  private String b = "";
  private List c;
  private EditText d;
  private boolean e;
  private LinearLayout f;
  private String g;
  private String h;
  private String i;
  private boolean j = true;

  protected final int a()
  {
    return d.f("mini_ui_simple_password");
  }

  public final void a(TextWatcher paramTextWatcher)
  {
    this.d.addTextChangedListener(paramTextWatcher);
  }

  public final void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    this.e = paramJSONObject.optBoolean("auto", false);
    this.g = paramJSONObject.optString("format");
    this.h = paramJSONObject.optString("format_type");
    this.i = paramJSONObject.optString("format_msg");
  }

  public final void b()
  {
    this.j = false;
  }

  public final void d()
  {
    if ((this.d != null) && (this.j))
      this.d.postDelayed(new bn(this), 200L);
  }

  public final int e()
  {
    EditText localEditText = this.d;
    bz.a(localEditText);
    if (localEditText != null)
      return localEditText.getId();
    return 0;
  }

  public final boolean f()
  {
    if ((this.f == null) || (!o()));
    do
      return true;
    while (this.b.length() == 6);
    return false;
  }

  public final boolean g()
  {
    if ((f()) && (!TextUtils.isEmpty(this.g)))
      try
      {
        String str1 = this.b;
        if (TextUtils.equals(this.h, "md5"))
          str1 = b.a(str1);
        boolean bool = Pattern.compile(this.g).matcher(str1).matches();
        if (!bool)
        {
          Activity localActivity = (Activity)this.d.getContext();
          if (TextUtils.isEmpty(this.i))
          {
            String str2 = localActivity.getString(d.g("mini_format_error"));
            this.i = (t() + str2);
          }
          cv.b(this.d);
          b.a(localActivity, this.i);
        }
        return bool;
      }
      catch (Exception localException)
      {
      }
    return f();
  }

  public final JSONObject h()
  {
    JSONObject localJSONObject = v();
    try
    {
      localJSONObject.put(c(), this.b);
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
    if (this.c != null)
      this.c.clear();
    this.b = null;
    this.d = null;
    this.f = null;
  }

  protected final void j()
  {
  }

  public final String l()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.bm
 * JD-Core Version:    0.6.0
 */