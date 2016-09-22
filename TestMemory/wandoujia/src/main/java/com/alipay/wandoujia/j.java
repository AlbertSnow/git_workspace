package com.alipay.wandoujia;

final class j
  implements Runnable
{
  j(StringBuilder paramStringBuilder)
  {
  }

  public final void run()
  {
    try
    {
      new k(fa.f, this.a.toString()).b();
      label20: System.exit(0);
      return;
    }
    catch (Exception localException)
    {
      break label20;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.j
 * JD-Core Version:    0.6.0
 */