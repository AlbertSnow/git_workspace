package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@TargetApi(11)
@zzhb
public class zzjw extends zzjq
{
  protected WebResourceResponse zzd(Context paramContext, String paramString1, String paramString2)
    throws IOException, ExecutionException, InterruptedException, TimeoutException
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("User-Agent", zzr.zzbC().zze(paramContext, paramString1));
    localHashMap.put("Cache-Control", "max-stale=3600");
    zziw localzziw = new zziw(paramContext);
    zzjg localzzjg = localzziw.zzb(paramString2, localHashMap);
    String str = (String)localzzjg.get(60L, TimeUnit.SECONDS);
    return str == null ? null : new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str.getBytes("UTF-8")));
  }

  public zzjw(zzjp paramzzjp, boolean paramBoolean)
  {
    super(paramzzjp, paramBoolean);
  }

  public WebResourceResponse shouldInterceptRequest(WebView webView, String url)
  {
    try
    {
      String str1 = new File(url).getName();
      if (!"mraid.js".equalsIgnoreCase(str1))
        return super.shouldInterceptRequest(webView, url);
      if (!(webView instanceof zzjp))
      {
        zzin.zzaK("Tried to intercept request from a WebView that wasn't an AdWebView.");
        return super.shouldInterceptRequest(webView, url);
      }
      zzjp localzzjp = (zzjp)webView;
      localzzjp.zzhU().zzfo();
      String str2;
      if (localzzjp.zzaN().zzui)
        str2 = (String)zzbt.zzwf.get();
      else if (localzzjp.zzhY())
        str2 = (String)zzbt.zzwe.get();
      else
        str2 = (String)zzbt.zzwd.get();
      zzin.v("shouldInterceptRequest(" + str2 + ")");
      return zzd(localzzjp.getContext(), this.zzpD.zzhX().afmaVersion, str2);
    }
    catch (ExecutionException localExecutionException1)
    {
      zzin.zzaK("Could not fetch MRAID JS. " + localExecutionException1.getMessage());
    }
    return super.shouldInterceptRequest(webView, url);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjw
 * JD-Core Version:    0.6.0
 */