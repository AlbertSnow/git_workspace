package com.wandoujia.jupiter.presenter;

import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import com.wandoujia.api.proto.GiftDetail;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.BadgeUtil;

public final class ad extends c
{
  protected final void a(Model paramModel)
  {
    View localView1;
    label65: LinearLayout.LayoutParams localLayoutParams;
    label103: GiftDetail localGiftDetail;
    if (com.wandoujia.jupiter.util.b.a(paramModel.o()))
    {
      h().a(2131492972).a().setVisibility(8);
      localView1 = h().a(2131493008).a();
      if (!BadgeUtil.c(paramModel))
        break label140;
      localView1.setVisibility(0);
      localView1.setOnClickListener(new ae(this, paramModel));
      View localView2 = h().a(2131492866).a();
      localLayoutParams = (LinearLayout.LayoutParams)localView2.getLayoutParams();
      if (!CollectionUtils.isEmpty(paramModel.A()))
        break label154;
      localLayoutParams.bottomMargin = 0;
      localView2.setLayoutParams(localLayoutParams);
      localGiftDetail = paramModel.E();
      if (localGiftDetail != null)
        break label172;
    }
    label140: label154: label172: 
    do
    {
      return;
      h().a(2131492972).a().setVisibility(0);
      break;
      localView1.setVisibility(8);
      localView1.setOnClickListener(null);
      break label65;
      localLayoutParams.bottomMargin = (int)android.support.v4.app.b.c(f(), 16.0F);
      break label103;
      h().a(2131493646).f(8);
      if ((localGiftDetail.is_received == null) || (!localGiftDetail.is_received.booleanValue()))
        continue;
      h().a(2131492866).f(8);
      h().a(2131493646).f(0).a(2131493647).a(localGiftDetail.cdkey);
      h().a(2131493648).a().setOnClickListener(new af(localGiftDetail));
    }
    while ((!GiftButtonPresenter.GiftState.START_REUSE.name().equals(localGiftDetail.status)) && (!GiftButtonPresenter.GiftState.WAIT_REUSE.name().equals(localGiftDetail.status)));
    h().a(2131492866).f(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ad
 * JD-Core Version:    0.6.0
 */