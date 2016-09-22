package com.wandoujia.p4.gift.b;

import android.content.Context;
import com.wandoujia.p4.adapter.BaseCardSelectableAdapter;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.ripple_framework.view.a.h;
import java.util.List;

public final class a extends BaseCardSelectableAdapter<com.wandoujia.p4.gift.view.model.a>
{
  public a(Context paramContext)
  {
    super(paramContext);
  }

  public final long getItemId(int paramInt)
  {
    return ((com.wandoujia.p4.gift.view.model.a)a(paramInt)).b().getId();
  }

  protected final int i()
  {
    return 2131624598;
  }

  protected final int j()
  {
    return 2130838277;
  }

  protected final void k()
  {
    List localList = l();
    if ((localList.isEmpty()) || (localList == null) || (localList.isEmpty()))
      return;
    h localh1 = new h(this.a);
    h localh2 = localh1.a(2131624868);
    Context localContext = com.wandoujia.p4.a.a();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(localList.size());
    localh2.b(localContext.getString(2131624866, arrayOfObject)).b(2131624330, new c()).a(2131624552, new b(this, localList)).a(true);
    localh1.b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.b.a
 * JD-Core Version:    0.6.0
 */