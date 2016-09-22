package com.alipay.wandoujia;

import android.app.Activity;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import org.json.JSONObject;

public final class ck extends ap
{
  private String b;
  private boolean c;
  private String d;
  private String e;
  private String f;

  protected final void a(View paramView1, View paramView2, String paramString)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView2.getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams1;
    if ((localLayoutParams instanceof RelativeLayout.LayoutParams))
    {
      localLayoutParams1 = (RelativeLayout.LayoutParams)localLayoutParams;
      localLayoutParams1.addRule(15);
      if (TextUtils.isEmpty(paramString))
        break label96;
      if (!TextUtils.equals("right", paramString))
        break label58;
      localLayoutParams1.addRule(11);
    }
    while (true)
    {
      paramView2.setLayoutParams(localLayoutParams1);
      return;
      label58: if (TextUtils.equals("left", paramString))
      {
        localLayoutParams1.addRule(9);
        continue;
      }
      if (!TextUtils.equals("center", paramString))
        continue;
      localLayoutParams1.addRule(14);
      continue;
      label96: if (paramView1 == null)
        continue;
      localLayoutParams1.addRule(1, paramView1.getId());
    }
  }

  public final void a(ViewGroup paramViewGroup, Activity paramActivity)
  {
    int i;
    int j;
    label38: LinearLayout.LayoutParams localLayoutParams;
    if (this.c)
    {
      i = 0;
      paramViewGroup.setVisibility(i);
      j = cv.b(this.d, paramActivity);
      if (j != 0)
        break label83;
      paramViewGroup.getLayoutParams().width = -2;
      if ((paramViewGroup.getLayoutParams() instanceof LinearLayout.LayoutParams))
      {
        localLayoutParams = (LinearLayout.LayoutParams)paramViewGroup.getLayoutParams();
        if (!TextUtils.equals("center", this.e))
          break label95;
        localLayoutParams.gravity = 17;
      }
    }
    label83: label95: 
    do
    {
      return;
      i = 8;
      break;
      paramViewGroup.getLayoutParams().width = j;
      break label38;
      if (!TextUtils.equals("left", this.e))
        continue;
      localLayoutParams.gravity = 19;
      return;
    }
    while (!TextUtils.equals("right", this.e));
    localLayoutParams.gravity = 21;
  }

  public final void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    this.b = paramJSONObject.optString("name");
    this.c = paramJSONObject.optBoolean("display", true);
    this.d = paramJSONObject.optString("width");
    this.e = paramJSONObject.optString("align");
    this.f = paramJSONObject.optString("height");
  }

  public final String c()
  {
    return this.b;
  }

  protected final int d()
  {
    return d.f("mini_ui_component");
  }

  public final void i()
  {
    super.i();
  }

  public final String o()
  {
    return this.f;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ck
 * JD-Core Version:    0.6.0
 */