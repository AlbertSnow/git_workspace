package com.wandoujia.accessibility.content_provider;

public enum AccessibilityContentProvider$Type
{
  static
  {
    INSERT = new Type("INSERT", 2);
    UPDATE = new Type("UPDATE", 3);
    Type[] arrayOfType = new Type[4];
    arrayOfType[0] = DELETE;
    arrayOfType[1] = QUERY;
    arrayOfType[2] = INSERT;
    arrayOfType[3] = UPDATE;
    $VALUES = arrayOfType;
  }

  public final String getTypeName()
  {
    return name().toLowerCase();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.content_provider.AccessibilityContentProvider.Type
 * JD-Core Version:    0.6.0
 */