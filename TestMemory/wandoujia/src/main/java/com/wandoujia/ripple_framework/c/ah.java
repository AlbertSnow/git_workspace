package com.wandoujia.ripple_framework.c;

import android.text.TextUtils;
import android.widget.ImageView;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;
import java.util.List;

public final class ah extends c
{
  private e a;
  private final int g;

  public ah()
  {
    this.g = R.color.bg_default;
  }

  public ah(byte paramByte)
  {
    this.g = R.color.bg_default;
  }

  public ah(char paramChar)
  {
    this.g = 2130838108;
  }

  protected final void a(Model paramModel)
  {
    if (this.a == null)
      this.a = new e(0);
    ImageView localImageView = (ImageView)e();
    if ((paramModel == null) || (CollectionUtils.isEmpty(paramModel.w())) || (TextUtils.isEmpty(((Image)paramModel.w().get(0)).url)))
    {
      e.a(localImageView, null, this.g);
      return;
    }
    e.a(localImageView, ((Image)paramModel.w().get(0)).url, this.g);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.ah
 * JD-Core Version:    0.6.0
 */