package com.wandoujia.logv3.toolkit.cardshow;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

public class CardShowHorizontalScrollView extends HorizontalScrollView
  implements m
{
  private m a;
  private e b;
  private CardShowHorizontalScrollView.ScrollType c = CardShowHorizontalScrollView.ScrollType.IDLE;
  private int d = 50;
  private int e = -9999999;
  private Handler f = new Handler(Looper.getMainLooper());
  private Runnable g = new d(this);

  public CardShowHorizontalScrollView(Context paramContext)
  {
    super(paramContext);
  }

  public CardShowHorizontalScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CardShowHorizontalScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a()
  {
    if (this.a != null)
      this.a.a();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default:
    case 2:
    case 1:
    }
    while (true)
    {
      return super.onTouchEvent(paramMotionEvent);
      this.c = CardShowHorizontalScrollView.ScrollType.TOUCH_SCROLL;
      if (this.b != null)
        this.b.a(this.c);
      this.f.removeCallbacks(this.g);
      continue;
      this.f.post(this.g);
    }
  }

  public void setOnCardShowListener(m paramm)
  {
    this.a = paramm;
  }

  public void setOnScrollListener(e parame)
  {
    this.b = parame;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.cardshow.CardShowHorizontalScrollView
 * JD-Core Version:    0.6.0
 */