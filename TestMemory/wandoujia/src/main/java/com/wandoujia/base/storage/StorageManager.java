package com.wandoujia.base.storage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.SharePrefSubmitor;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class StorageManager
{
  private static final int FORTH_LINE = 4;
  private static final String GENERIC_CONFIG_PREFERENCE_NAME = "com.wandoujia.phoenix2";
  private static final String KEY_LAST_USED_DIRECTORY = "key_last_used_directory";
  private static final long LIMIT_SIZE = 52428800L;
  private static final int MIN_SDK = 14;
  private static final String ROOT_DIR = "/wandoujia/";
  private static StorageManager instance;
  private List<String> availableStoragesPathList;
  private String defaultExternalStorageDirectory;
  private SharedPreferences genericSharedPrefs = GlobalConfig.getAppContext().getSharedPreferences("com.wandoujia.phoenix2", 0);
  private final List<WeakReference<StorageManager.OnExternalStorageDirectoryChangedListener>> rdcListeners;

  private StorageManager()
  {
    registerReceiver();
    this.rdcListeners = new ArrayList();
    this.availableStoragesPathList = getAvailableStorages();
    this.defaultExternalStorageDirectory = this.genericSharedPrefs.getString("key_last_used_directory", null);
    checkDefaultPathAvailable();
  }

  private void checkDefaultPathAvailable()
  {
    if ((TextUtils.isEmpty(this.defaultExternalStorageDirectory)) || (!FileUtil.canWrite(new File(this.defaultExternalStorageDirectory))))
    {
      this.defaultExternalStorageDirectory = getAvailableDirectory(this.availableStoragesPathList, 0L);
      saveAndNotifyDefaultExternalStorageDiretory(null, this.defaultExternalStorageDirectory);
    }
  }

  // ERROR //
  private List<String> getAvailableStorages()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: new 56	java/util/ArrayList
    //   7: dup
    //   8: invokespecial 57	java/util/ArrayList:<init>	()V
    //   11: astore_3
    //   12: getstatic 124	android/os/Build$VERSION:SDK_INT	I
    //   15: bipush 14
    //   17: if_icmplt +283 -> 300
    //   20: invokestatic 43	com/wandoujia/base/config/GlobalConfig:getAppContext	()Landroid/content/Context;
    //   23: ldc 126
    //   25: invokevirtual 130	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   28: astore 33
    //   30: aload 33
    //   32: ifnull +139 -> 171
    //   35: aload 33
    //   37: invokevirtual 134	java/lang/Object:getClass	()Ljava/lang/Class;
    //   40: ldc 136
    //   42: aconst_null
    //   43: invokevirtual 142	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   46: astore 34
    //   48: aload 33
    //   50: invokevirtual 134	java/lang/Object:getClass	()Ljava/lang/Class;
    //   53: ldc 144
    //   55: iconst_1
    //   56: anewarray 138	java/lang/Class
    //   59: dup
    //   60: iconst_0
    //   61: ldc 146
    //   63: aastore
    //   64: invokevirtual 142	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   67: astore 35
    //   69: aload 34
    //   71: ifnull +100 -> 171
    //   74: aload 34
    //   76: aload 33
    //   78: aconst_null
    //   79: invokevirtual 152	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   82: checkcast 154	[Ljava/lang/Object;
    //   85: astore 36
    //   87: aload 36
    //   89: ifnull +82 -> 171
    //   92: aload 36
    //   94: arraylength
    //   95: ifle +76 -> 171
    //   98: aload 36
    //   100: iconst_0
    //   101: aaload
    //   102: invokevirtual 134	java/lang/Object:getClass	()Ljava/lang/Class;
    //   105: ldc 156
    //   107: aconst_null
    //   108: invokevirtual 142	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   111: astore 39
    //   113: iload_1
    //   114: aload 36
    //   116: arraylength
    //   117: if_icmpge +54 -> 171
    //   120: aload 39
    //   122: aload 36
    //   124: iload_1
    //   125: aaload
    //   126: aconst_null
    //   127: invokevirtual 152	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   130: checkcast 146	java/lang/String
    //   133: astore 40
    //   135: ldc 158
    //   137: aload 35
    //   139: aload 33
    //   141: iconst_1
    //   142: anewarray 4	java/lang/Object
    //   145: dup
    //   146: iconst_0
    //   147: aload 40
    //   149: aastore
    //   150: invokevirtual 152	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   153: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   156: ifeq +464 -> 620
    //   159: aload_3
    //   160: aload 40
    //   162: invokeinterface 167 2 0
    //   167: pop
    //   168: goto +452 -> 620
    //   171: aload_3
    //   172: invokeinterface 171 1 0
    //   177: ifgt +28 -> 205
    //   180: invokestatic 177	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   183: invokevirtual 181	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   186: astore 37
    //   188: aload 37
    //   190: invokestatic 88	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   193: ifne +12 -> 205
    //   196: aload_3
    //   197: aload 37
    //   199: invokeinterface 167 2 0
    //   204: pop
    //   205: new 183	java/lang/StringBuilder
    //   208: dup
    //   209: ldc 185
    //   211: invokespecial 186	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   214: invokestatic 192	java/lang/System:currentTimeMillis	()J
    //   217: invokevirtual 196	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   220: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   223: astore 5
    //   225: aload_3
    //   226: invokeinterface 203 1 0
    //   231: astore 6
    //   233: aload 6
    //   235: invokeinterface 209 1 0
    //   240: ifeq +277 -> 517
    //   243: aload 6
    //   245: invokeinterface 213 1 0
    //   250: checkcast 146	java/lang/String
    //   253: astore 10
    //   255: new 90	java/io/File
    //   258: dup
    //   259: aload 10
    //   261: aload 5
    //   263: invokespecial 215	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   266: astore 11
    //   268: new 90	java/io/File
    //   271: dup
    //   272: aload 10
    //   274: invokespecial 93	java/io/File:<init>	(Ljava/lang/String;)V
    //   277: invokestatic 99	com/wandoujia/base/utils/FileUtil:canWrite	(Ljava/io/File;)Z
    //   280: ifeq +227 -> 507
    //   283: aload 11
    //   285: invokevirtual 218	java/io/File:exists	()Z
    //   288: ifne +219 -> 507
    //   291: aload 11
    //   293: invokevirtual 221	java/io/File:mkdir	()Z
    //   296: pop
    //   297: goto -64 -> 233
    //   300: invokestatic 177	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   303: invokevirtual 181	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   306: astore 16
    //   308: aload 16
    //   310: invokestatic 88	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   313: ifne +12 -> 325
    //   316: aload_3
    //   317: aload 16
    //   319: invokeinterface 167 2 0
    //   324: pop
    //   325: new 223	java/io/BufferedReader
    //   328: dup
    //   329: new 225	java/io/InputStreamReader
    //   332: dup
    //   333: new 227	java/io/FileInputStream
    //   336: dup
    //   337: new 90	java/io/File
    //   340: dup
    //   341: ldc 229
    //   343: invokespecial 93	java/io/File:<init>	(Ljava/lang/String;)V
    //   346: invokespecial 232	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   349: invokespecial 235	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   352: invokespecial 238	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   355: astore 17
    //   357: aload 17
    //   359: invokevirtual 241	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   362: astore 25
    //   364: aload 25
    //   366: invokestatic 88	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   369: ifne +93 -> 462
    //   372: aload 25
    //   374: ldc 243
    //   376: invokevirtual 246	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   379: ifeq -22 -> 357
    //   382: aload 25
    //   384: ldc 248
    //   386: invokevirtual 246	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   389: ifeq -32 -> 357
    //   392: aload 25
    //   394: ldc 250
    //   396: invokevirtual 246	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   399: ifne -42 -> 357
    //   402: aload 25
    //   404: ldc 252
    //   406: invokevirtual 256	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   409: astore 27
    //   411: aload 27
    //   413: arraylength
    //   414: iconst_4
    //   415: if_icmplt -58 -> 357
    //   418: aload 27
    //   420: iconst_1
    //   421: aaload
    //   422: astore 28
    //   424: aload_3
    //   425: aload 28
    //   427: invokeinterface 258 2 0
    //   432: ifne -75 -> 357
    //   435: aload_3
    //   436: aload 28
    //   438: invokeinterface 167 2 0
    //   443: pop
    //   444: goto -87 -> 357
    //   447: astore 23
    //   449: aload 17
    //   451: invokevirtual 261	java/io/BufferedReader:close	()V
    //   454: goto -249 -> 205
    //   457: astore 24
    //   459: goto -254 -> 205
    //   462: aload 17
    //   464: invokevirtual 261	java/io/BufferedReader:close	()V
    //   467: goto -262 -> 205
    //   470: astore 26
    //   472: goto -267 -> 205
    //   475: astore 31
    //   477: aconst_null
    //   478: astore 17
    //   480: aload 17
    //   482: invokevirtual 261	java/io/BufferedReader:close	()V
    //   485: goto -280 -> 205
    //   488: astore 19
    //   490: goto -285 -> 205
    //   493: astore 21
    //   495: aload_2
    //   496: invokevirtual 261	java/io/BufferedReader:close	()V
    //   499: aload 21
    //   501: athrow
    //   502: astore 15
    //   504: goto -299 -> 205
    //   507: aload 6
    //   509: invokeinterface 264 1 0
    //   514: goto -281 -> 233
    //   517: aload_3
    //   518: invokeinterface 203 1 0
    //   523: astore 7
    //   525: aload 7
    //   527: invokeinterface 209 1 0
    //   532: ifeq +46 -> 578
    //   535: new 90	java/io/File
    //   538: dup
    //   539: aload 7
    //   541: invokeinterface 213 1 0
    //   546: checkcast 146	java/lang/String
    //   549: aload 5
    //   551: invokespecial 215	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   554: astore 8
    //   556: aload 8
    //   558: invokevirtual 218	java/io/File:exists	()Z
    //   561: ifeq -36 -> 525
    //   564: aload 8
    //   566: invokevirtual 267	java/io/File:delete	()Z
    //   569: pop
    //   570: goto -45 -> 525
    //   573: astore 22
    //   575: goto -76 -> 499
    //   578: aload_3
    //   579: areturn
    //   580: astore 14
    //   582: goto -377 -> 205
    //   585: astore 13
    //   587: goto -382 -> 205
    //   590: astore 4
    //   592: goto -387 -> 205
    //   595: astore 20
    //   597: aload 17
    //   599: astore_2
    //   600: aload 20
    //   602: astore 21
    //   604: goto -109 -> 495
    //   607: astore 18
    //   609: goto -129 -> 480
    //   612: astore 30
    //   614: aconst_null
    //   615: astore 17
    //   617: goto -168 -> 449
    //   620: iinc 1 1
    //   623: goto -510 -> 113
    //
    // Exception table:
    //   from	to	target	type
    //   357	444	447	java/io/FileNotFoundException
    //   449	454	457	java/io/IOException
    //   462	467	470	java/io/IOException
    //   325	357	475	java/io/IOException
    //   480	485	488	java/io/IOException
    //   325	357	493	finally
    //   12	30	502	java/lang/NoSuchMethodException
    //   35	69	502	java/lang/NoSuchMethodException
    //   74	87	502	java/lang/NoSuchMethodException
    //   92	113	502	java/lang/NoSuchMethodException
    //   113	168	502	java/lang/NoSuchMethodException
    //   171	205	502	java/lang/NoSuchMethodException
    //   300	325	502	java/lang/NoSuchMethodException
    //   449	454	502	java/lang/NoSuchMethodException
    //   462	467	502	java/lang/NoSuchMethodException
    //   480	485	502	java/lang/NoSuchMethodException
    //   495	499	502	java/lang/NoSuchMethodException
    //   499	502	502	java/lang/NoSuchMethodException
    //   495	499	573	java/io/IOException
    //   12	30	580	java/lang/reflect/InvocationTargetException
    //   35	69	580	java/lang/reflect/InvocationTargetException
    //   74	87	580	java/lang/reflect/InvocationTargetException
    //   92	113	580	java/lang/reflect/InvocationTargetException
    //   113	168	580	java/lang/reflect/InvocationTargetException
    //   171	205	580	java/lang/reflect/InvocationTargetException
    //   300	325	580	java/lang/reflect/InvocationTargetException
    //   449	454	580	java/lang/reflect/InvocationTargetException
    //   462	467	580	java/lang/reflect/InvocationTargetException
    //   480	485	580	java/lang/reflect/InvocationTargetException
    //   495	499	580	java/lang/reflect/InvocationTargetException
    //   499	502	580	java/lang/reflect/InvocationTargetException
    //   12	30	585	java/lang/IllegalArgumentException
    //   35	69	585	java/lang/IllegalArgumentException
    //   74	87	585	java/lang/IllegalArgumentException
    //   92	113	585	java/lang/IllegalArgumentException
    //   113	168	585	java/lang/IllegalArgumentException
    //   171	205	585	java/lang/IllegalArgumentException
    //   300	325	585	java/lang/IllegalArgumentException
    //   449	454	585	java/lang/IllegalArgumentException
    //   462	467	585	java/lang/IllegalArgumentException
    //   480	485	585	java/lang/IllegalArgumentException
    //   495	499	585	java/lang/IllegalArgumentException
    //   499	502	585	java/lang/IllegalArgumentException
    //   12	30	590	java/lang/IllegalAccessException
    //   35	69	590	java/lang/IllegalAccessException
    //   74	87	590	java/lang/IllegalAccessException
    //   92	113	590	java/lang/IllegalAccessException
    //   113	168	590	java/lang/IllegalAccessException
    //   171	205	590	java/lang/IllegalAccessException
    //   300	325	590	java/lang/IllegalAccessException
    //   449	454	590	java/lang/IllegalAccessException
    //   462	467	590	java/lang/IllegalAccessException
    //   480	485	590	java/lang/IllegalAccessException
    //   495	499	590	java/lang/IllegalAccessException
    //   499	502	590	java/lang/IllegalAccessException
    //   357	444	595	finally
    //   357	444	607	java/io/IOException
    //   325	357	612	java/io/FileNotFoundException
  }

  public static StorageManager getInstance()
  {
    if (instance == null)
      monitorenter;
    try
    {
      if (instance == null)
        instance = new StorageManager();
      return instance;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void notifyPathChange(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    while (true)
    {
      Iterator localIterator;
      synchronized (this.rdcListeners)
      {
        localIterator = this.rdcListeners.iterator();
        if (!localIterator.hasNext())
          break;
        StorageManager.OnExternalStorageDirectoryChangedListener localOnExternalStorageDirectoryChangedListener = (StorageManager.OnExternalStorageDirectoryChangedListener)((WeakReference)localIterator.next()).get();
        if (localOnExternalStorageDirectoryChangedListener != null)
          localArrayList.add(localOnExternalStorageDirectoryChangedListener);
      }
      localIterator.remove();
    }
    monitorexit;
    new Handler(Looper.getMainLooper()).post(new a(localArrayList, paramString1, paramString2));
  }

  private void registerReceiver()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
    localIntentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
    localIntentFilter.addDataScheme("file");
    GlobalConfig.getAppContext().registerReceiver(new StorageManager.MediaReceiver(this, 0), localIntentFilter);
  }

  private void saveAndNotifyDefaultExternalStorageDiretory(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2))
    {
      SharedPreferences.Editor localEditor = this.genericSharedPrefs.edit();
      localEditor.putString("key_last_used_directory", paramString2);
      SharePrefSubmitor.submit(localEditor);
      notifyPathChange(paramString1, paramString2);
    }
  }

  public void addExternalStorageDirectoryChangedListener(StorageManager.OnExternalStorageDirectoryChangedListener paramOnExternalStorageDirectoryChangedListener)
  {
    if (paramOnExternalStorageDirectoryChangedListener == null)
      return;
    synchronized (this.rdcListeners)
    {
      Iterator localIterator = this.rdcListeners.iterator();
      while (localIterator.hasNext())
        if (paramOnExternalStorageDirectoryChangedListener.equals((StorageManager.OnExternalStorageDirectoryChangedListener)((WeakReference)localIterator.next()).get()))
          return;
    }
    this.rdcListeners.add(new WeakReference(paramOnExternalStorageDirectoryChangedListener));
    monitorexit;
  }

  public HashMap<String, Long> getAvailableDirectories(long paramLong)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.availableStoragesPathList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      long l = FileUtil.getAvailableBytes(str);
      if (l <= 52428800L + paramLong)
        continue;
      localHashMap.put(str, Long.valueOf(l));
    }
    return localHashMap;
  }

  public String getAvailableDirectory(List<String> paramList, long paramLong)
  {
    Object localObject1 = null;
    long l1 = -1L;
    Iterator localIterator = paramList.iterator();
    Object localObject2;
    long l3;
    if (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      long l2 = FileUtil.getAvailableBytes(str);
      if ((l2 <= l1) || (FileUtil.getAvailableBytes(str) <= paramLong))
        break label85;
      localObject2 = str;
      l3 = l2;
    }
    while (true)
    {
      l1 = l3;
      localObject1 = localObject2;
      break;
      return localObject1;
      label85: localObject2 = localObject1;
      l3 = l1;
    }
  }

  public List<String> getExternalStorageDirectories()
  {
    return this.availableStoragesPathList;
  }

  public String getExternalStorageDirectory()
  {
    return getExternalStorageDirectory(0L);
  }

  public String getExternalStorageDirectory(long paramLong)
  {
    String str1;
    String str2;
    String str3;
    if (FileUtil.getAvailableBytes(this.defaultExternalStorageDirectory) < 52428800L + paramLong)
    {
      str1 = this.defaultExternalStorageDirectory;
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator = this.availableStoragesPathList.iterator();
      while (localIterator.hasNext())
      {
        String str4 = (String)localIterator.next();
        if ((!TextUtils.isEmpty(this.defaultExternalStorageDirectory)) && (this.defaultExternalStorageDirectory.equals(str4)))
          continue;
        if (new File(str4 + "/wandoujia/").exists())
        {
          localArrayList2.add(str4);
          continue;
        }
        localArrayList1.add(str4);
      }
      str2 = getAvailableDirectory(localArrayList2, paramLong);
      if (!TextUtils.isEmpty(str2))
        break label212;
      str3 = getAvailableDirectory(localArrayList1, paramLong);
      if (TextUtils.isEmpty(str3))
        return this.defaultExternalStorageDirectory;
    }
    label212: for (this.defaultExternalStorageDirectory = str3; ; this.defaultExternalStorageDirectory = str2)
    {
      saveAndNotifyDefaultExternalStorageDiretory(str1, this.defaultExternalStorageDirectory);
      return this.defaultExternalStorageDirectory;
    }
  }

  public boolean isStorageMounted()
  {
    List localList = getExternalStorageDirectories();
    return (localList != null) && (localList.size() != 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.storage.StorageManager
 * JD-Core Version:    0.6.0
 */