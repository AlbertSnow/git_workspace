package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import apn;
import com.google.android.gms.ads.adshield.a;

final class ay
  implements View.OnTouchListener
{
  ay(aw paramaw)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (this.a.f != null);
    try
    {
      this.a.f.a.d(apn.a(paramMotionEvent));
      return false;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.google.android.gms.ads.internal.util.c.c("Unable to process ad data", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ay
 * JD-Core Version:    0.6.0
 */