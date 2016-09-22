package com.squareup.wire;

import java.util.Collections;
import java.util.List;

public abstract class ExtendableMessage<T extends ExtendableMessage<?>> extends Message
{
  transient f<T> extensionMap;

  protected ExtendableMessage(ExtendableMessage.ExtendableBuilder<T> paramExtendableBuilder)
  {
    super(paramExtendableBuilder);
    if (paramExtendableBuilder.extensionMap != null)
      this.extensionMap = new f(paramExtendableBuilder.extensionMap);
  }

  protected boolean extensionsEqual(ExtendableMessage<T> paramExtendableMessage)
  {
    if (this.extensionMap == null)
      return paramExtendableMessage.extensionMap == null;
    return this.extensionMap.equals(paramExtendableMessage.extensionMap);
  }

  protected int extensionsHashCode()
  {
    if (this.extensionMap == null)
      return 0;
    return this.extensionMap.hashCode();
  }

  String extensionsToString()
  {
    if (this.extensionMap == null)
      return "{}";
    return this.extensionMap.toString();
  }

  public <E> E getExtension(Extension<T, E> paramExtension)
  {
    if (this.extensionMap == null)
      return null;
    return this.extensionMap.a(paramExtension);
  }

  public List<Extension<T, ?>> getExtensions()
  {
    if (this.extensionMap == null)
      return Collections.emptyList();
    return this.extensionMap.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.ExtendableMessage
 * JD-Core Version:    0.6.0
 */