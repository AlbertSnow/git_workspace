package com.wandoujia.base.utils;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipUtil
{
  public static ZipUtil.ZipResultCode extractGamePacket(Context paramContext, String paramString1, String paramString2, Object paramObject, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean)
  {
    if (LibraryLoaderHelper.loadLibrarySafety(paramContext, "ziputils"))
      try
      {
        ZipUtil.ZipResultCode localZipResultCode = ZipUtil.ZipResultCode.fromCode(nativeExtractGamePacket(paramString1, paramString2, paramObject, paramString3, paramString4, paramString5, paramString6, paramBoolean));
        return localZipResultCode;
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        return ZipUtil.ZipResultCode.ERROR_ZIP_FILE;
      }
    return ZipUtil.ZipResultCode.ERROR_ZIP_FILE;
  }

  public static ZipUtil.ZipResultCode extractZip(Context paramContext, String paramString1, String paramString2)
  {
    return extractZip(paramContext, paramString1, paramString2, null, null, null, null, null, false);
  }

  public static ZipUtil.ZipResultCode extractZip(Context paramContext, String paramString1, String paramString2, Object paramObject, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean)
  {
    if (LibraryLoaderHelper.loadLibrarySafety(paramContext, "ziputils"))
      try
      {
        ZipUtil.ZipResultCode localZipResultCode = ZipUtil.ZipResultCode.fromCode(nativeExtractZip(paramString1, paramString2, paramObject, paramString3, paramString4, paramString5, paramString6, paramBoolean));
        return localZipResultCode;
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        return ZipUtil.ZipResultCode.ERROR_ZIP_FILE;
      }
    return ZipUtil.ZipResultCode.ERROR_ZIP_FILE;
  }

  public static long getUnCompressedSize(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    long l1 = 0L;
    if (LibraryLoaderHelper.loadLibrarySafety(paramContext, "ziputils"));
    try
    {
      long l2 = nativeGetUnCompressedSize(paramString1, paramString2, paramString3);
      l1 = l2;
      return l1;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
    }
    return l1;
  }

  public static InputStream getZipInput(String paramString1, String paramString2)
  {
    ZipFile localZipFile = new ZipFile(paramString1);
    return localZipFile.getInputStream(localZipFile.getEntry(paramString2));
  }

  private static native int nativeExtractGamePacket(String paramString1, String paramString2, Object paramObject, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean);

  private static native int nativeExtractZip(String paramString1, String paramString2, Object paramObject, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean);

  private static native long nativeGetUnCompressedSize(String paramString1, String paramString2, String paramString3);

  @Deprecated
  public static void unZipFolder(String paramString1, String paramString2)
  {
    ZipInputStream localZipInputStream = new ZipInputStream(new FileInputStream(paramString1));
    if (!paramString2.endsWith(File.separator))
      paramString2 = paramString2 + File.separator;
    while (true)
    {
      ZipEntry localZipEntry = localZipInputStream.getNextEntry();
      if (localZipEntry == null)
        break;
      String str1 = localZipEntry.getName();
      if (localZipEntry.isDirectory())
      {
        String str2 = str1.substring(0, -1 + str1.length());
        new File(paramString2 + str2).mkdirs();
        continue;
      }
      File localFile1 = new File(paramString2 + str1);
      File localFile2 = localFile1.getParentFile();
      if (!localFile2.exists())
        localFile2.mkdirs();
      localFile1.createNewFile();
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile1);
      byte[] arrayOfByte = new byte[1024];
      while (true)
      {
        int i = localZipInputStream.read(arrayOfByte);
        if (i == -1)
          break;
        localFileOutputStream.write(arrayOfByte, 0, i);
        localFileOutputStream.flush();
      }
      localFileOutputStream.close();
    }
    localZipInputStream.close();
  }

  private static void zipFiles(String paramString1, String paramString2, ZipOutputStream paramZipOutputStream)
  {
    if (paramZipOutputStream == null);
    while (true)
    {
      return;
      File localFile = new File(paramString1 + paramString2);
      if (localFile.isFile())
      {
        ZipEntry localZipEntry = new ZipEntry(paramString2);
        FileInputStream localFileInputStream = new FileInputStream(localFile);
        paramZipOutputStream.putNextEntry(localZipEntry);
        byte[] arrayOfByte = new byte[4096];
        while (true)
        {
          int i = localFileInputStream.read(arrayOfByte);
          if (i == -1)
            break;
          paramZipOutputStream.write(arrayOfByte, 0, i);
        }
        paramZipOutputStream.closeEntry();
        return;
      }
      String[] arrayOfString = localFile.list();
      if (paramString2.length() > 0)
        paramString2 = paramString2 + File.separator;
      int j = arrayOfString.length;
      int k = 0;
      if (j <= 0)
      {
        paramZipOutputStream.putNextEntry(new ZipEntry(paramString2));
        paramZipOutputStream.closeEntry();
      }
      while (k < arrayOfString.length)
      {
        zipFiles(paramString1, paramString2 + arrayOfString[k], paramZipOutputStream);
        k++;
      }
    }
  }

  public static void zipFolder(String paramString1, String paramString2, boolean paramBoolean)
  {
    ZipOutputStream localZipOutputStream = new ZipOutputStream(new FileOutputStream(paramString2));
    localZipOutputStream.setMethod(8);
    File localFile = new File(paramString1);
    if (!localFile.isDirectory())
      return;
    if (!paramString1.endsWith(File.separator))
      paramString1 = paramString1 + File.separator;
    if (paramBoolean)
      zipFiles(localFile.getParent() + File.separator, localFile.getName(), localZipOutputStream);
    while (true)
    {
      localZipOutputStream.finish();
      localZipOutputStream.close();
      return;
      zipFiles(paramString1, "", localZipOutputStream);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ZipUtil
 * JD-Core Version:    0.6.0
 */