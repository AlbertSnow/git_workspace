package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.text.TextUtils;
import android.widget.AbsoluteLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.util.ad;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import com.google.android.gms.appstreaming.AppStreamingState;
import mp;
import mt;
import org.json.JSONException;
import org.json.JSONObject;

final class ba
  implements mt
{
  final Activity a;
  final RelativeLayout b;
  final AbsoluteLayout c;
  mp d;
  String e;
  boolean f = false;
  private final az g;
  private final String h;
  private final b i;
  private String j = null;
  private int k;
  private int l = -1;
  private int m = -1;

  public ba(az paramaz, String paramString, Activity paramActivity, b paramb, RelativeLayout paramRelativeLayout, int paramInt1, int paramInt2)
  {
    this.g = paramaz;
    this.h = paramString;
    this.a = paramActivity;
    this.i = paramb;
    this.b = paramRelativeLayout;
    this.c = new AbsoluteLayout(paramActivity);
    this.c.setId(paramInt1 + 1010);
    this.c.setVisibility(4);
    this.k = paramInt2;
    this.e = "notStarted";
  }

  private final void a(JSONObject paramJSONObject)
  {
    this.i.b("appStreaming", paramJSONObject);
  }

  private final JSONObject b()
  {
    JSONObject localJSONObject = new JSONObject().put("internalSessionId", this.h);
    if (!TextUtils.isEmpty(this.j))
      localJSONObject.put("appStreamingSessionId", this.j);
    localJSONObject.put("action", "stateUpdate");
    return localJSONObject;
  }

  private final void b(AppStreamingState paramAppStreamingState)
  {
    if (paramAppStreamingState != null)
      this.j = paramAppStreamingState.e;
  }

  public final void a()
  {
    this.a.setRequestedOrientation(this.k);
  }

  public final void a(int paramInt)
  {
    String str = this.h;
    c.b(45 + String.valueOf(str).length() + "onStreamingStartFailure: " + str + ". Error: 207");
    try
    {
      a(b().put("event", "sessionFailedToLoad").put("error", 207));
      return;
    }
    catch (JSONException localJSONException)
    {
      c.b("Failed to dispatch event information to creative.", localJSONException);
    }
  }

  public final void a(at paramat)
  {
    String str1 = paramat.n;
    if (TextUtils.isEmpty(str1))
      str1 = "unknown";
    if ("portrait".equals(str1))
    {
      c.b("Changing orientation to portrait");
      this.a.setRequestedOrientation(bc.a().g.b());
      return;
    }
    if ("landscape".equals(str1))
    {
      c.b("Changing orientation to landscape");
      this.a.setRequestedOrientation(bc.a().g.a());
      return;
    }
    String str2 = String.valueOf(str1);
    if (str2.length() != 0);
    for (String str3 = "Orientation is not supported: ".concat(str2); ; str3 = new String("Orientation is not supported: "))
    {
      c.b(str3);
      return;
    }
  }

  public final void a(AppStreamingState paramAppStreamingState)
  {
    if (paramAppStreamingState == null)
      return;
    switch (paramAppStreamingState.c)
    {
    case 5:
    default:
      int n = paramAppStreamingState.c;
      int i1 = paramAppStreamingState.d;
      c.e(76 + "onStreamingStateChanged with currentState= " + n + " errorCode=" + i1);
      return;
    case 2:
      String str11 = String.valueOf(this.h);
      if (str11.length() != 0);
      for (String str12 = "onStreamingStarted: ".concat(str11); ; str12 = new String("onStreamingStarted: "))
      {
        c.b(str12);
        b(paramAppStreamingState);
        this.e = "started";
        try
        {
          a(b().put("event", "sessionStart").put("size", new JSONObject().put("width", this.l).put("height", this.m)));
          return;
        }
        catch (JSONException localJSONException6)
        {
          c.b("Failed to dispatch event information to creative.", localJSONException6);
          return;
        }
      }
    case 3:
      String str9 = String.valueOf(this.h);
      if (str9.length() != 0);
      for (String str10 = "onStreamingPaused: ".concat(str9); ; str10 = new String("onStreamingPaused: "))
      {
        c.b(str10);
        this.e = "paused";
        b(paramAppStreamingState);
        try
        {
          a(b().put("event", "sessionPause"));
          return;
        }
        catch (JSONException localJSONException5)
        {
          c.b("Failed to dispatch event information to creative.", localJSONException5);
          return;
        }
      }
    case 4:
      String str7 = String.valueOf(this.h);
      if (str7.length() != 0);
      for (String str8 = "onStreamingResumed: ".concat(str7); ; str8 = new String("onStreamingResumed: "))
      {
        c.b(str8);
        this.e = "resumed";
        b(paramAppStreamingState);
        try
        {
          a(b().put("event", "sessionResume"));
          return;
        }
        catch (JSONException localJSONException4)
        {
          c.b("Failed to dispatch event information to creative.", localJSONException4);
          return;
        }
      }
    case 6:
      String str5 = String.valueOf(this.h);
      String str6;
      if (str5.length() != 0)
        str6 = "onStreamingStopped: ".concat(str5);
      while (true)
      {
        c.b(str6);
        b(paramAppStreamingState);
        this.e = "stopped";
        try
        {
          a(b().put("event", "sessionStop").put("error", paramAppStreamingState.d));
          a("PAUSE");
          return;
          str6 = new String("onStreamingStopped: ");
        }
        catch (JSONException localJSONException3)
        {
          while (true)
            c.b("Failed to dispatch event information to creative.", localJSONException3);
        }
      }
    case 8:
      String str3 = String.valueOf(this.h);
      if (str3.length() != 0);
      for (String str4 = "onStreamingFailure: ".concat(str3); ; str4 = new String("onStreamingFailure: "))
      {
        c.b(str4);
        this.e = "failure";
        b(paramAppStreamingState);
        try
        {
          a(b().put("event", "sessionFailure").put("error", paramAppStreamingState.d));
          return;
        }
        catch (JSONException localJSONException2)
        {
          c.b("Failed to dispatch event information to creative.", localJSONException2);
          return;
        }
      }
    case 7:
    }
    String str1 = String.valueOf(this.h);
    if (str1.length() != 0);
    for (String str2 = "onUnsupportedFeature: ".concat(str1); ; str2 = new String("onUnsupportedFeature: "))
    {
      c.b(str2);
      b(paramAppStreamingState);
      try
      {
        a(b().put("event", "sessionUnsupportedFeature"));
        return;
      }
      catch (JSONException localJSONException1)
      {
        c.b("Failed to dispatch event information to creative.", localJSONException1);
        return;
      }
    }
  }

  public final void a(String paramString)
  {
    if ((this.d != null) && (this.d.isAdded()))
    {
      c.d("Stopping app streaming.");
      this.b.removeView(this.c);
      this.a.getFragmentManager().beginTransaction().detach(this.d).remove(this.d).commit();
    }
    try
    {
      a(b().put("event", "sessionHalt").put("reason", paramString));
      a();
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        c.b("Failed to dispatch event information to creative.", localJSONException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.ba
 * JD-Core Version:    0.6.0
 */