package com.wandoujia.jupiter.imageviewer.views;

import android.content.Context;
import android.graphics.PointF;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ck;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class GalleryViewPager extends ViewPager
{
  public TouchImageView a;
  private PointF b;
  private int c = -1;
  private ck d;

  public GalleryViewPager(Context paramContext)
  {
    this(paramContext, null);
  }

  public GalleryViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setOnPageChangeListener(new b(this));
  }

  private float[] a(MotionEvent paramMotionEvent)
  {
    switch (0xFF & paramMotionEvent.getAction())
    {
    default:
    case 0:
      while (true)
      {
        return null;
        this.b = new PointF(paramMotionEvent.getX(0), paramMotionEvent.getY(0));
      }
    case 1:
    case 2:
    }
    PointF localPointF = new PointF(paramMotionEvent.getX(0), paramMotionEvent.getY(0));
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = (localPointF.x - this.b.x);
    arrayOfFloat[1] = (localPointF.y - this.b.y);
    return arrayOfFloat;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      if ((0xFF & paramMotionEvent.getAction()) == 1)
        super.onInterceptTouchEvent(paramMotionEvent);
      float[] arrayOfFloat = a(paramMotionEvent);
      if (this.a.d())
        return super.onInterceptTouchEvent(paramMotionEvent);
      if ((arrayOfFloat != null) && (this.a.b) && (arrayOfFloat[0] < 0.0F))
        return super.onInterceptTouchEvent(paramMotionEvent);
      if ((arrayOfFloat != null) && (this.a.a) && (arrayOfFloat[0] > 0.0F))
        return super.onInterceptTouchEvent(paramMotionEvent);
      if ((arrayOfFloat == null) && ((this.a.a) || (this.a.b)))
      {
        boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
        return bool;
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      return false;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      return false;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
    return false;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((0xFF & paramMotionEvent.getAction()) == 1)
      super.onTouchEvent(paramMotionEvent);
    float[] arrayOfFloat = a(paramMotionEvent);
    boolean bool1;
    if (this.a.d())
      bool1 = super.onTouchEvent(paramMotionEvent);
    boolean bool2;
    do
    {
      do
      {
        return bool1;
        if ((arrayOfFloat != null) && (this.a.b) && (arrayOfFloat[0] < 0.0F))
          return super.onTouchEvent(paramMotionEvent);
        if ((arrayOfFloat != null) && (this.a.a) && (arrayOfFloat[0] > 0.0F))
          return super.onTouchEvent(paramMotionEvent);
        bool1 = false;
      }
      while (arrayOfFloat != null);
      if (this.a.a)
        break;
      bool2 = this.a.b;
      bool1 = false;
    }
    while (!bool2);
    return super.onTouchEvent(paramMotionEvent);
  }

  public void setOnPageChangeListener(ck paramck)
  {
    this.d = paramck;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.imageviewer.views.GalleryViewPager
 * JD-Core Version:    0.6.0
 */