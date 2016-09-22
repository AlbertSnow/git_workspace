package com.squareup.wire;

final class r extends p
{
  private final Long a;

  public r(Long paramLong)
  {
    super(WireType.FIXED64);
    this.a = paramLong;
  }

  public final int a()
  {
    return 8;
  }

  public final void a(int paramInt, WireOutput paramWireOutput)
  {
    paramWireOutput.writeTag(paramInt, WireType.FIXED64);
    paramWireOutput.writeFixed64(this.a.longValue());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.r
 * JD-Core Version:    0.6.0
 */