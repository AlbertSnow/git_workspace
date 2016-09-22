package com.wandoujia.p4.game.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import com.wandoujia.p4.game.view.GameVideoPlayerControllerView;
import com.wandoujia.p4.http.b.g;
import com.wandoujia.p4.http.request.d;
import com.wandoujia.phoenix2.videoplayer.VideoPlayerFragment;
import com.wandoujia.phoenix2.videoplayer.p;
import com.wandoujia.phoenix2.videoplayer.q;

public class GameVideoPlayerFragment extends VideoPlayerFragment
{
  private String b;
  private String c;
  private String d;
  private GameVideoPlayerControllerView e;

  public static GameVideoPlayerFragment a(String paramString1, String paramString2, String paramString3)
  {
    GameVideoPlayerFragment localGameVideoPlayerFragment = new GameVideoPlayerFragment();
    localGameVideoPlayerFragment.b = paramString1;
    localGameVideoPlayerFragment.c = paramString2;
    localGameVideoPlayerFragment.d = paramString3;
    return localGameVideoPlayerFragment;
  }

  protected final p a(q paramq)
  {
    return new a(this, paramq);
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (!TextUtils.isEmpty(this.d))
    {
      g localg = new g();
      ((d)localg.getRequestBuilder()).a(this.d, "phoenix_game_video");
      com.wandoujia.p4.a.b().executeAsync(localg, new b(this));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.game.fragment.GameVideoPlayerFragment
 * JD-Core Version:    0.6.0
 */