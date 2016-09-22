package com.alipay.wandoujia;

import android.app.Activity;
import android.support.v4.app.b;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.alipay.android.app.exception.AppErrorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public abstract class ap
  implements sg
{
  protected List a = new ArrayList();
  private ViewGroup b;
  private String c;
  private int[] d = new int[4];
  private int[] e = new int[4];
  private boolean f = false;
  private boolean g = false;
  private String h;
  private boolean i = false;

  public ViewGroup a(Activity paramActivity, ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int j;
    int k;
    Object localObject;
    if (this.b == null)
    {
      this.b = ((ViewGroup)LayoutInflater.from(paramActivity).inflate(d(), paramViewGroup, false));
      j = this.a.size();
      k = 0;
      localObject = null;
    }
    while (true)
    {
      if (k >= j)
      {
        if (this.f)
          b(this.e[1], this.e[0], this.e[3], this.e[2]);
        a(this.b.getLayoutParams(), this.d[1], this.d[0], this.d[3], this.d[2]);
      }
      try
      {
        a(this.b, paramActivity);
        return this.b;
        sh localsh = (sh)this.a.get(k);
        View localView = (View)localsh.b(paramActivity, this.b, paramBoolean);
        if (this.i)
        {
          if (k != 0)
            break label225;
          localView.setBackgroundResource(d.e("mini_block_not_margin_top_bg"));
        }
        while (true)
        {
          a((View)localObject, localView, localsh.k());
          this.b.addView(localView);
          k++;
          localObject = localView;
          break;
          label225: if (k == j - 1)
          {
            localView.setBackgroundResource(d.e("mini_block_not_margin_bottom_bg"));
            continue;
          }
          localView.setBackgroundResource(d.e("mini_block_not_margin_middle_bg"));
        }
      }
      catch (AppErrorException localAppErrorException)
      {
        while (true)
          b.b(localAppErrorException);
      }
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  protected void a(View paramView1, View paramView2, String paramString)
  {
    int j;
    int k;
    if (!TextUtils.isEmpty(paramString))
      switch (tb.valueOf(paramString).a())
      {
      default:
        j = 3;
        k = 9;
        if (!(this.b instanceof LinearLayout))
          break;
        ((LinearLayout.LayoutParams)paramView2.getLayoutParams()).gravity = j;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
    do
    {
      return;
      j = 5;
      k = 11;
      break;
      j = 48;
      k = 10;
      break;
      j = 80;
      k = 12;
      break;
      j = 16;
      k = 15;
      break;
      j = 1;
      k = 14;
      break;
      j = 17;
      k = 13;
      break;
      if (!(this.b instanceof FrameLayout))
        continue;
      ((FrameLayout.LayoutParams)paramView2.getLayoutParams()).gravity = j;
      return;
    }
    while (!(this.b instanceof RelativeLayout));
    ((RelativeLayout.LayoutParams)paramView2.getLayoutParams()).addRule(k);
  }

  protected void a(ViewGroup.LayoutParams paramLayoutParams, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.g)
    {
      if (!(paramLayoutParams instanceof LinearLayout.LayoutParams))
        break label28;
      ((LinearLayout.LayoutParams)paramLayoutParams).setMargins(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    label28: 
    do
    {
      return;
      if (!(paramLayoutParams instanceof RelativeLayout.LayoutParams))
        continue;
      ((RelativeLayout.LayoutParams)paramLayoutParams).setMargins(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    while (!(paramLayoutParams instanceof FrameLayout.LayoutParams));
    ((FrameLayout.LayoutParams)paramLayoutParams).setMargins(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected abstract void a(ViewGroup paramViewGroup, Activity paramActivity);

  public void a(sh paramsh)
  {
    this.a.add(paramsh);
  }

  public final void a(String paramString)
  {
  }

  public void a(JSONObject paramJSONObject)
  {
    this.c = paramJSONObject.optString("name");
    paramJSONObject.optString("type");
    this.h = paramJSONObject.optString("content");
    String str1 = paramJSONObject.optString("padding");
    String str2 = paramJSONObject.optString("margin");
    if (!TextUtils.isEmpty(str1))
    {
      this.f = true;
      this.e = cv.d(str1);
    }
    if (!TextUtils.isEmpty(str2))
    {
      this.g = true;
      this.d = cv.e(str2);
    }
    if (paramJSONObject.has("together"))
      this.i = paramJSONObject.optBoolean("together");
  }

  protected void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.b.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final boolean b()
  {
    return this.i;
  }

  public String c()
  {
    return this.c;
  }

  protected abstract int d();

  public int e()
  {
    return 0;
  }

  public boolean f()
  {
    return true;
  }

  public boolean g()
  {
    return true;
  }

  public final JSONObject h()
  {
    return null;
  }

  public void i()
  {
    Iterator localIterator = this.a.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        this.b = null;
        this.a = null;
        return;
      }
      ((sh)localIterator.next()).i();
    }
  }

  public String k()
  {
    return null;
  }

  public String l()
  {
    return this.h;
  }

  public Object m()
  {
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ap
 * JD-Core Version:    0.6.0
 */