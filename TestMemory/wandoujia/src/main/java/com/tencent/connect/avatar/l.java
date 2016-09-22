package com.tencent.connect.avatar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.Button;

final class l extends View
{
  public l(ImageActivity paramImageActivity, Context paramContext)
  {
    super(paramContext);
  }

  public final void a(Button paramButton)
  {
    StateListDrawable localStateListDrawable = new StateListDrawable();
    Drawable localDrawable1 = ImageActivity.a(this.a, "com.tencent.plus.blue_normal.png");
    Drawable localDrawable2 = ImageActivity.a(this.a, "com.tencent.plus.blue_down.png");
    Drawable localDrawable3 = ImageActivity.a(this.a, "com.tencent.plus.blue_disable.png");
    localStateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, localDrawable2);
    localStateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, localDrawable1);
    localStateListDrawable.addState(View.ENABLED_STATE_SET, localDrawable1);
    localStateListDrawable.addState(View.FOCUSED_STATE_SET, localDrawable1);
    localStateListDrawable.addState(View.EMPTY_STATE_SET, localDrawable3);
    paramButton.setBackgroundDrawable(localStateListDrawable);
  }

  public final void b(Button paramButton)
  {
    StateListDrawable localStateListDrawable = new StateListDrawable();
    Drawable localDrawable1 = ImageActivity.a(this.a, "com.tencent.plus.gray_normal.png");
    Drawable localDrawable2 = ImageActivity.a(this.a, "com.tencent.plus.gray_down.png");
    Drawable localDrawable3 = ImageActivity.a(this.a, "com.tencent.plus.gray_disable.png");
    localStateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, localDrawable2);
    localStateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, localDrawable1);
    localStateListDrawable.addState(View.ENABLED_STATE_SET, localDrawable1);
    localStateListDrawable.addState(View.FOCUSED_STATE_SET, localDrawable1);
    localStateListDrawable.addState(View.EMPTY_STATE_SET, localDrawable3);
    paramButton.setBackgroundDrawable(localStateListDrawable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.avatar.l
 * JD-Core Version:    0.6.0
 */