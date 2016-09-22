package android.support.multidex;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class MultiDex$V19
{
  private static void install(ClassLoader paramClassLoader, List<File> paramList, File paramFile)
  {
    Object localObject1 = MultiDex.access$300(paramClassLoader, "pathList").get(paramClassLoader);
    ArrayList localArrayList = new ArrayList();
    MultiDex.access$400(localObject1, "dexElements", makeDexElements(localObject1, new ArrayList(paramList), paramFile, localArrayList));
    Field localField;
    IOException[] arrayOfIOException1;
    if (localArrayList.size() > 0)
    {
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
        localIterator.next();
      localField = MultiDex.access$300(paramClassLoader, "dexElementsSuppressedExceptions");
      arrayOfIOException1 = (IOException[])localField.get(paramClassLoader);
      if (arrayOfIOException1 != null)
        break label128;
    }
    label128: IOException[] arrayOfIOException2;
    for (Object localObject2 = (IOException[])localArrayList.toArray(new IOException[localArrayList.size()]); ; localObject2 = arrayOfIOException2)
    {
      localField.set(paramClassLoader, localObject2);
      return;
      arrayOfIOException2 = new IOException[localArrayList.size() + arrayOfIOException1.length];
      localArrayList.toArray(arrayOfIOException2);
      System.arraycopy(arrayOfIOException1, 0, arrayOfIOException2, localArrayList.size(), arrayOfIOException1.length);
    }
  }

  private static Object[] makeDexElements(Object paramObject, ArrayList<File> paramArrayList, File paramFile, ArrayList<IOException> paramArrayList1)
  {
    return (Object[])MultiDex.access$500(paramObject, "makeDexElements", new Class[] { ArrayList.class, File.class, ArrayList.class }).invoke(paramObject, new Object[] { paramArrayList, paramFile, paramArrayList1 });
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.multidex.MultiDex.V19
 * JD-Core Version:    0.6.0
 */