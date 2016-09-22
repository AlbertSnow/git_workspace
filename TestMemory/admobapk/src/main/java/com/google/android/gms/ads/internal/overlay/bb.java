package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.webview.b;
import mu;

@a
public final class bb
  implements as
{
  public final ar a(Activity paramActivity, b paramb, RelativeLayout paramRelativeLayout)
  {
    return new ay(paramActivity, paramb, paramRelativeLayout);
  }

  public final boolean a(Context paramContext)
  {
    return mu.a(paramContext).a();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.bb
 * JD-Core Version:    0.6.0
 */