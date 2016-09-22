package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzfv.zza;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zziu;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjq.zza;
import com.google.android.gms.internal.zzjr;
import java.util.Collections;
import java.util.Map;

@zzhb
public class zzd extends zzfv.zza
  implements zzs
{
  static final int zzEg = Color.argb(0, 0, 0, 0);
  private final Activity mActivity;
  AdOverlayInfoParcel zzEh;
  zzjp zzpD;
  zzc zzEi;
  zzo zzEj;
  boolean zzEk = false;
  FrameLayout zzEl;
  WebChromeClient.CustomViewCallback zzEm;
  boolean zzEn = false;
  boolean zzEo = false;
  RelativeLayout zzDm;
  boolean zzEp = false;
  int zzEq = 0;
  zzl zzEr;
  private boolean zzEs;
  private boolean zzEt = false;
  private boolean zzEu = true;

  public zzd(Activity paramActivity)
  {
    this.mActivity = paramActivity;
    this.zzEr = new zzq();
  }

  public void close()
  {
    this.zzEq = 2;
    this.mActivity.finish();
  }

  public void zzfl()
  {
    if ((this.zzEh != null) && (this.zzEk))
      setRequestedOrientation(this.zzEh.orientation);
    if (this.zzEl != null)
    {
      this.mActivity.setContentView(this.zzDm);
      zzaD();
      this.zzEl.removeAllViews();
      this.zzEl = null;
    }
    if (this.zzEm != null)
    {
      this.zzEm.onCustomViewHidden();
      this.zzEm = null;
    }
    this.zzEk = false;
  }

  public void zzfm()
  {
    this.zzEq = 1;
    this.mActivity.finish();
  }

  public void onBackPressed()
  {
    this.zzEq = 0;
  }

  public boolean zzfn()
  {
    this.zzEq = 0;
    if (this.zzpD == null)
      return true;
    int i = (this.zzpD.zzfL()) && (this.zzEr.zzfL()) ? 1 : 0;
    if (i == 0)
      this.zzpD.zza("onbackblocked", Collections.emptyMap());
    return i;
  }

  public void onCreate(Bundle savedInstanceState)
  {
    this.zzEn = (savedInstanceState != null ? savedInstanceState.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false);
    try
    {
      this.zzEh = AdOverlayInfoParcel.zzb(this.mActivity.getIntent());
      if (this.zzEh == null)
        throw new zza("Could not get info for ad overlay.");
      if (this.zzEh.zzrl.zzNa > 7500000)
        this.zzEq = 3;
      if (this.mActivity.getIntent() != null)
        this.zzEu = this.mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
      if (this.zzEh.zzEM != null)
        this.zzEo = this.zzEh.zzEM.zzql;
      else
        this.zzEo = false;
      if ((((Boolean)zzbt.zzxe.get()).booleanValue()) && (this.zzEo) && (this.zzEh.zzEM.zzqn != null))
        new zzd(null).zzhn();
      if (savedInstanceState == null)
      {
        if ((this.zzEh.zzEC != null) && (this.zzEu))
          this.zzEh.zzEC.zzaX();
        if ((this.zzEh.zzEJ != 1) && (this.zzEh.zzEB != null))
          this.zzEh.zzEB.onAdClicked();
      }
      this.zzDm = new zzb(this.mActivity, this.zzEh.zzEL);
      this.zzDm.setId(1000);
      switch (this.zzEh.zzEJ)
      {
      case 1:
        zzx(false);
        break;
      case 2:
        this.zzEi = new zzc(this.zzEh.zzED);
        zzx(false);
        break;
      case 3:
        zzx(true);
        break;
      case 4:
        if (this.zzEn)
        {
          this.zzEq = 3;
          this.mActivity.finish();
        }
        else
        {
          if (zzr.zzbz().zza(this.mActivity, this.zzEh.zzEA, this.zzEh.zzEI))
            break;
          this.zzEq = 3;
          this.mActivity.finish();
        }
        break;
      default:
        throw new zza("Could not determine ad overlay type.");
      }
    }
    catch (zza localzza)
    {
      zzin.zzaK(localzza.getMessage());
      this.zzEq = 3;
      this.mActivity.finish();
    }
  }

  public void onRestart()
  {
  }

  public void onStart()
  {
  }

  public void onResume()
  {
    if ((this.zzEh != null) && (this.zzEh.zzEJ == 4))
      if (this.zzEn)
      {
        this.zzEq = 3;
        this.mActivity.finish();
      }
      else
      {
        this.zzEn = true;
      }
    if (this.zzEh.zzEC != null)
      this.zzEh.zzEC.onResume();
    if ((this.zzpD != null) && (!this.zzpD.isDestroyed()))
      zzr.zzbE().zzj(this.zzpD);
    else
      zzin.zzaK("The webview does not exit. Ignoring action.");
    this.zzEr.resume();
  }

  public void onPause()
  {
    this.zzEr.pause();
    zzfl();
    if (this.zzEh.zzEC != null)
      this.zzEh.zzEC.onPause();
    if ((this.zzpD != null) && ((!this.mActivity.isFinishing()) || (this.zzEi == null)))
      zzr.zzbE().zzi(this.zzpD);
    zzfp();
  }

  public void onSaveInstanceState(Bundle outBundle)
  {
    outBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzEn);
  }

  public void onStop()
  {
    zzfp();
  }

  public void onDestroy()
  {
    if (this.zzpD != null)
      this.zzDm.removeView(this.zzpD.getView());
    zzfp();
  }

  public void zzw(boolean paramBoolean)
  {
    int i = paramBoolean ? 50 : 32;
    this.zzEj = new zzo(this.mActivity, i, this);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams.addRule(10);
    int j = paramBoolean ? 11 : 9;
    localLayoutParams.addRule(j);
    this.zzEj.zza(paramBoolean, this.zzEh.zzEG);
    this.zzDm.addView(this.zzEj, localLayoutParams);
  }

  public void zzaD()
  {
    this.zzEs = true;
  }

  public void zza(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.zzEj != null)
      this.zzEj.zza(paramBoolean1, paramBoolean2);
  }

  public void zzfo()
  {
    this.zzDm.removeView(this.zzEj);
    zzw(true);
  }

  public void setRequestedOrientation(int requestedOrientation)
  {
    this.mActivity.setRequestedOrientation(requestedOrientation);
  }

  public void zza(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.zzEl = new FrameLayout(this.mActivity);
    this.zzEl.setBackgroundColor(-16777216);
    this.zzEl.addView(paramView, -1, -1);
    this.mActivity.setContentView(this.zzEl);
    zzaD();
    this.zzEm = paramCustomViewCallback;
    this.zzEk = true;
  }

  protected void zzx(boolean paramBoolean)
    throws zzd.zza
  {
    if (!this.zzEs)
      this.mActivity.requestWindowFeature(1);
    Window localWindow = this.mActivity.getWindow();
    if (localWindow == null)
      throw new zza("Invalid activity, no window available.");
    if ((!this.zzEo) || ((this.zzEh.zzEM != null) && (this.zzEh.zzEM.zzqm)))
      localWindow.setFlags(1024, 1024);
    boolean bool = this.zzEh.zzED.zzhU().zzcv();
    this.zzEp = false;
    if (bool)
      if (this.zzEh.orientation == zzr.zzbE().zzhv())
        this.zzEp = (this.mActivity.getResources().getConfiguration().orientation == 1);
      else if (this.zzEh.orientation == zzr.zzbE().zzhw())
        this.zzEp = (this.mActivity.getResources().getConfiguration().orientation == 2);
    zzin.zzaI("Delay onShow to next orientation change: " + this.zzEp);
    setRequestedOrientation(this.zzEh.orientation);
    if (zzr.zzbE().zza(localWindow))
      zzin.zzaI("Hardware acceleration on the AdActivity window enabled.");
    if (!this.zzEo)
      this.zzDm.setBackgroundColor(-16777216);
    else
      this.zzDm.setBackgroundColor(zzEg);
    this.mActivity.setContentView(this.zzDm);
    zzaD();
    if (paramBoolean)
    {
      this.zzpD = zzr.zzbD().zza(this.mActivity, this.zzEh.zzED.zzaN(), true, bool, null, this.zzEh.zzrl, null, this.zzEh.zzED.zzhR());
      this.zzpD.zzhU().zzb(null, null, this.zzEh.zzEE, this.zzEh.zzEI, true, this.zzEh.zzEK, null, this.zzEh.zzED.zzhU().zzig(), null);
      this.zzpD.zzhU().zza(new zzjq.zza()
      {
        public void zza(zzjp paramzzjp, boolean paramBoolean)
        {
          paramzzjp.zzfr();
        }
      });
      if (this.zzEh.url != null)
        this.zzpD.loadUrl(this.zzEh.url);
      else if (this.zzEh.zzEH != null)
        this.zzpD.loadDataWithBaseURL(this.zzEh.zzEF, this.zzEh.zzEH, "text/html", "UTF-8", null);
      else
        throw new zza("No URL or HTML to display in ad overlay.");
      if (this.zzEh.zzED != null)
        this.zzEh.zzED.zzc(this);
    }
    else
    {
      this.zzpD = this.zzEh.zzED;
      this.zzpD.setContext(this.mActivity);
    }
    this.zzpD.zzb(this);
    ViewParent localViewParent = this.zzpD.getParent();
    if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
      ((ViewGroup)localViewParent).removeView(this.zzpD.getView());
    if (this.zzEo)
      this.zzpD.setBackgroundColor(zzEg);
    this.zzDm.addView(this.zzpD.getView(), -1, -1);
    if ((!paramBoolean) && (!this.zzEp))
      zzfr();
    zzw(bool);
    if (this.zzpD.zzhV())
      zza(bool, true);
    com.google.android.gms.ads.internal.zzd localzzd = this.zzpD.zzhR();
    Object localObject = localzzd != null ? localzzd.zzpy : null;
    if (localObject != null)
      this.zzEr = localObject.zza(this.mActivity, this.zzpD, this.zzDm);
    else
      zzin.zzaK("Appstreaming controller is null.");
  }

  protected void zzfp()
  {
    if ((!this.mActivity.isFinishing()) || (this.zzEt))
      return;
    this.zzEt = true;
    if (this.zzpD != null)
    {
      zzy(this.zzEq);
      this.zzDm.removeView(this.zzpD.getView());
      if (this.zzEi != null)
      {
        this.zzpD.setContext(this.zzEi.context);
        this.zzpD.zzD(false);
        this.zzEi.zzEx.addView(this.zzpD.getView(), this.zzEi.index, this.zzEi.zzEw);
        this.zzEi = null;
      }
      else if (this.mActivity.getApplicationContext() != null)
      {
        this.zzpD.setContext(this.mActivity.getApplicationContext());
      }
      this.zzpD = null;
    }
    if ((this.zzEh != null) && (this.zzEh.zzEC != null))
      this.zzEh.zzEC.zzaW();
    this.zzEr.destroy();
  }

  public void zzfq()
  {
    if (this.zzEp)
    {
      this.zzEp = false;
      zzfr();
    }
  }

  protected void zzfr()
  {
    this.zzpD.zzfr();
  }

  protected void zzy(int paramInt)
  {
    this.zzpD.zzy(paramInt);
  }

  public void zzg(zzjp paramzzjp, Map<String, String> paramMap)
  {
    this.zzEr.zzg(paramzzjp, paramMap);
  }

  @zzhb
  private class zzd extends zzim
  {
    private zzd()
    {
    }

    public void zzbr()
    {
      Bitmap localBitmap = zzr.zzbC().zzf(zzd.zza(zzd.this), zzd.this.zzEh.zzEM.zzqn);
      if (localBitmap != null)
      {
        Drawable localDrawable = zzr.zzbE().zza(zzd.zza(zzd.this), localBitmap, zzd.this.zzEh.zzEM.zzqo, zzd.this.zzEh.zzEM.zzqp);
        zzir.zzMc.post(new Runnable(localDrawable)
        {
          public void run()
          {
            zzd.zza(zzd.this).getWindow().setBackgroundDrawable(this.zzEy);
          }
        });
      }
    }

    public void onStop()
    {
    }
  }

  @zzhb
  static final class zzb extends RelativeLayout
  {
    zziu zzrU;

    public zzb(Context paramContext, String paramString)
    {
      super();
      this.zzrU = new zziu(paramContext, paramString);
    }

    public boolean onInterceptTouchEvent(MotionEvent event)
    {
      this.zzrU.zze(event);
      return false;
    }
  }

  @zzhb
  public static class zzc
  {
    public final int index;
    public final ViewGroup.LayoutParams zzEw;
    public final ViewGroup zzEx;
    public final Context context;

    public zzc(zzjp paramzzjp)
      throws zzd.zza
    {
      this.zzEw = paramzzjp.getLayoutParams();
      ViewParent localViewParent = paramzzjp.getParent();
      this.context = paramzzjp.zzhQ();
      if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
      {
        this.zzEx = ((ViewGroup)localViewParent);
        this.index = this.zzEx.indexOfChild(paramzzjp.getView());
        this.zzEx.removeView(paramzzjp.getView());
        paramzzjp.zzD(true);
      }
      else
      {
        throw new zzd.zza("Could not get the parent of the WebView for an overlay.");
      }
    }
  }

  @zzhb
  private static final class zza extends Exception
  {
    public zza(String paramString)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzd
 * JD-Core Version:    0.6.0
 */