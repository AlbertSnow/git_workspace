package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;

@TargetApi(8)
@zzhb
public class zzis
{
  public boolean isAttachedToWindow(View view)
  {
    return (view.getWindowToken() != null) || (view.getWindowVisibility() != 8);
  }

  public boolean zza(Context paramContext, WebSettings paramWebSettings)
  {
    return false;
  }

  public boolean zzm(View paramView)
  {
    return false;
  }

  public boolean zzn(View paramView)
  {
    return false;
  }

  public boolean zza(Window paramWindow)
  {
    return false;
  }

  public boolean zzi(zzjp paramzzjp)
  {
    if (paramzzjp == null)
      return false;
    paramzzjp.onPause();
    return true;
  }

  public boolean zzj(zzjp paramzzjp)
  {
    if (paramzzjp == null)
      return false;
    paramzzjp.onResume();
    return true;
  }

  public int zzhv()
  {
    return 0;
  }

  public int zzhw()
  {
    return 1;
  }

  public int zzhx()
  {
    return 5;
  }

  public String getDefaultUserAgent(Context context)
  {
    return "";
  }

  public boolean zza(DownloadManager.Request paramRequest)
  {
    return false;
  }

  public zzjq zzb(zzjp paramzzjp, boolean paramBoolean)
  {
    return new zzjq(paramzzjp, paramBoolean);
  }

  public WebChromeClient zzk(zzjp paramzzjp)
  {
    return null;
  }

  public Set<String> zzf(Uri paramUri)
  {
    if (paramUri.isOpaque())
      return Collections.emptySet();
    String str1 = paramUri.getEncodedQuery();
    if (str1 == null)
      return Collections.emptySet();
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    int i = 0;
    do
    {
      int j = str1.indexOf('&', i);
      int k = j == -1 ? str1.length() : j;
      int m = str1.indexOf('=', i);
      if ((m > k) || (m == -1))
        m = k;
      String str2 = str1.substring(i, m);
      localLinkedHashSet.add(Uri.decode(str2));
      i = k + 1;
    }
    while (i < str1.length());
    return Collections.unmodifiableSet(localLinkedHashSet);
  }

  public void zzb(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    Window localWindow = paramActivity.getWindow();
    if ((localWindow != null) && (localWindow.getDecorView() != null) && (localWindow.getDecorView().getViewTreeObserver() != null))
      zza(localWindow.getDecorView().getViewTreeObserver(), paramOnGlobalLayoutListener);
  }

  public void zza(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramViewTreeObserver.removeGlobalOnLayoutListener(paramOnGlobalLayoutListener);
  }

  public ViewGroup.LayoutParams zzhy()
  {
    return new ViewGroup.LayoutParams(-2, -2);
  }

  public void zza(View paramView, Drawable paramDrawable)
  {
    paramView.setBackgroundDrawable(paramDrawable);
  }

  public String zza(SslError paramSslError)
  {
    return "";
  }

  public Drawable zza(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    return new BitmapDrawable(paramContext.getResources(), paramBitmap);
  }

  public static zzis zzP(int paramInt)
  {
    if (paramInt >= 19)
      return new zzg();
    if (paramInt >= 18)
      return new zze();
    if (paramInt >= 17)
      return new zzd();
    if (paramInt >= 16)
      return new zzf();
    if (paramInt >= 14)
      return new zzc();
    if (paramInt >= 11)
      return new zzb();
    if (paramInt >= 9)
      return new zza();
    return new zzis();
  }

  @TargetApi(19)
  public static class zzg extends zzis.zze
  {
    public boolean isAttachedToWindow(View view)
    {
      return view.isAttachedToWindow();
    }

    public ViewGroup.LayoutParams zzhy()
    {
      return new ViewGroup.LayoutParams(-1, -1);
    }
  }

  @TargetApi(18)
  public static class zze extends zzis.zzd
  {
    public boolean isAttachedToWindow(View view)
    {
      return (super.isAttachedToWindow(view)) || (view.getWindowId() != null);
    }

    public int zzhx()
    {
      return 14;
    }
  }

  @TargetApi(17)
  public static class zzd extends zzis.zzf
  {
    public boolean zza(Context paramContext, WebSettings paramWebSettings)
    {
      super.zza(paramContext, paramWebSettings);
      paramWebSettings.setMediaPlaybackRequiresUserGesture(false);
      return true;
    }

    public String getDefaultUserAgent(Context context)
    {
      return WebSettings.getDefaultUserAgent(context);
    }

    public Drawable zza(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
    {
      if ((!paramBoolean) || (paramFloat <= 0.0F) || (paramFloat > 25.0F))
        return new BitmapDrawable(paramContext.getResources(), paramBitmap);
      try
      {
        Bitmap localBitmap1 = Bitmap.createScaledBitmap(paramBitmap, paramBitmap.getWidth(), paramBitmap.getHeight(), false);
        Bitmap localBitmap2 = Bitmap.createBitmap(localBitmap1);
        RenderScript localRenderScript = RenderScript.create(paramContext);
        ScriptIntrinsicBlur localScriptIntrinsicBlur = ScriptIntrinsicBlur.create(localRenderScript, Element.U8_4(localRenderScript));
        Allocation localAllocation1 = Allocation.createFromBitmap(localRenderScript, localBitmap1);
        Allocation localAllocation2 = Allocation.createFromBitmap(localRenderScript, localBitmap2);
        localScriptIntrinsicBlur.setRadius(paramFloat);
        localScriptIntrinsicBlur.setInput(localAllocation1);
        localScriptIntrinsicBlur.forEach(localAllocation2);
        localAllocation2.copyTo(localBitmap2);
        return new BitmapDrawable(paramContext.getResources(), localBitmap2);
      }
      catch (RuntimeException localRuntimeException)
      {
      }
      return new BitmapDrawable(paramContext.getResources(), paramBitmap);
    }
  }

  @TargetApi(16)
  public static class zzf extends zzis.zzc
  {
    public void zzb(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
    {
      Window localWindow = paramActivity.getWindow();
      if ((localWindow != null) && (localWindow.getDecorView() != null) && (localWindow.getDecorView().getViewTreeObserver() != null))
        zza(localWindow.getDecorView().getViewTreeObserver(), paramOnGlobalLayoutListener);
    }

    public void zza(View paramView, Drawable paramDrawable)
    {
      paramView.setBackground(paramDrawable);
    }

    public void zza(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
    {
      paramViewTreeObserver.removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
    }

    public boolean zza(Context paramContext, WebSettings paramWebSettings)
    {
      super.zza(paramContext, paramWebSettings);
      paramWebSettings.setAllowFileAccessFromFileURLs(false);
      paramWebSettings.setAllowUniversalAccessFromFileURLs(false);
      return true;
    }
  }

  @TargetApi(14)
  public static class zzc extends zzis.zzb
  {
    public WebChromeClient zzk(zzjp paramzzjp)
    {
      return new zzjx(paramzzjp);
    }

    public String zza(SslError paramSslError)
    {
      return paramSslError.getUrl();
    }
  }

  @TargetApi(11)
  public static class zzb extends zzis.zza
  {
    public boolean zza(Context paramContext, WebSettings paramWebSettings)
    {
      super.zza(paramContext, paramWebSettings);
      File localFile = (File)zzjb.zzb(new Callable(paramContext)
      {
        public File zzhz()
        {
          return this.zzxh.getCacheDir();
        }
      });
      if (localFile != null)
      {
        paramWebSettings.setAppCachePath(paramContext.getCacheDir().getAbsolutePath());
        paramWebSettings.setAppCacheMaxSize(0L);
        paramWebSettings.setAppCacheEnabled(true);
      }
      paramWebSettings.setDatabasePath(paramContext.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
      paramWebSettings.setDatabaseEnabled(true);
      paramWebSettings.setDomStorageEnabled(true);
      paramWebSettings.setDisplayZoomControls(false);
      paramWebSettings.setBuiltInZoomControls(true);
      paramWebSettings.setSupportZoom(true);
      paramWebSettings.setAllowContentAccess(false);
      return true;
    }

    public boolean zzn(View paramView)
    {
      paramView.setLayerType(1, null);
      return true;
    }

    public boolean zzm(View paramView)
    {
      paramView.setLayerType(0, null);
      return true;
    }

    public boolean zza(Window paramWindow)
    {
      paramWindow.setFlags(16777216, 16777216);
      return true;
    }

    public zzjq zzb(zzjp paramzzjp, boolean paramBoolean)
    {
      return new zzjw(paramzzjp, paramBoolean);
    }

    public WebChromeClient zzk(zzjp paramzzjp)
    {
      return new zzjv(paramzzjp);
    }

    public Set<String> zzf(Uri paramUri)
    {
      return paramUri.getQueryParameterNames();
    }

    public boolean zza(DownloadManager.Request paramRequest)
    {
      paramRequest.allowScanningByMediaScanner();
      paramRequest.setNotificationVisibility(1);
      return true;
    }
  }

  @TargetApi(9)
  public static class zza extends zzis
  {
    public zza()
    {
      super();
    }

    public int zzhv()
    {
      return 6;
    }

    public int zzhw()
    {
      return 7;
    }

    public boolean zza(DownloadManager.Request paramRequest)
    {
      paramRequest.setShowRunningNotification(true);
      return true;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzis
 * JD-Core Version:    0.6.0
 */