package com.wandoujia.api.proto;

import com.squareup.wire.ByteString;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PrimitiveResponse extends Message
{
  public static final List<Boolean> DEFAULT_BOOLEAN_ARRAY;
  public static final List<ByteString> DEFAULT_BYTE_ARRAY;
  public static final List<Double> DEFAULT_DOUBLE_ARRAY = Collections.emptyList();
  public static final List<Long> DEFAULT_LONG_ARRAY = Collections.emptyList();
  public static final List<String> DEFAULT_STRING_ARRAY;
  public static final Long DEFAULT_TIMESTAMP;

  @ProtoField(label=Message.Label.REPEATED, tag=3, type=Message.Datatype.BOOL)
  public final List<Boolean> boolean_array;

  @ProtoField(label=Message.Label.REPEATED, tag=5, type=Message.Datatype.BYTES)
  public final List<ByteString> byte_array;

  @ProtoField(label=Message.Label.REPEATED, tag=1, type=Message.Datatype.DOUBLE)
  public final List<Double> double_array;

  @ProtoField(label=Message.Label.REPEATED, tag=2, type=Message.Datatype.INT64)
  public final List<Long> long_array;

  @ProtoField(label=Message.Label.REPEATED, tag=4, type=Message.Datatype.STRING)
  public final List<String> string_array;

  @ProtoField(tag=6, type=Message.Datatype.INT64)
  public final Long timestamp;

  static
  {
    DEFAULT_BOOLEAN_ARRAY = Collections.emptyList();
    DEFAULT_STRING_ARRAY = Collections.emptyList();
    DEFAULT_BYTE_ARRAY = Collections.emptyList();
    DEFAULT_TIMESTAMP = Long.valueOf(0L);
  }

  private PrimitiveResponse(PrimitiveResponse.Builder paramBuilder)
  {
    super(paramBuilder);
    this.double_array = immutableCopyOf(paramBuilder.double_array);
    this.long_array = immutableCopyOf(paramBuilder.long_array);
    this.boolean_array = immutableCopyOf(paramBuilder.boolean_array);
    this.string_array = immutableCopyOf(paramBuilder.string_array);
    this.byte_array = immutableCopyOf(paramBuilder.byte_array);
    this.timestamp = paramBuilder.timestamp;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    PrimitiveResponse localPrimitiveResponse;
    do
    {
      return true;
      if (!(paramObject instanceof PrimitiveResponse))
        return false;
      localPrimitiveResponse = (PrimitiveResponse)paramObject;
    }
    while ((equals(this.double_array, localPrimitiveResponse.double_array)) && (equals(this.long_array, localPrimitiveResponse.long_array)) && (equals(this.boolean_array, localPrimitiveResponse.boolean_array)) && (equals(this.string_array, localPrimitiveResponse.string_array)) && (equals(this.byte_array, localPrimitiveResponse.byte_array)) && (equals(this.timestamp, localPrimitiveResponse.timestamp)));
    return false;
  }

  public final int hashCode()
  {
    int i = 1;
    int j = this.hashCode;
    int k;
    int n;
    label52: int i2;
    label80: int i4;
    label108: int i6;
    if (j == 0)
    {
      if (this.double_array == null)
        break label173;
      k = this.double_array.hashCode();
      int m = k * 37;
      if (this.long_array == null)
        break label178;
      n = this.long_array.hashCode();
      int i1 = 37 * (n + m);
      if (this.boolean_array == null)
        break label184;
      i2 = this.boolean_array.hashCode();
      int i3 = 37 * (i2 + i1);
      if (this.string_array == null)
        break label190;
      i4 = this.string_array.hashCode();
      int i5 = 37 * (i4 + i3);
      if (this.byte_array != null)
        i = this.byte_array.hashCode();
      i6 = 37 * (i5 + i);
      if (this.timestamp == null)
        break label196;
    }
    label173: label178: label184: label190: label196: for (int i7 = this.timestamp.hashCode(); ; i7 = 0)
    {
      j = i7 + i6;
      this.hashCode = j;
      return j;
      k = i;
      break;
      n = i;
      break label52;
      i2 = i;
      break label80;
      i4 = i;
      break label108;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.PrimitiveResponse
 * JD-Core Version:    0.6.0
 */