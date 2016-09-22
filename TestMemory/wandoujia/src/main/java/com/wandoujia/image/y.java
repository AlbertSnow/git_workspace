package com.wandoujia.image;

import android.graphics.Bitmap;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.p;
import com.android.volley.toolbox.q;

final class y
  implements q
{
  y(x paramx)
  {
  }

  public final void a(p paramp, boolean paramBoolean)
  {
    if (paramp == null);
    for (Bitmap localBitmap = null; (localBitmap == null) && (paramBoolean); localBitmap = paramp.b())
      return;
    this.a.d.a(localBitmap);
  }

  public final void onErrorResponse(VolleyError paramVolleyError)
  {
    this.a.d.a(null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.y
 * JD-Core Version:    0.6.0
 */