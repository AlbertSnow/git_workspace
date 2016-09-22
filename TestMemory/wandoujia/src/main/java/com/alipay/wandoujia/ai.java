package com.alipay.wandoujia;

public abstract class ai extends ae
{
  private boolean a = false;

  protected ai(t paramt, u paramu)
  {
    super(paramt, paramu);
  }

  public final void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public abstract boolean e();

  public abstract int f();

  public final boolean g()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ai
 * JD-Core Version:    0.6.0
 */