package com.wandoujia.p4.utils;

import android.content.Context;
import com.wandoujia.jupiter.JupiterApplication;

public enum ShortcutUtil$DeprecatedShortCut
{
  private String data;
  private String title;

  static
  {
    CLEAN = new DeprecatedShortCut("CLEAN", 2, 2131625522, "shortcut://clean");
    EBOOK = new DeprecatedShortCut("EBOOK", 3, 2131624694, "shortcut://ebook");
    MUSIC = new DeprecatedShortCut("MUSIC", 4, 2131625597, "shortcut://music");
    DeprecatedShortCut[] arrayOfDeprecatedShortCut = new DeprecatedShortCut[5];
    arrayOfDeprecatedShortCut[0] = VIDEO;
    arrayOfDeprecatedShortCut[1] = WALLPAPER;
    arrayOfDeprecatedShortCut[2] = CLEAN;
    arrayOfDeprecatedShortCut[3] = EBOOK;
    arrayOfDeprecatedShortCut[4] = MUSIC;
    $VALUES = arrayOfDeprecatedShortCut;
  }

  private ShortcutUtil$DeprecatedShortCut(int paramInt, String paramString)
  {
    this.title = JupiterApplication.e().getString(paramInt);
    this.data = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.ShortcutUtil.DeprecatedShortCut
 * JD-Core Version:    0.6.0
 */