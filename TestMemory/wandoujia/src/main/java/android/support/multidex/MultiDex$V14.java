package android.support.multidex;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

final class MultiDex$V14
{
  private static void install(ClassLoader paramClassLoader, List<File> paramList, File paramFile)
  {
    Object localObject = MultiDex.access$300(paramClassLoader, "pathList").get(paramClassLoader);
    MultiDex.access$400(localObject, "dexElements", makeDexElements(localObject, new ArrayList(paramList), paramFile));
  }

  private static Object[] makeDexElements(Object paramObject, ArrayList<File> paramArrayList, File paramFile)
  {
    return (Object[])MultiDex.access$500(paramObject, "makeDexElements", new Class[] { ArrayList.class, File.class }).invoke(paramObject, new Object[] { paramArrayList, paramFile });
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.multidex.MultiDex.V14
 * JD-Core Version:    0.6.0
 */