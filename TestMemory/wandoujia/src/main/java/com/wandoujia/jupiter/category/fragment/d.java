package com.wandoujia.jupiter.category.fragment;

import com.wandoujia.jupiter.homepage.b;

final class d
  implements b
{
  d(CategoryOverallFragment paramCategoryOverallFragment)
  {
  }

  public final void a(int paramInt)
  {
    if (CategoryOverallFragment.b(this.a) != null)
      CategoryOverallFragment.b(this.a).a(paramInt);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    CategoryOverallFragment.a(this.a, paramInt2 + CategoryOverallFragment.a(this.a));
    if (CategoryOverallFragment.b(this.a) != null)
      CategoryOverallFragment.b(this.a).a(paramInt1, paramInt2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.fragment.d
 * JD-Core Version:    0.6.0
 */