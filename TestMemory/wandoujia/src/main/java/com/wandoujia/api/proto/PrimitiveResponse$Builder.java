package com.wandoujia.api.proto;

import com.squareup.wire.ByteString;
import com.squareup.wire.Message.Builder;
import java.util.List;

public final class PrimitiveResponse$Builder extends Message.Builder<PrimitiveResponse>
{
  public List<Boolean> boolean_array;
  public List<ByteString> byte_array;
  public List<Double> double_array;
  public List<Long> long_array;
  public List<String> string_array;
  public Long timestamp;

  public PrimitiveResponse$Builder()
  {
  }

  public PrimitiveResponse$Builder(PrimitiveResponse paramPrimitiveResponse)
  {
    super(paramPrimitiveResponse);
    if (paramPrimitiveResponse == null)
      return;
    this.double_array = PrimitiveResponse.access$000(paramPrimitiveResponse.double_array);
    this.long_array = PrimitiveResponse.access$100(paramPrimitiveResponse.long_array);
    this.boolean_array = PrimitiveResponse.access$200(paramPrimitiveResponse.boolean_array);
    this.string_array = PrimitiveResponse.access$300(paramPrimitiveResponse.string_array);
    this.byte_array = PrimitiveResponse.access$400(paramPrimitiveResponse.byte_array);
    this.timestamp = paramPrimitiveResponse.timestamp;
  }

  public final Builder boolean_array(List<Boolean> paramList)
  {
    this.boolean_array = checkForNulls(paramList);
    return this;
  }

  public final PrimitiveResponse build()
  {
    return new PrimitiveResponse(this, null);
  }

  public final Builder byte_array(List<ByteString> paramList)
  {
    this.byte_array = checkForNulls(paramList);
    return this;
  }

  public final Builder double_array(List<Double> paramList)
  {
    this.double_array = checkForNulls(paramList);
    return this;
  }

  public final Builder long_array(List<Long> paramList)
  {
    this.long_array = checkForNulls(paramList);
    return this;
  }

  public final Builder string_array(List<String> paramList)
  {
    this.string_array = checkForNulls(paramList);
    return this;
  }

  public final Builder timestamp(Long paramLong)
  {
    this.timestamp = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.PrimitiveResponse.Builder
 * JD-Core Version:    0.6.0
 */