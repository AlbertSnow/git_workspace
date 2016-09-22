package com.wandoujia.jupiter.presenter;

import android.view.View.OnClickListener;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.StatefulButton;
import java.util.List;

public final class cf extends c
{
  private View.OnClickListener a = null;

  public final void a()
  {
    super.a();
  }

  protected final void a(Model paramModel)
  {
    if ((paramModel.P()) || (CollectionUtils.isEmpty(i().F().apk)));
    StatefulButton localStatefulButton;
    do
    {
      do
        return;
      while ((i().F().apk.size() == 0) || (!(e() instanceof StatefulButton)));
      localStatefulButton = (StatefulButton)e();
    }
    while (this.a != null);
    this.a = new cg(this, localStatefulButton, paramModel);
    localStatefulButton.a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cf
 * JD-Core Version:    0.6.0
 */