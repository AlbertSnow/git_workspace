package com.wandoujia.p4.community.http.c;

import android.app.Activity;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.wandoujia.base.log.Log;
import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.eventbus.CommunityEvent.Type;
import com.wandoujia.p4.community.http.a.am;
import com.wandoujia.p4.community.http.d.x;
import com.wandoujia.p4.community.http.model.CommunityReplyModel;
import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class h extends a
{
  private String i;
  private String j;

  public h(Activity paramActivity, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    super(paramActivity, paramString1, 2131624521, 2131624516);
    this.i = paramString2;
    this.j = paramString4;
    if (!TextUtils.isEmpty(paramString3))
    {
      this.h = new ArrayList();
      this.h.add(paramString3);
    }
  }

  protected final void b()
  {
    am localam = new am();
    ((x)localam.getRequestBuilder()).b(this.i).c(a()).d(this.j).a(this.g).setAttachDefaultCookie(true);
    String str1;
    com.wandoujia.gson.c localc;
    try
    {
      String str4 = (String)com.wandoujia.p4.a.b().execute(localam);
      str1 = str4;
      Log.d("ugc", "post new reply message " + this.i + " ret " + str1, new Object[0]);
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
        Log.d("ugc", "post error ", new Object[] { localExecutionException });
        str1 = null;
      }
      localc = new com.wandoujia.gson.c();
      try
      {
        if (((CommunityReplyModel)localc.a(str1, CommunityReplyModel.class)).getId() != null)
        {
          b.O().d(new CommunityEvent(CommunityEvent.Type.POST_REPLY, true, null));
          a(true, true);
          return;
        }
      }
      catch (JsonSyntaxException localJsonSyntaxException1)
      {
      }
    }
    try
    {
      String str3 = ((CommunityResponseInfo)localc.a(str1, CommunityResponseInfo.class)).getMsg();
      str2 = str3;
      a(str2);
      b.O().d(new CommunityEvent(CommunityEvent.Type.POST_REPLY, false, null));
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
 * Qualified Name:     com.wandoujia.p4.community.http.c.h
 * JD-Core Version:    0.6.0
 */