package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.List;

final class c
  implements f
{
  public final void a()
  {
    monitorenter;
    monitorexit;
  }

  public final void a(g paramg)
  {
    paramg.a(new ArrayList());
  }

  public final void a(String paramString)
  {
    monitorenter;
    try
    {
      a.a(paramString);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void a(List<d> paramList, long paramLong)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.c
 * JD-Core Version:    0.6.0
 */