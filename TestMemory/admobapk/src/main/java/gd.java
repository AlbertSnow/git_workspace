import android.util.Base64;

public final class gd
{
  public static String a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 11; ; i = 2)
      return Base64.encodeToString(paramArrayOfByte, i);
  }

  public static byte[] a(String paramString, boolean paramBoolean)
  {
    int i;
    byte[] arrayOfByte;
    String str1;
    if (paramBoolean)
    {
      i = 11;
      arrayOfByte = Base64.decode(paramString, i);
      if ((arrayOfByte.length != 0) || (paramString.length() <= 0))
        break label77;
      str1 = String.valueOf(paramString);
      if (str1.length() == 0)
        break label63;
    }
    label63: for (String str2 = "Unable to decode ".concat(str1); ; str2 = new String("Unable to decode "))
    {
      throw new IllegalArgumentException(str2);
      i = 2;
      break;
    }
    label77: return arrayOfByte;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     gd
 * JD-Core Version:    0.6.0
 */