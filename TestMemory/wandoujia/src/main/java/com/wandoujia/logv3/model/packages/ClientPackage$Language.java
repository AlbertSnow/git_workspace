package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum ClientPackage$Language
  implements ProtoEnum
{
  private final int value;

  static
  {
    ENGLISH = new Language("ENGLISH", 1, 1);
    THAI = new Language("THAI", 2, 2);
    Language[] arrayOfLanguage = new Language[3];
    arrayOfLanguage[0] = SIMPLE_CHINESE;
    arrayOfLanguage[1] = ENGLISH;
    arrayOfLanguage[2] = THAI;
    $VALUES = arrayOfLanguage;
  }

  private ClientPackage$Language(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ClientPackage.Language
 * JD-Core Version:    0.6.0
 */