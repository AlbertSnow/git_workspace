package com.google.android.gms.ads.internal.overlay;

import android.media.AudioManager.OnAudioFocusChangeListener;

final class l
  implements AudioManager.OnAudioFocusChangeListener
{
  l(f paramf)
  {
  }

  public final void onAudioFocusChange(int paramInt)
  {
    if (paramInt > 0)
      this.a.c();
    do
      return;
    while (paramInt >= 0);
    f localf = this.a;
    localf.c = false;
    localf.a();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.l
 * JD-Core Version:    0.6.0
 */