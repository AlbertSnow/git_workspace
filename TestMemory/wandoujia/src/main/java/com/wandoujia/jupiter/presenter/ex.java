package com.wandoujia.jupiter.presenter;

import android.view.View;
import android.widget.ImageView;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;
import java.util.List;

public final class ex extends c
{
  private final int[] a = { 2131493753, 2131493754, 2131493755, 2131493756 };

  protected final void a(Model paramModel)
  {
    for (int i = 0; (i < 4) && (i < paramModel.b().sub_entity.size()); i++)
    {
      ImageView localImageView = (ImageView)e().findViewById(this.a[i]);
      new e();
      e.a(localImageView, ((Entity)paramModel.b().sub_entity.get(i)).icon);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ex
 * JD-Core Version:    0.6.0
 */