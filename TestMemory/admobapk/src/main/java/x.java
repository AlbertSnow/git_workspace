import java.lang.reflect.Method;

public final class x
{
  static Method a;
  static boolean b;

  // ERROR //
  public static void a(android.os.Bundle paramBundle, java.lang.String paramString, android.os.IBinder paramIBinder)
  {
    // Byte code:
    //   0: getstatic 19	x:b	Z
    //   3: ifne +41 -> 44
    //   6: ldc 21
    //   8: ldc 23
    //   10: iconst_2
    //   11: anewarray 25	java/lang/Class
    //   14: dup
    //   15: iconst_0
    //   16: ldc 27
    //   18: aastore
    //   19: dup
    //   20: iconst_1
    //   21: ldc 29
    //   23: aastore
    //   24: invokevirtual 33	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   27: astore 8
    //   29: aload 8
    //   31: putstatic 35	x:a	Ljava/lang/reflect/Method;
    //   34: aload 8
    //   36: iconst_1
    //   37: invokevirtual 41	java/lang/reflect/Method:setAccessible	(Z)V
    //   40: iconst_1
    //   41: putstatic 19	x:b	Z
    //   44: getstatic 35	x:a	Ljava/lang/reflect/Method;
    //   47: ifnull +23 -> 70
    //   50: getstatic 35	x:a	Ljava/lang/reflect/Method;
    //   53: aload_0
    //   54: iconst_2
    //   55: anewarray 4	java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: aload_1
    //   61: aastore
    //   62: dup
    //   63: iconst_1
    //   64: aload_2
    //   65: aastore
    //   66: invokevirtual 45	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   69: pop
    //   70: return
    //   71: astore 6
    //   73: ldc 47
    //   75: ldc 49
    //   77: aload 6
    //   79: invokestatic 55	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   82: pop
    //   83: goto -43 -> 40
    //   86: astore_3
    //   87: ldc 47
    //   89: ldc 57
    //   91: aload_3
    //   92: invokestatic 55	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   95: pop
    //   96: aconst_null
    //   97: putstatic 35	x:a	Ljava/lang/reflect/Method;
    //   100: return
    //   101: astore_3
    //   102: goto -15 -> 87
    //   105: astore_3
    //   106: goto -19 -> 87
    //
    // Exception table:
    //   from	to	target	type
    //   6	40	71	java/lang/NoSuchMethodException
    //   50	70	86	java/lang/IllegalAccessException
    //   50	70	101	java/lang/IllegalArgumentException
    //   50	70	105	java/lang/reflect/InvocationTargetException
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     x
 * JD-Core Version:    0.6.0
 */