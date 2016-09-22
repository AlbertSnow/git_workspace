package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class MediaDescriptionCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
  private final String a;
  private final CharSequence b;
  private final CharSequence c;
  private final CharSequence d;
  private final Bitmap e;
  private final Uri f;
  private final Bundle g;
  private Object h;

  private MediaDescriptionCompat(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.c = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.d = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.e = ((Bitmap)paramParcel.readParcelable(null));
    this.f = ((Uri)paramParcel.readParcelable(null));
    this.g = paramParcel.readBundle();
  }

  private MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri, Bundle paramBundle)
  {
    this.a = paramString;
    this.b = paramCharSequence1;
    this.c = paramCharSequence2;
    this.d = paramCharSequence3;
    this.e = paramBitmap;
    this.f = paramUri;
    this.g = paramBundle;
  }

  public static MediaDescriptionCompat a(Object paramObject)
  {
    if ((paramObject == null) || (Build.VERSION.SDK_INT < 21))
      return null;
    b localb = new b();
    localb.a(((MediaDescription)paramObject).getMediaId());
    localb.a(((MediaDescription)paramObject).getTitle());
    localb.b(((MediaDescription)paramObject).getSubtitle());
    localb.c(((MediaDescription)paramObject).getDescription());
    localb.a(((MediaDescription)paramObject).getIconBitmap());
    localb.a(((MediaDescription)paramObject).getIconUri());
    localb.a(((MediaDescription)paramObject).getExtras());
    MediaDescriptionCompat localMediaDescriptionCompat = localb.a();
    localMediaDescriptionCompat.h = paramObject;
    return localMediaDescriptionCompat;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String toString()
  {
    return this.b + ", " + this.c + ", " + this.d;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT < 21)
    {
      paramParcel.writeString(this.a);
      TextUtils.writeToParcel(this.b, paramParcel, paramInt);
      TextUtils.writeToParcel(this.c, paramParcel, paramInt);
      TextUtils.writeToParcel(this.d, paramParcel, paramInt);
      paramParcel.writeParcelable(this.e, paramInt);
      paramParcel.writeParcelable(this.f, paramInt);
      paramParcel.writeBundle(this.g);
      return;
    }
    if ((this.h != null) || (Build.VERSION.SDK_INT < 21));
    for (Object localObject = this.h; ; localObject = this.h)
    {
      ((MediaDescription)localObject).writeToParcel(paramParcel, paramInt);
      return;
      MediaDescription.Builder localBuilder = new MediaDescription.Builder();
      String str = this.a;
      ((MediaDescription.Builder)localBuilder).setMediaId(str);
      CharSequence localCharSequence1 = this.b;
      ((MediaDescription.Builder)localBuilder).setTitle(localCharSequence1);
      CharSequence localCharSequence2 = this.c;
      ((MediaDescription.Builder)localBuilder).setSubtitle(localCharSequence2);
      CharSequence localCharSequence3 = this.d;
      ((MediaDescription.Builder)localBuilder).setDescription(localCharSequence3);
      Bitmap localBitmap = this.e;
      ((MediaDescription.Builder)localBuilder).setIconBitmap(localBitmap);
      Uri localUri = this.f;
      ((MediaDescription.Builder)localBuilder).setIconUri(localUri);
      Bundle localBundle = this.g;
      ((MediaDescription.Builder)localBuilder).setExtras(localBundle);
      this.h = ((MediaDescription.Builder)localBuilder).build();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.MediaDescriptionCompat
 * JD-Core Version:    0.6.0
 */