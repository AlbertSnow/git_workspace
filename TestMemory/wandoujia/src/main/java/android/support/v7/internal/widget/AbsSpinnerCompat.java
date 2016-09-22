package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.bg;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.SpinnerAdapter;

abstract class AbsSpinnerCompat extends AdapterViewCompat<SpinnerAdapter>
{
  SpinnerAdapter a;
  int b;
  int c;
  final Rect d = new Rect();
  final c e = new c(this);
  private DataSetObserver w;

  AbsSpinnerCompat(Context paramContext, int paramInt)
  {
    super(paramContext, null, paramInt);
    setFocusable(true);
    setWillNotDraw(false);
  }

  final void a()
  {
    this.m = false;
    this.i = false;
    removeAllViewsInLayout();
    this.t = -1;
    this.u = -9223372036854775808L;
    setSelectedPositionInt(-1);
    setNextSelectedPositionInt(-1);
    invalidate();
  }

  public void a(SpinnerAdapter paramSpinnerAdapter)
  {
    int i = -1;
    if (this.a != null)
    {
      this.a.unregisterDataSetObserver(this.w);
      a();
    }
    this.a = paramSpinnerAdapter;
    this.t = i;
    this.u = -9223372036854775808L;
    if (this.a != null)
    {
      this.s = this.r;
      this.r = this.a.getCount();
      b();
      this.w = new w(this);
      this.a.registerDataSetObserver(this.w);
      if (this.r > 0)
        i = 0;
      setSelectedPositionInt(i);
      setNextSelectedPositionInt(i);
      if (this.r == 0)
        d();
    }
    while (true)
    {
      requestLayout();
      return;
      b();
      a();
      d();
    }
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.LayoutParams(-1, -2);
  }

  public int getCount()
  {
    return this.r;
  }

  public View getSelectedView()
  {
    if ((this.r > 0) && (this.p >= 0))
      return getChildAt(this.p - this.f);
    return null;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = getPaddingLeft();
    int k = getPaddingTop();
    int m = getPaddingRight();
    int n = getPaddingBottom();
    Rect localRect1 = this.d;
    int i1;
    int i2;
    label66: int i3;
    label88: int i4;
    label110: int i7;
    int i6;
    if (j > 0)
    {
      i1 = j;
      localRect1.left = i1;
      Rect localRect2 = this.d;
      if (k <= 0)
        break label395;
      i2 = k;
      localRect2.top = i2;
      Rect localRect3 = this.d;
      if (m <= 0)
        break label401;
      i3 = m;
      localRect3.right = i3;
      Rect localRect4 = this.d;
      if (n <= 0)
        break label407;
      i4 = n;
      localRect4.bottom = i4;
      if (this.m)
        c();
      int i5 = getSelectedItemPosition();
      if ((i5 < 0) || (this.a == null) || (i5 >= this.a.getCount()))
        break label413;
      View localView = this.e.a(i5);
      if (localView == null)
        localView = this.a.getView(i5, null, this);
      if (localView == null)
        break label413;
      this.e.a(i5, localView);
      if (localView.getLayoutParams() == null)
      {
        this.v = true;
        localView.setLayoutParams(generateDefaultLayoutParams());
        this.v = false;
      }
      measureChild(localView, paramInt1, paramInt2);
      j = localView.getMeasuredHeight() + this.d.top + this.d.bottom;
      i7 = localView.getMeasuredWidth() + this.d.left + this.d.right;
      i6 = 0;
    }
    while (true)
    {
      if (i6 != 0)
      {
        j = this.d.top + this.d.bottom;
        if (i == 0)
          i7 = this.d.left + this.d.right;
      }
      int i8 = Math.max(j, getSuggestedMinimumHeight());
      int i9 = Math.max(i7, getSuggestedMinimumWidth());
      int i10 = bg.a(i8, paramInt2, 0);
      setMeasuredDimension(bg.a(i9, paramInt1, 0), i10);
      this.b = paramInt2;
      this.c = paramInt1;
      return;
      i1 = 0;
      break;
      label395: i2 = 0;
      break label66;
      label401: i3 = 0;
      break label88;
      label407: i4 = 0;
      break label110;
      label413: i6 = 1;
      i7 = 0;
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AbsSpinnerCompat.SavedState localSavedState = (AbsSpinnerCompat.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.a >= 0L)
    {
      this.m = true;
      this.i = true;
      this.h = localSavedState.a;
      this.g = localSavedState.b;
      this.j = 0;
      requestLayout();
    }
  }

  public Parcelable onSaveInstanceState()
  {
    AbsSpinnerCompat.SavedState localSavedState = new AbsSpinnerCompat.SavedState(super.onSaveInstanceState());
    localSavedState.a = getSelectedItemId();
    if (localSavedState.a >= 0L)
    {
      localSavedState.b = getSelectedItemPosition();
      return localSavedState;
    }
    localSavedState.b = -1;
    return localSavedState;
  }

  public void requestLayout()
  {
    if (!this.v)
      super.requestLayout();
  }

  public void setSelection(int paramInt)
  {
    setNextSelectedPositionInt(paramInt);
    requestLayout();
    invalidate();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.AbsSpinnerCompat
 * JD-Core Version:    0.6.0
 */