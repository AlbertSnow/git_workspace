package com.wandoujia.morph.a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.wandoujia.morph.engine.MoWidgetType;
import com.wandoujia.morph.engine.d;
import com.wandoujia.morph.engine.i;
import java.lang.reflect.Constructor;
import java.util.HashMap;

public final class a
  implements t<View>
{
  private static final HashMap<String, Constructor<? extends View>> a = new HashMap();
  private static final Class[] b = { Context.class, AttributeSet.class };
  private d c;
  private c d;

  public a(d paramd)
  {
    this.c = paramd;
  }

  private void a(View paramView, i parami)
  {
    if (this.d != null)
      this.d.a(paramView, parami);
  }

  // ERROR //
  @android.annotation.TargetApi(19)
  private View b(Context paramContext, i parami)
  {
    // Byte code:
    //   0: aload_2
    //   1: getstatic 64	com/wandoujia/morph/engine/MoStyleable:MorphCommonView	Lcom/wandoujia/morph/engine/MoStyleable;
    //   4: invokevirtual 69	com/wandoujia/morph/engine/i:a	(Lcom/wandoujia/morph/engine/MoStyleable;)Lcom/wandoujia/morph/engine/a;
    //   7: astore_3
    //   8: aload_3
    //   9: ifnull +270 -> 279
    //   12: aload_3
    //   13: invokevirtual 74	com/wandoujia/morph/engine/a:a	()I
    //   16: istore 20
    //   18: iconst_0
    //   19: istore 21
    //   21: aconst_null
    //   22: astore 22
    //   24: aconst_null
    //   25: astore 23
    //   27: iload 21
    //   29: iload 20
    //   31: if_icmpge +65 -> 96
    //   34: getstatic 79	com/wandoujia/morph/a/b:a	[I
    //   37: aload_3
    //   38: iload 21
    //   40: invokevirtual 82	com/wandoujia/morph/engine/a:a	(I)Lcom/wandoujia/morph/engine/MoAttrType;
    //   43: invokevirtual 87	com/wandoujia/morph/engine/MoAttrType:ordinal	()I
    //   46: iaload
    //   47: tableswitch	default:+21 -> 68, 1:+27->74, 2:+38->85
    //   69: iload 1
    //   71: goto -44 -> 27
    //   74: aload_3
    //   75: iload 21
    //   77: invokevirtual 91	com/wandoujia/morph/engine/a:f	(I)Ljava/lang/String;
    //   80: astore 22
    //   82: goto -14 -> 68
    //   85: aload_3
    //   86: iload 21
    //   88: invokevirtual 95	com/wandoujia/morph/engine/a:g	(I)Lcom/wandoujia/morph/engine/MoWidgetType;
    //   91: astore 23
    //   93: goto -25 -> 68
    //   96: aload 22
    //   98: astore 5
    //   100: aload 23
    //   102: astore 4
    //   104: aload 5
    //   106: invokestatic 101	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   109: ifne +8 -> 117
    //   112: aload 4
    //   114: ifnonnull +5 -> 119
    //   117: aconst_null
    //   118: areturn
    //   119: getstatic 25	com/wandoujia/morph/a/a:a	Ljava/util/HashMap;
    //   122: aload 5
    //   124: invokevirtual 105	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   127: checkcast 107	java/lang/reflect/Constructor
    //   130: astore 6
    //   132: aload 6
    //   134: ifnonnull +42 -> 176
    //   137: aload_1
    //   138: invokevirtual 111	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   141: aload 5
    //   143: invokevirtual 117	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   146: ldc 119
    //   148: invokevirtual 123	java/lang/Class:asSubclass	(Ljava/lang/Class;)Ljava/lang/Class;
    //   151: getstatic 33	com/wandoujia/morph/a/a:b	[Ljava/lang/Class;
    //   154: invokevirtual 127	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   157: astore 6
    //   159: aload 6
    //   161: iconst_1
    //   162: invokevirtual 131	java/lang/reflect/Constructor:setAccessible	(Z)V
    //   165: getstatic 25	com/wandoujia/morph/a/a:a	Ljava/util/HashMap;
    //   168: aload 5
    //   170: aload 6
    //   172: invokevirtual 135	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   175: pop
    //   176: aload 6
    //   178: iconst_2
    //   179: anewarray 5	java/lang/Object
    //   182: dup
    //   183: iconst_0
    //   184: aload_1
    //   185: aastore
    //   186: dup
    //   187: iconst_1
    //   188: aconst_null
    //   189: aastore
    //   190: invokevirtual 139	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   193: checkcast 119	android/view/View
    //   196: astore 12
    //   198: aload_0
    //   199: getfield 37	com/wandoujia/morph/a/a:c	Lcom/wandoujia/morph/engine/d;
    //   202: aload 4
    //   204: invokevirtual 144	com/wandoujia/morph/engine/d:a	(Lcom/wandoujia/morph/engine/MoWidgetType;)Lcom/wandoujia/morph/a/t;
    //   207: astore 18
    //   209: aload 18
    //   211: ifnull +13 -> 224
    //   214: aload 18
    //   216: aload 12
    //   218: aload_2
    //   219: invokeinterface 147 3 0
    //   224: aload_0
    //   225: aload 12
    //   227: aload_2
    //   228: invokespecial 148	com/wandoujia/morph/a/a:a	(Landroid/view/View;Lcom/wandoujia/morph/engine/i;)V
    //   231: aload 12
    //   233: areturn
    //   234: astore 17
    //   236: aload 12
    //   238: areturn
    //   239: astore 11
    //   241: aconst_null
    //   242: areturn
    //   243: astore 10
    //   245: aconst_null
    //   246: areturn
    //   247: astore 16
    //   249: aload 12
    //   251: areturn
    //   252: astore 9
    //   254: aconst_null
    //   255: areturn
    //   256: astore 15
    //   258: aload 12
    //   260: areturn
    //   261: astore 8
    //   263: aconst_null
    //   264: areturn
    //   265: astore 14
    //   267: aload 12
    //   269: areturn
    //   270: astore 7
    //   272: aconst_null
    //   273: areturn
    //   274: astore 13
    //   276: aload 12
    //   278: areturn
    //   279: aconst_null
    //   280: astore 4
    //   282: aconst_null
    //   283: astore 5
    //   285: goto -181 -> 104
    //
    // Exception table:
    //   from	to	target	type
    //   198	209	234	java/lang/NoSuchMethodException
    //   214	224	234	java/lang/NoSuchMethodException
    //   224	231	234	java/lang/NoSuchMethodException
    //   137	176	239	java/lang/NoSuchMethodException
    //   176	198	239	java/lang/NoSuchMethodException
    //   137	176	243	java/lang/ClassNotFoundException
    //   176	198	243	java/lang/ClassNotFoundException
    //   198	209	247	java/lang/ClassNotFoundException
    //   214	224	247	java/lang/ClassNotFoundException
    //   224	231	247	java/lang/ClassNotFoundException
    //   137	176	252	java/lang/InstantiationException
    //   176	198	252	java/lang/InstantiationException
    //   198	209	256	java/lang/InstantiationException
    //   214	224	256	java/lang/InstantiationException
    //   224	231	256	java/lang/InstantiationException
    //   137	176	261	java/lang/reflect/InvocationTargetException
    //   176	198	261	java/lang/reflect/InvocationTargetException
    //   198	209	265	java/lang/reflect/InvocationTargetException
    //   214	224	265	java/lang/reflect/InvocationTargetException
    //   224	231	265	java/lang/reflect/InvocationTargetException
    //   137	176	270	java/lang/IllegalAccessException
    //   176	198	270	java/lang/IllegalAccessException
    //   198	209	274	java/lang/IllegalAccessException
    //   214	224	274	java/lang/IllegalAccessException
    //   224	231	274	java/lang/IllegalAccessException
  }

  public final void a(c paramc)
  {
    this.d = paramc;
  }

  public final MoWidgetType p()
  {
    return MoWidgetType.MorphCommonView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.a.a
 * JD-Core Version:    0.6.0
 */