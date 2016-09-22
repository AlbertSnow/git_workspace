package com.wandoujia.p4.utils;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;

public final class j
{
  private static final String a = Environment.getExternalStorageDirectory().getAbsolutePath().toLowerCase();
  private static final String[] b = { "/pictures/screenshots", "/dcim/screenshots", "/screencapture", "/camera/screenshots", "/photo/screenshots", "/截屏图片", "/qq_screenshot" };
  private static String[] c;

  static
  {
    new String[] { "SCREENSHOTS", "SCREENSHOTS", "SCREENSHOTS", "SCREENSHOTS", "SCREENSHOTS", "SCREENSHOTS", "QQ_SCREENSHOTS" };
    c = new String[] { "/dcim/", "/camera/", "/pictures/camera/", "/images/", "/我的相机/", "/wandoujia/capture/", "/pictures/instagram/", "/path/", "/linecamera/", "/mtxx/", "/photowonder/", "/puddingcamera/", "/tuding/", "/cymera/", "/paper pictures/", "/retrocamera/", "/jiepang/", "/我的照片/", "/pictures/papa/", "/tencent/micromsg/camera/", "/myxj/", "/photo/" };
    new String[] { "DCIM", "CAMERA", "PICTURES_CAMERA", "IMAGES", "MY_CAMERA", "WANDOUJIA_CAPTURE", "INSTAGRAM", "PATH", "LINE", "MTXX", "PHTOWONDER", "PUDDING", "TUDING", "CYMERA", "PAPER", "RETRO", "JIEPANG", "MY_PHOTO", "PAPA", "WEIXIN", "MYXJ", "PHOTO" };
  }

  private static int a(String paramString, String[] paramArrayOfString)
  {
    int i;
    if ((TextUtils.isEmpty(paramString)) || (paramArrayOfString == null))
      i = -1;
    label90: 
    while (true)
    {
      return i;
      String str1 = paramString.toLowerCase();
      i = 0;
      if (i >= paramArrayOfString.length)
        break;
      StringBuilder localStringBuilder = new StringBuilder();
      if (paramString.toLowerCase().startsWith(a));
      for (String str2 = a; ; str2 = "")
      {
        if (str1.indexOf(str2 + paramArrayOfString[i]) != -1)
          break label90;
        i++;
        break;
      }
    }
    return -1;
  }

  public static boolean a(String paramString)
  {
    int i;
    if (a(paramString, b) != -1)
    {
      i = 1;
      if (i == 0)
        break label24;
    }
    label24: 
    do
    {
      return true;
      i = 0;
      break;
    }
    while (a(paramString, c) != -1);
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.j
 * JD-Core Version:    0.6.0
 */