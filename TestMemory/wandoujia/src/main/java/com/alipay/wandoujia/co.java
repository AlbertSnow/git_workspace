package com.alipay.wandoujia;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.b;
import android.support.v4.app.d;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.mini.widget.CustomEditText;
import com.alipay.android.mini.widget.c;
import com.wandoujia.jupiter.d.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class co extends bw
{
  private CustomEditText b;
  private LinearLayout c;
  private TextView d;
  private TextView e;
  private String f;
  private a g;
  private String h;
  private String i;
  private int j;
  private int k;
  private String l;
  private String m;
  private String n;
  private boolean o = false;
  private boolean p;
  private c q;
  private String r;
  private String s;
  private boolean t = false;
  private Activity u;
  private boolean v = false;
  private String w = "";

  private String y()
  {
    Editable localEditable = this.b.getText();
    if (localEditable.length() == 0)
      return "";
    return localEditable.toString().replaceAll(" ", "");
  }

  private void z()
  {
    a(this, new at(this));
  }

  protected int a()
  {
    return d.f("mini_ui_lable_input");
  }

  public final int a(int paramInt)
  {
    if (this.b != null)
    {
      int i1 = this.e.getMeasuredWidth();
      if (i1 >= paramInt)
        return i1;
      this.e.setWidth(paramInt);
      return paramInt;
    }
    return 0;
  }

  public void a(String paramString)
  {
    if (this.b == null);
    do
      return;
    while (TextUtils.isEmpty(paramString));
    this.b.post(new aq(this, paramString));
  }

  public void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    this.f = paramJSONObject.optString("width");
    this.g = a.a(paramJSONObject, "onload");
    JSONObject localJSONObject = paramJSONObject.optJSONObject("smsread");
    JSONArray localJSONArray;
    StringBuilder localStringBuilder;
    if (localJSONObject != null)
    {
      this.h = localJSONObject.optString("template");
      localJSONArray = localJSONObject.optJSONArray("rules");
      if (localJSONArray != null)
        localStringBuilder = new StringBuilder();
    }
    for (int i1 = 0; ; i1++)
    {
      if (i1 >= localJSONArray.length())
      {
        this.i = localStringBuilder.toString();
        this.j = localJSONObject.optInt("tempGroup", 0);
        this.k = localJSONObject.optInt("readTime", 180);
        this.l = paramJSONObject.optString("label");
        this.m = paramJSONObject.optString("keyboard");
        this.n = paramJSONObject.optString("content");
        this.o = paramJSONObject.optBoolean("disable");
        this.r = paramJSONObject.optString("format");
        this.t = paramJSONObject.optBoolean("encoded");
        this.s = paramJSONObject.optString("format_msg");
        this.p = paramJSONObject.optBoolean("must", true);
        return;
      }
      if (i1 > 0)
        localStringBuilder.append(",");
      localStringBuilder.append(localJSONArray.optString(i1));
    }
  }

  public final String b()
  {
    if (this.b != null)
      return this.b.getText().toString();
    return null;
  }

  public final void d()
  {
    if (this.b != null)
      this.b.postDelayed(new cr(this), 200L);
  }

  public int e()
  {
    CustomEditText localCustomEditText = this.b;
    bz.a(localCustomEditText);
    if (localCustomEditText != null)
      return localCustomEditText.getId();
    return 0;
  }

  public boolean f()
  {
    if (!this.p)
      return true;
    if ((this.b == null) || (!o()))
    {
      this.d.setVisibility(8);
      return true;
    }
    if (TextUtils.isEmpty(this.b.getText().toString()))
      return false;
    this.d.setVisibility(8);
    return true;
  }

  public boolean g()
  {
    if (!this.p);
    do
    {
      return true;
      if (!f())
        return false;
    }
    while (TextUtils.isEmpty(this.r));
    try
    {
      boolean bool = Pattern.compile(this.r).matcher(y()).matches();
      if (!bool)
      {
        this.e.setTextColor(-65536);
        if (TextUtils.isEmpty(this.s))
        {
          String str = this.b.getContext().getString(d.g("mini_format_error"));
          this.s = (t() + str);
        }
        cv.b(this.b);
        b.a(this.u, this.s);
      }
      return bool;
    }
    catch (Exception localException)
    {
    }
    return true;
  }

  public JSONObject h()
  {
    JSONObject localJSONObject = v();
    try
    {
      String str = y();
      localJSONObject.put(c(), str);
      if ((this.v) && (TextUtils.equals(this.w, str)))
        localJSONObject.put("local", "Y");
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      b.b(localJSONException);
    }
    return localJSONObject;
  }

  public void i()
  {
    super.i();
    if (this.b != null)
      this.d.setVisibility(8);
    this.q = null;
    this.b = null;
    this.l = null;
    this.g = null;
    this.u = null;
  }

  protected final void j()
  {
    ra localra;
    if (this.g != null)
    {
      localra = ra.a$65b37f89(this.g);
      if (localra == ra.l)
        z();
    }
    else
    {
      return;
    }
    a(this, new am(localra));
  }

  public final EditText l()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.co
 * JD-Core Version:    0.6.0
 */