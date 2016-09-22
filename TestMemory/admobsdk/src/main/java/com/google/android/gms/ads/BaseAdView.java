package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzab;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

class BaseAdView extends ViewGroup
{
  private final zzab zzoJ;

  public BaseAdView(Context context, int adViewType)
  {
    super(context);
    this.zzoJ = new zzab(this, zze(adViewType));
  }

  public BaseAdView(Context context, AttributeSet attrs, int adViewType)
  {
    super(context, attrs);
    this.zzoJ = new zzab(this, attrs, false, zze(adViewType));
  }

  public BaseAdView(Context context, AttributeSet attrs, int defStyle, int adViewType)
  {
    super(context, attrs, defStyle);
    this.zzoJ = new zzab(this, attrs, false, zze(adViewType));
  }

  public void destroy()
  {
    this.zzoJ.destroy();
  }

  public AdListener getAdListener()
  {
    return this.zzoJ.getAdListener();
  }

  public AdSize getAdSize()
  {
    return this.zzoJ.getAdSize();
  }

  public String getAdUnitId()
  {
    return this.zzoJ.getAdUnitId();
  }

  public InAppPurchaseListener getInAppPurchaseListener()
  {
    return this.zzoJ.getInAppPurchaseListener();
  }

  @RequiresPermission("android.permission.INTERNET")
  public void loadAd(AdRequest adRequest)
  {
    this.zzoJ.zza(adRequest.zzaE());
  }

  public void pause()
  {
    this.zzoJ.pause();
  }

  public void resume()
  {
    this.zzoJ.resume();
  }

  public boolean isLoading()
  {
    return this.zzoJ.isLoading();
  }

  public void setAdListener(AdListener adListener)
  {
    this.zzoJ.setAdListener(adListener);
    if ((adListener != null) && ((adListener instanceof zza)))
      this.zzoJ.zza((zza)adListener);
    else if (adListener == null)
      this.zzoJ.zza(null);
  }

  public void setAdSize(AdSize adSize)
  {
    this.zzoJ.setAdSizes(new AdSize[] { adSize });
  }

  public void setAdUnitId(String adUnitId)
  {
    this.zzoJ.setAdUnitId(adUnitId);
  }

  public void setInAppPurchaseListener(InAppPurchaseListener inAppPurchaseListener)
  {
    this.zzoJ.setInAppPurchaseListener(inAppPurchaseListener);
  }

  public void setPlayStorePurchaseParams(PlayStorePurchaseListener playStorePurchaseListener, String publicKey)
  {
    this.zzoJ.setPlayStorePurchaseParams(playStorePurchaseListener, publicKey);
  }

  public String getMediationAdapterClassName()
  {
    return this.zzoJ.getMediationAdapterClassName();
  }

  protected void onLayout(boolean changed, int left, int top, int right, int bottom)
  {
    View localView = getChildAt(0);
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      int i = localView.getMeasuredWidth();
      int j = localView.getMeasuredHeight();
      int k = (right - left - i) / 2;
      int m = (bottom - top - j) / 2;
      localView.layout(k, m, k + i, m + j);
    }
  }

  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
  {
    int i = 0;
    int j = 0;
    View localView = getChildAt(0);
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      measureChild(localView, widthMeasureSpec, heightMeasureSpec);
      i = localView.getMeasuredWidth();
      j = localView.getMeasuredHeight();
    }
    else
    {
      AdSize localAdSize = getAdSize();
      if (localAdSize != null)
      {
        Context localContext = getContext();
        i = localAdSize.getWidthInPixels(localContext);
        j = localAdSize.getHeightInPixels(localContext);
      }
    }
    i = Math.max(i, getSuggestedMinimumWidth());
    j = Math.max(j, getSuggestedMinimumHeight());
    setMeasuredDimension(View.resolveSize(i, widthMeasureSpec), View.resolveSize(j, heightMeasureSpec));
  }

  private static boolean zze(int paramInt)
  {
    return paramInt == 2;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.BaseAdView
 * JD-Core Version:    0.6.0
 */