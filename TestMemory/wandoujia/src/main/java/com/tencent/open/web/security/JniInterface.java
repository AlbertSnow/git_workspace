package com.tencent.open.web.security;

public class JniInterface
{
  public static native boolean BackSpaceChar(boolean paramBoolean, int paramInt);

  public static native boolean clearAllPWD();

  public static native String getPWDKeyToMD5(String paramString);

  public static native boolean insetTextToArray(int paramInt1, String paramString, int paramInt2);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.web.security.JniInterface
 * JD-Core Version:    0.6.0
 */