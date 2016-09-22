package com.squareup.wire;

import java.util.Comparator;

public enum Message$Label
{
  public static final Comparator<Label> ORDER_BY_NAME;
  private final int value;

  static
  {
    OPTIONAL = new Label("OPTIONAL", 1, 64);
    REPEATED = new Label("REPEATED", 2, 128);
    PACKED = new Label("PACKED", 3, 256);
    Label[] arrayOfLabel = new Label[4];
    arrayOfLabel[0] = REQUIRED;
    arrayOfLabel[1] = OPTIONAL;
    arrayOfLabel[2] = REPEATED;
    arrayOfLabel[3] = PACKED;
    $VALUES = arrayOfLabel;
    ORDER_BY_NAME = new i();
  }

  private Message$Label(int paramInt)
  {
    this.value = paramInt;
  }

  public final boolean isPacked()
  {
    return this == PACKED;
  }

  public final boolean isRepeated()
  {
    return (this == REPEATED) || (this == PACKED);
  }

  public final int value()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.Message.Label
 * JD-Core Version:    0.6.0
 */