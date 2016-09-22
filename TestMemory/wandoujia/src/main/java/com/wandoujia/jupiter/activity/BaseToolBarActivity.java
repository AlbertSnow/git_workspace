package com.wandoujia.jupiter.activity;

import android.content.res.Resources;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.ripple_framework.activity.BaseActivity;

@Deprecated
public class BaseToolBarActivity extends BaseActivity
{
  private Toolbar a;
  private View b;

  protected void c()
  {
    findViewById(2131493000);
    this.a = ((Toolbar)findViewById(2131492999));
    findViewById(2131493001);
    this.b = findViewById(2131493002);
    if (this.a == null);
    do
    {
      return;
      this.a.setTitle(getTitle());
      this.a.setNavigationIcon(2130838122);
      this.a.setBackgroundColor(getResources().getColor(2131361989));
      this.a.setTitleTextColor(getResources().getColor(2131362141));
      this.a.setNavigationOnClickListener(new b(this));
    }
    while ((!SystemUtil.aboveApiLevel(19)) || (this.b == null));
    this.b.setVisibility(0);
  }

  public void setContentView(int paramInt)
  {
    super.setContentView(paramInt);
    c();
  }

  public void setTitle(int paramInt)
  {
    if (this.a != null)
      this.a.setTitle(getString(paramInt));
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    if (this.a != null)
      this.a.setTitle(paramCharSequence);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.BaseToolBarActivity
 * JD-Core Version:    0.6.0
 */