package com.wandoujia.launcher.launcher.activity;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.AnimatorSet.Builder;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.game_launcher.lib.R.id;
import com.wandoujia.game_launcher.lib.R.layout;

final class b
  implements Runnable
{
  b(a parama, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    if (GameLauncherActivity.a(this.b.a))
      return;
    AlertDialog localAlertDialog = new AlertDialog.Builder(this.b.a).show();
    View localView1 = LayoutInflater.from(this.b.a).inflate(R.layout.dialog_onboarding, null);
    View localView2 = localView1.findViewById(R.id.speed_up);
    ViewHelper.setAlpha(localView2, 0.0F);
    localAlertDialog.setContentView(localView1);
    if (this.a != null)
      ((ImageView)localView1.findViewById(R.id.game_launcher_icon)).setImageBitmap(this.a);
    View localView3 = localView1.findViewById(R.id.positive_button);
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(localView2, "alpha", new float[] { 0.0F, 1.0F });
    localObjectAnimator1.setDuration(400L);
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(localView2, "translationX", new float[] { -60.0F, 0.0F });
    localObjectAnimator2.setDuration(600L);
    ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(localView2, "translationY", new float[] { 60.0F, 0.0F });
    localObjectAnimator3.setDuration(600L);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.play(localObjectAnimator1).with(localObjectAnimator3).with(localObjectAnimator2);
    localAnimatorSet.start();
    localView3.setOnClickListener(new c(localAlertDialog));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.activity.b
 * JD-Core Version:    0.6.0
 */