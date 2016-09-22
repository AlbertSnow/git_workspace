package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import apj;
import apn;
import com.google.android.gms.ads.internal.util.client.e;
import java.util.concurrent.atomic.AtomicBoolean;
import mi;
import mn;

@com.google.android.gms.ads.internal.report.client.a
public final class bk
{
  public final com.google.android.gms.ads.internal.mediation.client.a a = new com.google.android.gms.ads.internal.mediation.client.a();
  final mn b = new mn();
  public final r c = new bl(this);
  public a d;
  public mi[] e;
  public ah f;
  public String g;
  public ViewGroup h;
  public boolean i;
  private final h j;

  private bk(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean1, h paramh, ah paramah, boolean paramBoolean2)
  {
    this.h = paramViewGroup;
    this.j = paramh;
    this.f = null;
    new AtomicBoolean(false);
    this.i = paramBoolean2;
    Context localContext;
    j localj;
    if (paramAttributeSet != null)
    {
      localContext = paramViewGroup.getContext();
      try
      {
        localj = new j(localContext, paramAttributeSet);
        if ((!paramBoolean1) && (localj.a.length != 1))
          throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        q.a().a.a(paramViewGroup, new AdSizeParcel(localContext, mi.a), localIllegalArgumentException.getMessage(), localIllegalArgumentException.getMessage());
      }
    }
    do
    {
      return;
      this.e = localj.a;
      this.g = localj.b;
    }
    while (!paramViewGroup.isInEditMode());
    com.google.android.gms.ads.internal.util.client.a locala = q.a().a;
    mi localmi = this.e[0];
    boolean bool = this.i;
    AdSizeParcel localAdSizeParcel = new AdSizeParcel(localContext, localmi);
    localAdSizeParcel.k = bool;
    locala.a(paramViewGroup, localAdSizeParcel, "Ads by Google", -16777216, -1);
  }

  private bk(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean1, h paramh, boolean paramBoolean2)
  {
    this(paramViewGroup, null, false, paramh, null, paramBoolean2);
  }

  public bk(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    this(paramViewGroup, null, false, h.a, paramBoolean);
  }

  public static AdSizeParcel a(Context paramContext, mi[] paramArrayOfmi, boolean paramBoolean)
  {
    AdSizeParcel localAdSizeParcel = new AdSizeParcel(paramContext, paramArrayOfmi);
    localAdSizeParcel.k = paramBoolean;
    return localAdSizeParcel;
  }

  public final mi a()
  {
    try
    {
      if (this.f != null)
      {
        AdSizeParcel localAdSizeParcel = this.f.c();
        if (localAdSizeParcel != null)
        {
          mi localmi = localAdSizeParcel.c();
          return localmi;
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to get the current AdSize.", localRemoteException);
      if (this.e != null)
        return this.e[0];
    }
    return null;
  }

  public final void a(a parama)
  {
    try
    {
      this.d = parama;
      ah localah;
      if (this.f != null)
      {
        localah = this.f;
        if (parama == null)
          break label40;
      }
      label40: for (b localb = new b(parama); ; localb = null)
      {
        localah.a(localb);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to set the AdClickListener.", localRemoteException);
    }
  }

  public final void a(mi[] paramArrayOfmi)
  {
    this.e = paramArrayOfmi;
    try
    {
      if (this.f != null)
        this.f.a(a(this.h.getContext(), this.e, this.i));
      this.h.requestLayout();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        e.c("Failed to set the ad size.", localRemoteException);
    }
  }

  public final bc b()
  {
    if (this.f == null)
      return null;
    try
    {
      bc localbc = this.f.l();
      return localbc;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to retrieve VideoController.", localRemoteException);
    }
    return null;
  }

  public final void c()
  {
    try
    {
      apj localapj = this.f.b();
      if (localapj == null)
        return;
      this.h.addView((View)apn.a(localapj));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.c("Failed to get an ad frame.", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.bk
 * JD-Core Version:    0.6.0
 */