package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public abstract class zzau
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  protected final Object zzpV = new Object();
  private final WeakReference<zzif> zzrW;
  private WeakReference<ViewTreeObserver> zzrX;
  private final zzbb zzrY;
  protected final zzaw zzrZ;
  private final Context zzsa;
  private final WindowManager zzsb;
  private final PowerManager zzsc;
  private final KeyguardManager zzsd;
  private zzay zzse;
  private boolean zzsf;
  private boolean zzqJ = false;
  private boolean zzsg = false;
  private boolean zzsh;
  private boolean zzsi;
  private boolean zzsj;
  BroadcastReceiver zzsk;
  private final HashSet<zzav> zzsl = new HashSet();
  private zziz zzrQ;
  private final zzdf zzsm = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      if (!zzau.this.zzb(paramMap))
        return;
      zzau.this.zza(paramzzjp.getView(), paramMap);
    }
  };
  private final zzdf zzsn = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      if (!zzau.this.zzb(paramMap))
        return;
      zzin.zzaI("Received request to untrack: " + zzau.this.zzrZ.zzcu());
      zzau.this.destroy();
    }
  };
  private final zzdf zzso = new zzdf()
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      if (!zzau.this.zzb(paramMap))
        return;
      if (!paramMap.containsKey("isVisible"))
        return;
      Boolean localBoolean = Boolean.valueOf(("1".equals(paramMap.get("isVisible"))) || ("true".equals(paramMap.get("isVisible"))));
      zzau.this.zzg(localBoolean.booleanValue());
    }
  };

  public zzau(Context paramContext, AdSizeParcel paramAdSizeParcel, zzif paramzzif, VersionInfoParcel paramVersionInfoParcel, zzbb paramzzbb)
  {
    this.zzrW = new WeakReference(paramzzif);
    this.zzrY = paramzzbb;
    this.zzrX = new WeakReference(null);
    this.zzsh = true;
    this.zzsj = false;
    this.zzrQ = new zziz(200L);
    this.zzrZ = new zzaw(UUID.randomUUID().toString(), paramVersionInfoParcel, paramAdSizeParcel.zzuh, paramzzif.zzKT, paramzzif.zzcv(), paramAdSizeParcel.zzuk);
    this.zzsb = ((WindowManager)paramContext.getSystemService("window"));
    this.zzsc = ((PowerManager)paramContext.getApplicationContext().getSystemService("power"));
    this.zzsd = ((KeyguardManager)paramContext.getSystemService("keyguard"));
    this.zzsa = paramContext;
  }

  public void zza(zzav paramzzav)
  {
    this.zzsl.add(paramzzav);
  }

  protected void zzg(boolean paramBoolean)
  {
    Iterator localIterator = this.zzsl.iterator();
    while (localIterator.hasNext())
    {
      zzav localzzav = (zzav)localIterator.next();
      localzzav.zza(this, paramBoolean);
    }
  }

  protected void zzcd()
  {
    synchronized (this.zzpV)
    {
      if (this.zzsk != null)
        return;
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.SCREEN_ON");
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      this.zzsk = new BroadcastReceiver()
      {
        public void onReceive(Context context, Intent intent)
        {
          zzau.this.zzh(false);
        }
      };
      this.zzsa.registerReceiver(this.zzsk, localIntentFilter);
    }
  }

  protected void zzce()
  {
    synchronized (this.zzpV)
    {
      if (this.zzsk != null)
      {
        try
        {
          this.zzsa.unregisterReceiver(this.zzsk);
        }
        catch (IllegalStateException localIllegalStateException)
        {
          zzin.zzb("Failed trying to unregister the receiver", localIllegalStateException);
        }
        catch (Exception localException)
        {
          zzr.zzbF().zzb(localException, true);
        }
        this.zzsk = null;
      }
    }
  }

  protected void destroy()
  {
    synchronized (this.zzpV)
    {
      zzcj();
      zzce();
      this.zzsh = false;
      zzcg();
    }
  }

  public void zzcf()
  {
    synchronized (this.zzpV)
    {
      if (this.zzsh)
      {
        this.zzsi = true;
        try
        {
          JSONObject localJSONObject = zzcn();
          zza(localJSONObject);
        }
        catch (JSONException localJSONException)
        {
          zzin.zzb("JSON failure while processing active view data.", localJSONException);
        }
        catch (RuntimeException localRuntimeException)
        {
          zzin.zzb("Failure while processing active view data.", localRuntimeException);
        }
        zzin.zzaI("Untracking ad unit: " + this.zzrZ.zzcu());
      }
    }
  }

  protected void zza(View paramView, Map<String, String> paramMap)
  {
    zzh(false);
  }

  protected void zzh(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      if ((!zzcl()) || (!this.zzsh))
        return;
      View localView = this.zzrY.zzco();
      boolean bool1 = (localView != null) && (zzr.zzbC().zza(localView, this.zzsc, this.zzsd)) && (localView.getGlobalVisibleRect(new Rect(), null));
      if ((paramBoolean) && (!this.zzrQ.tryAcquire()) && (bool1 == this.zzsj))
        return;
      this.zzsj = bool1;
      boolean bool2 = this.zzrY.zzcp();
      if (bool2)
      {
        zzcf();
        return;
      }
      try
      {
        JSONObject localJSONObject = zzd(localView);
        zza(localJSONObject);
      }
      catch (RuntimeException localRuntimeException)
      {
        zzin.zza("Active view update failed.", localRuntimeException);
      }
      zzci();
      zzcg();
    }
  }

  protected void zzcg()
  {
    if (this.zzse != null)
      this.zzse.zza(this);
  }

  public boolean zzch()
  {
    synchronized (this.zzpV)
    {
      return this.zzsh;
    }
  }

  protected int zza(int paramInt, DisplayMetrics paramDisplayMetrics)
  {
    float f = paramDisplayMetrics.density;
    return (int)(paramInt / f);
  }

  protected void zzci()
  {
    zzbb localzzbb = this.zzrY.zzcq();
    View localView = localzzbb.zzco();
    if (localView == null)
      return;
    ViewTreeObserver localViewTreeObserver1 = (ViewTreeObserver)this.zzrX.get();
    ViewTreeObserver localViewTreeObserver2 = localView.getViewTreeObserver();
    if (localViewTreeObserver2 == localViewTreeObserver1)
      return;
    zzcj();
    if ((!this.zzsf) || ((localViewTreeObserver1 != null) && (localViewTreeObserver1.isAlive())))
    {
      this.zzsf = true;
      localViewTreeObserver2.addOnScrollChangedListener(this);
      localViewTreeObserver2.addOnGlobalLayoutListener(this);
    }
    this.zzrX = new WeakReference(localViewTreeObserver2);
  }

  protected boolean zzb(Map<String, String> paramMap)
  {
    if (paramMap == null)
      return false;
    String str = (String)paramMap.get("hashCode");
    return (!TextUtils.isEmpty(str)) && (str.equals(this.zzrZ.zzcu()));
  }

  protected void zzb(zzeh paramzzeh)
  {
    paramzzeh.zza("/updateActiveView", this.zzsm);
    paramzzeh.zza("/untrackActiveViewUnit", this.zzsn);
    paramzzeh.zza("/visibilityChanged", this.zzso);
  }

  protected void zzc(zzeh paramzzeh)
  {
    paramzzeh.zzb("/visibilityChanged", this.zzso);
    paramzzeh.zzb("/untrackActiveViewUnit", this.zzsn);
    paramzzeh.zzb("/updateActiveView", this.zzsm);
  }

  protected void zzcj()
  {
    ViewTreeObserver localViewTreeObserver = (ViewTreeObserver)this.zzrX.get();
    if ((localViewTreeObserver == null) || (!localViewTreeObserver.isAlive()))
      return;
    localViewTreeObserver.removeOnScrollChangedListener(this);
    localViewTreeObserver.removeGlobalOnLayoutListener(this);
  }

  protected JSONObject zzck()
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("afmaVersion", this.zzrZ.zzcs()).put("activeViewJSON", this.zzrZ.zzct()).put("timestamp", zzr.zzbG().elapsedRealtime()).put("adFormat", this.zzrZ.zzcr()).put("hashCode", this.zzrZ.zzcu()).put("isMraid", this.zzrZ.zzcv()).put("isStopped", this.zzsg).put("isPaused", this.zzqJ).put("isScreenOn", isScreenOn()).put("isNative", this.zzrZ.zzcw());
    return localJSONObject;
  }

  protected void zza(JSONObject paramJSONObject)
  {
    try
    {
      JSONArray localJSONArray = new JSONArray();
      JSONObject localJSONObject = new JSONObject();
      localJSONArray.put(paramJSONObject);
      localJSONObject.put("units", localJSONArray);
      zzb(localJSONObject);
    }
    catch (Throwable localThrowable)
    {
      zzin.zzb("Skipping active view message.", localThrowable);
    }
  }

  protected abstract void zzb(JSONObject paramJSONObject);

  protected abstract boolean zzcl();

  protected JSONObject zzcm()
    throws JSONException
  {
    return zzck().put("isAttachedToWindow", false).put("isScreenOn", isScreenOn()).put("isVisible", false);
  }

  protected JSONObject zzd(View paramView)
    throws JSONException
  {
    if (paramView == null)
      return zzcm();
    boolean bool1 = zzr.zzbE().isAttachedToWindow(paramView);
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    try
    {
      paramView.getLocationOnScreen(arrayOfInt1);
      paramView.getLocationInWindow(arrayOfInt2);
    }
    catch (Exception localException)
    {
      zzin.zzb("Failure getting view location.", localException);
    }
    DisplayMetrics localDisplayMetrics = paramView.getContext().getResources().getDisplayMetrics();
    Rect localRect1 = new Rect();
    localRect1.left = arrayOfInt1[0];
    localRect1.top = arrayOfInt1[1];
    localRect1.right = (localRect1.left + paramView.getWidth());
    localRect1.bottom = (localRect1.top + paramView.getHeight());
    Rect localRect2 = new Rect();
    localRect2.right = this.zzsb.getDefaultDisplay().getWidth();
    localRect2.bottom = this.zzsb.getDefaultDisplay().getHeight();
    Rect localRect3 = new Rect();
    boolean bool2 = paramView.getGlobalVisibleRect(localRect3, null);
    Rect localRect4 = new Rect();
    boolean bool3 = paramView.getLocalVisibleRect(localRect4);
    Rect localRect5 = new Rect();
    paramView.getHitRect(localRect5);
    JSONObject localJSONObject = zzck();
    localJSONObject.put("windowVisibility", paramView.getWindowVisibility()).put("isAttachedToWindow", bool1).put("viewBox", new JSONObject().put("top", zza(localRect2.top, localDisplayMetrics)).put("bottom", zza(localRect2.bottom, localDisplayMetrics)).put("left", zza(localRect2.left, localDisplayMetrics)).put("right", zza(localRect2.right, localDisplayMetrics))).put("adBox", new JSONObject().put("top", zza(localRect1.top, localDisplayMetrics)).put("bottom", zza(localRect1.bottom, localDisplayMetrics)).put("left", zza(localRect1.left, localDisplayMetrics)).put("right", zza(localRect1.right, localDisplayMetrics))).put("globalVisibleBox", new JSONObject().put("top", zza(localRect3.top, localDisplayMetrics)).put("bottom", zza(localRect3.bottom, localDisplayMetrics)).put("left", zza(localRect3.left, localDisplayMetrics)).put("right", zza(localRect3.right, localDisplayMetrics))).put("globalVisibleBoxVisible", bool2).put("localVisibleBox", new JSONObject().put("top", zza(localRect4.top, localDisplayMetrics)).put("bottom", zza(localRect4.bottom, localDisplayMetrics)).put("left", zza(localRect4.left, localDisplayMetrics)).put("right", zza(localRect4.right, localDisplayMetrics))).put("localVisibleBoxVisible", bool3).put("hitBox", new JSONObject().put("top", zza(localRect5.top, localDisplayMetrics)).put("bottom", zza(localRect5.bottom, localDisplayMetrics)).put("left", zza(localRect5.left, localDisplayMetrics)).put("right", zza(localRect5.right, localDisplayMetrics))).put("screenDensity", localDisplayMetrics.density).put("isVisible", zzr.zzbC().zza(paramView, this.zzsc, this.zzsd));
    return localJSONObject;
  }

  boolean isScreenOn()
  {
    return this.zzsc.isScreenOn();
  }

  protected JSONObject zzcn()
    throws JSONException
  {
    JSONObject localJSONObject = zzck();
    localJSONObject.put("doneReasonCode", "u");
    return localJSONObject;
  }

  public void onScrollChanged()
  {
    zzh(true);
  }

  public void onGlobalLayout()
  {
    zzh(false);
  }

  public void zza(zzay paramzzay)
  {
    synchronized (this.zzpV)
    {
      this.zzse = paramzzay;
    }
  }

  public void stop()
  {
    synchronized (this.zzpV)
    {
      this.zzsg = true;
      zzh(false);
    }
  }

  public void pause()
  {
    synchronized (this.zzpV)
    {
      this.zzqJ = true;
      zzh(false);
    }
  }

  public void resume()
  {
    synchronized (this.zzpV)
    {
      this.zzqJ = false;
      zzh(false);
    }
  }

  public static class zzb
    implements zzbb
  {
    private zzh zzsr;

    public zzb(zzh paramzzh)
    {
      this.zzsr = paramzzh;
    }

    public View zzco()
    {
      return this.zzsr.zzdS();
    }

    public boolean zzcp()
    {
      return this.zzsr == null;
    }

    public zzbb zzcq()
    {
      return this;
    }
  }

  public static class zza
    implements zzbb
  {
    private WeakReference<zzh> zzsq;

    public zza(zzh paramzzh)
    {
      this.zzsq = new WeakReference(paramzzh);
    }

    public View zzco()
    {
      zzh localzzh = (zzh)this.zzsq.get();
      return localzzh != null ? localzzh.zzdS() : null;
    }

    public boolean zzcp()
    {
      return this.zzsq.get() == null;
    }

    public zzbb zzcq()
    {
      return new zzau.zzb((zzh)this.zzsq.get());
    }
  }

  public static class zzc
    implements zzbb
  {
    private final View mView;
    private final zzif zzss;

    public zzc(View paramView, zzif paramzzif)
    {
      this.mView = paramView;
      this.zzss = paramzzif;
    }

    public View zzco()
    {
      return this.mView;
    }

    public boolean zzcp()
    {
      return (this.zzss == null) || (this.mView == null);
    }

    public zzbb zzcq()
    {
      return this;
    }
  }

  public static class zzd
    implements zzbb
  {
    private final WeakReference<View> zzst;
    private final WeakReference<zzif> zzsu;

    public zzd(View paramView, zzif paramzzif)
    {
      this.zzst = new WeakReference(paramView);
      this.zzsu = new WeakReference(paramzzif);
    }

    public View zzco()
    {
      return (View)this.zzst.get();
    }

    public boolean zzcp()
    {
      return (this.zzst.get() == null) || (this.zzsu.get() == null);
    }

    public zzbb zzcq()
    {
      return new zzau.zzc((View)this.zzst.get(), (zzif)this.zzsu.get());
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzau
 * JD-Core Version:    0.6.0
 */