package com.wandoujia.launcher.launcher.utils;

import android.graphics.Bitmap;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.LibraryLoaderHelper;

public class ImageUtils
{
  static
  {
    try
    {
      LibraryLoaderHelper.loadLibrarySafety(GlobalConfig.getAppContext(), "image");
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
    }
  }

  public static native void functionToBlur(Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public static native void nativeExtractAndOverlay(Bitmap paramBitmap, int paramInt1, int paramInt2);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.utils.ImageUtils
 * JD-Core Version:    0.6.0
 */