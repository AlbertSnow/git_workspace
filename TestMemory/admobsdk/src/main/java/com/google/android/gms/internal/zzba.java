package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzba extends zzau
{
  private zzeg.zzd zzsF;
  private boolean zzsG;

  public zzba(Context paramContext, AdSizeParcel paramAdSizeParcel, zzif paramzzif, VersionInfoParcel paramVersionInfoParcel, zzbb paramzzbb, zzeg paramzzeg)
  {
    super(paramContext, paramAdSizeParcel, paramzzif, paramVersionInfoParcel, paramzzbb);
    this.zzsF = paramzzeg.zzer();
    try
    {
      zzbb localzzbb = paramzzbb.zzcq();
      JSONObject localJSONObject = zzd(localzzbb.zzco());
      this.zzsF.zza(new zzji.zzc(localJSONObject)
      {
        public void zzd(zzeh paramzzeh)
        {
          zzba.this.zza(this.zzsH);
        }
      }
      , new zzji.zza()
      {
        public void run()
        {
        }
      });
    }
    catch (JSONException localJSONException)
    {
    }
    catch (RuntimeException localRuntimeException)
    {
      zzin.zzb("Failure while processing active view data.", localRuntimeException);
    }
    this.zzsF.zza(new zzji.zzc()
    {
      public void zzd(zzeh paramzzeh)
      {
        zzba.zza(zzba.this, true);
        zzba.this.zzb(paramzzeh);
        zzba.this.zzcd();
        zzba.this.zzh(false);
      }
    }
    , new zzji.zza()
    {
      public void run()
      {
        zzba.this.destroy();
      }
    });
    zzin.zzaI("Tracking ad unit: " + this.zzrZ.zzcu());
  }

  protected void zzb(JSONObject paramJSONObject)
  {
    this.zzsF.zza(new zzji.zzc(paramJSONObject)
    {
      public void zzd(zzeh paramzzeh)
      {
        paramzzeh.zza("AFMA_updateActiveView", this.zzsJ);
      }
    }
    , new zzji.zzb());
  }

  protected boolean zzcl()
  {
    return this.zzsG;
  }

  protected void destroy()
  {
    synchronized (this.zzpV)
    {
      super.destroy();
      this.zzsF.zza(new zzji.zzc()
      {
        public void zzd(zzeh paramzzeh)
        {
          zzba.this.zzc(paramzzeh);
        }
      }
      , new zzji.zzb());
      this.zzsF.release();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzba
 * JD-Core Version:    0.6.0
 */