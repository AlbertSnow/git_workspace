package com.tencent.connect.c;

import android.graphics.Bitmap;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import com.tencent.open.a.f;
import com.tencent.open.utils.o;

final class g
  implements Runnable
{
  g(String paramString, Handler paramHandler)
  {
  }

  public final void run()
  {
    Bitmap localBitmap = b.a(this.a, 140);
    if (localBitmap != null)
    {
      String str1 = Environment.getExternalStorageDirectory() + "/tmp/";
      String str2 = o.e(this.a);
      String str3 = "share2qq_temp" + str2 + ".jpg";
      if (!b.a(this.a, 140, 140))
        f.b("openSDK_LOG.AsynScaleCompressImage", "not out of bound,not compress!");
      for (String str4 = this.a; ; str4 = b.a(localBitmap, str1, str3))
      {
        f.b("openSDK_LOG.AsynScaleCompressImage", "-->destFilePath: " + str4);
        if (str4 == null)
          break;
        Message localMessage2 = this.b.obtainMessage(101);
        localMessage2.obj = str4;
        this.b.sendMessage(localMessage2);
        return;
        f.b("openSDK_LOG.AsynScaleCompressImage", "out of bound,compress!");
      }
    }
    Message localMessage1 = this.b.obtainMessage(102);
    localMessage1.arg1 = 3;
    this.b.sendMessage(localMessage1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.c.g
 * JD-Core Version:    0.6.0
 */