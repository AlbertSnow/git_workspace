package com.squareup.wire;

import java.util.Iterator;
import java.util.List;

public abstract class Message$Builder<T extends Message>
{
  UnknownFieldMap unknownFieldMap;

  public Message$Builder()
  {
  }

  public Message$Builder(Message paramMessage)
  {
    if ((paramMessage != null) && (Message.access$000(paramMessage) != null))
      this.unknownFieldMap = new UnknownFieldMap(Message.access$000(paramMessage));
  }

  protected static <T> List<T> checkForNulls(List<T> paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        if (localIterator.next() != null)
          continue;
        throw new NullPointerException();
      }
    }
    return paramList;
  }

  private UnknownFieldMap ensureUnknownFieldMap()
  {
    if (this.unknownFieldMap == null)
      this.unknownFieldMap = new UnknownFieldMap();
    return this.unknownFieldMap;
  }

  public void addFixed32(int paramInt1, int paramInt2)
  {
    ensureUnknownFieldMap().a(paramInt1, Integer.valueOf(paramInt2));
  }

  public void addFixed64(int paramInt, long paramLong)
  {
    ensureUnknownFieldMap().b(paramInt, Long.valueOf(paramLong));
  }

  public void addLengthDelimited(int paramInt, ByteString paramByteString)
  {
    ensureUnknownFieldMap().a(paramInt, paramByteString);
  }

  public void addVarint(int paramInt, long paramLong)
  {
    ensureUnknownFieldMap().a(paramInt, Long.valueOf(paramLong));
  }

  public abstract T build();

  public void checkRequiredFields()
  {
    Message.access$100().builderAdapter(getClass()).a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.Message.Builder
 * JD-Core Version:    0.6.0
 */