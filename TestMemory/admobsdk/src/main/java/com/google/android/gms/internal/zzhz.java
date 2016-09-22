package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

@zzhb
public class zzhz extends zzim
  implements zzhy
{
  private final zzif.zza zzGd;
  private final Context mContext;
  private final ArrayList<Future> zzKL = new ArrayList();
  private final ArrayList<String> zzKM = new ArrayList();
  private final HashSet<String> zzKN = new HashSet();
  private final Object zzpV = new Object();
  private final zzht zzKO;
  private final String zzrG;

  public zzhz(Context paramContext, String paramString, zzif.zza paramzza, zzht paramzzht)
  {
    this.mContext = paramContext;
    this.zzrG = paramString;
    this.zzGd = paramzza;
    this.zzKO = paramzzht;
  }

  public void zzbr()
  {
    Iterator localIterator = this.zzGd.zzKV.zzBO.iterator();
    String str1;
    Object localObject1;
    while (localIterator.hasNext())
    {
      zzen localzzen = (zzen)localIterator.next();
      str1 = localzzen.zzBG;
      localObject1 = localzzen.zzBB.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        String str2 = (String)((Iterator)localObject1).next();
        zzd(str2, str1, localzzen.zzBz);
      }
    }
    for (int i = 0; i < this.zzKL.size(); i++)
    {
      try
      {
        ((Future)this.zzKL.get(i)).get();
      }
      catch (InterruptedException localInterruptedException)
      {
        break;
      }
      catch (Exception localException)
      {
        continue;
      }
      synchronized (this.zzpV)
      {
        if (this.zzKN.contains(this.zzKM.get(i)))
        {
          str1 = (String)this.zzKM.get(i);
          localObject1 = zza(str1, (zzen)this.zzGd.zzKV.zzBO.get(i));
          zza.zzMS.post(new Runnable((zzif)localObject1)
          {
            public void run()
            {
              zzhz.zza(zzhz.this).zzb(this.zzpF);
            }
          });
          return;
        }
      }
    }
    zzif localzzif = zzgO();
    zza.zzMS.post(new Runnable(localzzif)
    {
      public void run()
      {
        zzhz.zza(zzhz.this).zzb(this.zzpF);
      }
    });
  }

  private void zzd(String paramString1, String paramString2, String paramString3)
  {
    synchronized (this.zzpV)
    {
      zzia localzzia = this.zzKO.zzaw(paramString1);
      if ((localzzia == null) || (localzzia.zzgQ() == null) || (localzzia.zzgP() == null))
        return;
      zzhu localzzhu = new zzhu(this.mContext, paramString1, this.zzrG, paramString2, paramString3, this.zzGd, localzzia, this);
      this.zzKL.add(localzzhu.zzhn());
      this.zzKM.add(paramString1);
    }
  }

  public void onStop()
  {
  }

  public void zzax(String paramString)
  {
    synchronized (this.zzpV)
    {
      this.zzKN.add(paramString);
    }
  }

  public void zza(String paramString, int paramInt)
  {
  }

  private zzif zza(String paramString, zzen paramzzen)
  {
    return zza(-2, paramString, paramzzen);
  }

  private zzif zzgO()
  {
    return zza(3, null, null);
  }

  private zzif zza(int paramInt, @Nullable String paramString, @Nullable zzen paramzzen)
  {
    return new zzif(this.zzGd.zzLd.zzHt, null, this.zzGd.zzLe.zzBQ, paramInt, this.zzGd.zzLe.zzBR, this.zzGd.zzLe.zzHV, this.zzGd.zzLe.orientation, this.zzGd.zzLe.zzBU, this.zzGd.zzLd.zzHw, this.zzGd.zzLe.zzHT, paramzzen, null, paramString, this.zzGd.zzKV, null, this.zzGd.zzLe.zzHU, this.zzGd.zzrp, this.zzGd.zzLe.zzHS, this.zzGd.zzKY, this.zzGd.zzLe.zzHX, this.zzGd.zzLe.zzHY, this.zzGd.zzKT, null, this.zzGd.zzLe.zzIj, this.zzGd.zzLe.zzIk, this.zzGd.zzLe.zzIl, this.zzGd.zzLe.zzIm);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzhz
 * JD-Core Version:    0.6.0
 */