package com.wandoujia.jupiter.presenter;

import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.p4.game.view.FlowLayout.LayoutParams;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class en extends c
{
  protected final void a(Model paramModel)
  {
    FlowLayout.LayoutParams localLayoutParams = (FlowLayout.LayoutParams)e().getLayoutParams();
    localLayoutParams.width = (int)((b.x(f()) - b.c(f(), 120.0F)) / 2.0F);
    e().setLayoutParams(localLayoutParams);
    if ((CollectionUtils.isEmpty(paramModel.w())) || (TextUtils.isEmpty(((Image)paramModel.w().get(0)).url)))
    {
      h().a(2131493669).f(8);
      h().a(2131493669).i(2131362159);
      if (!TextUtils.isEmpty(paramModel.i()))
        break label253;
      h().a(2131492903).f(8);
      label131: if (!TextUtils.isEmpty(paramModel.p()))
        break label270;
      h().a(2131492973).f(8);
    }
    while (true)
    {
      if ((!TextUtils.isEmpty(paramModel.i())) || (!TextUtils.isEmpty(paramModel.p())))
        break label287;
      LinearLayout.LayoutParams localLayoutParams2 = (LinearLayout.LayoutParams)h().a(2131492998).a().getLayoutParams();
      localLayoutParams2.gravity = 17;
      h().a(2131492998).a().setLayoutParams(localLayoutParams2);
      return;
      h().a(2131493669).f(0);
      h().a(2131493669).i(2131361872);
      break;
      label253: h().a(2131492903).f(0);
      break label131;
      label270: h().a(2131492973).f(0);
    }
    label287: LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)h().a(2131492998).a().getLayoutParams();
    localLayoutParams1.gravity = 1;
    h().a(2131492998).a().setLayoutParams(localLayoutParams1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.en
 * JD-Core Version:    0.6.0
 */