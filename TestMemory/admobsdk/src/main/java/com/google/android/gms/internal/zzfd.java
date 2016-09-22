package com.google.android.gms.internal;

import android.location.Location;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@zzhb
public final class zzfd
  implements MediationAdRequest
{
  private final Date zzbf;
  private final int zztT;
  private final Set<String> zzbh;
  private final boolean zzbi;
  private final Location zzbj;
  private final int zzCH;
  private final boolean zzuf;

  public zzfd(@Nullable Date paramDate, int paramInt1, @Nullable Set<String> paramSet, @Nullable Location paramLocation, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    this.zzbf = paramDate;
    this.zztT = paramInt1;
    this.zzbh = paramSet;
    this.zzbj = paramLocation;
    this.zzbi = paramBoolean1;
    this.zzCH = paramInt2;
    this.zzuf = paramBoolean2;
  }

  public Date getBirthday()
  {
    return this.zzbf;
  }

  public int getGender()
  {
    return this.zztT;
  }

  public Set<String> getKeywords()
  {
    return this.zzbh;
  }

  public Location getLocation()
  {
    return this.zzbj;
  }

  public boolean isTesting()
  {
    return this.zzbi;
  }

  public int taggedForChildDirectedTreatment()
  {
    return this.zzCH;
  }

  public boolean isDesignedForFamilies()
  {
    return this.zzuf;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfd
 * JD-Core Version:    0.6.0
 */