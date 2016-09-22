package com.wandoujia.gson;

import java.lang.reflect.Field;

 enum FieldNamingPolicy$5
{
  public final String translateName(Field paramField)
  {
    return FieldNamingPolicy.access$200(paramField.getName(), "-").toLowerCase();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.FieldNamingPolicy.5
 * JD-Core Version:    0.6.0
 */