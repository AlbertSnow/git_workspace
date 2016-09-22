package com.google.android.gms.ads.internal.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzhb;

@zzhb
public class CapabilityParcel
  implements SafeParcelable
{
  public static final Parcelable.Creator<CapabilityParcel> CREATOR = new zzi();
  public final int versionCode;
  public final boolean zzIn;
  public final boolean zzIo;
  public final boolean zzIp;

  public CapabilityParcel(boolean inAppPurchaseSupported, boolean defaultInAppPurchaseSupported, boolean appStreamingSupported)
  {
    this(2, inAppPurchaseSupported, defaultInAppPurchaseSupported, appStreamingSupported);
  }

  CapabilityParcel(int versionCode, boolean inAppPurchaseSupported, boolean defaultInAppPurchaseSupported, boolean appStreamingSupported)
  {
    this.versionCode = versionCode;
    this.zzIn = inAppPurchaseSupported;
    this.zzIo = defaultInAppPurchaseSupported;
    this.zzIp = appStreamingSupported;
  }

  public Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("iap_supported", this.zzIn);
    localBundle.putBoolean("default_iap_supported", this.zzIo);
    localBundle.putBoolean("app_streaming_supported", this.zzIp);
    return localBundle;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel dest, int flags)
  {
    zzi.zza(this, dest, flags);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.CapabilityParcel
 * JD-Core Version:    0.6.0
 */