package com.wandoujia.jupiter.media.controller;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.jupiter.media.activity.VideoPlayActivity;
import com.wandoujia.jupiter.media.view.VideoPlayView;

final class g
  implements View.OnClickListener
{
  g(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent(paramView.getContext(), VideoPlayActivity.class);
    localIntent.putExtra("videoUrl", f.a(this.a).getUrl());
    paramView.getContext().startActivity(localIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.g
 * JD-Core Version:    0.6.0
 */