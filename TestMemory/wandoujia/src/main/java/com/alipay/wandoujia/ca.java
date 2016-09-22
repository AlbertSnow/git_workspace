package com.alipay.wandoujia;

import android.app.Activity;
import android.support.v4.app.b;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ScrollView;
import org.json.JSONObject;

public final class ca extends ap
  implements rb
{
  private String b;
  private String c;
  private String d;
  private String e;
  private ViewGroup f;
  private boolean g;
  private ScrollView h;
  private int i;

  public final ViewGroup a(Activity paramActivity, ViewGroup paramViewGroup, boolean paramBoolean)
  {
    if ((!TextUtils.isEmpty(this.e)) && (this.e.equals("scroll")))
    {
      this.g = true;
      if (this.h == null)
        this.h = ((ScrollView)LayoutInflater.from(paramActivity).inflate(d.f("mini_ui_scroll"), paramViewGroup, false));
      ViewGroup localViewGroup = super.a(paramActivity, this.h, paramBoolean);
      localViewGroup.measure(0, 0);
      this.i = localViewGroup.getMeasuredHeight();
      if (this.h != null)
      {
        ViewGroup.LayoutParams localLayoutParams = this.h.getLayoutParams();
        if ((localLayoutParams != null) && (this.i > 0) && (this.i < localLayoutParams.height))
          localLayoutParams.height = (this.i + this.h.getPaddingTop() + this.h.getPaddingBottom());
      }
      this.h.addView(localViewGroup);
      this.h.smoothScrollTo(0, 0);
      return this.h;
    }
    return super.a(paramActivity, paramViewGroup, paramBoolean);
  }

  protected final void a(ViewGroup.LayoutParams paramLayoutParams, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.h != null)
    {
      super.a(paramLayoutParams, 0, 0, 0, 0);
      super.a(this.h.getLayoutParams(), paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    super.a(paramLayoutParams, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final void a(ViewGroup paramViewGroup, Activity paramActivity)
  {
    this.f = paramViewGroup;
    if (!TextUtils.isEmpty(this.b))
    {
      cv.a(this.b, new cb(this, paramViewGroup));
      if (!TextUtils.isEmpty(this.d))
        if (this.h == null)
          break label118;
    }
    label118: for (ViewGroup.LayoutParams localLayoutParams = this.h.getLayoutParams(); ; localLayoutParams = paramViewGroup.getLayoutParams())
    {
      while (true)
      {
        localLayoutParams.height = cv.a(this.d, paramActivity);
        if (this.g)
          this.f = this.h;
        return;
        if (TextUtils.isEmpty(this.c))
          break;
        try
        {
          paramViewGroup.setBackgroundColor(cv.a(this.c));
        }
        catch (Exception localException)
        {
          b.b(localException);
        }
      }
      break;
    }
  }

  public final void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    if (paramJSONObject.has("image"))
      this.b = paramJSONObject.optString("image");
    if (paramJSONObject.has("color"))
      this.c = paramJSONObject.optString("color");
    if (paramJSONObject.has("height"))
      this.d = paramJSONObject.optString("height");
    if (paramJSONObject.has("overflow"))
      this.e = paramJSONObject.optString("overflow");
    this.g = false;
  }

  public final boolean a()
  {
    if (this.g)
      this.f = this.h;
    if (this.f.getVisibility() == 8)
    {
      this.f.setVisibility(0);
      return true;
    }
    if (this.f.getVisibility() == 0)
    {
      this.f.setVisibility(8);
      return true;
    }
    return false;
  }

  protected final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.h != null)
    {
      this.h.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    super.b(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected final int d()
  {
    return d.f("mini_ui_block");
  }

  public final void i()
  {
    super.i();
    this.h = null;
    this.f = null;
  }

  public final String o()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ca
 * JD-Core Version:    0.6.0
 */