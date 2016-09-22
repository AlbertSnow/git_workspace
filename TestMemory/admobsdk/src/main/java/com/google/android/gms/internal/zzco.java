package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzhb
public class zzco extends NativeContentAd
{
  private final zzcn zzyP;
  private final List<NativeAd.Image> zzyN = new ArrayList();
  private final zzci zzyQ;

  public zzco(zzcn paramzzcn)
  {
    this.zzyP = paramzzcn;
    Object localObject1;
    try
    {
      List localList = this.zzyP.getImages();
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
      localObject1 = this.zzyP.zzdO();
      if (localObject1 != null)
        localzzci = new zzci((zzch)localObject1);
    }
    catch (RemoteException localRemoteException2)
    {
      zzb.zzb("Failed to get icon.", localRemoteException2);
    }
    this.zzyQ = localzzci;
  }

  protected zzd zzdL()
  {
    try
    {
      return this.zzyP.zzdL();
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
      return this.zzyP.getHeadline();
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
      return this.zzyP.getBody();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get body.", localRemoteException);
    }
    return null;
  }

  public NativeAd.Image getLogo()
  {
    return this.zzyQ;
  }

  public CharSequence getCallToAction()
  {
    try
    {
      return this.zzyP.getCallToAction();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get call to action.", localRemoteException);
    }
    return null;
  }

  public CharSequence getAdvertiser()
  {
    try
    {
      return this.zzyP.getAdvertiser();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to get attribution.", localRemoteException);
    }
    return null;
  }

  public Bundle getExtras()
  {
    try
    {
      return this.zzyP.getExtras();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Failed to get extras", localRemoteException);
    }
    return null;
  }

  public void destroy()
  {
    try
    {
      this.zzyP.destroy();
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
 * Qualified Name:     com.google.android.gms.internal.zzco
 * JD-Core Version:    0.6.0
 */