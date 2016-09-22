package com.wandoujia.game_launcher.views;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.b;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import com.wandoujia.game_launcher.lib.R.id;
import com.wandoujia.game_launcher.lib.R.string;

public class GameDailyTextView extends LinearLayout
{
  private TextView a;
  private int b;
  private AnimatorSet c;
  private AnimatorSet d;

  public GameDailyTextView(Context paramContext)
  {
    super(paramContext);
  }

  public GameDailyTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public GameDailyTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a()
  {
    setVisibility(0);
    ObjectAnimator localObjectAnimator = b.b(this, -this.b, 0.0F).setDuration(400L);
    this.d.play(localObjectAnimator);
    this.d.start();
  }

  public final void a(String paramString)
  {
    String str1 = b.I();
    String str2 = b.H(paramString);
    if (str1.equals(str2))
    {
      this.a.setText(getResources().getString(R.string.game_launch_daily_title_today));
      return;
    }
    this.a.setText(String.format(getResources().getString(R.string.game_launch_daily_title), new Object[] { str2 }));
  }

  public final void b()
  {
    ObjectAnimator localObjectAnimator = b.b(this, 0.0F, -this.b).setDuration(400L);
    this.c.play(localObjectAnimator);
    this.c.start();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(R.id.title));
    TextView localTextView = this.a;
    String str = getResources().getString(R.string.game_launch_daily_title);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = b.I();
    localTextView.setText(String.format(str, arrayOfObject));
    this.c = new AnimatorSet();
    this.d = new AnimatorSet();
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.play(b.b(this, 0.0F, -this.b).setDuration(0L));
    localAnimatorSet.start();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.b = View.MeasureSpec.getSize(paramInt1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.GameDailyTextView
 * JD-Core Version:    0.6.0
 */