package com.wandoujia.jupiter.category.fragment;

import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Iterator;
import java.util.List;

final class a
  implements Runnable
{
  a(CategoryDetailFragment paramCategoryDetailFragment, Model paramModel)
  {
  }

  public final void run()
  {
    CategoryDetailFragment.a(this.b, this.a.B());
    Iterator localIterator;
    if (!TextUtils.isEmpty(CategoryDetailFragment.a(this.b)))
      localIterator = this.a.B().iterator();
    for (int i = 0; ; i++)
    {
      if (localIterator.hasNext())
      {
        Model localModel = (Model)localIterator.next();
        if (!CategoryDetailFragment.a(this.b).equals(localModel.n()))
          continue;
        CategoryDetailFragment.b(this.b).setCurrentItem(i);
      }
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.fragment.a
 * JD-Core Version:    0.6.0
 */