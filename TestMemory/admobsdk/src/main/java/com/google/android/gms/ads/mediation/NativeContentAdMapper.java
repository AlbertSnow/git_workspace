package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public abstract class NativeContentAdMapper extends NativeAdMapper
{
  private String zzxW;
  private List<NativeAd.Image> zzxX;
  private String zzxY;
  private NativeAd.Image zzOp;
  private String zzya;
  private String zzyh;

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

  public final void setLogo(NativeAd.Image logo)
  {
    this.zzOp = logo;
  }

  public final void setCallToAction(String callToAction)
  {
    this.zzya = callToAction;
  }

  public final void setAdvertiser(String advertiser)
  {
    this.zzyh = advertiser;
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

  public final NativeAd.Image getLogo()
  {
    return this.zzOp;
  }

  public final String getCallToAction()
  {
    return this.zzya;
  }

  public final String getAdvertiser()
  {
    return this.zzyh;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.NativeContentAdMapper
 * JD-Core Version:    0.6.0
 */