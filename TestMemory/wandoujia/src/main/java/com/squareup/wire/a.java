package com.squareup.wire;

import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;

final class a<B extends Message.Builder>
{
  private static final Comparator<Field> a = new b();
  private final List<Field> b;

  // ERROR //
  public a(Class<B> paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 26	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: new 28	java/util/ArrayList
    //   8: dup
    //   9: invokespecial 29	java/util/ArrayList:<init>	()V
    //   12: putfield 31	com/squareup/wire/a:b	Ljava/util/List;
    //   15: aload_1
    //   16: invokevirtual 37	java/lang/Class:getName	()Ljava/lang/String;
    //   19: astore_2
    //   20: aload_2
    //   21: iconst_0
    //   22: bipush 248
    //   24: aload_2
    //   25: invokevirtual 43	java/lang/String:length	()I
    //   28: iadd
    //   29: invokevirtual 47	java/lang/String:substring	(II)Ljava/lang/String;
    //   32: astore_3
    //   33: aload_3
    //   34: invokestatic 51	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   37: astore 5
    //   39: aload 5
    //   41: invokevirtual 55	java/lang/Class:getDeclaredFields	()[Ljava/lang/reflect/Field;
    //   44: astore 6
    //   46: aload 6
    //   48: arraylength
    //   49: istore 7
    //   51: iconst_0
    //   52: istore 8
    //   54: iload 8
    //   56: iload 7
    //   58: if_icmpge +121 -> 179
    //   61: aload 6
    //   63: iload 8
    //   65: aaload
    //   66: astore 9
    //   68: aload 9
    //   70: ldc 57
    //   72: invokevirtual 63	java/lang/reflect/Field:getAnnotation	(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   75: checkcast 57	com/squareup/wire/ProtoField
    //   78: astore 10
    //   80: aload 10
    //   82: ifnull +35 -> 117
    //   85: aload 10
    //   87: invokeinterface 67 1 0
    //   92: getstatic 73	com/squareup/wire/Message$Label:REQUIRED	Lcom/squareup/wire/Message$Label;
    //   95: if_acmpne +22 -> 117
    //   98: aload_0
    //   99: getfield 31	com/squareup/wire/a:b	Ljava/util/List;
    //   102: aload_1
    //   103: aload 9
    //   105: invokevirtual 74	java/lang/reflect/Field:getName	()Ljava/lang/String;
    //   108: invokevirtual 78	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   111: invokeinterface 84 2 0
    //   116: pop
    //   117: iinc 8 1
    //   120: goto -66 -> 54
    //   123: astore 4
    //   125: new 86	java/lang/AssertionError
    //   128: dup
    //   129: new 88	java/lang/StringBuilder
    //   132: dup
    //   133: ldc 90
    //   135: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   138: aload_2
    //   139: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: invokespecial 103	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   148: athrow
    //   149: astore 11
    //   151: new 86	java/lang/AssertionError
    //   154: dup
    //   155: new 88	java/lang/StringBuilder
    //   158: dup
    //   159: ldc 105
    //   161: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   164: aload 9
    //   166: invokevirtual 74	java/lang/reflect/Field:getName	()Ljava/lang/String;
    //   169: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   175: invokespecial 103	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   178: athrow
    //   179: aload_0
    //   180: getfield 31	com/squareup/wire/a:b	Ljava/util/List;
    //   183: getstatic 20	com/squareup/wire/a:a	Ljava/util/Comparator;
    //   186: invokestatic 111	java/util/Collections:sort	(Ljava/util/List;Ljava/util/Comparator;)V
    //   189: return
    //
    // Exception table:
    //   from	to	target	type
    //   33	39	123	java/lang/ClassNotFoundException
    //   98	117	149	java/lang/NoSuchFieldException
  }

  public final <B extends Message.Builder> void a(B paramB)
  {
    Object localObject1 = null;
    Object localObject2 = "";
    while (true)
    {
      int j;
      try
      {
        int i = this.b.size();
        j = 0;
        if (j >= i)
          continue;
        Field localField = (Field)this.b.get(j);
        if (localField.get(paramB) != null)
          break label208;
        if (localObject1 != null)
          break label226;
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("\n  ");
        ((StringBuilder)localObject1).append(localField.getName());
        break label208;
        if (localObject1 != null)
        {
          String str = paramB.getClass().getName();
          if ((!str.contains("$")) || (!str.contains(".")))
            continue;
          int k = 1 + str.lastIndexOf(".");
          int m = str.lastIndexOf("$");
          if (m <= k)
            continue;
          str = str.substring(k, m);
          throw new IllegalStateException(str + "'s required field" + (String)localObject2 + " not set:" + localObject1);
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new AssertionError("Unable to access required fields");
      }
      return;
      label208: Object localObject3 = localObject2;
      Object localObject4 = localObject1;
      j++;
      localObject1 = localObject4;
      localObject2 = localObject3;
      continue;
      label226: localObject2 = "s";
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.a
 * JD-Core Version:    0.6.0
 */