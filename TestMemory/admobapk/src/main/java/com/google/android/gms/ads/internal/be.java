package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.util.ao;
import com.google.android.gms.ads.internal.util.bk;
import com.google.android.gms.ads.internal.webview.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class be extends ViewSwitcher
{
  final ao a;
  final bk b;

  public be(Context paramContext, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    super(paramContext);
    this.a = new ao(paramContext);
    if ((paramContext instanceof Activity));
    for (this.b = new bk((Activity)paramContext, this, paramOnGlobalLayoutListener, paramOnScrollChangedListener); ; this.b = new bk(null, this, paramOnGlobalLayoutListener, paramOnScrollChangedListener))
    {
      this.b.a();
      return;
    }
  }

  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.b != null)
      this.b.c();
  }

  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.b != null)
      this.b.d();
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    this.a.a(paramMotionEvent);
    return false;
  }

  public final void removeAllViews()
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      if ((localView == null) || (!(localView instanceof b)))
        continue;
      localArrayList.add((b)localView);
    }
    super.removeAllViews();
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).destroy();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.be
 * JD-Core Version:    0.6.0
 */