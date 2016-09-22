package com.alipay.squareup.picasso;

import java.util.concurrent.ThreadFactory;

final class r
  implements ThreadFactory
{
  public final Thread newThread(Runnable paramRunnable)
  {
    return new q(paramRunnable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.r
 * JD-Core Version:    0.6.0
 */