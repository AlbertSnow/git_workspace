package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzhb;

@zzhb
public class NativeAdOptionsParcel
  implements SafeParcelable
{
  public static final zzj CREATOR = new zzj();
  public final int versionCode;
  public final boolean zzyA;
  public final int zzyB;
  public final boolean zzyC;

  public NativeAdOptionsParcel(NativeAdOptions options)
  {
    this(1, options.shouldReturnUrlsForImageAssets(), options.getImageOrientation(), options.shouldRequestMultipleImages());
  }

  public NativeAdOptionsParcel(int versionCode, boolean shouldReturnUrlsForImageAssets, int imageOrientation, boolean shouldRequestMultipleImages)
  {
    this.versionCode = versionCode;
    this.zzyA = shouldReturnUrlsForImageAssets;
    this.zzyB = imageOrientation;
    this.zzyC = shouldRequestMultipleImages;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel out, int flags)
  {
    zzj.zza(this, out, flags);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel
 * JD-Core Version:    0.6.0
 */