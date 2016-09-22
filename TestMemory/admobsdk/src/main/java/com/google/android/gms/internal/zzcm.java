package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzhb
public class zzcm extends NativeAppInstallAd
{
  private final zzcl zzyM;
  private final List<NativeAd.Image> zzyN = new ArrayList();
  private final zzci zzyO;

  public zzcm(zzcl paramzzcl)
  {
    this.zzyM = paramzzcl;
    Object localObject1;
    try
    {
      List localList = this.zzyM.getImages();
      if (localList != null)
      {
        localObject1 = localList.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = ((Iterator)localObject1).next();
          zzch localzzch = zzc(localObject2);
          if (localzzch != null)
            this.zzyN.add(new zzci(localzzch));
        }
      }
    }
    catch (RemoteException localRemoteException1)
    {
      zzb.zzb("Failed to get image.", localRemoteException1);
    }
    zzci localzzci = null;
    try
    {
      localObject1 = this.zzyM.zzdK();
      if (localObject1 != null)
        localzzci = new zzci((zzch)localObject1);
    }
    catch (RemoteException localRemoteException2)
    {
      zzb.zzb("Failed to get icon.", localRemoteException2);
    }
    this.zzyO = localzzci;
  }

  protected zzd zzdL()
  {
    try
    {
      return this.zzyM.zzdL();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to retrieve native ad engine.", localRemoteException);
    }
    return null;
  }

  public CharSequence getHeadline()
  {
    try
    {
      return this.zzyM.getHeadline();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get headline.", localRemoteException);
    }
    return null;
  }

  public List<NativeAd.Image> getImages()
  {
    return this.zzyN;
  }

  public CharSequence getBody()
  {
    try
    {
      return this.zzyM.getBody();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get body.", localRemoteException);
    }
    return null;
  }

  public NativeAd.Image getIcon()
  {
    return this.zzyO;
  }

  public CharSequence getCallToAction()
  {
    try
    {
      return this.zzyM.getCallToAction();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get call to action.", localRemoteException);
    }
    return null;
  }

  public Double getStarRating()
  {
    try
    {
      double d = this.zzyM.getStarRating();
      return d == -1.0D ? null : Double.valueOf(d);
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get star rating.", localRemoteException);
    }
    return null;
  }

  public CharSequence getStore()
  {
    try
    {
      return this.zzyM.getStore();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get store", localRemoteException);
    }
    return null;
  }

  public CharSequence getPrice()
  {
    try
    {
      return this.zzyM.getPrice();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get price.", localRemoteException);
    }
    return null;
  }

  public Bundle getExtras()
  {
    try
    {
      return this.zzyM.getExtras();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get extras", localRemoteException);
    }
    return null;
  }

  public void destroy()
  {
    try
    {
      this.zzyM.destroy();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to destroy", localRemoteException);
    }
  }

  zzch zzc(Object paramObject)
  {
    if ((paramObject instanceof IBinder))
      return zzch.zza.zzt((IBinder)paramObject);
    return null;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzcm
 * JD-Core Version:    0.6.0
 */