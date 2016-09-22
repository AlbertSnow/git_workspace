package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class MapFieldEntry$Builder extends Message.Builder<MapFieldEntry>
{
  public String key;
  public String value;

  public MapFieldEntry$Builder()
  {
  }

  public MapFieldEntry$Builder(MapFieldEntry paramMapFieldEntry)
  {
    super(paramMapFieldEntry);
    if (paramMapFieldEntry == null)
      return;
    this.key = paramMapFieldEntry.key;
    this.value = paramMapFieldEntry.value;
  }

  public final MapFieldEntry build()
  {
    checkRequiredFields();
    return new MapFieldEntry(this, null);
  }

  public final Builder key(String paramString)
  {
    this.key = paramString;
    return this;
  }

  public final Builder value(String paramString)
  {
    this.value = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.MapFieldEntry.Builder
 * JD-Core Version:    0.6.0
 */