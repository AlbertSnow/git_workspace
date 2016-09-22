package com.wandoujia.p4.game.fragment;

import android.text.TextUtils;
import com.wandoujia.p4.game.view.GameVideoPlayerControllerView;
import com.wandoujia.phoenix2.videoplayer.p;
import com.wandoujia.phoenix2.videoplayer.q;
import com.wandoujia.phoenix2.videoplayer.x;

final class a
  implements p
{
  a(GameVideoPlayerFragment paramGameVideoPlayerFragment, q paramq)
  {
  }

  public final void a()
  {
    if (!TextUtils.isEmpty(GameVideoPlayerFragment.a(this.b)))
      this.a.a(GameVideoPlayerFragment.a(this.b));
  }

  public final x b()
  {
    GameVideoPlayerFragment.a(this.b, new GameVideoPlayerControllerView(this.b.getActivity()));
    GameVideoPlayerFragment.b(this.b).setMediaPlayerController(this.a);
    if (!TextUtils.isEmpty(GameVideoPlayerFragment.c(this.b)))
      GameVideoPlayerFragment.b(this.b).setTitle(GameVideoPlayerFragment.c(this.b));
    GameVideoPlayerFragment.b(this.b).setPackageName(GameVideoPlayerFragment.d(this.b));
    return GameVideoPlayerFragment.b(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.game.fragment.a
 * JD-Core Version:    0.6.0
 */