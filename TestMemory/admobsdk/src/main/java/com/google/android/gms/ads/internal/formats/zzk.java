package com.google.android.gms.ads.internal.formats;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzcj.zza;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzjk;
import com.google.android.gms.internal.zzjp;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzk extends zzcj.zza
  implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private final Object zzpV = new Object();
  private final FrameLayout zzyD;
  private FrameLayout zzoQ;
  private Map<String, WeakReference<View>> zzyE = new HashMap();
  private zzb zzyF;
  private zzh zzyf;
  boolean zzyG = false;
  int zzyH;
  int zzyI;

  public zzk(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    this.zzyD = paramFrameLayout1;
    this.zzoQ = paramFrameLayout2;
    zzjk.zza(this.zzyD, this);
    zzjk.zza(this.zzyD, this);
    this.zzyD.setOnTouchListener(this);
  }

  public void zza(String paramString, zzd paramzzd)
  {
    View localView = (View)zze.zzp(paramzzd);
    synchronized (this.zzpV)
    {
      if (localView == null)
      {
        this.zzyE.remove(paramString);
      }
      else
      {
        this.zzyE.put(paramString, new WeakReference(localView));
        localView.setOnTouchListener(this);
        localView.setOnClickListener(this);
      }
    }
  }

  public zzd zzK(String paramString)
  {
    synchronized (this.zzpV)
    {
      WeakReference localWeakReference = (WeakReference)this.zzyE.get(paramString);
      return zze.zzC(localWeakReference == null ? null : (View)localWeakReference.get());
    }
  }

  void zzi(View paramView)
  {
    zzh localzzh = null;
    if (this.zzyf != null)
    {
      if ((this.zzyf instanceof zzg))
        localzzh = ((zzg)this.zzyf).zzdQ();
      else
        localzzh = this.zzyf;
      if (localzzh != null)
        localzzh.zzi(paramView);
    }
  }

  public void zza(zzd paramzzd)
  {
    synchronized (this.zzpV)
    {
      this.zzyG = true;
      zzi(null);
      Object localObject1 = zze.zzp(paramzzd);
      if (!(localObject1 instanceof zzi))
      {
        zzin.zzaK("Not an instance of native engine. This is most likely a transient error");
        return;
      }
      zzi localzzi = (zzi)localObject1;
      if (((this.zzyf instanceof zzg)) && (((zzg)this.zzyf).zzdP()))
      {
        ((zzg)this.zzyf).zzc(localzzi);
      }
      else
      {
        this.zzyf = localzzi;
        if ((this.zzyf instanceof zzg))
          ((zzg)this.zzyf).zzc(null);
      }
      this.zzoQ.removeAllViews();
      this.zzyF = zzd(localzzi);
      if (this.zzyF != null)
      {
        this.zzyE.put("1007", new WeakReference(this.zzyF.zzdI()));
        this.zzoQ.addView(this.zzyF);
      }
      zzir.zzMc.post(new Runnable(localzzi)
      {
        public void run()
        {
          zzjp localzzjp = this.zzyJ.zzdR();
          if (localzzjp != null)
            zzk.zza(zzk.this).addView(localzzjp.getView());
        }
      });
      localzzi.zzg(this.zzyD);
      zzi(this.zzyD);
    }
  }

  public void onClick(View view)
  {
    synchronized (this.zzpV)
    {
      if (this.zzyf == null)
        return;
      JSONObject localJSONObject1 = new JSONObject();
      Object localObject1 = this.zzyE.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject1).next();
        View localView = (View)((WeakReference)localEntry.getValue()).get();
        Point localPoint = zzj(localView);
        JSONObject localJSONObject3 = new JSONObject();
        try
        {
          localJSONObject3.put("width", zzq(localView.getWidth()));
          localJSONObject3.put("height", zzq(localView.getHeight()));
          localJSONObject3.put("x", zzq(localPoint.x));
          localJSONObject3.put("y", zzq(localPoint.y));
          localJSONObject1.put((String)localEntry.getKey(), localJSONObject3);
        }
        catch (JSONException localJSONException)
        {
          zzin.zzaK("Unable to get view rectangle for view " + (String)localEntry.getKey());
        }
      }
      localObject1 = new JSONObject();
      try
      {
        ((JSONObject)localObject1).put("x", zzq(this.zzyH));
        ((JSONObject)localObject1).put("y", zzq(this.zzyI));
      }
      catch (JSONException localJSONException3)
      {
        zzin.zzaK("Unable to get click location");
      }
      JSONObject localJSONObject2 = new JSONObject();
      try
      {
        localJSONObject2.put("width", zzq(getMeasuredWidth()));
        localJSONObject2.put("height", zzq(getMeasuredHeight()));
      }
      catch (JSONException localJSONException4)
      {
        zzin.zzaK("Unable to get native ad view bounding box");
      }
      if ((this.zzyF != null) && (this.zzyF.zzdI().equals(view)))
        this.zzyf.zza("1007", localJSONObject1, (JSONObject)localObject1, localJSONObject2);
      else
        this.zzyf.zza(view, this.zzyE, localJSONObject1, (JSONObject)localObject1, localJSONObject2);
    }
  }

  public void onGlobalLayout()
  {
    synchronized (this.zzpV)
    {
      if (this.zzyG)
      {
        int i = getMeasuredWidth();
        int j = getMeasuredHeight();
        if ((i != 0) && (j != 0))
        {
          this.zzoQ.setLayoutParams(new FrameLayout.LayoutParams(i, j));
          this.zzyG = false;
        }
      }
      if (this.zzyf != null)
        this.zzyf.zzh(this.zzyD);
    }
  }

  public void onScrollChanged()
  {
    synchronized (this.zzpV)
    {
      if (this.zzyf != null)
        this.zzyf.zzh(this.zzyD);
    }
  }

  public boolean onTouch(View view, MotionEvent motionEvent)
  {
    synchronized (this.zzpV)
    {
      if (this.zzyf == null)
        return false;
      Point localPoint = zzc(motionEvent);
      this.zzyH = localPoint.x;
      this.zzyI = localPoint.y;
      MotionEvent localMotionEvent = MotionEvent.obtain(motionEvent);
      localMotionEvent.setLocation(localPoint.x, localPoint.y);
      this.zzyf.zzb(localMotionEvent);
      localMotionEvent.recycle();
      return false;
    }
  }

  public void destroy()
  {
    this.zzoQ.removeAllViews();
    this.zzoQ = null;
    this.zzyE = null;
    this.zzyF = null;
    this.zzyf = null;
  }

  Point zzc(MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = new int[2];
    this.zzyD.getLocationOnScreen(arrayOfInt);
    float f1 = paramMotionEvent.getRawX() - arrayOfInt[0];
    float f2 = paramMotionEvent.getRawY() - arrayOfInt[1];
    return new Point((int)f1, (int)f2);
  }

  zzb zzd(zzi paramzzi)
  {
    return paramzzi.zza(this);
  }

  int getMeasuredWidth()
  {
    return this.zzyD.getMeasuredWidth();
  }

  int getMeasuredHeight()
  {
    return this.zzyD.getMeasuredHeight();
  }

  int zzq(int paramInt)
  {
    return zzn.zzcS().zzc(this.zzyf.getContext(), paramInt);
  }

  Point zzj(View paramView)
  {
    if ((this.zzyF != null) && (this.zzyF.zzdI().equals(paramView)))
    {
      localPoint1 = new Point();
      this.zzyD.getGlobalVisibleRect(new Rect(), localPoint1);
      Point localPoint2 = new Point();
      paramView.getGlobalVisibleRect(new Rect(), localPoint2);
      return new Point(localPoint2.x - localPoint1.x, localPoint2.y - localPoint1.y);
    }
    Point localPoint1 = new Point();
    paramView.getGlobalVisibleRect(new Rect(), localPoint1);
    return localPoint1;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzk
 * JD-Core Version:    0.6.0
 */