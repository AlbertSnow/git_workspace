package com.google.android.gms.common;

import android.content.Context;
import android.support.v4.app.d;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.dynamic.zzg.zza;

public final class SignInButton extends FrameLayout
  implements View.OnClickListener
{
  private int a;
  private int b;
  private View c;
  private View.OnClickListener d = null;

  public SignInButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SignInButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(0, 0);
  }

  private void a(int paramInt1, int paramInt2)
  {
    boolean bool1;
    if ((paramInt1 >= 0) && (paramInt1 < 3))
      bool1 = true;
    while (true)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(paramInt1);
      d.a(bool1, "Unknown button size %d", arrayOfObject1);
      boolean bool2;
      Context localContext;
      if ((paramInt2 >= 0) && (paramInt2 < 2))
      {
        bool2 = true;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(paramInt2);
        d.a(bool2, "Unknown color scheme %s", arrayOfObject2);
        this.a = paramInt1;
        this.b = paramInt2;
        localContext = getContext();
        if (this.c != null)
          removeView(this.c);
      }
      try
      {
        this.c = t.a(localContext, this.a, this.b);
        addView(this.c);
        this.c.setEnabled(isEnabled());
        this.c.setOnClickListener(this);
        return;
        bool1 = false;
        continue;
        bool2 = false;
      }
      catch (zzg.zza localzza)
      {
        while (true)
        {
          int i = this.a;
          int j = this.b;
          zzy localzzy = new zzy(localContext);
          localzzy.a(localContext.getResources(), i, j);
          this.c = localzzy;
        }
      }
    }
  }

  public final void onClick(View paramView)
  {
    if ((this.d != null) && (paramView == this.c))
      this.d.onClick(this);
  }

  public final void setColorScheme(int paramInt)
  {
    a(this.a, paramInt);
  }

  public final void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.c.setEnabled(paramBoolean);
  }

  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.d = paramOnClickListener;
    if (this.c != null)
      this.c.setOnClickListener(this);
  }

  public final void setSize(int paramInt)
  {
    a(paramInt, this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.SignInButton
 * JD-Core Version:    0.6.0
 */