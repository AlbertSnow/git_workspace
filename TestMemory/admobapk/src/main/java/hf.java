import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Pair;
import com.google.ads.afma.nano.h;
import com.google.android.ads.tasks.p;
import com.google.android.gms.ads.identifier.a;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.config.m;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class hf
{
  private static final String l = hf.class.getSimpleName();
  private static Object p = new Object();
  private static oy r = null;
  public Context a;
  public ExecutorService b;
  public DexClassLoader c;
  public hc d;
  public byte[] e;
  public volatile com.google.ads.afma.nano.d f = null;
  public Future g = null;
  public gu h;
  public aio i = null;
  public boolean j = false;
  public boolean k = false;
  private volatile a m = null;
  private volatile boolean n = false;
  private Future o = null;
  private boolean q = false;
  private Map s;

  private hf(Context paramContext)
  {
    this.a = paramContext;
    this.s = new HashMap();
  }

  public static hf a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    hf localhf = new hf(paramContext);
    try
    {
      boolean bool = localhf.a(paramString1, paramString2, paramBoolean);
      if (bool)
        return localhf;
    }
    catch (he localhe)
    {
    }
    return null;
  }

  private static void a(File paramFile)
  {
    if (!paramFile.exists())
    {
      String str = l;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = paramFile.getAbsolutePath();
      Log.d(str, String.format("File %s not found. No need for deletion", arrayOfObject));
      return;
    }
    paramFile.delete();
  }

  // ERROR //
  private final void a(File paramFile, String paramString)
  {
    // Byte code:
    //   0: new 92	java/io/File
    //   3: dup
    //   4: ldc 124
    //   6: iconst_2
    //   7: anewarray 4	java/lang/Object
    //   10: dup
    //   11: iconst_0
    //   12: aload_1
    //   13: aastore
    //   14: dup
    //   15: iconst_1
    //   16: aload_2
    //   17: aastore
    //   18: invokestatic 107	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   21: invokespecial 127	java/io/File:<init>	(Ljava/lang/String;)V
    //   24: astore_3
    //   25: aload_3
    //   26: invokevirtual 96	java/io/File:exists	()Z
    //   29: ifeq +4 -> 33
    //   32: return
    //   33: new 92	java/io/File
    //   36: dup
    //   37: ldc 129
    //   39: iconst_2
    //   40: anewarray 4	java/lang/Object
    //   43: dup
    //   44: iconst_0
    //   45: aload_1
    //   46: aastore
    //   47: dup
    //   48: iconst_1
    //   49: aload_2
    //   50: aastore
    //   51: invokestatic 107	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   54: invokespecial 127	java/io/File:<init>	(Ljava/lang/String;)V
    //   57: astore 4
    //   59: aload 4
    //   61: invokevirtual 96	java/io/File:exists	()Z
    //   64: ifeq -32 -> 32
    //   67: aconst_null
    //   68: astore 5
    //   70: aload 4
    //   72: invokevirtual 133	java/io/File:length	()J
    //   75: lstore 6
    //   77: lload 6
    //   79: lconst_0
    //   80: lcmp
    //   81: ifle -49 -> 32
    //   84: lload 6
    //   86: l2i
    //   87: newarray byte
    //   89: astore 8
    //   91: new 135	java/io/FileInputStream
    //   94: dup
    //   95: aload 4
    //   97: invokespecial 137	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   100: astore 9
    //   102: aload 9
    //   104: aload 8
    //   106: invokevirtual 141	java/io/FileInputStream:read	([B)I
    //   109: istore 17
    //   111: iload 17
    //   113: ifgt +14 -> 127
    //   116: aload 9
    //   118: invokevirtual 144	java/io/FileInputStream:close	()V
    //   121: aload 4
    //   123: invokestatic 146	hf:a	(Ljava/io/File;)V
    //   126: return
    //   127: new 148	com/google/ads/afma/nano/h
    //   130: dup
    //   131: invokespecial 149	com/google/ads/afma/nano/h:<init>	()V
    //   134: astore 18
    //   136: aload 18
    //   138: getstatic 154	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   141: invokevirtual 158	java/lang/String:getBytes	()[B
    //   144: putfield 160	com/google/ads/afma/nano/h:d	[B
    //   147: aload 18
    //   149: aload_2
    //   150: invokevirtual 158	java/lang/String:getBytes	()[B
    //   153: putfield 162	com/google/ads/afma/nano/h:c	[B
    //   156: aload_0
    //   157: getfield 164	hf:d	Lhc;
    //   160: aload_0
    //   161: getfield 166	hf:e	[B
    //   164: aload 8
    //   166: invokevirtual 171	hc:a	([B[B)Ljava/lang/String;
    //   169: invokevirtual 158	java/lang/String:getBytes	()[B
    //   172: astore 19
    //   174: aload 18
    //   176: aload 19
    //   178: putfield 173	com/google/ads/afma/nano/h:a	[B
    //   181: aload 18
    //   183: aload 19
    //   185: invokestatic 178	ge:a	([B)[B
    //   188: putfield 180	com/google/ads/afma/nano/h:b	[B
    //   191: aload_3
    //   192: invokevirtual 183	java/io/File:createNewFile	()Z
    //   195: pop
    //   196: new 185	java/io/FileOutputStream
    //   199: dup
    //   200: aload_3
    //   201: invokespecial 186	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   204: astore 21
    //   206: aload 18
    //   208: invokestatic 191	awb:a	(Lawb;)[B
    //   211: astore 22
    //   213: aload 21
    //   215: aload 22
    //   217: iconst_0
    //   218: aload 22
    //   220: arraylength
    //   221: invokevirtual 195	java/io/FileOutputStream:write	([BII)V
    //   224: aload 21
    //   226: invokevirtual 196	java/io/FileOutputStream:close	()V
    //   229: aload 9
    //   231: invokevirtual 144	java/io/FileInputStream:close	()V
    //   234: aload 4
    //   236: invokestatic 146	hf:a	(Ljava/io/File;)V
    //   239: return
    //   240: astore 27
    //   242: aconst_null
    //   243: astore 9
    //   245: aload 9
    //   247: ifnull +8 -> 255
    //   250: aload 9
    //   252: invokevirtual 144	java/io/FileInputStream:close	()V
    //   255: aload 4
    //   257: invokestatic 146	hf:a	(Ljava/io/File;)V
    //   260: return
    //   261: astore 15
    //   263: aload 5
    //   265: ifnull +8 -> 273
    //   268: aload 5
    //   270: invokevirtual 144	java/io/FileInputStream:close	()V
    //   273: aload 4
    //   275: invokestatic 146	hf:a	(Ljava/io/File;)V
    //   278: aload 15
    //   280: athrow
    //   281: astore 24
    //   283: goto -162 -> 121
    //   286: astore 23
    //   288: goto -54 -> 234
    //   291: astore 11
    //   293: goto -38 -> 255
    //   296: astore 16
    //   298: goto -25 -> 273
    //   301: astore 14
    //   303: aload 9
    //   305: astore 5
    //   307: aload 14
    //   309: astore 15
    //   311: goto -48 -> 263
    //   314: astore 13
    //   316: goto -71 -> 245
    //   319: astore 26
    //   321: aconst_null
    //   322: astore 9
    //   324: goto -79 -> 245
    //   327: astore 12
    //   329: goto -84 -> 245
    //   332: astore 25
    //   334: aconst_null
    //   335: astore 9
    //   337: goto -92 -> 245
    //   340: astore 10
    //   342: goto -97 -> 245
    //
    // Exception table:
    //   from	to	target	type
    //   91	102	240	java/security/NoSuchAlgorithmException
    //   91	102	261	finally
    //   116	121	281	java/io/IOException
    //   229	234	286	java/io/IOException
    //   250	255	291	java/io/IOException
    //   268	273	296	java/io/IOException
    //   102	111	301	finally
    //   127	229	301	finally
    //   102	111	314	java/security/NoSuchAlgorithmException
    //   127	229	314	java/security/NoSuchAlgorithmException
    //   91	102	319	hd
    //   102	111	327	hd
    //   127	229	327	hd
    //   91	102	332	java/io/IOException
    //   102	111	340	java/io/IOException
    //   127	229	340	java/io/IOException
  }

  private final boolean a(String paramString)
  {
    try
    {
      localFile1 = this.a.getCacheDir();
      if (localFile1 == null)
      {
        localFile1 = this.a.getDir("dex", 0);
        if (localFile1 == null)
          throw new he();
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      File localFile1;
      throw new he(localFileNotFoundException);
      File localFile2 = localFile1;
      File localFile3 = new File(String.format("%s/%s.jar", new Object[] { localFile2, "1460683162801" }));
      if (!localFile3.exists())
      {
        byte[] arrayOfByte = this.d.a(this.e, paramString);
        localFile3.createNewFile();
        FileOutputStream localFileOutputStream = new FileOutputStream(localFile3);
        localFileOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
        localFileOutputStream.close();
      }
      b(localFile2, "1460683162801");
      try
      {
        this.c = new DexClassLoader(localFile3.getAbsolutePath(), localFile2.getAbsolutePath(), null, this.a.getClassLoader());
        return true;
      }
      finally
      {
        a(localFile3);
        a(localFile2, "1460683162801");
        b(String.format("%s/%s.dex", new Object[] { localFile2, "1460683162801" }));
      }
    }
    catch (IOException localIOException)
    {
      throw new he(localIOException);
    }
    catch (hd localhd)
    {
      throw new he(localhd);
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    throw new he(localNullPointerException);
  }

  private final boolean a(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.b = Executors.newCachedThreadPool();
    this.n = paramBoolean;
    if (paramBoolean)
      this.o = this.b.submit(new hg(this));
    r = oy.c;
    boolean bool1;
    if (r.b(this.a) > 0)
      bool1 = true;
    while (true)
    {
      this.j = bool1;
      int i1 = r.a(this.a);
      boolean bool2 = false;
      if (i1 == 0)
        bool2 = true;
      this.q = bool2;
      if (this.a.getApplicationContext() != null)
        this.i = new aip(this.a).a(np.a).b();
      m.a(this.a);
      com.google.android.gms.ads.internal.config.d locald = m.as;
      if (((Boolean)bc.a().n.a(locald)).booleanValue())
        this.g = this.b.submit(new hh(this));
      this.d = new hc(null);
      try
      {
        this.e = this.d.a(paramString1);
        a(paramString2);
        this.h = new gu(this);
        return true;
        bool1 = false;
      }
      catch (hd localhd)
      {
      }
    }
    throw new he(localhd);
  }

  private final void b(String paramString)
  {
    a(new File(paramString));
  }

  private final boolean b(File paramFile, String paramString)
  {
    File localFile1 = new File(String.format("%s/%s.tmp", new Object[] { paramFile, paramString }));
    if (!localFile1.exists())
      return false;
    File localFile2 = new File(String.format("%s/%s.dex", new Object[] { paramFile, paramString }));
    if (localFile2.exists())
      return false;
    try
    {
      long l1 = localFile1.length();
      if (l1 <= 0L)
      {
        a(localFile1);
        return false;
      }
      byte[] arrayOfByte1 = new byte[(int)l1];
      if (new FileInputStream(localFile1).read(arrayOfByte1) <= 0)
      {
        Log.d(l, "Cannot read the cache data.");
        a(localFile1);
        return false;
      }
      h localh = (h)awb.a(new h(), arrayOfByte1);
      if ((!paramString.equals(new String(localh.c))) || (!Arrays.equals(localh.b, ge.a(localh.a))) || (!Arrays.equals(localh.d, Build.VERSION.SDK.getBytes())))
      {
        a(localFile1);
        return false;
      }
      byte[] arrayOfByte2 = this.d.a(this.e, new String(localh.a));
      localFile2.createNewFile();
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile2);
      localFileOutputStream.write(arrayOfByte2, 0, arrayOfByte2.length);
      localFileOutputStream.close();
      return true;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      return false;
    }
    catch (hd localhd)
    {
      break label268;
    }
    catch (IOException localIOException)
    {
      label268: break label268;
    }
  }

  public final Method a(String paramString1, String paramString2)
  {
    p localp = (p)this.s.get(new Pair(paramString1, paramString2));
    if (localp == null)
      return null;
    return localp.b();
  }

  final void a()
  {
    try
    {
      if (this.m == null)
      {
        a locala = new a(this.a);
        locala.a(true);
        this.m = locala;
      }
      return;
    }
    catch (IOException localIOException)
    {
      this.m = null;
      return;
    }
    catch (aht localaht)
    {
      break label34;
    }
    catch (ahu localahu)
    {
      label34: break label34;
    }
  }

  public final boolean a(String paramString1, String paramString2, List paramList)
  {
    if (!this.s.containsKey(new Pair(paramString1, paramString2)))
    {
      this.s.put(new Pair(paramString1, paramString2), new p(this, paramString1, paramString2, paramList));
      return true;
    }
    return false;
  }

  final void b()
  {
    if (this.q);
    try
    {
      PackageInfo localPackageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
      this.f = new aqh(this.a, this.a.getPackageName(), Integer.toString(localPackageInfo.versionCode)).b(2000);
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
  }

  public final a c()
  {
    if (!this.n)
      return null;
    if (this.m != null)
      return this.m;
    if (this.o != null);
    try
    {
      this.o.get(2000L, TimeUnit.MILLISECONDS);
      this.o = null;
      label49: return this.m;
    }
    catch (TimeoutException localTimeoutException)
    {
      while (true)
        this.o.cancel(true);
    }
    catch (ExecutionException localExecutionException)
    {
      break label49;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label49;
    }
  }

  public final void d()
  {
    while (true)
    {
      synchronized (p)
      {
        if (this.k)
          return;
        if ((this.q) && (this.i != null))
        {
          this.i.b();
          this.k = true;
          return;
        }
      }
      this.k = false;
    }
  }

  public final void e()
  {
    synchronized (p)
    {
      if ((this.k) && (this.i != null))
      {
        this.i.c();
        this.k = false;
      }
      return;
    }
  }

  public final int f()
  {
    int i1 = -2147483648;
    if (this.h != null)
      i1 = gu.a();
    return i1;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     hf
 * JD-Core Version:    0.6.0
 */