package android.support.v7.internal.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.mm.sdk.channel.a;

public final class ExpandedMenuView extends ListView
  implements k, z, AdapterView.OnItemClickListener
{
  private static final int[] a = { 16842964, 16843049 };
  private i b;

  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842868);
  }

  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    a locala = a.a(paramContext, paramAttributeSet, a, paramInt);
    if (locala.f(0))
      setBackgroundDrawable(locala.a(0));
    if (locala.f(1))
      setDivider(locala.a(1));
    locala.b();
  }

  public final void a(i parami)
  {
    this.b = parami;
  }

  public final boolean a(m paramm)
  {
    return this.b.b(paramm);
  }

  public final int getWindowAnimations()
  {
    return 0;
  }

  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    a((m)getAdapter().getItem(paramInt));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ExpandedMenuView
 * JD-Core Version:    0.6.0
 */