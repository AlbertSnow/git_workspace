package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.drawable;
import com.wandoujia.ripple_framework.R.styleable;
import java.util.ArrayList;
import java.util.List;

public class StatefulButton extends CustomFontTextView
{
  private boolean a;
  private List<View.OnClickListener> b = new ArrayList();
  private View.OnClickListener c = new bb(this);
  private View.OnClickListener d;

  public StatefulButton(Context paramContext)
  {
    super(paramContext);
    setBackgroundResource(R.drawable.jupiter_button_bg);
  }

  public StatefulButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramAttributeSet);
  }

  public StatefulButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet);
  }

  private void a(AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(paramAttributeSet, R.styleable.StatefulButton, 0, 0);
    try
    {
      this.a = localTypedArray.getBoolean(R.styleable.StatefulButton_lightStyle, false);
      localTypedArray.recycle();
      if (this.a)
      {
        setBackgroundResource(R.drawable.jupiter_button_bg_light);
        setTextColor(getResources().getColor(R.color.green_primary));
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        this.a = false;
        localTypedArray.recycle();
      }
    }
    finally
    {
      localTypedArray.recycle();
    }
    throw localObject;
  }

  public final void a(View.OnClickListener paramOnClickListener)
  {
    monitorenter;
    if (paramOnClickListener == null);
    while (true)
    {
      monitorexit;
      return;
      try
      {
        if (CollectionUtils.isEmpty(this.b))
          super.setOnClickListener(this.c);
        this.b.add(paramOnClickListener);
        continue;
      }
      finally
      {
        monitorexit;
      }
    }
    throw localObject;
  }

  public final void b(View.OnClickListener paramOnClickListener)
  {
    monitorenter;
    if (paramOnClickListener == null);
    while (true)
    {
      monitorexit;
      return;
      try
      {
        if (CollectionUtils.isEmpty(this.b))
          super.setOnClickListener(this.c);
        this.b.add(0, paramOnClickListener);
        continue;
      }
      finally
      {
        monitorexit;
      }
    }
    throw localObject;
  }

  public final boolean b()
  {
    return this.a;
  }

  public final void c(View.OnClickListener paramOnClickListener)
  {
    monitorenter;
    if (paramOnClickListener == null);
    while (true)
    {
      monitorexit;
      return;
      try
      {
        this.b.remove(paramOnClickListener);
        if (!CollectionUtils.isEmpty(this.b))
          continue;
        super.setOnClickListener(null);
      }
      finally
      {
        monitorexit;
      }
    }
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    c(this.d);
    a(paramOnClickListener);
    this.d = paramOnClickListener;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.StatefulButton
 * JD-Core Version:    0.6.0
 */