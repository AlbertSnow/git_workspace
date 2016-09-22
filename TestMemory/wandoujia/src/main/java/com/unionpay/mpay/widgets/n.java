package com.unionpay.mpay.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.unionpay.mpay.c.c;
import com.unionpay.mpay.utils.e;
import org.json.JSONObject;

public abstract class n extends m
{
  protected int e;
  protected h f = null;
  private n.a g = null;

  public n(Context paramContext, int paramInt1, JSONObject paramJSONObject, int paramInt2)
  {
    this(paramContext, paramInt1, paramJSONObject, paramInt2, 0);
  }

  public n(Context paramContext, int paramInt1, JSONObject paramJSONObject, int paramInt2, byte paramByte)
  {
    super(paramContext, paramJSONObject);
    this.e = paramInt1;
    c localc = c.a(this.a);
    Drawable localDrawable = null;
    if (paramInt2 != -1)
      localDrawable = localc.a(paramInt2, -1, -1);
    this.f = new h(getContext(), localDrawable);
    if (this.b)
    {
      this.f.a();
      this.f.c();
    }
    this.f.b(m());
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    this.d.addView(this.f, localLayoutParams);
    this.f.a(e.a(paramJSONObject, "placeholder"));
    this.f.setFocusable(true);
    this.f.a(new w());
    this.f.a(new x(this));
  }

  public final void a(n.a parama)
  {
    this.g = parama;
  }

  public final boolean a(h paramh)
  {
    return (paramh != null) && (this.f == paramh);
  }

  public String b()
  {
    return this.f.b();
  }

  public boolean c()
  {
    return (b() != null) && (b().length() != 0);
  }

  public final void t()
  {
    if ((this.f != null) && (!this.b))
      this.f.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.n
 * JD-Core Version:    0.6.0
 */