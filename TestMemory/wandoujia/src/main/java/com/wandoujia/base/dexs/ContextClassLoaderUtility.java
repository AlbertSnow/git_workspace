package com.wandoujia.base.dexs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import com.wandoujia.base.reflect.JavaCalls;
import com.wandoujia.base.utils.ArrayUtil;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

@SuppressLint({"NewApi"})
public class ContextClassLoaderUtility
{
  private static final String LOG_TAG = "ContextClassLoaderUtility";

  private static DexFile createDexFile(File paramFile1, File paramFile2)
  {
    if (Build.VERSION.SDK_INT >= 14)
      return (DexFile)JavaCalls.callStaticMethod("dalvik.system.DexPathList", "loadDexFile", new Object[] { paramFile1, paramFile2 });
    String str1 = paramFile1.getAbsolutePath();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = str1;
    arrayOfObject[1] = paramFile2.getAbsolutePath();
    String str2 = (String)JavaCalls.callStaticMethod("dalvik.system.DexClassLoader", "generateOutputName", arrayOfObject);
    try
    {
      DexFile localDexFile = DexFile.loadDex(str1, str2, 0);
      return localDexFile;
    }
    catch (IOException localIOException)
    {
    }
    return null;
  }

  private static a createElement$4a04243e(File paramFile1, File paramFile2)
  {
    Object localObject1 = null;
    String str = paramFile1.getName();
    Object localObject2;
    if (str.endsWith(".dex"))
      localObject2 = createDexFile(paramFile1, paramFile2);
    while (true)
    {
      return new a(paramFile1, (ZipFile)localObject1, (DexFile)localObject2, 0);
      if ((str.endsWith(".apk")) || (str.endsWith(".jar")) || (str.endsWith(".zip")) || (str.endsWith(".so")))
        try
        {
          localZipFile1 = new ZipFile(paramFile1);
          DexFile localDexFile = createDexFile(paramFile1, paramFile2);
          ZipFile localZipFile2 = localZipFile1;
          localObject2 = localDexFile;
          localObject1 = localZipFile2;
        }
        catch (IOException localIOException)
        {
          while (true)
            ZipFile localZipFile1 = null;
        }
    }
    throw new IllegalArgumentException("Unknown file type for: " + paramFile1);
  }

  private static Object[] createEmptyDexElements(int paramInt)
  {
    Object[] arrayOfObject;
    try
    {
      Class localClass = Class.forName("dalvik.system.DexPathList$Element");
      arrayOfObject = new Object[paramInt];
      for (int i = 0; i < paramInt; i++)
        arrayOfObject[i] = JavaCalls.newEmptyInstance(localClass);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new IllegalArgumentException("Can't find class: dalvik.system.DexPathList$Element");
    }
    return arrayOfObject;
  }

  private static Object[] getDexElements(ClassLoader paramClassLoader)
  {
    return (Object[])JavaCalls.getField(JavaCalls.getField(paramClassLoader, "pathList"), "dexElements");
  }

  private static File getOptDir(Context paramContext)
  {
    File localFile = new File(paramContext.getFilesDir(), "opt");
    if (!localFile.exists())
    {
      if (!localFile.mkdirs());
    }
    else
      do
      {
        return localFile;
        if (!localFile.isFile())
          break;
      }
      while ((localFile.delete()) && (localFile.mkdirs()));
    do
      throw new IllegalArgumentException("create opt dir meet ex.");
    while (!localFile.isDirectory());
    return localFile;
  }

  public static void inject(Context paramContext, Set<String> paramSet)
  {
    if ((paramSet == null) || (paramSet.isEmpty()))
      return;
    new StringBuilder("doing inject, paths:").append(paramSet);
    String[] arrayOfString = (String[])paramSet.toArray(new String[paramSet.size()]);
    if (Build.VERSION.SDK_INT >= 14)
    {
      injectV14(paramContext, arrayOfString);
      return;
    }
    injectBelowV14(paramContext, arrayOfString);
  }

  private static void injectBelowV14(Context paramContext, String[] paramArrayOfString)
  {
    File localFile = getOptDir(paramContext);
    File[] arrayOfFile = new File[paramArrayOfString.length];
    ZipFile[] arrayOfZipFile = new ZipFile[paramArrayOfString.length];
    DexFile[] arrayOfDexFile = new DexFile[paramArrayOfString.length];
    for (int i = 0; i < paramArrayOfString.length; i++)
      resetValueBelowV14(new File(paramArrayOfString[i]), localFile, arrayOfFile, arrayOfZipFile, arrayOfDexFile, i);
    ClassLoader localClassLoader = paramContext.getClassLoader();
    Object[] arrayOfObject1 = (Object[])JavaCalls.getField(localClassLoader, "mFiles");
    Object[] arrayOfObject2 = (Object[])JavaCalls.getField(localClassLoader, "mPaths");
    Object[] arrayOfObject3 = (Object[])JavaCalls.getField(localClassLoader, "mZips");
    Object[] arrayOfObject4 = (Object[])JavaCalls.getField(localClassLoader, "mDexs");
    JavaCalls.setField(localClassLoader, "mPaths", ArrayUtil.combineArray(arrayOfObject2, paramArrayOfString));
    JavaCalls.setField(localClassLoader, "mFiles", ArrayUtil.combineArray(arrayOfObject1, arrayOfFile));
    JavaCalls.setField(localClassLoader, "mZips", ArrayUtil.combineArray(arrayOfObject3, arrayOfZipFile));
    JavaCalls.setField(localClassLoader, "mDexs", ArrayUtil.combineArray(arrayOfObject4, arrayOfDexFile));
  }

  private static void injectV14(Context paramContext, String[] paramArrayOfString)
  {
    File localFile = getOptDir(paramContext);
    Object[] arrayOfObject = createEmptyDexElements(paramArrayOfString.length);
    for (int i = 0; i < paramArrayOfString.length; i++)
      resetValueV14(new File(paramArrayOfString[i]), localFile, arrayOfObject[i]);
    ClassLoader localClassLoader = paramContext.getClassLoader();
    setDexElements(localClassLoader, ArrayUtil.combineArray(getDexElements(localClassLoader), arrayOfObject));
  }

  private static void resetValueBelowV14(File paramFile1, File paramFile2, Object[] paramArrayOfObject1, Object[] paramArrayOfObject2, Object[] paramArrayOfObject3, int paramInt)
  {
    a locala = createElement$4a04243e(paramFile1, paramFile2);
    if (locala != null)
    {
      if (paramInt < paramArrayOfObject1.length)
        paramArrayOfObject1[paramInt] = locala.a;
      if (paramInt < paramArrayOfObject2.length)
        paramArrayOfObject2[paramInt] = locala.b;
      if (paramInt < paramArrayOfObject3.length)
        paramArrayOfObject3[paramInt] = locala.c;
    }
  }

  private static void resetValueV14(File paramFile1, File paramFile2, Object paramObject)
  {
    a locala = createElement$4a04243e(paramFile1, paramFile2);
    if (locala != null)
    {
      JavaCalls.setField(paramObject, "file", locala.a);
      JavaCalls.setField(paramObject, "zipFile", locala.b);
      JavaCalls.setField(paramObject, "dexFile", locala.c);
    }
  }

  private static void setDexElements(ClassLoader paramClassLoader, Object[] paramArrayOfObject)
  {
    JavaCalls.setField(JavaCalls.getField(paramClassLoader, "pathList"), "dexElements", paramArrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.dexs.ContextClassLoaderUtility
 * JD-Core Version:    0.6.0
 */