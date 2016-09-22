import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class ase
{
  public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
  static HashMap b;
  static Object c;
  static String[] d;
  private static Uri e = Uri.parse("content://com.google.android.gsf.gservices/prefix");

  static
  {
    Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    Pattern.compile("^(0|false|f|off|no|n)$", 2);
    d = new String[0];
  }

  public static long a(ContentResolver paramContentResolver, String paramString, long paramLong)
  {
    long l1 = 0L;
    String str = a(paramContentResolver, paramString, null);
    if (str != null);
    try
    {
      long l2 = Long.parseLong(str);
      l1 = l2;
      return l1;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return l1;
  }

  public static String a(ContentResolver paramContentResolver, String paramString1, String paramString2)
  {
    monitorenter;
    Object localObject2;
    try
    {
      a(paramContentResolver);
      localObject2 = c;
      if (b.containsKey(paramString1))
      {
        String str2 = (String)b.get(paramString1);
        if (str2 != null)
          paramString2 = str2;
        return paramString2;
      }
      monitorexit;
      String[] arrayOfString = d;
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
        if (paramString1.startsWith(arrayOfString[j]))
          break label233;
    }
    finally
    {
      monitorexit;
    }
    Cursor localCursor = paramContentResolver.query(a, null, null, new String[] { paramString1 }, null);
    if (localCursor != null);
    try
    {
      if (!localCursor.moveToFirst())
      {
        b.put(paramString1, null);
        return paramString2;
      }
      String str1 = localCursor.getString(1);
      monitorenter;
      try
      {
        if (localObject2 == c)
          b.put(paramString1, str1);
        monitorexit;
        if (str1 != null)
          paramString2 = str1;
        if (localCursor != null)
        {
          localCursor.close();
          return paramString2;
        }
      }
      finally
      {
        monitorexit;
      }
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
    label233: return paramString2;
  }

  private static void a(ContentResolver paramContentResolver)
  {
    if (b == null)
    {
      b = new HashMap();
      c = new Object();
      new asf("Gservices", paramContentResolver).start();
    }
  }

  public static void a(ContentResolver paramContentResolver, String[] paramArrayOfString)
  {
    Map localMap = b(paramContentResolver, paramArrayOfString);
    monitorenter;
    try
    {
      a(paramContentResolver);
      d = paramArrayOfString;
      Iterator localIterator = localMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        b.put((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
    finally
    {
      monitorexit;
    }
    monitorexit;
  }

  private static Map b(ContentResolver paramContentResolver, String[] paramArrayOfString)
  {
    Cursor localCursor = paramContentResolver.query(e, null, null, paramArrayOfString, null);
    TreeMap localTreeMap = new TreeMap();
    if (localCursor == null)
      return localTreeMap;
    try
    {
      if (localCursor.moveToNext())
        localTreeMap.put(localCursor.getString(0), localCursor.getString(1));
    }
    finally
    {
      localCursor.close();
    }
    return localTreeMap;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ase
 * JD-Core Version:    0.6.0
 */