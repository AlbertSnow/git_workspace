package com.wandoujia.p4.community.http.c;

import android.app.Activity;
import android.support.v4.app.b;
import com.wandoujia.base.log.Log;
import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.eventbus.CommunityEvent.Type;
import com.wandoujia.p4.community.http.a.an;
import com.wandoujia.p4.community.http.d.y;
import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class i extends a
{
  private String i;

  public i(Activity paramActivity, String paramString1, String paramString2, List<String> paramList)
  {
    super(paramActivity, paramString1, 2131624504, 2131624499);
    this.i = paramString2;
    this.h = paramList;
  }

  protected final void b()
  {
    an localan = new an();
    ((y)localan.getRequestBuilder()).b(this.i).c(a()).a(this.g).setAttachDefaultCookie(true);
    String str1;
    com.wandoujia.gson.c localc;
    try
    {
      String str4 = (String)com.wandoujia.p4.a.b().execute(localan);
      str1 = str4;
      Log.d("ugc", "post new topic message " + this.i + " ret " + str1, new Object[0]);
      if (str1 == null)
      {
        a(null);
        return;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      while (true)
      {
        Log.d("ugc", "post new topic message error ", new Object[] { localExecutionException });
        str1 = null;
      }
      localc = new com.wandoujia.gson.c();
      try
      {
        CommunityTopicModel localCommunityTopicModel = (CommunityTopicModel)localc.a(str1, CommunityTopicModel.class);
        if (localCommunityTopicModel.getId() != null)
        {
          b.O().d(new CommunityEvent(CommunityEvent.Type.POST_TOPIC, true, localCommunityTopicModel));
          a(true, true);
          return;
        }
      }
      catch (JsonSyntaxException localJsonSyntaxException1)
      {
        Log.d("ugc", "post new topic fromJson error " + this.i, new Object[] { localJsonSyntaxException1 });
      }
    }
    try
    {
      String str3 = ((CommunityResponseInfo)localc.a(str1, CommunityResponseInfo.class)).getMsg();
      str2 = str3;
      Log.d("ugc", "post new topic error errorMsg " + str2, new Object[0]);
      a(str2);
      b.O().d(new CommunityEvent(CommunityEvent.Type.POST_TOPIC, false, null));
      return;
    }
    catch (JsonSyntaxException localJsonSyntaxException2)
    {
      while (true)
        String str2 = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.c.i
 * JD-Core Version:    0.6.0
 */