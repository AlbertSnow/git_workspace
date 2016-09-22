package com.unionpay.mpay.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.text.InputFilter.LengthFilter;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import com.unionpay.mpay.a.a;
import com.unionpay.uppay.PayActivityEx;
import org.json.JSONObject;

public final class UPPinWidget extends n
  implements h.a
{
  private static final int g = a.n / 3;
  private int h;
  private boolean i = true;
  private String j = null;
  private int k = 0;
  private boolean l = false;
  private ViewTreeObserver.OnGlobalLayoutListener m = new ai(this);
  private f n = null;
  private View.OnClickListener o = new aj(this);

  public UPPinWidget(Context paramContext, int paramInt1, int paramInt2, JSONObject paramJSONObject)
  {
    super(paramContext, paramInt2, paramJSONObject, 1020);
    this.h = paramInt1;
    u();
    d();
  }

  public UPPinWidget(Context paramContext, int paramInt, JSONObject paramJSONObject)
  {
    super(paramContext, paramInt, paramJSONObject, 1020);
    u();
    d();
  }

  private void u()
  {
    this.f.a(this);
    this.f.a(new InputFilter.LengthFilter(6));
    this.f.a(0);
    this.f.c();
  }

  private void v()
  {
    if (w() != null)
      w().getViewTreeObserver().removeGlobalOnLayoutListener(this.m);
    if ((this.n != null) && (this.n.b()))
      this.n.a();
  }

  private View w()
  {
    return ((PayActivityEx)this.a).findViewById(8888);
  }

  public final void a(int paramInt)
  {
    this.h = paramInt;
  }

  public final void a(String paramString)
  {
    this.j = paramString;
  }

  public final void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
    if (paramBoolean)
    {
      ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f.getWindowToken(), 0);
      int i1 = 1;
      int i2 = w().getRootView().getHeight() - w().getHeight();
      Rect localRect = new Rect();
      getWindowVisibleDisplayFrame(localRect);
      if (i2 != localRect.top)
        i1 = 0;
      if (i1 != 0)
        h();
      do
        return;
      while ((f()) || (w() == null));
      w().getViewTreeObserver().addOnGlobalLayoutListener(this.m);
      return;
    }
    v();
  }

  public final boolean a()
  {
    return this.k == 6;
  }

  public final native void appendOnce(int paramInt, String paramString);

  public final String b()
  {
    if (this.i)
      return getPINBlock(this.h, this.j);
    return getPIN(this.h);
  }

  public final void b(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }

  public final boolean c()
  {
    new StringBuilder("mPINCounts =  ").append(this.k);
    return this.k != 0;
  }

  public final native void clearAll(int paramInt);

  public final void d()
  {
    if (this.k > 0)
    {
      clearAll(this.h);
      this.k = 0;
    }
  }

  public final native void deleteOnce(int paramInt);

  public final void e()
  {
    if ((this.l) && (!f()))
      h();
  }

  public final boolean f()
  {
    f localf = this.n;
    int i1 = 0;
    if (localf != null)
    {
      boolean bool = this.n.b();
      i1 = 0;
      if (bool)
        i1 = 1;
    }
    return i1;
  }

  public final void g()
  {
    if (f())
      v();
  }

  public final native String getPIN(int paramInt);

  public final native String getPINBlock(int paramInt, String paramString);

  public final void h()
  {
    if ((this.l) && (!f()))
    {
      this.n = new f(getContext(), this.o, this);
      this.n.a(this);
      int i1 = this.k;
      String str = "";
      for (int i2 = 0; i2 < i1; i2++)
        str = str + "*";
      this.f.b(str);
      this.f.b(str.length());
    }
  }

  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    g();
    d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.UPPinWidget
 * JD-Core Version:    0.6.0
 */