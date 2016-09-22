package com.wandoujia.net;

import com.wandoujia.net.b.b;
import java.io.File;

final class e
  implements Runnable
{
  e(a parama, String paramString)
  {
  }

  public final void run()
  {
    new File(a.b(this.a)).delete();
    a.c(this.b).a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.e
 * JD-Core Version:    0.6.0
 */