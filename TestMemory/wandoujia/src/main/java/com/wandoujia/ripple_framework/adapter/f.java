package com.wandoujia.ripple_framework.adapter;

import android.os.Handler;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.ripple_framework.k;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public abstract class f extends com.wandoujia.nirvana.framework.ui.recycler.a<Model>
  implements DataLoadListener<Model>
{
  private com.wandoujia.nirvana.framework.network.page.f<Model> c = new g();
  private com.wandoujia.nirvana.framework.network.page.a<Model> d;
  private final Handler e = new Handler();
  private final k f;

  public f()
  {
    this(new k());
  }

  private f(k paramk)
  {
    this.f = paramk;
  }

  private static String a(Model paramModel)
  {
    if (paramModel == null)
      return "null";
    return paramModel.n();
  }

  private void h()
  {
    a(this.d.c());
  }

  private void i()
  {
    if ((this.b == null) || (this.b.isEmpty()));
    while (true)
    {
      return;
      if (this.b.size() != this.d.c().size())
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(this.d.c().size());
        arrayOfObject2[1] = Integer.valueOf(this.b.size());
        Log.d("RippleAdapter", "The data size not match, origin is %d, adapter has %d", arrayOfObject2);
      }
      for (int i = 0; i < this.b.size(); i++)
      {
        if (i == ((Model)this.b.get(i)).d())
          continue;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(i);
        arrayOfObject1[1] = Integer.valueOf(((Model)this.b.get(i)).d());
        Log.d("RippleAdapter", "The position not match, need position %d, but is %d", arrayOfObject1);
      }
    }
  }

  private void i(int paramInt)
  {
    while (paramInt < this.b.size())
    {
      ((Model)this.b.get(paramInt)).c(paramInt);
      paramInt++;
    }
  }

  private void j(int paramInt)
  {
    ((Model)this.b.get(paramInt)).c(paramInt);
  }

  public final void a(DataLoadListener.Op paramOp)
  {
  }

  public final void a(DataLoadListener.Op paramOp, com.wandoujia.nirvana.framework.network.page.g<Model> paramg)
  {
    if (this.d == null)
      return;
    Object[] arrayOfObject1 = new Object[5];
    arrayOfObject1[0] = paramOp.name();
    arrayOfObject1[1] = Integer.valueOf(paramg.a);
    arrayOfObject1[2] = a((Model)paramg.c);
    arrayOfObject1[3] = a((Model)paramg.d);
    int i;
    int j;
    List localList;
    Model localModel1;
    Model localModel2;
    com.wandoujia.nirvana.framework.network.page.f localf;
    int k;
    if (paramg.e == null)
    {
      i = 0;
      arrayOfObject1[4] = Integer.valueOf(i);
      Log.d("RippleAdapter", "loading success. op %s, position=%d, at=%s, prev=%s, size=%d", arrayOfObject1);
      j = paramg.a;
      localList = paramg.e;
      localModel1 = h(j);
      localModel2 = h(j - 1);
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(j);
      arrayOfObject2[1] = a(localModel1);
      arrayOfObject2[2] = a(localModel2);
      Log.d("RippleAdapter", "verify. position=%d, at=%s, prev=%s", arrayOfObject2);
      if (j >= 0)
      {
        localf = this.c;
        if ((paramg.c == null) || (localf.a(paramg.c, localModel1)))
          break label226;
        k = 0;
      }
    }
    while (true)
    {
      if (k != 0)
        break label261;
      Log.d("RippleAdapter", "verify fail", new Object[0]);
      h();
      return;
      i = paramg.e.size();
      break;
      label226: if ((paramg.d != null) && (!localf.a(paramg.d, localModel2)))
      {
        k = 0;
        continue;
      }
      k = 1;
    }
    label261: Log.d("RippleAdapter", "verify success", new Object[0]);
    switch (i.a[paramOp.ordinal()])
    {
    default:
      h();
      i(0);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      i();
      if ((!this.d.b()) || (!CollectionUtils.isEmpty(paramg.e)))
        break;
      this.d.i();
      return;
      Object[] arrayOfObject5 = new Object[2];
      arrayOfObject5[0] = Integer.valueOf(j);
      arrayOfObject5[1] = Integer.valueOf(localList.size());
      Log.d("RippleAdapter", "add data at %d, size %d", arrayOfObject5);
      if (!a(j, localList))
        continue;
      i(j);
      continue;
      Object[] arrayOfObject4 = new Object[2];
      arrayOfObject4[0] = Integer.valueOf(j);
      arrayOfObject4[1] = Integer.valueOf(localList.size());
      Log.d("RippleAdapter", "update data at %d, size %d", arrayOfObject4);
      if (localList.size() != 1)
        throw new IllegalStateException("update only support one single item!" + localList.size());
      if (!b(j, localList.get(0)))
        continue;
      j(j);
      continue;
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(j);
      arrayOfObject3[1] = Integer.valueOf(localList.size());
      Log.d("RippleAdapter", "update data at %d, size %d", arrayOfObject3);
      boolean bool = b(j, localList);
      int m = 0;
      if (!bool)
        continue;
      while (m < localList.size())
      {
        j(j + m);
        m++;
      }
      if (!a(localModel1))
        continue;
      i(j);
      continue;
      if (!d(paramg.a, paramg.b))
        continue;
      i(j);
    }
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
  }

  public final void a(com.wandoujia.nirvana.framework.network.page.a<Model> parama)
  {
    this.d = parama;
    this.f.a(this.d);
  }

  public final void a(com.wandoujia.nirvana.framework.ui.recycler.j paramj)
  {
    super.a(paramj);
    int i = paramj.e();
    int j = a();
    if ((this.d != null) && (this.d.b()) && (!CollectionUtils.isEmpty(this.d.c())))
    {
      int k = j - 1 - i;
      if ((k == 0) || (k == 10))
        this.e.post(new h(this));
    }
  }

  public final long b(int paramInt)
  {
    return super.b(paramInt);
  }

  public final void e()
  {
    super.e();
    if (this.f != null)
      this.f.b();
  }

  protected final int g(int paramInt)
  {
    Model localModel = h(paramInt);
    TemplateTypeEnum.TemplateType localTemplateType = localModel.h();
    if ((localTemplateType == TemplateTypeEnum.TemplateType.MORPH_CARD) && (localModel.C() != null) && (localModel.C().morph_detail != null))
      return j.a(localModel.C().morph_detail);
    return localTemplateType.ordinal();
  }

  public final k g()
  {
    return this.f;
  }

  public final Model h(int paramInt)
  {
    if ((this.b != null) && (paramInt >= 0) && (paramInt < this.b.size()))
      return (Model)this.b.get(paramInt);
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.adapter.f
 * JD-Core Version:    0.6.0
 */