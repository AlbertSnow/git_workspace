package com.wandoujia.jupiter.fragment;

import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class bg
  implements e<Model>
{
  private ReviewFragment a;

  public bg(ReviewFragment paramReviewFragment)
  {
    this.a = paramReviewFragment;
  }

  public final List<Model> a(List<Model> paramList)
  {
    if (!paramList.isEmpty())
    {
      Model localModel = (Model)paramList.get(0);
      if (this.a != null)
        this.a.a(localModel);
      paramList = localModel.B();
    }
    return paramList;
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.bg
 * JD-Core Version:    0.6.0
 */