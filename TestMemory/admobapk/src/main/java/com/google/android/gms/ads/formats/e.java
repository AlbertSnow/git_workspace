package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import apj;

public class e extends FrameLayout
{
  public final void a(a parama)
  {
    try
    {
      null.a((apj)parama.a());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.e.b("Unable to call setNativeAd on delegate", localRemoteException);
    }
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    super.bringChildToFront(null);
  }

  public void bringChildToFront(View paramView)
  {
    super.bringChildToFront(paramView);
    if (paramView != null)
      super.bringChildToFront(null);
  }

  public void removeAllViews()
  {
    super.removeAllViews();
    super.addView(null);
  }

  public void removeView(View paramView)
  {
    if (paramView == null)
      return;
    super.removeView(paramView);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.formats.e
 * JD-Core Version:    0.6.0
 */