import android.os.IBinder;
import java.lang.reflect.Field;

public final class apn extends apk
{
  private final Object a;

  private apn(Object paramObject)
  {
    this.a = paramObject;
  }

  public static apj a(Object paramObject)
  {
    return new apn(paramObject);
  }

  public static Object a(apj paramapj)
  {
    if ((paramapj instanceof apn))
      return ((apn)paramapj).a;
    IBinder localIBinder = paramapj.asBinder();
    Field[] arrayOfField = localIBinder.getClass().getDeclaredFields();
    if (arrayOfField.length == 1)
    {
      Field localField = arrayOfField[0];
      if (!localField.isAccessible())
      {
        localField.setAccessible(true);
        try
        {
          Object localObject = localField.get(localIBinder);
          return localObject;
        }
        catch (NullPointerException localNullPointerException)
        {
          throw new IllegalArgumentException("Binder object is null.", localNullPointerException);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          throw new IllegalArgumentException("remoteBinder is the wrong class.", localIllegalArgumentException);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          throw new IllegalArgumentException("Could not access the field in remoteBinder.", localIllegalAccessException);
        }
      }
      throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
    throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     apn
 * JD-Core Version:    0.6.0
 */