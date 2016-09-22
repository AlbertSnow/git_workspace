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
import apj;
import apn;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.formats.client.f;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class u extends f
  implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  FrameLayout a;
  private final Object b = new Object();
  private final FrameLayout c;
  private Map d = new HashMap();
  private b e;
  private h f;
  private boolean g = false;
  private int h;
  private int i;

  public u(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    this.c = paramFrameLayout1;
    this.a = paramFrameLayout2;
    com.google.android.gms.ads.internal.util.weaklisteners.a.a(this.c, this);
    com.google.android.gms.ads.internal.util.weaklisteners.a.a(this.c, this);
    this.c.setOnTouchListener(this);
    this.c.setOnClickListener(this);
  }

  private int a(int paramInt)
  {
    return q.a().a.b(this.f.f(), paramInt);
  }

  private void a(View paramView)
  {
    if (this.f != null)
      if (!(this.f instanceof g))
        break label40;
    label40: for (h localh = ((g)this.f).c(); ; localh = this.f)
    {
      if (localh != null)
        localh.b(paramView);
      return;
    }
  }

  public final apj a(String paramString)
  {
    synchronized (this.b)
    {
      WeakReference localWeakReference = (WeakReference)this.d.get(paramString);
      if (localWeakReference == null)
      {
        localObject3 = null;
        apj localapj = apn.a(localObject3);
        return localapj;
      }
      Object localObject3 = (View)localWeakReference.get();
    }
  }

  public final void a()
  {
    synchronized (this.b)
    {
      if (this.a != null)
        this.a.removeAllViews();
      this.a = null;
      this.d = null;
      this.e = null;
      this.f = null;
      return;
    }
  }

  public final void a(apj paramapj)
  {
    while (true)
    {
      j localj;
      synchronized (this.b)
      {
        a(null);
        Object localObject3 = apn.a(paramapj);
        if ((localObject3 instanceof j))
          continue;
        c.e("Not an instance of native engine. This is most likely a transient error");
        return;
        if (this.a == null)
          continue;
        this.a.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        this.c.requestLayout();
        this.g = true;
        localj = (j)localObject3;
        if ((this.f == null) || (!((Boolean)m.ax.a()).booleanValue()))
          continue;
        this.f.a(this.c, this.d);
        if (((this.f instanceof g)) && (((g)this.f).b()))
        {
          ((g)this.f).a(localj);
          if (!((Boolean)m.ax.a()).booleanValue())
            continue;
          this.a.setClickable(false);
          this.a.removeAllViews();
          this.e = localj.a(this);
          if (this.e == null)
            continue;
          this.d.put("1007", new WeakReference(this.e.a));
          this.a.addView(this.e);
          y.a.post(new v(this, localj));
          localj.a(this.c, this.d, this, this);
          a(this.c);
          return;
        }
      }
      this.f = localj;
      if (!(localj instanceof g))
        continue;
      ((g)localj).a(null);
    }
  }

  public final void a(String paramString, apj paramapj)
  {
    View localView = (View)apn.a(paramapj);
    Object localObject1 = this.b;
    monitorenter;
    if (localView == null);
    try
    {
      this.d.remove(paramString);
      while (true)
      {
        return;
        this.d.put(paramString, new WeakReference(localView));
        localView.setOnTouchListener(this);
        localView.setClickable(true);
        localView.setOnClickListener(this);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject2;
  }

  public final void onClick(View paramView)
  {
    JSONObject localJSONObject1;
    while (true)
    {
      View localView;
      synchronized (this.b)
      {
        if (this.f == null)
          return;
        localJSONObject1 = new JSONObject();
        Iterator localIterator = this.d.entrySet().iterator();
        if (!localIterator.hasNext())
          break;
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localView = (View)((WeakReference)localEntry.getValue()).get();
        if (localView == null)
          continue;
        if ((this.e != null) && (this.e.a.equals(localView)))
        {
          Point localPoint2 = new Point();
          this.c.getGlobalVisibleRect(new Rect(), localPoint2);
          Point localPoint3 = new Point();
          localView.getGlobalVisibleRect(new Rect(), localPoint3);
          localPoint1 = new Point(localPoint3.x - localPoint2.x, localPoint3.y - localPoint2.y);
          JSONObject localJSONObject4 = new JSONObject();
          String str1;
          try
          {
            localJSONObject4.put("width", a(localView.getWidth()));
            localJSONObject4.put("height", a(localView.getHeight()));
            localJSONObject4.put("x", a(localPoint1.x));
            localJSONObject4.put("y", a(localPoint1.y));
            localJSONObject1.put((String)localEntry.getKey(), localJSONObject4);
          }
          catch (JSONException localJSONException3)
          {
            str1 = String.valueOf((String)localEntry.getKey());
            if (str1.length() == 0)
              break label367;
          }
          str2 = "Unable to get view rectangle for view ".concat(str1);
          c.e(str2);
        }
      }
      Point localPoint1 = new Point();
      localView.getGlobalVisibleRect(new Rect(), localPoint1);
      continue;
      label367: String str2 = new String("Unable to get view rectangle for view ");
    }
    JSONObject localJSONObject2 = new JSONObject();
    try
    {
      localJSONObject2.put("x", a(this.h));
      localJSONObject2.put("y", a(this.i));
      localJSONObject3 = new JSONObject();
    }
    catch (JSONException localJSONException1)
    {
      try
      {
        localJSONObject3.put("width", a(this.c.getMeasuredWidth()));
        localJSONObject3.put("height", a(this.c.getMeasuredHeight()));
        if ((this.e != null) && (this.e.a.equals(paramView)))
        {
          this.f.a("1007", localJSONObject1, localJSONObject2, localJSONObject3);
          monitorexit;
          return;
          localJSONException1 = localJSONException1;
          c.e("Unable to get click location");
        }
      }
      catch (JSONException localJSONException2)
      {
        while (true)
        {
          JSONObject localJSONObject3;
          c.e("Unable to get native ad view bounding box");
          continue;
          this.f.a(paramView, this.d, localJSONObject1, localJSONObject2, localJSONObject3);
        }
      }
    }
  }

  public final void onGlobalLayout()
  {
    synchronized (this.b)
    {
      if (this.g)
      {
        int j = this.c.getMeasuredWidth();
        int k = this.c.getMeasuredHeight();
        if ((j != 0) && (k != 0) && (this.a != null))
        {
          this.a.setLayoutParams(new FrameLayout.LayoutParams(j, k));
          this.g = false;
        }
      }
      if (this.f != null)
        this.f.a(this.c);
      return;
    }
  }

  public final void onScrollChanged()
  {
    synchronized (this.b)
    {
      if (this.f != null)
        this.f.a(this.c);
      return;
    }
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    synchronized (this.b)
    {
      if (this.f == null)
        return false;
      int[] arrayOfInt = new int[2];
      this.c.getLocationOnScreen(arrayOfInt);
      float f1 = paramMotionEvent.getRawX() - arrayOfInt[0];
      float f2 = paramMotionEvent.getRawY() - arrayOfInt[1];
      Point localPoint = new Point((int)f1, (int)f2);
      this.h = localPoint.x;
      this.i = localPoint.y;
      MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
      localMotionEvent.setLocation(localPoint.x, localPoint.y);
      this.f.a(localMotionEvent);
      localMotionEvent.recycle();
      return false;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.u
 * JD-Core Version:    0.6.0
 */