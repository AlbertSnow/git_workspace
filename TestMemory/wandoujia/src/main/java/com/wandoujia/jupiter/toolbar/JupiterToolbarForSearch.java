package com.wandoujia.jupiter.toolbar;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.wandoujia.base.utils.KeyboardUtils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.search.view.SearchSuggestionTextView;

public class JupiterToolbarForSearch extends JupiterToolbar
{
  private SearchSuggestionTextView b;
  private ImageView c;
  private Runnable d = new g(this);

  public JupiterToolbarForSearch(Context paramContext)
  {
    super(paramContext);
  }

  public JupiterToolbarForSearch(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public JupiterToolbarForSearch(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void b()
  {
    ImageView localImageView = this.c;
    if (TextUtils.isEmpty(this.b.getText()));
    for (int i = 8; ; i = 0)
    {
      localImageView.setVisibility(i);
      return;
    }
  }

  private void setImeVisibility(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      post(this.d);
      return;
    }
    removeCallbacks(this.d);
    KeyboardUtils.hideSoftInput(this);
  }

  protected final View a()
  {
    View localView = android.support.v4.app.d.a(this, 2130903564);
    if (this.a > 0)
    {
      Toolbar localToolbar = (Toolbar)localView.findViewById(2131492999);
      this.b = ((SearchSuggestionTextView)localToolbar.findViewById(2131493984));
      this.b.setOnSearchListener(new c(this));
      this.c = ((ImageView)localToolbar.findViewById(2131493724));
      this.c.setOnClickListener(new d(this));
      this.b.addTextChangedListener(new e(this));
      b();
      localToolbar.inflateMenu(this.a);
      MenuItem localMenuItem = localToolbar.getMenu().findItem(2131494118);
      if (localMenuItem != null)
      {
        MythingMenuView localMythingMenuView = new MythingMenuView(getContext());
        if (SystemUtil.aboveApiLevel(11))
          localMenuItem.setActionView(localMythingMenuView);
      }
      localToolbar.setOnMenuItemClickListener$486aeec7(new f(this));
      a(true);
    }
    return localView;
  }

  public final void a(boolean paramBoolean)
  {
    post(new h(this, paramBoolean));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.toolbar.JupiterToolbarForSearch
 * JD-Core Version:    0.6.0
 */