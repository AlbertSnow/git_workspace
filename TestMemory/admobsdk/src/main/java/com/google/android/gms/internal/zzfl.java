package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.zza;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@zzhb
public final class zzfl
{
  public static AdSize zzb(AdSizeParcel paramAdSizeParcel)
  {
    AdSize[] arrayOfAdSize = { AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER };
    for (int i = 0; i < arrayOfAdSize.length; i++)
      if ((arrayOfAdSize[i].getWidth() == paramAdSizeParcel.width) && (arrayOfAdSize[i].getHeight() == paramAdSizeParcel.height))
        return arrayOfAdSize[i];
    return new AdSize(zza.zza(paramAdSizeParcel.width, paramAdSizeParcel.height, paramAdSizeParcel.zzuh));
  }

  public static AdRequest.Gender zzu(int paramInt)
  {
    switch (paramInt)
    {
    case 2:
      return AdRequest.Gender.FEMALE;
    case 1:
      return AdRequest.Gender.MALE;
    case 0:
    }
    return AdRequest.Gender.UNKNOWN;
  }

  public static int zza(AdRequest.ErrorCode paramErrorCode)
  {
    switch (1.zzCT[paramErrorCode.ordinal()])
    {
    case 1:
    default:
      return 0;
    case 2:
      return 1;
    case 3:
      return 2;
    case 4:
    }
    return 3;
  }

  public static MediationAdRequest zzj(AdRequestParcel paramAdRequestParcel)
  {
    Set localSet = paramAdRequestParcel.zztE != null ? new HashSet(paramAdRequestParcel.zztE) : null;
    return new MediationAdRequest(new Date(paramAdRequestParcel.zztC), zzu(paramAdRequestParcel.zztD), localSet, paramAdRequestParcel.zztF, paramAdRequestParcel.zztK);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfl
 * JD-Core Version:    0.6.0
 */