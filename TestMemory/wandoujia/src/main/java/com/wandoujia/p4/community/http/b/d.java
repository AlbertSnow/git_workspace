package com.wandoujia.p4.community.http.b;

import android.support.v4.app.b;
import android.text.TextUtils;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.eventbus.CommunityEvent.Type;
import com.wandoujia.p4.community.http.a.ag;
import com.wandoujia.p4.community.http.d.v;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import de.greenrobot.event.c;

public final class d extends i<CommunityTopicModel>
{
  protected final String a()
  {
    return "";
  }

  protected final n<CommunityTopicModel> c(int paramInt1, int paramInt2)
  {
    String str = com.wandoujia.account.a.t();
    if (!TextUtils.isEmpty(str))
    {
      ag localag = new ag();
      ((v)localag.getRequestBuilder()).a(str).b("created").a(paramInt1).b(paramInt2).setAttachDefaultCookie(true);
      n localn = (n)com.wandoujia.p4.a.b().execute(localag);
      if (localn != null)
        b.O().d(new CommunityEvent(CommunityEvent.Type.UPDATE_TITLE, true, Integer.valueOf(localn.getTotal())));
      return localn;
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.b.d
 * JD-Core Version:    0.6.0
 */