package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzhb;

@zzhb
public class StringParcel
  implements SafeParcelable
{
  public static final Parcelable.Creator<StringParcel> CREATOR = new zzn();
  final int mVersionCode;
  String zzxG;

  StringParcel(int versionCode, String content)
  {
    this.mVersionCode = versionCode;
    this.zzxG = content;
  }

  public StringParcel(String content)
  {
    this.mVersionCode = 1;
    this.zzxG = content;
  }

  public String zzgz()
  {
    return this.zzxG;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel dest, int flags)
  {
    zzn.zza(this, dest, flags);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.StringParcel
 * JD-Core Version:    0.6.0
 */