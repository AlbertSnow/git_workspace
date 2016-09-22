package com.wandoujia.appmanager.log;

public enum LogInfoBuilder$PatchEvent
{
  static
  {
    FAILED_TO_GENERATE_APK_PATH = new PatchEvent("FAILED_TO_GENERATE_APK_PATH", 1);
    FAILED_TO_GET_APK_INFO = new PatchEvent("FAILED_TO_GET_APK_INFO", 2);
    FAILED_TO_DECODE_PATCH = new PatchEvent("FAILED_TO_DECODE_PATCH", 3);
    FAILED_OTHER_REASONS = new PatchEvent("FAILED_OTHER_REASONS", 4);
    SUCCESS = new PatchEvent("SUCCESS", 5);
    PatchEvent[] arrayOfPatchEvent = new PatchEvent[6];
    arrayOfPatchEvent[0] = STARTED;
    arrayOfPatchEvent[1] = FAILED_TO_GENERATE_APK_PATH;
    arrayOfPatchEvent[2] = FAILED_TO_GET_APK_INFO;
    arrayOfPatchEvent[3] = FAILED_TO_DECODE_PATCH;
    arrayOfPatchEvent[4] = FAILED_OTHER_REASONS;
    arrayOfPatchEvent[5] = SUCCESS;
    $VALUES = arrayOfPatchEvent;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.log.LogInfoBuilder.PatchEvent
 * JD-Core Version:    0.6.0
 */