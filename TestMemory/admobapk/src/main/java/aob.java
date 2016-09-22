import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class aob
{
  public static int a(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    int j = a(paramParcel, i);
    int k = paramParcel.dataPosition();
    if ((0xFFFF & i) != 20293)
    {
      String str1 = String.valueOf(Integer.toHexString(i));
      if (str1.length() != 0);
      for (String str2 = "Expected object header. Got 0x".concat(str1); ; str2 = new String("Expected object header. Got 0x"))
        throw new aoc(str2, paramParcel);
    }
    int m = k + j;
    if ((m < k) || (m > paramParcel.dataSize()))
      throw new aoc(54 + "Size read is invalid start=" + k + " end=" + m, paramParcel);
    return m;
  }

  public static int a(Parcel paramParcel, int paramInt)
  {
    if ((paramInt & 0xFFFF0000) != -65536)
      return 0xFFFF & paramInt >> 16;
    return paramParcel.readInt();
  }

  public static Parcelable a(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      return null;
    Parcelable localParcelable = (Parcelable)paramCreator.createFromParcel(paramParcel);
    paramParcel.setDataPosition(i + j);
    return localParcelable;
  }

  private static void a(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    int i = a(paramParcel, paramInt1);
    if (i != paramInt2)
    {
      String str = String.valueOf(Integer.toHexString(i));
      throw new aoc(46 + String.valueOf(str).length() + "Expected size " + paramInt2 + " got " + i + " (0x" + str + ")", paramParcel);
    }
  }

  public static void b(Parcel paramParcel, int paramInt)
  {
    paramParcel.setDataPosition(a(paramParcel, paramInt) + paramParcel.dataPosition());
  }

  public static Object[] b(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      return null;
    Object[] arrayOfObject = paramParcel.createTypedArray(paramCreator);
    paramParcel.setDataPosition(i + j);
    return arrayOfObject;
  }

  public static ArrayList c(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      return null;
    ArrayList localArrayList = paramParcel.createTypedArrayList(paramCreator);
    paramParcel.setDataPosition(i + j);
    return localArrayList;
  }

  public static boolean c(Parcel paramParcel, int paramInt)
  {
    a(paramParcel, paramInt, 4);
    return paramParcel.readInt() != 0;
  }

  public static int d(Parcel paramParcel, int paramInt)
  {
    a(paramParcel, paramInt, 4);
    return paramParcel.readInt();
  }

  public static Integer e(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    if (i == 0)
      return null;
    if (i != 4)
    {
      String str = String.valueOf(Integer.toHexString(i));
      throw new aoc(46 + String.valueOf(str).length() + "Expected size 4" + " got " + i + " (0x" + str + ")", paramParcel);
    }
    return Integer.valueOf(paramParcel.readInt());
  }

  public static long f(Parcel paramParcel, int paramInt)
  {
    a(paramParcel, paramInt, 8);
    return paramParcel.readLong();
  }

  public static float g(Parcel paramParcel, int paramInt)
  {
    a(paramParcel, paramInt, 4);
    return paramParcel.readFloat();
  }

  public static String h(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      return null;
    String str = paramParcel.readString();
    paramParcel.setDataPosition(i + j);
    return str;
  }

  public static IBinder i(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      return null;
    IBinder localIBinder = paramParcel.readStrongBinder();
    paramParcel.setDataPosition(i + j);
    return localIBinder;
  }

  public static Bundle j(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      return null;
    Bundle localBundle = paramParcel.readBundle();
    paramParcel.setDataPosition(i + j);
    return localBundle;
  }

  public static byte[] k(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      return null;
    byte[] arrayOfByte = paramParcel.createByteArray();
    paramParcel.setDataPosition(i + j);
    return arrayOfByte;
  }

  public static int[] l(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      return null;
    int[] arrayOfInt = paramParcel.createIntArray();
    paramParcel.setDataPosition(i + j);
    return arrayOfInt;
  }

  public static ArrayList m(Parcel paramParcel, int paramInt)
  {
    int i = a(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0)
      return null;
    ArrayList localArrayList = paramParcel.createStringArrayList();
    paramParcel.setDataPosition(i + j);
    return localArrayList;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aob
 * JD-Core Version:    0.6.0
 */