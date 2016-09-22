package com.wandoujia.rootkit.c;

import com.wandoujia.rootkit.b;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;

public final class c
{
  public static void a()
  {
    b.a(new c());
  }

  public static boolean b()
  {
    try
    {
      a.a = false;
      d locald = new d(new String[] { "id" });
      com.wandoujia.rootkit.b.c.a().a(locald);
      locald.c();
      boolean bool = a.a;
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static ArrayList<com.wandoujia.rootkit.a.a> c()
  {
    LineNumberReader localLineNumberReader = new LineNumberReader(new FileReader("/proc/mounts"));
    ArrayList localArrayList = new ArrayList();
    while (true)
    {
      String str = localLineNumberReader.readLine();
      if (str == null)
        break;
      String[] arrayOfString = str.split(" ");
      localArrayList.add(new com.wandoujia.rootkit.a.a(new File(arrayOfString[0]), new File(arrayOfString[1]), arrayOfString[2], arrayOfString[3]));
    }
    a.b = localArrayList;
    return localArrayList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rootkit.c.c
 * JD-Core Version:    0.6.0
 */