package com.wandoujia.p4.community.card.a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.community.b.ap;
import com.wandoujia.p4.community.b.f;
import com.wandoujia.p4.community.http.a.e;
import com.wandoujia.p4.community.http.model.CommunityReplyModel;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import java.util.HashMap;
import java.util.Map;

final class j
  implements View.OnClickListener
{
  j(h paramh, CommunityReplyModel paramCommunityReplyModel)
  {
  }

  public final void onClick(View paramView)
  {
    if (h.a(this.b) == null);
    do
      return;
    while (((!this.a.currentUserCanDelete()) && (!h.a(this.b).currentUserCanAddReply())) || (this.a.getAuthor() == null));
    HashMap localHashMap = new HashMap();
    if (this.a.currentUserCanDelete())
      localHashMap.put(h.b(this.b).getString(2131624598), new f(new e(this.a.getId()), h.b(this.b), this.a.getId()));
    if (h.a(this.b).currentUserCanAddReply())
      localHashMap.put(com.wandoujia.p4.a.a().getString(2131624782), new ap(h.b(this.b), h.a(this.b), this.a));
    new com.wandoujia.p4.community.views.a.a(h.b(this.b)).a(localHashMap);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.a.j
 * JD-Core Version:    0.6.0
 */