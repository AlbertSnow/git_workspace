package com.wandoujia.p4.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.wandoujia.phoenix2.av.a.a;
import com.wandoujia.phoenix2.av.a.b;
import com.wandoujia.phoenix2.av.a.d;
import com.wandoujia.phoenix2.av.view.ScrollDownLayout;

public class ContentListView extends ListView
  implements d
{
  private final a a = new a();
  private final b b = new b();
  private boolean c = false;
  private View d;

  public ContentListView(Context paramContext)
  {
    super(paramContext);
    super.setOnScrollListener(this.a);
  }

  public ContentListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setOnScrollListener(this.a);
  }

  public ContentListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    super.setOnScrollListener(this.a);
  }

  public final void a(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.a.b(paramOnScrollListener);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.b.a(this);
    for (ViewParent localViewParent = getParent(); ; localViewParent = localViewParent.getParent())
    {
      if (localViewParent != null)
      {
        if (!(localViewParent instanceof ScrollDownLayout))
          continue;
        ((ScrollDownLayout)localViewParent).setAssociatedListView(this);
      }
      return;
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.b.a(this);
  }

  public void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.a.a(paramOnScrollListener);
  }

  public void setTopShadowView(View paramView)
  {
    if (paramView == null)
      return;
    this.d = paramView;
    f localf = new f(this);
    this.a.a(localf);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.ContentListView
 * JD-Core Version:    0.6.0
 */