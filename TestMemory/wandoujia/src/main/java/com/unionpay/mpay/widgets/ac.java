package com.unionpay.mpay.widgets;

import android.content.Context;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.unionpay.mpay.a.a;
import com.unionpay.mpay.c.c;

public final class ac extends LinearLayout
{
  private c a = null;
  private ImageView b = null;
  private ImageView c = null;

  public ac(Context paramContext)
  {
    this(paramContext, true);
  }

  public ac(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    this.a = c.a(paramContext);
    setBackgroundColor(0);
    setOrientation(1);
    if (paramBoolean)
    {
      this.b = new ImageView(paramContext);
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(a.y, a.y);
      localLayoutParams2.gravity = 21;
      localLayoutParams2.rightMargin = a.a;
      addView(this.b, localLayoutParams2);
    }
    this.c = new ImageView(paramContext);
    ImageView localImageView = this.c;
    Object localObject = this.a.a(1035, -1, -1);
    if ((localObject != null) && ((localObject instanceof BitmapDrawable)))
    {
      localObject = (BitmapDrawable)localObject;
      ((BitmapDrawable)localObject).setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.MIRROR);
      ((BitmapDrawable)localObject).setDither(true);
    }
    localImageView.setBackgroundDrawable((Drawable)localObject);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, a.u);
    localLayoutParams1.gravity = 80;
    addView(this.c, localLayoutParams1);
    a(true);
  }

  public final void a(boolean paramBoolean)
  {
    Drawable localDrawable = this.a.a(1000, -1, -1);
    if (!paramBoolean)
      localDrawable = this.a.a(1002, -1, -1);
    if (this.b != null)
      this.b.setBackgroundDrawable(localDrawable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.ac
 * JD-Core Version:    0.6.0
 */