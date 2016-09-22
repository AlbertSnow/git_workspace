package com.wandoujia.gson;

import java.lang.reflect.Field;

 enum FieldNamingPolicy$3
{
  public final String translateName(Field paramField)
  {
    return FieldNamingPolicy.access$100(FieldNamingPolicy.access$200(paramField.getName(), " "));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.FieldNamingPolicy.3
 * JD-Core Version:    0.6.0
 */