package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzhb
public class zzfh extends zzfc.zza
{
  private final NativeContentAdMapper zzCN;

  public zzfh(NativeContentAdMapper paramNativeContentAdMapper)
  {
    this.zzCN = paramNativeContentAdMapper;
  }

  public String getHeadline()
  {
    return this.zzCN.getHeadline();
  }

  public List getImages()
  {
    List localList = this.zzCN.getImages();
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
    return this.zzCN.getBody();
  }

  public zzch zzdO()
  {
    NativeAd.Image localImage = this.zzCN.getLogo();
    if (localImage != null)
      return new zzc(localImage.getDrawable(), localImage.getUri(), localImage.getScale());
    return null;
  }

  public String getCallToAction()
  {
    return this.zzCN.getCallToAction();
  }

  public String getAdvertiser()
  {
    return this.zzCN.getAdvertiser();
  }

  public void recordImpression()
  {
    this.zzCN.recordImpression();
  }

  public void zzc(zzd paramzzd)
  {
    this.zzCN.handleClick((View)zze.zzp(paramzzd));
  }

  public void zzd(zzd paramzzd)
  {
    this.zzCN.trackView((View)zze.zzp(paramzzd));
  }

  public boolean getOverrideImpressionRecording()
  {
    return this.zzCN.getOverrideImpressionRecording();
  }

  public boolean getOverrideClickHandling()
  {
    return this.zzCN.getOverrideClickHandling();
  }

  public Bundle getExtras()
  {
    return this.zzCN.getExtras();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfh
 * JD-Core Version:    0.6.0
 */