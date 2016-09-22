package com.wandoujia.p4.gift.a;

import android.content.Context;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.ripple_framework.i;

public final class b
  implements com.wandoujia.mvc.Action
{
  private final GiftModel a;
  private final Context b;

  public b(GiftModel paramGiftModel, Context paramContext)
  {
    this.a = paramGiftModel;
    this.b = paramContext;
  }

  public final void execute()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.a.getPackageName();
    arrayOfObject[1] = Long.valueOf(this.a.getId());
    String str = String.format("http://apis.wandoujia.com/apps/v1/%s/gift/%s?format=proto", arrayOfObject);
    com.wandoujia.api.proto.Action localAction = new Action.Builder().intent("wdj://apps/gifts/" + this.a.getId()).url(str).build();
    ((NavigationManager)i.k().a("navigation")).a(this.b, localAction);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.a.b
 * JD-Core Version:    0.6.0
 */