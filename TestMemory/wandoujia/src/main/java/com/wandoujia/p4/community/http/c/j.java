package com.wandoujia.p4.community.http.c;

import android.app.Activity;
import android.support.v4.app.b;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.eventbus.CommunityEvent.Type;
import com.wandoujia.p4.community.http.a.ba;
import com.wandoujia.p4.community.http.d.ag;
import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import java.util.concurrent.ExecutionException;

public final class j extends a
{
  private boolean i;

  public j(Activity paramActivity, String paramString, boolean paramBoolean)
  {
    super(paramActivity, paramString, 2131624518, 2131624517);
    this.i = paramBoolean;
  }

  protected final void b()
  {
    ba localba = new ba();
    ((ag)localba.getRequestBuilder()).a(this.i).a(this.g).setAttachDefaultCookie(true);
    try
    {
      str = (String)com.wandoujia.p4.a.b().execute(localba);
      if (str == null)
        a(null);
      com.wandoujia.gson.c localc = new com.wandoujia.gson.c();
      try
      {
        CommunityResponseInfo localCommunityResponseInfo = (CommunityResponseInfo)localc.a(str, CommunityResponseInfo.class);
        if (localCommunityResponseInfo.isDataValid())
        {
          a(true, true);
          b.O().d(new CommunityEvent(CommunityEvent.Type.LIKE_TOPIC, true, Boolean.valueOf(this.i)));
          return;
        }
        b.O().d(new CommunityEvent(CommunityEvent.Type.LIKE_TOPIC, false, Boolean.valueOf(this.i)));
        a(localCommunityResponseInfo.getMsg());
        return;
      }
      catch (Exception localException)
      {
        a(null);
        return;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      while (true)
        String str = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.c.j
 * JD-Core Version:    0.6.0
 */