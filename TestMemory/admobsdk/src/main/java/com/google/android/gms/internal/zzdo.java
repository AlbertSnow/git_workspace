package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.overlay.zzk;
import com.google.android.gms.ads.internal.util.client.zza;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

@zzhb
public final class zzdo
  implements zzdf
{
  private final Map<zzjp, Integer> zzzI = new WeakHashMap();

  private static int zza(Context paramContext, Map<String, String> paramMap, String paramString, int paramInt)
  {
    String str = (String)paramMap.get(paramString);
    int i = paramInt;
    if (str != null)
      try
      {
        i = zzn.zzcS().zzb(paramContext, Integer.parseInt(str));
      }
      catch (NumberFormatException localNumberFormatException)
      {
        zzin.zzaK("Could not parse " + paramString + " in a video GMSG: " + str);
      }
    return i;
  }

  public void zza(zzjp paramzzjp, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("action");
    if (str1 == null)
    {
      zzin.zzaK("Action missing from video GMSG.");
      return;
    }
    if (zzin.zzQ(3))
    {
      localObject1 = new JSONObject(paramMap);
      ((JSONObject)localObject1).remove("google.afma.Notify_dt");
      zzin.zzaI("Video GMSG: " + str1 + " " + ((JSONObject)localObject1).toString());
    }
    Object localObject2;
    if ("background".equals(str1))
    {
      localObject1 = (String)paramMap.get("color");
      if (TextUtils.isEmpty((CharSequence)localObject1))
      {
        zzin.zzaK("Color parameter missing from color video GMSG.");
        return;
      }
      try
      {
        int i = Color.parseColor((String)localObject1);
        zzjo localzzjo = paramzzjp.zzia();
        if (localzzjo != null)
        {
          localObject2 = localzzjo.zzhM();
          if (localObject2 != null)
          {
            ((zzk)localObject2).setBackgroundColor(i);
            return;
          }
        }
        this.zzzI.put(paramzzjp, Integer.valueOf(i));
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        zzin.zzaK("Invalid color parameter in video GMSG.");
      }
      return;
    }
    Object localObject1 = paramzzjp.zzia();
    if (localObject1 == null)
    {
      zzin.zzaK("Could not get underlay container for a video GMSG.");
      return;
    }
    boolean bool1 = "new".equals(str1);
    boolean bool2 = "position".equals(str1);
    int k;
    int m;
    if ((bool1) || (bool2))
    {
      localObject2 = paramzzjp.getContext();
      int j = zza((Context)localObject2, paramMap, "x", 0);
      k = zza((Context)localObject2, paramMap, "y", 0);
      m = zza((Context)localObject2, paramMap, "w", -1);
      int i1 = zza((Context)localObject2, paramMap, "h", -1);
      int i2;
      try
      {
        i2 = Integer.parseInt((String)paramMap.get("player"));
      }
      catch (NumberFormatException localNumberFormatException3)
      {
        i2 = 0;
      }
      if ((bool1) && (((zzjo)localObject1).zzhM() == null))
      {
        ((zzjo)localObject1).zza(j, k, m, i1, i2);
        if (this.zzzI.containsKey(paramzzjp))
        {
          int i3 = ((Integer)this.zzzI.get(paramzzjp)).intValue();
          zzk localzzk = ((zzjo)localObject1).zzhM();
          localzzk.setBackgroundColor(i3);
          localzzk.zzfE();
        }
      }
      else
      {
        ((zzjo)localObject1).zze(j, k, m, i1);
      }
    }
    else
    {
      localObject2 = ((zzjo)localObject1).zzhM();
      if (localObject2 == null)
      {
        zzk.zzg(paramzzjp);
        return;
      }
      Object localObject3;
      if ("click".equals(str1))
      {
        localObject3 = paramzzjp.getContext();
        k = zza((Context)localObject3, paramMap, "x", 0);
        m = zza((Context)localObject3, paramMap, "y", 0);
        long l = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 0, k, m, 0);
        ((zzk)localObject2).zzd(localMotionEvent);
        localMotionEvent.recycle();
      }
      else if ("currentTime".equals(str1))
      {
        localObject3 = (String)paramMap.get("time");
        if (localObject3 == null)
        {
          zzin.zzaK("Time parameter missing from currentTime video GMSG.");
          return;
        }
        try
        {
          float f1 = Float.parseFloat((String)localObject3);
          int n = (int)(f1 * 1000.0F);
          ((zzk)localObject2).seekTo(n);
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          zzin.zzaK("Could not parse time parameter from currentTime video GMSG: " + (String)localObject3);
        }
      }
      else if ("hide".equals(str1))
      {
        ((zzk)localObject2).setVisibility(4);
      }
      else if ("load".equals(str1))
      {
        ((zzk)localObject2).zzfD();
      }
      else if ("mimetype".equals(str1))
      {
        ((zzk)localObject2).setMimeType((String)paramMap.get("mimetype"));
      }
      else if ("muted".equals(str1))
      {
        boolean bool3 = Boolean.parseBoolean((String)paramMap.get("muted"));
        if (bool3)
          ((zzk)localObject2).zzff();
        else
          ((zzk)localObject2).zzfg();
      }
      else if ("pause".equals(str1))
      {
        ((zzk)localObject2).pause();
      }
      else if ("play".equals(str1))
      {
        ((zzk)localObject2).play();
      }
      else if ("show".equals(str1))
      {
        ((zzk)localObject2).setVisibility(0);
      }
      else if ("src".equals(str1))
      {
        ((zzk)localObject2).zzap((String)paramMap.get("src"));
      }
      else if ("volume".equals(str1))
      {
        String str2 = (String)paramMap.get("volume");
        if (str2 == null)
        {
          zzin.zzaK("Level parameter missing from volume video GMSG.");
          return;
        }
        try
        {
          float f2 = Float.parseFloat(str2);
          ((zzk)localObject2).zza(f2);
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          zzin.zzaK("Could not parse volume parameter from volume video GMSG: " + str2);
        }
      }
      else if ("watermark".equals(str1))
      {
        ((zzk)localObject2).zzfE();
      }
      else
      {
        zzin.zzaK("Unknown video action: " + str1);
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdo
 * JD-Core Version:    0.6.0
 */