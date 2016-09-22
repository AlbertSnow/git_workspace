package com.wandoujia.jupiter.presenter;

import android.text.TextUtils;
import android.widget.ImageView;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;
import java.util.List;

public final class bp extends c
{
  private static boolean a(List<Image> paramList)
  {
    return (CollectionUtils.isEmpty(paramList)) || (TextUtils.isEmpty(((Image)paramList.get(0)).url));
  }

  protected final void a(Model paramModel)
  {
    ImageView localImageView = h().b(2131492889).h();
    new e();
    Image localImage;
    String str;
    label40: boolean bool;
    if (paramModel == null)
    {
      localImage = null;
      if (localImage == null)
        break label162;
      str = localImage.url;
      e.a(localImageView, str, 2130838108);
      if ((localImage == null) || (localImage.has_mask == null))
        break label168;
      bool = localImage.has_mask.booleanValue();
    }
    while (true)
    {
      if (!bool)
        break label198;
      h().b(2131493669).e();
      return;
      if (a(paramModel.w()))
      {
        if ((a(paramModel.v())) || (!TextUtils.isEmpty(paramModel.n())))
        {
          localImage = null;
          break;
        }
        localImage = (Image)paramModel.v().get(0);
        break;
      }
      localImage = (Image)paramModel.w().get(0);
      break;
      label162: str = null;
      break label40;
      label168: if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(bq.b(paramModel))))
      {
        bool = true;
        continue;
      }
      bool = false;
    }
    label198: h().b(2131493669).c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bp
 * JD-Core Version:    0.6.0
 */