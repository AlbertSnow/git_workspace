import android.annotation.TargetApi;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class ir
{
  public final String a;
  public final long b;
  public final int c;
  public final int d;
  public final float e;
  public final List f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private MediaFormat m;

  @TargetApi(16)
  ir(MediaFormat paramMediaFormat)
  {
    this.m = paramMediaFormat;
    this.a = paramMediaFormat.getString("mime");
    this.g = a(paramMediaFormat, "max-input-size");
    this.c = a(paramMediaFormat, "width");
    this.d = a(paramMediaFormat, "height");
    this.h = a(paramMediaFormat, "channel-count");
    this.i = a(paramMediaFormat, "sample-rate");
    float f1;
    if (paramMediaFormat.containsKey("com.google.android.videos.pixelWidthHeightRatio"))
      f1 = paramMediaFormat.getFloat("com.google.android.videos.pixelWidthHeightRatio");
    while (true)
    {
      this.e = f1;
      this.f = new ArrayList();
      for (int n = 0; paramMediaFormat.containsKey(15 + "csd-" + n); n++)
      {
        ByteBuffer localByteBuffer = paramMediaFormat.getByteBuffer(15 + "csd-" + n);
        byte[] arrayOfByte = new byte[localByteBuffer.limit()];
        localByteBuffer.get(arrayOfByte);
        this.f.add(arrayOfByte);
        localByteBuffer.flip();
      }
      f1 = -1.0F;
    }
    long l1;
    if (paramMediaFormat.containsKey("durationUs"))
      l1 = paramMediaFormat.getLong("durationUs");
    while (true)
    {
      this.b = l1;
      this.j = -1;
      this.k = -1;
      return;
      l1 = -1L;
    }
  }

  public ir(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3, float paramFloat, int paramInt4, int paramInt5, List paramList)
  {
    this.a = paramString;
    this.g = paramInt1;
    this.b = paramLong;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramFloat;
    this.h = paramInt4;
    this.i = paramInt5;
    if (paramList == null)
      paramList = Collections.emptyList();
    this.f = paramList;
    this.j = -1;
    this.k = -1;
  }

  @TargetApi(16)
  private static final int a(MediaFormat paramMediaFormat, String paramString)
  {
    if (paramMediaFormat.containsKey(paramString))
      return paramMediaFormat.getInteger(paramString);
    return -1;
  }

  public static ir a(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3, float paramFloat, List paramList)
  {
    return new ir(paramString, paramInt1, paramLong, paramInt2, paramInt3, paramFloat, -1, -1, paramList);
  }

  public static ir a(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3, List paramList)
  {
    return a(paramString, -1, paramLong, paramInt2, paramInt3, 1.0F, paramList);
  }

  @TargetApi(16)
  private static final void a(MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    if (paramInt != -1)
      paramMediaFormat.setInteger(paramString, paramInt);
  }

  public static ir b(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3, List paramList)
  {
    return new ir(paramString, paramInt1, paramLong, -1, -1, -1.0F, paramInt2, paramInt3, paramList);
  }

  @TargetApi(16)
  public final MediaFormat a()
  {
    if (this.m == null)
    {
      MediaFormat localMediaFormat = new MediaFormat();
      localMediaFormat.setString("mime", this.a);
      a(localMediaFormat, "max-input-size", this.g);
      a(localMediaFormat, "width", this.c);
      a(localMediaFormat, "height", this.d);
      a(localMediaFormat, "channel-count", this.h);
      a(localMediaFormat, "sample-rate", this.i);
      float f1 = this.e;
      if (f1 != -1.0F)
        localMediaFormat.setFloat("com.google.android.videos.pixelWidthHeightRatio", f1);
      for (int n = 0; n < this.f.size(); n++)
        localMediaFormat.setByteBuffer(15 + "csd-" + n, ByteBuffer.wrap((byte[])this.f.get(n)));
      if (this.b != -1L)
        localMediaFormat.setLong("durationUs", this.b);
      a(localMediaFormat, "max-width", this.j);
      a(localMediaFormat, "max-height", this.k);
      this.m = localMediaFormat;
    }
    return this.m;
  }

  public final boolean equals(Object paramObject)
  {
    int n;
    if (this == paramObject)
      n = 1;
    ir localir;
    int i15;
    int i16;
    do
    {
      boolean bool2;
      do
      {
        int i13;
        int i14;
        do
        {
          int i11;
          int i12;
          do
          {
            int i9;
            int i10;
            do
            {
              int i7;
              int i8;
              do
              {
                boolean bool1;
                do
                {
                  int i5;
                  int i6;
                  do
                  {
                    int i3;
                    int i4;
                    do
                    {
                      int i1;
                      int i2;
                      do
                      {
                        Class localClass1;
                        Class localClass2;
                        do
                        {
                          do
                          {
                            return n;
                            n = 0;
                          }
                          while (paramObject == null);
                          localClass1 = getClass();
                          localClass2 = paramObject.getClass();
                          n = 0;
                        }
                        while (localClass1 != localClass2);
                        localir = (ir)paramObject;
                        i1 = this.g;
                        i2 = localir.g;
                        n = 0;
                      }
                      while (i1 != i2);
                      i3 = this.c;
                      i4 = localir.c;
                      n = 0;
                    }
                    while (i3 != i4);
                    i5 = this.d;
                    i6 = localir.d;
                    n = 0;
                  }
                  while (i5 != i6);
                  bool1 = this.e < localir.e;
                  n = 0;
                }
                while (bool1);
                i7 = this.j;
                i8 = localir.j;
                n = 0;
              }
              while (i7 != i8);
              i9 = this.k;
              i10 = localir.k;
              n = 0;
            }
            while (i9 != i10);
            i11 = this.h;
            i12 = localir.h;
            n = 0;
          }
          while (i11 != i12);
          i13 = this.i;
          i14 = localir.i;
          n = 0;
        }
        while (i13 != i14);
        bool2 = ly.a(this.a, localir.a);
        n = 0;
      }
      while (!bool2);
      i15 = this.f.size();
      i16 = localir.f.size();
      n = 0;
    }
    while (i15 != i16);
    for (int i17 = 0; ; i17++)
    {
      if (i17 >= this.f.size())
        break label330;
      boolean bool3 = Arrays.equals((byte[])this.f.get(i17), (byte[])localir.f.get(i17));
      n = 0;
      if (!bool3)
        break;
    }
    label330: return true;
  }

  public final int hashCode()
  {
    int n = 0;
    if (this.l == 0)
    {
      if (this.a == null);
      int i2;
      for (int i1 = 0; ; i1 = this.a.hashCode())
      {
        i2 = 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (i1 + 527) + this.g) + this.c) + this.d) + Float.floatToRawIntBits(this.e)) + (int)this.b) + this.j) + this.k) + this.h) + this.i;
        while (n < this.f.size())
        {
          i2 = i2 * 31 + Arrays.hashCode((byte[])this.f.get(n));
          n++;
        }
      }
      this.l = i2;
    }
    return this.l;
  }

  public final String toString()
  {
    String str = this.a;
    int n = this.g;
    int i1 = this.c;
    int i2 = this.d;
    float f1 = this.e;
    int i3 = this.h;
    int i4 = this.i;
    long l1 = this.b;
    int i5 = this.j;
    int i6 = this.k;
    return 143 + String.valueOf(str).length() + "MediaFormat(" + str + ", " + n + ", " + i1 + ", " + i2 + ", " + f1 + ", " + i3 + ", " + i4 + ", " + l1 + ", " + i5 + ", " + i6 + ")";
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ir
 * JD-Core Version:    0.6.0
 */