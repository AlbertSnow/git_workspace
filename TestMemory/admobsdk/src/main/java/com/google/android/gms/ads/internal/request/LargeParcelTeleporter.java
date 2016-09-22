package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzna;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@zzhb
public final class LargeParcelTeleporter
  implements SafeParcelable
{
  public static final Parcelable.Creator<LargeParcelTeleporter> CREATOR = new zzl();
  final int mVersionCode;
  ParcelFileDescriptor zzIq;
  private Parcelable zzIr;
  private boolean zzIs;

  LargeParcelTeleporter(int versionCode, ParcelFileDescriptor parcelFileDescriptor)
  {
    this.mVersionCode = versionCode;
    this.zzIq = parcelFileDescriptor;
    this.zzIr = null;
    this.zzIs = true;
  }

  public LargeParcelTeleporter(SafeParcelable teleportee)
  {
    this.mVersionCode = 1;
    this.zzIq = null;
    this.zzIr = teleportee;
    this.zzIs = false;
  }

  public <T extends SafeParcelable> T zza(Parcelable.Creator<T> paramCreator)
  {
    if (this.zzIs)
    {
      if (this.zzIq == null)
      {
        zzin.e("File descriptor is empty, returning null.");
        return null;
      }
      DataInputStream localDataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zzIq));
      byte[] arrayOfByte;
      try
      {
        arrayOfByte = new byte[localDataInputStream.readInt()];
        localDataInputStream.readFully(arrayOfByte, 0, arrayOfByte.length);
      }
      catch (IOException localIOException)
      {
        throw new IllegalStateException("Could not read from parcel file descriptor", localIOException);
      }
      finally
      {
        zzna.zzb(localDataInputStream);
      }
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.unmarshall(arrayOfByte, 0, arrayOfByte.length);
        localParcel.setDataPosition(0);
        this.zzIr = ((SafeParcelable)paramCreator.createFromParcel(localParcel));
      }
      finally
      {
        localParcel.recycle();
      }
      this.zzIs = false;
    }
    return (SafeParcelable)this.zzIr;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel dest, int flags)
  {
    if (this.zzIq == null)
    {
      Parcel localParcel = Parcel.obtain();
      byte[] arrayOfByte;
      try
      {
        this.zzIr.writeToParcel(localParcel, 0);
        arrayOfByte = localParcel.marshall();
      }
      finally
      {
        localParcel.recycle();
      }
      this.zzIq = zzf(arrayOfByte);
    }
    zzl.zza(this, dest, flags);
  }

  protected <T> ParcelFileDescriptor zzf(byte[] paramArrayOfByte)
  {
    Object localObject = null;
    try
    {
      ParcelFileDescriptor[] arrayOfParcelFileDescriptor = ParcelFileDescriptor.createPipe();
      ParcelFileDescriptor localParcelFileDescriptor = arrayOfParcelFileDescriptor[1];
      ParcelFileDescriptor.AutoCloseOutputStream localAutoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(localParcelFileDescriptor);
      localObject = localAutoCloseOutputStream;
      1 local1 = new Runnable(localAutoCloseOutputStream, paramArrayOfByte)
      {
        public void run()
        {
          DataOutputStream localDataOutputStream = null;
          try
          {
            localDataOutputStream = new DataOutputStream(this.zzIt);
            localDataOutputStream.writeInt(this.zzIu.length);
            localDataOutputStream.write(this.zzIu);
          }
          catch (IOException localIOException)
          {
            zzin.zzb("Error transporting the ad response", localIOException);
            zzr.zzbF().zzb(localIOException, true);
          }
          finally
          {
            if (localDataOutputStream == null)
              zzna.zzb(this.zzIt);
            else
              zzna.zzb(localDataOutputStream);
          }
        }
      };
      new Thread(local1).start();
      return arrayOfParcelFileDescriptor[0];
    }
    catch (IOException localIOException)
    {
      zzin.zzb("Error transporting the ad response", localIOException);
      zzr.zzbF().zzb(localIOException, true);
      zzna.zzb(localObject);
    }
    return null;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.LargeParcelTeleporter
 * JD-Core Version:    0.6.0
 */