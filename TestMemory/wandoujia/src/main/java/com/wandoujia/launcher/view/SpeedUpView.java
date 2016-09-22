package com.wandoujia.launcher.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.nineoldandroids.animation.Animator.AnimatorListener;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.AnimatorSet.Builder;
import com.nineoldandroids.animation.ObjectAnimator;
import com.wandoujia.game_launcher.lib.R.drawable;
import com.wandoujia.game_launcher.lib.R.id;
import com.wandoujia.game_launcher.lib.R.layout;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.launcher_base.utils.h;

public class SpeedUpView extends FrameLayout
{
  private AsyncImageView a;
  private TextView b;
  private Animator.AnimatorListener c = new a(this);

  public SpeedUpView(Context paramContext)
  {
    this(paramContext, null);
  }

  public SpeedUpView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SpeedUpView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    addView(h.a(paramContext, R.layout.speed_up_view));
    this.a = ((AsyncImageView)findViewById(R.id.icon));
    this.b = ((TextView)findViewById(R.id.msg));
  }

  public final void a(int paramInt1, int paramInt2)
  {
    WindowManager localWindowManager = (WindowManager)getContext().getSystemService("window");
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    localLayoutParams.type = 2003;
    localLayoutParams.format = -3;
    localLayoutParams.flags = 1064;
    localLayoutParams.gravity = 17;
    localLayoutParams.width = -1;
    localLayoutParams.height = -1;
    localWindowManager.addView(this, localLayoutParams);
    View localView1 = findViewById(R.id.background);
    View localView2 = findViewById(R.id.icon_container);
    View localView3 = findViewById(R.id.icon_bg);
    View localView4 = findViewById(R.id.msg_container);
    float[] arrayOfFloat1 = new float[2];
    arrayOfFloat1[0] = (paramInt1 - localView2.getWidth() / 2);
    arrayOfFloat1[1] = (-localView2.getWidth() / 2);
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(localView2, "translationX", arrayOfFloat1);
    localObjectAnimator1.setDuration(500L);
    float[] arrayOfFloat2 = new float[2];
    arrayOfFloat2[0] = (paramInt2 - localView2.getHeight() / 2);
    arrayOfFloat2[1] = (-localView2.getHeight() / 2);
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(localView2, "translationY", arrayOfFloat2);
    localObjectAnimator2.setDuration(500L);
    ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(localView1, "alpha", new float[] { 0.0F, 1.0F });
    localObjectAnimator3.setDuration(500L);
    ObjectAnimator localObjectAnimator4 = ObjectAnimator.ofFloat(localView3, "alpha", new float[] { 0.0F, 1.0F });
    localObjectAnimator4.setDuration(500L);
    ObjectAnimator localObjectAnimator5 = ObjectAnimator.ofFloat(localView1, "alpha", new float[] { 1.0F, 0.0F });
    localObjectAnimator5.setDuration(500L);
    ObjectAnimator localObjectAnimator6 = ObjectAnimator.ofFloat(localView3, "rotation", new float[] { 0.0F, 3600.0F });
    localObjectAnimator6.setDuration(2000L);
    ObjectAnimator localObjectAnimator7 = ObjectAnimator.ofFloat(localView2, "alpha", new float[] { 1.0F, 0.0F });
    localObjectAnimator7.setDuration(500L);
    ObjectAnimator localObjectAnimator8 = ObjectAnimator.ofFloat(localView4, "alpha", new float[] { 0.0F, 1.0F });
    localObjectAnimator8.setDuration(500L);
    ObjectAnimator localObjectAnimator9 = ObjectAnimator.ofFloat(localView4, "alpha", new float[] { 1.0F, 0.0F });
    localObjectAnimator9.setDuration(500L);
    localObjectAnimator9.setStartDelay(2000L);
    localObjectAnimator9.addListener(this.c);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.play(localObjectAnimator1).with(localObjectAnimator2).with(localObjectAnimator3).before(localObjectAnimator6);
    localAnimatorSet.play(localObjectAnimator6).with(localObjectAnimator4).with(localObjectAnimator5).before(localObjectAnimator7);
    localAnimatorSet.play(localObjectAnimator7).before(localObjectAnimator8).before(localObjectAnimator9);
    localAnimatorSet.start();
  }

  public void setIcon(String paramString)
  {
    this.a.a(paramString, R.drawable.app_icon);
  }

  public void setMsg(String paramString)
  {
    this.b.setText(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.view.SpeedUpView
 * JD-Core Version:    0.6.0
 */