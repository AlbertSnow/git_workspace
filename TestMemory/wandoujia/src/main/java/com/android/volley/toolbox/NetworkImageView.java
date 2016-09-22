package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;

public class NetworkImageView extends ImageView
{
  private int a;
  private int b;
  private p c;

  public NetworkImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public NetworkImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    invalidate();
  }

  protected void onDetachedFromWindow()
  {
    if (this.c != null)
    {
      this.c.a();
      setImageBitmap(null);
      this.c = null;
    }
    super.onDetachedFromWindow();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i = getWidth();
    int j = getHeight();
    if ((i != 0) || (j != 0))
    {
      if (!TextUtils.isEmpty(null))
        break label65;
      if (this.c != null)
      {
        this.c.a();
        this.c = null;
      }
      setImageBitmap(null);
    }
    while (true)
    {
      return;
      label65: if ((this.c == null) || (this.c.c() == null))
        break;
      if (this.c.c().equals(null))
        continue;
      this.c.a();
      setImageBitmap(null);
    }
    this.c = j.a(new u(this));
  }

  public void setDefaultImageResId(int paramInt)
  {
    this.a = paramInt;
  }

  public void setErrorImageResId(int paramInt)
  {
    this.b = paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.NetworkImageView
 * JD-Core Version:    0.6.0
 */