package com.wandoujia.nirvana.framework.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.WeakHashMap;

public final class a
{
  private View a;
  private View b;
  private final SparseArray<View> c = new SparseArray();

  static
  {
    new WeakHashMap();
  }

  public a()
  {
  }

  public a(View paramView)
  {
    this();
    this.a = paramView;
    this.b = paramView;
  }

  private View k(int paramInt)
  {
    View localView = (View)this.c.get(paramInt);
    if (localView != null)
      return localView;
    if (this.a != null)
      localView = this.a.findViewById(paramInt);
    this.c.put(paramInt, localView);
    return localView;
  }

  public final View a()
  {
    return this.b;
  }

  public final a a(int paramInt)
  {
    return new a(k(paramInt));
  }

  public final a a(int paramInt1, int paramInt2)
  {
    if (this.b != null)
    {
      ViewGroup.LayoutParams localLayoutParams = this.b.getLayoutParams();
      if ((localLayoutParams != null) && ((localLayoutParams instanceof ViewGroup.MarginLayoutParams)))
      {
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)localLayoutParams;
        if ((localMarginLayoutParams.leftMargin != paramInt1) || (localMarginLayoutParams.rightMargin != paramInt2) || (localMarginLayoutParams.topMargin != 0) || (localMarginLayoutParams.bottomMargin != 0))
        {
          localMarginLayoutParams.setMargins(paramInt1, 0, paramInt2, 0);
          this.b.setLayoutParams(localLayoutParams);
        }
      }
    }
    return this;
  }

  public final a a(Spanned paramSpanned)
  {
    if ((this.b instanceof TextView))
      ((TextView)this.b).setText(paramSpanned);
    return this;
  }

  public final a a(View.OnClickListener paramOnClickListener)
  {
    if (this.b != null)
      this.b.setOnClickListener(paramOnClickListener);
    return this;
  }

  public final a a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.b != null)
      this.b.setLayoutParams(paramLayoutParams);
    return this;
  }

  public final a a(CharSequence paramCharSequence)
  {
    if ((this.b instanceof TextView))
      ((TextView)this.b).setText(paramCharSequence);
    return this;
  }

  public final a a(String paramString)
  {
    View localView1 = this.a;
    View localView2 = null;
    if (localView1 != null)
      localView2 = this.a.findViewWithTag(paramString);
    this.b = localView2;
    return this;
  }

  public final a b()
  {
    if ((this.b instanceof TextView))
      ((TextView)this.b).setText(2131624960);
    return this;
  }

  public final a b(int paramInt)
  {
    this.b = k(paramInt);
    return this;
  }

  public final a c()
  {
    return f(8);
  }

  public final a c(int paramInt)
  {
    if ((this.b instanceof ProgressBar))
      ((ProgressBar)this.b).setProgress(paramInt);
    return this;
  }

  public final a d()
  {
    return f(4);
  }

  public final a d(int paramInt)
  {
    if ((this.b instanceof ProgressBar))
      ((ProgressBar)this.b).setSecondaryProgress(paramInt);
    return this;
  }

  public final a e()
  {
    return f(0);
  }

  public final a e(int paramInt)
  {
    int i = l().getResources().getColor(paramInt);
    if ((this.b instanceof TextView))
      ((TextView)this.b).setTextColor(i);
    return this;
  }

  public final a f(int paramInt)
  {
    if ((this.b != null) && (this.b.getVisibility() != paramInt))
      this.b.setVisibility(paramInt);
    return this;
  }

  public final boolean f()
  {
    return this.b != null;
  }

  public final a g(int paramInt)
  {
    if (this.b != null)
    {
      if (paramInt != 0)
        this.b.setBackgroundResource(paramInt);
    }
    else
      return this;
    this.b.setBackgroundDrawable(null);
    return this;
  }

  public final Object g()
  {
    View localView = this.b;
    Object localObject = null;
    if (localView != null)
      localObject = this.b.getTag(2131492933);
    return localObject;
  }

  public final ImageView h()
  {
    return (ImageView)this.b;
  }

  public final a h(int paramInt)
  {
    if (this.b != null)
      this.b.setBackgroundColor(paramInt);
    return this;
  }

  public final ViewGroup i()
  {
    return (ViewGroup)this.b;
  }

  public final a i(int paramInt)
  {
    if (this.b != null)
      this.b.setBackgroundColor(l().getResources().getColor(paramInt));
    return this;
  }

  public final TextView j()
  {
    return (TextView)this.b;
  }

  public final a j(int paramInt)
  {
    if (this.b != null)
    {
      ViewGroup.LayoutParams localLayoutParams = this.b.getLayoutParams();
      l();
      localLayoutParams.height = paramInt;
      this.b.setLayoutParams(localLayoutParams);
    }
    return this;
  }

  public final Spinner k()
  {
    return (Spinner)this.b;
  }

  public final Context l()
  {
    if (this.a != null)
      return this.a.getContext();
    return null;
  }

  public final a m()
  {
    if (this.b != null)
      this.b.setPadding(0, 0, 0, 0);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.ui.a.a
 * JD-Core Version:    0.6.0
 */