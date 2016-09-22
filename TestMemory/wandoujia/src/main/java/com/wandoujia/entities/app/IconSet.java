package com.wandoujia.entities.app;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.entities.R.dimen;
import java.io.Serializable;

public class IconSet
  implements Serializable
{
  private static float iconSize = -1.0F;
  private String px100;
  private String px24;
  private String px256;
  private String px36;
  private String px48;
  private String px68;
  private String px78;

  public String getSuitableIconUrl()
  {
    if (iconSize < 0.0F)
      iconSize = GlobalConfig.getAppContext().getResources().getDimension(R.dimen.homepage_cover_panel_item_width);
    String str = this.px256;
    if (iconSize > 256.0F);
    do
      while (true)
      {
        return str;
        if (!TextUtils.isEmpty(this.px100))
        {
          if (iconSize > 100.0F)
            continue;
          str = this.px100;
        }
        if (!TextUtils.isEmpty(this.px78))
        {
          if (iconSize > 78.0F)
            continue;
          str = this.px78;
        }
        if (!TextUtils.isEmpty(this.px68))
        {
          if (iconSize > 68.0F)
            continue;
          str = this.px68;
        }
        if (!TextUtils.isEmpty(this.px48))
        {
          if (iconSize > 48.0F)
            continue;
          str = this.px48;
        }
        if (TextUtils.isEmpty(this.px36))
          break;
        if (iconSize > 36.0F)
          continue;
        str = this.px48;
      }
    while ((TextUtils.isEmpty(this.px24)) || (iconSize > 24.0F));
    return this.px24;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.IconSet
 * JD-Core Version:    0.6.0
 */