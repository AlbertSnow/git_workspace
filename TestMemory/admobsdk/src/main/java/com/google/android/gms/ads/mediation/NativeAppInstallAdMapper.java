package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public abstract class NativeAppInstallAdMapper extends NativeAdMapper
{
  private String zzxW;
  private List<NativeAd.Image> zzxX;
  private String zzxY;
  private NativeAd.Image zzOo;
  private String zzya;
  private double zzyb;
  private String zzyc;
  private String zzyd;

  public final void setHeadline(String headline)
  {
    this.zzxW = headline;
  }

  public final void setImages(List<NativeAd.Image> images)
  {
    this.zzxX = images;
  }

  public final void setBody(String body)
  {
    this.zzxY = body;
  }

  public final void setIcon(NativeAd.Image icon)
  {
    this.zzOo = icon;
  }

  public final void setCallToAction(String callToAction)
  {
    this.zzya = callToAction;
  }

  public final void setStarRating(double starRating)
  {
    this.zzyb = starRating;
  }

  public final void setStore(String store)
  {
    this.zzyc = store;
  }

  public final void setPrice(String price)
  {
    this.zzyd = price;
  }

  public final String getHeadline()
  {
    return this.zzxW;
  }

  public final List<NativeAd.Image> getImages()
  {
    return this.zzxX;
  }

  public final String getBody()
  {
    return this.zzxY;
  }

  public final NativeAd.Image getIcon()
  {
    return this.zzOo;
  }

  public final String getCallToAction()
  {
    return this.zzya;
  }

  public final double getStarRating()
  {
    return this.zzyb;
  }

  public final String getStore()
  {
    return this.zzyc;
  }

  public final String getPrice()
  {
    return this.zzyd;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.NativeAppInstallAdMapper
 * JD-Core Version:    0.6.0
 */