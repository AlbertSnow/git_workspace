package com.google.android.gms.ads.search;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzab;

public final class SearchAdView extends ViewGroup
{
  private final zzab zzoJ;

  public SearchAdView(Context context)
  {
    super(context);
    this.zzoJ = new zzab(this);
  }

  public SearchAdView(Context context, AttributeSet attrs)
  {
    super(context, attrs);
    this.zzoJ = new zzab(this, attrs, false);
  }

  public SearchAdView(Context context, AttributeSet attrs, int defStyle)
  {
    super(context, attrs, defStyle);
    this.zzoJ = new zzab(this, attrs, false);
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

  @RequiresPermission("android.permission.INTERNET")
  public void loadAd(SearchAdRequest searchAdRequest)
  {
    this.zzoJ.zza(searchAdRequest.zzaE());
  }

  public void pause()
  {
    this.zzoJ.pause();
  }

  public void resume()
  {
    this.zzoJ.resume();
  }

  public void setAdListener(AdListener adListener)
  {
    this.zzoJ.setAdListener(adListener);
  }

  public void setAdSize(AdSize adSize)
  {
    this.zzoJ.setAdSizes(new AdSize[] { adSize });
  }

  public void setAdUnitId(String adUnitId)
  {
    this.zzoJ.setAdUnitId(adUnitId);
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
 * Qualified Name:     com.google.android.gms.ads.search.SearchAdView
 * JD-Core Version:    0.6.0
 */