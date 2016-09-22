package com.wandoujia.p4.community.card.b;

import android.content.Context;
import android.text.TextUtils;
import com.wandoujia.base.utils.DateUtil;
import com.wandoujia.p4.button.views.i;
import com.wandoujia.p4.card.models.b;
import com.wandoujia.p4.community.b.ba;
import com.wandoujia.p4.community.b.bf;
import com.wandoujia.p4.community.http.model.CommunityUserModel;
import java.util.ArrayList;
import java.util.List;

final class f extends b
{
  f(e parame)
  {
  }

  public final String c()
  {
    return e.a(this.a).getAvatar();
  }

  public final List<i> d()
  {
    ArrayList localArrayList = new ArrayList();
    if ((e.a(this.a) != null) && (com.wandoujia.account.a.z()) && (!TextUtils.isEmpty(e.b(this.a))) && (com.wandoujia.account.a.t().equals(String.valueOf(e.a(this.a).getUid()))))
    {
      if ("GROUP_ADMIN".equals(e.a(this.a).getRole()))
        localArrayList.add(new i(com.wandoujia.p4.a.a().getString(2131624523), new bf(e.c(this.a), e.d(this.a), com.wandoujia.account.a.t())));
      if (!"GROUP_OWNER".equals(e.a(this.a).getRole()))
        localArrayList.add(new i(com.wandoujia.p4.a.a().getString(2131624507), new ba(e.c(this.a), e.d(this.a), e.b(this.a))));
    }
    return localArrayList;
  }

  public final CharSequence f()
  {
    if (e.a(this.a).getJoinTime() != null)
    {
      Context localContext = com.wandoujia.p4.a.a();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = DateUtil.timeStamp2Date(String.valueOf(e.a(this.a).getJoinTime()));
      return localContext.getString(2131624469, arrayOfObject);
    }
    return null;
  }

  public final CharSequence g()
  {
    return e.a(this.a).getNick();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.b.f
 * JD-Core Version:    0.6.0
 */