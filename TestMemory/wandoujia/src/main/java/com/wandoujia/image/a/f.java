package com.wandoujia.image.a;

import android.graphics.Bitmap;
import android.support.v4.e.e;
import com.android.volley.toolbox.o;
import java.util.Timer;

public final class f
  implements o, c
{
  private e<String, i> a;

  public f(int paramInt)
  {
    this.a = new g(paramInt);
    new Timer().scheduleAtFixedRate(new h(this), 60000L, 60000L);
  }

  public final Bitmap a(String paramString)
  {
    return b(paramString);
  }

  public final void a()
  {
    this.a.a();
  }

  public final void a(String paramString, Bitmap paramBitmap)
  {
    b(paramString, paramBitmap);
  }

  public final Bitmap b(String paramString)
  {
    i locali = (i)this.a.a(paramString);
    if (locali != null)
    {
      i.a(locali, System.currentTimeMillis());
      return i.a(locali);
    }
    return null;
  }

  public final void b(String paramString, Bitmap paramBitmap)
  {
    i locali = new i(0);
    i.a(locali, paramBitmap);
    i.a(locali, System.currentTimeMillis());
    this.a.a(paramString, locali);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.a.f
 * JD-Core Version:    0.6.0
 */