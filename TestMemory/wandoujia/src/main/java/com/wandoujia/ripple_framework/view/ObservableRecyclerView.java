package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.support.v7.widget.cf;
import android.util.AttributeSet;
import android.view.ViewParent;
import com.wandoujia.nirvana.framework.ui.recycler.NirvanaRecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ObservableRecyclerView extends NirvanaRecyclerView
{
  private int h;
  private int i;
  private int j;
  private int k;
  private List<cf> l;
  private r m;
  private cf n = new q(this);

  public ObservableRecyclerView(Context paramContext)
  {
    super(paramContext);
    j();
  }

  public ObservableRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    j();
  }

  public ObservableRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    j();
  }

  private void j()
  {
    this.l = new ArrayList();
    super.setOnScrollListener(this.n);
  }

  public final void a(cf paramcf)
  {
    this.l.add(paramcf);
  }

  public final void b(cf paramcf)
  {
    this.l.remove(paramcf);
  }

  public int getRecyclerViewScrollX()
  {
    return this.i;
  }

  @Deprecated
  public int getRecyclerViewScrollY()
  {
    return this.h;
  }

  public int getScrollItemIndex()
  {
    return this.j;
  }

  public int getScrollItemOffset()
  {
    return this.k;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    for (ViewParent localViewParent = getParent(); ; localViewParent = localViewParent.getParent())
    {
      if (localViewParent != null)
      {
        if (!(localViewParent instanceof am))
          continue;
        ((am)localViewParent).setAssociatedRecyclerView(this);
      }
      return;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      label11: this.i = computeHorizontalScrollOffset();
      this.h = computeVerticalScrollOffset();
      if (this.m != null)
        this.m.a();
      return;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      break label11;
    }
    catch (NullPointerException localNullPointerException)
    {
      break label11;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      break label11;
    }
  }

  public void setOnLayoutListener(r paramr)
  {
    this.m = paramr;
  }

  @Deprecated
  public final void setOnScrollListener(cf paramcf)
  {
    throw new RuntimeException("Use addOnScrollListener instead.");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.ObservableRecyclerView
 * JD-Core Version:    0.6.0
 */