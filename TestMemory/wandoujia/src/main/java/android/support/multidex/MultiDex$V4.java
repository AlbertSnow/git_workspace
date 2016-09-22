package android.support.multidex;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Field;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.ZipFile;

final class MultiDex$V4
{
  private static void install(ClassLoader paramClassLoader, List<File> paramList)
  {
    int i = paramList.size();
    Field localField = MultiDex.access$300(paramClassLoader, "path");
    StringBuilder localStringBuilder = new StringBuilder((String)localField.get(paramClassLoader));
    String[] arrayOfString = new String[i];
    File[] arrayOfFile = new File[i];
    ZipFile[] arrayOfZipFile = new ZipFile[i];
    DexFile[] arrayOfDexFile = new DexFile[i];
    ListIterator localListIterator = paramList.listIterator();
    while (localListIterator.hasNext())
    {
      File localFile = (File)localListIterator.next();
      String str = localFile.getAbsolutePath();
      localStringBuilder.append(':').append(str);
      int j = localListIterator.previousIndex();
      arrayOfString[j] = str;
      arrayOfFile[j] = localFile;
      arrayOfZipFile[j] = new ZipFile(localFile);
      arrayOfDexFile[j] = DexFile.loadDex(str, str + ".dex", 0);
    }
    localField.set(paramClassLoader, localStringBuilder.toString());
    MultiDex.access$400(paramClassLoader, "mPaths", arrayOfString);
    MultiDex.access$400(paramClassLoader, "mFiles", arrayOfFile);
    MultiDex.access$400(paramClassLoader, "mZips", arrayOfZipFile);
    MultiDex.access$400(paramClassLoader, "mDexs", arrayOfDexFile);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.multidex.MultiDex.V4
 * JD-Core Version:    0.6.0
 */