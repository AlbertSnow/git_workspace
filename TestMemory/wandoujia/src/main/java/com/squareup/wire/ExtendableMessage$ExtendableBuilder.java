package com.squareup.wire;

public abstract class ExtendableMessage$ExtendableBuilder<T extends ExtendableMessage<?>> extends Message.Builder<T>
{
  f<T> extensionMap;

  protected ExtendableMessage$ExtendableBuilder()
  {
  }

  protected ExtendableMessage$ExtendableBuilder(ExtendableMessage<T> paramExtendableMessage)
  {
    super(paramExtendableMessage);
    if ((paramExtendableMessage != null) && (paramExtendableMessage.extensionMap != null))
      this.extensionMap = new f(paramExtendableMessage.extensionMap);
  }

  public <E> E getExtension(Extension<T, E> paramExtension)
  {
    if (this.extensionMap == null)
      return null;
    return this.extensionMap.a(paramExtension);
  }

  public <E> ExtendableBuilder<T> setExtension(Extension<T, E> paramExtension, E paramE)
  {
    if (this.extensionMap == null)
      this.extensionMap = new f();
    this.extensionMap.a(paramExtension, paramE);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.ExtendableMessage.ExtendableBuilder
 * JD-Core Version:    0.6.0
 */