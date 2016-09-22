package com.wandoujia.ripple_framework.html;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v4.app.b;
import android.text.TextUtils;

public final class s extends Drawable
{
  private String a;

  public s(String paramString)
  {
    this.a = paramString;
  }

  public final void a()
  {
    String str = this.a;
    if (!TextUtils.isEmpty(str))
    {
      b.C(str);
      TextUtils.isEmpty(b.D(str));
    }
  }

  public final void draw(Canvas paramCanvas)
  {
    a();
  }

  public final int getOpacity()
  {
    return 0;
  }

  public final void setAlpha(int paramInt)
  {
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.html.s
 * JD-Core Version:    0.6.0
 */