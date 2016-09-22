package android.support.v7.app;

import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class e
  implements AdapterView.OnItemClickListener
{
  e(d paramd, b paramb)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.b.n.onClick(b.g(this.a), paramInt);
    if (!this.b.p)
      b.g(this.a).dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.e
 * JD-Core Version:    0.6.0
 */