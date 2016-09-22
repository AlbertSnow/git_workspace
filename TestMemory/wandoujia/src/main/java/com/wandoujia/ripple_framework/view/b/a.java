package com.wandoujia.ripple_framework.view.b;

import android.support.v4.app.b;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.cm;
import android.view.View;
import com.wandoujia.api.proto.Image;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.ripple.fragment.FeedDetailFragment;
import java.util.ArrayList;
import java.util.List;

public final class a extends LinearLayoutManager
{
  private static final int h = (int)b.c(i.k().g(), 200.0F);
  private static final int i = (int)b.c(i.k().g(), 200.0F);
  private static final int j = (int)b.c(i.k().g(), 150.0F);
  private static final int k = (int)b.c(i.k().g(), 350.0F);
  private static final int l = (int)b.c(i.k().g(), 200.0F);
  private static final int m = (int)b.c(i.k().g(), 100.0F);
  private ArrayList<Integer> n = new ArrayList();
  private com.wandoujia.ripple_framework.adapter.a o;

  public final void a(RecyclerView paramRecyclerView)
  {
    ArrayList localArrayList = new ArrayList();
    this.o = ((com.wandoujia.ripple_framework.adapter.a)paramRecyclerView.getAdapter());
    int i1 = 0;
    Model localModel;
    int i2;
    if (i1 < this.o.f().size())
    {
      localModel = this.o.h(i1);
      TemplateTypeEnum.TemplateType localTemplateType = localModel.h();
      switch (b.a[localTemplateType.ordinal()])
      {
      default:
        i2 = m;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
    }
    while (true)
    {
      localArrayList.add(Integer.valueOf(i2));
      i1++;
      break;
      i2 = FeedDetailFragment.a;
      continue;
      i2 = h;
      continue;
      i2 = i;
      continue;
      i2 = (int)b.c(i.k().g(), 1.66F * localModel.n().length());
      continue;
      int i3 = j;
      if (!CollectionUtils.isEmpty(localModel.v()))
      {
        Integer localInteger1 = ((Image)localModel.v().get(0)).width;
        Integer localInteger2 = ((Image)localModel.v().get(0)).height;
        if ((localInteger2 != null) && (localInteger1 != null) && (localInteger1.intValue() > 0) && (localInteger2.intValue() > 0))
        {
          i2 = (int)(b.x(i.k().g()) * localInteger2.intValue() / localInteger1.intValue());
          continue;
          i2 = k;
          continue;
          i2 = l;
          continue;
          this.n = localArrayList;
          return;
        }
      }
      i2 = i3;
    }
  }

  public final int b(cm paramcm)
  {
    int i1 = k();
    View localView = b(i1);
    if (localView == null)
      return 0;
    int i2 = 0;
    int i3 = 0;
    while (i2 < i1)
    {
      i3 += ((Integer)this.n.get(i2)).intValue();
      i2++;
    }
    return i3 + -localView.getTop();
  }

  public final int d(cm paramcm)
  {
    return super.d(paramcm);
  }

  public final int f(cm paramcm)
  {
    int i1 = 0;
    int i2 = k();
    int i3 = l();
    for (int i4 = i2; i4 <= i3; i4++)
    {
      View localView = b(i4);
      if (localView == null)
        break;
      int i6 = localView.getHeight();
      if (i6 <= 0)
        continue;
      if ((((Integer)this.n.get(i4)).intValue() != i6) && (this.o != null))
      {
        Model localModel = this.o.h(i4);
        Object[] arrayOfObject = new Object[4];
        arrayOfObject[0] = Integer.valueOf(i4);
        arrayOfObject[1] = localModel.h();
        arrayOfObject[2] = this.n.get(i4);
        arrayOfObject[3] = Integer.valueOf(i6);
        Log.d("ScrollbarLayoutManager", "reset %s %s height from %s to %s.", arrayOfObject);
      }
      this.n.set(i4, Integer.valueOf(i6));
    }
    int i5 = 0;
    while (i1 < this.n.size())
    {
      i5 += ((Integer)this.n.get(i1)).intValue();
      i1++;
    }
    return i5;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.b.a
 * JD-Core Version:    0.6.0
 */