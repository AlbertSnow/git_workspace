package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

@TargetApi(19)
public class al extends aj
{
  public final boolean a(View paramView)
  {
    return paramView.isAttachedToWindow();
  }

  public final ViewGroup.LayoutParams d()
  {
    return new ViewGroup.LayoutParams(-1, -1);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.al
 * JD-Core Version:    0.6.0
 */