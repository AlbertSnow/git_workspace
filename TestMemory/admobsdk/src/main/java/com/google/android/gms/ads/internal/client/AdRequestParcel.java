package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zzhb;
import java.util.List;

@zzhb
public final class AdRequestParcel
  implements SafeParcelable
{
  public static final zzg CREATOR = new zzg();
  public final int versionCode;
  public final long zztC;
  public final Bundle extras;
  public final int zztD;
  public final List<String> zztE;
  public final boolean zztF;
  public final int zztG;
  public final boolean zztH;
  public final String zztI;
  public final SearchAdRequestParcel zztJ;
  public final Location zztK;
  public final String zztL;
  public final Bundle zztM;
  public final Bundle zztN;
  public final List<String> zztO;
  public final String zztP;
  public final String zztQ;
  public final boolean zztR;

  public AdRequestParcel(int versionCode, long birthday, Bundle extras, int gender, List<String> keywords, boolean isTestDevice, int tagForChildDirectedTreatment, boolean manualImpressionsEnabled, String publisherProvidedId, SearchAdRequestParcel searchAdRequestParcel, Location location, String contentUrl, Bundle networkExtras, Bundle customTargeting, List<String> categoryExclusions, String requestAgent, String requestPackage, boolean isDesignedForFamilies)
  {
    this.versionCode = versionCode;
    this.zztC = birthday;
    this.extras = (extras == null ? new Bundle() : extras);
    this.zztD = gender;
    this.zztE = keywords;
    this.zztF = isTestDevice;
    this.zztG = tagForChildDirectedTreatment;
    this.zztH = manualImpressionsEnabled;
    this.zztI = publisherProvidedId;
    this.zztJ = searchAdRequestParcel;
    this.zztK = location;
    this.zztL = contentUrl;
    this.zztM = networkExtras;
    this.zztN = customTargeting;
    this.zztO = categoryExclusions;
    this.zztP = requestAgent;
    this.zztQ = requestPackage;
    this.zztR = isDesignedForFamilies;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel out, int flags)
  {
    zzg.zza(this, out, flags);
  }

  public boolean equals(Object other)
  {
    if (!(other instanceof AdRequestParcel))
      return false;
    AdRequestParcel localAdRequestParcel = (AdRequestParcel)other;
    return (this.versionCode == localAdRequestParcel.versionCode) && (this.zztC == localAdRequestParcel.zztC) && (zzw.equal(this.extras, localAdRequestParcel.extras)) && (this.zztD == localAdRequestParcel.zztD) && (zzw.equal(this.zztE, localAdRequestParcel.zztE)) && (this.zztF == localAdRequestParcel.zztF) && (this.zztG == localAdRequestParcel.zztG) && (this.zztH == localAdRequestParcel.zztH) && (zzw.equal(this.zztI, localAdRequestParcel.zztI)) && (zzw.equal(this.zztJ, localAdRequestParcel.zztJ)) && (zzw.equal(this.zztK, localAdRequestParcel.zztK)) && (zzw.equal(this.zztL, localAdRequestParcel.zztL)) && (zzw.equal(this.zztM, localAdRequestParcel.zztM)) && (zzw.equal(this.zztN, localAdRequestParcel.zztN)) && (zzw.equal(this.zztO, localAdRequestParcel.zztO)) && (zzw.equal(this.zztP, localAdRequestParcel.zztP)) && (zzw.equal(this.zztQ, localAdRequestParcel.zztQ)) && (this.zztR == localAdRequestParcel.zztR);
  }

  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(this.versionCode), Long.valueOf(this.zztC), this.extras, Integer.valueOf(this.zztD), this.zztE, Boolean.valueOf(this.zztF), Integer.valueOf(this.zztG), Boolean.valueOf(this.zztH), this.zztI, this.zztJ, this.zztK, this.zztL, this.zztM, this.zztN, this.zztO, this.zztP, this.zztQ, Boolean.valueOf(this.zztR) });
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.AdRequestParcel
 * JD-Core Version:    0.6.0
 */