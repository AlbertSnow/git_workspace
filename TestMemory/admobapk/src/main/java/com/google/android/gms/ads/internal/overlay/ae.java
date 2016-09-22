package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.ao;

@a
public final class ae extends RelativeLayout
{
  public boolean a;
  private ao b;

  public ae(Context paramContext, String paramString)
  {
    super(paramContext);
    this.b = new ao(paramContext, paramString);
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.a)
      this.b.a(paramMotionEvent);
    return false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.ae
 * JD-Core Version:    0.6.0
 */