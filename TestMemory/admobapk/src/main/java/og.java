import com.google.android.gms.clearcut.LogEventParcelable;

final class og extends of
{
  private final LogEventParcelable h;

  og(LogEventParcelable paramLogEventParcelable, aio paramaio)
  {
    super(paramaio);
    this.h = paramLogEventParcelable;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof og))
      return false;
    og localog = (og)paramObject;
    return this.h.equals(localog.h);
  }

  public final String toString()
  {
    String str = String.valueOf(this.h);
    return 12 + String.valueOf(str).length() + "MethodImpl(" + str + ")";
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     og
 * JD-Core Version:    0.6.0
 */