package com.squareup.wire;

final class t extends p
{
  private final Long a;

  public t(Long paramLong)
  {
    super(WireType.VARINT);
    this.a = paramLong;
  }

  public final int a()
  {
    return WireOutput.varint64Size(this.a.longValue());
  }

  public final void a(int paramInt, WireOutput paramWireOutput)
  {
    paramWireOutput.writeTag(paramInt, WireType.VARINT);
    paramWireOutput.writeVarint64(this.a.longValue());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.t
 * JD-Core Version:    0.6.0
 */