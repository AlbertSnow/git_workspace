package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzbv;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzik;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zziu;
import com.google.android.gms.internal.zziz;
import com.google.android.gms.internal.zzjc;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@zzhb
public final class zzs
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  final String zzri;
  public String zzrj;
  public final Context context;
  final zzan zzrk;
  public final VersionInfoParcel zzrl;
  zza zzrm;
  public zzim zzrn;
  public zzit zzro;
  public AdSizeParcel zzrp;
  public zzif zzrq;
  public zzif.zza zzrr;
  public zzig zzrs;
  zzp zzrt;
  zzq zzru;
  zzw zzrv;
  zzx zzrw;
  zzgd zzrx;
  zzgh zzry;
  zzcr zzrz;
  zzcs zzrA;
  SimpleArrayMap<String, zzct> zzrB;
  SimpleArrayMap<String, zzcu> zzrC;
  NativeAdOptionsParcel zzrD;
  zzcf zzrE;

  @Nullable
  zzd zzrF;

  @Nullable
  private String zzrG;
  List<String> zzrH;
  zzk zzrI;
  public zzik zzrJ = null;
  View zzrK = null;
  public int zzrL = 0;
  boolean zzrM = false;
  boolean zzql = false;
  private HashSet<zzig> zzrN = null;
  private int zzrO = -1;
  private int zzrP = -1;
  private zziz zzrQ;
  private boolean zzrR = true;
  private boolean zzrS = true;
  private boolean zzrT = false;

  public zzs(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, VersionInfoParcel paramVersionInfoParcel)
  {
    this(paramContext, paramAdSizeParcel, paramString, paramVersionInfoParcel, null);
  }

  zzs(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, VersionInfoParcel paramVersionInfoParcel, zzan paramzzan)
  {
    zzbt.initialize(paramContext);
    if (zzr.zzbF().zzhb() != null)
    {
      List localList = zzbt.zzds();
      if (paramVersionInfoParcel.zzMZ != 0)
        localList.add(Integer.toString(paramVersionInfoParcel.zzMZ));
      zzr.zzbF().zzhb().zzb(localList);
    }
    this.zzri = UUID.randomUUID().toString();
    if ((paramAdSizeParcel.zzui) || (paramAdSizeParcel.zzuk))
    {
      this.zzrm = null;
    }
    else
    {
      this.zzrm = new zza(paramContext, this, this);
      this.zzrm.setMinimumWidth(paramAdSizeParcel.widthPixels);
      this.zzrm.setMinimumHeight(paramAdSizeParcel.heightPixels);
      this.zzrm.setVisibility(4);
    }
    this.zzrp = paramAdSizeParcel;
    this.zzrj = paramString;
    this.context = paramContext;
    this.zzrl = paramVersionInfoParcel;
    this.zzrk = (paramzzan != null ? paramzzan : new zzan(new zzh(this)));
    this.zzrQ = new zziz(200L);
    this.zzrC = new SimpleArrayMap();
  }

  public void zza(HashSet<zzig> paramHashSet)
  {
    this.zzrN = paramHashSet;
  }

  public HashSet<zzig> zzbS()
  {
    return this.zzrN;
  }

  public void zzbT()
  {
    if ((this.zzrq != null) && (this.zzrq.zzED != null))
      this.zzrq.zzED.destroy();
  }

  public void zzbU()
  {
    if ((this.zzrq != null) && (this.zzrq.zzED != null))
      this.zzrq.zzED.stopLoading();
  }

  public void zzbV()
  {
    if ((this.zzrq != null) && (this.zzrq.zzCq != null))
      try
      {
        this.zzrq.zzCq.destroy();
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzaK("Could not destroy mediation adapter.");
      }
  }

  public boolean zzbW()
  {
    return this.zzrL == 0;
  }

  public boolean zzbX()
  {
    return this.zzrL == 1;
  }

  public void zzbY()
  {
    if (this.zzrm != null)
      this.zzrm.zzbY();
  }

  public void onGlobalLayout()
  {
    zze(false);
  }

  public void onScrollChanged()
  {
    zze(true);
    this.zzrT = true;
  }

  void setUserId(String userId)
  {
    this.zzrG = userId;
  }

  public String getUserId()
  {
    return this.zzrG;
  }

  private void zze(boolean paramBoolean)
  {
    if ((this.zzrm == null) || (this.zzrq == null) || (this.zzrq.zzED == null))
      return;
    if ((paramBoolean) && (!this.zzrQ.tryAcquire()))
      return;
    if (this.zzrq.zzED.zzhU().zzcv())
    {
      int[] arrayOfInt = new int[2];
      this.zzrm.getLocationOnScreen(arrayOfInt);
      int i = zzn.zzcS().zzc(this.context, arrayOfInt[0]);
      int j = zzn.zzcS().zzc(this.context, arrayOfInt[1]);
      if ((i != this.zzrO) || (j != this.zzrP))
      {
        this.zzrO = i;
        this.zzrP = j;
        this.zzrq.zzED.zzhU().zza(this.zzrO, this.zzrP, !paramBoolean);
      }
    }
    zzbZ();
  }

  private void zzbZ()
  {
    View localView = this.zzrm.getRootView().findViewById(16908290);
    if (localView == null)
      return;
    Rect localRect1 = new Rect();
    Rect localRect2 = new Rect();
    this.zzrm.getGlobalVisibleRect(localRect1);
    localView.getGlobalVisibleRect(localRect2);
    if (localRect1.top != localRect2.top)
      this.zzrR = false;
    if (localRect1.bottom != localRect2.bottom)
      this.zzrS = false;
  }

  public String zzca()
  {
    if ((this.zzrR) && (this.zzrS))
      return "";
    if (this.zzrR)
      return this.zzrT ? "top-scrollable" : "top-locked";
    if (this.zzrS)
      return this.zzrT ? "bottom-scrollable" : "bottom-locked";
    return "";
  }

  public void zzf(boolean paramBoolean)
  {
    if (this.zzrL == 0)
      zzbU();
    if (this.zzrn != null)
      this.zzrn.cancel();
    if (this.zzro != null)
      this.zzro.cancel();
    if (paramBoolean)
      this.zzrq = null;
  }

  public void zzcb()
  {
    this.zzrs.zzl(this.zzrq.zzKY);
    this.zzrs.zzm(this.zzrq.zzKZ);
    this.zzrs.zzz(this.zzrp.zzui);
    this.zzrs.zzA(this.zzrq.zzHT);
  }

  public void destroy()
  {
    zzbY();
    this.zzru = null;
    this.zzrv = null;
    this.zzry = null;
    this.zzrx = null;
    this.zzrE = null;
    this.zzrw = null;
    zzf(false);
    if (this.zzrm != null)
      this.zzrm.removeAllViews();
    zzbT();
    zzbV();
    this.zzrq = null;
  }

  public static class zza extends ViewSwitcher
  {
    private final zziu zzrU;
    private final zzjc zzrV;

    public zza(Context paramContext, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
    {
      super();
      this.zzrU = new zziu(paramContext);
      if ((paramContext instanceof Activity))
      {
        this.zzrV = new zzjc((Activity)paramContext, paramOnGlobalLayoutListener, paramOnScrollChangedListener);
        this.zzrV.zzhE();
      }
      else
      {
        this.zzrV = null;
      }
    }

    public zziu zzcc()
    {
      return this.zzrU;
    }

    public boolean onInterceptTouchEvent(MotionEvent event)
    {
      this.zzrU.zze(event);
      return false;
    }

    public void removeAllViews()
    {
      ArrayList localArrayList = new ArrayList();
      Object localObject;
      for (int i = 0; i < getChildCount(); i++)
      {
        localObject = getChildAt(i);
        if ((localObject == null) || (!(localObject instanceof zzjp)))
          continue;
        localArrayList.add((zzjp)localObject);
      }
      super.removeAllViews();
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        localObject = (zzjp)localIterator.next();
        ((zzjp)localObject).destroy();
      }
    }

    public void zzbY()
    {
      zzin.v("Disable position monitoring on adFrame.");
      if (this.zzrV != null)
        this.zzrV.zzhF();
    }

    protected void onAttachedToWindow()
    {
      super.onAttachedToWindow();
      if (this.zzrV != null)
        this.zzrV.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
      super.onDetachedFromWindow();
      if (this.zzrV != null)
        this.zzrV.onDetachedFromWindow();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzs
 * JD-Core Version:    0.6.0
 */