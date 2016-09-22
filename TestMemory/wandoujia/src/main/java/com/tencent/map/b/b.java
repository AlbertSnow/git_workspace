package com.tencent.map.b;

import android.net.wifi.ScanResult;
import java.util.ArrayList;
import java.util.List;

public final class b
  implements Cloneable
{
  private List<ScanResult> a = null;

  public b(long paramLong)
  {
  }

  public final Object clone()
  {
    try
    {
      localb = (b)super.clone();
      if (this.a != null)
      {
        localb.a = new ArrayList();
        localb.a.addAll(this.a);
      }
      return localb;
    }
    catch (Exception localException)
    {
      while (true)
        b localb = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.map.b.b
 * JD-Core Version:    0.6.0
 */