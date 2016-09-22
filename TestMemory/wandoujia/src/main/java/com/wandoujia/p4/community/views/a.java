package com.wandoujia.p4.community.views;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.GridView;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.p4.community.http.model.CommunityTopicLikedUsersInfo;

final class a
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  a(CommunityBallotInfoView paramCommunityBallotInfoView, int paramInt)
  {
  }

  public final void onGlobalLayout()
  {
    int i = CommunityBallotInfoView.a(this.b).getMeasuredWidth() / this.a;
    if ((i != 0) && (i != CommunityBallotInfoView.b(this.b)))
    {
      CommunityBallotInfoView.a(this.b, i);
      CommunityBallotInfoView.a(this.b).setNumColumns(CommunityBallotInfoView.b(this.b));
      if (CommunityBallotInfoView.c(this.b) == null)
        break label85;
      CommunityBallotInfoView.c(this.b).a(CommunityBallotInfoView.b(this.b));
    }
    label85: 
    do
      return;
    while ((CommunityBallotInfoView.d(this.b) == null) || (CollectionUtils.isEmpty(CommunityBallotInfoView.d(this.b).items)));
    CommunityBallotInfoView.a(this.b, new com.wandoujia.p4.community.c.a(CommunityBallotInfoView.b(this.b), CommunityBallotInfoView.d(this.b)));
    CommunityBallotInfoView.a(this.b).setAdapter(CommunityBallotInfoView.c(this.b));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.a
 * JD-Core Version:    0.6.0
 */