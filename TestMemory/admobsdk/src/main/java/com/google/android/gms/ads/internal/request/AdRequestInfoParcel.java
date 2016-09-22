package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzhb;
import java.util.Collections;
import java.util.List;

@zzhb
public final class AdRequestInfoParcel
  implements SafeParcelable
{
  public static final zzf CREATOR = new zzf();
  public final int versionCode;
  public final Bundle zzHs;
  public final AdRequestParcel zzHt;
  public final AdSizeParcel zzrp;
  public final String zzrj;
  public final ApplicationInfo applicationInfo;
  public final PackageInfo zzHu;
  public final String zzHv;
  public final String zzHw;
  public final String zzHx;
  public final VersionInfoParcel zzrl;
  public final Bundle zzHy;
  public final int zzHz;
  public final List<String> zzrH;
  public final Bundle zzHA;
  public final boolean zzHB;
  public final Messenger zzHC;
  public final int zzHD;
  public final int zzHE;
  public final float zzHF;
  public final String zzHG;
  public final long zzHH;
  public final String zzHI;
  public final List<String> zzHJ;
  public final String zzri;
  public final NativeAdOptionsParcel zzrD;
  public final List<String> zzHK;
  public final long zzHL;
  public final CapabilityParcel zzHM;
  public final String zzHN;
  public final float zzHO;
  public final int zzHP;
  public final int zzHQ;

  public AdRequestInfoParcel(Bundle adPositionBundle, AdRequestParcel adRequest, AdSizeParcel adSize, String adUnitId, ApplicationInfo applicationInfo, PackageInfo packageInfo, String querySpamSignals, String sequenceNumber, String sessionId, VersionInfoParcel versionInfo, Bundle stats, int nativeVersion, List<String> nativeTemplates, List<String> nativeCustomTemplateIds, Bundle contentInfo, boolean useHTTPS, Messenger prefetchMessenger, int screenWidth, int screenHeight, float screenDensity, String viewHierarchy, long correlationId, String requestId, List<String> experimentIds, String slotId, NativeAdOptionsParcel nativeAdOptionsParcel, long connectionStartTime, CapabilityParcel capabilityParcel, String anchorStatus, float appVolume, int targetApi, int adapterViewPosition)
  {
    this(15, adPositionBundle, adRequest, adSize, adUnitId, applicationInfo, packageInfo, querySpamSignals, sequenceNumber, sessionId, versionInfo, stats, nativeVersion, nativeTemplates, contentInfo, useHTTPS, prefetchMessenger, screenWidth, screenHeight, screenDensity, viewHierarchy, correlationId, requestId, experimentIds, slotId, nativeAdOptionsParcel, nativeCustomTemplateIds, connectionStartTime, capabilityParcel, anchorStatus, appVolume, targetApi, adapterViewPosition);
  }

  public AdRequestInfoParcel(zza partialAdRequestInfo, String querySpamSignals, long connectionStartTime)
  {
    this(partialAdRequestInfo.zzHs, partialAdRequestInfo.zzHt, partialAdRequestInfo.zzrp, partialAdRequestInfo.zzrj, partialAdRequestInfo.applicationInfo, partialAdRequestInfo.zzHu, querySpamSignals, partialAdRequestInfo.zzHw, partialAdRequestInfo.zzHx, partialAdRequestInfo.zzrl, partialAdRequestInfo.zzHy, partialAdRequestInfo.zzHz, partialAdRequestInfo.zzrH, partialAdRequestInfo.zzHK, partialAdRequestInfo.zzHA, partialAdRequestInfo.zzHB, partialAdRequestInfo.zzHC, partialAdRequestInfo.zzHD, partialAdRequestInfo.zzHE, partialAdRequestInfo.zzHF, partialAdRequestInfo.zzHG, partialAdRequestInfo.zzHH, partialAdRequestInfo.zzHI, partialAdRequestInfo.zzHJ, partialAdRequestInfo.zzri, partialAdRequestInfo.zzrD, connectionStartTime, partialAdRequestInfo.zzHM, partialAdRequestInfo.zzHN, partialAdRequestInfo.zzHO, partialAdRequestInfo.zzHP, partialAdRequestInfo.zzHQ);
  }

  AdRequestInfoParcel(int versionCode, Bundle adPositionBundle, AdRequestParcel adRequest, AdSizeParcel adSize, String adUnitId, ApplicationInfo applicationInfo, PackageInfo packageInfo, String querySpamSignals, String sequenceNumber, String sessionId, VersionInfoParcel versionInfo, Bundle stats, int nativeVersion, List<String> nativeTemplates, Bundle contentInfo, boolean useHTTPS, Messenger prefetchMessenger, int screenWidth, int screenHeight, float screenDensity, String viewHierarchy, long correlationId, String requestId, List<String> experimentIds, String slotId, NativeAdOptionsParcel nativeAdOptions, List<String> nativeCustomTemplateIds, long connectionStartTime, CapabilityParcel capabilityParcel, String anchorStatus, float appVolume, int targetApi, int adapterViewPosition)
  {
    this.versionCode = versionCode;
    this.zzHs = adPositionBundle;
    this.zzHt = adRequest;
    this.zzrp = adSize;
    this.zzrj = adUnitId;
    this.applicationInfo = applicationInfo;
    this.zzHu = packageInfo;
    this.zzHv = querySpamSignals;
    this.zzHw = sequenceNumber;
    this.zzHx = sessionId;
    this.zzrl = versionInfo;
    this.zzHy = stats;
    this.zzHz = nativeVersion;
    this.zzrH = nativeTemplates;
    this.zzHK = (nativeCustomTemplateIds == null ? Collections.emptyList() : Collections.unmodifiableList(nativeCustomTemplateIds));
    this.zzHA = contentInfo;
    this.zzHB = useHTTPS;
    this.zzHC = prefetchMessenger;
    this.zzHD = screenWidth;
    this.zzHE = screenHeight;
    this.zzHF = screenDensity;
    this.zzHG = viewHierarchy;
    this.zzHH = correlationId;
    this.zzHI = requestId;
    this.zzHJ = (experimentIds == null ? Collections.emptyList() : Collections.unmodifiableList(experimentIds));
    this.zzri = slotId;
    this.zzrD = nativeAdOptions;
    this.zzHL = connectionStartTime;
    this.zzHM = capabilityParcel;
    this.zzHN = anchorStatus;
    this.zzHO = appVolume;
    this.zzHP = targetApi;
    this.zzHQ = adapterViewPosition;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel out, int flags)
  {
    zzf.zza(this, out, flags);
  }

  @zzhb
  public static final class zza
  {
    public final Bundle zzHs;
    public final AdRequestParcel zzHt;
    public final AdSizeParcel zzrp;
    public final String zzrj;
    public final ApplicationInfo applicationInfo;
    public final PackageInfo zzHu;
    public final String zzHw;
    public final String zzHx;
    public final Bundle zzHy;
    public final VersionInfoParcel zzrl;
    public final int zzHz;
    public final List<String> zzrH;
    public final List<String> zzHK;
    public final Bundle zzHA;
    public final boolean zzHB;
    public final Messenger zzHC;
    public final int zzHD;
    public final int zzHE;
    public final float zzHF;
    public final String zzHG;
    public final long zzHH;
    public final String zzHI;
    public final List<String> zzHJ;
    public final String zzri;
    public final NativeAdOptionsParcel zzrD;
    public final CapabilityParcel zzHM;
    public final String zzHN;
    public final float zzHO;
    public final int zzHP;
    public final int zzHQ;

    public zza(Bundle paramBundle1, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, VersionInfoParcel paramVersionInfoParcel, Bundle paramBundle2, List<String> paramList1, List<String> paramList2, Bundle paramBundle3, boolean paramBoolean, Messenger paramMessenger, int paramInt1, int paramInt2, float paramFloat1, String paramString4, long paramLong, String paramString5, List<String> paramList3, String paramString6, NativeAdOptionsParcel paramNativeAdOptionsParcel, CapabilityParcel paramCapabilityParcel, String paramString7, float paramFloat2, int paramInt3, int paramInt4)
    {
      this.zzHs = paramBundle1;
      this.zzHt = paramAdRequestParcel;
      this.zzrp = paramAdSizeParcel;
      this.zzrj = paramString1;
      this.applicationInfo = paramApplicationInfo;
      this.zzHu = paramPackageInfo;
      this.zzHw = paramString2;
      this.zzHx = paramString3;
      this.zzrl = paramVersionInfoParcel;
      this.zzHy = paramBundle2;
      this.zzHB = paramBoolean;
      this.zzHC = paramMessenger;
      this.zzHD = paramInt1;
      this.zzHE = paramInt2;
      this.zzHF = paramFloat1;
      if ((paramList1 != null) && (paramList1.size() > 0))
      {
        this.zzHz = 3;
        this.zzrH = paramList1;
        this.zzHK = paramList2;
      }
      else
      {
        if (paramAdSizeParcel.zzum)
          this.zzHz = 4;
        else
          this.zzHz = 0;
        this.zzrH = null;
        this.zzHK = null;
      }
      this.zzHA = paramBundle3;
      this.zzHG = paramString4;
      this.zzHH = paramLong;
      this.zzHI = paramString5;
      this.zzHJ = paramList3;
      this.zzri = paramString6;
      this.zzrD = paramNativeAdOptionsParcel;
      this.zzHM = paramCapabilityParcel;
      this.zzHN = paramString7;
      this.zzHO = paramFloat2;
      this.zzHP = paramInt3;
      this.zzHQ = paramInt4;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.AdRequestInfoParcel
 * JD-Core Version:    0.6.0
 */