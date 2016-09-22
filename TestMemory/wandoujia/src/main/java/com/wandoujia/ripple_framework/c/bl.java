package com.wandoujia.ripple_framework.c;

import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.c.b;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.adapter.e;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class bl extends c
{
  private Set<com.wandoujia.nirvana.framework.ui.a> a = new HashSet();
  private final com.wandoujia.ripple_framework.adapter.a g = ((e)i.k().a("list_adapter_creator")).a();
  private com.wandoujia.ripple_framework.util.k<com.wandoujia.nirvana.framework.ui.a> h;

  private com.wandoujia.nirvana.framework.ui.a a(Model paramModel, ViewGroup paramViewGroup)
  {
    com.wandoujia.ripple_framework.util.k localk = this.h;
    com.wandoujia.nirvana.framework.ui.a locala = null;
    if (localk != null)
      locala = (com.wandoujia.nirvana.framework.ui.a)this.h.a(paramModel.g().getValue());
    if (locala == null)
    {
      locala = this.g.c(paramViewGroup, paramModel.g().ordinal());
      b.b(locala.a, paramModel.g().getValue());
      b.a(locala.a, locala);
    }
    return locala;
  }

  public final void a()
  {
    super.a();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((com.wandoujia.nirvana.framework.ui.a)localIterator.next()).a();
    this.a.clear();
  }

  protected final void a(Model paramModel)
  {
    com.wandoujia.ripple_framework.adapter.a locala = this.g;
    com.wandoujia.ripple_framework.k localk = j();
    if (localk != null)
      locala.g().a(localk.a());
    this.h = ((com.wandoujia.ripple_framework.util.k)j().a(Integer.valueOf(R.id.recycler_pool)));
    ViewGroup localViewGroup = (ViewGroup)e();
    if (CollectionUtils.isEmpty(paramModel.B()))
      localViewGroup.setVisibility(8);
    while (true)
    {
      return;
      localViewGroup.setVisibility(0);
      int i = Math.min(paramModel.B().size(), 2147483647);
      int j = 0;
      if (j < i)
      {
        Model localModel = (Model)paramModel.B().get(j);
        View localView2;
        int k;
        label158: com.wandoujia.nirvana.framework.ui.a locala1;
        if (j < localViewGroup.getChildCount())
        {
          localView2 = localViewGroup.getChildAt(j);
          if (b.c(localView2) == localModel.g().getValue())
          {
            k = 1;
            if (k == 0)
              break label201;
            locala1 = b.a(localView2);
          }
        }
        while (true)
        {
          locala1.a(localModel);
          this.a.add(locala1);
          j++;
          break;
          k = 0;
          break label158;
          label201: if (this.h != null)
            this.h.a(b.c(localView2), b.a(localView2));
          localViewGroup.removeViewAt(j);
          locala1 = a(localModel, localViewGroup);
          localViewGroup.addView(locala1.a, j);
          continue;
          locala1 = a(localModel, localViewGroup);
          localViewGroup.addView(locala1.a);
        }
      }
      while (localViewGroup.getChildCount() > i)
      {
        View localView1 = localViewGroup.getChildAt(-1 + localViewGroup.getChildCount());
        if (this.h != null)
          this.h.a(b.c(localView1), b.a(localView1));
        localViewGroup.removeView(localView1);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bl
 * JD-Core Version:    0.6.0
 */