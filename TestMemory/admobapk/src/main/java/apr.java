import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.lang.reflect.Field;

public final class apr
{
  public static final aqa a;
  private static aqd c;
  private static final aqb d = new aps();
  public final Context b;

  static
  {
    a = new apt();
    new apu();
    new apv();
    new apw();
    new apx();
  }

  private apr(Context paramContext)
  {
    this.b = ((Context)anw.a(paramContext));
  }

  public static int a(Context paramContext, String paramString)
  {
    String str1;
    try
    {
      ClassLoader localClassLoader = paramContext.getApplicationContext().getClassLoader();
      String str3 = String.valueOf("com.google.android.gms.dynamite.descriptors.");
      String str4 = String.valueOf("ModuleDescriptor");
      Class localClass = localClassLoader.loadClass(1 + String.valueOf(str3).length() + String.valueOf(paramString).length() + String.valueOf(str4).length() + str3 + paramString + "." + str4);
      Field localField1 = localClass.getDeclaredField("MODULE_ID");
      Field localField2 = localClass.getDeclaredField("MODULE_VERSION");
      if (!localField1.get(null).equals(paramString))
      {
        String str5 = String.valueOf(localField1.get(null));
        Log.e("DynamiteModule", 51 + String.valueOf(str5).length() + String.valueOf(paramString).length() + "Module descriptor id '" + str5 + "' didn't match expected id '" + paramString + "'");
        return 0;
      }
      int i = localField2.getInt(null);
      return i;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Log.w("DynamiteModule", 45 + String.valueOf(paramString).length() + "Local module descriptor class for " + paramString + " not found.");
      return 0;
    }
    catch (Exception localException)
    {
      str1 = String.valueOf(localException.getMessage());
      if (str1.length() == 0);
    }
    for (String str2 = "Failed to load module descriptor class: ".concat(str1); ; str2 = new String("Failed to load module descriptor class: "))
    {
      Log.e("DynamiteModule", str2);
      break;
    }
  }

  public static int a(Context paramContext, String paramString, boolean paramBoolean)
  {
    aqd localaqd = a(paramContext);
    if (localaqd == null)
      return 0;
    String str1;
    try
    {
      int i = localaqd.a(apn.a(paramContext), paramString, paramBoolean);
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      str1 = String.valueOf(localRemoteException.getMessage());
      if (str1.length() == 0);
    }
    for (String str2 = "Failed to retrieve remote module version: ".concat(str1); ; str2 = new String("Failed to retrieve remote module version: "))
    {
      Log.w("DynamiteModule", str2);
      return 0;
    }
  }

  public static apr a(Context paramContext, aqa paramaqa, String paramString)
  {
    aqc localaqc = paramaqa.a(paramContext, paramString, d);
    int i = localaqc.a;
    int j = localaqc.b;
    Log.i("DynamiteModule", 68 + String.valueOf(paramString).length() + String.valueOf(paramString).length() + "Considering local module " + paramString + ":" + i + " and remote module " + paramString + ":" + j);
    if ((localaqc.c == 0) || ((localaqc.c == -1) && (localaqc.a == 0)) || ((localaqc.c == 1) && (localaqc.b == 0)))
    {
      int k = localaqc.a;
      int m = localaqc.b;
      throw new apz(91 + "No acceptable module found. Local version is " + k + " and remote version is " + m + ".");
    }
    if (localaqc.c == -1)
      return b(paramContext, paramString);
    if (localaqc.c == 1)
      try
      {
        apr localapr = a(paramContext, paramString, localaqc.b);
        return localapr;
      }
      catch (apz localapz)
      {
        String str1 = String.valueOf(localapz.getMessage());
        if (str1.length() != 0);
        for (String str2 = "Failed to load remote module: ".concat(str1); ; str2 = new String("Failed to load remote module: "))
        {
          Log.w("DynamiteModule", str2);
          if ((localaqc.a == 0) || (paramaqa.a(paramContext, paramString, new apy(localaqc.a)).c != -1))
            break;
          return b(paramContext, paramString);
        }
        throw new apz("Remote load failed. No local fallback found.", localapz);
      }
    int n = localaqc.c;
    throw new apz(47 + "VersionPolicy returned invalid code:" + n);
  }

  private static apr a(Context paramContext, String paramString, int paramInt)
  {
    Log.i("DynamiteModule", 51 + String.valueOf(paramString).length() + "Selected remote version of " + paramString + ", version >= " + paramInt);
    aqd localaqd = a(paramContext);
    if (localaqd == null)
      throw new apz("Failed to create IDynamiteLoader.");
    apj localapj;
    try
    {
      localapj = localaqd.a(apn.a(paramContext), paramString, paramInt);
      if (apn.a(localapj) == null)
        throw new apz("Failed to load remote module.");
    }
    catch (RemoteException localRemoteException)
    {
      throw new apz("Failed to load remote module.", localRemoteException);
    }
    return new apr((Context)apn.a(localapj));
  }

  // ERROR //
  private static aqd a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 243	apr:c	Laqd;
    //   6: ifnull +14 -> 20
    //   9: getstatic 243	apr:c	Laqd;
    //   12: astore 10
    //   14: ldc 2
    //   16: monitorexit
    //   17: aload 10
    //   19: areturn
    //   20: getstatic 248	oy:c	Loy;
    //   23: aload_0
    //   24: invokevirtual 251	oy:a	(Landroid/content/Context;)I
    //   27: ifeq +8 -> 35
    //   30: ldc 2
    //   32: monitorexit
    //   33: aconst_null
    //   34: areturn
    //   35: aload_0
    //   36: ldc 253
    //   38: iconst_3
    //   39: invokevirtual 257	android/content/Context:createPackageContext	(Ljava/lang/String;I)Landroid/content/Context;
    //   42: invokevirtual 62	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   45: ldc_w 259
    //   48: invokevirtual 97	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   51: invokevirtual 263	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   54: checkcast 265	android/os/IBinder
    //   57: astore 6
    //   59: aload 6
    //   61: ifnonnull +28 -> 89
    //   64: aconst_null
    //   65: astore 9
    //   67: aload 9
    //   69: ifnull +106 -> 175
    //   72: aload 9
    //   74: putstatic 243	apr:c	Laqd;
    //   77: ldc 2
    //   79: monitorexit
    //   80: aload 9
    //   82: areturn
    //   83: astore_1
    //   84: ldc 2
    //   86: monitorexit
    //   87: aload_1
    //   88: athrow
    //   89: aload 6
    //   91: ldc_w 267
    //   94: invokeinterface 271 2 0
    //   99: astore 7
    //   101: aload 7
    //   103: ifnull +21 -> 124
    //   106: aload 7
    //   108: instanceof 166
    //   111: ifeq +13 -> 124
    //   114: aload 7
    //   116: checkcast 166	aqd
    //   119: astore 9
    //   121: goto -54 -> 67
    //   124: new 273	aqf
    //   127: dup
    //   128: aload 6
    //   130: invokespecial 276	aqf:<init>	(Landroid/os/IBinder;)V
    //   133: astore 8
    //   135: aload 8
    //   137: astore 9
    //   139: goto -72 -> 67
    //   142: astore_2
    //   143: aload_2
    //   144: invokevirtual 144	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   147: invokestatic 70	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   150: astore_3
    //   151: aload_3
    //   152: invokevirtual 78	java/lang/String:length	()I
    //   155: ifeq +25 -> 180
    //   158: ldc_w 278
    //   161: aload_3
    //   162: invokevirtual 150	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   165: astore 4
    //   167: ldc 118
    //   169: aload 4
    //   171: invokestatic 130	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   174: pop
    //   175: ldc 2
    //   177: monitorexit
    //   178: aconst_null
    //   179: areturn
    //   180: new 66	java/lang/String
    //   183: dup
    //   184: ldc_w 278
    //   187: invokespecial 153	java/lang/String:<init>	(Ljava/lang/String;)V
    //   190: astore 4
    //   192: goto -25 -> 167
    //
    // Exception table:
    //   from	to	target	type
    //   3	17	83	finally
    //   20	33	83	finally
    //   35	59	83	finally
    //   72	77	83	finally
    //   77	80	83	finally
    //   84	87	83	finally
    //   89	101	83	finally
    //   106	121	83	finally
    //   124	135	83	finally
    //   143	167	83	finally
    //   167	175	83	finally
    //   175	178	83	finally
    //   180	192	83	finally
    //   35	59	142	java/lang/Exception
    //   72	77	142	java/lang/Exception
    //   89	101	142	java/lang/Exception
    //   106	121	142	java/lang/Exception
    //   124	135	142	java/lang/Exception
  }

  private static apr b(Context paramContext, String paramString)
  {
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0);
    for (String str2 = "Selected local version of ".concat(str1); ; str2 = new String("Selected local version of "))
    {
      Log.i("DynamiteModule", str2);
      return new apr(paramContext.getApplicationContext());
    }
  }

  public final IBinder a(String paramString)
  {
    try
    {
      IBinder localIBinder = (IBinder)this.b.getClassLoader().loadClass(paramString).newInstance();
      return localIBinder;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      String str1 = String.valueOf(paramString);
      if (str1.length() != 0);
      for (String str2 = "Failed to instantiate module class: ".concat(str1); ; str2 = new String("Failed to instantiate module class: "))
        throw new apz(str2, localClassNotFoundException);
    }
    catch (InstantiationException localInstantiationException)
    {
      break label23;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label23: break label23;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     apr
 * JD-Core Version:    0.6.0
 */