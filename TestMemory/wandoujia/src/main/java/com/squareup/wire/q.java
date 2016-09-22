package com.squareup.wire;

final class q extends p
{
  private final Integer a;

  public q(Integer paramInteger)
  {
    super(WireType.FIXED32);
    this.a = paramInteger;
  }

  public final int a()
  {
    return 4;
  }

  public final void a(int paramInt, WireOutput paramWireOutput)
  {
    paramWireOutput.writeTag(paramInt, WireType.FIXED32);
    paramWireOutput.writeFixed32(this.a.intValue());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.q
 * JD-Core Version:    0.6.0
 */