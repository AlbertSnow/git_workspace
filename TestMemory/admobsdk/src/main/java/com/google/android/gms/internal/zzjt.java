package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
class zzjt extends WebView
  implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzjp
{
  private final zza zzNP;
  private final Object zzpV = new Object();
  private final zzan zzyt;
  private final VersionInfoParcel zzpT;
  private final com.google.android.gms.ads.internal.zzd zzpm;
  private zzjq zzNQ;
  private com.google.android.gms.ads.internal.overlay.zzd zzNR;
  private AdSizeParcel zzCh;
  private boolean zzNS;
  private boolean zzNT;
  private boolean zzNU;
  private boolean zzNV;
  private Boolean zzLB;
  private int zzNW;
  private boolean zzNX = true;
  private String zzEY = "";
  private zzbz zzNY;
  private zzbz zzNZ;
  private zzbz zzOa;
  private zzca zzOb;
  private WeakReference<View.OnClickListener> zzOc;
  private com.google.android.gms.ads.internal.overlay.zzd zzOd;
  private zzjc zzrV;
  private int zzDD = -1;
  private int zzDC = -1;
  private int zzDF = -1;
  private int zzDG = -1;
  private Map<String, zzdr> zzOe;
  private final WindowManager zzsb;

  static zzjt zzb(Context paramContext, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, zzan paramzzan, VersionInfoParcel paramVersionInfoParcel, zzcb paramzzcb, com.google.android.gms.ads.internal.zzd paramzzd)
  {
    zza localzza = new zza(paramContext);
    return new zzjt(localzza, paramAdSizeParcel, paramBoolean1, paramBoolean2, paramzzan, paramVersionInfoParcel, paramzzcb, paramzzd);
  }

  protected zzjt(zza paramzza, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, zzan paramzzan, VersionInfoParcel paramVersionInfoParcel, zzcb paramzzcb, com.google.android.gms.ads.internal.zzd paramzzd)
  {
    super(paramzza);
    this.zzNP = paramzza;
    this.zzCh = paramAdSizeParcel;
    this.zzNU = paramBoolean1;
    this.zzNW = -1;
    this.zzyt = paramzzan;
    this.zzpT = paramVersionInfoParcel;
    this.zzpm = paramzzd;
    this.zzsb = ((WindowManager)getContext().getSystemService("window"));
    setBackgroundColor(0);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setAllowFileAccess(false);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setSavePassword(false);
    localWebSettings.setSupportMultipleWindows(true);
    localWebSettings.setJavaScriptCanOpenWindowsAutomatically(true);
    if (Build.VERSION.SDK_INT >= 21)
      localWebSettings.setMixedContentMode(0);
    zzr.zzbC().zza(paramzza, paramVersionInfoParcel.afmaVersion, localWebSettings);
    zzr.zzbE().zza(getContext(), localWebSettings);
    setDownloadListener(this);
    zziq();
    if (zzne.zzsi())
      addJavascriptInterface(new zzju(this), "googleAdsJsInterface");
    this.zzrV = new zzjc(this.zzNP.zzhP(), this, null);
    zzd(paramzzcb);
  }

  public void setWebViewClient(WebViewClient webViewClient)
  {
    super.setWebViewClient(webViewClient);
    if ((webViewClient instanceof zzjq))
      this.zzNQ = ((zzjq)webViewClient);
  }

  public WebView getWebView()
  {
    return this;
  }

  public View getView()
  {
    return this;
  }

  public com.google.android.gms.ads.internal.zzd zzhR()
  {
    return this.zzpm;
  }

  public boolean zzin()
  {
    if (!zzhU().zzcv())
      return false;
    DisplayMetrics localDisplayMetrics = zzr.zzbC().zza(this.zzsb);
    int i = zzn.zzcS().zzb(localDisplayMetrics, localDisplayMetrics.widthPixels);
    int j = zzn.zzcS().zzb(localDisplayMetrics, localDisplayMetrics.heightPixels);
    Activity localActivity = zzhP();
    int k;
    int m;
    if ((localActivity == null) || (localActivity.getWindow() == null))
    {
      k = i;
      m = j;
    }
    else
    {
      int[] arrayOfInt = zzr.zzbC().zze(localActivity);
      k = zzn.zzcS().zzb(localDisplayMetrics, arrayOfInt[0]);
      m = zzn.zzcS().zzb(localDisplayMetrics, arrayOfInt[1]);
    }
    if ((this.zzDC == i) && (this.zzDD == j) && (this.zzDF == k) && (this.zzDG == m))
      return false;
    int n = (this.zzDC != i) || (this.zzDD != j) ? 1 : 0;
    this.zzDC = i;
    this.zzDD = j;
    this.zzDF = k;
    this.zzDG = m;
    new zzfs(this).zza(i, j, k, m, localDisplayMetrics.density, this.zzsb.getDefaultDisplay().getRotation());
    return n;
  }

  public void zza(String paramString, Map<String, ?> paramMap)
  {
    JSONObject localJSONObject;
    try
    {
      localJSONObject = zzr.zzbC().zzG(paramMap);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzaK("Could not convert parameters to JSON.");
      return;
    }
    zzb(paramString, localJSONObject);
  }

  @TargetApi(19)
  public void evaluateJavascript(String script, ValueCallback<String> resultCallback)
  {
    synchronized (this.zzpV)
    {
      if (isDestroyed())
      {
        zzin.zzaK("The webview is destroyed. Ignoring action.");
        if (resultCallback != null)
          resultCallback.onReceiveValue(null);
        return;
      }
      super.evaluateJavascript(script, resultCallback);
    }
  }

  protected void zzaO(String paramString)
  {
    synchronized (this.zzpV)
    {
      if (!isDestroyed())
        loadUrl(paramString);
      else
        zzin.zzaK("The webview is destroyed. Ignoring action.");
    }
  }

  public void loadUrl(String uri)
  {
    synchronized (this.zzpV)
    {
      if (!isDestroyed())
        try
        {
          super.loadUrl(uri);
        }
        catch (Throwable localThrowable)
        {
          zzin.zzaK("Could not call loadUrl. " + localThrowable);
        }
      else
        zzin.zzaK("The webview is destroyed. Ignoring action.");
    }
  }

  public void zzaL(String paramString)
  {
    synchronized (this.zzpV)
    {
      try
      {
        super.loadUrl(paramString);
      }
      catch (Throwable localThrowable)
      {
        zzin.zzaK("Could not call loadUrl. " + localThrowable);
      }
    }
  }

  public void loadData(String data, String mimeType, String encoding)
  {
    synchronized (this.zzpV)
    {
      if (!isDestroyed())
        super.loadData(data, mimeType, encoding);
      else
        zzin.zzaK("The webview is destroyed. Ignoring action.");
    }
  }

  public void loadDataWithBaseURL(String baseUrl, String data, String mimeType, String encoding, String historyUrl)
  {
    synchronized (this.zzpV)
    {
      if (!isDestroyed())
        super.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, historyUrl);
      else
        zzin.zzaK("The webview is destroyed. Ignoring action.");
    }
  }

  @TargetApi(19)
  protected void zza(String paramString, ValueCallback<String> paramValueCallback)
  {
    synchronized (this.zzpV)
    {
      if (!isDestroyed())
      {
        evaluateJavascript(paramString, paramValueCallback);
      }
      else
      {
        zzin.zzaK("The webview is destroyed. Ignoring action.");
        if (paramValueCallback != null)
          paramValueCallback.onReceiveValue(null);
      }
    }
  }

  protected void zzaP(String paramString)
  {
    if (zzne.zzsk())
    {
      if (zzhg() == null)
        zzio();
      if (zzhg().booleanValue())
        zza(paramString, null);
      else
        zzaO("javascript:" + paramString);
    }
    else
    {
      zzaO("javascript:" + paramString);
    }
  }

  private void zzio()
  {
    synchronized (this.zzpV)
    {
      this.zzLB = zzr.zzbF().zzhg();
      if (this.zzLB == null)
        try
        {
          String str = "(function(){})()";
          evaluateJavascript(str, null);
          zzb(Boolean.valueOf(true));
        }
        catch (IllegalStateException localIllegalStateException)
        {
          zzb(Boolean.valueOf(false));
        }
    }
  }

  void zzb(Boolean paramBoolean)
  {
    this.zzLB = paramBoolean;
    zzr.zzbF().zzb(paramBoolean);
  }

  Boolean zzhg()
  {
    synchronized (this.zzpV)
    {
      return this.zzLB;
    }
  }

  public void zza(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
      paramJSONObject = new JSONObject();
    String str = paramJSONObject.toString();
    zze(paramString, str);
  }

  public void zze(String paramString1, String paramString2)
  {
    String str = paramString1 + "(" + paramString2 + ");";
    zzaP(str);
  }

  public void zzb(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
      paramJSONObject = new JSONObject();
    String str = paramJSONObject.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AFMA_ReceiveMessage('");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    localStringBuilder.append(",");
    localStringBuilder.append(str);
    localStringBuilder.append(");");
    zzin.v("Dispatching AFMA event: " + localStringBuilder.toString());
    zzaP(localStringBuilder.toString());
  }

  public void zzhN()
  {
    zzip();
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.zzpT.afmaVersion);
    zza("onhide", localHashMap);
  }

  public void zzy(int paramInt)
  {
    zzip();
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("closetype", String.valueOf(paramInt));
    localHashMap.put("version", this.zzpT.afmaVersion);
    zza("onhide", localHashMap);
  }

  private void zzip()
  {
    zzbx.zza(this.zzOb.zzdA(), this.zzNY, new String[] { "aeh" });
  }

  public void zzfr()
  {
    if (this.zzNY == null)
    {
      zzbx.zza(this.zzOb.zzdA(), this.zzOa, new String[] { "aes" });
      this.zzNY = zzbx.zzb(this.zzOb.zzdA());
      this.zzOb.zza("native:view_show", this.zzNY);
    }
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.zzpT.afmaVersion);
    zza("onshow", localHashMap);
  }

  public void zzhO()
  {
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("app_volume", String.valueOf(zzr.zzbC().zzbt()));
    localHashMap.put("device_volume", String.valueOf(zzr.zzbC().zzQ(getContext())));
    zza("volume", localHashMap);
  }

  public com.google.android.gms.ads.internal.overlay.zzd zzhS()
  {
    synchronized (this.zzpV)
    {
      return this.zzNR;
    }
  }

  public com.google.android.gms.ads.internal.overlay.zzd zzhT()
  {
    synchronized (this.zzpV)
    {
      return this.zzOd;
    }
  }

  public AdSizeParcel zzaN()
  {
    synchronized (this.zzpV)
    {
      return this.zzCh;
    }
  }

  public zzjq zzhU()
  {
    return this.zzNQ;
  }

  public boolean zzhV()
  {
    return this.zzNS;
  }

  public zzan zzhW()
  {
    return this.zzyt;
  }

  public VersionInfoParcel zzhX()
  {
    return this.zzpT;
  }

  public boolean zzhY()
  {
    synchronized (this.zzpV)
    {
      return this.zzNU;
    }
  }

  public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimeType, long size)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.parse(url), mimeType);
      zzr.zzbC().zzb(getContext(), localIntent);
    }
    catch (ActivityNotFoundException localActivityNotFoundException1)
    {
      zzin.zzaI("Couldn't find an Activity to view url/mimetype: " + url + " / " + mimeType);
    }
  }

  public boolean onTouchEvent(MotionEvent event)
  {
    if (this.zzyt != null)
      this.zzyt.zza(event);
    if (isDestroyed())
      return false;
    return super.onTouchEvent(event);
  }

  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
  {
    synchronized (this.zzpV)
    {
      if (isDestroyed())
      {
        setMeasuredDimension(0, 0);
        return;
      }
      if ((isInEditMode()) || (this.zzNU) || (this.zzCh.zzuk) || (this.zzCh.zzul))
      {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        return;
      }
      if (this.zzCh.zzui)
      {
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        this.zzsb.getDefaultDisplay().getMetrics(localDisplayMetrics);
        setMeasuredDimension(localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
        return;
      }
      int i = View.MeasureSpec.getMode(widthMeasureSpec);
      int j = View.MeasureSpec.getSize(widthMeasureSpec);
      int k = View.MeasureSpec.getMode(heightMeasureSpec);
      int m = View.MeasureSpec.getSize(heightMeasureSpec);
      int n = 2147483647;
      if ((i == -2147483648) || (i == 1073741824))
        n = j;
      int i1 = 2147483647;
      if ((k == -2147483648) || (k == 1073741824))
        i1 = m;
      if ((this.zzCh.widthPixels > n) || (this.zzCh.heightPixels > i1))
      {
        float f = this.zzNP.getResources().getDisplayMetrics().density;
        zzin.zzaK("Not enough space to show ad. Needs " + (int)(this.zzCh.widthPixels / f) + "x" + (int)(this.zzCh.heightPixels / f) + " dp, but only has " + (int)(j / f) + "x" + (int)(m / f) + " dp.");
        if (getVisibility() != 8)
          setVisibility(4);
        setMeasuredDimension(0, 0);
      }
      else
      {
        if (getVisibility() != 8)
          setVisibility(0);
        setMeasuredDimension(this.zzCh.widthPixels, this.zzCh.heightPixels);
      }
    }
  }

  public void onGlobalLayout()
  {
    boolean bool = zzin();
    com.google.android.gms.ads.internal.overlay.zzd localzzd = zzhS();
    if ((localzzd != null) && (bool))
      localzzd.zzfq();
  }

  public void zza(Context paramContext, AdSizeParcel paramAdSizeParcel, zzcb paramzzcb)
  {
    synchronized (this.zzpV)
    {
      this.zzrV.zzhF();
      setContext(paramContext);
      this.zzNR = null;
      this.zzCh = paramAdSizeParcel;
      this.zzNU = false;
      this.zzNS = false;
      this.zzEY = "";
      this.zzNW = -1;
      zzr.zzbE().zzj(this);
      loadUrl("about:blank");
      this.zzNQ.reset();
      setOnTouchListener(null);
      setOnClickListener(null);
      this.zzNX = true;
      zzd(paramzzcb);
    }
  }

  private void zzd(zzcb paramzzcb)
  {
    zziu();
    this.zzOb = new zzca(new zzcb(true, "make_wv", this.zzCh.zzuh));
    this.zzOb.zzdA().zzc(paramzzcb);
    this.zzNZ = zzbx.zzb(this.zzOb.zzdA());
    this.zzOb.zza("native:view_create", this.zzNZ);
    this.zzOa = null;
    this.zzNY = null;
  }

  public void zzb(com.google.android.gms.ads.internal.overlay.zzd paramzzd)
  {
    synchronized (this.zzpV)
    {
      this.zzNR = paramzzd;
    }
  }

  public void zzc(com.google.android.gms.ads.internal.overlay.zzd paramzzd)
  {
    synchronized (this.zzpV)
    {
      this.zzOd = paramzzd;
    }
  }

  public void zza(AdSizeParcel paramAdSizeParcel)
  {
    synchronized (this.zzpV)
    {
      this.zzCh = paramAdSizeParcel;
      requestLayout();
    }
  }

  public void zzD(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      this.zzNU = paramBoolean;
      zziq();
    }
  }

  public void zzid()
  {
    this.zzrV.zzhE();
  }

  protected void onAttachedToWindow()
  {
    synchronized (this.zzpV)
    {
      super.onAttachedToWindow();
      if (!isDestroyed())
        this.zzrV.onAttachedToWindow();
    }
  }

  protected void onDetachedFromWindow()
  {
    synchronized (this.zzpV)
    {
      if (!isDestroyed())
        this.zzrV.onDetachedFromWindow();
      super.onDetachedFromWindow();
    }
  }

  public void setContext(Context context)
  {
    this.zzNP.setBaseContext(context);
    this.zzrV.zzi(this.zzNP.zzhP());
  }

  public void zzE(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      if (this.zzNR != null)
        this.zzNR.zza(this.zzNQ.zzcv(), paramBoolean);
      else
        this.zzNS = paramBoolean;
    }
  }

  public int getRequestedOrientation()
  {
    synchronized (this.zzpV)
    {
      return this.zzNW;
    }
  }

  public void setRequestedOrientation(int requestedOrientation)
  {
    synchronized (this.zzpV)
    {
      this.zzNW = requestedOrientation;
      if (this.zzNR != null)
        this.zzNR.setRequestedOrientation(this.zzNW);
    }
  }

  public Activity zzhP()
  {
    return this.zzNP.zzhP();
  }

  public Context zzhQ()
  {
    return this.zzNP.zzhQ();
  }

  private void zziq()
  {
    synchronized (this.zzpV)
    {
      if ((this.zzNU) || (this.zzCh.zzui))
      {
        if (Build.VERSION.SDK_INT < 14)
        {
          zzin.zzaI("Disabling hardware acceleration on an overlay.");
          zzir();
        }
        else
        {
          zzin.zzaI("Enabling hardware acceleration on an overlay.");
          zzis();
        }
      }
      else if (Build.VERSION.SDK_INT < 18)
      {
        zzin.zzaI("Disabling hardware acceleration on an AdView.");
        zzir();
      }
      else
      {
        zzin.zzaI("Enabling hardware acceleration on an AdView.");
        zzis();
      }
    }
  }

  private void zzir()
  {
    synchronized (this.zzpV)
    {
      if (!this.zzNV)
        zzr.zzbE().zzn(this);
      this.zzNV = true;
    }
  }

  private void zzis()
  {
    synchronized (this.zzpV)
    {
      if (this.zzNV)
        zzr.zzbE().zzm(this);
      this.zzNV = false;
    }
  }

  public void destroy()
  {
    synchronized (this.zzpV)
    {
      zziu();
      this.zzrV.zzhF();
      if (this.zzNR != null)
      {
        this.zzNR.close();
        this.zzNR.onDestroy();
        this.zzNR = null;
      }
      this.zzNQ.reset();
      if (this.zzNT)
        return;
      zzr.zzbR().zzd(this);
      zzit();
      this.zzNT = true;
      zzin.v("Initiating WebView self destruct sequence in 3...");
      this.zzNQ.zzii();
    }
  }

  protected void finalize()
    throws Throwable
  {
    synchronized (this.zzpV)
    {
      if (!this.zzNT)
      {
        zzr.zzbR().zzd(this);
        zzit();
      }
    }
    super.finalize();
  }

  public void zzhZ()
  {
    synchronized (this.zzpV)
    {
      zzin.v("Destroying WebView!");
      zzir.zzMc.post(new Runnable()
      {
        public void run()
        {
          zzjt.zza(zzjt.this);
        }
      });
    }
  }

  public boolean isDestroyed()
  {
    synchronized (this.zzpV)
    {
      return this.zzNT;
    }
  }

  @TargetApi(21)
  protected void onDraw(Canvas canvas)
  {
    if (isDestroyed())
      return;
    if ((Build.VERSION.SDK_INT == 21) && (canvas.isHardwareAccelerated()) && (!isAttachedToWindow()))
      return;
    super.onDraw(canvas);
  }

  public void zzie()
  {
    if (this.zzOa == null)
    {
      this.zzOa = zzbx.zzb(this.zzOb.zzdA());
      this.zzOb.zza("native:view_load", this.zzOa);
    }
  }

  public void onPause()
  {
    if (isDestroyed())
      return;
    try
    {
      if (zzne.zzsd())
        super.onPause();
    }
    catch (Exception localException)
    {
      zzin.zzb("Could not pause webview.", localException);
    }
  }

  public void onResume()
  {
    if (isDestroyed())
      return;
    try
    {
      if (zzne.zzsd())
        super.onResume();
    }
    catch (Exception localException)
    {
      zzin.zzb("Could not resume webview.", localException);
    }
  }

  public void stopLoading()
  {
    if (isDestroyed())
      return;
    try
    {
      super.stopLoading();
    }
    catch (Exception localException)
    {
      zzin.zzb("Could not stop loading webview.", localException);
    }
  }

  public void zzF(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      this.zzNX = paramBoolean;
    }
  }

  public boolean zzfL()
  {
    synchronized (this.zzpV)
    {
      zzbx.zza(this.zzOb.zzdA(), this.zzNY, new String[] { "aebb" });
      return this.zzNX;
    }
  }

  private void zzit()
  {
    synchronized (this.zzpV)
    {
      if (this.zzOe != null)
      {
        Iterator localIterator = this.zzOe.values().iterator();
        while (localIterator.hasNext())
        {
          zzdr localzzdr = (zzdr)localIterator.next();
          localzzdr.release();
        }
      }
    }
  }

  public void zzaM(String paramString)
  {
    synchronized (this.zzpV)
    {
      this.zzEY = (paramString == null ? "" : paramString);
    }
  }

  public String getRequestId()
  {
    synchronized (this.zzpV)
    {
      return this.zzEY;
    }
  }

  public zzjo zzia()
  {
    return null;
  }

  public zzbz zzib()
  {
    return this.zzOa;
  }

  public zzca zzic()
  {
    return this.zzOb;
  }

  public void setOnClickListener(View.OnClickListener listener)
  {
    this.zzOc = new WeakReference(listener);
    super.setOnClickListener(listener);
  }

  public View.OnClickListener zzif()
  {
    return (View.OnClickListener)this.zzOc.get();
  }

  private void zziu()
  {
    if (this.zzOb == null)
      return;
    zzcb localzzcb = this.zzOb.zzdA();
    if ((localzzcb != null) && (zzr.zzbF().zzhb() != null))
      zzr.zzbF().zzhb().zza(localzzcb);
  }

  public void zza(zzau paramzzau, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("isVisible", paramBoolean ? "1" : "0");
    zza("onAdVisibilityChanged", localHashMap);
  }

  public void zza(String paramString, zzdf paramzzdf)
  {
    if (this.zzNQ != null)
      this.zzNQ.zza(paramString, paramzzdf);
  }

  public void zzb(String paramString, zzdf paramzzdf)
  {
    if (this.zzNQ != null)
      this.zzNQ.zzb(paramString, paramzzdf);
  }

  @zzhb
  public static class zza extends MutableContextWrapper
  {
    private Activity zzMM;
    private Context zzsa;
    private Context zzOg;

    public zza(Context paramContext)
    {
      super();
      setBaseContext(paramContext);
    }

    public void setBaseContext(Context base)
    {
      this.zzsa = base.getApplicationContext();
      this.zzMM = ((base instanceof Activity) ? (Activity)base : null);
      this.zzOg = base;
      super.setBaseContext(this.zzsa);
    }

    public void startActivity(Intent intent)
    {
      if ((this.zzMM != null) && (!zzne.isAtLeastL()))
      {
        this.zzMM.startActivity(intent);
      }
      else
      {
        intent.setFlags(268435456);
        this.zzsa.startActivity(intent);
      }
    }

    public Activity zzhP()
    {
      return this.zzMM;
    }

    public Object getSystemService(String service)
    {
      return this.zzOg.getSystemService(service);
    }

    public Context zzhQ()
    {
      return this.zzOg;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjt
 * JD-Core Version:    0.6.0
 */