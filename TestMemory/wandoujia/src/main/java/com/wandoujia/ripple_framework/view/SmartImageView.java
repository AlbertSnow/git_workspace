package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.android.volley.toolbox.j;
import com.android.volley.toolbox.p;

public class SmartImageView extends ImageView
{
  private String a;
  private String b;
  private aq c;
  private int d;
  private int e;
  private j f;
  private boolean g;
  private AlphaAnimation h;
  private p i;

  public SmartImageView(Context paramContext)
  {
    super(paramContext);
    setSupportTransition(true);
  }

  public SmartImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    setSupportTransition(true);
  }

  public SmartImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setSupportTransition(true);
  }

  private void a(String paramString, boolean paramBoolean)
  {
    long l = System.currentTimeMillis();
    this.i = this.f.a(paramString, new ao(this, paramBoolean, l), 0, 0);
  }

  private void a(boolean paramBoolean)
  {
    int j = getWidth();
    int k = getHeight();
    if ((j == 0) && (k == 0));
    while (true)
    {
      return;
      if (TextUtils.isEmpty(this.a))
      {
        if (this.i != null)
        {
          this.i.a();
          this.i = null;
        }
        setImageBitmap(null);
        if (this.d == 0)
          continue;
        setImageResource(this.d);
        return;
      }
      if ((this.i == null) || (this.i.c() == null))
        break;
      if (this.i.c().equals(this.a))
        continue;
      this.i.a();
      setImageBitmap(null);
    }
    a(this.a, paramBoolean);
  }

  public final void a(String paramString1, j paramj, String paramString2, aq paramaq)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.f = paramj;
    this.c = paramaq;
    a(false);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    invalidate();
  }

  protected void onDetachedFromWindow()
  {
    if (this.i != null)
    {
      this.i.a();
      setImageBitmap(null);
      this.i = null;
    }
    super.onDetachedFromWindow();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    a(true);
  }

  public void setDefaultImageResId(int paramInt)
  {
    this.d = paramInt;
  }

  public void setErrorImageResId(int paramInt)
  {
    this.e = paramInt;
  }

  public void setSupportTransition(boolean paramBoolean)
  {
    this.g = paramBoolean;
    if ((this.g) && (this.h == null))
    {
      this.h = new AlphaAnimation(0.4F, 1.0F);
      this.h.setDuration(200L);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.SmartImageView
 * JD-Core Version:    0.6.0
 */