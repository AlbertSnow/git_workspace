import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class pa extends ang
{
  private int a;

  protected pa(byte[] paramArrayOfByte)
  {
    int i;
    int j;
    if (paramArrayOfByte.length != 25)
    {
      i = paramArrayOfByte.length;
      j = paramArrayOfByte.length;
      if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0) && (j > 0) && (j + 0 <= paramArrayOfByte.length))
        break label166;
    }
    label166: StringBuilder localStringBuilder;
    for (Object localObject = null; ; localObject = localStringBuilder.toString())
    {
      String str = String.valueOf(localObject);
      Log.wtf("GoogleCertificates", 51 + String.valueOf(str).length() + "Cert hash data has incorrect length (" + i + "):\n" + str, new Exception());
      paramArrayOfByte = Arrays.copyOfRange(paramArrayOfByte, 0, 25);
      int k = paramArrayOfByte.length;
      boolean bool = false;
      if (k == 25)
        bool = true;
      int m = paramArrayOfByte.length;
      anw.b(bool, 55 + "cert hash data has incorrect length. length=" + m);
      this.a = Arrays.hashCode(paramArrayOfByte);
      return;
      localStringBuilder = new StringBuilder(57 * ((-1 + (j + 16)) / 16));
      int n = 0;
      int i1 = j;
      int i2 = 0;
      if (i1 <= 0)
        continue;
      if (i2 == 0)
        if (j < 65536)
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Integer.valueOf(n);
          localStringBuilder.append(String.format("%04X:", arrayOfObject3));
        }
      while (true)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(0xFF & paramArrayOfByte[n]);
        localStringBuilder.append(String.format(" %02X", arrayOfObject1));
        int i3 = i1 - 1;
        int i4 = i2 + 1;
        if ((i4 == 16) || (i3 == 0))
        {
          localStringBuilder.append('\n');
          i4 = 0;
        }
        n++;
        i2 = i4;
        i1 = i3;
        break;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(n);
        localStringBuilder.append(String.format("%08X:", arrayOfObject2));
        continue;
        if (i2 != 8)
          continue;
        localStringBuilder.append(" -");
      }
    }
  }

  protected static byte[] a(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("ISO-8859-1");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw new AssertionError(localUnsupportedEncodingException);
  }

  abstract byte[] a();

  public final apj b()
  {
    return apn.a(a());
  }

  public final int c()
  {
    return hashCode();
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof anf)))
      return false;
    try
    {
      anf localanf = (anf)paramObject;
      if (localanf.c() != hashCode())
        return false;
      apj localapj = localanf.b();
      if (localapj == null)
        return false;
      byte[] arrayOfByte = (byte[])apn.a(localapj);
      boolean bool = Arrays.equals(a(), arrayOfByte);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("GoogleCertificates", "iCertData failed to retrive data from remote");
    }
    return false;
  }

  public int hashCode()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     pa
 * JD-Core Version:    0.6.0
 */