package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzhb
public class zzfg extends zzfb.zza
{
  private final NativeAppInstallAdMapper zzCM;

  public zzfg(NativeAppInstallAdMapper paramNativeAppInstallAdMapper)
  {
    this.zzCM = paramNativeAppInstallAdMapper;
  }

  public String getHeadline()
  {
    return this.zzCM.getHeadline();
  }

  public List getImages()
  {
    List localList = this.zzCM.getImages();
    if (localList != null)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        NativeAd.Image localImage = (NativeAd.Image)localIterator.next();
        localArrayList.add(new zzc(localImage.getDrawable(), localImage.getUri(), localImage.getScale()));
      }
      return localArrayList;
    }
    return null;
  }

  public String getBody()
  {
    return this.zzCM.getBody();
  }

  public zzch zzdK()
  {
    NativeAd.Image localImage = this.zzCM.getIcon();
    if (localImage != null)
      return new zzc(localImage.getDrawable(), localImage.getUri(), localImage.getScale());
    return null;
  }

  public String getCallToAction()
  {
    return this.zzCM.getCallToAction();
  }

  public double getStarRating()
  {
    return this.zzCM.getStarRating();
  }

  public String getStore()
  {
    return this.zzCM.getStore();
  }

  public String getPrice()
  {
    return this.zzCM.getPrice();
  }

  public void recordImpression()
  {
    this.zzCM.recordImpression();
  }

  public void zzc(zzd paramzzd)
  {
    this.zzCM.handleClick((View)zze.zzp(paramzzd));
  }

  public void zzd(zzd paramzzd)
  {
    this.zzCM.trackView((View)zze.zzp(paramzzd));
  }

  public boolean getOverrideImpressionRecording()
  {
    return this.zzCM.getOverrideImpressionRecording();
  }

  public boolean getOverrideClickHandling()
  {
    return this.zzCM.getOverrideClickHandling();
  }

  public Bundle getExtras()
  {
    return this.zzCM.getExtras();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfg
 * JD-Core Version:    0.6.0
 */