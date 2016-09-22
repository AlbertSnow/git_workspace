import android.os.Parcel;

public final class aoc extends RuntimeException
{
  public aoc(String paramString, Parcel paramParcel)
  {
    super(41 + String.valueOf(paramString).length() + paramString + " Parcel: pos=" + i + " size=" + j);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aoc
 * JD-Core Version:    0.6.0
 */