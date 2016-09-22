package com.wandoujia.p4.community.card.b;

import android.app.Activity;
import com.wandoujia.p4.card.models.CardViewModel;
import com.wandoujia.p4.card.models.a;
import com.wandoujia.p4.community.http.model.CommunityUserModel;

public final class e
  implements a<CommunityUserModel>
{
  private Activity a;
  private String b;
  private String c;
  private CommunityUserModel d;

  public e(Activity paramActivity, String paramString1, String paramString2, CommunityUserModel paramCommunityUserModel)
  {
    this.a = paramActivity;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramCommunityUserModel;
  }

  public final CommunityUserModel a()
  {
    return this.d;
  }

  public final CardViewModel b()
  {
    return new f(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.b.e
 * JD-Core Version:    0.6.0
 */