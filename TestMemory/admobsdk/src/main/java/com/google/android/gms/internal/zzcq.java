package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.List;

@zzhb
public class zzcq
  implements NativeCustomTemplateAd
{
  private final zzcp zzyR;

  public zzcq(zzcp paramzzcp)
  {
    this.zzyR = paramzzcp;
  }

  public CharSequence getText(String assetName)
  {
    try
    {
      return this.zzyR.zzO(assetName);
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get string.", localRemoteException);
    }
    return null;
  }

  public NativeAd.Image getImage(String assetName)
  {
    try
    {
      zzch localzzch = this.zzyR.zzP(assetName);
      if (localzzch != null)
        return new zzci(localzzch);
    }
    catch (RemoteException localRemoteException1)
    {
      zzb.zzb("Failed to get image.", localRemoteException1);
    }
    return null;
  }

  public List<String> getAvailableAssetNames()
  {
    try
    {
      return this.zzyR.getAvailableAssetNames();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get available asset names.", localRemoteException);
    }
    return null;
  }

  public String getCustomTemplateId()
  {
    try
    {
      return this.zzyR.getCustomTemplateId();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get custom template id.", localRemoteException);
    }
    return null;
  }

  public void performClick(String assetName)
  {
    try
    {
      this.zzyR.performClick(assetName);
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to perform click.", localRemoteException);
    }
  }

  public void recordImpression()
  {
    try
    {
      this.zzyR.recordImpression();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to record impression.", localRemoteException);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzcq
 * JD-Core Version:    0.6.0
 */