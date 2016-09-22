package com.wandoujia.jupiter.service;

import android.os.Handler;
import com.wandoujia.jupiter.JupiterApplication;
import java.io.File;
import java.util.List;

final class j
  implements Runnable
{
  j(h paramh)
  {
  }

  public final void run()
  {
    int i = 0;
    if (i < 1000)
    {
      String str = (String)h.a(this.a).get(0);
      h.a(this.a).remove(0);
      h.a(this.a, new File(str));
      if (h.a(this.a).isEmpty())
        JupiterApplication.a().post(new k(this));
    }
    do
    {
      return;
      i++;
      break;
    }
    while (h.a(this.a).isEmpty());
    h.d(this.a).postDelayed(this, 10L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.service.j
 * JD-Core Version:    0.6.0
 */