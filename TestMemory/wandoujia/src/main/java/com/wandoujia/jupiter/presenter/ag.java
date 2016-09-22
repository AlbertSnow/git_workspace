package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;
import com.wandoujia.ripple_framework.view.h;
import java.util.List;

public final class ag extends c
{
  private boolean a;

  private void a(ImageView paramImageView, Image paramImage)
  {
    boolean bool = true;
    this.a = bool;
    String str;
    if ((paramImage.width.intValue() > 0) && (paramImage.height.intValue() > 0))
    {
      new e();
      str = paramImage.url;
      if (!bool)
        break label65;
    }
    label65: for (Object localObject = null; ; localObject = new ai(this))
    {
      e.a(paramImageView, str, 2131361863, bool, (h)localObject);
      return;
      bool = false;
      break;
    }
  }

  private static LinearLayout.LayoutParams b(int paramInt1, int paramInt2)
  {
    int i = ((WindowManager)i.k().g().getSystemService("window")).getDefaultDisplay().getWidth();
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, paramInt2);
    if ((paramInt1 == 0) || (paramInt2 == 0))
    {
      localLayoutParams.height = 0;
      return localLayoutParams;
    }
    if (paramInt1 > 160)
    {
      localLayoutParams.height = (int)(i * paramInt2 / paramInt1);
      return localLayoutParams;
    }
    localLayoutParams.height = (int)(paramInt2 * i / (paramInt1 * 3));
    localLayoutParams.width = (i / 3);
    return localLayoutParams;
  }

  protected final void a(Model paramModel)
  {
    if (CollectionUtils.isEmpty(paramModel.v()))
      return;
    Image localImage = (Image)paramModel.v().get(0);
    ImageView localImageView = (ImageView)e();
    this.a = false;
    localImageView.setLayoutParams(b(localImage.width.intValue(), localImage.height.intValue()));
    a(localImageView, localImage);
    e().setOnClickListener(new ah(this, paramModel.c(), localImageView, localImage, paramModel));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ag
 * JD-Core Version:    0.6.0
 */