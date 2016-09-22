package com.wandoujia.p4.community.http.c;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Looper;
import com.wandoujia.base.log.Log;
import java.util.Map;

final class b
  implements com.wandoujia.p4.community.http.e.b
{
  b(a parama)
  {
  }

  public final void a(int paramInt)
  {
    Log.d("ugc", "load picture finish " + paramInt + " failed", new Object[0]);
    if (paramInt > 0)
    {
      if (this.a.d != null)
      {
        this.a.d.cancel();
        this.a.d = null;
      }
      new Handler(Looper.getMainLooper()).post(new c(this, paramInt));
      return;
    }
    this.a.a(false, false);
    a.a(this.a);
  }

  public final void a(String paramString)
  {
    Log.d("ugc", "load picture failed errorMsg " + paramString, new Object[0]);
  }

  public final void a(String paramString1, String paramString2)
  {
    Log.d("ugc", "load picture success path " + paramString1 + " storeKey " + paramString2, new Object[0]);
    this.a.f.put(paramString1, paramString2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.c.b
 * JD-Core Version:    0.6.0
 */