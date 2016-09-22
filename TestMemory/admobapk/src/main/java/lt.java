public final class lt
{
  public static String a(String paramString)
  {
    int i = paramString.indexOf('/');
    if (i == -1)
    {
      String str1 = String.valueOf(paramString);
      if (str1.length() != 0);
      for (String str2 = "Invalid mime type: ".concat(str1); ; str2 = new String("Invalid mime type: "))
        throw new IllegalArgumentException(str2);
    }
    return paramString.substring(0, i);
  }

  public static boolean b(String paramString)
  {
    return a(paramString).equals("audio");
  }

  public static boolean c(String paramString)
  {
    return ("audio/ac3".equals(paramString)) || ("audio/eac3".equals(paramString));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     lt
 * JD-Core Version:    0.6.0
 */