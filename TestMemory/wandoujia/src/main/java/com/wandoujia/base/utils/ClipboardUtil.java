package com.wandoujia.base.utils;

import android.content.ClipData;
import android.content.Context;
import com.wandoujia.base.config.GlobalConfig;

public class ClipboardUtil
{
  public static void copyText(String paramString)
  {
    if (SystemUtil.aboveApiLevel(11))
    {
      ((android.content.ClipboardManager)GlobalConfig.getAppContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("phoenix", paramString));
      return;
    }
    ((android.text.ClipboardManager)GlobalConfig.getAppContext().getSystemService("clipboard")).setText(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ClipboardUtil
 * JD-Core Version:    0.6.0
 */