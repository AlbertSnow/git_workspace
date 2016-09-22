package com.wandoujia.p4.button.views;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.base.log.Log;
import com.wandoujia.p4.button.a.a;
import com.wandoujia.phoenix2.R.styleable;

public class StatefulButton extends TextView
{
  protected boolean a;
  private a b;

  public StatefulButton(Context paramContext)
  {
    super(paramContext);
    this.a = false;
  }

  public StatefulButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public StatefulButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, R.styleable.StatefulButton, 0, 0);
    try
    {
      this.a = localTypedArray.getBoolean(0, false);
      return;
    }
    catch (Exception localException)
    {
      this.a = false;
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
    throw localObject;
  }

  public a getState()
  {
    return this.b;
  }

  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt1 = super.onCreateDrawableState(paramInt + 1);
    if (this.b != null)
    {
      int[] arrayOfInt2 = new int[1];
      arrayOfInt2[0] = this.b.a();
      mergeDrawableStates(arrayOfInt1, arrayOfInt2);
    }
    return arrayOfInt1;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    ((View)getParent()).post(new c(this));
  }

  public void setMultipleState(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public void setState(a parama)
  {
    if (parama == null)
    {
      Log.e("StatefulButton", "The state cannot be null when setState.", new Object[0]);
      return;
    }
    this.b = parama;
    setEnabled(parama.e());
    setText(parama.b());
    setVisibility(0);
    setOnClickListener(new b(this, parama));
    refreshDrawableState();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.button.views.StatefulButton
 * JD-Core Version:    0.6.0
 */