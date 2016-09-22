package com.wandoujia.ripple_framework.c.a;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.r;
import com.wandoujia.ripple_framework.view.e;

public final class c extends com.wandoujia.ripple_framework.c.c
{
  private h a = new d(this);

  protected final void a(Model paramModel)
  {
    ImageView localImageView;
    if ((paramModel.u() != null) && (paramModel.u().longValue() > 0L))
    {
      h().b(R.id.publish_time).e().a(r.a(paramModel.u()));
      localImageView = h().b(R.id.provider_icon).h();
      if (TextUtils.isEmpty(paramModel.m().i()))
        break label183;
      localImageView.setVisibility(0);
      new e();
      e.a(localImageView, paramModel.m().i(), R.color.bg_image_loading);
      h().b(R.id.provider_container).a().setOnClickListener(this.a);
    }
    while (true)
    {
      if (TextUtils.isEmpty(paramModel.m().n()))
        break label191;
      h().b(R.id.provider_title).e();
      h().b(R.id.provider_title).a(paramModel.m().n());
      return;
      h().b(R.id.publish_time).d();
      break;
      label183: localImageView.setVisibility(4);
    }
    label191: h().b(R.id.provider_title).d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.a.c
 * JD-Core Version:    0.6.0
 */