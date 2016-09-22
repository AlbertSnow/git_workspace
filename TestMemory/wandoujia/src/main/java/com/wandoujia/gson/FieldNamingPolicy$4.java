package com.wandoujia.gson;

import java.lang.reflect.Field;

 enum FieldNamingPolicy$4
{
  public final String translateName(Field paramField)
  {
    return FieldNamingPolicy.access$200(paramField.getName(), "_").toLowerCase();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.FieldNamingPolicy.4
 * JD-Core Version:    0.6.0
 */