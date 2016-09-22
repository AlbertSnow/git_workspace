package com.wandoujia.log.toolkit;

 enum LaunchLogger$LaunchState
{
  static
  {
    LAUNCHED = new LaunchState("LAUNCHED", 1);
    USER_WANNA_CLOSE = new LaunchState("USER_WANNA_CLOSE", 2);
    LaunchState[] arrayOfLaunchState = new LaunchState[3];
    arrayOfLaunchState[0] = NOT_LAUNCH;
    arrayOfLaunchState[1] = LAUNCHED;
    arrayOfLaunchState[2] = USER_WANNA_CLOSE;
    $VALUES = arrayOfLaunchState;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.toolkit.LaunchLogger.LaunchState
 * JD-Core Version:    0.6.0
 */