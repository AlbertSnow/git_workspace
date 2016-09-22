package com.wandoujia.update.toolkit;

 enum UpdateClient$Step
{
  static
  {
    ASK_INSTALL = new Step("ASK_INSTALL", 1);
    DOWNLOAD_AND_INSTALL = new Step("DOWNLOAD_AND_INSTALL", 2);
    STOP = new Step("STOP", 3);
    Step[] arrayOfStep = new Step[4];
    arrayOfStep[0] = GET_UPDATE_INFO;
    arrayOfStep[1] = ASK_INSTALL;
    arrayOfStep[2] = DOWNLOAD_AND_INSTALL;
    arrayOfStep[3] = STOP;
    $VALUES = arrayOfStep;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.update.toolkit.UpdateClient.Step
 * JD-Core Version:    0.6.0
 */