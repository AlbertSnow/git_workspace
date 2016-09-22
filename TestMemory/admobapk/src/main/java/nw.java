import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public final class nw
  implements Parcelable.Creator
{
  public static LogEventParcelable a(Parcel paramParcel)
  {
    int i = aob.a(paramParcel);
    int j = 0;
    PlayLoggerContext localPlayLoggerContext = null;
    byte[] arrayOfByte = null;
    int[] arrayOfInt1 = null;
    String[] arrayOfString = null;
    int[] arrayOfInt2 = null;
    byte[][] arrayOfByte1 = null;
    boolean bool = true;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default:
        aob.b(paramParcel, k);
        break;
      case 1:
        j = aob.d(paramParcel, k);
        break;
      case 2:
        localPlayLoggerContext = (PlayLoggerContext)aob.a(paramParcel, k, PlayLoggerContext.CREATOR);
        break;
      case 3:
        arrayOfByte = aob.k(paramParcel, k);
        break;
      case 4:
        arrayOfInt1 = aob.l(paramParcel, k);
        break;
      case 5:
        int i3 = aob.a(paramParcel, k);
        int i4 = paramParcel.dataPosition();
        if (i3 == 0)
        {
          arrayOfString = null;
          continue;
        }
        arrayOfString = paramParcel.createStringArray();
        paramParcel.setDataPosition(i3 + i4);
        break;
      case 6:
        arrayOfInt2 = aob.l(paramParcel, k);
        break;
      case 7:
        int m = aob.a(paramParcel, k);
        int n = paramParcel.dataPosition();
        if (m == 0)
        {
          arrayOfByte1 = null;
          continue;
        }
        int i1 = paramParcel.readInt();
        arrayOfByte1 = new byte[i1][];
        for (int i2 = 0; i2 < i1; i2++)
          arrayOfByte1[i2] = paramParcel.createByteArray();
        paramParcel.setDataPosition(n + m);
        break;
      case 8:
        bool = aob.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new aoc(37 + "Overread allowed size end=" + i, paramParcel);
    return new LogEventParcelable(j, localPlayLoggerContext, arrayOfByte, arrayOfInt1, arrayOfString, arrayOfInt2, arrayOfByte1, bool);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     nw
 * JD-Core Version:    0.6.0
 */