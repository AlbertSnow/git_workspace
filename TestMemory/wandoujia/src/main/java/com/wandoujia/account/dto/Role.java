package com.wandoujia.account.dto;

public enum Role
{
  static
  {
    ROLE_APPDEVELOPER = new Role("ROLE_APPDEVELOPER", 1);
    ROLE_PLUSDEVELOPER = new Role("ROLE_PLUSDEVELOPER", 2);
    ROLE_TRUSTED = new Role("ROLE_TRUSTED", 3);
    ROLE_UNTRUSTED = new Role("ROLE_UNTRUSTED", 4);
    ROLE_ROBOT = new Role("ROLE_ROBOT", 5);
    ROLE_SUBSCRIBER = new Role("ROLE_SUBSCRIBER", 6);
    ROLE_FAVORITE = new Role("ROLE_FAVORITE", 7);
    ROLE_GIFT = new Role("ROLE_GIFT", 8);
    Role[] arrayOfRole = new Role[9];
    arrayOfRole[0] = ROLE_USER;
    arrayOfRole[1] = ROLE_APPDEVELOPER;
    arrayOfRole[2] = ROLE_PLUSDEVELOPER;
    arrayOfRole[3] = ROLE_TRUSTED;
    arrayOfRole[4] = ROLE_UNTRUSTED;
    arrayOfRole[5] = ROLE_ROBOT;
    arrayOfRole[6] = ROLE_SUBSCRIBER;
    arrayOfRole[7] = ROLE_FAVORITE;
    arrayOfRole[8] = ROLE_GIFT;
    $VALUES = arrayOfRole;
  }

  @com.fasterxml.jackson.annotation.JsonCreator
  @org.codehaus.jackson.annotate.JsonCreator
  public static Role forValue(String paramString)
  {
    if (paramString != null)
      for (Role localRole : values())
        if (paramString.equalsIgnoreCase(localRole.name()))
          return localRole;
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.dto.Role
 * JD-Core Version:    0.6.0
 */