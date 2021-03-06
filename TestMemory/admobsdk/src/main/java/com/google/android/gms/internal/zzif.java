package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.zzh.zza;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@zzhb
public class zzif
{
  public final AdRequestParcel zzHt;
  public final zzjp zzED;
  public final List<String> zzBQ;
  public final int errorCode;
  public final List<String> zzBR;
  public final List<String> zzHV;
  public final int orientation;
  public final long zzBU;
  public final String zzHw;
  public final JSONObject zzKT;
  public final boolean zzIm;
  public boolean zzKU;
  public final boolean zzHT;
  public final zzen zzCp;
  public final zzey zzCq;
  public final String zzCr;
  public final zzeo zzKV;
  public final zzeq zzCs;
  public final long zzHU;
  public final AdSizeParcel zzKW;
  public final long zzHS;

  @Nullable
  public final RewardItemParcel zzIj;

  @Nullable
  public final List<String> zzKX;

  @Nullable
  public final List<String> zzIl;
  public final long zzKY;
  public final long zzKZ;
  public final String zzHY;
  public final zzh.zza zzLa;
  public boolean zzLb = false;
  public boolean zzLc = false;

  public zzif(AdRequestParcel paramAdRequestParcel, zzjp paramzzjp, List<String> paramList1, int paramInt1, List<String> paramList2, List<String> paramList3, int paramInt2, long paramLong1, String paramString1, boolean paramBoolean1, zzen paramzzen, zzey paramzzey, String paramString2, zzeo paramzzeo, zzeq paramzzeq, long paramLong2, AdSizeParcel paramAdSizeParcel, long paramLong3, long paramLong4, long paramLong5, String paramString3, JSONObject paramJSONObject, zzh.zza paramzza, RewardItemParcel paramRewardItemParcel, List<String> paramList4, List<String> paramList5, boolean paramBoolean2)
  {
    this.zzHt = paramAdRequestParcel;
    this.zzED = paramzzjp;
    this.zzBQ = zzj(paramList1);
    this.errorCode = paramInt1;
    this.zzBR = zzj(paramList2);
    this.zzHV = zzj(paramList3);
    this.orientation = paramInt2;
    this.zzBU = paramLong1;
    this.zzHw = paramString1;
    this.zzHT = paramBoolean1;
    this.zzCp = paramzzen;
    this.zzCq = paramzzey;
    this.zzCr = paramString2;
    this.zzKV = paramzzeo;
    this.zzCs = paramzzeq;
    this.zzHU = paramLong2;
    this.zzKW = paramAdSizeParcel;
    this.zzHS = paramLong3;
    this.zzKY = paramLong4;
    this.zzKZ = paramLong5;
    this.zzHY = paramString3;
    this.zzKT = paramJSONObject;
    this.zzLa = paramzza;
    this.zzIj = paramRewardItemParcel;
    this.zzKX = zzj(paramList4);
    this.zzIl = zzj(paramList5);
    this.zzIm = paramBoolean2;
  }

  public zzif(zza paramzza, zzjp paramzzjp, zzen paramzzen, zzey paramzzey, String paramString, zzeq paramzzeq, zzh.zza paramzza1)
  {
    this(paramzza.zzLd.zzHt, paramzzjp, paramzza.zzLe.zzBQ, paramzza.errorCode, paramzza.zzLe.zzBR, paramzza.zzLe.zzHV, paramzza.zzLe.orientation, paramzza.zzLe.zzBU, paramzza.zzLd.zzHw, paramzza.zzLe.zzHT, paramzzen, paramzzey, paramString, paramzza.zzKV, paramzzeq, paramzza.zzLe.zzHU, paramzza.zzrp, paramzza.zzLe.zzHS, paramzza.zzKY, paramzza.zzKZ, paramzza.zzLe.zzHY, paramzza.zzKT, paramzza1, paramzza.zzLe.zzIj, paramzza.zzLe.zzIk, paramzza.zzLe.zzIk, paramzza.zzLe.zzIm);
  }

  public boolean zzcv()
  {
    if ((this.zzED == null) || (this.zzED.zzhU() == null))
      return false;
    return this.zzED.zzhU().zzcv();
  }

  @Nullable
  private static <T> List<T> zzj(@Nullable List<T> paramList)
  {
    if (paramList == null)
      return null;
    return Collections.unmodifiableList(paramList);
  }

  @zzhb
  public static final class zza
  {
    public final AdRequestInfoParcel zzLd;
    public final AdResponseParcel zzLe;
    public final zzeo zzKV;
    public final AdSizeParcel zzrp;
    public final int errorCode;
    public final long zzKY;
    public final long zzKZ;
    public final JSONObject zzKT;

    public zza(AdRequestInfoParcel paramAdRequestInfoParcel, AdResponseParcel paramAdResponseParcel, zzeo paramzzeo, AdSizeParcel paramAdSizeParcel, int paramInt, long paramLong1, long paramLong2, JSONObject paramJSONObject)
    {
      this.zzLd = paramAdRequestInfoParcel;
      this.zzLe = paramAdResponseParcel;
      this.zzKV = paramzzeo;
      this.zzrp = paramAdSizeParcel;
      this.errorCode = paramInt;
      this.zzKY = paramLong1;
      this.zzKZ = paramLong2;
      this.zzKT = paramJSONObject;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzif
 * JD-Core Version:    0.6.0
 */