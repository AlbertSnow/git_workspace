import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class hi
{
  static
  {
    "0123456789abcdef".toCharArray();
  }

  public static String a(String paramString)
  {
    if ((paramString != null) && (paramString.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")))
    {
      UUID localUUID = UUID.fromString(paramString);
      byte[] arrayOfByte = new byte[16];
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      localByteBuffer.putLong(localUUID.getMostSignificantBits());
      localByteBuffer.putLong(localUUID.getLeastSignificantBits());
      paramString = gd.a(arrayOfByte, true);
    }
    return paramString;
  }

  public static String a(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return localStringWriter.toString();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     hi
 * JD-Core Version:    0.6.0
 */