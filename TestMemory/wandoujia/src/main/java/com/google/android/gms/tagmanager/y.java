package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.aq;
import com.wandoujia.morph.a.n;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class y
  implements aa
{
  y(Map paramMap1, Map paramMap2, Map paramMap3, Map paramMap4)
  {
  }

  public final void a(aq paramaq, Set<ap> paramSet1, Set<ap> paramSet2)
  {
    List localList1 = (List)this.a.get(paramaq);
    this.b.get(paramaq);
    if (localList1 != null)
    {
      paramSet1.addAll(localList1);
      new n();
    }
    List localList2 = (List)this.c.get(paramaq);
    this.d.get(paramaq);
    if (localList2 != null)
    {
      paramSet2.addAll(localList2);
      new n();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.y
 * JD-Core Version:    0.6.0
 */