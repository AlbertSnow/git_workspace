package com.wandoujia.image.a;

import android.os.FileObserver;
import java.io.File;
import java.util.Set;

final class b extends FileObserver
{
  b(a parama, String paramString)
  {
    super(paramString);
  }

  public final void onEvent(int paramInt, String paramString)
  {
    if ((paramInt & 0x8) != 0)
      synchronized (this.a)
      {
        if (!a.a(this.a).contains(paramString))
        {
          File localFile = new File(a.b(this.a), paramString);
          a.a(this.a, localFile);
        }
        return;
      }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.a.b
 * JD-Core Version:    0.6.0
 */