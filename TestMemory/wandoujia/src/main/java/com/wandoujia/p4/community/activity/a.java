package com.wandoujia.p4.community.activity;

import android.support.v4.app.d;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.p4.community.b.az;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;

final class a
  implements az
{
  a(CommunityTopicListActivity paramCommunityTopicListActivity)
  {
  }

  public final void a(CommunityGroupModel paramCommunityGroupModel)
  {
    if (this.a.isFinishing())
      return;
    if (paramCommunityGroupModel != null)
    {
      CommunityTopicListActivity.a(this.a, paramCommunityGroupModel.getId());
      return;
    }
    View localView = d.a(this.a, 2130903499);
    ((TextView)localView.findViewById(2131492997)).setText(2131624460);
    this.a.setContentView(localView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.activity.a
 * JD-Core Version:    0.6.0
 */