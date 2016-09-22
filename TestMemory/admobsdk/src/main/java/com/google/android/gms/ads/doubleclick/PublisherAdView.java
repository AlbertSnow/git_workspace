package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.internal.client.zzab;

public final class PublisherAdView extends ViewGroup
{
  private final zzab zzoJ;

  public PublisherAdView(Context context)
  {
    super(context);
    this.zzoJ = new zzab(this);
  }

  public PublisherAdView(Context context, AttributeSet attrs)
  {
    super(context, attrs);
    this.zzoJ = new zzab(this, attrs, true);
  }

  public PublisherAdView(Context context, AttributeSet attrs, int defStyle)
  {
    super(context, attrs, defStyle);
    this.zzoJ = new zzab(this, attrs, true);
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

  public AdSize[] getAdSizes()
  {
    return this.zzoJ.getAdSizes();
  }

  public String getAdUnitId()
  {
    return this.zzoJ.getAdUnitId();
  }

  public AppEventListener getAppEventListener()
  {
    return this.zzoJ.getAppEventListener();
  }

  public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
  {
    return this.zzoJ.getOnCustomRenderedAdLoadedListener();
  }

  @RequiresPermission("android.permission.INTERNET")
  public void loadAd(PublisherAdRequest publisherAdRequest)
  {
    this.zzoJ.zza(publisherAdRequest.zzaE());
  }

  public void pause()
  {
    this.zzoJ.pause();
  }

  public void setManualImpressionsEnabled(boolean manualImpressionsEnabled)
  {
    this.zzoJ.setManualImpressionsEnabled(manualImpressionsEnabled);
  }

  public void recordManualImpression()
  {
    this.zzoJ.recordManualImpression();
  }

  public void resume()
  {
    this.zzoJ.resume();
  }

  public void setAdListener(AdListener adListener)
  {
    this.zzoJ.setAdListener(adListener);
  }

  public void setAdSizes(AdSize[] adSizes)
  {
    if ((adSizes == null) || (adSizes.length < 1))
      throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
    this.zzoJ.zza(adSizes);
  }

  public void setAdUnitId(String adUnitId)
  {
    this.zzoJ.setAdUnitId(adUnitId);
  }

  public void setAppEventListener(AppEventListener appEventListener)
  {
    this.zzoJ.setAppEventListener(appEventListener);
  }

  public void setCorrelator(Correlator correlator)
  {
    this.zzoJ.setCorrelator(correlator);
  }

  public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener)
  {
    this.zzoJ.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
  }

  public String getMediationAdapterClassName()
  {
    return this.zzoJ.getMediationAdapterClassName();
  }

  public boolean isLoading()
  {
    return this.zzoJ.isLoading();
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
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.doubleclick.PublisherAdView
 * JD-Core Version:    0.6.0
 */