package com.wandoujia.p4.pay.model;

import java.util.Comparator;

final class PayChannel$1
  implements Comparator<String>
{
  public final int compare(String paramString1, String paramString2)
  {
    if (this.val$response.indexOf(paramString1) > this.val$response.indexOf(paramString2))
      return 1;
    return -1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.PayChannel.1
 * JD-Core Version:    0.6.0
 */