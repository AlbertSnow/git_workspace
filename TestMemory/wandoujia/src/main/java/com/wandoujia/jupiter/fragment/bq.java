package com.wandoujia.jupiter.fragment;

import android.text.TextUtils;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.jupiter.startpage.manager.d;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.List;

final class bq
  implements d
{
  bq(StartPageFragment paramStartPageFragment)
  {
  }

  public final void a(String paramString)
  {
    int i = 0;
    if (TextUtils.equals(paramString, "SelfUpdateFeed"))
    {
      ArrayList localArrayList = new ArrayList();
      for (int j = 0; j < StartPageFragment.b(this.a).c().size(); j++)
      {
        if (((Model)StartPageFragment.c(this.a).a(j)).f() != ContentTypeEnum.ContentType.SELF_UPDATE)
          continue;
        localArrayList.add(Integer.valueOf(j));
      }
      int k = localArrayList.size();
      while (i < k)
      {
        int m = ((Integer)localArrayList.get(k - 1 - i)).intValue();
        StartPageFragment.d(this.a).b(m);
        i++;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.bq
 * JD-Core Version:    0.6.0
 */