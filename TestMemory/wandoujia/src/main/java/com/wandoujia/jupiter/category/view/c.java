package com.wandoujia.jupiter.category.view;

import android.database.DataSetObserver;

final class c extends DataSetObserver
{
  c(SubCategoryView paramSubCategoryView)
  {
  }

  public final void onChanged()
  {
    super.onChanged();
    SubCategoryView.a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.view.c
 * JD-Core Version:    0.6.0
 */