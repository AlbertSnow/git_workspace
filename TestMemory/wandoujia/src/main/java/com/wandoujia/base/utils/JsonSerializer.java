package com.wandoujia.base.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonSerializer
{
  public static Object fromJson(String paramString, Class paramClass)
  {
    try
    {
      Object localObject = fromJsonObject(new JSONObject(paramString), paramClass);
      return localObject;
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  // ERROR //
  public static Object fromJsonObject(JSONObject paramJSONObject, Class paramClass)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 31	java/lang/Class:getDeclaredFields	()[Ljava/lang/reflect/Field;
    //   4: astore 5
    //   6: aload_1
    //   7: invokevirtual 35	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   10: astore 6
    //   12: aload 5
    //   14: arraylength
    //   15: istore 10
    //   17: iconst_0
    //   18: istore 11
    //   20: iload 11
    //   22: iload 10
    //   24: if_icmpge +494 -> 518
    //   27: aload 5
    //   29: iload 11
    //   31: aaload
    //   32: astore 12
    //   34: aload 12
    //   36: invokevirtual 41	java/lang/reflect/Field:getName	()Ljava/lang/String;
    //   39: astore 13
    //   41: aload 12
    //   43: invokevirtual 45	java/lang/reflect/Field:getType	()Ljava/lang/Class;
    //   46: astore 14
    //   48: aload 12
    //   50: iconst_1
    //   51: invokevirtual 49	java/lang/reflect/Field:setAccessible	(Z)V
    //   54: aload_0
    //   55: aload 13
    //   57: invokevirtual 53	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   60: ifeq +471 -> 531
    //   63: aload_0
    //   64: aload 13
    //   66: invokevirtual 56	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   69: ifne +462 -> 531
    //   72: aload_0
    //   73: aload 13
    //   75: invokevirtual 60	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   78: invokestatic 66	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   81: ifne +450 -> 531
    //   84: aload 14
    //   86: invokestatic 70	com/wandoujia/base/utils/JsonSerializer:isSimpleClassType	(Ljava/lang/Class;)Z
    //   89: ifeq +19 -> 108
    //   92: aload 12
    //   94: aload 6
    //   96: aload_0
    //   97: aload 13
    //   99: invokevirtual 74	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   102: invokevirtual 78	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   105: goto +426 -> 531
    //   108: aload 14
    //   110: ldc 80
    //   112: if_acmpne +34 -> 146
    //   115: aload_0
    //   116: aload 13
    //   118: invokevirtual 60	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   121: invokestatic 66	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   124: ifne +407 -> 531
    //   127: aload 12
    //   129: aload 6
    //   131: aload_0
    //   132: aload 13
    //   134: invokevirtual 83	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   137: invokestatic 87	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   140: invokevirtual 78	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   143: goto +388 -> 531
    //   146: aload 14
    //   148: ldc 89
    //   150: if_acmpne +22 -> 172
    //   153: aload 12
    //   155: aload 6
    //   157: aload_0
    //   158: aload 13
    //   160: invokevirtual 93	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   163: invokestatic 96	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   166: invokevirtual 78	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   169: goto +362 -> 531
    //   172: aload 14
    //   174: ldc 98
    //   176: if_acmpne +22 -> 198
    //   179: aload 12
    //   181: aload 6
    //   183: aload_0
    //   184: aload 13
    //   186: invokevirtual 102	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   189: invokestatic 105	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   192: invokevirtual 78	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   195: goto +336 -> 531
    //   198: aload 14
    //   200: getstatic 109	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   203: if_acmpne +19 -> 222
    //   206: aload 12
    //   208: aload 6
    //   210: aload_0
    //   211: aload 13
    //   213: invokevirtual 83	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   216: invokevirtual 113	java/lang/reflect/Field:setBoolean	(Ljava/lang/Object;Z)V
    //   219: goto +312 -> 531
    //   222: aload 14
    //   224: getstatic 114	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   227: if_acmpne +19 -> 246
    //   230: aload 12
    //   232: aload 6
    //   234: aload_0
    //   235: aload 13
    //   237: invokevirtual 93	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   240: invokevirtual 118	java/lang/reflect/Field:setInt	(Ljava/lang/Object;I)V
    //   243: goto +288 -> 531
    //   246: aload 14
    //   248: getstatic 119	java/lang/Long:TYPE	Ljava/lang/Class;
    //   251: if_acmpne +19 -> 270
    //   254: aload 12
    //   256: aload 6
    //   258: aload_0
    //   259: aload 13
    //   261: invokevirtual 102	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   264: invokevirtual 123	java/lang/reflect/Field:setLong	(Ljava/lang/Object;J)V
    //   267: goto +264 -> 531
    //   270: aload 14
    //   272: getstatic 126	java/lang/Double:TYPE	Ljava/lang/Class;
    //   275: if_acmpne +19 -> 294
    //   278: aload 12
    //   280: aload 6
    //   282: aload_0
    //   283: aload 13
    //   285: invokevirtual 130	org/json/JSONObject:getDouble	(Ljava/lang/String;)D
    //   288: invokevirtual 134	java/lang/reflect/Field:setDouble	(Ljava/lang/Object;D)V
    //   291: goto +240 -> 531
    //   294: ldc 136
    //   296: aload 14
    //   298: invokevirtual 139	java/lang/Class:isAssignableFrom	(Ljava/lang/Class;)Z
    //   301: ifeq +188 -> 489
    //   304: aload 12
    //   306: invokevirtual 143	java/lang/reflect/Field:getGenericType	()Ljava/lang/reflect/Type;
    //   309: astore 15
    //   311: aload 15
    //   313: ifnull +218 -> 531
    //   316: aload 15
    //   318: instanceof 145
    //   321: ifeq +210 -> 531
    //   324: aload 15
    //   326: checkcast 145	java/lang/reflect/ParameterizedType
    //   329: invokeinterface 149 1 0
    //   334: iconst_0
    //   335: aaload
    //   336: checkcast 27	java/lang/Class
    //   339: astore 16
    //   341: aload 16
    //   343: ldc 151
    //   345: if_acmpne +66 -> 411
    //   348: aload_0
    //   349: aload 13
    //   351: invokevirtual 155	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   354: astore 17
    //   356: new 157	java/util/ArrayList
    //   359: dup
    //   360: invokespecial 158	java/util/ArrayList:<init>	()V
    //   363: astore 18
    //   365: iconst_0
    //   366: istore 19
    //   368: iload 19
    //   370: aload 17
    //   372: invokevirtual 164	org/json/JSONArray:length	()I
    //   375: if_icmpge +24 -> 399
    //   378: aload 18
    //   380: aload 17
    //   382: iload 19
    //   384: invokevirtual 167	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   387: invokeinterface 173 2 0
    //   392: pop
    //   393: iinc 19 1
    //   396: goto -28 -> 368
    //   399: aload 12
    //   401: aload 6
    //   403: aload 18
    //   405: invokevirtual 78	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   408: goto +123 -> 531
    //   411: aload_0
    //   412: aload 13
    //   414: invokevirtual 155	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   417: astore 21
    //   419: ldc 169
    //   421: aload 14
    //   423: invokevirtual 139	java/lang/Class:isAssignableFrom	(Ljava/lang/Class;)Z
    //   426: ifeq +105 -> 531
    //   429: new 157	java/util/ArrayList
    //   432: dup
    //   433: invokespecial 158	java/util/ArrayList:<init>	()V
    //   436: astore 22
    //   438: iconst_0
    //   439: istore 23
    //   441: iload 23
    //   443: aload 21
    //   445: invokevirtual 164	org/json/JSONArray:length	()I
    //   448: if_icmpge +29 -> 477
    //   451: aload 22
    //   453: aload 21
    //   455: iload 23
    //   457: invokevirtual 177	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   460: aload 16
    //   462: invokestatic 21	com/wandoujia/base/utils/JsonSerializer:fromJsonObject	(Lorg/json/JSONObject;Ljava/lang/Class;)Ljava/lang/Object;
    //   465: invokeinterface 173 2 0
    //   470: pop
    //   471: iinc 23 1
    //   474: goto -33 -> 441
    //   477: aload 12
    //   479: aload 6
    //   481: aload 22
    //   483: invokevirtual 78	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   486: goto +45 -> 531
    //   489: aload 14
    //   491: invokevirtual 181	java/lang/Class:isArray	()Z
    //   494: ifne +37 -> 531
    //   497: aload 12
    //   499: aload 6
    //   501: aload_0
    //   502: aload 13
    //   504: invokevirtual 184	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   507: aload 14
    //   509: invokestatic 21	com/wandoujia/base/utils/JsonSerializer:fromJsonObject	(Lorg/json/JSONObject;Ljava/lang/Class;)Ljava/lang/Object;
    //   512: invokevirtual 78	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   515: goto +16 -> 531
    //   518: aload 6
    //   520: areturn
    //   521: astore 4
    //   523: aconst_null
    //   524: areturn
    //   525: astore_3
    //   526: aconst_null
    //   527: areturn
    //   528: astore_2
    //   529: aconst_null
    //   530: areturn
    //   531: iinc 11 1
    //   534: goto -514 -> 20
    //   537: astore 9
    //   539: aload 6
    //   541: areturn
    //   542: astore 8
    //   544: aload 6
    //   546: areturn
    //   547: astore 7
    //   549: aload 6
    //   551: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	12	521	org/json/JSONException
    //   0	12	525	java/lang/IllegalAccessException
    //   0	12	528	java/lang/InstantiationException
    //   12	17	537	java/lang/InstantiationException
    //   27	105	537	java/lang/InstantiationException
    //   115	143	537	java/lang/InstantiationException
    //   153	169	537	java/lang/InstantiationException
    //   179	195	537	java/lang/InstantiationException
    //   198	219	537	java/lang/InstantiationException
    //   222	243	537	java/lang/InstantiationException
    //   246	267	537	java/lang/InstantiationException
    //   270	291	537	java/lang/InstantiationException
    //   294	311	537	java/lang/InstantiationException
    //   316	341	537	java/lang/InstantiationException
    //   348	365	537	java/lang/InstantiationException
    //   368	393	537	java/lang/InstantiationException
    //   399	408	537	java/lang/InstantiationException
    //   411	438	537	java/lang/InstantiationException
    //   441	471	537	java/lang/InstantiationException
    //   477	486	537	java/lang/InstantiationException
    //   489	515	537	java/lang/InstantiationException
    //   12	17	542	java/lang/IllegalAccessException
    //   27	105	542	java/lang/IllegalAccessException
    //   115	143	542	java/lang/IllegalAccessException
    //   153	169	542	java/lang/IllegalAccessException
    //   179	195	542	java/lang/IllegalAccessException
    //   198	219	542	java/lang/IllegalAccessException
    //   222	243	542	java/lang/IllegalAccessException
    //   246	267	542	java/lang/IllegalAccessException
    //   270	291	542	java/lang/IllegalAccessException
    //   294	311	542	java/lang/IllegalAccessException
    //   316	341	542	java/lang/IllegalAccessException
    //   348	365	542	java/lang/IllegalAccessException
    //   368	393	542	java/lang/IllegalAccessException
    //   399	408	542	java/lang/IllegalAccessException
    //   411	438	542	java/lang/IllegalAccessException
    //   441	471	542	java/lang/IllegalAccessException
    //   477	486	542	java/lang/IllegalAccessException
    //   489	515	542	java/lang/IllegalAccessException
    //   12	17	547	org/json/JSONException
    //   27	105	547	org/json/JSONException
    //   115	143	547	org/json/JSONException
    //   153	169	547	org/json/JSONException
    //   179	195	547	org/json/JSONException
    //   198	219	547	org/json/JSONException
    //   222	243	547	org/json/JSONException
    //   246	267	547	org/json/JSONException
    //   270	291	547	org/json/JSONException
    //   294	311	547	org/json/JSONException
    //   316	341	547	org/json/JSONException
    //   348	365	547	org/json/JSONException
    //   368	393	547	org/json/JSONException
    //   399	408	547	org/json/JSONException
    //   411	438	547	org/json/JSONException
    //   441	471	547	org/json/JSONException
    //   477	486	547	org/json/JSONException
    //   489	515	547	org/json/JSONException
  }

  private static Field[] getAllFields(Class<?> paramClass)
  {
    if (paramClass == null)
      return new Field[0];
    ArrayList localArrayList = new ArrayList();
    Field[] arrayOfField1 = paramClass.getDeclaredFields();
    int i = arrayOfField1.length;
    for (int j = 0; j < i; j++)
      localArrayList.add(arrayOfField1[j]);
    Field[] arrayOfField2 = getAllFields(paramClass.getSuperclass());
    int k = arrayOfField2.length;
    for (int m = 0; m < k; m++)
      localArrayList.add(arrayOfField2[m]);
    return (Field[])localArrayList.toArray(new Field[0]);
  }

  private static boolean isSimpleClassType(Class paramClass)
  {
    return (paramClass == String.class) || (paramClass == Double.class);
  }

  public static String toJson(Object paramObject)
  {
    return toJsonObject(paramObject).toString();
  }

  public static String toJson(Collection paramCollection)
  {
    return toJsonArray(paramCollection).toString();
  }

  public static JSONArray toJsonArray(Collection paramCollection)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (localObject == null)
        continue;
      Class localClass = localObject.getClass();
      if (isSimpleClassType(localClass))
      {
        localJSONArray.put(localObject);
        continue;
      }
      if (Collection.class.isAssignableFrom(localClass))
      {
        localJSONArray.put(toJsonArray((Collection)localObject));
        continue;
      }
      if (localClass.isArray())
        continue;
      localJSONArray.put(toJsonObject(localObject));
    }
    return localJSONArray;
  }

  public static JSONObject toJsonObject(Object paramObject)
  {
    JSONObject localJSONObject = new JSONObject();
    Field[] arrayOfField = getAllFields(paramObject.getClass());
    int i = arrayOfField.length;
    int j = 0;
    while (true)
    {
      Field localField;
      if (j < i)
      {
        localField = arrayOfField[j];
        if (Modifier.isStatic(localField.getModifiers()))
          break label393;
        localField.setAccessible(true);
      }
      try
      {
        String str = localField.getName();
        if ((!str.equals("this$0")) && (!str.startsWith("shadow$_")))
        {
          Class localClass = localField.getType();
          if (isSimpleClassType(localClass))
          {
            if (localField.get(paramObject) != null)
              localJSONObject.put(str, localField.get(paramObject));
          }
          else if (localClass == Boolean.TYPE)
          {
            localJSONObject.put(str, localField.getBoolean(paramObject));
          }
          else if (localClass == Integer.TYPE)
          {
            localJSONObject.put(str, localField.getInt(paramObject));
          }
          else if (localClass == Long.TYPE)
          {
            localJSONObject.put(str, localField.getLong(paramObject));
          }
          else if (localClass == Double.TYPE)
          {
            localJSONObject.put(str, localField.getDouble(paramObject));
          }
          else if (localClass == Byte.TYPE)
          {
            localJSONObject.put(str, localField.getByte(paramObject));
          }
          else if (localClass == Short.TYPE)
          {
            localJSONObject.put(str, localField.getShort(paramObject));
          }
          else if (localClass == Float.TYPE)
          {
            localJSONObject.put(str, localField.getFloat(paramObject));
          }
          else if (localClass == Character.TYPE)
          {
            localJSONObject.put(str, localField.getChar(paramObject));
          }
          else if (Collection.class.isAssignableFrom(localClass))
          {
            Object localObject2 = localField.get(paramObject);
            if (localObject2 != null)
              localJSONObject.put(str, toJsonArray((Collection)localObject2));
          }
          else if (!localClass.isArray())
          {
            Object localObject1 = localField.get(paramObject);
            if (localObject1 != null)
            {
              localJSONObject.put(str, toJsonObject(localObject1));
              break label393;
              return localJSONObject;
            }
          }
        }
        label393: j++;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        break label393;
      }
      catch (JSONException localJSONException)
      {
        break label393;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        break label393;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.JsonSerializer
 * JD-Core Version:    0.6.0
 */