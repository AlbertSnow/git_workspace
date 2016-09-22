import java.util.Arrays;

final class pb extends pa
{
  private final byte[] a;

  pb(byte[] paramArrayOfByte)
  {
    super(Arrays.copyOfRange(paramArrayOfByte, 0, 25));
    this.a = paramArrayOfByte;
  }

  final byte[] a()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     pb
 * JD-Core Version:    0.6.0
 */