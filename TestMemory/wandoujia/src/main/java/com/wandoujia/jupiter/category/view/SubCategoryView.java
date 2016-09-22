package com.wandoujia.jupiter.category.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.wandoujia.jupiter.category.a.a;

public class SubCategoryView extends LinearLayout
{
  private a a;
  private DataSetObserver b = new c(this);

  public SubCategoryView(Context paramContext)
  {
    super(paramContext);
    setOrientation(1);
  }

  public SubCategoryView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(1);
  }

  public SubCategoryView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(1);
  }

  public void setAdapter(a parama)
  {
    if (parama != null)
    {
      this.a = parama;
      this.a.registerDataSetObserver(this.b);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.view.SubCategoryView
 * JD-Core Version:    0.6.0
 */