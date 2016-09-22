package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

@zzhb
class zzjs extends FrameLayout
  implements zzjp
{
  private final zzjp zzNN;
  private final zzjo zzNO;

  public zzjs(zzjp paramzzjp)
  {
    super(paramzzjp.getContext());
    this.zzNN = paramzzjp;
    this.zzNO = new zzjo(paramzzjp.zzhQ(), this, this);
    zzjq localzzjq = this.zzNN.zzhU();
    if (localzzjq != null)
      localzzjq.zzh(this);
    addView(this.zzNN.getView());
  }

  public zzjo zzia()
  {
    return this.zzNO;
  }

  public View getView()
  {
    return this;
  }

  public void onPause()
  {
    this.zzNO.onPause();
    this.zzNN.onPause();
  }

  public void zzhZ()
  {
    this.zzNO.onDestroy();
    this.zzNN.zzhZ();
  }

  public WebView getWebView()
  {
    return this.zzNN.getWebView();
  }

  public void zza(String paramString, Map<String, ?> paramMap)
  {
    this.zzNN.zza(paramString, paramMap);
  }

  public void zzb(String paramString, JSONObject paramJSONObject)
  {
    this.zzNN.zzb(paramString, paramJSONObject);
  }

  public void zza(String paramString, zzdf paramzzdf)
  {
    this.zzNN.zza(paramString, paramzzdf);
  }

  public void zzb(String paramString, zzdf paramzzdf)
  {
    this.zzNN.zzb(paramString, paramzzdf);
  }

  public void zzhN()
  {
    this.zzNN.zzhN();
  }

  public void zzy(int paramInt)
  {
    this.zzNN.zzy(paramInt);
  }

  public void zzfr()
  {
    this.zzNN.zzfr();
  }

  public void zzhO()
  {
    this.zzNN.zzhO();
  }

  public void zza(String paramString, JSONObject paramJSONObject)
  {
    this.zzNN.zza(paramString, paramJSONObject);
  }

  public void zze(String paramString1, String paramString2)
  {
    this.zzNN.zze(paramString1, paramString2);
  }

  public Activity zzhP()
  {
    return this.zzNN.zzhP();
  }

  public Context zzhQ()
  {
    return this.zzNN.zzhQ();
  }

  public com.google.android.gms.ads.internal.zzd zzhR()
  {
    return this.zzNN.zzhR();
  }

  public com.google.android.gms.ads.internal.overlay.zzd zzhS()
  {
    return this.zzNN.zzhS();
  }

  public com.google.android.gms.ads.internal.overlay.zzd zzhT()
  {
    return this.zzNN.zzhT();
  }

  public AdSizeParcel zzaN()
  {
    return this.zzNN.zzaN();
  }

  public zzjq zzhU()
  {
    return this.zzNN.zzhU();
  }

  public boolean zzhV()
  {
    return this.zzNN.zzhV();
  }

  public zzan zzhW()
  {
    return this.zzNN.zzhW();
  }

  public VersionInfoParcel zzhX()
  {
    return this.zzNN.zzhX();
  }

  public boolean zzhY()
  {
    return this.zzNN.zzhY();
  }

  public int getRequestedOrientation()
  {
    return this.zzNN.getRequestedOrientation();
  }

  public boolean isDestroyed()
  {
    return this.zzNN.isDestroyed();
  }

  public void zzaL(String paramString)
  {
    this.zzNN.zzaL(paramString);
  }

  public boolean zzfL()
  {
    return this.zzNN.zzfL();
  }

  public String getRequestId()
  {
    return this.zzNN.getRequestId();
  }

  public zzbz zzib()
  {
    return this.zzNN.zzib();
  }

  public zzca zzic()
  {
    return this.zzNN.zzic();
  }

  public void zzb(com.google.android.gms.ads.internal.overlay.zzd paramzzd)
  {
    this.zzNN.zzb(paramzzd);
  }

  public void zza(AdSizeParcel paramAdSizeParcel)
  {
    this.zzNN.zza(paramAdSizeParcel);
  }

  public void zzD(boolean paramBoolean)
  {
    this.zzNN.zzD(paramBoolean);
  }

  public void zzid()
  {
    this.zzNN.zzid();
  }

  public void setContext(Context context)
  {
    this.zzNN.setContext(context);
  }

  public void zzE(boolean paramBoolean)
  {
    this.zzNN.zzE(paramBoolean);
  }

  public void setRequestedOrientation(int requestedOrientation)
  {
    this.zzNN.setRequestedOrientation(requestedOrientation);
  }

  public void zzc(com.google.android.gms.ads.internal.overlay.zzd paramzzd)
  {
    this.zzNN.zzc(paramzzd);
  }

  public void zza(Context paramContext, AdSizeParcel paramAdSizeParcel, zzcb paramzzcb)
  {
    this.zzNN.zza(paramContext, paramAdSizeParcel, paramzzcb);
  }

  public void zzF(boolean paramBoolean)
  {
    this.zzNN.zzF(paramBoolean);
  }

  public void zzaM(String paramString)
  {
    this.zzNN.zzaM(paramString);
  }

  public void zzie()
  {
    this.zzNN.zzie();
  }

  public void clearCache(boolean includeDiskFiles)
  {
    this.zzNN.clearCache(includeDiskFiles);
  }

  public void destroy()
  {
    this.zzNN.destroy();
  }

  public void loadData(String data, String mimeType, String encoding)
  {
    this.zzNN.loadData(data, mimeType, encoding);
  }

  public void loadDataWithBaseURL(String baseUrl, String data, String mimeType, String encoding, String historyUrl)
  {
    this.zzNN.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, historyUrl);
  }

  public void loadUrl(String url)
  {
    this.zzNN.loadUrl(url);
  }

  public void setBackgroundColor(int color)
  {
    this.zzNN.setBackgroundColor(color);
  }

  public void setOnClickListener(View.OnClickListener listener)
  {
    this.zzNN.setOnClickListener(listener);
  }

  public void setOnTouchListener(View.OnTouchListener listener)
  {
    this.zzNN.setOnTouchListener(listener);
  }

  public void setWebChromeClient(WebChromeClient client)
  {
    this.zzNN.setWebChromeClient(client);
  }

  public void setWebViewClient(WebViewClient client)
  {
    this.zzNN.setWebViewClient(client);
  }

  public void stopLoading()
  {
    this.zzNN.stopLoading();
  }

  public void onResume()
  {
    this.zzNN.onResume();
  }

  public void zza(zzau paramzzau, boolean paramBoolean)
  {
    this.zzNN.zza(paramzzau, paramBoolean);
  }

  public View.OnClickListener zzif()
  {
    return this.zzNN.zzif();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjs
 * JD-Core Version:    0.6.0
 */