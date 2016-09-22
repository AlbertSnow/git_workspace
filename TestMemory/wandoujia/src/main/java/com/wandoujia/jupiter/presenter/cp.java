package com.wandoujia.jupiter.presenter;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.GiftDetail;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.jupiter.subscribe.PublisherButtonPresenter;
import com.wandoujia.ripple_framework.c.af;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.StatefulButton;

final class cp extends af
{
  protected final void a(Model paramModel)
  {
    if (ContentTypeEnum.ContentType.PUBLISHER.equals(paramModel.f()))
      new PublisherButtonPresenter((StatefulButton)e()).a(paramModel);
    while (true)
    {
      return;
      if (!ContentTypeEnum.ContentType.GIFT.equals(paramModel.f()))
        break;
      if (GiftButtonPresenter.GiftType.CDKEY.getGiftType().equals(paramModel.E().provide_type))
      {
        GiftButtonPresenter localGiftButtonPresenter = new GiftButtonPresenter((StatefulButton)e());
        localGiftButtonPresenter.b(g());
        localGiftButtonPresenter.a(paramModel);
        return;
      }
      Action localAction = paramModel.b().action_positive;
      if (((AppManager)i.k().a("app")).h(paramModel.F().package_name))
        ((TextView)e()).setText(2131625698);
      while ((paramModel.b().detail != null) && (paramModel.b().detail.gift_detail != null))
      {
        e().setOnClickListener(new cq(this, paramModel));
        return;
        if ((!(e() instanceof TextView)) || (TextUtils.isEmpty(localAction.text)))
          continue;
        ((TextView)e()).setText(localAction.text);
      }
    }
    super.a(paramModel);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cp
 * JD-Core Version:    0.6.0
 */