package com.wandoujia.game_launcher.views;

import android.content.Context;
import android.support.v4.app.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.wandoujia.game_launcher.lib.R.id;
import com.wandoujia.game_launcher.lib.R.layout;
import com.wandoujia.launcher_base.utils.h;

public class GameFooterView extends LinearLayout
{
  private View a;
  private View b;
  private View c;

  public GameFooterView(Context paramContext)
  {
    super(paramContext);
  }

  public GameFooterView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public GameFooterView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static GameFooterView a(ViewGroup paramViewGroup)
  {
    return (GameFooterView)h.b(paramViewGroup, R.layout.game_launcher_footer_view);
  }

  public final void a(String paramString)
  {
    if (b.I().equals(b.H(paramString)))
    {
      this.c.setVisibility(8);
      this.a.setVisibility(8);
      return;
    }
    this.c.setVisibility(0);
    this.a.setVisibility(0);
  }

  public View getLeftPanel()
  {
    return this.a;
  }

  public View getRightPanel()
  {
    return this.b;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = findViewById(R.id.left_panel);
    this.b = findViewById(R.id.right_panel);
    this.c = findViewById(R.id.split);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.GameFooterView
 * JD-Core Version:    0.6.0
 */