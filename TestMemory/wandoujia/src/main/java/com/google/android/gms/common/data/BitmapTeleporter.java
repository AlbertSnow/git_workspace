package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.nio.ByteBuffer;

public class BitmapTeleporter
  implements SafeParcelable
{
  public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new c();
  final int a;
  ParcelFileDescriptor b;
  final int c;

  BitmapTeleporter(int paramInt1, ParcelFileDescriptor paramParcelFileDescriptor, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramParcelFileDescriptor;
    this.c = paramInt2;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.b == null)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(null.getRowBytes() * null.getHeight());
      null.copyPixelsToBuffer(localByteBuffer);
      localByteBuffer.array();
      throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
    }
    c.a(this, paramParcel, paramInt | 0x1);
    this.b = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.data.BitmapTeleporter
 * JD-Core Version:    0.6.0
 */