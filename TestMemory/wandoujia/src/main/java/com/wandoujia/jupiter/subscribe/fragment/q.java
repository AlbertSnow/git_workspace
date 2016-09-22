package com.wandoujia.jupiter.subscribe.fragment;

import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.nirvana.framework.ui.recycler.NirvanaRecyclerView;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.aa;
import java.util.List;

final class q
  implements aa
{
  public final boolean a(com.wandoujia.nirvana.framework.network.page.a<Model> parama, NirvanaRecyclerView paramNirvanaRecyclerView)
  {
    if ((parama == null) || (paramNirvanaRecyclerView == null));
    label103: label107: 
    while (true)
    {
      return false;
      int i;
      if ((parama.c().isEmpty()) && (!parama.b()) && (paramNirvanaRecyclerView.getAdapter() != null) && (((com.wandoujia.nirvana.framework.ui.recycler.a)paramNirvanaRecyclerView.getAdapter()).c() == 0))
      {
        i = 1;
        if ((parama.c().size() != 1) || (!((Model)parama.a(0)).g().equals(TemplateTypeEnum.TemplateType.END)))
          break label103;
      }
      for (int j = 1; ; j = 0)
      {
        if ((i == 0) && (j == 0))
          break label107;
        return true;
        i = 0;
        break;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.q
 * JD-Core Version:    0.6.0
 */