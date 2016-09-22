import com.google.ads.afma.nano.d;
import com.google.ads.afma.nano.g;
import com.google.ads.afma.nano.j;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class ge
{
  static MessageDigest a;
  static CountDownLatch b;
  private static boolean c = false;
  private static final Object d;
  private static final Object e;

  static
  {
    a = null;
    d = new Object();
    e = new Object();
    b = new CountDownLatch(1);
  }

  private static d a(long paramLong)
  {
    d locald = new d();
    locald.k = Long.valueOf(4096L);
    return locald;
  }

  static String a(d paramd, String paramString, boolean paramBoolean)
  {
    return a(awb.a(paramd), paramString, paramBoolean);
  }

  static String a(String paramString1, String paramString2, boolean paramBoolean)
  {
    byte[] arrayOfByte = b(paramString1, paramString2, true);
    if (arrayOfByte != null)
      return gd.a(arrayOfByte, true);
    return Integer.toString(7);
  }

  private static String a(byte[] paramArrayOfByte, String paramString, boolean paramBoolean)
  {
    byte[] arrayOfByte1;
    if (paramBoolean)
      arrayOfByte1 = b(paramArrayOfByte, paramString, true);
    while (true)
    {
      return gd.a(arrayOfByte1, true);
      Vector localVector = a(paramArrayOfByte, 255);
      if ((localVector == null) || (localVector.size() == 0))
      {
        arrayOfByte1 = b(awb.a(a(4096L)), paramString, true);
        continue;
      }
      j localj = new j();
      localj.a = new byte[localVector.size()][];
      Iterator localIterator = localVector.iterator();
      int j;
      for (int i = 0; localIterator.hasNext(); i = j)
      {
        byte[] arrayOfByte2 = b((byte[])localIterator.next(), paramString, false);
        byte[][] arrayOfByte = localj.a;
        j = i + 1;
        arrayOfByte[i] = arrayOfByte2;
      }
      localj.b = a(paramArrayOfByte);
      arrayOfByte1 = awb.a(localj);
    }
  }

  private static Vector a(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
      return null;
    int i = (-1 + (255 + paramArrayOfByte.length)) / 255;
    Vector localVector = new Vector();
    int j = 0;
    while (true)
    {
      int k;
      if (j < i)
        k = j * 255;
      try
      {
        if (paramArrayOfByte.length - k > 255);
        for (int m = k + 255; ; m = paramArrayOfByte.length)
        {
          localVector.add(Arrays.copyOfRange(paramArrayOfByte, k, m));
          j++;
          break;
        }
        return localVector;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
      }
    }
    return null;
  }

  static void a()
  {
    synchronized (e)
    {
      if (!c)
      {
        c = true;
        new Thread(new gf()).start();
      }
      return;
    }
  }

  public static byte[] a(byte[] paramArrayOfByte)
  {
    MessageDigest localMessageDigest;
    synchronized (d)
    {
      localMessageDigest = b();
      if (localMessageDigest == null)
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }
    localMessageDigest.reset();
    localMessageDigest.update(paramArrayOfByte);
    byte[] arrayOfByte = a.digest();
    monitorexit;
    return arrayOfByte;
  }

  private static MessageDigest b()
  {
    a();
    try
    {
      boolean bool2 = b.await(2L, TimeUnit.SECONDS);
      bool1 = bool2;
      if (!bool1);
      do
        return null;
      while (a == null);
      return a;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        boolean bool1 = false;
    }
  }

  private static byte[] b(String paramString1, String paramString2, boolean paramBoolean)
  {
    g localg = new g();
    try
    {
      byte[] arrayOfByte1;
      Object localObject;
      if (paramString1.length() < 3)
      {
        arrayOfByte1 = paramString1.getBytes("ISO-8859-1");
        localg.a = arrayOfByte1;
        if (!paramBoolean)
          break label81;
        if (paramString2.length() >= 3)
          break label71;
        localObject = paramString2.getBytes("ISO-8859-1");
      }
      while (true)
      {
        localg.b = ((B)localObject);
        return awb.a(localg);
        arrayOfByte1 = gd.a(paramString1, true);
        break;
        label71: localObject = gd.a(paramString2, true);
        continue;
        label81: if ((paramString2 == null) || (paramString2.length() == 0))
        {
          localObject = Integer.toString(5).getBytes("ISO-8859-1");
          continue;
        }
        byte[] arrayOfByte2 = gd.a(a(paramString2.getBytes("ISO-8859-1"), null, true), true);
        localObject = arrayOfByte2;
      }
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      return null;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      label132: break label132;
    }
  }

  private static byte[] b(byte[] paramArrayOfByte, String paramString, boolean paramBoolean)
  {
    int i;
    byte[] arrayOfByte4;
    if (paramBoolean)
    {
      i = 239;
      if (paramArrayOfByte.length > i)
        paramArrayOfByte = awb.a(a(4096L));
      if (paramArrayOfByte.length >= i)
        break label185;
      arrayOfByte4 = new byte[i - paramArrayOfByte.length];
      new SecureRandom().nextBytes(arrayOfByte4);
    }
    label185: for (byte[] arrayOfByte1 = ByteBuffer.allocate(i + 1).put((byte)paramArrayOfByte.length).put(paramArrayOfByte).put(arrayOfByte4).array(); ; arrayOfByte1 = ByteBuffer.allocate(i + 1).put((byte)paramArrayOfByte.length).put(paramArrayOfByte).array())
    {
      if (paramBoolean)
      {
        byte[] arrayOfByte3 = a(arrayOfByte1);
        arrayOfByte1 = ByteBuffer.allocate(256).put(arrayOfByte3).put(arrayOfByte1).array();
      }
      byte[] arrayOfByte2 = new byte[256];
      new gg().a(arrayOfByte1, arrayOfByte2);
      if ((paramString != null) && (paramString.length() > 0))
      {
        if (paramString.length() > 32)
          paramString = paramString.substring(0, 32);
        new avr(paramString.getBytes("UTF-8")).a(arrayOfByte2);
      }
      return arrayOfByte2;
      i = 255;
      break;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ge
 * JD-Core Version:    0.6.0
 */