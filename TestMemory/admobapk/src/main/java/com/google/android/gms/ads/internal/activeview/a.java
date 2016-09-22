package com.google.android.gms.ads.internal.activeview;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
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
import aom;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.js.ak;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.util.ad;
import com.google.android.gms.ads.internal.util.bh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public abstract class a
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  public final Object a = new Object();
  public final k b;
  m c;
  boolean d = false;
  boolean e = false;
  final HashSet f = new HashSet();
  private WeakReference g;
  private final v h;
  private final Context i;
  private final WindowManager j;
  private final PowerManager k;
  private final KeyguardManager l;
  private boolean m;
  private boolean n;
  private boolean o;
  private BroadcastReceiver p;
  private bh q;
  private final t r = new c(this);
  private final t s = new d(this);
  private final t t = new e(this);

  public a(Context paramContext, AdSizeParcel paramAdSizeParcel, com.google.android.gms.ads.internal.state.a parama, VersionInfoParcel paramVersionInfoParcel, v paramv)
  {
    new WeakReference(parama);
    this.h = paramv;
    this.g = new WeakReference(null);
    this.n = true;
    this.o = false;
    this.q = new bh(200L);
    this.b = new k(UUID.randomUUID().toString(), paramVersionInfoParcel, paramAdSizeParcel.b, parama.j, parama.a(), paramAdSizeParcel.i);
    this.j = ((WindowManager)paramContext.getSystemService("window"));
    this.k = ((PowerManager)paramContext.getApplicationContext().getSystemService("power"));
    this.l = ((KeyguardManager)paramContext.getSystemService("keyguard"));
    this.i = paramContext;
  }

  private static int a(int paramInt, DisplayMetrics paramDisplayMetrics)
  {
    float f1 = paramDisplayMetrics.density;
    return (int)(paramInt / f1);
  }

  private void g()
  {
    if (this.c != null)
      this.c.a(this);
  }

  private void h()
  {
    ViewTreeObserver localViewTreeObserver = (ViewTreeObserver)this.g.get();
    if ((localViewTreeObserver == null) || (!localViewTreeObserver.isAlive()))
      return;
    localViewTreeObserver.removeOnScrollChangedListener(this);
    localViewTreeObserver.removeGlobalOnLayoutListener(this);
  }

  private JSONObject i()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("afmaVersion", this.b.d).put("activeViewJSON", this.b.b).put("timestamp", bc.a().i.b()).put("adFormat", this.b.a).put("hashCode", this.b.c).put("isMraid", this.b.e).put("isStopped", this.e).put("isPaused", this.d).put("isScreenOn", this.k.isScreenOn()).put("isNative", this.b.f);
    return localJSONObject;
  }

  protected final JSONObject a(View paramView)
  {
    if (paramView == null)
      return i().put("isAttachedToWindow", false).put("isScreenOn", this.k.isScreenOn()).put("isVisible", false);
    boolean bool1 = bc.a().g.a(paramView);
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    try
    {
      paramView.getLocationOnScreen(arrayOfInt1);
      paramView.getLocationInWindow(arrayOfInt2);
      DisplayMetrics localDisplayMetrics = paramView.getContext().getResources().getDisplayMetrics();
      Rect localRect1 = new Rect();
      localRect1.left = arrayOfInt1[0];
      localRect1.top = arrayOfInt1[1];
      localRect1.right = (localRect1.left + paramView.getWidth());
      localRect1.bottom = (localRect1.top + paramView.getHeight());
      Rect localRect2 = new Rect();
      localRect2.right = this.j.getDefaultDisplay().getWidth();
      localRect2.bottom = this.j.getDefaultDisplay().getHeight();
      Rect localRect3 = new Rect();
      boolean bool2 = paramView.getGlobalVisibleRect(localRect3, null);
      Rect localRect4 = new Rect();
      boolean bool3 = paramView.getLocalVisibleRect(localRect4);
      Rect localRect5 = new Rect();
      paramView.getHitRect(localRect5);
      JSONObject localJSONObject = i();
      localJSONObject.put("windowVisibility", paramView.getWindowVisibility()).put("isAttachedToWindow", bool1).put("viewBox", new JSONObject().put("top", a(localRect2.top, localDisplayMetrics)).put("bottom", a(localRect2.bottom, localDisplayMetrics)).put("left", a(localRect2.left, localDisplayMetrics)).put("right", a(localRect2.right, localDisplayMetrics))).put("adBox", new JSONObject().put("top", a(localRect1.top, localDisplayMetrics)).put("bottom", a(localRect1.bottom, localDisplayMetrics)).put("left", a(localRect1.left, localDisplayMetrics)).put("right", a(localRect1.right, localDisplayMetrics))).put("globalVisibleBox", new JSONObject().put("top", a(localRect3.top, localDisplayMetrics)).put("bottom", a(localRect3.bottom, localDisplayMetrics)).put("left", a(localRect3.left, localDisplayMetrics)).put("right", a(localRect3.right, localDisplayMetrics))).put("globalVisibleBoxVisible", bool2).put("localVisibleBox", new JSONObject().put("top", a(localRect4.top, localDisplayMetrics)).put("bottom", a(localRect4.bottom, localDisplayMetrics)).put("left", a(localRect4.left, localDisplayMetrics)).put("right", a(localRect4.right, localDisplayMetrics))).put("localVisibleBoxVisible", bool3).put("hitBox", new JSONObject().put("top", a(localRect5.top, localDisplayMetrics)).put("bottom", a(localRect5.bottom, localDisplayMetrics)).put("left", a(localRect5.left, localDisplayMetrics)).put("right", a(localRect5.right, localDisplayMetrics))).put("screenDensity", localDisplayMetrics.density).put("isVisible", bc.a().e.a(paramView, this.k, this.l));
      return localJSONObject;
    }
    catch (Exception localException)
    {
      while (true)
        com.google.android.gms.ads.internal.util.c.b("Failure getting view location.", localException);
    }
  }

  protected final void a()
  {
    synchronized (this.a)
    {
      if (this.p != null)
        return;
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.SCREEN_ON");
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      this.p = new b(this);
      this.i.registerReceiver(this.p, localIntentFilter);
      return;
    }
  }

  protected final void a(int paramInt)
  {
    View localView1;
    boolean bool;
    while (true)
    {
      synchronized (this.a)
      {
        if ((!e()) || (!this.n))
          return;
        localView1 = this.h.a();
        if ((localView1 != null) && (bc.a().e.a(localView1, this.k, this.l)) && (localView1.getGlobalVisibleRect(new Rect(), null)))
        {
          bool = true;
          this.o = bool;
          if (!this.h.b())
            break;
          c();
          return;
        }
      }
      bool = false;
    }
    int i1 = 0;
    if (paramInt == 1)
      i1 = 1;
    if ((i1 != 0) && (!this.q.a()) && (bool == this.o))
    {
      monitorexit;
      return;
    }
    if ((!bool) && (!this.o) && (paramInt == 1))
    {
      monitorexit;
      return;
    }
    try
    {
      a(a(localView1));
      while (true)
      {
        View localView2 = this.h.c().a();
        if (localView2 != null)
        {
          ViewTreeObserver localViewTreeObserver1 = (ViewTreeObserver)this.g.get();
          ViewTreeObserver localViewTreeObserver2 = localView2.getViewTreeObserver();
          if (localViewTreeObserver2 != localViewTreeObserver1)
          {
            h();
            if ((!this.m) || ((localViewTreeObserver1 != null) && (localViewTreeObserver1.isAlive())))
            {
              this.m = true;
              localViewTreeObserver2.addOnScrollChangedListener(this);
              localViewTreeObserver2.addOnGlobalLayoutListener(this);
            }
            this.g = new WeakReference(localViewTreeObserver2);
          }
        }
        g();
        monitorexit;
        return;
        label293: Throwable localThrowable;
        com.google.android.gms.ads.internal.util.c.a("Active view update failed.", localThrowable);
      }
    }
    catch (JSONException localJSONException)
    {
      break label293;
    }
    catch (RuntimeException localRuntimeException)
    {
      break label293;
    }
  }

  public final void a(j paramj)
  {
    this.f.add(paramj);
  }

  protected final void a(ak paramak)
  {
    paramak.a("/updateActiveView", this.r);
    paramak.a("/untrackActiveViewUnit", this.s);
    paramak.a("/visibilityChanged", this.t);
  }

  protected final void a(JSONObject paramJSONObject)
  {
    try
    {
      JSONArray localJSONArray = new JSONArray();
      JSONObject localJSONObject = new JSONObject();
      localJSONArray.put(paramJSONObject);
      localJSONObject.put("units", localJSONArray);
      b(localJSONObject);
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.c.b("Skipping active view message.", localThrowable);
    }
  }

  protected final boolean a(Map paramMap)
  {
    if (paramMap == null)
      return false;
    String str = (String)paramMap.get("hashCode");
    return (!TextUtils.isEmpty(str)) && (str.equals(this.b.c));
  }

  protected void b()
  {
    synchronized (this.a)
    {
      h();
      synchronized (this.a)
      {
        BroadcastReceiver localBroadcastReceiver = this.p;
        if (localBroadcastReceiver == null);
      }
    }
    try
    {
      this.i.unregisterReceiver(this.p);
      this.p = null;
      monitorexit;
      this.n = false;
      g();
      monitorexit;
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
        com.google.android.gms.ads.internal.util.c.b("Failed trying to unregister the receiver", localIllegalStateException);
      localObject4 = finally;
      monitorexit;
      throw localObject4;
      localObject2 = finally;
      monitorexit;
      throw localObject2;
    }
    catch (Exception localException)
    {
      while (true)
        bc.a().h.a(localException, true);
    }
  }

  protected final void b(ak paramak)
  {
    paramak.b("/visibilityChanged", this.t);
    paramak.b("/untrackActiveViewUnit", this.s);
    paramak.b("/updateActiveView", this.r);
  }

  protected abstract void b(JSONObject paramJSONObject);

  public void c()
  {
    synchronized (this.a)
    {
      boolean bool = this.n;
      if (!bool);
    }
    try
    {
      JSONObject localJSONObject = i();
      localJSONObject.put("doneReasonCode", "u");
      a(localJSONObject);
      String str1 = String.valueOf(this.b.c);
      if (str1.length() != 0)
      {
        str2 = "Untracking ad unit: ".concat(str1);
        com.google.android.gms.ads.internal.util.c.b(str2);
        monitorexit;
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
        com.google.android.gms.ads.internal.util.c.b("JSON failure while processing active view data.", localJSONException);
      localObject2 = finally;
      monitorexit;
      throw localObject2;
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        com.google.android.gms.ads.internal.util.c.b("Failure while processing active view data.", localRuntimeException);
        continue;
        String str2 = new String("Untracking ad unit: ");
      }
    }
  }

  public final boolean d()
  {
    synchronized (this.a)
    {
      boolean bool = this.n;
      return bool;
    }
  }

  protected abstract boolean e();

  public final void f()
  {
    synchronized (this.a)
    {
      this.e = true;
      a(3);
      return;
    }
  }

  public void onGlobalLayout()
  {
    a(2);
  }

  public void onScrollChanged()
  {
    a(1);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.activeview.a
 * JD-Core Version:    0.6.0
 */