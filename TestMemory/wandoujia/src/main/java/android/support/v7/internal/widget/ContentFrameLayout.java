package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.bg;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout
{
  private TypedValue a;
  private TypedValue b;
  private TypedValue c;
  private TypedValue d;
  private TypedValue e;
  private TypedValue f;
  private final Rect g = new Rect();

  public ContentFrameLayout(Context paramContext)
  {
    this(paramContext, null);
  }

  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.g.set(paramInt1, paramInt2, paramInt3, paramInt4);
    if (bg.B(this))
      requestLayout();
  }

  public final void a(Rect paramRect)
  {
    fitSystemWindows(paramRect);
  }

  public TypedValue getFixedHeightMajor()
  {
    if (this.e == null)
      this.e = new TypedValue();
    return this.e;
  }

  public TypedValue getFixedHeightMinor()
  {
    if (this.f == null)
      this.f = new TypedValue();
    return this.f;
  }

  public TypedValue getFixedWidthMajor()
  {
    if (this.c == null)
      this.c = new TypedValue();
    return this.c;
  }

  public TypedValue getFixedWidthMinor()
  {
    if (this.d == null)
      this.d = new TypedValue();
    return this.d;
  }

  public TypedValue getMinWidthMajor()
  {
    if (this.a == null)
      this.a = new TypedValue();
    return this.a;
  }

  public TypedValue getMinWidthMinor()
  {
    if (this.b == null)
      this.b = new TypedValue();
    return this.b;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
    int i;
    int j;
    int k;
    TypedValue localTypedValue3;
    label55: int i6;
    if (localDisplayMetrics.widthPixels < localDisplayMetrics.heightPixels)
    {
      i = 1;
      j = View.MeasureSpec.getMode(paramInt1);
      k = View.MeasureSpec.getMode(paramInt2);
      if (j != -2147483648)
        break label490;
      if (i == 0)
        break label348;
      localTypedValue3 = this.d;
      if ((localTypedValue3 == null) || (localTypedValue3.type == 0))
        break label490;
      if (localTypedValue3.type != 5)
        break label357;
      i6 = (int)localTypedValue3.getDimension(localDisplayMetrics);
    }
    label388: label397: 
    while (true)
    {
      label86: if (i6 > 0)
        paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (this.g.left + this.g.right), View.MeasureSpec.getSize(paramInt1)), 1073741824);
      label143: label174: label348: label357: label490: for (int m = 1; ; m = 0)
      {
        TypedValue localTypedValue2;
        int i5;
        if (k == -2147483648)
        {
          if (i == 0)
            break label388;
          localTypedValue2 = this.e;
          if ((localTypedValue2 != null) && (localTypedValue2.type != 0))
          {
            if (localTypedValue2.type != 5)
              break label397;
            i5 = (int)localTypedValue2.getDimension(localDisplayMetrics);
          }
        }
        while (true)
        {
          if (i5 > 0)
            paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5 - (this.g.top + this.g.bottom), View.MeasureSpec.getSize(paramInt2)), 1073741824);
          super.onMeasure(paramInt1, paramInt2);
          int n = getMeasuredWidth();
          int i1 = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
          TypedValue localTypedValue1;
          label254: int i4;
          if ((m == 0) && (j == -2147483648))
            if (i != 0)
            {
              localTypedValue1 = this.b;
              if ((localTypedValue1 == null) || (localTypedValue1.type == 0))
                break label468;
              if (localTypedValue1.type != 5)
                break label437;
              i4 = (int)localTypedValue1.getDimension(localDisplayMetrics);
            }
          while (true)
          {
            if (i4 > 0)
              i4 -= this.g.left + this.g.right;
            int i2;
            if (n < i4)
              i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            for (int i3 = 1; ; i3 = 0)
            {
              if (i3 != 0)
                super.onMeasure(i2, paramInt2);
              return;
              i = 0;
              break;
              localTypedValue3 = this.c;
              break label55;
              if (localTypedValue3.type != 6)
                break label496;
              i6 = (int)localTypedValue3.getFraction(localDisplayMetrics.widthPixels, localDisplayMetrics.widthPixels);
              break label86;
              localTypedValue2 = this.f;
              break label143;
              if (localTypedValue2.type != 6)
                break label484;
              i5 = (int)localTypedValue2.getFraction(localDisplayMetrics.heightPixels, localDisplayMetrics.heightPixels);
              break label174;
              localTypedValue1 = this.a;
              break label254;
              if (localTypedValue1.type != 6)
                break label478;
              i4 = (int)localTypedValue1.getFraction(localDisplayMetrics.widthPixels, localDisplayMetrics.widthPixels);
              break label285;
              i2 = i1;
            }
            i4 = 0;
          }
          i5 = 0;
        }
      }
      label285: label437: label468: label478: label484: label496: i6 = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.ContentFrameLayout
 * JD-Core Version:    0.6.0
 */