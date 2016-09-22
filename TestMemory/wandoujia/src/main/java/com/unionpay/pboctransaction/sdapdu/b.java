package com.unionpay.pboctransaction.sdapdu;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public final class b
{
  public static String[] a;

  static
  {
    new ArrayList();
  }

  public static void a()
  {
    HashSet localHashSet = b();
    a = new String[localHashSet.size()];
    localHashSet.toArray(a);
  }

  private static HashSet<String> b()
  {
    HashSet localHashSet = new HashSet();
    String str1 = "";
    try
    {
      Process localProcess = new ProcessBuilder(new String[0]).command(new String[] { "mount" }).redirectErrorStream(true).start();
      localProcess.waitFor();
      InputStream localInputStream = localProcess.getInputStream();
      byte[] arrayOfByte = new byte[1024];
      while (localInputStream.read(arrayOfByte) != -1)
        str1 = str1 + new String(arrayOfByte);
      localInputStream.close();
      label109: for (String str2 : str1.split("\n"))
      {
        if ((str2.toLowerCase(Locale.US).contains("asec")) || (!str2.matches("(?i).*vold.*(vfat|ntfs|exfat|fat32|ext3|ext4).*rw.*")))
          continue;
        for (String str3 : str2.split(" "))
        {
          if ((!str3.startsWith("/")) || (str3.toLowerCase(Locale.US).contains("vold")))
            continue;
          localHashSet.add(str3);
        }
      }
      return localHashSet;
    }
    catch (Exception localException)
    {
      break label109;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboctransaction.sdapdu.b
 * JD-Core Version:    0.6.0
 */