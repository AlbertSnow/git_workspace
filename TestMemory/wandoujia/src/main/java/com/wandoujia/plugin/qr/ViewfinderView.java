package com.wandoujia.plugin.qr;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.f;
import com.wandoujia.plugin.qr.a.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ViewfinderView extends View
{
  private static final int[] a = { 0, 64, 128, 192, 255, 192, 128, 64 };
  private e b;
  private final Paint c = new Paint(1);
  private final int d;
  private final int e;
  private final int f;
  private final int g;
  private int h;
  private List<f> i;
  private List<f> j;

  public ViewfinderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Resources localResources = getResources();
    this.d = localResources.getColor(R.color.viewfinder_mask);
    localResources.getColor(R.color.result_view);
    this.e = localResources.getColor(R.color.viewfinder_frame);
    this.f = localResources.getColor(R.color.viewfinder_laser);
    this.g = localResources.getColor(R.color.possible_result_points);
    this.h = 0;
    this.i = new ArrayList(5);
    this.j = null;
  }

  public final void a(f paramf)
  {
    synchronized (this.i)
    {
      ???.add(paramf);
      int k = ???.size();
      if (k > 20)
        ???.subList(0, k - 10).clear();
      return;
    }
  }

  public final void onDraw(Canvas paramCanvas)
  {
    if (this.b == null);
    Rect localRect1;
    do
    {
      return;
      localRect1 = this.b.d();
    }
    while (localRect1 == null);
    int k = paramCanvas.getWidth();
    int m = paramCanvas.getHeight();
    this.c.setColor(this.d);
    paramCanvas.drawRect(0.0F, 0.0F, k, localRect1.top, this.c);
    paramCanvas.drawRect(0.0F, localRect1.top, localRect1.left, 1 + localRect1.bottom, this.c);
    paramCanvas.drawRect(1 + localRect1.right, localRect1.top, k, 1 + localRect1.bottom, this.c);
    paramCanvas.drawRect(0.0F, 1 + localRect1.bottom, k, m, this.c);
    this.c.setColor(this.e);
    paramCanvas.drawRect(localRect1.left, localRect1.top, 1 + localRect1.right, 2 + localRect1.top, this.c);
    paramCanvas.drawRect(localRect1.left, 2 + localRect1.top, 2 + localRect1.left, -1 + localRect1.bottom, this.c);
    paramCanvas.drawRect(-1 + localRect1.right, localRect1.top, 1 + localRect1.right, -1 + localRect1.bottom, this.c);
    paramCanvas.drawRect(localRect1.left, -1 + localRect1.bottom, 1 + localRect1.right, 1 + localRect1.bottom, this.c);
    this.c.setColor(this.f);
    this.c.setAlpha(a[this.h]);
    this.h = ((1 + this.h) % 8);
    int n = localRect1.height() / 2 + localRect1.top;
    paramCanvas.drawRect(2 + localRect1.left, n - 1, -1 + localRect1.right, n + 2, this.c);
    Rect localRect2 = this.b.e();
    float f1 = localRect1.width() / localRect2.width();
    float f2 = localRect1.height() / localRect2.height();
    List localList1 = this.i;
    List localList2 = this.j;
    int i1 = localRect1.left;
    int i2 = localRect1.top;
    if (localList1.isEmpty())
      this.j = null;
    while (localList2 != null)
    {
      this.c.setAlpha(80);
      this.c.setColor(this.g);
      monitorenter;
      try
      {
        Iterator localIterator2 = localList2.iterator();
        while (localIterator2.hasNext())
        {
          f localf1 = (f)localIterator2.next();
          paramCanvas.drawCircle(i1 + (int)(f1 * localf1.a()), i2 + (int)(f2 * localf1.b()), 3.0F, this.c);
        }
      }
      finally
      {
        monitorexit;
      }
      this.i = new ArrayList(5);
      this.j = localList1;
      this.c.setAlpha(160);
      this.c.setColor(this.g);
      monitorenter;
      try
      {
        Iterator localIterator1 = localList1.iterator();
        while (localIterator1.hasNext())
        {
          f localf2 = (f)localIterator1.next();
          paramCanvas.drawCircle(i1 + (int)(f1 * localf2.a()), i2 + (int)(f2 * localf2.b()), 6.0F, this.c);
        }
      }
      finally
      {
        monitorexit;
      }
      monitorexit;
      continue;
      monitorexit;
    }
    postInvalidateDelayed(80L, -6 + localRect1.left, -6 + localRect1.top, 6 + localRect1.right, 6 + localRect1.bottom);
  }

  public final void setCameraManager(e parame)
  {
    this.b = parame;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.plugin.qr.ViewfinderView
 * JD-Core Version:    0.6.0
 */