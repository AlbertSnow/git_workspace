package com.wandoujia.p4.community.b;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.b;
import com.wandoujia.account.a;
import com.wandoujia.base.log.Log;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.eventbus.CommunityEvent.Type;
import com.wandoujia.p4.community.utils.CommunityImageUtils;
import de.greenrobot.event.c;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

final class ag
  implements Runnable
{
  private ag(af paramaf)
  {
  }

  public final void run()
  {
    String str1 = CommunityImageUtils.a(af.a(this.a));
    if (str1 == null)
      str1 = af.a(this.a);
    HashMap localHashMap1 = new HashMap();
    localHashMap1.put("title", af.b(this.a));
    localHashMap1.put("description", af.c(this.a));
    localHashMap1.put("subjectType", af.d(this.a));
    localHashMap1.put("nominate", "1");
    HashMap localHashMap2 = new HashMap();
    localHashMap2.put("Cookie", "wdj_auth=" + a.i());
    String str2 = CommunityImageUtils.b("http://group.wandoujia.com/api/v1/groups/add", localHashMap1, localHashMap2, new File(str1));
    boolean bool = af.a(str2);
    Log.d("ugc", "Nominate Group result: " + bool, new Object[0]);
    b.O().d(new CommunityEvent(CommunityEvent.Type.BALLOT_NEW, bool, str2));
    new Handler(Looper.getMainLooper()).post(new ah(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.b.ag
 * JD-Core Version:    0.6.0
 */