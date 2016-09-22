package com.alipay.a.a;

import com.alipay.test.ui.core.EventObject;
import com.alipay.test.ui.core.IMesssageHandle;

public final class a
  implements IMesssageHandle
{
  private static a a;

  public static a a()
  {
    if (a == null)
      a = new a();
    return a;
  }

  public final void onChangeEvent(EventObject paramEventObject, Object[] paramArrayOfObject)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.a.a.a
 * JD-Core Version:    0.6.0
 */