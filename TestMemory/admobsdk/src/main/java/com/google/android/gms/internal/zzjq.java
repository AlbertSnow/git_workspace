package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

@zzhb
public class zzjq extends WebViewClient
{
  private static final String[] zzNy = { "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS" };
  private static final String[] zzNz = { "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID" };
  protected zzjp zzpD;
  private final HashMap<String, List<zzdf>> zzNA = new HashMap();
  private final Object zzpV = new Object();
  private zza zztz;
  private zzg zzNB;
  private zza zzGm;
  private zzdb zzyW;
  private zzb zzNC;
  private boolean zzND = false;
  private zzdh zzzD;
  private zzdj zzzy;
  private boolean zzsz;
  private boolean zzNE;
  private zzp zzNF;
  private final zzfr zzNG;
  private com.google.android.gms.ads.internal.zze zzzA;
  private zzfn zzzB;
  private zzft zzDk;
  private boolean zzNH;
  private boolean zzNI;
  private boolean zzNJ;
  private int zzNK;

  private static boolean zzg(Uri paramUri)
  {
    String str = paramUri.getScheme();
    return ("http".equalsIgnoreCase(str)) || ("https".equalsIgnoreCase(str));
  }

  public zzjq(zzjp paramzzjp, boolean paramBoolean)
  {
    this(paramzzjp, paramBoolean, new zzfr(paramzzjp, paramzzjp.zzhQ(), new zzbl(paramzzjp.getContext())), null);
  }

  zzjq(zzjp paramzzjp, boolean paramBoolean, zzfr paramzzfr, zzfn paramzzfn)
  {
    this.zzpD = paramzzjp;
    this.zzsz = paramBoolean;
    this.zzNG = paramzzfr;
    this.zzzB = paramzzfn;
  }

  public void zza(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.zzNG.zzf(paramInt1, paramInt2);
    if (this.zzzB != null)
      this.zzzB.zza(paramInt1, paramInt2, paramBoolean);
  }

  public void zzh(zzjp paramzzjp)
  {
    this.zzpD = paramzzjp;
  }

  public void zzb(zza paramzza, zzg paramzzg, zzdb paramzzdb, zzp paramzzp, boolean paramBoolean, zzdh paramzzdh, zzdj paramzzdj, com.google.android.gms.ads.internal.zze paramzze, zzft paramzzft)
  {
    if (paramzze == null)
      paramzze = new com.google.android.gms.ads.internal.zze(false);
    this.zzzB = new zzfn(this.zzpD, paramzzft);
    zza("/appEvent", new zzda(paramzzdb));
    zza("/backButton", zzde.zzzh);
    zza("/canOpenURLs", zzde.zzyY);
    zza("/canOpenIntents", zzde.zzyZ);
    zza("/click", zzde.zzza);
    zza("/close", zzde.zzzb);
    zza("/customClose", zzde.zzzd);
    zza("/instrument", zzde.zzzk);
    zza("/delayPageLoaded", new zzd(null));
    zza("/httpTrack", zzde.zzze);
    zza("/log", zzde.zzzf);
    zza("/mraid", new zzdl(paramzze, this.zzzB));
    zza("/mraidLoaded", this.zzNG);
    zza("/open", new zzdm(paramzzdh, paramzze, this.zzzB));
    zza("/precache", zzde.zzzj);
    zza("/touch", zzde.zzzg);
    zza("/video", zzde.zzzi);
    zza("/appStreaming", zzde.zzzc);
    if (paramzzdj != null)
      zza("/setInterstitialProperties", new zzdi(paramzzdj));
    this.zztz = paramzza;
    this.zzNB = paramzzg;
    this.zzyW = paramzzdb;
    this.zzzD = paramzzdh;
    this.zzNF = paramzzp;
    this.zzzA = paramzze;
    this.zzDk = paramzzft;
    this.zzzy = paramzzdj;
    zzG(paramBoolean);
  }

  public com.google.android.gms.ads.internal.zze zzig()
  {
    return this.zzzA;
  }

  public boolean zzcv()
  {
    synchronized (this.zzpV)
    {
      return this.zzsz;
    }
  }

  public boolean zzih()
  {
    synchronized (this.zzpV)
    {
      return this.zzNE;
    }
  }

  public void zzii()
  {
    synchronized (this.zzpV)
    {
      zzin.v("Loading blank page in WebView, 2...");
      this.zzNH = true;
      this.zzpD.zzaL("about:blank");
    }
  }

  public final void onPageFinished(WebView webView, String url)
  {
    synchronized (this.zzpV)
    {
      if (this.zzNH)
      {
        zzin.v("Blank page loaded, 1...");
        this.zzpD.zzhZ();
        return;
      }
    }
    this.zzNI = true;
    zzim();
  }

  private void zzij()
  {
    synchronized (this.zzpV)
    {
      this.zzNE = true;
    }
    this.zzNK += 1;
    zzim();
  }

  private void zzik()
  {
    this.zzNK -= 1;
    zzim();
  }

  private void zzil()
  {
    this.zzNJ = true;
    zzim();
  }

  public final void zzim()
  {
    if ((this.zzGm != null) && (((this.zzNI) && (this.zzNK <= 0)) || (this.zzNJ)))
    {
      this.zzGm.zza(this.zzpD, !this.zzNJ);
      this.zzGm = null;
    }
    this.zzpD.zzie();
  }

  public final void zza(AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel)
  {
    boolean bool = this.zzpD.zzhY();
    zza(new AdOverlayInfoParcel(paramAdLauncherIntentInfoParcel, (bool) && (!this.zzpD.zzaN().zzui) ? null : this.zztz, bool ? null : this.zzNB, this.zzNF, this.zzpD.zzhX()));
  }

  public final void zza(boolean paramBoolean, int paramInt)
  {
    boolean bool = this.zzpD.zzhY();
    zza(new AdOverlayInfoParcel((bool) && (!this.zzpD.zzaN().zzui) ? null : this.zztz, this.zzNB, this.zzNF, this.zzpD, paramBoolean, paramInt, this.zzpD.zzhX()));
  }

  public final void zza(boolean paramBoolean, int paramInt, String paramString)
  {
    boolean bool = this.zzpD.zzhY();
    zza(new AdOverlayInfoParcel((bool) && (!this.zzpD.zzaN().zzui) ? null : this.zztz, bool ? null : new zzc(this.zzpD, this.zzNB), this.zzyW, this.zzNF, this.zzpD, paramBoolean, paramInt, paramString, this.zzpD.zzhX(), this.zzzD));
  }

  public final void zza(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    boolean bool = this.zzpD.zzhY();
    zza(new AdOverlayInfoParcel((bool) && (!this.zzpD.zzaN().zzui) ? null : this.zztz, bool ? null : new zzc(this.zzpD, this.zzNB), this.zzyW, this.zzNF, this.zzpD, paramBoolean, paramInt, paramString1, paramString2, this.zzpD.zzhX(), this.zzzD));
  }

  public void zza(AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    boolean bool = false;
    if (this.zzzB != null)
      bool = this.zzzB.zzeN();
    zzr.zzbA().zza(this.zzpD.getContext(), paramAdOverlayInfoParcel, !bool);
  }

  public void zza(String paramString, zzdf paramzzdf)
  {
    synchronized (this.zzpV)
    {
      Object localObject1 = (List)this.zzNA.get(paramString);
      if (localObject1 == null)
      {
        localObject1 = new CopyOnWriteArrayList();
        this.zzNA.put(paramString, localObject1);
      }
      ((List)localObject1).add(paramzzdf);
    }
  }

  public void zzb(String paramString, zzdf paramzzdf)
  {
    synchronized (this.zzpV)
    {
      List localList = (List)this.zzNA.get(paramString);
      if (localList == null)
        return;
      localList.remove(paramzzdf);
    }
  }

  public final void reset()
  {
    synchronized (this.zzpV)
    {
      this.zzNA.clear();
      this.zztz = null;
      this.zzNB = null;
      this.zzGm = null;
      this.zzyW = null;
      this.zzND = false;
      this.zzsz = false;
      this.zzNE = false;
      this.zzzD = null;
      this.zzNF = null;
      this.zzNC = null;
      if (this.zzzB != null)
      {
        this.zzzB.zzp(true);
        this.zzzB = null;
      }
    }
  }

  public void zza(zza paramzza)
  {
    this.zzGm = paramzza;
  }

  public void zza(zzb paramzzb)
  {
    this.zzNC = paramzzb;
  }

  public final void onLoadResource(WebView webView, String url)
  {
    zzin.v("Loading resource: " + url);
    Uri localUri = Uri.parse(url);
    if (("gmsg".equalsIgnoreCase(localUri.getScheme())) && ("mobileads.google.com".equalsIgnoreCase(localUri.getHost())))
      zzh(localUri);
  }

  public final void onReceivedError(WebView view, int errorCode, String description, String failingUrl)
  {
    switch (errorCode)
    {
    }
    String str;
    if ((errorCode < 0) && (-errorCode - 1 < zzNy.length))
      str = zzNy[(-errorCode - 1)];
    else
      str = String.valueOf(errorCode);
    zza(this.zzpD.getContext(), "http_err", str, failingUrl);
    super.onReceivedError(view, errorCode, description, failingUrl);
  }

  public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error)
  {
    if (error != null)
    {
      int i = error.getPrimaryError();
      switch (i)
      {
      }
      String str;
      if ((i >= 0) && (i < zzNz.length))
        str = zzNz[i];
      else
        str = String.valueOf(i);
      zza(this.zzpD.getContext(), "ssl_err", str, zzr.zzbE().zza(error));
    }
    super.onReceivedSslError(view, handler, error);
  }

  private void zza(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    if (!((Boolean)zzbt.zzwO.get()).booleanValue())
      return;
    Bundle localBundle = new Bundle();
    localBundle.putString("err", paramString1);
    localBundle.putString("code", paramString2);
    localBundle.putString("host", zzaN(paramString3));
    zzr.zzbC().zza(paramContext, this.zzpD.zzhX().afmaVersion, "gmob-apps", localBundle, true);
  }

  private String zzaN(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return "";
    Uri localUri = Uri.parse(paramString);
    if (localUri.getHost() != null)
      return localUri.getHost();
    return "";
  }

  public final boolean shouldOverrideUrlLoading(WebView webView, String url)
  {
    zzin.v("AdWebView shouldOverrideUrlLoading: " + url);
    Uri localUri = Uri.parse(url);
    if (("gmsg".equalsIgnoreCase(localUri.getScheme())) && ("mobileads.google.com".equalsIgnoreCase(localUri.getHost())))
    {
      zzh(localUri);
    }
    else
    {
      if ((this.zzND) && (webView == this.zzpD.getWebView()) && (zzg(localUri)))
      {
        if ((this.zztz != null) && (((Boolean)zzbt.zzww.get()).booleanValue()))
        {
          this.zztz.onAdClicked();
          this.zztz = null;
        }
        return super.shouldOverrideUrlLoading(webView, url);
      }
      if (!this.zzpD.getWebView().willNotDraw())
      {
        try
        {
          zzan localzzan = this.zzpD.zzhW();
          if ((localzzan != null) && (localzzan.zzb(localUri)))
            localUri = localzzan.zza(localUri, this.zzpD.getContext());
        }
        catch (zzao localzzao1)
        {
          zzin.zzaK("Unable to append parameter to URL: " + url);
        }
        if ((this.zzzA == null) || (this.zzzA.zzbh()))
          zza(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", localUri.toString(), null, null, null, null, null));
        else
          this.zzzA.zzq(url);
      }
      else
      {
        zzin.zzaK("AdWebView unable to handle URL: " + url);
      }
    }
    return true;
  }

  public void zzG(boolean paramBoolean)
  {
    this.zzND = paramBoolean;
  }

  public final void zzfo()
  {
    synchronized (this.zzpV)
    {
      this.zzND = false;
      this.zzsz = true;
      zzir.runOnUiThread(new Runnable()
      {
        public void run()
        {
          zzjq.this.zzpD.zzid();
          zzd localzzd = zzjq.this.zzpD.zzhS();
          if (localzzd != null)
            localzzd.zzfo();
          if (zzjq.zzd(zzjq.this) != null)
          {
            zzjq.zzd(zzjq.this).zzbi();
            zzjq.zza(zzjq.this, null);
          }
        }
      });
    }
  }

  public void zze(int paramInt1, int paramInt2)
  {
    if (this.zzzB != null)
      this.zzzB.zze(paramInt1, paramInt2);
  }

  public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event)
  {
    switch (event.getKeyCode())
    {
    case 79:
    case 85:
    case 86:
    case 87:
    case 88:
    case 89:
    case 90:
    case 91:
    case 126:
    case 127:
    case 128:
    case 129:
    case 130:
    case 222:
      return true;
    }
    return false;
  }

  public void zzh(Uri paramUri)
  {
    String str = paramUri.getPath();
    List localList = (List)this.zzNA.get(str);
    if (localList != null)
    {
      Map localMap = zzr.zzbC().zze(paramUri);
      Object localObject;
      if (zzin.zzQ(2))
      {
        zzin.v("Received GMSG: " + str);
        localIterator = localMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          localObject = (String)localIterator.next();
          zzin.v("  " + (String)localObject + ": " + (String)localMap.get(localObject));
        }
      }
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        localObject = (zzdf)localIterator.next();
        ((zzdf)localObject).zza(this.zzpD, localMap);
      }
    }
    else
    {
      zzin.v("No GMSG handler found for GMSG: " + paramUri);
    }
  }

  private static class zzc
    implements zzg
  {
    private zzjp zzNM;
    private zzg zzNB;

    public zzc(zzjp paramzzjp, zzg paramzzg)
    {
      this.zzNM = paramzzjp;
      this.zzNB = paramzzg;
    }

    public void zzaX()
    {
      this.zzNB.zzaX();
      this.zzNM.zzfr();
    }

    public void zzaW()
    {
      this.zzNB.zzaW();
      this.zzNM.zzhN();
    }

    public void onResume()
    {
    }

    public void onPause()
    {
    }
  }

  private class zzd
    implements zzdf
  {
    private zzd()
    {
    }

    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      if (paramMap.keySet().contains("start"))
      {
        zzjq.zza(zzjq.this);
        return;
      }
      if (paramMap.keySet().contains("stop"))
      {
        zzjq.zzb(zzjq.this);
        return;
      }
      if (paramMap.keySet().contains("cancel"))
      {
        zzjq.zzc(zzjq.this);
        return;
      }
    }
  }

  public static abstract interface zzb
  {
    public abstract void zzbi();
  }

  public static abstract interface zza
  {
    public abstract void zza(zzjp paramzzjp, boolean paramBoolean);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjq
 * JD-Core Version:    0.6.0
 */