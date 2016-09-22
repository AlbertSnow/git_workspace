package com.wandoujia.base.dexs;

import android.content.Context;
import android.os.Build.VERSION;
import com.wandoujia.base.reflect.JavaCalls;
import com.wandoujia.base.utils.ArrayUtil;
import java.io.File;
import java.util.List;

public class ContextLibraryUtility
{
  public static void inject(Context paramContext, File paramFile)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      injectV14(paramContext, paramFile);
      return;
    }
    if (Build.VERSION.SDK_INT >= 9)
    {
      injectV9(paramContext, paramFile);
      return;
    }
    injectBelowV9(paramContext, paramFile);
  }

  private static void injectBelowV9(Context paramContext, File paramFile)
  {
    ClassLoader localClassLoader = paramContext.getClassLoader();
    String[] arrayOfString1 = (String[])JavaCalls.getField(localClassLoader, "mLibPaths");
    String str = paramFile.getAbsolutePath() + "/";
    if (arrayOfString1.length > 0);
    for (String[] arrayOfString2 = (String[])ArrayUtil.insert(arrayOfString1, 1, str); ; arrayOfString2 = new String[] { str })
    {
      JavaCalls.setField(localClassLoader, "mLibPaths", arrayOfString2);
      return;
    }
  }

  private static void injectV14(Context paramContext, File paramFile)
  {
    Object localObject = JavaCalls.getField(paramContext.getClassLoader(), "pathList");
    File[] arrayOfFile1 = (File[])JavaCalls.getField(localObject, "nativeLibraryDirectories");
    if (arrayOfFile1.length > 0);
    for (File[] arrayOfFile2 = (File[])ArrayUtil.insert(arrayOfFile1, 1, paramFile); ; arrayOfFile2 = new File[] { paramFile })
    {
      JavaCalls.setField(localObject, "nativeLibraryDirectories", arrayOfFile2);
      return;
    }
  }

  private static void injectV9(Context paramContext, File paramFile)
  {
    List localList = (List)JavaCalls.getField(paramContext.getClassLoader(), "libraryPathElements");
    String str = paramFile.getAbsolutePath() + "/";
    if (localList.size() > 0)
    {
      localList.add(1, str);
      return;
    }
    localList.add(str);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.dexs.ContextLibraryUtility
 * JD-Core Version:    0.6.0
 */