import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class awb
{
  public volatile int I = -1;

  public static final awb a(awb paramawb, byte[] paramArrayOfByte)
  {
    return a(paramawb, paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  private static awb a(awb paramawb, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      avs localavs = avs.a(paramArrayOfByte, 0, paramInt2);
      paramawb.a(localavs);
      localavs.a(0);
      return paramawb;
    }
    catch (awa localawa)
    {
      throw localawa;
    }
    catch (IOException localIOException)
    {
    }
    throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
  }

  public static final byte[] a(awb paramawb)
  {
    byte[] arrayOfByte = new byte[paramawb.e()];
    int i = arrayOfByte.length;
    try
    {
      avt localavt = avt.a(arrayOfByte, 0, i);
      paramawb.a(localavt);
      if (localavt.a.remaining() != 0)
        throw new IllegalStateException("Did not write as much data as expected.");
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", localIOException);
    }
    return arrayOfByte;
  }

  public int a()
  {
    return 0;
  }

  public abstract awb a(avs paramavs);

  public void a(avt paramavt)
  {
  }

  public awb d()
  {
    return (awb)super.clone();
  }

  public final int e()
  {
    int i = a();
    this.I = i;
    return i;
  }

  public String toString()
  {
    return awc.a(this);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awb
 * JD-Core Version:    0.6.0
 */