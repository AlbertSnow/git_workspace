package com.google.android.gms.appstreaming.internal;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Base64;
import android.view.SurfaceView;
import apg;
import apj;
import apn;
import asj;
import asn;
import aso;
import asq;
import asr;
import atj;
import atx;
import aty;
import aui;
import aum;
import auz;
import avf;
import awb;
import com.google.android.gms.appstreaming.AppStreamingInfo;
import com.google.android.gms.common.util.DynamiteApi;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import mz;
import na;
import nd;
import ni;

@DynamiteApi
public class AppStreamingFragmentDelegateImpl extends nd
{
  public static final String EXTERNAL_TAG = "AppStreamingFragment";
  public static final Logger a = aso.a("AppStreamingFragment", "AppStreamingFragmentDelegateImpl");
  public atj b;
  public Activity c;
  public apg d;
  public ni e;
  public Executor f;
  public SurfaceView g;
  public atx h;
  public auz i;
  public boolean j;
  public long k;
  private Context l;
  private na m;

  public void initialize(apg paramapg, apj paramapj, AppStreamingInfo paramAppStreamingInfo, ni paramni)
  {
    this.d = paramapg;
    this.c = ((Activity)apn.a(this.d.a()));
    this.l = ((Context)apn.a(paramapj));
    this.e = paramni;
    aty localaty = new aty();
    localaty.a = paramAppStreamingInfo.b;
    localaty.b = paramAppStreamingInfo.c;
    localaty.c = paramAppStreamingInfo.d;
    localaty.d = paramAppStreamingInfo.e;
    localaty.e = paramAppStreamingInfo.f;
    localaty.f = paramAppStreamingInfo.g;
    localaty.g = paramAppStreamingInfo.h;
    localaty.h = paramAppStreamingInfo.k;
    this.h = new atx(localaty);
    this.j = paramAppStreamingInfo.i;
    Logger localLogger = a;
    Level localLevel = asn.c;
    String str = String.valueOf(this.e);
    localLogger.log(localLevel, 23 + String.valueOf(str).length() + " mAppStreamingListener=" + str);
  }

  public void mute()
  {
    this.j = true;
    if (this.b != null)
      this.b.a();
  }

  public boolean onBackPressed()
  {
    if (this.b != null)
    {
      atj localatj = this.b;
      if (localatj.n.get())
      {
        avf localavf = new avf();
        localavf.b = new aui();
        localatj.f.a(localavf);
      }
      for (int n = 1; n != 0; n = 0)
        return true;
    }
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    this.m = new na(this);
    if (paramBundle != null);
    try
    {
      byte[] arrayOfByte = Base64.decode(paramBundle.getString("provisioningResponse"), 0);
      this.i = ((auz)awb.a(new auz(), arrayOfByte));
      this.k = paramBundle.getLong("pauseDeadlineMillis");
      return;
    }
    catch (IOException localIOException)
    {
      a.log(asn.a, "Unable to parse cached provisioning response");
    }
  }

  public apj onCreateView(apj paramapj1, apj paramapj2, Bundle paramBundle)
  {
    if (this.f == null)
    {
      a.log(asn.c, "Creating new Executor");
      this.f = Executors.newCachedThreadPool();
    }
    this.g = new asr(this.l, new mz(this));
    return apn.a(this.g);
  }

  public void onDestroy()
  {
    if (this.b != null)
      this.b.a(0);
  }

  public void onPause()
  {
    if (this.b != null)
    {
      if (this.b.n.get())
        break label29;
      this.b.a(0);
    }
    label29: 
    do
      return;
    while ((this.d.p()) || (this.b.d == null));
    this.i = this.b.d;
    atj localatj = this.b;
    if (!localatj.m.getAndSet(true))
    {
      if (localatj.n.get())
      {
        avf localavf = new avf();
        localavf.h = new aum();
        localavf.h.a = 3;
        localatj.f.a(localavf);
        localatj.i.b(localatj.g);
      }
      localatj.c();
    }
    this.g.setVisibility(8);
    this.k = (System.currentTimeMillis() + this.b.d.h);
  }

  public void onResume()
  {
    this.g.setVisibility(0);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    if ((this.b != null) && (this.b.d != null));
    try
    {
      paramBundle.putString("provisioningResponse", Base64.encodeToString(auz.a(this.b.d), 0));
      paramBundle.putLong("pauseDeadlineMillis", this.k);
      return;
    }
    catch (IOException localIOException)
    {
      a.log(asn.a, "Unable to serialize ProvisioningResponse.");
    }
  }

  public void onStart()
  {
    IntentFilter localIntentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    this.c.registerReceiver(this.m, localIntentFilter);
  }

  public void onStop()
  {
    this.c.unregisterReceiver(this.m);
  }

  public void unmute()
  {
    this.j = false;
    if (this.b != null)
      this.b.b();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstreaming.internal.AppStreamingFragmentDelegateImpl
 * JD-Core Version:    0.6.0
 */