package com.wandoujia.jupiter.toolbar;

import android.content.Context;
import android.support.v4.app.d;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.wandoujia.base.utils.SystemUtil;

public class JupiterToolbarForDetail extends JupiterToolbar
{
  private i b;

  public JupiterToolbarForDetail(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public JupiterToolbarForDetail(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected final View a()
  {
    View localView = d.a(this, 2130903562);
    if (this.a > 0)
    {
      localView.findViewById(2131493001).setVisibility(8);
      Toolbar localToolbar = (Toolbar)localView.findViewById(2131493982);
      localToolbar.inflateMenu(this.a);
      MenuItem localMenuItem = localToolbar.getMenu().findItem(2131494118);
      if (localMenuItem != null)
      {
        MythingMenuView localMythingMenuView = new MythingMenuView(getContext());
        if (SystemUtil.aboveApiLevel(11))
          localMenuItem.setActionView(localMythingMenuView);
      }
      this.b = new i(localView);
      localToolbar.setOnMenuItemClickListener$486aeec7(this.b);
      localToolbar.setNavigationIcon(2130838163);
      localToolbar.setNavigationOnClickListener(new b(this));
    }
    return localView;
  }

  public i getListener()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.toolbar.JupiterToolbarForDetail
 * JD-Core Version:    0.6.0
 */