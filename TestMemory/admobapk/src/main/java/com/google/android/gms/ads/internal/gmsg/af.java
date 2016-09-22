package com.google.android.gms.ads.internal.gmsg;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.mraid.d;
import com.google.android.gms.ads.internal.mraid.e;
import com.google.android.gms.ads.internal.mraid.f;
import com.google.android.gms.ads.internal.mraid.g;
import com.google.android.gms.ads.internal.mraid.i;
import com.google.android.gms.ads.internal.util.ad;
import com.google.android.gms.ads.internal.util.y;
import cw;
import java.util.Collections;
import java.util.Map;
import mb;
import mi;

@com.google.android.gms.ads.internal.report.client.a
public final class af
  implements t
{
  private static Map c;
  private final com.google.android.gms.ads.internal.n a;
  private final d b;

  static
  {
    Integer localInteger1 = Integer.valueOf(1);
    Integer localInteger2 = Integer.valueOf(2);
    Integer localInteger3 = Integer.valueOf(3);
    Integer localInteger4 = Integer.valueOf(4);
    Integer localInteger5 = Integer.valueOf(5);
    Integer localInteger6 = Integer.valueOf(6);
    cw localcw = new cw(6);
    localcw.put("resize", localInteger1);
    localcw.put("playVideo", localInteger2);
    localcw.put("storePicture", localInteger3);
    localcw.put("createCalendarEvent", localInteger4);
    localcw.put("setOrientationProperties", localInteger5);
    localcw.put("closeResizedAd", localInteger6);
    c = Collections.unmodifiableMap(localcw);
  }

  public af(com.google.android.gms.ads.internal.n paramn, d paramd)
  {
    this.a = paramn;
    this.b = paramd;
  }

  public final void a(com.google.android.gms.ads.internal.webview.b paramb, Map paramMap)
  {
    int i = -1;
    String str1 = (String)paramMap.get("a");
    int j = ((Integer)c.get(str1)).intValue();
    if ((j != 5) && (this.a != null) && (!this.a.a()))
    {
      this.a.a(null);
      return;
    }
    d locald;
    int m;
    Window localWindow;
    int[] arrayOfInt;
    label739: PopupWindow localPopupWindow;
    switch (j)
    {
    case 2:
    default:
      com.google.android.gms.ads.internal.util.c.d("Unknown MRAID command called.");
      return;
    case 1:
      locald = this.b;
      synchronized (locald.i)
      {
        if (locald.k == null)
        {
          locald.a("Not an activity context. Cannot resize.");
          return;
        }
      }
      if (locald.j.k() == null)
      {
        locald.a("Webview is not yet available, size is not set.");
        monitorexit;
        return;
      }
      if (locald.j.k().e)
      {
        locald.a("Is interstitial. Cannot resize an interstitial.");
        monitorexit;
        return;
      }
      if (locald.j.p())
      {
        locald.a("Cannot resize an expanded banner.");
        monitorexit;
        return;
      }
      if (!TextUtils.isEmpty((CharSequence)paramMap.get("width")))
        locald.h = y.b((String)paramMap.get("width"));
      if (!TextUtils.isEmpty((CharSequence)paramMap.get("height")))
        locald.e = y.b((String)paramMap.get("height"));
      if (!TextUtils.isEmpty((CharSequence)paramMap.get("offsetX")))
        locald.f = y.b((String)paramMap.get("offsetX"));
      if (!TextUtils.isEmpty((CharSequence)paramMap.get("offsetY")))
        locald.g = y.b((String)paramMap.get("offsetY"));
      if (!TextUtils.isEmpty((CharSequence)paramMap.get("allowOffscreen")))
        locald.b = Boolean.parseBoolean((String)paramMap.get("allowOffscreen"));
      String str16 = (String)paramMap.get("customClosePosition");
      if (!TextUtils.isEmpty(str16))
        locald.a = str16;
      if ((locald.h >= 0) && (locald.e >= 0))
      {
        m = 1;
        if (m == 0)
        {
          locald.a("Invalid width and height options. Cannot resize.");
          monitorexit;
          return;
        }
        localWindow = locald.k.getWindow();
        if ((localWindow == null) || (localWindow.getDecorView() == null))
        {
          locald.a("Activity context is not ready, cannot get window or decor view.");
          monitorexit;
          return;
        }
        arrayOfInt = locald.a();
        if (arrayOfInt == null)
        {
          locald.a("Resize location out of screen or close button is not visible.");
          monitorexit;
          return;
        }
        int n = q.a().a.a(locald.k, locald.h);
        int i1 = q.a().a.a(locald.k, locald.e);
        ViewParent localViewParent = locald.j.b().getParent();
        if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
        {
          ((ViewGroup)localViewParent).removeView(locald.j.b());
          if (locald.p != null)
            break;
          locald.r = ((ViewGroup)localViewParent);
          Bitmap localBitmap = y.a(locald.j.b());
          locald.m = new ImageView(locald.k);
          locald.m.setImageBitmap(localBitmap);
          locald.l = locald.j.k();
          locald.r.addView(locald.m);
          locald.q = new RelativeLayout(locald.k);
          locald.q.setBackgroundColor(0);
          locald.q.setLayoutParams(new ViewGroup.LayoutParams(n, i1));
          locald.p = y.a(locald.q, n, i1, false);
          locald.p.setOutsideTouchable(true);
          locald.p.setTouchable(true);
          localPopupWindow = locald.p;
          if (locald.b)
            break label2356;
        }
      }
    case 4:
    case 3:
    case 5:
    case 6:
    }
    label1665: label1688: label2089: label2356: for (boolean bool = true; ; bool = false)
    {
      while (true)
      {
        localPopupWindow.setClippingEnabled(bool);
        locald.q.addView(locald.j.b(), -1, -1);
        locald.n = new LinearLayout(locald.k);
        RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(q.a().a.a(locald.k, 50), q.a().a.a(locald.k, 50));
        String str17 = locald.a;
        switch (str17.hashCode())
        {
        case -1012429441:
          localLayoutParams.addRule(10);
          localLayoutParams.addRule(11);
          locald.n.setOnClickListener(new e(locald));
          locald.n.setContentDescription("Close button");
          locald.q.addView(locald.n, localLayoutParams);
        case 1755462605:
        case -1364013995:
        case -655373719:
        case 1288627767:
        case 1163912186:
          try
          {
            label1014: locald.p.showAtLocation(localWindow.getDecorView(), 0, q.a().a.a(locald.k, arrayOfInt[0]), q.a().a.a(locald.k, arrayOfInt[1]));
            arrayOfInt[0];
            arrayOfInt[1];
            if (locald.o != null)
              locald.o.J();
            locald.j.a(new AdSizeParcel(locald.k, new mi(locald.h, locald.e)));
            locald.a(arrayOfInt[0], arrayOfInt[1]);
            locald.c("resized");
            monitorexit;
            return;
            locald.p.dismiss();
            break label739;
            locald.a("Webview is detached, probably in the middle of a resize or expand.");
            monitorexit;
            return;
            if (!str17.equals("top-left"))
              break label2318;
            i = 0;
            break label2318;
            if (!str17.equals("top-center"))
              break label2318;
            i = 1;
            break label2318;
            if (!str17.equals("center"))
              break label2318;
            i = 2;
            break label2318;
            if (!str17.equals("bottom-left"))
              break label2318;
            i = 3;
            break label2318;
            if (!str17.equals("bottom-center"))
              break label2318;
            i = 4;
            break label2318;
            if (!str17.equals("bottom-right"))
              break label2318;
            i = 5;
            break label2318;
            localLayoutParams.addRule(10);
            localLayoutParams.addRule(9);
            break label1014;
            localLayoutParams.addRule(10);
            localLayoutParams.addRule(14);
            break label1014;
            localLayoutParams.addRule(13);
            break label1014;
            localLayoutParams.addRule(12);
            localLayoutParams.addRule(9);
            break label1014;
            localLayoutParams.addRule(12);
            localLayoutParams.addRule(14);
            break label1014;
            localLayoutParams.addRule(12);
            localLayoutParams.addRule(11);
          }
          catch (RuntimeException localRuntimeException)
          {
            String str18 = String.valueOf(localRuntimeException.getMessage());
            if (str18.length() != 0);
            for (String str19 = "Cannot show popup window: ".concat(str18); ; str19 = new String("Cannot show popup window: "))
            {
              locald.a(str19);
              locald.q.removeView(locald.j.b());
              if (locald.r != null)
              {
                locald.r.removeView(locald.m);
                locald.r.addView(locald.j.b());
                locald.j.a(locald.l);
              }
              monitorexit;
              return;
            }
          }
        }
      }
      com.google.android.gms.ads.internal.mraid.a locala = new com.google.android.gms.ads.internal.mraid.a(paramb, paramMap);
      if (locala.a == null)
      {
        locala.a("Activity context is not available.");
        return;
      }
      if (!y.d(locala.a).b())
      {
        locala.a("This feature is not available on the device.");
        return;
      }
      AlertDialog.Builder localBuilder2 = y.c(locala.a);
      Resources localResources2 = bc.a().h.k();
      String str12;
      String str13;
      String str14;
      if (localResources2 != null)
      {
        str12 = localResources2.getString(mb.c);
        localBuilder2.setTitle(str12);
        if (localResources2 == null)
          break label1754;
        str13 = localResources2.getString(mb.b);
        localBuilder2.setMessage(str13);
        if (localResources2 == null)
          break label1762;
        str14 = localResources2.getString(mb.a);
        localBuilder2.setPositiveButton(str14, new com.google.android.gms.ads.internal.mraid.b(locala));
        if (localResources2 == null)
          break label1770;
      }
      label1754: label1762: label1770: for (String str15 = localResources2.getString(mb.d); ; str15 = "Decline")
      {
        localBuilder2.setNegativeButton(str15, new com.google.android.gms.ads.internal.mraid.c(locala));
        localBuilder2.create().show();
        return;
        str12 = "Create calendar event";
        break;
        str13 = "Allow Ad to create a calendar event?";
        break label1665;
        str14 = "Accept";
        break label1688;
      }
      g localg = new g(paramb, paramMap);
      if (localg.b == null)
      {
        localg.a("Activity context is not available");
        return;
      }
      if (!y.d(localg.b).a())
      {
        localg.a("Feature is not supported by the device.");
        return;
      }
      String str2 = (String)localg.a.get("iurl");
      if (TextUtils.isEmpty(str2))
      {
        localg.a("Image url cannot be empty.");
        return;
      }
      if (!URLUtil.isValidUrl(str2))
      {
        String str10 = String.valueOf(str2);
        if (str10.length() != 0);
        for (String str11 = "Invalid image url: ".concat(str10); ; str11 = new String("Invalid image url: "))
        {
          localg.a(str11);
          return;
        }
      }
      String str3 = Uri.parse(str2).getLastPathSegment();
      if (!y.c(str3))
      {
        String str8 = String.valueOf(str3);
        if (str8.length() != 0);
        for (String str9 = "Image type not recognized: ".concat(str8); ; str9 = new String("Image type not recognized: "))
        {
          localg.a(str9);
          return;
        }
      }
      Resources localResources1 = bc.a().h.k();
      AlertDialog.Builder localBuilder1 = y.c(localg.b);
      String str4;
      String str5;
      String str6;
      if (localResources1 != null)
      {
        str4 = localResources1.getString(mb.f);
        localBuilder1.setTitle(str4);
        if (localResources1 == null)
          break label2159;
        str5 = localResources1.getString(mb.e);
        localBuilder1.setMessage(str5);
        if (localResources1 == null)
          break label2167;
        str6 = localResources1.getString(mb.a);
        localBuilder1.setPositiveButton(str6, new com.google.android.gms.ads.internal.mraid.h(localg, str2, str3));
        if (localResources1 == null)
          break label2175;
      }
      label2159: label2167: label2175: for (String str7 = localResources1.getString(mb.d); ; str7 = "Decline")
      {
        localBuilder1.setNegativeButton(str7, new i(localg));
        localBuilder1.create().show();
        return;
        str4 = "Save image";
        break;
        str5 = "Allow Ad to store image in Picture gallery?";
        break label2066;
        str6 = "Accept";
        break label2089;
      }
      f localf = new f(paramb, paramMap);
      if (localf.a == null)
      {
        com.google.android.gms.ads.internal.util.c.e("AdWebView is null");
        return;
      }
      int k;
      if ("portrait".equalsIgnoreCase(localf.c))
        k = bc.a().g.b();
      while (true)
      {
        localf.a.b(k);
        return;
        if ("landscape".equalsIgnoreCase(localf.c))
        {
          k = bc.a().g.a();
          continue;
        }
        if (localf.b)
        {
          k = i;
          continue;
        }
        k = bc.a().g.c();
      }
      this.b.a(true);
      return;
      m = 0;
      break;
      switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.af
 * JD-Core Version:    0.6.0
 */