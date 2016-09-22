package com.wandoujia.p4.gift.views;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.wandoujia.p4.button.views.StatefulButton;
import com.wandoujia.p4.card.views.ContentCardView;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.p4.gift.http.model.GiftModel.GiftViewType;
import com.wandoujia.p4.gift.view.model.a;
import com.wandoujia.p4.views.CommonPopupView;

public class GiftDetailPopUpCardView extends ContentCardView
{
  private TextView i;
  private TextView j;
  private View k;
  private TextView l;
  private StatefulButton m;

  public GiftDetailPopUpCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static void a(GiftModel paramGiftModel, Activity paramActivity)
  {
    try
    {
      CommonPopupView localCommonPopupView = CommonPopupView.a(paramActivity);
      GiftDetailPopUpCardView localGiftDetailPopUpCardView = (GiftDetailPopUpCardView)com.wandoujia.p4.utils.c.a(localCommonPopupView, 2130903182);
      localCommonPopupView.a(localGiftDetailPopUpCardView, new FrameLayout.LayoutParams(-1, -2));
      new com.wandoujia.p4.gift.view.a.c().a(localGiftDetailPopUpCardView, new a(paramGiftModel, GiftModel.GiftViewType.GIFT_POP_UP));
      localCommonPopupView.a();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
  }

  public TextView getExchangeDateTextView()
  {
    return this.i;
  }

  public View getGiftKeyContainer()
  {
    return this.k;
  }

  public TextView getGiftKeyTextView()
  {
    return this.l;
  }

  public TextView getGiftUsageTextView()
  {
    return this.j;
  }

  public StatefulButton getOpenGiftKeyButton()
  {
    return this.m;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.i = ((TextView)findViewById(2131493454));
    this.j = ((TextView)findViewById(2131493456));
    this.k = findViewById(2131493450);
    this.l = ((TextView)findViewById(2131493451));
    this.m = ((StatefulButton)findViewById(2131493452));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.views.GiftDetailPopUpCardView
 * JD-Core Version:    0.6.0
 */