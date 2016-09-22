package com.wandoujia.shared_storage;

import android.text.TextUtils;
import java.util.HashMap;

final class k
  implements Runnable
{
  k(e parame, String paramString)
  {
  }

  public final void run()
  {
    if (!TextUtils.isEmpty(this.a))
    {
      if (!e.a(this.b).containsKey(this.a))
        return;
      e.a(this.b).remove(this.a);
    }
    new l(this).start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.shared_storage.k
 * JD-Core Version:    0.6.0
 */