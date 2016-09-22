import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class db
{
  dd a;
  de b;
  dg c;

  public static boolean a(Map paramMap, Collection paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      if (paramCollection.contains(localIterator.next()))
        continue;
      localIterator.remove();
    }
    return i != paramMap.size();
  }

  public static boolean a(Set paramSet, Object paramObject)
  {
    if (paramSet == paramObject);
    while (true)
    {
      return true;
      if (!(paramObject instanceof Set))
        break;
      Set localSet = (Set)paramObject;
      try
      {
        if (paramSet.size() == localSet.size())
        {
          boolean bool = paramSet.containsAll(localSet);
          if (bool)
            continue;
        }
        return false;
      }
      catch (NullPointerException localNullPointerException)
      {
        return false;
      }
      catch (ClassCastException localClassCastException)
      {
        return false;
      }
    }
    return false;
  }

  protected abstract int a();

  protected abstract int a(Object paramObject);

  protected abstract Object a(int paramInt1, int paramInt2);

  protected abstract Object a(int paramInt, Object paramObject);

  protected abstract void a(int paramInt);

  protected abstract void a(Object paramObject1, Object paramObject2);

  public final Object[] a(Object[] paramArrayOfObject, int paramInt)
  {
    int i = a();
    if (paramArrayOfObject.length < i);
    for (Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i); ; arrayOfObject = paramArrayOfObject)
    {
      for (int j = 0; j < i; j++)
        arrayOfObject[j] = a(j, paramInt);
      if (arrayOfObject.length > i)
        arrayOfObject[i] = null;
      return arrayOfObject;
    }
  }

  protected abstract int b(Object paramObject);

  protected abstract Map b();

  public final Object[] b(int paramInt)
  {
    int i = a();
    Object[] arrayOfObject = new Object[i];
    for (int j = 0; j < i; j++)
      arrayOfObject[j] = a(j, paramInt);
    return arrayOfObject;
  }

  protected abstract void c();
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     db
 * JD-Core Version:    0.6.0
 */