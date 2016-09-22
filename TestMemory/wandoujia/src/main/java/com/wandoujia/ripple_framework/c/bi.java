package com.wandoujia.ripple_framework.c;

import android.widget.ImageView;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public class bi extends c
{
  private static final String a = bi.class.getSimpleName();

  protected final void a(Model paramModel)
  {
    Log.d(a, paramModel.n(), new Object[0]);
    if (!CollectionUtils.isEmpty(paramModel.x()))
    {
      h().e();
      ImageView localImageView = h().h();
      Image localImage = (Image)paramModel.x().get(0);
      float f = 1.333F;
      if ((localImage != null) && (localImage.width != null) && (localImage.height != null) && (localImage.width.intValue() != 0))
      {
        f = Math.max(1.0F, Math.min(2.0F, localImage.width.intValue() / localImage.height.intValue()));
        String str = a;
        Object[] arrayOfObject = new Object[5];
        arrayOfObject[0] = localImage.width;
        arrayOfObject[1] = localImage.height;
        arrayOfObject[2] = Float.valueOf(f);
        arrayOfObject[3] = Integer.valueOf(localImageView.getWidth());
        arrayOfObject[4] = Integer.valueOf(localImageView.getHeight());
        Log.d(str, "image width=%s height=%s ratio=%s | view width=%s height=%s", arrayOfObject);
      }
      localImageView.post(new bj(localImageView, f, localImage));
      return;
    }
    h().c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bi
 * JD-Core Version:    0.6.0
 */