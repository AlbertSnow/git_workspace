package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import anw;
import apn;
import com.google.android.gms.ads.internal.an;
import com.google.android.gms.ads.internal.mediation.client.n;
import com.google.android.gms.ads.internal.mediation.client.q;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import ha;
import java.util.Map;
import org.json.JSONObject;

@a
public final class g extends j
{
  private n d;
  private q e;
  private final an f;
  private h g;
  private boolean h = false;
  private Object i = new Object();

  private g(Context paramContext, an paraman, ha paramha)
  {
    super(paramContext, paraman, null, paramha, null, null, null, null);
    this.f = paraman;
  }

  public g(Context paramContext, an paraman, ha paramha, n paramn)
  {
    this(paramContext, paraman, paramha);
    this.d = paramn;
  }

  public g(Context paramContext, an paraman, ha paramha, q paramq)
  {
    this(paramContext, paraman, paramha);
    this.e = paramq;
  }

  public final b a(View.OnClickListener paramOnClickListener)
  {
    return null;
  }

  public final void a()
  {
    anw.b("recordImpression must be called on the main UI thread.");
    while (true)
    {
      synchronized (this.i)
      {
        this.a = true;
        if (this.g == null)
          continue;
        this.g.a();
        this.f.C();
        return;
        try
        {
          if ((this.d != null) && (!this.d.j()))
          {
            this.d.i();
            this.f.C();
          }
        }
        catch (RemoteException localRemoteException)
        {
          c.c("Failed to call recordImpression", localRemoteException);
        }
      }
      if ((this.e == null) || (this.e.h()))
        continue;
      this.e.g();
      this.f.C();
    }
  }

  public final void a(View paramView, Map paramMap)
  {
    synchronized (this.i)
    {
      try
      {
        if (this.d != null)
          this.d.c(apn.a(paramView));
        while (true)
        {
          return;
          if (this.e == null)
            continue;
          this.e.c(apn.a(paramView));
        }
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          c.c("Failed to call untrackView", localRemoteException);
      }
    }
  }

  public final void a(View paramView, Map paramMap, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener)
  {
    synchronized (this.i)
    {
      this.h = true;
      try
      {
        if (this.d != null)
          this.d.b(apn.a(paramView));
        while (true)
        {
          this.h = false;
          return;
          if (this.e == null)
            continue;
          this.e.b(apn.a(paramView));
        }
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          c.c("Failed to call prepareAd", localRemoteException);
      }
    }
  }

  public final void a(View paramView, Map paramMap, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3)
  {
    anw.b("performClick must be called on the main UI thread.");
    synchronized (this.i)
    {
      if (this.g != null)
      {
        this.g.a(paramView, paramMap, paramJSONObject1, paramJSONObject2, paramJSONObject3);
        this.f.e();
      }
      while (true)
      {
        return;
        try
        {
          if ((this.d != null) && (!this.d.k()))
          {
            this.d.a(apn.a(paramView));
            this.f.e();
          }
          if ((this.e == null) || (this.e.i()))
            continue;
          this.e.a(apn.a(paramView));
          this.f.e();
        }
        catch (RemoteException localRemoteException)
        {
          c.c("Failed to call performClick", localRemoteException);
        }
      }
    }
  }

  public final void a(h paramh)
  {
    synchronized (this.i)
    {
      this.g = paramh;
      return;
    }
  }

  public final boolean b()
  {
    synchronized (this.i)
    {
      boolean bool = this.h;
      return bool;
    }
  }

  public final h c()
  {
    synchronized (this.i)
    {
      h localh = this.g;
      return localh;
    }
  }

  public final com.google.android.gms.ads.internal.webview.b d()
  {
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.g
 * JD-Core Version:    0.6.0
 */