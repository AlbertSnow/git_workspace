package com.wandoujia.launcher_base.view.button.view;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.launcher_base.R.styleable;

public class StatefulButton extends TextView
{
  protected boolean a;
  private com.google.android.gms.common.api.a b;

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
      this.a = localTypedArray.getBoolean(R.styleable.StatefulButton_multipleState, false);
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

  public com.google.android.gms.common.api.a getState$215593a0()
  {
    return this.b;
  }

  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (this.b != null)
      mergeDrawableStates(arrayOfInt, new int[] { 0 });
    return arrayOfInt;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    ((View)getParent()).post(new b(this));
  }

  public void setMultipleState(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public void setState$7f941726(com.google.android.gms.common.api.a parama)
  {
    if (parama == null)
      return;
    this.b = parama;
    setEnabled(false);
    setText(null);
    setVisibility(0);
    setOnClickListener(new a(this));
    refreshDrawableState();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.button.view.StatefulButton
 * JD-Core Version:    0.6.0
 */