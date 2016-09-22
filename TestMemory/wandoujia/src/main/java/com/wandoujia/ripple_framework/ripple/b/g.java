package com.wandoujia.ripple_framework.ripple.b;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.wandoujia.api.proto.Image;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.api.proto.Video;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;
import java.util.List;

final class g
  implements Runnable
{
  g(f paramf, Model paramModel)
  {
  }

  public final void run()
  {
    int i = (int)this.b.f().getResources().getDimension(R.dimen.single_pic_grande_max_height);
    if (this.a.g() == TemplateTypeEnum.TemplateType.SINGLE_PIC_VENTI);
    for (int j = (int)this.b.f().getResources().getDimension(R.dimen.single_pic_venti_max_height); ; j = i)
    {
      int k = (int)this.b.f().getResources().getDimension(R.dimen.single_pic_grande_default_height);
      Image localImage;
      if (!CollectionUtils.isEmpty(this.a.x()))
      {
        localImage = (Image)this.a.x().get(0);
        if ((localImage == null) || (localImage.width == null) || (localImage.height == null) || (localImage.width.intValue() == 0));
      }
      for (int m = this.b.h().b(R.id.cover).a().getWidth() * localImage.height.intValue() / localImage.width.intValue(); ; m = k)
      {
        ViewGroup.LayoutParams localLayoutParams = this.b.e().getLayoutParams();
        localLayoutParams.height = Math.min(m, j);
        this.b.e().setLayoutParams(localLayoutParams);
        this.b.h().b(R.id.duration).d();
        if (!CollectionUtils.isEmpty(this.a.y()))
        {
          Video localVideo = (Video)this.a.y().get(0);
          if (CollectionUtils.isEmpty(localVideo.cover));
          for (String str = null; ; str = (String)localVideo.cover.get(0))
          {
            new e();
            e.b(this.b.h().b(R.id.cover).h(), str, R.color.bg_attach);
            this.b.h().b(R.id.play).e();
            this.b.h().b(R.id.duration).c();
            return;
          }
        }
        if (!CollectionUtils.isEmpty(this.a.x()))
        {
          new e();
          e.b(this.b.h().b(R.id.cover).h(), ((Image)this.a.x().get(0)).url, R.color.bg_default);
          this.b.h().b(R.id.play).c();
          return;
        }
        new e();
        e.a(this.b.h().b(R.id.cover).h(), null);
        this.b.h().b(R.id.play).c();
        return;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.b.g
 * JD-Core Version:    0.6.0
 */