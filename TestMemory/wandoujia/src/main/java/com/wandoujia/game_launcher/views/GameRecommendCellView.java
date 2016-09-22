package com.wandoujia.game_launcher.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.wandoujia.game_launcher.lib.R.id;
import com.wandoujia.game_launcher.lib.R.layout;
import com.wandoujia.launcher_base.utils.h;
import java.util.ArrayList;
import java.util.List;

public class GameRecommendCellView extends RelativeLayout
{
  private GameDailyTextView a;
  private GameStoryView b;
  private View c;
  private TextView d;
  private View e;
  private boolean f = true;
  private List<String> g = new ArrayList();
  private String h = null;
  private boolean i = false;
  private boolean j = false;
  private final j k = new c(this);

  public GameRecommendCellView(Context paramContext)
  {
    super(paramContext);
  }

  public GameRecommendCellView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public GameRecommendCellView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static GameRecommendCellView a(ViewGroup paramViewGroup)
  {
    return (GameRecommendCellView)h.b(paramViewGroup, R.layout.game_launcher_recommend_cell);
  }

  public final void a()
  {
    this.b.c();
  }

  public final void a(String paramString)
  {
    com.wandoujia.game_launcher.a.a(paramString, new b(this));
  }

  public final boolean b()
  {
    return this.j;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.i = true;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((GameDailyTextView)findViewById(R.id.daily_title));
    this.b = ((GameStoryView)findViewById(R.id.game_story_card));
    this.b.setGameDailyTextView(this.a);
    this.c = findViewById(R.id.no_data_view);
    this.c.setVisibility(4);
    this.d = ((TextView)this.c.findViewById(R.id.no_data_message));
    this.e = this.c.findViewById(R.id.no_data_refresh);
    this.e.setOnClickListener(new a(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.GameRecommendCellView
 * JD-Core Version:    0.6.0
 */