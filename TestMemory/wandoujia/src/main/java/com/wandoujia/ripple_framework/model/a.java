package com.wandoujia.ripple_framework.model;

import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class a extends g
{
  public a(String paramString, e<Model> parame)
  {
    super(paramString, parame);
  }

  public a(String paramString, e<Model> parame, Map<String, String> paramMap)
  {
    super(paramString, parame, paramMap);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 + paramInt2 > this.a.size()))
      return;
    List localList1 = this.a.subList(0, paramInt1);
    List localList2 = this.a.subList(paramInt1 + paramInt2, this.a.size());
    this.a = new ArrayList(localList1);
    this.a.addAll(localList2);
    com.wandoujia.nirvana.framework.network.page.g localg = new com.wandoujia.nirvana.framework.network.page.g(paramInt1, paramInt2);
    a(DataLoadListener.Op.REMOVE_RANGE, localg);
  }

  public final void a(int paramInt, List<Model> paramList)
  {
    if (paramInt >= this.a.size())
    {
      this.a.addAll(paramList);
      com.wandoujia.nirvana.framework.network.page.g localg2 = new com.wandoujia.nirvana.framework.network.page.g(paramInt, null, this.a.get(-1 + this.a.size()), paramList);
      a(DataLoadListener.Op.ADD, localg2);
      return;
    }
    List localList1 = this.a.subList(0, paramInt);
    List localList2 = this.a.subList(paramInt, this.a.size());
    this.a = new ArrayList(localList1);
    this.a.addAll(paramList);
    this.a.addAll(localList2);
    Object localObject1 = localList2.get(0);
    Object localObject2 = null;
    if (paramInt <= 0);
    while (true)
    {
      com.wandoujia.nirvana.framework.network.page.g localg1 = new com.wandoujia.nirvana.framework.network.page.g(paramInt, localObject1, localObject2, paramList);
      a(DataLoadListener.Op.ADD, localg1);
      return;
      localObject2 = (Model)localList1.get(paramInt - 1);
    }
  }

  public final void b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt + 1 > this.a.size()))
      return;
    List localList1 = this.a.subList(0, paramInt);
    List localList2 = this.a.subList(paramInt + 1, this.a.size());
    this.a = new ArrayList(localList1);
    this.a.addAll(localList2);
    com.wandoujia.nirvana.framework.network.page.g localg = new com.wandoujia.nirvana.framework.network.page.g(paramInt, 1);
    a(DataLoadListener.Op.REMOVE, localg);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.model.a
 * JD-Core Version:    0.6.0
 */