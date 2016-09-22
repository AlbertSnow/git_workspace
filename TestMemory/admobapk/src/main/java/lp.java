public final class lp
{
  public static Object a(Object paramObject)
  {
    if (paramObject == null)
      throw new NullPointerException();
    return paramObject;
  }

  public static void a(boolean paramBoolean)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException();
  }

  public static void a(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException(String.valueOf(paramObject));
  }

  public static void b(boolean paramBoolean)
  {
    if (!paramBoolean)
      throw new IllegalStateException();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     lp
 * JD-Core Version:    0.6.0
 */