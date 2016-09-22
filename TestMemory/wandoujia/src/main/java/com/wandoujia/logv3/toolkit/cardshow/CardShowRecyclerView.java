package com.wandoujia.logv3.toolkit.cardshow;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.by;
import android.util.AttributeSet;
import com.wandoujia.base.config.GlobalConfig;
import java.util.Iterator;
import java.util.List;

public class CardShowRecyclerView extends RecyclerView
{
  private boolean h = false;
  private final o i = new o();
  private j j = new k(this);

  public CardShowRecyclerView(Context paramContext)
  {
    super(paramContext);
  }

  public CardShowRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CardShowRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void setNeedLogCardShow(by paramby)
  {
    by localby = paramby;
    if (localby == null);
    do
    {
      while (true)
      {
        return;
        if (!(localby instanceof l))
          break;
        Iterator localIterator = ((l)localby).a().iterator();
        while (localIterator.hasNext())
          setNeedLogCardShow((by)localIterator.next());
      }
      if ((localby instanceof q))
      {
        localby = ((q)localby).a();
        break;
      }
      if (!(localby instanceof n))
        continue;
      ((n)localby).a(this.j);
      return;
    }
    while (!GlobalConfig.isDebug());
    throw new RuntimeException("CardShowRecyclerView card show log need RecyclerViewCardShowAdapter.");
  }

  public final void h()
  {
    if (this.h)
      this.i.a(this);
  }

  public final void i()
  {
    if (this.h)
      this.i.b();
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    h();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    i();
  }

  public void setAdapter(by paramby)
  {
    super.setAdapter(paramby);
    setNeedLogCardShow(this.h);
  }

  public void setNeedLogCardShow(boolean paramBoolean)
  {
    this.h = paramBoolean;
    if (!this.h)
      return;
    setNeedLogCardShow(getAdapter());
    h();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.cardshow.CardShowRecyclerView
 * JD-Core Version:    0.6.0
 */