package com.wandoujia.launcher_base.view.stateful.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.launcher_base.R.drawable;
import com.wandoujia.launcher_base.R.id;
import com.wandoujia.launcher_base.R.layout;
import com.wandoujia.launcher_base.R.string;
import com.wandoujia.launcher_base.utils.h;

public class SuggestionView extends RelativeLayout
  implements StatefulView
{
  private DoubleIcon a;
  private StatefulIcon b;
  private TextView c;
  private StatefulView.State d = StatefulView.State.INIT;
  private String e;

  public SuggestionView(Context paramContext)
  {
    this(paramContext, null);
  }

  public SuggestionView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SuggestionView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(R.layout.default_suggestion_view);
  }

  public final void a(int paramInt)
  {
    removeAllViews();
    addView(h.a(getContext(), paramInt));
    this.b = ((StatefulIcon)findViewById(R.id.stateful_icon));
    this.c = ((TextView)findViewById(R.id.text_title));
    this.a = ((DoubleIcon)findViewById(R.id.double_icon));
    this.a.setIconSmallByResource(R.drawable.ic_launcher_download_small);
  }

  public final void a(String paramString1, String paramString2)
  {
    if (AppManager.a().h(paramString1))
    {
      this.a.b(paramString1, R.drawable.game_icon_placehoder);
      return;
    }
    this.a.a(paramString2, R.drawable.game_icon_placehoder);
  }

  public View getIcon()
  {
    return this.a.getIconBig();
  }

  public StatefulView.State getState()
  {
    return this.d;
  }

  public void setClickListener(View.OnClickListener paramOnClickListener)
  {
    setOnClickListener(paramOnClickListener);
  }

  public void setIcon(String paramString)
  {
    this.a.a(paramString, R.drawable.game_icon_placehoder);
  }

  public void setLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    setOnLongClickListener(paramOnLongClickListener);
  }

  public void setProgress(int paramInt)
  {
    this.b.setProgress(paramInt);
  }

  public void setState(StatefulView.State paramState)
  {
    if (paramState == this.d)
      return;
    this.d = paramState;
    switch (a.a[this.d.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      this.a.setIconSmallVisible(false);
      return;
      this.b.setVisibility(4);
      this.b.setProgress(0);
      this.a.setIconSmallVisible(true);
      return;
      this.b.setVisibility(0);
      this.b.setIconState(StatefulIcon.IconState.DOWNLOADING);
      this.c.setText(R.string.suggestion_state_downloading);
      continue;
      this.b.setVisibility(0);
      this.b.setIconState(StatefulIcon.IconState.PAUSING);
      this.c.setText(R.string.suggestion_state_pausing);
      continue;
      this.c.setText(R.string.suggestion_state_unzipping);
      continue;
      this.c.setText(R.string.suggestion_state_installing);
      continue;
      this.b.setVisibility(4);
      this.c.setText(R.string.suggestion_state_ready);
      continue;
      this.b.setVisibility(4);
      this.c.setText(this.e);
    }
  }

  public void setTitle(String paramString)
  {
    this.e = paramString;
    this.c.setText(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.stateful.view.SuggestionView
 * JD-Core Version:    0.6.0
 */