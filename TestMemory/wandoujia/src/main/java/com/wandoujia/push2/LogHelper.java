package com.wandoujia.push2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.zxing.d;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.push2.protocol.NormalBody;

public final class LogHelper
  implements d
{
  static long a(Context paramContext)
  {
    return paramContext.getSharedPreferences("push2", 0).getLong("last_push_id", 0L);
  }

  public static Intent a(NormalBody paramNormalBody, String paramString)
  {
    Intent localIntent = null;
    try
    {
      localIntent = Intent.parseUri(paramNormalBody.getIntent(), 0);
      a(localIntent, paramNormalBody, paramString);
      return localIntent;
    }
    catch (Exception localException)
    {
      Log.d("PushUtils", "Parse intent failed: " + paramNormalBody.getIntent(), new Object[0]);
    }
    return localIntent;
  }

  static void a(Context paramContext, long paramLong)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("push2", 0).edit();
    localEditor.putLong("last_push_id", paramLong);
    localEditor.commit();
  }

  private static void a(Intent paramIntent, NormalBody paramNormalBody, String paramString)
  {
    paramIntent.setComponent(new ComponentName(g.a().b(), RedirectActivity.class));
    paramIntent.putExtra("push2_id", paramNormalBody.getId());
    paramIntent.putExtra("push2_title", paramNormalBody.getTitle());
    paramIntent.putExtra("push2_flag", 0);
    paramIntent.putExtra("push2_type", paramString);
  }

  public static void a(LogHelper.Action paramAction, TaskEvent.Result paramResult, c paramc)
  {
    TaskEvent.Builder localBuilder = new TaskEvent.Builder();
    localBuilder.action(TaskEvent.Action.PUSH);
    switch (b.b[paramAction.ordinal()])
    {
    default:
      return;
    case 1:
      localBuilder.status(TaskEvent.Status.START);
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      ThreadPool.execute(new a(paramc, localBuilder));
      return;
      localBuilder.status(TaskEvent.Status.PENDING).result(paramResult);
      continue;
      localBuilder.status(TaskEvent.Status.READY);
      switch (b.a[NotifyUtils.a(g.a().b()).ordinal()])
      {
      default:
        break;
      case 1:
        localBuilder.result(TaskEvent.Result.SUCCESS);
        break;
      case 2:
        localBuilder.result(TaskEvent.Result.FAIL);
        break;
      case 3:
        localBuilder.result(TaskEvent.Result.CANCEL);
        continue;
        localBuilder.status(TaskEvent.Status.TRIGGER);
        continue;
        localBuilder.status(TaskEvent.Status.END);
      }
    }
  }

  public static void a(LogHelper.Action paramAction, c paramc)
  {
    a(paramAction, TaskEvent.Result.SUCCESS, paramc);
  }

  public static boolean a(Context paramContext, Intent paramIntent)
  {
    try
    {
      paramIntent.addFlags(268435456);
      paramContext.startActivity(paramIntent);
      return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static Intent b(NormalBody paramNormalBody, String paramString)
  {
    Intent localIntent = new Intent("push2_delete_action");
    a(localIntent, paramNormalBody, paramString);
    return localIntent;
  }

  // ERROR //
  public final com.google.zxing.e a(com.google.zxing.b paramb, java.util.Map<com.google.zxing.DecodeHintType, ?> paramMap)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 230	com/google/zxing/aztec/a/a
    //   5: dup
    //   6: aload_1
    //   7: invokevirtual 236	com/google/zxing/b:c	()Lcom/google/zxing/common/b;
    //   10: invokespecial 239	com/google/zxing/aztec/a/a:<init>	(Lcom/google/zxing/common/b;)V
    //   13: astore 4
    //   15: aload 4
    //   17: iconst_0
    //   18: invokevirtual 242	com/google/zxing/aztec/a/a:a	(Z)Lcom/google/zxing/aztec/a;
    //   21: astore 22
    //   23: aload 22
    //   25: invokevirtual 248	com/google/zxing/aztec/a:e	()[Lcom/google/zxing/f;
    //   28: astore 23
    //   30: aload 23
    //   32: astore 6
    //   34: new 250	com/google/zxing/aztec/decoder/Decoder
    //   37: dup
    //   38: invokespecial 251	com/google/zxing/aztec/decoder/Decoder:<init>	()V
    //   41: aload 22
    //   43: invokevirtual 254	com/google/zxing/aztec/decoder/Decoder:a	(Lcom/google/zxing/aztec/a;)Lcom/wandoujia/ripple_framework/util/BadgeUtil;
    //   46: astore 24
    //   48: aload 24
    //   50: astore 7
    //   52: aconst_null
    //   53: astore 8
    //   55: aload 7
    //   57: ifnonnull +235 -> 292
    //   60: aload 4
    //   62: iconst_1
    //   63: invokevirtual 242	com/google/zxing/aztec/a/a:a	(Z)Lcom/google/zxing/aztec/a;
    //   66: astore 18
    //   68: aload 18
    //   70: invokevirtual 248	com/google/zxing/aztec/a:e	()[Lcom/google/zxing/f;
    //   73: astore 19
    //   75: new 250	com/google/zxing/aztec/decoder/Decoder
    //   78: dup
    //   79: invokespecial 251	com/google/zxing/aztec/decoder/Decoder:<init>	()V
    //   82: aload 18
    //   84: invokevirtual 254	com/google/zxing/aztec/decoder/Decoder:a	(Lcom/google/zxing/aztec/a;)Lcom/wandoujia/ripple_framework/util/BadgeUtil;
    //   87: astore 20
    //   89: aload 20
    //   91: astore 9
    //   93: aload 19
    //   95: astore 10
    //   97: aload_2
    //   98: ifnull +108 -> 206
    //   101: aload_2
    //   102: getstatic 260	com/google/zxing/DecodeHintType:NEED_RESULT_POINT_CALLBACK	Lcom/google/zxing/DecodeHintType;
    //   105: invokeinterface 266 2 0
    //   110: checkcast 268	com/google/zxing/g
    //   113: astore 14
    //   115: aload 14
    //   117: ifnull +89 -> 206
    //   120: aload 10
    //   122: arraylength
    //   123: istore 15
    //   125: iconst_0
    //   126: istore 16
    //   128: iload 16
    //   130: iload 15
    //   132: if_icmpge +74 -> 206
    //   135: aload 14
    //   137: aload 10
    //   139: iload 16
    //   141: aaload
    //   142: invokeinterface 271 2 0
    //   147: iinc 16 1
    //   150: goto -22 -> 128
    //   153: astore 21
    //   155: aconst_null
    //   156: astore 6
    //   158: aload 21
    //   160: astore 8
    //   162: aconst_null
    //   163: astore 7
    //   165: aconst_null
    //   166: astore_3
    //   167: goto -112 -> 55
    //   170: astore 5
    //   172: aconst_null
    //   173: astore 6
    //   175: aload 5
    //   177: astore_3
    //   178: aconst_null
    //   179: astore 7
    //   181: aconst_null
    //   182: astore 8
    //   184: goto -129 -> 55
    //   187: astore 17
    //   189: aload 8
    //   191: ifnull +6 -> 197
    //   194: aload 8
    //   196: athrow
    //   197: aload_3
    //   198: ifnull +5 -> 203
    //   201: aload_3
    //   202: athrow
    //   203: aload 17
    //   205: athrow
    //   206: new 273	com/google/zxing/e
    //   209: dup
    //   210: aload 9
    //   212: invokevirtual 277	com/wandoujia/ripple_framework/util/BadgeUtil:b	()Ljava/lang/String;
    //   215: aload 9
    //   217: invokevirtual 280	com/wandoujia/ripple_framework/util/BadgeUtil:a	()[B
    //   220: aload 10
    //   222: getstatic 286	com/google/zxing/BarcodeFormat:AZTEC	Lcom/google/zxing/BarcodeFormat;
    //   225: invokespecial 289	com/google/zxing/e:<init>	(Ljava/lang/String;[B[Lcom/google/zxing/f;Lcom/google/zxing/BarcodeFormat;)V
    //   228: astore 11
    //   230: aload 9
    //   232: invokevirtual 292	com/wandoujia/ripple_framework/util/BadgeUtil:c	()Ljava/util/List;
    //   235: astore 12
    //   237: aload 12
    //   239: ifnull +13 -> 252
    //   242: aload 11
    //   244: getstatic 298	com/google/zxing/ResultMetadataType:BYTE_SEGMENTS	Lcom/google/zxing/ResultMetadataType;
    //   247: aload 12
    //   249: invokevirtual 301	com/google/zxing/e:a	(Lcom/google/zxing/ResultMetadataType;Ljava/lang/Object;)V
    //   252: aload 9
    //   254: invokevirtual 303	com/wandoujia/ripple_framework/util/BadgeUtil:d	()Ljava/lang/String;
    //   257: astore 13
    //   259: aload 13
    //   261: ifnull +13 -> 274
    //   264: aload 11
    //   266: getstatic 306	com/google/zxing/ResultMetadataType:ERROR_CORRECTION_LEVEL	Lcom/google/zxing/ResultMetadataType;
    //   269: aload 13
    //   271: invokevirtual 301	com/google/zxing/e:a	(Lcom/google/zxing/ResultMetadataType;Ljava/lang/Object;)V
    //   274: aload 11
    //   276: areturn
    //   277: astore 17
    //   279: goto -90 -> 189
    //   282: astore 5
    //   284: goto -109 -> 175
    //   287: astore 21
    //   289: goto -131 -> 158
    //   292: aload 7
    //   294: astore 9
    //   296: aload 6
    //   298: astore 10
    //   300: goto -203 -> 97
    //
    // Exception table:
    //   from	to	target	type
    //   15	30	153	com/google/zxing/NotFoundException
    //   15	30	170	com/google/zxing/FormatException
    //   60	89	187	com/google/zxing/NotFoundException
    //   60	89	277	com/google/zxing/FormatException
    //   34	48	282	com/google/zxing/FormatException
    //   34	48	287	com/google/zxing/NotFoundException
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.LogHelper
 * JD-Core Version:    0.6.0
 */