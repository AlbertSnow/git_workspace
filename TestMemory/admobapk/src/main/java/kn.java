import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class kn
  implements jm
{
  long A;
  boolean B;
  jo C;
  private final kk D;
  private long E = -1L;
  private boolean F;
  final km a;
  final lu b;
  final lu c;
  final lu d;
  long e = -1L;
  long f = -1L;
  long g = 1000000L;
  long h = -1L;
  kp i;
  kp j;
  kp k;
  boolean l;
  int m;
  long n;
  boolean o;
  long p = -1L;
  int q = 0;
  long r = -1L;
  ls s;
  ls t;
  boolean u;
  int v;
  int w;
  int x;
  int y;
  int z;

  public kn()
  {
    this(new ki());
  }

  private kn(kk paramkk)
  {
    this.D = paramkk;
    this.D.a(new ko(this));
    this.a = new km();
    this.b = new lu(4);
    this.c = new lu(ByteBuffer.allocate(4).putInt(-1).array());
    this.d = new lu(4);
  }

  static boolean a(String paramString)
  {
    return ("V_VP8".equals(paramString)) || ("V_VP9".equals(paramString)) || ("A_OPUS".equals(paramString)) || ("A_VORBIS".equals(paramString));
  }

  public final int a(jn paramjn, js paramjs)
  {
    this.F = false;
    boolean bool;
    for (int i1 = 1; ; i1 = bool)
    {
      int i2;
      if ((i1 != 0) && (!this.F))
      {
        bool = this.D.a(paramjn);
        if (!bool)
          continue;
        long l1 = paramjn.a();
        if (this.o)
        {
          this.E = l1;
          paramjs.a = this.p;
          this.q = 1;
          this.o = false;
          i2 = 1;
        }
      }
      while (i2 != 0)
      {
        return 1;
        if ((this.q == 2) && (this.E != -1L))
        {
          paramjs.a = this.E;
          this.E = -1L;
          i2 = 1;
          continue;
        }
        i2 = 0;
        continue;
        if (i1 != 0)
          return 0;
        return -1;
      }
    }
  }

  final long a(long paramLong)
  {
    return TimeUnit.NANOSECONDS.toMicros(paramLong * this.g);
  }

  public final void a()
  {
    this.r = -1L;
    this.w = 0;
    this.D.a();
    this.a.a();
  }

  public final void a(jo paramjo)
  {
    this.C = paramjo;
  }

  final void a(jx paramjx)
  {
    paramjx.a(this.A, this.z, this.x, 0, null);
    this.w = 0;
    this.F = true;
  }

  final ArrayList b()
  {
    int i1 = 0;
    byte[] arrayOfByte1;
    try
    {
      arrayOfByte1 = this.j.j;
      if (arrayOfByte1[0] != 2)
        throw new it("Error parsing vorbis codec private");
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      throw new it("Error parsing vorbis codec private");
    }
    int i2 = 0;
    int i3 = 1;
    while (arrayOfByte1[i3] == -1)
    {
      int i4 = i2 + 255;
      i3++;
      i2 = i4;
    }
    int i5 = i3 + 1;
    int i6 = i2 + arrayOfByte1[i3];
    while (arrayOfByte1[i5] == -1)
    {
      i1 += 255;
      i5++;
    }
    int i7 = i5 + 1;
    int i8 = i1 + arrayOfByte1[i5];
    if (arrayOfByte1[i7] != 1)
      throw new it("Error parsing vorbis codec private");
    byte[] arrayOfByte2 = new byte[i6];
    System.arraycopy(arrayOfByte1, i7, arrayOfByte2, 0, i6);
    int i9 = i6 + i7;
    if (arrayOfByte1[i9] != 3)
      throw new it("Error parsing vorbis codec private");
    int i10 = i8 + i9;
    if (arrayOfByte1[i10] != 5)
      throw new it("Error parsing vorbis codec private");
    byte[] arrayOfByte3 = new byte[arrayOfByte1.length - i10];
    System.arraycopy(arrayOfByte1, i10, arrayOfByte3, 0, arrayOfByte1.length - i10);
    ArrayList localArrayList = new ArrayList(2);
    localArrayList.add(arrayOfByte2);
    localArrayList.add(arrayOfByte3);
    return localArrayList;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     kn
 * JD-Core Version:    0.6.0
 */