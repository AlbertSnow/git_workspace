package com.wandoujia.phoenix2.videoplayer;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.wandoujia.jupiter.view.p;
import java.util.List;

final class k
  implements MediaPlayer.OnErrorListener
{
  k(BasePlayerFragment paramBasePlayerFragment)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    this.a.b("what : " + paramInt1 + "  extra :" + paramInt2);
    BasePlayerFragment.h(this.a);
    if ((BasePlayerFragment.i(this.a) < 3) && (paramInt1 == 100))
    {
      BasePlayerFragment.j(this.a).release();
      BasePlayerFragment.k(this.a);
      switch (c.a[BasePlayerFragment.l(this.a).ordinal()])
      {
      default:
      case 1:
      case 2:
      }
    }
    do
    {
      do
      {
        do
          return true;
        while ((BasePlayerFragment.m(this.a) == null) || (BasePlayerFragment.m(this.a).size() <= BasePlayerFragment.d(this.a)));
        BasePlayerFragment.a(this.a, (String)BasePlayerFragment.m(this.a).get(BasePlayerFragment.d(this.a)));
        return true;
      }
      while ((BasePlayerFragment.n(this.a) == null) || (BasePlayerFragment.n(this.a).size() <= BasePlayerFragment.d(this.a)));
      BasePlayerFragment.a(this.a, (String)BasePlayerFragment.n(this.a).get(BasePlayerFragment.d(this.a)));
      return true;
      if ((paramInt1 != 1) || (paramInt2 != -1004))
        continue;
      p.a(this.a.getActivity(), 2131625273, p.b).a();
      return true;
    }
    while (!BasePlayerFragment.o(this.a));
    this.a.g();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.k
 * JD-Core Version:    0.6.0
 */