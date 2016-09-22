import java.util.Collections;

public final class lo
{
  private static final int[] a = { 48000, 44100, 32000 };
  private static final int[] b = { 2, 1, 2, 3, 3, 4, 4, 5 };

  public static int a(int paramInt1, int paramInt2)
  {
    return (768000 + paramInt2 * (paramInt1 << 3)) / 1536000;
  }

  public static ir a(lu paramlu)
  {
    int i = (0xC0 & paramlu.a()) >> 6;
    int j = a[i];
    int k = paramlu.a();
    int m = b[((k & 0x38) >> 3)];
    if ((k & 0x4) != 0)
      m++;
    return ir.b("audio/ac3", -1, -1L, m, j, Collections.emptyList());
  }

  public static ir b(lu paramlu)
  {
    paramlu.b(2);
    int i = (0xC0 & paramlu.a()) >> 6;
    int j = a[i];
    int k = paramlu.a();
    int m = b[((k & 0xE) >> 1)];
    if ((k & 0x1) != 0)
      m++;
    return ir.b("audio/eac3", -1, -1L, m, j, Collections.emptyList());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     lo
 * JD-Core Version:    0.6.0
 */