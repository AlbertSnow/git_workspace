package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Looper;
import com.android.volley.VolleyError;
import com.android.volley.i;
import java.util.HashMap;

public final class j
{
  private final i a;
  private int b = 100;
  private final o c;
  private final HashMap<String, n> d = new HashMap();
  private final HashMap<String, n> e = new HashMap();
  private final Handler f = new Handler(Looper.getMainLooper());
  private Runnable g;

  public j(i parami, o paramo)
  {
    this.a = parami;
    this.c = paramo;
  }

  public static p a(q paramq)
  {
    return null.a(null, paramq, 0, 0);
  }

  private void a(String paramString, n paramn, VolleyError paramVolleyError)
  {
    this.e.put(paramString, paramn);
    if (this.g == null)
    {
      this.g = new m(this, paramVolleyError);
      this.f.postDelayed(this.g, this.b);
    }
  }

  public final p a(String paramString, q paramq, int paramInt1, int paramInt2)
  {
    if (Looper.myLooper() != Looper.getMainLooper())
      throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
    String str = 12 + paramString.length() + "#W" + paramInt1 + "#H" + paramInt2 + paramString;
    Bitmap localBitmap = this.c.a(str);
    if (localBitmap != null)
    {
      p localp1 = new p(this, localBitmap, paramString, null, null);
      paramq.a(localp1, true);
      return localp1;
    }
    p localp2 = new p(this, null, paramString, str, paramq);
    paramq.a(localp2, true);
    n localn = (n)this.d.get(str);
    if (localn != null)
    {
      localn.a(localp2);
      return localp2;
    }
    r localr = new r(paramString, new k(this, str), paramInt1, paramInt2, Bitmap.Config.RGB_565, new l(this, str));
    this.a.a(localr);
    this.d.put(str, new n(localr, localp2));
    return localp2;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.toolbox.j
 * JD-Core Version:    0.6.0
 */