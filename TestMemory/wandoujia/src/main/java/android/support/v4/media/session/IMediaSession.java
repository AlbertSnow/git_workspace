package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

public abstract interface IMediaSession extends IInterface
{
  public abstract boolean a();

  public abstract boolean b();

  public abstract String c();

  public abstract String d();

  public abstract PendingIntent e();

  public abstract long f();

  public abstract ParcelableVolumeInfo g();

  public abstract MediaMetadataCompat h();

  public abstract PlaybackStateCompat i();

  public abstract List<MediaSessionCompat.QueueItem> j();

  public abstract CharSequence k();

  public abstract Bundle l();

  public abstract int m();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.session.IMediaSession
 * JD-Core Version:    0.6.0
 */