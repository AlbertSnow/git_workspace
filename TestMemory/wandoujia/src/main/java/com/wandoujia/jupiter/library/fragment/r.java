package com.wandoujia.jupiter.library.fragment;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.b;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class r
  implements Runnable
{
  r(AppUpgradeFragment paramAppUpgradeFragment, List paramList1, List paramList2)
  {
  }

  public final void run()
  {
    List localList = b.b(this.c);
    if (!CollectionUtils.isEmpty(localList))
    {
      Model localModel = (Model)localList.get(0);
      new Handler(Looper.getMainLooper()).post(new s(this, localModel));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.r
 * JD-Core Version:    0.6.0
 */