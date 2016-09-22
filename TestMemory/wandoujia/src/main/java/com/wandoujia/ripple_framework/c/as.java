package com.wandoujia.ripple_framework.c;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.ImageView;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.R.drawable;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.action.ActionType;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.ripple_framework.util.BadgeUtil.BadgeType;
import java.util.List;

public final class as extends c
{
  private static int a(Model paramModel, boolean paramBoolean)
  {
    BadgeUtil.BadgeType localBadgeType = BadgeUtil.a(paramModel);
    if (localBadgeType != null);
    switch (au.a[localBadgeType.ordinal()])
    {
    default:
      if (!paramBoolean)
        break;
      return R.drawable.ic_grandcard_light;
    case 1:
      if (paramBoolean)
        return R.drawable.ic_publish_light;
      return R.drawable.ic_publish_dark;
    case 2:
      if (paramBoolean)
        return R.drawable.ic_designaward_light;
      return R.drawable.ic_designaward_dark;
    }
    return R.drawable.ic_grandcard_dark;
  }

  protected final void a(Model paramModel)
  {
    i.k().a("presenter");
    AsyncImageView localAsyncImageView = (AsyncImageView)h().b(R.id.cover).a();
    List localList = paramModel.b().cover;
    if ((!CollectionUtils.isEmpty(localList)) && (!TextUtils.isEmpty(((Image)localList.get(0)).url)))
      localAsyncImageView.a(((Image)localList.get(0)).url, R.color.bg_list_content);
    if ((!CollectionUtils.isEmpty(localList)) && (!TextUtils.isEmpty(((Image)localList.get(0)).url)) && ((!TextUtils.isEmpty(paramModel.n())) || (!TextUtils.isEmpty(paramModel.o())) || (!CollectionUtils.isEmpty(paramModel.F().apk))))
    {
      h().b(R.id.mask).f(0);
      h().b(R.id.icon_container).f(0);
      h().b(R.id.action_button).f(0);
      if (paramModel.n() != null)
      {
        if (!TextUtils.isEmpty(paramModel.i()))
          break label628;
        h().b(R.id.icon_container).f(4);
        h().b(R.id.action_button).f(4);
      }
      label237: if ((!CollectionUtils.isEmpty(paramModel.w())) && (!TextUtils.isEmpty(((Image)paramModel.w().get(0)).url)))
        break label646;
      h().b(R.id.title).e(R.color.text_cell_title);
      h().b(R.id.title2).e(R.color.text_headline);
      h().b(R.id.sub_title).e(R.color.text_cell_title);
      h().b(R.id.sub_title2).e(R.color.text_caption3);
      h().b(R.id.description).e(R.color.text_caption3);
      h().b(R.id.default_icon).h().setImageResource(a(paramModel, false));
      label375: if (!CollectionUtils.isEmpty(paramModel.F().apk))
        break label755;
      h().b(R.id.title2).a(paramModel.n());
      h().b(R.id.sub_title2).a(paramModel.o());
      h().b(R.id.title).f(8).b(R.id.sub_title).f(8).b(R.id.description).f(8).b(R.id.icon).f(8).b(R.id.button_install1).f(8).b(R.id.default_icon).f(8).b(R.id.title2).f(0).b(R.id.sub_title2).f(0);
    }
    while (true)
    {
      Resources localResources = h().l().getResources();
      int i = android.support.v4.app.b.x(h().l()) / 4 - localResources.getDimensionPixelSize(R.dimen.card_grand_right_margin_base);
      h().b(R.id.icon_container).a(0, i);
      int j = i + localResources.getDimensionPixelSize(R.dimen.card_grand_description_margin_right);
      int k = localResources.getDimensionPixelSize(R.dimen.card_grand_description_margin_left);
      h().b(R.id.description_container).a(k, j);
      return;
      h().b(R.id.mask).f(8);
      break;
      label628: h().b(R.id.action_button).f(4);
      break label237;
      label646: h().b(R.id.title).e(R.color.text_cell_title_white);
      h().b(R.id.title2).e(R.color.text_headline_white);
      h().b(R.id.sub_title).e(R.color.text_cell_title_white);
      h().b(R.id.sub_title2).e(R.color.text_caption3_white);
      h().b(R.id.description).e(R.color.text_caption3_white);
      h().b(R.id.default_icon).h().setImageResource(a(paramModel, true));
      break label375;
      label755: String str = paramModel.n();
      if (TextUtils.isEmpty(str))
        str = paramModel.F().title;
      if (!TextUtils.isEmpty(str))
        h().b(R.id.title2).a(str);
      h().b(R.id.title).f(0).b(R.id.sub_title).f(0).b(R.id.description).f(0).b(R.id.icon).f(0).b(R.id.button_install1).f(0).b(R.id.default_icon).f(0).b(R.id.title2).f(8).b(R.id.sub_title2).f(8);
      Action localAction = paramModel.t();
      if ((localAction != null) && (localAction.type != null) && (localAction.type.intValue() == ActionType.DESIGN_AWARD.ordinal()))
      {
        if (!TextUtils.isEmpty(localAction.text))
          h().b(R.id.button_install1).a(localAction.text);
        d().a(R.id.button_install1, new at(Logger.Module.UI, ViewLogPackage.Element.BUTTON));
        continue;
      }
      d().a(R.id.button_install1, new com.wandoujia.jupiter.presenter.b());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.as
 * JD-Core Version:    0.6.0
 */