package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
@zzhb
public class zzbf extends Thread
{
  private boolean mStarted = false;
  private boolean zzsY = false;
  private boolean zzam = false;
  private final Object zzpV;
  private final zzbe zzsZ;
  private final zzbd zzta;
  private final zzha zztb;
  private final int zztc;
  private final int zzsK;
  private final int zztd;
  private final int zzsM;
  private final int zzte;

  public zzbf(zzbe paramzzbe, zzbd paramzzbd, zzha paramzzha)
  {
    this.zzsZ = paramzzbe;
    this.zzta = paramzzbd;
    this.zztb = paramzzha;
    this.zzpV = new Object();
    this.zzsK = ((Integer)zzbt.zzwk.get()).intValue();
    this.zztd = ((Integer)zzbt.zzwl.get()).intValue();
    this.zzsM = ((Integer)zzbt.zzwm.get()).intValue();
    this.zzte = ((Integer)zzbt.zzwn.get()).intValue();
    this.zztc = ((Integer)zzbt.zzwo.get()).intValue();
    setName("ContentFetchTask");
  }

  public void zzcG()
  {
    synchronized (this.zzpV)
    {
      if (this.mStarted)
      {
        zzin.zzaI("Content hash thread already started, quiting...");
        return;
      }
      this.mStarted = true;
    }
    start();
  }

  public void run()
  {
    while (!this.zzam)
    {
      try
      {
        if (zzcH())
        {
          Activity localActivity = this.zzsZ.getActivity();
          if (localActivity == null)
          {
            zzin.zzaI("ContentFetchThread: no activity");
            continue;
          }
          zza(localActivity);
        }
        else
        {
          zzin.zzaI("ContentFetchTask: sleeping");
          zzcJ();
        }
        Thread.sleep(this.zztc * 1000);
      }
      catch (Throwable localThrowable)
      {
        zzin.zzb("Error in ContentFetchTask", localThrowable);
        this.zztb.zza(localThrowable, true);
      }
      synchronized (this.zzpV)
      {
        while (this.zzsY)
          try
          {
            zzin.zzaI("ContentFetchTask: waiting");
            this.zzpV.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
          }
      }
    }
  }

  boolean zze(View paramView)
  {
    if (paramView == null)
      return false;
    paramView.post(new Runnable(paramView)
    {
      public void run()
      {
        zzbf.this.zzf(this.zztf);
      }
    });
    return true;
  }

  void zzf(View paramView)
  {
    try
    {
      zzbc localzzbc = new zzbc(this.zzsK, this.zztd, this.zzsM, this.zzte);
      zza localzza = zza(paramView, localzzbc);
      localzzbc.zzcD();
      if ((localzza.zztm == 0) && (localzza.zztn == 0))
        return;
      if ((localzza.zztn == 0) && (localzzbc.zzcE() == 0))
        return;
      if ((localzza.zztn == 0) && (this.zzta.zza(localzzbc)))
        return;
      this.zzta.zzc(localzzbc);
    }
    catch (Exception localException)
    {
      zzin.zzb("Exception in fetchContentOnUIThread", localException);
      this.zztb.zza(localException, true);
    }
  }

  boolean zzs(Context paramContext)
  {
    PowerManager localPowerManager = (PowerManager)paramContext.getSystemService("power");
    if (localPowerManager == null)
      return false;
    return localPowerManager.isScreenOn();
  }

  boolean zzcH()
  {
    try
    {
      Context localContext = this.zzsZ.getContext();
      if (localContext == null)
        return false;
      ActivityManager localActivityManager = (ActivityManager)localContext.getSystemService("activity");
      KeyguardManager localKeyguardManager = (KeyguardManager)localContext.getSystemService("keyguard");
      if ((localActivityManager == null) || (localKeyguardManager == null))
        return false;
      List localList = localActivityManager.getRunningAppProcesses();
      if (localList == null)
        return false;
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
        if (Process.myPid() == localRunningAppProcessInfo.pid)
        {
          if ((!zza(localRunningAppProcessInfo)) || (localKeyguardManager.inKeyguardRestrictedInputMode()) || (!zzs(localContext)))
            break;
          return true;
        }
      }
      return false;
    }
    catch (Throwable localThrowable)
    {
    }
    return false;
  }

  boolean zza(ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo)
  {
    return paramRunningAppProcessInfo.importance == 100;
  }

  void zza(Activity paramActivity)
  {
    if (paramActivity == null)
      return;
    View localView = null;
    if ((paramActivity.getWindow() != null) && (paramActivity.getWindow().getDecorView() != null))
      localView = paramActivity.getWindow().getDecorView().findViewById(16908290);
    if (localView == null)
      return;
    zze(localView);
  }

  zza zza(View paramView, zzbc paramzzbc)
  {
    if (paramView == null)
      return new zza(0, 0);
    Rect localRect = new Rect();
    boolean bool = paramView.getGlobalVisibleRect(localRect);
    Object localObject;
    if (((paramView instanceof TextView)) && (!(paramView instanceof EditText)))
    {
      localObject = (TextView)paramView;
      CharSequence localCharSequence = ((TextView)localObject).getText();
      if (!TextUtils.isEmpty(localCharSequence))
      {
        String str = localCharSequence.toString();
        paramzzbc.zzd(str, bool);
        return new zza(1, 0);
      }
      return new zza(0, 0);
    }
    if (((paramView instanceof WebView)) && (!(paramView instanceof zzjp)))
    {
      paramzzbc.zzcC();
      if (zza((WebView)paramView, paramzzbc, bool))
        return new zza(0, 1);
      return new zza(0, 0);
    }
    if ((paramView instanceof ViewGroup))
    {
      localObject = (ViewGroup)paramView;
      int i = 0;
      int j = 0;
      for (int k = 0; k < ((ViewGroup)localObject).getChildCount(); k++)
      {
        zza localzza = zza(((ViewGroup)localObject).getChildAt(k), paramzzbc);
        i += localzza.zztm;
        j += localzza.zztn;
      }
      return new zza(i, j);
    }
    return (zza)new zza(0, 0);
  }

  @TargetApi(19)
  boolean zza(WebView paramWebView, zzbc paramzzbc, boolean paramBoolean)
  {
    if (!zzne.zzsk())
      return false;
    paramzzbc.zzcC();
    paramWebView.post(new Runnable(paramzzbc, paramWebView, paramBoolean)
    {
      ValueCallback<String> zzth = new ValueCallback()
      {
        public void zzt(String paramString)
        {
          zzbf.this.zza(zzbf.2.this.zzti, zzbf.2.this.zztj, paramString, zzbf.2.this.zztk);
        }
      };

      public void run()
      {
        if (this.zztj.getSettings().getJavaScriptEnabled())
          try
          {
            this.zztj.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zzth);
          }
          catch (Throwable localThrowable)
          {
            this.zzth.onReceiveValue("");
          }
      }
    });
    return true;
  }

  void zza(zzbc paramzzbc, WebView paramWebView, String paramString, boolean paramBoolean)
  {
    paramzzbc.zzcB();
    try
    {
      if (!TextUtils.isEmpty(paramString))
      {
        JSONObject localJSONObject = new JSONObject(paramString);
        String str = localJSONObject.optString("text");
        if (!TextUtils.isEmpty(paramWebView.getTitle()))
          paramzzbc.zzc(paramWebView.getTitle() + "\n" + str, paramBoolean);
        else
          paramzzbc.zzc(str, paramBoolean);
      }
      if (paramzzbc.zzcx())
        this.zzta.zzb(paramzzbc);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzaI("Json string may be malformed.");
    }
    catch (Throwable localThrowable)
    {
      zzin.zza("Failed to get webview content.", localThrowable);
      this.zztb.zza(localThrowable, true);
    }
  }

  public zzbc zzcI()
  {
    return this.zzta.zzcF();
  }

  public void wakeup()
  {
    synchronized (this.zzpV)
    {
      this.zzsY = false;
      this.zzpV.notifyAll();
      zzin.zzaI("ContentFetchThread: wakeup");
    }
  }

  public void zzcJ()
  {
    synchronized (this.zzpV)
    {
      this.zzsY = true;
      zzin.zzaI("ContentFetchThread: paused, mPause = " + this.zzsY);
    }
  }

  public boolean zzcK()
  {
    return this.zzsY;
  }

  @zzhb
  class zza
  {
    final int zztm;
    final int zztn;

    zza(int paramInt1, int arg3)
    {
      this.zztm = paramInt1;
      int i;
      this.zztn = i;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbf
 * JD-Core Version:    0.6.0
 */