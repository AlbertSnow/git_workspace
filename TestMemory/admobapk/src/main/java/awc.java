import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class awc
{
  public static String a(awb paramawb)
  {
    if (paramawb == null)
      return "";
    StringBuffer localStringBuffer = new StringBuffer();
    try
    {
      a(null, paramawb, new StringBuffer(), localStringBuffer);
      return localStringBuffer.toString();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      String str2 = String.valueOf(localIllegalAccessException.getMessage());
      if (str2.length() != 0)
        return "Error printing proto: ".concat(str2);
      return new String("Error printing proto: ");
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      String str1 = String.valueOf(localInvocationTargetException.getMessage());
      if (str1.length() != 0)
        return "Error printing proto: ".concat(str1);
    }
    return new String("Error printing proto: ");
  }

  private static String a(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    if (i < paramString.length())
    {
      char c = paramString.charAt(i);
      if (i == 0)
        localStringBuffer.append(Character.toLowerCase(c));
      while (true)
      {
        i++;
        break;
        if (Character.isUpperCase(c))
        {
          localStringBuffer.append('_').append(Character.toLowerCase(c));
          continue;
        }
        localStringBuffer.append(c);
      }
    }
    return localStringBuffer.toString();
  }

  private static void a(String paramString, Object paramObject, StringBuffer paramStringBuffer1, StringBuffer paramStringBuffer2)
  {
    if (paramObject != null)
    {
      if (!(paramObject instanceof awb))
        break label478;
      int i = paramStringBuffer1.length();
      if (paramString != null)
      {
        paramStringBuffer2.append(paramStringBuffer1).append(a(paramString)).append(" <\n");
        paramStringBuffer1.append("  ");
      }
      Class localClass1 = paramObject.getClass();
      Field[] arrayOfField = localClass1.getFields();
      int j = arrayOfField.length;
      int k = 0;
      if (k < j)
      {
        Field localField = arrayOfField[k];
        int i1 = localField.getModifiers();
        String str10 = localField.getName();
        Object localObject;
        if ((!"cachedSize".equals(str10)) && ((i1 & 0x1) == 1) && ((i1 & 0x8) != 8) && (!str10.startsWith("_")) && (!str10.endsWith("_")))
        {
          Class localClass2 = localField.getType();
          localObject = localField.get(paramObject);
          if (!localClass2.isArray())
            break label240;
          if (localClass2.getComponentType() != Byte.TYPE)
            break label192;
          a(str10, localObject, paramStringBuffer1, paramStringBuffer2);
        }
        while (true)
        {
          k++;
          break;
          label192: if (localObject == null);
          for (int i2 = 0; ; i2 = Array.getLength(localObject))
          {
            for (int i3 = 0; i3 < i2; i3++)
              a(str10, Array.get(localObject, i3), paramStringBuffer1, paramStringBuffer2);
            break;
          }
          label240: a(str10, localObject, paramStringBuffer1, paramStringBuffer2);
        }
      }
      Method[] arrayOfMethod = localClass1.getMethods();
      int m = arrayOfMethod.length;
      int n = 0;
      while (true)
        if (n < m)
        {
          String str4 = arrayOfMethod[n].getName();
          String str5;
          if (str4.startsWith("set"))
            str5 = str4.substring(3);
          try
          {
            String str6 = String.valueOf(str5);
            if (str6.length() != 0)
            {
              str7 = "has".concat(str6);
              label326: Method localMethod1 = localClass1.getMethod(str7, new Class[0]);
              if (!((Boolean)localMethod1.invoke(paramObject, new Object[0])).booleanValue());
            }
          }
          catch (NoSuchMethodException localNoSuchMethodException1)
          {
            try
            {
              String str7;
              String str8 = String.valueOf(str5);
              if (str8.length() != 0);
              for (String str9 = "get".concat(str8); ; str9 = new String("get"))
              {
                Method localMethod2 = localClass1.getMethod(str9, new Class[0]);
                a(str5, localMethod2.invoke(paramObject, new Object[0]), paramStringBuffer1, paramStringBuffer2);
                while (true)
                {
                  label412: n++;
                  break;
                  str7 = new String("has");
                  break label326;
                  localNoSuchMethodException1 = localNoSuchMethodException1;
                }
              }
            }
            catch (NoSuchMethodException localNoSuchMethodException2)
            {
              break label412;
            }
          }
        }
      if (paramString != null)
      {
        paramStringBuffer1.setLength(i);
        paramStringBuffer2.append(paramStringBuffer1).append(">\n");
      }
    }
    return;
    label478: String str1 = a(paramString);
    paramStringBuffer2.append(paramStringBuffer1).append(str1).append(": ");
    if ((paramObject instanceof String))
    {
      String str2 = (String)paramObject;
      if ((!str2.startsWith("http")) && (str2.length() > 200))
        str2 = String.valueOf(str2.substring(0, 200)).concat("[...]");
      String str3 = b(str2);
      paramStringBuffer2.append("\"").append(str3).append("\"");
    }
    while (true)
    {
      paramStringBuffer2.append("\n");
      return;
      if ((paramObject instanceof byte[]))
      {
        a((byte[])paramObject, paramStringBuffer2);
        continue;
      }
      paramStringBuffer2.append(paramObject);
    }
  }

  private static void a(byte[] paramArrayOfByte, StringBuffer paramStringBuffer)
  {
    if (paramArrayOfByte == null)
    {
      paramStringBuffer.append("\"\"");
      return;
    }
    paramStringBuffer.append('"');
    int i = 0;
    if (i < paramArrayOfByte.length)
    {
      int j = 0xFF & paramArrayOfByte[i];
      if ((j == 92) || (j == 34))
        paramStringBuffer.append('\\').append((char)j);
      while (true)
      {
        i++;
        break;
        if ((j >= 32) && (j < 127))
        {
          paramStringBuffer.append((char)j);
          continue;
        }
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(j);
        paramStringBuffer.append(String.format("\\%03o", arrayOfObject));
      }
    }
    paramStringBuffer.append('"');
  }

  private static String b(String paramString)
  {
    int i = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(i);
    int j = 0;
    if (j < i)
    {
      char c = paramString.charAt(j);
      if ((c >= ' ') && (c <= '~') && (c != '"') && (c != '\''))
        localStringBuilder.append(c);
      while (true)
      {
        j++;
        break;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(c);
        localStringBuilder.append(String.format("\\u%04x", arrayOfObject));
      }
    }
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awc
 * JD-Core Version:    0.6.0
 */