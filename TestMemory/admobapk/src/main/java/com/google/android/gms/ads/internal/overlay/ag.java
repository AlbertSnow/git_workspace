package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.util.ad;
import com.google.android.gms.ads.internal.util.bf;
import com.google.android.gms.ads.internal.util.y;
import java.util.Map;

@com.google.android.gms.ads.internal.report.client.a
final class ag extends com.google.android.gms.ads.internal.util.a
{
  ag(ab paramab)
  {
  }

  public final void a()
  {
    bf localbf = bc.a().u;
    Integer localInteger = Integer.valueOf(this.a.b.q.g);
    Bitmap localBitmap = (Bitmap)localbf.a.get(localInteger);
    if (localBitmap != null)
    {
      Drawable localDrawable = bc.a().g.a(this.a.a, localBitmap, this.a.b.q.e, this.a.b.q.f);
      y.a.post(new ah(this, localDrawable));
    }
  }

  public final void b()
  {
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.ag
 * JD-Core Version:    0.6.0
 */