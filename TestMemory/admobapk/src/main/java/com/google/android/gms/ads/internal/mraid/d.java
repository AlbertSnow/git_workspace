package com.google.android.gms.ads.internal.mraid;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import aok;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class d extends m
{
  public String a = "top-right";
  public boolean b = true;
  public int c = 0;
  public int d = 0;
  public int e = -1;
  public int f = 0;
  public int g = 0;
  public int h = -1;
  public final Object i = new Object();
  public final b j;
  public final Activity k;
  public AdSizeParcel l;
  public ImageView m;
  public LinearLayout n;
  public n o;
  public PopupWindow p;
  public RelativeLayout q;
  public ViewGroup r;

  static
  {
    String[] arrayOfString = { "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center" };
    switch (arrayOfString.length)
    {
    default:
      if (arrayOfString.length > 32)
        break;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    for (Object localObject = new aok(Arrays.asList(arrayOfString)); ; localObject = new HashSet(Arrays.asList(arrayOfString)))
    {
      Collections.unmodifiableSet((Set)localObject);
      return;
      Collections.emptySet();
      return;
      Collections.singleton(arrayOfString[0]);
      return;
      String str8 = arrayOfString[0];
      String str9 = arrayOfString[1];
      aok localaok3 = new aok(2);
      localaok3.add(str8);
      localaok3.add(str9);
      Collections.unmodifiableSet(localaok3);
      return;
      String str5 = arrayOfString[0];
      String str6 = arrayOfString[1];
      String str7 = arrayOfString[2];
      aok localaok2 = new aok(3);
      localaok2.add(str5);
      localaok2.add(str6);
      localaok2.add(str7);
      Collections.unmodifiableSet(localaok2);
      return;
      String str1 = arrayOfString[0];
      String str2 = arrayOfString[1];
      String str3 = arrayOfString[2];
      String str4 = arrayOfString[3];
      aok localaok1 = new aok(4);
      localaok1.add(str1);
      localaok1.add(str2);
      localaok1.add(str3);
      localaok1.add(str4);
      Collections.unmodifiableSet(localaok1);
      return;
    }
  }

  public d(b paramb, n paramn)
  {
    super(paramb, "resize");
    this.j = paramb;
    this.k = paramb.f();
    this.o = paramn;
  }

  public final void a(int paramInt1, int paramInt2)
  {
    int i1 = paramInt2 - bc.a().e.c(this.k)[0];
    int i2 = this.h;
    int i3 = this.e;
    try
    {
      JSONObject localJSONObject = new JSONObject().put("x", paramInt1).put("y", i1).put("width", i2).put("height", i3);
      this.s.b("onSizeChanged", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      c.b("Error occured while dispatching size change.", localJSONException);
    }
  }

  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    synchronized (this.i)
    {
      this.c = paramInt1;
      this.d = paramInt2;
      if ((this.p != null) && (paramBoolean))
      {
        int[] arrayOfInt = a();
        if (arrayOfInt != null)
        {
          this.p.update(q.a().a.a(this.k, arrayOfInt[0]), q.a().a.a(this.k, arrayOfInt[1]), this.p.getWidth(), this.p.getHeight());
          a(arrayOfInt[0], arrayOfInt[1]);
        }
      }
      else
      {
        return;
      }
      a(true);
    }
  }

  public final void a(boolean paramBoolean)
  {
    synchronized (this.i)
    {
      if (this.p != null)
      {
        this.p.dismiss();
        this.q.removeView(this.j.b());
        if (this.r != null)
        {
          this.r.removeView(this.m);
          this.r.addView(this.j.b());
          this.j.a(this.l);
        }
        if (paramBoolean)
        {
          c("default");
          if (this.o != null)
            this.o.K();
        }
        this.p = null;
        this.q = null;
        this.r = null;
        this.n = null;
      }
      return;
    }
  }

  public final int[] a()
  {
    int[] arrayOfInt1 = bc.a().e.b(this.k);
    int[] arrayOfInt2 = bc.a().e.c(this.k);
    int i1 = arrayOfInt1[0];
    int i2 = arrayOfInt1[1];
    int i3;
    if ((this.h < 50) || (this.h > i1))
    {
      c.e("Width is too small or too large.");
      i3 = 0;
    }
    while (i3 == 0)
    {
      return null;
      if ((this.e < 50) || (this.e > i2))
      {
        c.e("Height is too small or too large.");
        i3 = 0;
        continue;
      }
      if ((this.e == i2) && (this.h == i1))
      {
        c.e("Cannot resize to a full-screen ad.");
        i3 = 0;
        continue;
      }
      if (this.b)
      {
        String str = this.a;
        int i7 = -1;
        label208: int i8;
        int i9;
        switch (str.hashCode())
        {
        default:
          switch (i7)
          {
          default:
            i8 = -50 + (this.c + this.f + this.h);
            i9 = this.d + this.g;
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          }
        case -1012429441:
        case 1755462605:
        case -1364013995:
        case -655373719:
        case 1288627767:
        case 1163912186:
        }
        while (true)
        {
          if ((i8 >= 0) && (i8 + 50 <= i1) && (i9 >= arrayOfInt2[0]) && (i9 + 50 <= arrayOfInt2[1]))
            break label635;
          i3 = 0;
          break;
          if (!str.equals("top-left"))
            break label208;
          i7 = 0;
          break label208;
          if (!str.equals("top-center"))
            break label208;
          i7 = 1;
          break label208;
          if (!str.equals("center"))
            break label208;
          i7 = 2;
          break label208;
          if (!str.equals("bottom-left"))
            break label208;
          i7 = 3;
          break label208;
          if (!str.equals("bottom-center"))
            break label208;
          i7 = 4;
          break label208;
          if (!str.equals("bottom-right"))
            break label208;
          i7 = 5;
          break label208;
          i8 = this.c + this.f;
          i9 = this.d + this.g;
          continue;
          i8 = -25 + (this.c + this.f + this.h / 2);
          i9 = this.d + this.g;
          continue;
          i8 = -25 + (this.c + this.f + this.h / 2);
          i9 = -25 + (this.d + this.g + this.e / 2);
          continue;
          i8 = this.c + this.f;
          i9 = -50 + (this.d + this.g + this.e);
          continue;
          i8 = -25 + (this.c + this.f + this.h / 2);
          i9 = -50 + (this.d + this.g + this.e);
          continue;
          i8 = -50 + (this.c + this.f + this.h);
          i9 = -50 + (this.d + this.g + this.e);
        }
      }
      label635: i3 = 1;
    }
    if (this.b)
    {
      int[] arrayOfInt5 = new int[2];
      arrayOfInt5[0] = (this.c + this.f);
      arrayOfInt5[1] = (this.d + this.g);
      return arrayOfInt5;
    }
    int[] arrayOfInt3 = bc.a().e.b(this.k);
    int[] arrayOfInt4 = bc.a().e.c(this.k);
    int i4 = arrayOfInt3[0];
    int i5 = this.c + this.f;
    int i6 = this.d + this.g;
    if (i5 < 0)
    {
      i5 = 0;
      if (i6 >= arrayOfInt4[0])
        break label801;
      i6 = arrayOfInt4[0];
    }
    while (true)
    {
      return new int[] { i5, i6 };
      if (i5 + this.h <= i4)
        break;
      i5 = i4 - this.h;
      break;
      label801: if (i6 + this.e <= arrayOfInt4[1])
        continue;
      i6 = arrayOfInt4[1] - this.e;
    }
  }

  public final boolean b()
  {
    while (true)
    {
      synchronized (this.i)
      {
        if (this.p != null)
        {
          i1 = 1;
          return i1;
        }
      }
      int i1 = 0;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mraid.d
 * JD-Core Version:    0.6.0
 */