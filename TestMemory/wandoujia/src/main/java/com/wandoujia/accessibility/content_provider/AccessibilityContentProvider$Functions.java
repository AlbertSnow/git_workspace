package com.wandoujia.accessibility.content_provider;

public enum AccessibilityContentProvider$Functions
{
  private Class cls;

  static
  {
    Functions[] arrayOfFunctions = new Functions[2];
    arrayOfFunctions[0] = AUTO_INSTALL;
    arrayOfFunctions[1] = HIBERNATION;
    $VALUES = arrayOfFunctions;
  }

  private AccessibilityContentProvider$Functions(Class paramClass)
  {
    this.cls = paramClass;
  }

  public final Class getCls()
  {
    return this.cls;
  }

  public final String getFunctionName()
  {
    return name().toLowerCase();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.content_provider.AccessibilityContentProvider.Functions
 * JD-Core Version:    0.6.0
 */