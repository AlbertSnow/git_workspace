package com.tencent.open.utils;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.tencent.open.a.f;
import java.io.File;

final class c
  implements Runnable
{
  c(a parama)
  {
  }

  public final void run()
  {
    f.a("AsynLoadImg", "saveFileRunnable:");
    String str1 = o.e(a.b(this.a));
    String str2 = "share_qq_" + str1 + ".jpg";
    String str3 = a.a() + str2;
    File localFile = new File(str3);
    Message localMessage = a.c(this.a).obtainMessage();
    if (localFile.exists())
    {
      localMessage.arg1 = 0;
      localMessage.obj = str3;
      f.a("AsynLoadImg", "file exists: time:" + (System.currentTimeMillis() - a.d(this.a)));
      a.c(this.a).sendMessage(localMessage);
      return;
    }
    Bitmap localBitmap = a.a(a.b(this.a));
    boolean bool;
    if (localBitmap != null)
    {
      bool = a.a(localBitmap, str2);
      label173: if (!bool)
        break label237;
      localMessage.arg1 = 0;
      localMessage.obj = str3;
    }
    while (true)
    {
      f.a("AsynLoadImg", "file not exists: download time:" + (System.currentTimeMillis() - a.d(this.a)));
      break;
      f.a("AsynLoadImg", "saveFileRunnable:get bmp fail---");
      bool = false;
      break label173;
      label237: localMessage.arg1 = 1;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.utils.c
 * JD-Core Version:    0.6.0
 */