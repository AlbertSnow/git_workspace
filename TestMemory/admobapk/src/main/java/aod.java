import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class aod
{
  public static int a(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(0xFFFF0000 | paramInt);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }

  public static void a(Parcel paramParcel, int paramInt, float paramFloat)
  {
    b(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat);
  }

  public static void a(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    b(paramParcel, paramInt1, 4);
    paramParcel.writeInt(paramInt2);
  }

  public static void a(Parcel paramParcel, int paramInt, long paramLong)
  {
    b(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong);
  }

  public static void a(Parcel paramParcel, int paramInt, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBundle == null)
      return;
    int i = a(paramParcel, paramInt);
    paramParcel.writeBundle(paramBundle);
    b(paramParcel, i);
  }

  public static void a(Parcel paramParcel, int paramInt, IBinder paramIBinder, boolean paramBoolean)
  {
    if (paramIBinder == null)
      return;
    int i = a(paramParcel, paramInt);
    paramParcel.writeStrongBinder(paramIBinder);
    b(paramParcel, i);
  }

  public static void a(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2, boolean paramBoolean)
  {
    if (paramParcelable == null)
      return;
    int i = a(paramParcel, paramInt1);
    paramParcelable.writeToParcel(paramParcel, paramInt2);
    b(paramParcel, i);
  }

  public static void a(Parcel paramParcel, int paramInt, Integer paramInteger, boolean paramBoolean)
  {
    if (paramInteger == null)
      return;
    b(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramInteger.intValue());
  }

  public static void a(Parcel paramParcel, int paramInt, String paramString, boolean paramBoolean)
  {
    if (paramString == null)
      return;
    int i = a(paramParcel, paramInt);
    paramParcel.writeString(paramString);
    b(paramParcel, i);
  }

  public static void a(Parcel paramParcel, int paramInt, List paramList, boolean paramBoolean)
  {
    if (paramList == null)
      return;
    int i = a(paramParcel, paramInt);
    paramParcel.writeStringList(paramList);
    b(paramParcel, i);
  }

  public static void a(Parcel paramParcel, int paramInt, boolean paramBoolean)
  {
    b(paramParcel, paramInt, 4);
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }

  public static void a(Parcel paramParcel, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramArrayOfByte == null)
      return;
    int i = a(paramParcel, paramInt);
    paramParcel.writeByteArray(paramArrayOfByte);
    b(paramParcel, i);
  }

  public static void a(Parcel paramParcel, int paramInt, int[] paramArrayOfInt, boolean paramBoolean)
  {
    if (paramArrayOfInt == null)
      return;
    int i = a(paramParcel, paramInt);
    paramParcel.writeIntArray(paramArrayOfInt);
    b(paramParcel, i);
  }

  public static void a(Parcel paramParcel, int paramInt1, Parcelable[] paramArrayOfParcelable, int paramInt2, boolean paramBoolean)
  {
    if (paramArrayOfParcelable == null)
      return;
    int i = a(paramParcel, paramInt1);
    int j = paramArrayOfParcelable.length;
    paramParcel.writeInt(j);
    int k = 0;
    if (k < j)
    {
      Parcelable localParcelable = paramArrayOfParcelable[k];
      if (localParcelable == null)
        paramParcel.writeInt(0);
      while (true)
      {
        k++;
        break;
        a(paramParcel, localParcelable, paramInt2);
      }
    }
    b(paramParcel, i);
  }

  private static void a(Parcel paramParcel, Parcelable paramParcelable, int paramInt)
  {
    int i = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int j = paramParcel.dataPosition();
    paramParcelable.writeToParcel(paramParcel, paramInt);
    int k = paramParcel.dataPosition();
    paramParcel.setDataPosition(i);
    paramParcel.writeInt(k - j);
    paramParcel.setDataPosition(k);
  }

  public static void b(Parcel paramParcel, int paramInt)
  {
    int i = paramParcel.dataPosition();
    int j = i - paramInt;
    paramParcel.setDataPosition(paramInt - 4);
    paramParcel.writeInt(j);
    paramParcel.setDataPosition(i);
  }

  private static void b(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 65535)
    {
      paramParcel.writeInt(0xFFFF0000 | paramInt1);
      paramParcel.writeInt(paramInt2);
      return;
    }
    paramParcel.writeInt(paramInt1 | paramInt2 << 16);
  }

  public static void b(Parcel paramParcel, int paramInt, List paramList, boolean paramBoolean)
  {
    if (paramList == null)
      return;
    int i = a(paramParcel, paramInt);
    int j = paramList.size();
    paramParcel.writeInt(j);
    int k = 0;
    if (k < j)
    {
      Parcelable localParcelable = (Parcelable)paramList.get(k);
      if (localParcelable == null)
        paramParcel.writeInt(0);
      while (true)
      {
        k++;
        break;
        a(paramParcel, localParcelable, 0);
      }
    }
    b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aod
 * JD-Core Version:    0.6.0
 */