package com.wandoujia.jupiter.subscribe.fragment;

import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.jupiter.category.fragment.CategoryDetailFragment;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public class PublisherCollectionFragment extends CategoryDetailFragment
{
  private int b = 0;

  protected final void a(List<Model> paramList)
  {
    for (int i = 0; ; i++)
    {
      if (i < paramList.size())
      {
        if (!TemplateTypeEnum.TemplateType.DEFAULT_TAB.equals(((Model)paramList.get(i)).g()))
          continue;
        this.b = i;
      }
      super.a(paramList);
      return;
    }
  }

  protected final Class b()
  {
    return PublisherCollectionFragment.UrlKeySubscribeListFragment.class;
  }

  protected final int d()
  {
    return this.b;
  }

  public final void e()
  {
    a(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.PublisherCollectionFragment
 * JD-Core Version:    0.6.0
 */