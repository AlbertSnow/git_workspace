package com.wandoujia.p4.jni;

import android.content.Context;
import com.wandoujia.base.utils.LibraryLoaderHelper;

public class NativeDiffDecoder
{
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    LibraryLoaderHelper.loadLibrarySafety(paramContext, "DiffDecoder");
    decodeNative(paramString1, paramString2, paramString3);
  }

  private static native void decodeNative(String paramString1, String paramString2, String paramString3);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.jni.NativeDiffDecoder
 * JD-Core Version:    0.6.0
 */