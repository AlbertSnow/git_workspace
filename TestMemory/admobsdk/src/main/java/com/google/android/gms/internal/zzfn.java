package com.google.android.gms.internal;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import java.util.Map;
import java.util.Set;

@zzhb
public class zzfn extends zzfs
{
  static final Set<String> zzDa = zzmr.zzc(new String[] { "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center" });
  private String zzDb = "top-right";
  private boolean zzDc = true;
  private int zzDd = 0;
  private int zzDe = 0;
  private int zzoH = -1;
  private int zzDf = 0;
  private int zzDg = 0;
  private int zzoG = -1;
  private final Object zzpV = new Object();
  private final zzjp zzpD;
  private final Activity zzDh;
  private AdSizeParcel zzCh;
  private ImageView zzDi;
  private LinearLayout zzDj;
  private zzft zzDk;
  private PopupWindow zzDl;
  private RelativeLayout zzDm;
  private ViewGroup zzDn;

  public zzfn(zzjp paramzzjp, zzft paramzzft)
  {
    super(paramzzjp, "resize");
    this.zzpD = paramzzjp;
    this.zzDh = paramzzjp.zzhP();
    this.zzDk = paramzzft;
  }

  private void zzh(Map<String, String> paramMap)
  {
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("width")))
      this.zzoG = zzr.zzbC().zzaD((String)paramMap.get("width"));
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("height")))
      this.zzoH = zzr.zzbC().zzaD((String)paramMap.get("height"));
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("offsetX")))
      this.zzDf = zzr.zzbC().zzaD((String)paramMap.get("offsetX"));
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("offsetY")))
      this.zzDg = zzr.zzbC().zzaD((String)paramMap.get("offsetY"));
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("allowOffscreen")))
      this.zzDc = Boolean.parseBoolean((String)paramMap.get("allowOffscreen"));
    String str = (String)paramMap.get("customClosePosition");
    if (!TextUtils.isEmpty(str))
      this.zzDb = str;
  }

  boolean zzeL()
  {
    return (this.zzoG > -1) && (this.zzoH > -1);
  }

  public void zzi(Map<String, String> paramMap)
  {
    synchronized (this.zzpV)
    {
      if (this.zzDh == null)
      {
        zzam("Not an activity context. Cannot resize.");
        return;
      }
      if (this.zzpD.zzaN() == null)
      {
        zzam("Webview is not yet available, size is not set.");
        return;
      }
      if (this.zzpD.zzaN().zzui)
      {
        zzam("Is interstitial. Cannot resize an interstitial.");
        return;
      }
      if (this.zzpD.zzhY())
      {
        zzam("Cannot resize an expanded banner.");
        return;
      }
      zzh(paramMap);
      if (!zzeL())
      {
        zzam("Invalid width and height options. Cannot resize.");
        return;
      }
      Window localWindow = this.zzDh.getWindow();
      if ((localWindow == null) || (localWindow.getDecorView() == null))
      {
        zzam("Activity context is not ready, cannot get window or decor view.");
        return;
      }
      int[] arrayOfInt = zzeM();
      if (arrayOfInt == null)
      {
        zzam("Resize location out of screen or close button is not visible.");
        return;
      }
      int i = zzn.zzcS().zzb(this.zzDh, this.zzoG);
      int j = zzn.zzcS().zzb(this.zzDh, this.zzoH);
      ViewParent localViewParent = this.zzpD.getView().getParent();
      if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
      {
        ((ViewGroup)localViewParent).removeView(this.zzpD.getView());
        if (this.zzDl == null)
        {
          this.zzDn = ((ViewGroup)localViewParent);
          localObject1 = zzr.zzbC().zzk(this.zzpD.getView());
          this.zzDi = new ImageView(this.zzDh);
          this.zzDi.setImageBitmap((Bitmap)localObject1);
          this.zzCh = this.zzpD.zzaN();
          this.zzDn.addView(this.zzDi);
        }
        else
        {
          this.zzDl.dismiss();
        }
      }
      else
      {
        zzam("Webview is detached, probably in the middle of a resize or expand.");
        return;
      }
      this.zzDm = new RelativeLayout(this.zzDh);
      this.zzDm.setBackgroundColor(0);
      this.zzDm.setLayoutParams(new ViewGroup.LayoutParams(i, j));
      this.zzDl = zzr.zzbC().zza(this.zzDm, i, j, false);
      this.zzDl.setOutsideTouchable(true);
      this.zzDl.setTouchable(true);
      this.zzDl.setClippingEnabled(!this.zzDc);
      this.zzDm.addView(this.zzpD.getView(), -1, -1);
      this.zzDj = new LinearLayout(this.zzDh);
      Object localObject1 = new RelativeLayout.LayoutParams(zzn.zzcS().zzb(this.zzDh, 50), zzn.zzcS().zzb(this.zzDh, 50));
      switch (this.zzDb)
      {
      case "top-left":
        ((RelativeLayout.LayoutParams)localObject1).addRule(10);
        ((RelativeLayout.LayoutParams)localObject1).addRule(9);
        break;
      case "top-center":
        ((RelativeLayout.LayoutParams)localObject1).addRule(10);
        ((RelativeLayout.LayoutParams)localObject1).addRule(14);
        break;
      case "center":
        ((RelativeLayout.LayoutParams)localObject1).addRule(13);
        break;
      case "bottom-left":
        ((RelativeLayout.LayoutParams)localObject1).addRule(12);
        ((RelativeLayout.LayoutParams)localObject1).addRule(9);
        break;
      case "bottom-center":
        ((RelativeLayout.LayoutParams)localObject1).addRule(12);
        ((RelativeLayout.LayoutParams)localObject1).addRule(14);
        break;
      case "bottom-right":
        ((RelativeLayout.LayoutParams)localObject1).addRule(12);
        ((RelativeLayout.LayoutParams)localObject1).addRule(11);
        break;
      default:
        ((RelativeLayout.LayoutParams)localObject1).addRule(10);
        ((RelativeLayout.LayoutParams)localObject1).addRule(11);
      }
      this.zzDj.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View view)
        {
          zzfn.this.zzp(true);
        }
      });
      this.zzDj.setContentDescription("Close button");
      this.zzDm.addView(this.zzDj, (ViewGroup.LayoutParams)localObject1);
      try
      {
        this.zzDl.showAtLocation(localWindow.getDecorView(), 0, zzn.zzcS().zzb(this.zzDh, arrayOfInt[0]), zzn.zzcS().zzb(this.zzDh, arrayOfInt[1]));
      }
      catch (RuntimeException localRuntimeException)
      {
        zzam("Cannot show popup window: " + localRuntimeException.getMessage());
        this.zzDm.removeView(this.zzpD.getView());
        if (this.zzDn != null)
        {
          this.zzDn.removeView(this.zzDi);
          this.zzDn.addView(this.zzpD.getView());
          this.zzpD.zza(this.zzCh);
        }
        return;
      }
      zzc(arrayOfInt[0], arrayOfInt[1]);
      this.zzpD.zza(new AdSizeParcel(this.zzDh, new AdSize(this.zzoG, this.zzoH)));
      zzd(arrayOfInt[0], arrayOfInt[1]);
      zzao("resized");
    }
  }

  public void zzp(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      if (this.zzDl != null)
      {
        this.zzDl.dismiss();
        this.zzDm.removeView(this.zzpD.getView());
        if (this.zzDn != null)
        {
          this.zzDn.removeView(this.zzDi);
          this.zzDn.addView(this.zzpD.getView());
          this.zzpD.zza(this.zzCh);
        }
        if (paramBoolean)
        {
          zzao("default");
          if (this.zzDk != null)
            this.zzDk.zzbf();
        }
        this.zzDl = null;
        this.zzDm = null;
        this.zzDn = null;
        this.zzDj = null;
      }
    }
  }

  private int[] zzeM()
  {
    if (!zzeO())
      return null;
    if (this.zzDc)
      return new int[] { this.zzDd + this.zzDf, this.zzDe + this.zzDg };
    int[] arrayOfInt1 = zzr.zzbC().zzf(this.zzDh);
    int[] arrayOfInt2 = zzr.zzbC().zzh(this.zzDh);
    int i = arrayOfInt1[0];
    int j = this.zzDd + this.zzDf;
    int k = this.zzDe + this.zzDg;
    if (j < 0)
      j = 0;
    else if (j + this.zzoG > i)
      j = i - this.zzoG;
    if (k < arrayOfInt2[0])
      k = arrayOfInt2[0];
    else if (k + this.zzoH > arrayOfInt2[1])
      k = arrayOfInt2[1] - this.zzoH;
    return new int[] { j, k };
  }

  public void zza(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      this.zzDd = paramInt1;
      this.zzDe = paramInt2;
      if ((this.zzDl != null) && (paramBoolean))
      {
        int[] arrayOfInt = zzeM();
        if (arrayOfInt != null)
        {
          this.zzDl.update(zzn.zzcS().zzb(this.zzDh, arrayOfInt[0]), zzn.zzcS().zzb(this.zzDh, arrayOfInt[1]), this.zzDl.getWidth(), this.zzDl.getHeight());
          zzd(arrayOfInt[0], arrayOfInt[1]);
        }
        else
        {
          zzp(true);
        }
      }
    }
  }

  void zzc(int paramInt1, int paramInt2)
  {
    if (this.zzDk != null)
      this.zzDk.zza(paramInt1, paramInt2, this.zzoG, this.zzoH);
  }

  void zzd(int paramInt1, int paramInt2)
  {
    int i = zzr.zzbC().zzh(this.zzDh)[0];
    zzb(paramInt1, paramInt2 - i, this.zzoG, this.zzoH);
  }

  public boolean zzeN()
  {
    synchronized (this.zzpV)
    {
      return this.zzDl != null;
    }
  }

  public void zze(int paramInt1, int paramInt2)
  {
    this.zzDd = paramInt1;
    this.zzDe = paramInt2;
  }

  boolean zzeO()
  {
    int[] arrayOfInt1 = zzr.zzbC().zzf(this.zzDh);
    int[] arrayOfInt2 = zzr.zzbC().zzh(this.zzDh);
    int i = arrayOfInt1[0];
    int j = arrayOfInt1[1];
    if ((this.zzoG < 50) || (this.zzoG > i))
    {
      zzin.zzaK("Width is too small or too large.");
      return false;
    }
    if ((this.zzoH < 50) || (this.zzoH > j))
    {
      zzin.zzaK("Height is too small or too large.");
      return false;
    }
    if ((this.zzoH == j) && (this.zzoG == i))
    {
      zzin.zzaK("Cannot resize to a full-screen ad.");
      return false;
    }
    if (this.zzDc)
    {
      int k = -1;
      int m = -2;
      switch (this.zzDb)
      {
      case "top-left":
        k = this.zzDd + this.zzDf;
        m = this.zzDe + this.zzDg;
        break;
      case "top-center":
        k = this.zzDd + this.zzDf + this.zzoG / 2 - 25;
        m = this.zzDe + this.zzDg;
        break;
      case "center":
        k = this.zzDd + this.zzDf + this.zzoG / 2 - 25;
        m = this.zzDe + this.zzDg + this.zzoH / 2 - 25;
        break;
      case "bottom-left":
        k = this.zzDd + this.zzDf;
        m = this.zzDe + this.zzDg + this.zzoH - 50;
        break;
      case "bottom-center":
        k = this.zzDd + this.zzDf + this.zzoG / 2 - 25;
        m = this.zzDe + this.zzDg + this.zzoH - 50;
        break;
      case "bottom-right":
        k = this.zzDd + this.zzDf + this.zzoG - 50;
        m = this.zzDe + this.zzDg + this.zzoH - 50;
        break;
      default:
        k = this.zzDd + this.zzDf + this.zzoG - 50;
        m = this.zzDe + this.zzDg;
      }
      if ((k < 0) || (k + 50 > i) || (m < arrayOfInt2[0]) || (m + 50 > arrayOfInt2[1]))
        return false;
    }
    return true;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfn
 * JD-Core Version:    0.6.0
 */