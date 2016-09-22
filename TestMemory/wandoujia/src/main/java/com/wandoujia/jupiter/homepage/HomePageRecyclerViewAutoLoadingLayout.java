package com.wandoujia.jupiter.homepage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import com.wandoujia.nirvana.framework.ui.recycler.NirvanaRecyclerView;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;

public class HomePageRecyclerViewAutoLoadingLayout extends RecyclerViewAutoLoadingLayout
{
  private boolean f;
  private boolean g;
  private Runnable h = new y(this);

  public HomePageRecyclerViewAutoLoadingLayout(Context paramContext)
  {
    super(paramContext);
  }

  public HomePageRecyclerViewAutoLoadingLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected final void c()
  {
    this.c.getViewTreeObserver().addOnPreDrawListener(new x(this));
  }

  public void setHomePageHeaderIsExpand(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.HomePageRecyclerViewAutoLoadingLayout
 * JD-Core Version:    0.6.0
 */