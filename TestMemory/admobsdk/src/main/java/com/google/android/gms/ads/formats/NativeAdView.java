package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzcv;

public abstract class NativeAdView extends FrameLayout
{
  private final FrameLayout zzoQ = zzn(context);
  private final zzcj zzoR = zzaI();

  public NativeAdView(Context context)
  {
    super(context);
  }

  public NativeAdView(Context context, AttributeSet attrs)
  {
    super(context, attrs);
  }

  public NativeAdView(Context context, AttributeSet attrs, int defStyleAttr)
  {
    super(context, attrs, defStyleAttr);
  }

  public NativeAdView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
  {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  protected void zza(String paramString, View paramView)
  {
    try
    {
      this.zzoR.zza(paramString, zze.zzC(paramView));
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Unable to call setAssetView on delegate", localRemoteException);
    }
  }

  protected View zzn(String paramString)
  {
    try
    {
      zzd localzzd = this.zzoR.zzK(paramString);
      if (localzzd != null)
        return (View)zze.zzp(localzzd);
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Unable to call getAssetView on delegate", localRemoteException);
    }
    return null;
  }

  public void setNativeAd(NativeAd ad)
  {
    try
    {
      this.zzoR.zza((zzd)ad.zzaH());
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Unable to call setNativeAd on delegate", localRemoteException);
    }
  }

  public void destroy()
  {
    try
    {
      this.zzoR.destroy();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Unable to destroy native ad view", localRemoteException);
    }
  }

  private FrameLayout zzn(Context paramContext)
  {
    FrameLayout localFrameLayout = zzo(paramContext);
    localFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    addView(localFrameLayout);
    return localFrameLayout;
  }

  FrameLayout zzo(Context paramContext)
  {
    return new FrameLayout(paramContext);
  }

  private zzcj zzaI()
  {
    zzx.zzb(this.zzoQ, "createDelegate must be called after mOverlayFrame has been created");
    return zzn.zzcW().zza(this.zzoQ.getContext(), this, this.zzoQ);
  }

  public void addView(View child, int index, ViewGroup.LayoutParams params)
  {
    super.addView(child, index, params);
    super.bringChildToFront(this.zzoQ);
  }

  public void removeView(View child)
  {
    if (this.zzoQ == child)
      return;
    super.removeView(child);
  }

  public void removeAllViews()
  {
    super.removeAllViews();
    super.addView(this.zzoQ);
  }

  public void bringChildToFront(View child)
  {
    super.bringChildToFront(child);
    if (this.zzoQ != child)
      super.bringChildToFront(this.zzoQ);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.formats.NativeAdView
 * JD-Core Version:    0.6.0
 */