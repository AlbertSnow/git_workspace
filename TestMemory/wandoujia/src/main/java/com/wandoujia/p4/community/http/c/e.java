package com.wandoujia.p4.community.http.c;

import android.app.ProgressDialog;
import com.wandoujia.jupiter.view.p;

final class e
  implements Runnable
{
  e(a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public final void run()
  {
    if ((this.a) && (this.c.d != null))
    {
      this.c.d.cancel();
      this.c.d = null;
    }
    if ((this.b) && (this.c.e != null))
    {
      p.a(this.c.a, this.c.b, p.b).a();
      this.c.e.b();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.c.e
 * JD-Core Version:    0.6.0
 */