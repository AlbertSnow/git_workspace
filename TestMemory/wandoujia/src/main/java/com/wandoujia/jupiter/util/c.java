package com.wandoujia.jupiter.util;

import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.ReceiverMonitor.AppActionType;
import com.wandoujia.ripple_framework.l;
import java.util.List;

final class c
  implements l
{
  public final void a(ReceiverMonitor.AppActionType paramAppActionType, List<String> paramList)
  {
    if (paramAppActionType == ReceiverMonitor.AppActionType.ADDED)
      Config.x();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.c
 * JD-Core Version:    0.6.0
 */