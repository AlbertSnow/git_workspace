package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class cs
  implements AdapterView.OnItemClickListener
{
  cs(SearchView paramSearchView)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    SearchView.a(this.a, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.cs
 * JD-Core Version:    0.6.0
 */