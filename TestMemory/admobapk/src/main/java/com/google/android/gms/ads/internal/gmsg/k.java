package com.google.android.gms.ads.internal.gmsg;

final class k
  implements t
{
  // ERROR //
  public final void a(com.google.android.gms.ads.internal.webview.b paramb, java.util.Map paramMap)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 20 1 0
    //   6: invokevirtual 26	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   9: astore_3
    //   10: aload_2
    //   11: ldc 28
    //   13: invokeinterface 34 2 0
    //   18: checkcast 36	java/lang/String
    //   21: astore 4
    //   23: new 38	org/json/JSONObject
    //   26: dup
    //   27: aload 4
    //   29: invokespecial 41	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   32: astore 5
    //   34: aload 5
    //   36: ldc 43
    //   38: invokevirtual 47	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   41: astore 7
    //   43: new 38	org/json/JSONObject
    //   46: dup
    //   47: invokespecial 48	org/json/JSONObject:<init>	()V
    //   50: astore 8
    //   52: iconst_0
    //   53: istore 9
    //   55: iload 9
    //   57: aload 7
    //   59: invokevirtual 54	org/json/JSONArray:length	()I
    //   62: if_icmpge +300 -> 362
    //   65: aload 7
    //   67: iload 9
    //   69: invokevirtual 58	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   72: astore 11
    //   74: aload 11
    //   76: ldc 60
    //   78: invokevirtual 64	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   81: astore 12
    //   83: aload 11
    //   85: ldc 66
    //   87: invokevirtual 64	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   90: astore 13
    //   92: aload 11
    //   94: ldc 68
    //   96: invokevirtual 64	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   99: astore 14
    //   101: aload 11
    //   103: ldc 70
    //   105: invokevirtual 64	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   108: astore 15
    //   110: aload 11
    //   112: ldc 72
    //   114: invokevirtual 64	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   117: astore 16
    //   119: aload 11
    //   121: ldc 74
    //   123: invokevirtual 64	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   126: astore 17
    //   128: aload 11
    //   130: ldc 76
    //   132: invokevirtual 64	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   135: pop
    //   136: aload 11
    //   138: ldc 78
    //   140: invokevirtual 64	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   143: pop
    //   144: new 80	android/content/Intent
    //   147: dup
    //   148: invokespecial 81	android/content/Intent:<init>	()V
    //   151: astore 20
    //   153: aload 13
    //   155: invokestatic 87	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   158: ifne +14 -> 172
    //   161: aload 20
    //   163: aload 13
    //   165: invokestatic 93	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   168: invokevirtual 97	android/content/Intent:setData	(Landroid/net/Uri;)Landroid/content/Intent;
    //   171: pop
    //   172: aload 14
    //   174: invokestatic 87	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   177: ifne +11 -> 188
    //   180: aload 20
    //   182: aload 14
    //   184: invokevirtual 101	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   187: pop
    //   188: aload 15
    //   190: invokestatic 87	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   193: ifne +11 -> 204
    //   196: aload 20
    //   198: aload 15
    //   200: invokevirtual 104	android/content/Intent:setType	(Ljava/lang/String;)Landroid/content/Intent;
    //   203: pop
    //   204: aload 16
    //   206: invokestatic 87	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   209: ifne +11 -> 220
    //   212: aload 20
    //   214: aload 16
    //   216: invokevirtual 107	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   219: pop
    //   220: aload 17
    //   222: invokestatic 87	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   225: ifne +41 -> 266
    //   228: aload 17
    //   230: ldc 109
    //   232: iconst_2
    //   233: invokevirtual 113	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   236: astore 24
    //   238: aload 24
    //   240: arraylength
    //   241: iconst_2
    //   242: if_icmpne +24 -> 266
    //   245: aload 20
    //   247: new 115	android/content/ComponentName
    //   250: dup
    //   251: aload 24
    //   253: iconst_0
    //   254: aaload
    //   255: aload 24
    //   257: iconst_1
    //   258: aaload
    //   259: invokespecial 118	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   262: invokevirtual 122	android/content/Intent:setComponent	(Landroid/content/ComponentName;)Landroid/content/Intent;
    //   265: pop
    //   266: aload_3
    //   267: aload 20
    //   269: ldc 123
    //   271: invokevirtual 129	android/content/pm/PackageManager:resolveActivity	(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //   274: ifnull +70 -> 344
    //   277: iconst_1
    //   278: istore 21
    //   280: aload 8
    //   282: aload 12
    //   284: iload 21
    //   286: invokevirtual 133	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   289: pop
    //   290: iinc 9 1
    //   293: goto -238 -> 55
    //   296: astore 30
    //   298: aload_1
    //   299: ldc 135
    //   301: new 38	org/json/JSONObject
    //   304: dup
    //   305: invokespecial 48	org/json/JSONObject:<init>	()V
    //   308: invokeinterface 139 3 0
    //   313: return
    //   314: astore 6
    //   316: aload_1
    //   317: ldc 135
    //   319: new 38	org/json/JSONObject
    //   322: dup
    //   323: invokespecial 48	org/json/JSONObject:<init>	()V
    //   326: invokeinterface 139 3 0
    //   331: return
    //   332: astore 10
    //   334: ldc 141
    //   336: aload 10
    //   338: invokestatic 146	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   341: goto -51 -> 290
    //   344: iconst_0
    //   345: istore 21
    //   347: goto -67 -> 280
    //   350: astore 22
    //   352: ldc 148
    //   354: aload 22
    //   356: invokestatic 146	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   359: goto -69 -> 290
    //   362: aload_1
    //   363: ldc 135
    //   365: aload 8
    //   367: invokeinterface 139 3 0
    //   372: return
    //
    // Exception table:
    //   from	to	target	type
    //   23	34	296	org/json/JSONException
    //   34	43	314	org/json/JSONException
    //   65	74	332	org/json/JSONException
    //   280	290	350	org/json/JSONException
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.k
 * JD-Core Version:    0.6.0
 */