package com.wandoujia.logv3.toolkit.cardshow;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import com.wandoujia.logv3.toolkit.ah;
import java.util.Iterator;
import java.util.List;

public class CardShowGridView extends GridView
{
  private boolean a = false;
  private final h b = new h();
  private j c = new b(this);

  public CardShowGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CardShowGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void a()
  {
    if (this.a)
      this.b.a(this);
  }

  private void setNeedLogCardShow(Adapter paramAdapter)
  {
    Object localObject = paramAdapter;
    if (localObject == null);
    do
    {
      while (true)
      {
        return;
        if (!(localObject instanceof ah))
          break;
        Iterator localIterator = ((ah)localObject).a().iterator();
        while (localIterator.hasNext())
          setNeedLogCardShow((Adapter)localIterator.next());
      }
      if (!(localObject instanceof WrapperListAdapter))
        continue;
      localObject = ((WrapperListAdapter)localObject).getWrappedAdapter();
      break;
    }
    while (!(localObject instanceof a));
    ((a)localObject).a(this.c);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    a();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.a)
      this.b.a();
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    super.setAdapter(paramListAdapter);
    setNeedLogCardShow(this.a);
  }

  public void setNeedLogCardShow(boolean paramBoolean)
  {
    this.a = paramBoolean;
    if (!this.a)
      return;
    setNeedLogCardShow(getAdapter());
    setRecyclerListener(new c(this));
    a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.cardshow.CardShowGridView
 * JD-Core Version:    0.6.0
 */