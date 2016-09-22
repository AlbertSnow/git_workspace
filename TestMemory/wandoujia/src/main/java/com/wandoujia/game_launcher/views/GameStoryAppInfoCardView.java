package com.wandoujia.game_launcher.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.entities.app.StatLiteInfo;
import com.wandoujia.entities.game.GameLiteInfo;
import com.wandoujia.game_launcher.lib.R.id;
import com.wandoujia.game_launcher.lib.R.layout;
import com.wandoujia.game_launcher.lib.R.string;
import com.wandoujia.game_launcher.models.RecommendModel;
import com.wandoujia.launcher_base.utils.c;
import com.wandoujia.launcher_base.view.button.a.b;
import com.wandoujia.launcher_base.view.stateful.a.a;
import com.wandoujia.launcher_base.view.stateful.view.SuggestionView;

public class GameStoryAppInfoCardView extends LinearLayout
{
  private TextView a;
  private SuggestionView b;
  private a c;
  private GameLiteInfo d;

  public GameStoryAppInfoCardView(Context paramContext)
  {
    super(paramContext);
  }

  public GameStoryAppInfoCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public GameStoryAppInfoCardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(String paramString, int paramInt)
  {
    this.c.a(paramString, paramInt);
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if ((this.d != null) && (this.c != null) && (this.b != null))
      this.c.a(this.b, new b(this.d));
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.c != null)
      this.c.a();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((SuggestionView)findViewById(R.id.app_icon));
    this.a = ((TextView)findViewById(R.id.app_sub_title));
    this.c = new a();
    this.c.a(false);
    this.b.a(R.layout.gf_suggestion_view);
  }

  public void setAppInfo(RecommendModel paramRecommendModel)
  {
    if (paramRecommendModel != null)
    {
      this.d = paramRecommendModel.getApp();
      if (this.d != null)
      {
        TextView localTextView = this.a;
        Context localContext = getContext();
        int i = R.string.game_launch_app_sub_title;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = this.d.getStat().getTotalStr();
        arrayOfObject[1] = TextUtil.formatSizeInfo(c.a(this.d));
        localTextView.setText(localContext.getString(i, arrayOfObject));
        this.c.a(this.b, new b(this.d));
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.GameStoryAppInfoCardView
 * JD-Core Version:    0.6.0
 */