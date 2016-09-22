package com.wandoujia.p4.gift.view.model;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.button.views.i;
import com.wandoujia.p4.card.models.CardViewModel;
import com.wandoujia.p4.card.models.CardViewModel.SubBadgeType;
import com.wandoujia.p4.gift.a.b;
import com.wandoujia.p4.gift.a.l;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.p4.gift.http.model.GiftModel.GiftViewType;
import java.util.List;

public final class GiftCardViewModelImpl
  implements CardViewModel
{
  private GiftModel a;
  private GiftModel.GiftViewType b;

  public GiftCardViewModelImpl(GiftModel paramGiftModel, GiftModel.GiftViewType paramGiftViewType)
  {
    this.a = paramGiftModel;
    this.b = paramGiftViewType;
  }

  public final Action a(View paramView)
  {
    return null;
  }

  public final CharSequence a()
  {
    Object localObject;
    if ((this.b == GiftModel.GiftViewType.GIFT_DETAIL_ITEM) || (this.b == GiftModel.GiftViewType.MY_GIFT) || (this.b == GiftModel.GiftViewType.GIFT_RECOMMEND))
      localObject = this.a.getDescription();
    while (true)
    {
      return localObject;
      if ((TextUtils.isEmpty(this.a.getProvideType())) || (!this.a.getProvideType().equals(GiftCardViewModelImpl.GiftType.CDKEY.getGiftType())))
        break label213;
      if (this.a.isReceived())
        break;
      String str1 = com.wandoujia.p4.a.a().getString(2131624886);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(this.a.getReceivedCount());
      arrayOfObject[1] = Integer.valueOf(this.a.getRemnantCount());
      String str2 = String.format(str1, arrayOfObject);
      localObject = new SpannableString(str2);
      int i = str2.indexOf(String.valueOf(this.a.getRemnantCount()));
      TextAppearanceSpan localTextAppearanceSpan = new TextAppearanceSpan(com.wandoujia.p4.a.a(), 2131689946);
      if (i == -1)
        continue;
      ((SpannableString)localObject).setSpan(localTextAppearanceSpan, i, i + String.valueOf(this.a.getRemnantCount()).length(), 33);
      return localObject;
    }
    return com.wandoujia.p4.a.a().getString(2131624900);
    label213: return (CharSequence)null;
  }

  public final Action b(View paramView)
  {
    if (this.b == GiftModel.GiftViewType.GIFT_LIST)
      return new b(this.a, paramView.getContext());
    if (this.b == GiftModel.GiftViewType.GIFT_DETAIL_ITEM)
      return new l(this.a, (Activity)paramView.getContext());
    if (this.b == GiftModel.GiftViewType.GIFT_RECOMMEND)
      return new b(this.a, paramView.getContext());
    if (this.b == GiftModel.GiftViewType.MY_GIFT)
      return new b(this.a, paramView.getContext());
    return null;
  }

  public final List<CardViewModel.SubBadgeType> b()
  {
    return null;
  }

  public final String c()
  {
    if (((this.b == GiftModel.GiftViewType.GIFT_LIST) || (this.b == GiftModel.GiftViewType.MY_GIFT) || (this.b == GiftModel.GiftViewType.GIFT_RECOMMEND)) && (this.a != null) && (this.a.getAppModel() != null))
      return this.a.getAppModel().b();
    return "2130838091";
  }

  public final List<i> d()
  {
    return null;
  }

  public final CharSequence f()
  {
    if (this.b != GiftModel.GiftViewType.GIFT_RECOMMEND)
    {
      if (!TextUtils.isEmpty(this.a.getDescription()))
        return this.a.getDescription().replaceAll("\n", " ");
      return this.a.getDescription();
    }
    return null;
  }

  public final CharSequence g()
  {
    return this.a.getTitle();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.view.model.GiftCardViewModelImpl
 * JD-Core Version:    0.6.0
 */