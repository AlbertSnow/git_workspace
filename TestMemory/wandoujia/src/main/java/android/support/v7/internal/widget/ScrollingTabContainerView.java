package android.support.v7.internal.widget;

import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v7.app.k;
import android.support.v7.appcompat.R.attr;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.widget.HorizontalScrollView;
import com.sina.weibo.sdk.api.share.i;

public class ScrollingTabContainerView extends HorizontalScrollView
  implements k
{
  Runnable a;
  int b;
  private SpinnerCompat c;
  private boolean d;
  private int e;
  private int f;
  private int g;

  static
  {
    new DecelerateInterpolator();
  }

  private boolean b()
  {
    return (this.c != null) && (this.c.getParent() == this);
  }

  private boolean c()
  {
    if (!b())
      return false;
    removeView(this.c);
    addView(null, new ViewGroup.LayoutParams(-2, -1));
    setTabSelected(this.c.getSelectedItemPosition());
    return false;
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.a != null)
      post(this.a);
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration);
    i locali = i.a(getContext());
    setContentHeight(locali.e());
    this.e = locali.g();
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.a != null)
      removeCallbacks(this.a);
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    label69: label84: int m;
    if (j == 1073741824)
    {
      bool = i;
      setFillViewport(bool);
      int k = null.getChildCount();
      if ((k <= i) || ((j != 1073741824) && (j != -2147483648)))
        break label326;
      if (k <= 2)
        break label313;
      this.b = (int)(0.4F * View.MeasureSpec.getSize(paramInt1));
      this.b = Math.min(this.b, this.e);
      m = View.MeasureSpec.makeMeasureSpec(this.f, 1073741824);
      if ((bool) || (!this.d))
        break label334;
      label107: if (i == 0)
        break label347;
      null.measure(0, m);
      if (null.getMeasuredWidth() <= View.MeasureSpec.getSize(paramInt1))
        break label339;
      if (!b())
      {
        if (this.c == null)
        {
          SpinnerCompat localSpinnerCompat = new SpinnerCompat(getContext(), R.attr.actionDropDownStyle);
          localSpinnerCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
          localSpinnerCompat.a(this);
          this.c = localSpinnerCompat;
        }
        removeView(null);
        addView(this.c, new ViewGroup.LayoutParams(-2, -1));
        if (this.c.a == null)
          this.c.a(new ah(this, 0));
        if (this.a != null)
        {
          removeCallbacks(this.a);
          this.a = null;
        }
        this.c.setSelection(this.g);
      }
    }
    while (true)
    {
      int n = getMeasuredWidth();
      super.onMeasure(paramInt1, m);
      int i1 = getMeasuredWidth();
      if ((bool) && (n != i1))
        setTabSelected(this.g);
      return;
      bool = false;
      break;
      label313: this.b = (View.MeasureSpec.getSize(paramInt1) / 2);
      break label69;
      label326: this.b = -1;
      break label84;
      label334: i = 0;
      break label107;
      label339: c();
      continue;
      label347: c();
    }
  }

  public void setAllowCollapse(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public void setContentHeight(int paramInt)
  {
    this.f = paramInt;
    requestLayout();
  }

  public void setTabSelected(int paramInt)
  {
    this.g = paramInt;
    int i = null.getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView1 = null.getChildAt(j);
      if (j == paramInt);
      for (boolean bool = true; ; bool = false)
      {
        localView1.setSelected(bool);
        if (bool)
        {
          View localView2 = null.getChildAt(paramInt);
          if (this.a != null)
            removeCallbacks(this.a);
          this.a = new ag(this, localView2);
          post(this.a);
        }
        j++;
        break;
      }
    }
    if ((this.c != null) && (paramInt >= 0))
      this.c.setSelection(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.ScrollingTabContainerView
 * JD-Core Version:    0.6.0
 */