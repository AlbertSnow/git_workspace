package com.wandoujia.p4.gift.view.a;

import android.widget.LinearLayout;
import com.wandoujia.mvc.BaseController;
import com.wandoujia.p4.card.views.ContentCardView;
import com.wandoujia.p4.gift.http.model.GiftModel.GiftViewType;
import com.wandoujia.p4.gift.view.model.a;
import com.wandoujia.p4.gift.views.RecommendGiftCardView;
import com.wandoujia.p4.utils.c;
import java.util.List;

public final class e
  implements BaseController<RecommendGiftCardView, com.wandoujia.p4.gift.view.model.b>
{
  private com.wandoujia.p4.gift.view.model.b a;

  public final void a(RecommendGiftCardView paramRecommendGiftCardView, com.wandoujia.p4.gift.view.model.b paramb)
  {
    if (paramRecommendGiftCardView == null)
      break label4;
    while (true)
    {
      label4: return;
      if (this.a == paramb)
        continue;
      this.a = paramb;
      if (paramRecommendGiftCardView.getCardContainer() == null)
        break;
      paramRecommendGiftCardView.getCardContainer().removeAllViews();
      for (int i = 0; i < paramb.a().size(); i++)
      {
        ContentCardView localContentCardView = (ContentCardView)c.a(paramRecommendGiftCardView.getCardContainer(), 2130903172);
        new b(GiftModel.GiftViewType.GIFT_RECOMMEND).a(localContentCardView, (a)paramb.a().get(i));
        paramRecommendGiftCardView.getCardContainer().addView(localContentCardView);
        if (i + 1 >= paramb.a().size())
          continue;
        paramRecommendGiftCardView.getCardContainer().addView(c.a(paramRecommendGiftCardView.getContext(), 2130903080));
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.view.a.e
 * JD-Core Version:    0.6.0
 */