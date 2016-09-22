package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import anw;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.csi.e;
import com.google.android.gms.ads.internal.csi.j;
import com.google.android.gms.ads.internal.csi.k;
import com.google.android.gms.ads.internal.overlay.ab;
import com.google.android.gms.ads.internal.overlay.ao;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class am
  implements t
{
  private final Map a = new WeakHashMap();
  private boolean b;

  private static int a(Context paramContext, Map paramMap, String paramString, int paramInt)
  {
    String str = (String)paramMap.get(paramString);
    if (str != null);
    try
    {
      int i = q.a().a.a(paramContext, Integer.parseInt(str));
      paramInt = i;
      return paramInt;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      c.e(34 + String.valueOf(paramString).length() + String.valueOf(str).length() + "Could not parse " + paramString + " in a video GMSG: " + str);
    }
    return paramInt;
  }

  public final void a(b paramb, Map paramMap)
  {
    String str1 = (String)paramMap.get("action");
    if (str1 == null)
      c.e("Action missing from video GMSG.");
    while (true)
    {
      return;
      if (c.a(3))
      {
        JSONObject localJSONObject = new JSONObject(paramMap);
        localJSONObject.remove("google.afma.Notify_dt");
        String str2 = String.valueOf(localJSONObject.toString());
        c.b(13 + String.valueOf(str1).length() + String.valueOf(str2).length() + "Video GMSG: " + str1 + " " + str2);
      }
      if ("background".equals(str1))
      {
        String str13 = (String)paramMap.get("color");
        if (TextUtils.isEmpty(str13))
        {
          c.e("Color parameter missing from color video GMSG.");
          return;
        }
        int i8;
        try
        {
          i8 = Color.parseColor(str13);
          com.google.android.gms.ads.internal.webview.a locala2 = paramb.w();
          if (locala2 != null)
          {
            ao localao2 = locala2.a();
            if (localao2 != null)
            {
              localao2.setBackgroundColor(i8);
              return;
            }
          }
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          c.e("Invalid color parameter in video GMSG.");
          return;
        }
        this.a.put(paramb, Integer.valueOf(i8));
        return;
      }
      com.google.android.gms.ads.internal.webview.a locala1 = paramb.w();
      if (locala1 == null)
      {
        c.e("Could not get underlay container for a video GMSG.");
        return;
      }
      boolean bool1 = "new".equals(str1);
      boolean bool2 = "position".equals(str1);
      if ((bool1) || (bool2))
      {
        Context localContext1 = paramb.getContext();
        int i = a(localContext1, paramMap, "x", 0);
        int j = a(localContext1, paramMap, "y", 0);
        int k = a(localContext1, paramMap, "w", -1);
        int m = a(localContext1, paramMap, "h", -1);
        try
        {
          int i2 = Integer.parseInt((String)paramMap.get("player"));
          n = i2;
          boolean bool3 = Boolean.parseBoolean((String)paramMap.get("spherical"));
          if ((bool1) && (locala1.a() == null))
          {
            if (locala1.d == null)
            {
              e.a(locala1.a.y().b, locala1.a.x(), new String[] { "vpr" });
              j localj = e.a(locala1.a.y().b);
              locala1.d = new ao(locala1.b, locala1.a, n, bool3, locala1.a.y().b, localj);
              locala1.c.addView(locala1.d, 0, new ViewGroup.LayoutParams(-1, -1));
              locala1.d.a(i, j, k, m);
              locala1.a.l().h = false;
            }
            if (!this.a.containsKey(paramb))
              continue;
            int i1 = ((Integer)this.a.get(paramb)).intValue();
            locala1.a().setBackgroundColor(i1);
            return;
          }
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          while (true)
            int n = 0;
          anw.b("The underlay may only be modified from the UI thread.");
        }
        if (locala1.d == null)
          continue;
        locala1.d.a(i, j, k, m);
        return;
      }
      ao localao1 = locala1.a();
      if (localao1 == null)
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("event", "no_video_view");
        paramb.a("onVideoEvent", localHashMap);
        return;
      }
      if ("click".equals(str1))
      {
        Context localContext3 = paramb.getContext();
        int i6 = a(localContext3, paramMap, "x", 0);
        int i7 = a(localContext3, paramMap, "y", 0);
        long l = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 0, i6, i7, 0);
        if (localao1.c != null)
          localao1.c.dispatchTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
        return;
      }
      if ("currentTime".equals(str1))
      {
        String str10 = (String)paramMap.get("time");
        if (str10 == null)
        {
          c.e("Time parameter missing from currentTime video GMSG.");
          return;
        }
        String str11;
        try
        {
          int i5 = (int)(1000.0F * Float.parseFloat(str10));
          if (localao1.c == null)
            continue;
          localao1.c.a(i5);
          return;
        }
        catch (NumberFormatException localNumberFormatException3)
        {
          str11 = String.valueOf(str10);
          if (str11.length() == 0);
        }
        for (String str12 = "Could not parse time parameter from currentTime video GMSG: ".concat(str11); ; str12 = new String("Could not parse time parameter from currentTime video GMSG: "))
        {
          c.e(str12);
          return;
        }
      }
      if ("hide".equals(str1))
      {
        localao1.setVisibility(4);
        return;
      }
      if ("load".equals(str1))
      {
        if (localao1.c == null)
          continue;
        if (!TextUtils.isEmpty(localao1.g))
        {
          localao1.c.a(localao1.f);
          localao1.c.b(localao1.g);
          return;
        }
        localao1.a("no_src", new String[0]);
        return;
      }
      if ("mimetype".equals(str1))
      {
        localao1.f = ((String)paramMap.get("mimetype"));
        return;
      }
      if ("muted".equals(str1))
      {
        if (Boolean.parseBoolean((String)paramMap.get("muted")))
        {
          if (localao1.c == null)
            continue;
          localao1.c.h();
          return;
        }
        if (localao1.c == null)
          continue;
        localao1.c.i();
        return;
      }
      if ("pause".equals(str1))
      {
        localao1.g();
        return;
      }
      if ("play".equals(str1))
      {
        if (localao1.c == null)
          continue;
        localao1.c.e();
        return;
      }
      if ("show".equals(str1))
      {
        localao1.setVisibility(0);
        return;
      }
      if ("src".equals(str1))
      {
        localao1.g = ((String)paramMap.get("src"));
        return;
      }
      if ("touchMove".equals(str1))
      {
        Context localContext2 = paramb.getContext();
        int i3 = a(localContext2, paramMap, "dx", 0);
        int i4 = a(localContext2, paramMap, "dy", 0);
        float f2 = i3;
        float f3 = i4;
        if (localao1.c != null)
          localao1.c.a(f2, f3);
        if (this.b)
          continue;
        paramb.i().g.a = true;
        this.b = true;
        return;
      }
      if ("volume".equals(str1))
      {
        String str7 = (String)paramMap.get("volume");
        if (str7 == null)
        {
          c.e("Level parameter missing from volume video GMSG.");
          return;
        }
        String str8;
        try
        {
          float f1 = Float.parseFloat(str7);
          if (localao1.c == null)
            continue;
          localao1.c.a(f1);
          return;
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          str8 = String.valueOf(str7);
          if (str8.length() == 0);
        }
        for (String str9 = "Could not parse volume parameter from volume video GMSG: ".concat(str8); ; str9 = new String("Could not parse volume parameter from volume video GMSG: "))
        {
          c.e(str9);
          return;
        }
      }
      if (!"watermark".equals(str1))
        break;
      if (localao1.c == null)
        continue;
      TextView localTextView = new TextView(localao1.c.getContext());
      String str5 = String.valueOf(localao1.c.d());
      if (str5.length() != 0);
      for (String str6 = "AdMob - ".concat(str5); ; str6 = new String("AdMob - "))
      {
        localTextView.setText(str6);
        localTextView.setTextColor(-65536);
        localTextView.setBackgroundColor(-256);
        localao1.a.addView(localTextView, new FrameLayout.LayoutParams(-2, -2, 17));
        localao1.a.bringChildToFront(localTextView);
        return;
      }
    }
    String str3 = String.valueOf(str1);
    if (str3.length() != 0);
    for (String str4 = "Unknown video action: ".concat(str3); ; str4 = new String("Unknown video action: "))
    {
      c.e(str4);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.am
 * JD-Core Version:    0.6.0
 */