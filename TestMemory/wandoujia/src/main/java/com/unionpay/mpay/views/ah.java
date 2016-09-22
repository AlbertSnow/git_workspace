package com.unionpay.mpay.views;

import com.unionpay.pboc.engine.a;
import com.unionpay.pboctransaction.model.b;
import java.util.ArrayList;
import java.util.List;

final class ah
  implements a
{
  ah(j paramj)
  {
  }

  public final void a(ArrayList<b> paramArrayList)
  {
    j.a(this.a);
    if ((paramArrayList != null) && (paramArrayList.size() > 0))
    {
      if (this.a.l == null)
        this.a.l = new ArrayList(paramArrayList.size());
      this.a.l.addAll(paramArrayList);
    }
    j.b(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.ah
 * JD-Core Version:    0.6.0
 */