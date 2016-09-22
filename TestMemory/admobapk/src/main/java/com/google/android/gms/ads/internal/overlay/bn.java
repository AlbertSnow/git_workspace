package com.google.android.gms.ads.internal.overlay;

import android.os.Handler;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.y;

@a
public final class bn
  implements Runnable
{
  public boolean a = false;
  private ao b;

  bn(ao paramao)
  {
    this.b = paramao;
  }

  public final void a()
  {
    y.a.postDelayed(this, 250L);
  }

  public final void run()
  {
    if (!this.a)
    {
      ao localao = this.b;
      if (localao.c != null)
      {
        long l = localao.c.j();
        if ((localao.e != l) && (l > 0L))
        {
          if (localao.h())
            localao.a.removeView(localao.d);
          float f = (float)l / 1000.0F;
          String[] arrayOfString = new String[2];
          arrayOfString[0] = "time";
          arrayOfString[1] = String.valueOf(f);
          localao.a("timeupdate", arrayOfString);
          localao.e = l;
        }
      }
      a();
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.bn
 * JD-Core Version:    0.6.0
 */