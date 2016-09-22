package com.wandoujia.base.storage;

import java.util.Iterator;
import java.util.List;

final class a
  implements Runnable
{
  a(List paramList, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((StorageManager.OnExternalStorageDirectoryChangedListener)localIterator.next()).onChanged(this.b, this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.storage.a
 * JD-Core Version:    0.6.0
 */