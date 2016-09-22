package com.google.android.gms.ads.internal.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class l extends m
  implements t
{
  private final b a;
  private final Context b;
  private final WindowManager c;
  private final com.google.android.gms.ads.internal.common.a d;
  private DisplayMetrics e;
  private float f;
  private int g = -1;
  private int h = -1;
  private int i;
  private int j = -1;
  private int k = -1;
  private int l = -1;
  private int m = -1;

  public l(b paramb, Context paramContext, com.google.android.gms.ads.internal.common.a parama)
  {
    super(paramb);
    this.a = paramb;
    this.b = paramContext;
    this.d = parama;
    this.c = ((WindowManager)paramContext.getSystemService("window"));
  }

  public final void a(int paramInt1, int paramInt2)
  {
    if ((this.b instanceof Activity));
    for (int n = bc.a().e.c((Activity)this.b)[0]; ; n = 0)
    {
      int i1 = paramInt2 - n;
      int i2 = this.l;
      int i3 = this.m;
      try
      {
        JSONObject localJSONObject = new JSONObject().put("x", paramInt1).put("y", i1).put("width", i2).put("height", i3);
        this.s.b("onDefaultPositionReceived", localJSONObject);
        com.google.android.gms.ads.internal.webview.c localc = this.a.l();
        if (localc.n != null)
        {
          d locald = localc.n;
          locald.c = paramInt1;
          locald.d = paramInt2;
        }
        return;
      }
      catch (JSONException localJSONException)
      {
        while (true)
          com.google.android.gms.ads.internal.util.c.b("Error occured while dispatching default position.", localJSONException);
      }
    }
  }

  public final void a(b paramb, Map paramMap)
  {
    this.e = new DisplayMetrics();
    Display localDisplay = this.c.getDefaultDisplay();
    localDisplay.getMetrics(this.e);
    this.f = this.e.density;
    this.i = localDisplay.getRotation();
    this.g = com.google.android.gms.ads.internal.util.client.a.b(this.e, this.e.widthPixels);
    this.h = com.google.android.gms.ads.internal.util.client.a.b(this.e, this.e.heightPixels);
    Activity localActivity = this.a.f();
    if ((localActivity == null) || (localActivity.getWindow() == null))
    {
      this.j = this.g;
      this.k = this.h;
      if (!this.a.k().e)
        break label487;
      this.l = this.g;
    }
    for (this.m = this.h; ; this.m = q.a().a.b(this.b, this.a.getMeasuredHeight()))
    {
      a(this.g, this.h, this.j, this.k, this.f, this.i);
      k localk = new k();
      com.google.android.gms.ads.internal.common.a locala1 = this.d;
      Intent localIntent1 = new Intent("android.intent.action.DIAL");
      localIntent1.setData(Uri.parse("tel:"));
      localk.b = locala1.a(localIntent1);
      com.google.android.gms.ads.internal.common.a locala2 = this.d;
      Intent localIntent2 = new Intent("android.intent.action.VIEW");
      localIntent2.setData(Uri.parse("sms:"));
      localk.a = locala2.a(localIntent2);
      localk.c = this.d.b();
      localk.d = this.d.a();
      localk.e = true;
      j localj = new j(localk);
      this.a.b("onDeviceFeaturesReceived", localj.a());
      int[] arrayOfInt1 = new int[2];
      this.a.getLocationOnScreen(arrayOfInt1);
      a(q.a().a.b(this.b, arrayOfInt1[0]), q.a().a.b(this.b, arrayOfInt1[1]));
      if (com.google.android.gms.ads.internal.util.c.a(2))
        com.google.android.gms.ads.internal.util.c.d("Dispatching Ready Event.");
      b(this.a.o().b);
      return;
      int[] arrayOfInt2 = bc.a().e.a(localActivity);
      this.j = com.google.android.gms.ads.internal.util.client.a.b(this.e, arrayOfInt2[0]);
      this.k = com.google.android.gms.ads.internal.util.client.a.b(this.e, arrayOfInt2[1]);
      break;
      label487: this.a.measure(0, 0);
      this.l = q.a().a.b(this.b, this.a.getMeasuredWidth());
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mraid.l
 * JD-Core Version:    0.6.0
 */