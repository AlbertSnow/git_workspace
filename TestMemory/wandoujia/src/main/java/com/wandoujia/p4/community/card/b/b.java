package com.wandoujia.p4.community.card.b;

import android.view.View;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.community.b.aj;
import com.wandoujia.p4.community.http.model.CommunityCampaignModel;
import com.wandoujia.p4.community.http.model.CommunityImageInfo;

public final class b extends com.wandoujia.p4.card.models.b
{
  private final CommunityCampaignModel a;
  private final String b;

  public b(CommunityCampaignModel paramCommunityCampaignModel, String paramString)
  {
    this.a = paramCommunityCampaignModel;
    this.b = paramString;
  }

  public final Action b(View paramView)
  {
    return new aj(paramView.getContext(), this.b, this.a.getTitle(), this.a.getUrl());
  }

  public final String c()
  {
    if (this.a.getIcon() == null)
      return null;
    return this.a.getIcon().url;
  }

  public final CharSequence g()
  {
    return this.a.getTitle();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.b.b
 * JD-Core Version:    0.6.0
 */