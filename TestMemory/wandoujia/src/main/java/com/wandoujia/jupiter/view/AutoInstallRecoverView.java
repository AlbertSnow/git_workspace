package com.wandoujia.jupiter.view;

import android.content.Context;
import android.support.v4.app.d;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

public class AutoInstallRecoverView extends LinearLayout
{
  private h a;

  public AutoInstallRecoverView(Context paramContext)
  {
    super(paramContext);
  }

  public AutoInstallRecoverView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static AutoInstallRecoverView a(Context paramContext)
  {
    return (AutoInstallRecoverView)d.a(paramContext, 2130903260);
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4)
    {
      if (this.a != null)
        this.a.c();
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }

  public void setActionListener(h paramh)
  {
    this.a = paramh;
    if (paramh != null)
    {
      findViewById(2131493248).setOnClickListener(new f(paramh));
      findViewById(2131493242).setOnClickListener(new g(paramh));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.AutoInstallRecoverView
 * JD-Core Version:    0.6.0
 */