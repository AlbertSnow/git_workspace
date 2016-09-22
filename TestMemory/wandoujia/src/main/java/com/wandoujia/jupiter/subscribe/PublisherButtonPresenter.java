package com.wandoujia.jupiter.subscribe;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import com.wandoujia.jupiter.subscribe.a.a;
import com.wandoujia.p4.subscribe.core.SubscribeManager;
import com.wandoujia.p4.subscribe.core.b;
import com.wandoujia.p4.subscribe.core.h;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.CustomFontTextView;

public final class PublisherButtonPresenter extends com.wandoujia.ripple_framework.c.c
{
  private b a;
  private CustomFontTextView g;
  private Model h;
  private h i = new i(this);

  public PublisherButtonPresenter(CustomFontTextView paramCustomFontTextView)
  {
    this.g = paramCustomFontTextView;
    SubscribeManager.a().a(this.i);
  }

  private void a(PublisherButtonPresenter.SubscribableState paramSubscribableState)
  {
    switch (l.a[paramSubscribableState.ordinal()])
    {
    default:
      return;
    case 1:
      SpannableString localSpannableString = new SpannableString(" ");
      localSpannableString.setSpan(new ImageSpan(this.g.getContext(), 2130838680), 0, 1, 33);
      this.g.setText(localSpannableString);
      this.g.setTextColor(this.g.getContext().getResources().getColor(2131362249));
      this.g.setBackgroundResource(2130838377);
      this.g.setOnClickListener(new j(this, this.h));
      a.a(this.h, true);
      return;
    case 2:
    }
    this.g.setText(2131625459);
    this.g.setTextColor(this.g.getContext().getResources().getColor(2131362232));
    this.g.setBackgroundResource(2130838383);
    this.g.setOnClickListener(new k(this, this.h));
    a.a(this.h, false);
  }

  public final void a()
  {
    this.a = null;
    super.a();
  }

  public final void a(Model paramModel)
  {
    if ((paramModel == null) || (paramModel.I() == null))
      return;
    if (this.h != paramModel)
      a();
    this.h = paramModel;
    this.a = new c(paramModel, this.g.getContext());
    if (this.a.hasSubscribed());
    for (PublisherButtonPresenter.SubscribableState localSubscribableState = PublisherButtonPresenter.SubscribableState.SUBSCRIBED; ; localSubscribableState = PublisherButtonPresenter.SubscribableState.NOT_SUBSCRIBED)
    {
      a(localSubscribableState);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.PublisherButtonPresenter
 * JD-Core Version:    0.6.0
 */