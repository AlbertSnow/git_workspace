package com.sina.weibo.sdk.component.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;

public class LoadingBar extends TextView
{
  private int a;
  private int b;
  private Paint c;
  private Handler d;
  private Runnable e = new f(this);

  public LoadingBar(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public LoadingBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  public LoadingBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }

  private void a()
  {
    this.d = new Handler();
    this.c = new Paint();
    this.b = -11693826;
  }

  private Rect getRect()
  {
    int i = getLeft();
    int j = getTop();
    int k = getLeft() + (getRight() - getLeft()) * this.a / 100;
    int m = getBottom();
    return new Rect(0, 0, k - i, m - j);
  }

  public final void a(int paramInt)
  {
    if (paramInt < 7)
      this.d.postDelayed(this.e, 70L);
    while (true)
    {
      invalidate();
      return;
      this.d.removeCallbacks(this.e);
      this.a = paramInt;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.c.setColor(this.b);
    paramCanvas.drawRect(getRect(), this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.view.LoadingBar
 * JD-Core Version:    0.6.0
 */