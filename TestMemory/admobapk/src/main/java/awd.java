import java.util.Arrays;

final class awd
{
  final int a;
  final byte[] b;

  awd(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = paramArrayOfByte;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    awd localawd;
    do
    {
      return true;
      if (!(paramObject instanceof awd))
        return false;
      localawd = (awd)paramObject;
    }
    while ((this.a == localawd.a) && (Arrays.equals(this.b, localawd.b)));
    return false;
  }

  public final int hashCode()
  {
    return 31 * (527 + this.a) + Arrays.hashCode(this.b);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awd
 * JD-Core Version:    0.6.0
 */