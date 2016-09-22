package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzjp;
import java.util.HashMap;

@zzhb
public class zzk extends FrameLayout
  implements zzh
{
  private final zzjp zzpD;
  private final FrameLayout zzEN;
  private final zzu zzEO;

  @Nullable
  private zzi zzEP;
  private boolean zzEQ;
  private boolean zzER;
  private TextView zzES;
  private long zzET;
  private long zzEU;
  private String zzEV;
  private String zzzK;

  public static void zzg(zzjp paramzzjp)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "no_video_view");
    paramzzjp.zza("onVideoEvent", localHashMap);
  }

  public zzk(Context paramContext, zzjp paramzzjp, int paramInt, zzcb paramzzcb, zzbz paramzzbz)
  {
    super(paramContext);
    this.zzpD = paramzzjp;
    this.zzEN = new FrameLayout(paramContext);
    addView(this.zzEN, new FrameLayout.LayoutParams(-1, -1));
    zzb.zzv(paramzzjp.zzhR());
    this.zzEP = paramzzjp.zzhR().zzpx.zza(paramContext, paramzzjp, paramInt, paramzzcb, paramzzbz);
    if (this.zzEP != null)
      this.zzEN.addView(this.zzEP, new FrameLayout.LayoutParams(-1, -1, 17));
    this.zzES = new TextView(paramContext);
    this.zzES.setBackgroundColor(-16777216);
    zzfG();
    this.zzEO = new zzu(this);
    this.zzEO.zzfQ();
    if (this.zzEP != null)
      this.zzEP.zza(this);
    if (this.zzEP == null)
      zzg("AdVideoUnderlay Error", "Allocating player failed.");
  }

  public void zzd(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0))
      return;
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramInt3 + 2, paramInt4 + 2);
    localLayoutParams.setMargins(paramInt1 - 1, paramInt2 - 1, 0, 0);
    this.zzEN.setLayoutParams(localLayoutParams);
    requestLayout();
  }

  public void setMimeType(String mimeType)
  {
    this.zzEV = mimeType;
  }

  public void zzap(String paramString)
  {
    this.zzzK = paramString;
  }

  public void zzfD()
  {
    if (this.zzEP == null)
      return;
    if (!TextUtils.isEmpty(this.zzzK))
    {
      this.zzEP.setMimeType(this.zzEV);
      this.zzEP.setVideoPath(this.zzzK);
    }
    else
    {
      zza("no_src", new String[0]);
    }
  }

  public void pause()
  {
    if (this.zzEP == null)
      return;
    this.zzEP.pause();
  }

  public void play()
  {
    if (this.zzEP == null)
      return;
    this.zzEP.play();
  }

  public void seekTo(int millis)
  {
    if (this.zzEP == null)
      return;
    this.zzEP.seekTo(millis);
  }

  public void zzff()
  {
    if (this.zzEP == null)
      return;
    this.zzEP.zzff();
  }

  public void zzfg()
  {
    if (this.zzEP == null)
      return;
    this.zzEP.zzfg();
  }

  public void zza(float paramFloat)
  {
    if (this.zzEP == null)
      return;
    this.zzEP.zza(paramFloat);
  }

  public void zzd(MotionEvent paramMotionEvent)
  {
    if (this.zzEP == null)
      return;
    this.zzEP.dispatchTouchEvent(paramMotionEvent);
  }

  public void zzfE()
  {
    if (this.zzEP == null)
      return;
    Context localContext = this.zzEP.getContext();
    TextView localTextView = new TextView(localContext);
    localTextView.setText("AdMob - " + this.zzEP.zzeZ());
    localTextView.setTextColor(-65536);
    localTextView.setBackgroundColor(-256);
    this.zzEN.addView(localTextView, new FrameLayout.LayoutParams(-2, -2, 17));
    this.zzEN.bringChildToFront(localTextView);
  }

  public void zzfy()
  {
  }

  public void zzfz()
  {
    if (this.zzEP == null)
      return;
    if (this.zzEU == 0L)
    {
      float f = this.zzEP.getDuration() / 1000.0F;
      int i = this.zzEP.getVideoWidth();
      int j = this.zzEP.getVideoHeight();
      zza("canplaythrough", new String[] { "duration", String.valueOf(f), "videoWidth", String.valueOf(i), "videoHeight", String.valueOf(j) });
    }
  }

  public void zzfA()
  {
    zzfJ();
  }

  public void onPaused()
  {
    zza("pause", new String[0]);
    zzfK();
  }

  public void zzfB()
  {
    zza("ended", new String[0]);
    zzfK();
  }

  public void zzg(String paramString1, String paramString2)
  {
    zza("error", new String[] { "what", paramString1, "extra", paramString2 });
  }

  public void zzfC()
  {
    zzfG();
    this.zzEU = this.zzET;
  }

  public void destroy()
  {
    this.zzEO.cancel();
    if (this.zzEP != null)
      this.zzEP.stop();
    zzfK();
  }

  void zzfF()
  {
    if (this.zzEP == null)
      return;
    long l = this.zzEP.getCurrentPosition();
    if ((this.zzET != l) && (l > 0L))
    {
      zzfH();
      float f = (float)l / 1000.0F;
      zza("timeupdate", new String[] { "time", String.valueOf(f) });
      this.zzET = l;
    }
  }

  private void zzfG()
  {
    if (!zzfI())
    {
      this.zzEN.addView(this.zzES, new FrameLayout.LayoutParams(-1, -1));
      this.zzEN.bringChildToFront(this.zzES);
    }
  }

  private void zzfH()
  {
    if (zzfI())
      this.zzEN.removeView(this.zzES);
  }

  private boolean zzfI()
  {
    return this.zzES.getParent() != null;
  }

  private void zza(String paramString, String[] paramArrayOfString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", paramString);
    Object localObject = null;
    for (String str : paramArrayOfString)
      if (localObject == null)
      {
        localObject = str;
      }
      else
      {
        localHashMap.put(localObject, str);
        localObject = null;
      }
    this.zzpD.zza("onVideoEvent", localHashMap);
  }

  private void zzfJ()
  {
    if (this.zzpD.zzhP() == null)
      return;
    if (this.zzEQ)
      return;
    WindowManager.LayoutParams localLayoutParams = this.zzpD.zzhP().getWindow().getAttributes();
    this.zzER = ((localLayoutParams.flags & 0x80) != 0);
    if (!this.zzER)
    {
      this.zzpD.zzhP().getWindow().addFlags(128);
      this.zzEQ = true;
    }
  }

  private void zzfK()
  {
    if (this.zzpD.zzhP() == null)
      return;
    if ((this.zzEQ) && (!this.zzER))
    {
      this.zzpD.zzhP().getWindow().clearFlags(128);
      this.zzEQ = false;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzk
 * JD-Core Version:    0.6.0
 */