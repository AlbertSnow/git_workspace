package com.wandoujia.p4.community.http.b;

import android.text.TextUtils;
import com.wandoujia.p4.community.http.a.r;
import com.wandoujia.p4.community.http.d.m;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.p4.community.http.model.CommunityUserModel;
import java.util.Iterator;
import java.util.List;

public final class a extends i<CommunityUserModel>
{
  private CommunityGroupModel b;
  private int c;
  private boolean d;

  public a(CommunityGroupModel paramCommunityGroupModel)
  {
    this.b = paramCommunityGroupModel;
    this.c = 0;
    this.d = false;
  }

  protected final String a()
  {
    return "";
  }

  protected final n<CommunityUserModel> c(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0)
    {
      this.c = 0;
      this.d = false;
    }
    r localr1 = new r();
    ((m)localr1.getRequestBuilder()).b("GROUP_MEMBER").a(this.b.getId()).a(paramInt1 - this.c).b(paramInt2).setAttachDefaultCookie(true);
    n localn1 = (n)com.wandoujia.p4.a.b().execute(localr1);
    if ((localn1 != null) && (localn1.getResult() != null) && (com.wandoujia.account.a.z()) && (com.wandoujia.account.a.t() != null))
    {
      Iterator localIterator2 = localn1.getResult().iterator();
      while (localIterator2.hasNext())
      {
        CommunityUserModel localCommunityUserModel3 = (CommunityUserModel)localIterator2.next();
        if ((localCommunityUserModel3 == null) || (!com.wandoujia.account.a.t().equals(String.valueOf(localCommunityUserModel3.getUid()))))
          continue;
        localn1.getResult().remove(localCommunityUserModel3);
        this.c = (-1 + this.c);
      }
    }
    if ((paramInt1 == 0) && (localn1 != null) && (!this.d))
    {
      r localr2 = new r();
      ((m)localr2.getRequestBuilder()).b("GROUP_ADMIN").a(this.b.getId()).a(paramInt1).b(paramInt2).setAttachDefaultCookie(true);
      n localn2 = (n)com.wandoujia.p4.a.b().execute(localr2);
      if (localn2 != null)
      {
        Iterator localIterator1 = localn2.getResult().iterator();
        while (localIterator1.hasNext())
        {
          CommunityUserModel localCommunityUserModel2 = (CommunityUserModel)localIterator1.next();
          if (String.valueOf(localCommunityUserModel2.getUid()).equals(com.wandoujia.account.a.t()))
            continue;
          localn1.getResult().add(0, localCommunityUserModel2);
          this.c = (1 + this.c);
        }
      }
      if ((this.b.getAuthor() != null) && (!"GROUP_OWNER".equals(this.b.getCurUserRole())))
      {
        localn1.getResult().add(0, this.b.getAuthor());
        this.c = (1 + this.c);
      }
      if ((com.wandoujia.account.a.z()) && (!TextUtils.isEmpty(this.b.getCurUserRole())))
      {
        CommunityUserModel localCommunityUserModel1 = new CommunityUserModel();
        localCommunityUserModel1.setUid(Long.valueOf(Long.parseLong(com.wandoujia.account.a.t())));
        localCommunityUserModel1.setAvatar(com.wandoujia.account.a.k());
        localCommunityUserModel1.setNick(com.wandoujia.account.a.l());
        localCommunityUserModel1.setRole(this.b.getCurUserRole());
        long l = this.b.getCurUserJoinTime();
        if (l == 0L)
          l = System.currentTimeMillis();
        localCommunityUserModel1.setJoinTime(Long.valueOf(l));
        localn1.getResult().add(0, localCommunityUserModel1);
        this.c = (1 + this.c);
      }
      this.d = true;
    }
    return localn1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.b.a
 * JD-Core Version:    0.6.0
 */