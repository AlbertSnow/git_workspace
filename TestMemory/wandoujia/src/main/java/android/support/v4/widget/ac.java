package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

public final class ac extends a
{
  private final ListView a;

  public ac(ListView paramListView)
  {
    super(paramListView);
    this.a = paramListView;
  }

  public final void a(int paramInt)
  {
    ListView localListView = this.a;
    int i = localListView.getFirstVisiblePosition();
    if (i == -1);
    View localView;
    do
    {
      return;
      localView = localListView.getChildAt(0);
    }
    while (localView == null);
    localListView.setSelectionFromTop(i, localView.getTop() - paramInt);
  }

  public final boolean b(int paramInt)
  {
    ListView localListView = this.a;
    int i = localListView.getCount();
    if (i == 0);
    int j;
    int k;
    int m;
    do
    {
      return false;
      j = localListView.getChildCount();
      k = localListView.getFirstVisiblePosition();
      m = k + j;
      if (paramInt <= 0)
        break;
    }
    while ((m >= i) && (localListView.getChildAt(j - 1).getBottom() <= localListView.getHeight()));
    do
    {
      return true;
      if (paramInt >= 0)
        break;
    }
    while ((k > 0) || (localListView.getChildAt(0).getTop() < 0));
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.ac
 * JD-Core Version:    0.6.0
 */