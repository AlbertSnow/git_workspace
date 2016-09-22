package com.wandoujia.jupiter.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MultiDex
{
  private static final String CODE_CACHE_NAME = "code_cache";
  private static final String CODE_CACHE_SECONDARY_FOLDER_NAME = "secondary-dexes";
  public static final boolean IS_VM_MULTIDEX_CAPABLE = false;
  private static final int MAX_SUPPORTED_SDK_VERSION = 20;
  private static final int MIN_SDK_VERSION = 4;
  private static final String OLD_SECONDARY_FOLDER_NAME = "secondary-dexes";
  static final String TAG = "MultiDex";
  private static final int VM_WITH_MULTIDEX_VERSION_MAJOR = 2;
  private static final int VM_WITH_MULTIDEX_VERSION_MINOR = 1;
  private static final Set<String> installedApk = new HashSet();

  static
  {
    IS_VM_MULTIDEX_CAPABLE = isVMMultidexCapable(System.getProperty("java.vm.version"));
  }

  private static boolean checkValidZipFiles(List<File> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      if (!MultiDexExtractor.verifyZipFile((File)localIterator.next()))
        return false;
    return true;
  }

  private static void clearOldDexDir(Context paramContext)
  {
    File localFile1 = new File(paramContext.getFilesDir(), "secondary-dexes");
    File[] arrayOfFile;
    if (localFile1.isDirectory())
    {
      new StringBuilder("Clearing old secondary dex dir (").append(localFile1.getPath()).append(").");
      arrayOfFile = localFile1.listFiles();
      if (arrayOfFile == null)
        new StringBuilder("Failed to list secondary dex dir content (").append(localFile1.getPath()).append(").");
    }
    else
    {
      return;
    }
    int i = arrayOfFile.length;
    int j = 0;
    if (j < i)
    {
      File localFile2 = arrayOfFile[j];
      new StringBuilder("Trying to delete old file ").append(localFile2.getPath()).append(" of size ").append(localFile2.length());
      if (!localFile2.delete())
        new StringBuilder("Failed to delete old file ").append(localFile2.getPath());
      while (true)
      {
        j++;
        break;
        new StringBuilder("Deleted old file ").append(localFile2.getPath());
      }
    }
    if (!localFile1.delete())
    {
      new StringBuilder("Failed to delete secondary dex dir ").append(localFile1.getPath());
      return;
    }
    new StringBuilder("Deleted old secondary dex dir ").append(localFile1.getPath());
  }

  private static void expandFieldArray(Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    Field localField = findField(paramObject, paramString);
    Object[] arrayOfObject1 = (Object[])localField.get(paramObject);
    Object[] arrayOfObject2 = (Object[])Array.newInstance(arrayOfObject1.getClass().getComponentType(), arrayOfObject1.length + paramArrayOfObject.length);
    System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, arrayOfObject1.length);
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject2, arrayOfObject1.length, paramArrayOfObject.length);
    localField.set(paramObject, arrayOfObject2);
  }

  private static Field findField(Object paramObject, String paramString)
  {
    Class localClass = paramObject.getClass();
    while (localClass != null)
      try
      {
        Field localField = localClass.getDeclaredField(paramString);
        if (!localField.isAccessible())
          localField.setAccessible(true);
        return localField;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        localClass = localClass.getSuperclass();
      }
    throw new NoSuchFieldException("Field " + paramString + " not found in " + paramObject.getClass());
  }

  private static Method findMethod(Object paramObject, String paramString, Class<?>[] paramArrayOfClass)
  {
    Class localClass = paramObject.getClass();
    while (localClass != null)
      try
      {
        Method localMethod = localClass.getDeclaredMethod(paramString, paramArrayOfClass);
        if (!localMethod.isAccessible())
          localMethod.setAccessible(true);
        return localMethod;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localClass = localClass.getSuperclass();
      }
    throw new NoSuchMethodException("Method " + paramString + " with parameters " + Arrays.asList(paramArrayOfClass) + " not found in " + paramObject.getClass());
  }

  private static ApplicationInfo getApplicationInfo(Context paramContext)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      String str = paramContext.getPackageName();
      if ((localPackageManager == null) || (str == null))
        return null;
      return localPackageManager.getApplicationInfo(str, 128);
    }
    catch (RuntimeException localRuntimeException)
    {
    }
    return null;
  }

  private static File getDexDir(Context paramContext, ApplicationInfo paramApplicationInfo)
  {
    File localFile1 = new File(paramApplicationInfo.dataDir, "code_cache");
    try
    {
      mkdirChecked(localFile1);
      File localFile2 = new File(localFile1, "secondary-dexes");
      mkdirChecked(localFile2);
      return localFile2;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        localFile1 = new File(paramContext.getFilesDir(), "code_cache");
        mkdirChecked(localFile1);
      }
    }
  }

  public static void install(Context paramContext)
  {
    if (IS_VM_MULTIDEX_CAPABLE);
    ApplicationInfo localApplicationInfo;
    String str;
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT < 4)
        throw new RuntimeException("Multi dex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is 4.");
      try
      {
        localApplicationInfo = getApplicationInfo(paramContext);
        if (localApplicationInfo == null)
          continue;
        synchronized (installedApk)
        {
          str = localApplicationInfo.sourceDir;
          if (!installedApk.contains(str))
            break;
          return;
        }
      }
      catch (Exception localException)
      {
        throw new RuntimeException("Multi dex installation failed (" + localException.getMessage() + ").");
      }
    }
    installedApk.add(str);
    if (Build.VERSION.SDK_INT > 20)
      new StringBuilder("MultiDex is not guaranteed to work in SDK version ").append(Build.VERSION.SDK_INT).append(": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"").append(System.getProperty("java.vm.version")).append("\"");
    ClassLoader localClassLoader;
    try
    {
      localClassLoader = paramContext.getClassLoader();
      if (localClassLoader == null)
      {
        monitorexit;
        return;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      monitorexit;
      return;
    }
    try
    {
      clearOldDexDir(paramContext);
      label204: File localFile = getDexDir(paramContext, localApplicationInfo);
      List localList1 = MultiDexExtractor.load(paramContext, localApplicationInfo, localFile, false);
      if (checkValidZipFiles(localList1))
        installSecondaryDexes(localClassLoader, localFile, localList1);
      while (true)
      {
        monitorexit;
        return;
        List localList2 = MultiDexExtractor.load(paramContext, localApplicationInfo, localFile, true);
        if (!checkValidZipFiles(localList2))
          break;
        installSecondaryDexes(localClassLoader, localFile, localList2);
      }
      throw new RuntimeException("Zip files were not valid.");
    }
    catch (Throwable localThrowable)
    {
      break label204;
    }
  }

  private static void installSecondaryDexes(ClassLoader paramClassLoader, File paramFile, List<File> paramList)
  {
    if (!paramList.isEmpty())
    {
      if (Build.VERSION.SDK_INT >= 19)
        MultiDex.V19.access$000(paramClassLoader, paramList, paramFile);
    }
    else
      return;
    if (Build.VERSION.SDK_INT >= 14)
    {
      MultiDex.V14.access$100(paramClassLoader, paramList, paramFile);
      return;
    }
    MultiDex.V4.access$200(paramClassLoader, paramList);
  }

  static boolean isVMMultidexCapable(String paramString)
  {
    int i = 0;
    Matcher localMatcher;
    if (paramString != null)
    {
      localMatcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(paramString);
      boolean bool = localMatcher.matches();
      i = 0;
      if (!bool);
    }
    try
    {
      int j = Integer.parseInt(localMatcher.group(1));
      int k = Integer.parseInt(localMatcher.group(2));
      if (j <= 2)
      {
        i = 0;
        if (j == 2)
        {
          i = 0;
          if (k <= 0);
        }
      }
      else
      {
        i = 1;
      }
      StringBuilder localStringBuilder = new StringBuilder("VM with version ").append(paramString);
      if (i != 0);
      for (String str = " has multidex support"; ; str = " does not have multidex support")
      {
        localStringBuilder.append(str);
        return i;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
        i = 0;
    }
  }

  private static void mkdirChecked(File paramFile)
  {
    paramFile.mkdir();
    if (!paramFile.isDirectory())
    {
      File localFile = paramFile.getParentFile();
      if (localFile == null)
        new StringBuilder("Failed to create dir ").append(paramFile.getPath()).append(". Parent file is null.");
      while (true)
      {
        throw new IOException("Failed to create directory " + paramFile.getPath());
        new StringBuilder("Failed to create dir ").append(paramFile.getPath()).append(". parent file is a dir ").append(localFile.isDirectory()).append(", a file ").append(localFile.isFile()).append(", exists ").append(localFile.exists()).append(", readable ").append(localFile.canRead()).append(", writable ").append(localFile.canWrite());
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.multidex.MultiDex
 * JD-Core Version:    0.6.0
 */