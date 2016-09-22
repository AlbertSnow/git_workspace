package com.alipay.android.app.util;

import com.alipay.wandoujia.t;
import com.alipay.wandoujia.u;

public class NativeUtils
{
  public static native u deserializeResponse(String paramString);

  public static native String getClientKey();

  public static native String serializeRequest(t paramt);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.util.NativeUtils
 * JD-Core Version:    0.6.0
 */