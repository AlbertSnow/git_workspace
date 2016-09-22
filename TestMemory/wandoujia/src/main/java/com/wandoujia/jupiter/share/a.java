package com.wandoujia.jupiter.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.wandoujia.image.ae;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.ripple_framework.model.Model;

final class a
  implements ae
{
  a(Context paramContext, SharePlatformEnum paramSharePlatformEnum, Model paramModel, ShareUtil.ShareContentType paramShareContentType, ShareInfo paramShareInfo)
  {
  }

  public final void a(Bitmap paramBitmap, boolean paramBoolean)
  {
    JupiterApplication.a().post(new b(this, paramBitmap));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.share.a
 * JD-Core Version:    0.6.0
 */