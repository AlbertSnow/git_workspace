package com.wandoujia.p4.community.http.b;

import android.text.TextUtils;
import com.wandoujia.base.log.Log;
import com.wandoujia.p4.community.http.d.p;
import com.wandoujia.p4.community.http.model.CommunityReplyInfo;
import com.wandoujia.p4.community.http.model.CommunityReplyModel;
import java.util.concurrent.ExecutionException;

public final class g extends i<CommunityReplyModel>
{
  private final String b;
  private boolean c = true;
  private String d;

  public g(String paramString)
  {
    this.b = paramString;
  }

  protected final String a()
  {
    return this.b;
  }

  public final void a(String paramString)
  {
    this.d = paramString;
  }

  public final CommunityReplyInfo b(String paramString)
  {
    com.wandoujia.launcher.d.a.a locala = new com.wandoujia.launcher.d.a.a(this.b);
    ((p)locala.getRequestBuilder()).a("newest").b(paramString).b(15).setAttachDefaultCookie(true);
    try
    {
      CommunityReplyInfo localCommunityReplyInfo = (CommunityReplyInfo)com.wandoujia.p4.a.b().execute(locala);
      return localCommunityReplyInfo;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return null;
  }

  protected final n<CommunityReplyModel> c(int paramInt1, int paramInt2)
  {
    com.wandoujia.launcher.d.a.a locala = new com.wandoujia.launcher.d.a.a(this.b);
    if (TextUtils.isEmpty(this.d))
      ((p)locala.getRequestBuilder()).a("oldest").a(paramInt1).b(paramInt2).setAttachDefaultCookie(true);
    while (true)
    {
      CommunityReplyInfo localCommunityReplyInfo = (CommunityReplyInfo)com.wandoujia.p4.a.b().execute(locala);
      Log.d("ugc", "fetch reply list count " + localCommunityReplyInfo.getTotal(), new Object[0]);
      return localCommunityReplyInfo;
      if (this.c)
      {
        ((p)locala.getRequestBuilder()).a();
        this.c = false;
      }
      ((p)locala.getRequestBuilder()).a("oldest").b(this.d).b(paramInt2).setAttachDefaultCookie(true);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.b.g
 * JD-Core Version:    0.6.0
 */