package com.squareup.wire;

final class s extends p
{
  private final ByteString a;

  public s(ByteString paramByteString)
  {
    super(WireType.LENGTH_DELIMITED);
    this.a = paramByteString;
  }

  public final int a()
  {
    return WireOutput.varint32Size(this.a.size()) + this.a.size();
  }

  public final void a(int paramInt, WireOutput paramWireOutput)
  {
    paramWireOutput.writeTag(paramInt, WireType.LENGTH_DELIMITED);
    paramWireOutput.writeVarint32(this.a.size());
    paramWireOutput.writeRawBytes(this.a.toByteArray());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.s
 * JD-Core Version:    0.6.0
 */