package com.google.android.gms.ads.internal.renderer;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.view.View.MeasureSpec;
import android.webkit.WebView;

public final class d extends AsyncTask
{
  private final WebView a;
  private Bitmap b;

  public d(c paramc, WebView paramWebView)
  {
    this.a = paramWebView;
  }

  private Boolean a()
  {
    monitorenter;
    while (true)
    {
      int k;
      int n;
      try
      {
        int i = this.b.getWidth();
        int j = this.b.getHeight();
        if ((i != 0) && (j != 0))
          continue;
        Boolean localBoolean1 = Boolean.valueOf(false);
        Object localObject2 = localBoolean1;
        return localObject2;
        k = 0;
        int m = 0;
        if (k >= i)
          continue;
        n = 0;
        if (n >= j)
          break label135;
        if (this.b.getPixel(k, n) != 0)
        {
          m++;
          break label129;
          if (m / (i * j / 100.0D) <= 0.1D)
            continue;
          boolean bool = true;
          Boolean localBoolean2 = Boolean.valueOf(bool);
          localObject2 = localBoolean2;
          continue;
          bool = false;
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      label129: n += 10;
      continue;
      label135: k += 10;
    }
  }

  protected final void onPreExecute()
  {
    monitorenter;
    try
    {
      this.b = Bitmap.createBitmap(this.c.h, this.c.g, Bitmap.Config.ARGB_8888);
      this.a.setVisibility(0);
      this.a.measure(View.MeasureSpec.makeMeasureSpec(this.c.h, 0), View.MeasureSpec.makeMeasureSpec(this.c.g, 0));
      this.a.layout(0, 0, this.c.h, this.c.g);
      Canvas localCanvas = new Canvas(this.b);
      this.a.draw(localCanvas);
      this.a.invalidate();
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.d
 * JD-Core Version:    0.6.0
 */