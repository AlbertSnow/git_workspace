package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import anw;
import com.google.android.gms.ads.internal.activeview.f;
import com.google.android.gms.ads.internal.an;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.bd;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import ha;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public class j
  implements h
{
  boolean a;
  com.google.android.gms.ads.internal.webview.b b;
  String c;
  private final Object d = new Object();
  private final an e;
  private final Context f;
  private final JSONObject g;
  private final com.google.android.gms.ads.internal.renderer.nativeads.a h;
  private final i i;
  private final ha j;
  private final VersionInfoParcel k;
  private String l;
  private WeakReference m = null;

  public j(Context paramContext, an paraman, com.google.android.gms.ads.internal.renderer.nativeads.a parama, ha paramha, JSONObject paramJSONObject, i parami, VersionInfoParcel paramVersionInfoParcel, String paramString)
  {
    this.f = paramContext;
    this.e = paraman;
    this.h = parama;
    this.j = paramha;
    this.g = paramJSONObject;
    this.i = parami;
    this.k = paramVersionInfoParcel;
    this.l = paramString;
  }

  public b a(View.OnClickListener paramOnClickListener)
  {
    a locala = this.i.l();
    if (locala == null)
      return null;
    b localb = new b(this.f, locala);
    localb.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    localb.a.setOnClickListener(paramOnClickListener);
    localb.a.setContentDescription("Ad attribution icon");
    return localb;
  }

  public void a()
  {
    anw.b("recordImpression must be called on the main UI thread.");
    this.a = true;
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("ad", this.g);
      localJSONObject.put("ads_id", this.l);
      this.h.a(new l(this, localJSONObject));
      an localan = this.e;
      if (localan.d.j.j != null)
        bc.a().h.c.a(localan.d.i, localan.d.j, new f(this), null);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        c.b("Unable to create impression JSON.", localJSONException);
    }
  }

  public final void a(MotionEvent paramMotionEvent)
  {
    this.j.a(paramMotionEvent);
  }

  public final void a(View paramView)
  {
    synchronized (this.d)
    {
      if (this.a)
        return;
      if (!paramView.isShown())
        return;
    }
    if (!paramView.getGlobalVisibleRect(new Rect(), null))
    {
      monitorexit;
      return;
    }
    a();
    monitorexit;
  }

  public void a(View paramView, Map paramMap)
  {
    paramView.setOnTouchListener(null);
    paramView.setClickable(false);
    paramView.setOnClickListener(null);
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      View localView = (View)((WeakReference)((Map.Entry)localIterator.next()).getValue()).get();
      if (localView == null)
        continue;
      localView.setOnTouchListener(null);
      localView.setClickable(false);
      localView.setOnClickListener(null);
    }
  }

  public void a(View paramView, Map paramMap, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener)
  {
    if (!((Boolean)com.google.android.gms.ads.internal.config.m.ay.a()).booleanValue());
    while (true)
    {
      return;
      paramView.setOnTouchListener(paramOnTouchListener);
      paramView.setClickable(true);
      paramView.setOnClickListener(paramOnClickListener);
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        View localView = (View)((WeakReference)((Map.Entry)localIterator.next()).getValue()).get();
        if (localView == null)
          continue;
        localView.setOnTouchListener(paramOnTouchListener);
        localView.setClickable(true);
        localView.setOnClickListener(paramOnClickListener);
      }
    }
  }

  public void a(View paramView, Map paramMap, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3)
  {
    anw.b("performClick must be called on the main UI thread.");
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (!paramView.equals((View)((WeakReference)localEntry.getValue()).get()))
        continue;
      a((String)localEntry.getKey(), paramJSONObject1, paramJSONObject2, paramJSONObject3);
    }
    do
    {
      return;
      if (!"2".equals(this.i.j()))
        continue;
      a("2099", paramJSONObject1, paramJSONObject2, paramJSONObject3);
      return;
    }
    while (!"1".equals(this.i.j()));
    a("1099", paramJSONObject1, paramJSONObject2, paramJSONObject3);
  }

  public final void a(String paramString, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3)
  {
    anw.b("performClick must be called on the main UI thread.");
    try
    {
      JSONObject localJSONObject1 = new JSONObject();
      localJSONObject1.put("asset", paramString);
      localJSONObject1.put("template", this.i.j());
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("ad", this.g);
      localJSONObject2.put("click", localJSONObject1);
      if (this.e.b(this.i.k()) != null);
      for (boolean bool = true; ; bool = false)
      {
        localJSONObject2.put("has_custom_click_handler", bool);
        if (paramJSONObject1 != null)
          localJSONObject2.put("view_rectangles", paramJSONObject1);
        if (paramJSONObject2 != null)
          localJSONObject2.put("click_point", paramJSONObject2);
        if (paramJSONObject3 != null)
          localJSONObject2.put("native_view_rectangle", paramJSONObject3);
        localJSONObject2.put("ads_id", this.l);
        this.h.a(new k(this, localJSONObject2));
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      c.b("Unable to create click JSON.", localJSONException);
    }
  }

  public final void b(View paramView)
  {
    this.m = new WeakReference(paramView);
  }

  public com.google.android.gms.ads.internal.webview.b d()
  {
    this.b = bc.a().f.a(this.f, AdSizeParcel.a(), false, false, this.j, this.k);
    this.b.b().setVisibility(8);
    m localm = new m(this);
    this.h.a(localm);
    return this.b;
  }

  public final View e()
  {
    if (this.m != null)
      return (View)this.m.get();
    return null;
  }

  public final Context f()
  {
    return this.f;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.j
 * JD-Core Version:    0.6.0
 */