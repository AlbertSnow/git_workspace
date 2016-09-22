package com.wandoujia.ripple_framework.video;

final class c
{
  ViewFocusManager.STATE a;
  private int b;

  c(ViewFocusManager.STATE paramSTATE)
  {
    this(paramSTATE, 0);
  }

  c(ViewFocusManager.STATE paramSTATE, int paramInt)
  {
    a(paramSTATE, paramInt);
  }

  final void a(ViewFocusManager.STATE paramSTATE, int paramInt)
  {
    this.a = paramSTATE;
    this.b = paramInt;
  }

  final boolean a(c paramc)
  {
    if (paramc == null);
    do
      while (true)
      {
        return true;
        if (ViewFocusManager.STATE.access$000(this.a) < ViewFocusManager.STATE.access$000(paramc.a))
          continue;
        if (ViewFocusManager.STATE.access$000(this.a) > ViewFocusManager.STATE.access$000(paramc.a))
          return false;
        if ((this.b >= ViewFocusManager.e()) && (paramc.b >= ViewFocusManager.e()))
          break;
        if (this.b < paramc.b)
          return false;
      }
    while (this.b < paramc.b);
    return false;
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.a.name();
    arrayOfObject[1] = Integer.valueOf(this.b);
    return String.format("%s: [%d]", arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.video.c
 * JD-Core Version:    0.6.0
 */