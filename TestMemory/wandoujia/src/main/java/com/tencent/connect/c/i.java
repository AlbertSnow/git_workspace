package com.tencent.connect.c;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import com.tencent.open.a.f;
import com.tencent.open.utils.o;
import java.util.ArrayList;

final class i
  implements Runnable
{
  i(ArrayList paramArrayList, Handler paramHandler)
  {
  }

  public final void run()
  {
    int i = 0;
    if (i < this.a.size())
    {
      String str1 = (String)this.a.get(i);
      Bitmap localBitmap;
      String str2;
      String str4;
      if ((!o.f(str1)) && (o.h(str1)))
      {
        localBitmap = b.a(str1, 10000);
        if (localBitmap != null)
        {
          str2 = Environment.getExternalStorageDirectory() + "/tmp/";
          String str3 = o.e(str1);
          str4 = "share2qzone_temp" + str3 + ".jpg";
          if (b.a(str1, 640, 10000))
            break label154;
          f.b("openSDK_LOG.AsynScaleCompressImage", "not out of bound,not compress!");
        }
      }
      while (true)
      {
        if (str1 != null)
          this.a.set(i, str1);
        i++;
        break;
        label154: f.b("openSDK_LOG.AsynScaleCompressImage", "out of bound, compress!");
        str1 = b.a(localBitmap, str2, str4);
      }
    }
    Message localMessage = this.b.obtainMessage(101);
    Bundle localBundle = new Bundle();
    localBundle.putStringArrayList("images", this.a);
    localMessage.setData(localBundle);
    this.b.sendMessage(localMessage);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.c.i
 * JD-Core Version:    0.6.0
 */