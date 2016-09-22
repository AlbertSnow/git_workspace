package com.wandoujia.p4.community.http.c;

import android.app.ProgressDialog;
import android.text.TextUtils;
import com.wandoujia.jupiter.view.p;

final class d
  implements Runnable
{
  d(a parama, String paramString)
  {
  }

  public final void run()
  {
    if (this.b.d != null)
    {
      this.b.d.cancel();
      this.b.d = null;
    }
    if (TextUtils.isEmpty(this.a))
      p.a(this.b.a, this.b.c, p.b).a();
    while (true)
    {
      if (this.b.e != null)
        this.b.e.a();
      return;
      p.a(this.b.a, this.a, p.b).a();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.c.d
 * JD-Core Version:    0.6.0
 */