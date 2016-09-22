package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(18)
public class aj extends ai
{
  public boolean a(View paramView)
  {
    return (super.a(paramView)) || (paramView.getWindowId() != null);
  }

  public final int c()
  {
    return 14;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.aj
 * JD-Core Version:    0.6.0
 */