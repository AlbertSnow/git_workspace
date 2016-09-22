import java.util.Map;

public final class et
{
  public final byte[] a;
  public final Map b;
  public final boolean c;

  public et(int paramInt, byte[] paramArrayOfByte, Map paramMap, boolean paramBoolean, long paramLong)
  {
    this.a = paramArrayOfByte;
    this.b = paramMap;
    this.c = paramBoolean;
  }

  public et(byte[] paramArrayOfByte, Map paramMap)
  {
    this(200, paramArrayOfByte, paramMap, false, 0L);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     et
 * JD-Core Version:    0.6.0
 */