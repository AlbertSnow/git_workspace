package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

public abstract interface IMediaControllerCallback extends IInterface
{
  public abstract void a();

  public abstract void a(Bundle paramBundle);

  public abstract void a(MediaMetadataCompat paramMediaMetadataCompat);

  public abstract void a(ParcelableVolumeInfo paramParcelableVolumeInfo);

  public abstract void a(PlaybackStateCompat paramPlaybackStateCompat);

  public abstract void a(CharSequence paramCharSequence);

  public abstract void a(String paramString, Bundle paramBundle);

  public abstract void a(List<MediaSessionCompat.QueueItem> paramList);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.session.IMediaControllerCallback
 * JD-Core Version:    0.6.0
 */