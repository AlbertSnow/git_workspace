package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.internal.zzhb;
import java.util.ArrayList;
import java.util.List;

@zzhb
public final class zzf
{
  private long zztS;
  private Bundle mExtras;
  private int zztT;
  private List<String> zztU;
  private boolean zztV;
  private int zztW;
  private boolean zzpE;
  private String zztX;
  private SearchAdRequestParcel zztY;
  private Location zzbj;
  private String zztZ;
  private Bundle zzua;
  private Bundle zzub;
  private List<String> zzuc;
  private String zzud;
  private String zzue;
  private boolean zzuf;

  public zzf()
  {
    this.zztS = -1L;
    this.mExtras = new Bundle();
    this.zztT = -1;
    this.zztU = new ArrayList();
    this.zztV = false;
    this.zztW = -1;
    this.zzpE = false;
    this.zztX = null;
    this.zztY = null;
    this.zzbj = null;
    this.zztZ = null;
    this.zzua = new Bundle();
    this.zzub = new Bundle();
    this.zzuc = new ArrayList();
    this.zzud = null;
    this.zzue = null;
    this.zzuf = false;
  }

  public zzf(AdRequestParcel paramAdRequestParcel)
  {
    this.zztS = paramAdRequestParcel.zztC;
    this.mExtras = paramAdRequestParcel.extras;
    this.zztT = paramAdRequestParcel.zztD;
    this.zztU = paramAdRequestParcel.zztE;
    this.zztV = paramAdRequestParcel.zztF;
    this.zztW = paramAdRequestParcel.zztG;
    this.zzpE = paramAdRequestParcel.zztH;
    this.zztX = paramAdRequestParcel.zztI;
    this.zztY = paramAdRequestParcel.zztJ;
    this.zzbj = paramAdRequestParcel.zztK;
    this.zztZ = paramAdRequestParcel.zztL;
    this.zzua = paramAdRequestParcel.zztM;
    this.zzub = paramAdRequestParcel.zztN;
    this.zzuc = paramAdRequestParcel.zztO;
    this.zzud = paramAdRequestParcel.zztP;
    this.zzue = paramAdRequestParcel.zztQ;
  }

  public AdRequestParcel zzcN()
  {
    return new AdRequestParcel(7, this.zztS, this.mExtras, this.zztT, this.zztU, this.zztV, this.zztW, this.zzpE, this.zztX, this.zztY, this.zzbj, this.zztZ, this.zzua, this.zzub, this.zzuc, this.zzud, this.zzue, this.zzuf);
  }

  public zzf zza(Location paramLocation)
  {
    this.zzbj = paramLocation;
    return this;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzf
 * JD-Core Version:    0.6.0
 */