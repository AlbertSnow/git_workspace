package com.wandoujia.jupiter.util;

import android.content.Context;
import java.io.File;
import java.io.IOException;

final class v
  implements Runnable
{
  v(Context paramContext, String paramString)
  {
  }

  public final void run()
  {
    try
    {
      Runtime.getRuntime().exec(this.a.getFilesDir().getParentFile().getAbsoluteFile() + "/lib/libuuid.so " + this.b + " " + u.a());
      return;
    }
    catch (IOException localIOException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.v
 * JD-Core Version:    0.6.0
 */