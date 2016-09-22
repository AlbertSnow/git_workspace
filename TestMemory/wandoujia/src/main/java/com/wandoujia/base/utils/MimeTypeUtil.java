package com.wandoujia.base.utils;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;

public class MimeTypeUtil
{
  public static String getFileExtensionFromUrl(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      int i = paramString.lastIndexOf('#');
      if (i > 0)
        paramString = paramString.substring(0, i);
      int j = paramString.lastIndexOf('?');
      if (j > 0)
        paramString = paramString.substring(0, j);
      int k = paramString.lastIndexOf('/');
      if (k >= 0)
        paramString = paramString.substring(k + 1);
      if (!paramString.isEmpty())
      {
        int m = paramString.lastIndexOf('.');
        if (m >= 0)
          return paramString.substring(m + 1);
      }
    }
    return "";
  }

  public static String getMimeTypeFromExtension(String paramString)
  {
    return MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.MimeTypeUtil
 * JD-Core Version:    0.6.0
 */