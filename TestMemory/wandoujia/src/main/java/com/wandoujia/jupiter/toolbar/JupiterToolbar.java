package com.wandoujia.jupiter.toolbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.app.d;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.phoenix2.R.styleable;

public class JupiterToolbar extends FrameLayout
{
  protected int a;
  private i b;

  public JupiterToolbar(Context paramContext)
  {
    super(paramContext);
  }

  public JupiterToolbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public JupiterToolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ToolbarStyle);
    this.a = localTypedArray.getResourceId(0, -1);
    localTypedArray.recycle();
  }

  protected View a()
  {
    View localView = d.a(this, 2130903561);
    if (this.a > 0)
    {
      Toolbar localToolbar = (Toolbar)localView.findViewById(2131492999);
      try
      {
        localToolbar.inflateMenu(this.a);
        if (OemUtil.isOem())
        {
          MenuItem localMenuItem2 = localToolbar.getMenu().findItem(2131494120);
          if (localMenuItem2 != null)
            localMenuItem2.setVisible(false);
        }
        MenuItem localMenuItem1 = localToolbar.getMenu().findItem(2131494118);
        if (localMenuItem1 != null)
        {
          if (!SystemUtil.aboveApiLevel(11))
            break label132;
          localMenuItem1.setActionView(new MythingMenuView(getContext()));
        }
        while (true)
        {
          this.b = new i(localView);
          localToolbar.setOnMenuItemClickListener$486aeec7(this.b);
          return localView;
          label132: localMenuItem1.setOnMenuItemClickListener(new a(this));
        }
      }
      catch (Throwable localThrowable)
      {
      }
    }
    return localView;
  }

  public i getListener()
  {
    return this.b;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    addView(a());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.toolbar.JupiterToolbar
 * JD-Core Version:    0.6.0
 */