package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.zzhb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@zzhb
public class zzh
{
  public static final zzh zzug = new zzh();

  public static zzh zzcO()
  {
    return zzug;
  }

  public AdRequestParcel zza(Context paramContext, zzaa paramzzaa)
  {
    int i = 7;
    Date localDate = paramzzaa.getBirthday();
    long l = localDate != null ? localDate.getTime() : -1L;
    String str1 = paramzzaa.getContentUrl();
    int j = paramzzaa.getGender();
    Set localSet = paramzzaa.getKeywords();
    List localList = !localSet.isEmpty() ? Collections.unmodifiableList(new ArrayList(localSet)) : null;
    boolean bool1 = paramzzaa.isTestDevice(paramContext);
    int k = paramzzaa.zzdd();
    Location localLocation = paramzzaa.getLocation();
    Bundle localBundle = paramzzaa.getNetworkExtrasBundle(AdMobAdapter.class);
    boolean bool2 = paramzzaa.getManualImpressionsEnabled();
    String str2 = paramzzaa.getPublisherProvidedId();
    SearchAdRequest localSearchAdRequest = paramzzaa.zzda();
    SearchAdRequestParcel localSearchAdRequestParcel = localSearchAdRequest != null ? new SearchAdRequestParcel(localSearchAdRequest) : null;
    String str3 = null;
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null)
    {
      String str4 = localContext.getPackageName();
      str3 = zzn.zzcS().zza(Thread.currentThread().getStackTrace(), str4);
    }
    boolean bool3 = paramzzaa.isDesignedForFamilies();
    return new AdRequestParcel(i, l, localBundle, j, localList, bool1, k, bool2, str2, localSearchAdRequestParcel, localLocation, str1, paramzzaa.zzdc(), paramzzaa.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(paramzzaa.zzde())), paramzzaa.zzcZ(), str3, bool3);
  }

  public RewardedVideoAdRequestParcel zza(Context paramContext, zzaa paramzzaa, String paramString)
  {
    AdRequestParcel localAdRequestParcel = zza(paramContext, paramzzaa);
    return new RewardedVideoAdRequestParcel(localAdRequestParcel, paramString);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzh
 * JD-Core Version:    0.6.0
 */