package com.unionpay.pboctransaction;

import android.os.Bundle;
import android.support.v4.app.i;
import com.unionpay.pboctransaction.model.b;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  private static Date c = new Date(System.currentTimeMillis());
  private static String d = new SimpleDateFormat("yyyyMMddhhmmss").format(c);
  private static HashMap<String, String> e = new HashMap();
  private byte a = 0;
  private byte b = 1;
  private c f;
  private d g;

  public e(c paramc, d paramd)
  {
    this.f = paramc;
    this.g = paramd;
  }

  private static String a(String paramString1, String paramString2)
  {
    int i = 1;
    if (paramString1 == null)
      return null;
    byte[] arrayOfByte1 = i.b(paramString1);
    int j = 0;
    if (j < arrayOfByte1.length)
      if ((byte)(0x1F & arrayOfByte1[j]) != 31)
        break label529;
    label517: label529: for (int k = 2; ; k = i)
    {
      byte[] arrayOfByte2 = new byte[k];
      System.arraycopy(arrayOfByte1, j, arrayOfByte2, 0, k);
      int i4;
      int i5;
      if (i.a(arrayOfByte2, k).compareToIgnoreCase(paramString2) == 0)
      {
        i4 = k + j;
        if ((byte)(0x80 & arrayOfByte1[i4]) != -128)
          i5 = 0xFF & arrayOfByte1[i4];
      }
      while (true)
      {
        byte[] arrayOfByte3 = new byte[i5];
        System.arraycopy(arrayOfByte1, i4 + i, arrayOfByte3, 0, i5);
        return i.a(arrayOfByte3, i5);
        i = 1 + (0x7F & arrayOfByte1[i4]);
        if (i == 2)
        {
          i5 = 0xFF & arrayOfByte1[(i4 + 1)];
          continue;
        }
        if (i == 3)
        {
          i5 = (0xFF & arrayOfByte1[(i4 + 1)]) << 8 | 0xFF & arrayOfByte1[(i4 + 2)];
          continue;
        }
        if (i == 4)
        {
          i5 = (0xFF & arrayOfByte1[(i4 + 1)]) << 16 | (0xFF & arrayOfByte1[(i4 + 2)]) << 8 | 0xFF & arrayOfByte1[(i4 + 3)];
          continue;
          int i2;
          if ((0x20 & arrayOfByte1[j]) == 32)
          {
            i2 = k + j;
            if ((i2 >= arrayOfByte1.length) || ((byte)(0x80 & arrayOfByte1[i2]) != -128))
              break label517;
          }
          for (int i3 = 1 + (0x7F & arrayOfByte1[i2]); ; i3 = i)
          {
            j = i3 + i2;
            break;
            int m = j + k;
            int i1;
            if ((m < arrayOfByte1.length) && ((byte)(0x80 & arrayOfByte1[m]) == 0))
            {
              i1 = 0xFF & arrayOfByte1[m];
              n = i;
              j = m + (i1 + n);
              break;
            }
            if (m < arrayOfByte1.length);
            for (int n = 1 + (0x7F & arrayOfByte1[m]); ; n = 0)
            {
              if ((n == 2) && (m + 1 < arrayOfByte1.length))
              {
                i1 = 0xFF & arrayOfByte1[(m + 1)];
                break;
              }
              if ((n == 3) && (m + 2 < arrayOfByte1.length))
              {
                i1 = (0xFF & arrayOfByte1[(m + 1)]) << 8 | 0xFF & arrayOfByte1[(m + 2)];
                break;
              }
              if ((n == 4) && (m + 2 < arrayOfByte1.length))
              {
                i1 = (0xFF & arrayOfByte1[(m + 1)]) << 16 | (0xFF & arrayOfByte1[(m + 2)]) << 8 | 0xFF & arrayOfByte1[(m + 3)];
                break;
                return null;
              }
              i1 = 0;
              break;
            }
          }
        }
        i5 = 0;
      }
    }
  }

  private static String a(String paramString, boolean paramBoolean)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    byte[] arrayOfByte1 = paramString.toUpperCase().getBytes();
    int i = arrayOfByte1.length;
    for (int j = 0; j < i; j++)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Byte.valueOf(arrayOfByte1[j]);
      localStringBuffer.append(String.format("%02X", arrayOfObject));
    }
    int k = localStringBuffer.length() / 2 + localStringBuffer.length() % 2;
    if (!paramBoolean)
      if (k % 8 == 0)
        break label199;
    label199: for (int n = k + (8 - k % 8); ; n = k)
    {
      byte[] arrayOfByte3 = new byte[n];
      System.arraycopy(i.b(localStringBuffer.toString()), 0, arrayOfByte3, 0, k);
      return i.a(arrayOfByte3, n);
      int m = k + 1;
      if (m % 8 != 0)
        m += 8 - m % 8;
      byte[] arrayOfByte2 = new byte[m];
      System.arraycopy(i.b(localStringBuffer.toString()), 0, arrayOfByte2, 0, k);
      arrayOfByte2[k] = -128;
      return i.a(arrayOfByte2, m);
    }
  }

  private String a(byte[] paramArrayOfByte)
  {
    paramArrayOfByte[0] = (byte)(paramArrayOfByte[0] | this.a);
    byte[] arrayOfByte1 = this.f.a(paramArrayOfByte, this.a);
    int i;
    label114: byte[] arrayOfByte2;
    int j;
    if (arrayOfByte1 != null)
    {
      i = arrayOfByte1.length;
      if ((i >= 2) && (arrayOfByte1[(i - 2)] == 97))
      {
        int k = arrayOfByte1[(i - 1)];
        byte[] arrayOfByte3 = new byte[5];
        arrayOfByte3[0] = this.a;
        arrayOfByte3[1] = -64;
        arrayOfByte3[2] = 0;
        arrayOfByte3[3] = 0;
        arrayOfByte3[4] = k;
        arrayOfByte1 = this.f.a(arrayOfByte3, this.a);
        if (arrayOfByte1 == null)
          break label212;
        i = arrayOfByte1.length;
      }
      if ((i < 2) || (arrayOfByte1[(i - 2)] != 108))
        break label254;
      paramArrayOfByte[(-1 + paramArrayOfByte.length)] = arrayOfByte1[(i - 1)];
      arrayOfByte2 = this.f.a(paramArrayOfByte, this.a);
      j = 0;
      if (arrayOfByte2 != null)
        j = arrayOfByte2.length;
    }
    while (true)
    {
      if ((j > 2) && (arrayOfByte2[(j - 2)] == -112) && (arrayOfByte2[(j - 1)] == 0))
      {
        return i.a(arrayOfByte2, j - 2);
        i = 0;
        break;
        label212: i = 0;
        break label114;
      }
      if ((j == 2) && (arrayOfByte2[(j - 2)] == -112) && (arrayOfByte2[(j - 1)] == 0))
        return i.a(arrayOfByte2, 2);
      return null;
      label254: j = i;
      arrayOfByte2 = arrayOfByte1;
    }
  }

  private String a(byte[] paramArrayOfByte, String paramString)
  {
    paramArrayOfByte[4] = (byte)(paramString.length() / 2);
    byte[] arrayOfByte = new byte[5 + paramString.length() / 2];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, 5);
    System.arraycopy(i.b(paramString), 0, arrayOfByte, 5, paramString.length() / 2);
    return a(arrayOfByte);
  }

  private static void a(String paramString, StringBuffer paramStringBuffer)
  {
    String str1 = (String)e.get(paramString);
    byte[] arrayOfByte = new byte[1];
    arrayOfByte[0] = (byte)(str1.length() / 2);
    String str2 = i.a(arrayOfByte, 1);
    paramStringBuffer.append(paramString);
    paramStringBuffer.append(str2);
    paramStringBuffer.append(str1);
  }

  private String b(String paramString)
  {
    this.a = 0;
    String str1 = null;
    if (paramString != null)
    {
      Integer localInteger = Integer.valueOf(paramString.length() / 2);
      byte[] arrayOfByte = new byte[1];
      arrayOfByte[0] = localInteger.byteValue();
      String str2 = i.a(arrayOfByte, 1);
      str1 = a(i.b("00a40400" + str2 + paramString));
    }
    return str1;
  }

  private void b(byte[] paramArrayOfByte)
  {
    int i = 1 + d.length() / 2;
    byte[] arrayOfByte1 = new byte[i];
    System.arraycopy(i.b(d), 0, arrayOfByte1, 0, d.length() / 2);
    arrayOfByte1[(i - 1)] = -128;
    paramArrayOfByte[4] = (byte)arrayOfByte1.length;
    byte[] arrayOfByte2 = new byte[5 + arrayOfByte1.length];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, 0, 5);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 5, arrayOfByte1.length);
    a(arrayOfByte2);
  }

  private String c(String paramString)
  {
    int i = 0;
    String str1 = a(paramString, "80");
    if (str1 == null)
      return null;
    e.put("82", str1.substring(0, 4));
    byte[] arrayOfByte1 = i.b(str1.substring(4));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("5A");
    localArrayList.add("5F34");
    localArrayList.add("9F1F");
    localArrayList.add("57");
    localArrayList.add("5F24");
    localArrayList.add("9F10");
    localArrayList.add("8C");
    localArrayList.add("8D");
    int j;
    int k;
    label192: int m;
    try
    {
      if (i < arrayOfByte1.length)
      {
        byte[] arrayOfByte2 = { 0, -78, 0, 0, 0 };
        byte[] arrayOfByte3 = new byte[4];
        System.arraycopy(arrayOfByte1, i, arrayOfByte3, 0, 4);
        j = i + 4;
        k = arrayOfByte3[1];
        if (k <= arrayOfByte3[2])
        {
          arrayOfByte2[4] = 0;
          arrayOfByte2[3] = (byte)(0x4 | 0xFFFFFFF8 & arrayOfByte3[0]);
          arrayOfByte2[2] = k;
          m = (byte)(k + 1);
          String str2 = a(arrayOfByte2);
          if (str2 != null)
          {
            Iterator localIterator = localArrayList.iterator();
            while (localIterator.hasNext())
            {
              String str3 = (String)localIterator.next();
              String str4 = a(str2, str3);
              if (str4 == null)
                continue;
              e.put(str3, str4);
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
    }
    while (true)
    {
      return (String)e.get("8C");
      k = m;
      break label192;
      i = j;
      break;
      StringBuffer localStringBuffer = new StringBuffer((String)e.get("5F34"));
      localStringBuffer.insert(0, "0");
      e.put("5F34", localStringBuffer.toString());
    }
  }

  private String d(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer("80AE800034");
    Iterator localIterator1 = h(paramString).iterator();
    while (true)
    {
      if (!localIterator1.hasNext())
        break label104;
      String str2 = (String)localIterator1.next();
      Iterator localIterator2 = e.keySet().iterator();
      if (!localIterator2.hasNext())
        continue;
      String str3 = (String)localIterator2.next();
      if (str2.compareToIgnoreCase(str3) != 0)
        break;
      localStringBuffer.append((String)e.get(str3));
    }
    label104: String str1 = a(i.b(localStringBuffer.toString()));
    if (str1 != null)
    {
      e.put("9F27", str1.substring(4, 6));
      e.put("9F36", str1.substring(6, 10));
      e.put("9F26", str1.substring(10, 26));
      e.put("9F10", str1.substring(26));
    }
    return str1;
  }

  private static void d()
  {
    String str = d.substring(2, 8);
    e.put("9F26", "");
    e.put("9F27", "80");
    e.put("9F10", "");
    e.put("9F37", "00000000");
    e.put("9F36", "");
    e.put("95", "0000000800");
    e.put("9A", str);
    e.put("9C", "45");
    e.put("9F02", "000000000000");
    e.put("5F2A", "0156");
    e.put("82", "");
    e.put("9F1A", "0156");
    e.put("9F03", "000000000000");
    e.put("9F33", "A04000");
    e.put("9F34", "000000");
    e.put("9F35", "34");
    e.put("9F1E", "3030303030303030");
    e.put("84", "");
    e.put("9F09", "0001");
    e.put("9F74", "");
    e.put("9F63", "");
    e.put("9F7A", "01");
    e.put("9F21", d.substring(8));
    e.put("9F4E", "0000000000000000000000000000000000000000");
    e.put("DF31", "0100000000");
  }

  private String e(String paramString)
  {
    this.a = this.b;
    byte[] arrayOfByte1 = { -128, 26, 19, 1, 0 };
    byte[] arrayOfByte2 = { -128, -6, 0, 0, 0 };
    String str1 = a(paramString, false);
    b(arrayOfByte1);
    String str2 = a(arrayOfByte2, str1);
    this.a = 0;
    return str2;
  }

  private boolean e()
  {
    for (String str1 = (String)e.get("5A"); str1.substring(-1 + str1.length(), str1.length()).equalsIgnoreCase("f"); str1 = str1.substring(0, -1 + str1.length()));
    String str2 = e(str1);
    if ((str2 == null) || (str2.length() == 0))
      return false;
    e.put("AN1", str2);
    String str3 = e("00000001");
    if ((str3 == null) || (str3.length() == 0))
      return false;
    e.put("TID", str3);
    String str4 = e((String)e.get("9F02"));
    if ((str4 == null) || (str4.length() == 0))
      return false;
    e.put("AMT", str4);
    String str5 = e("156");
    if ((str5 == null) || (str5.length() == 0))
      return false;
    e.put("CUR", str5);
    for (String str6 = (String)e.get("57"); (str6.substring(-1 + str6.length(), str6.length()).equalsIgnoreCase("f")) || (str6.substring(-1 + str6.length(), str6.length()).equalsIgnoreCase("F")); str6 = str6.substring(0, -1 + str6.length()));
    String str7 = e(str6);
    if ((str7 == null) || (str7.length() == 0))
      return false;
    e.put("TD2", str7);
    if ((e.get("5F24") != null) && (((String)e.get("5F24")).length() == 6))
    {
      String str8 = e(((String)e.get("5F24")).substring(0, 4));
      if ((str8 == null) || (str8.length() == 0))
        return false;
      e.put("ED", str8);
    }
    return true;
  }

  private String f()
  {
    StringBuffer localStringBuffer = new StringBuffer("80A800000b8309");
    Iterator localIterator1 = h("9F7A019F02065F2A02").iterator();
    while (true)
    {
      if (!localIterator1.hasNext())
        break label105;
      String str1 = (String)localIterator1.next();
      Iterator localIterator2 = e.keySet().iterator();
      if (!localIterator2.hasNext())
        continue;
      String str2 = (String)localIterator2.next();
      if (str1.compareToIgnoreCase(str2) != 0)
        break;
      localStringBuffer.append((String)e.get(str2));
    }
    label105: return a(i.b(localStringBuffer.toString()));
  }

  private String f(String paramString)
  {
    this.a = this.b;
    byte[] arrayOfByte1 = { -128, 26, 20, 1, 0 };
    byte[] arrayOfByte2 = { -128, -6, 0, 0, 0 };
    StringBuilder localStringBuilder = new StringBuilder();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramString.length());
    String str1 = String.format("%02d", arrayOfObject) + paramString;
    StringBuffer localStringBuffer = new StringBuffer(str1);
    for (int i = 0; i < 16 - str1.length(); i++)
      localStringBuffer.append("F");
    b(arrayOfByte1);
    String str2 = a(arrayOfByte2, localStringBuffer.toString());
    if (str2 != null)
      e.put("PIN", str2);
    this.a = 0;
    return str2;
  }

  private String g()
  {
    this.a = this.b;
    String str = a(new byte[] { 0, -80, -126, 0, 10 });
    if ((str != null) && (str.length() != 0))
      e.put("CSN", str);
    this.a = 0;
    return str;
  }

  private String g(String paramString)
  {
    this.a = this.b;
    byte[] arrayOfByte1 = { -128, 26, 21, 1, 8 };
    byte[] arrayOfByte2 = { -128, -6, 1, 0, 0 };
    String str1 = a(paramString, true);
    b(arrayOfByte1);
    while (str1.length() > 448)
    {
      arrayOfByte2[2] = 3;
      a(arrayOfByte2, str1.substring(0, 448).toUpperCase());
      str1 = str1.substring(448);
    }
    arrayOfByte2[2] = 1;
    String str2 = a(arrayOfByte2, str1);
    if (str2 != null)
      e.put("MAC", str2.toUpperCase());
    this.a = 0;
    return str2.toUpperCase();
  }

  private static Bundle h()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("action_resp_code", "0000");
    return localBundle;
  }

  private static List<String> h(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramString == null)
      return localArrayList;
    byte[] arrayOfByte1 = i.b(paramString);
    int i = 0;
    if (i < arrayOfByte1.length)
      if ((byte)(0x1F & arrayOfByte1[i]) != 31)
        break label127;
    label127: for (int j = 2; ; j = 1)
    {
      byte[] arrayOfByte2 = new byte[j];
      System.arraycopy(arrayOfByte1, i, arrayOfByte2, 0, j);
      localArrayList.add(i.a(arrayOfByte2, j));
      int k = j + i;
      if ((k < arrayOfByte1.length) && ((byte)(0x80 & arrayOfByte1[k]) == -128));
      for (int m = 1 + (0x7F & arrayOfByte1[k]); ; m = 1)
      {
        i = m + k;
        break;
        return localArrayList;
      }
    }
  }

  public final Bundle a(AppIdentification paramAppIdentification, String paramString1, String paramString2, HashMap<String, String> paramHashMap)
  {
    monitorenter;
    Bundle localBundle1;
    Bundle localBundle2;
    while (true)
    {
      try
      {
        this.f.a();
        d();
        e.put("PIN", paramString1);
        e.put("9F02", paramHashMap.get("trans_amt"));
        e.put("9F1A", "0156");
        e.put("5F2A", paramHashMap.get("trans currcy code"));
        e.put("9C", paramHashMap.get("trans_type"));
        String str1 = paramAppIdentification.a();
        localBundle1 = h();
        c = new Date(System.currentTimeMillis());
        d = new SimpleDateFormat("yyyyMMddHHmmss").format(c);
        new String(d);
        String str2 = a();
        if ((str2 != null) && (str2.length() != 0))
          continue;
        localBundle1.putString("action_resp_code", "10019");
        if (localBundle1.getString("action_resp_code") == "0000")
          break label384;
        this.f.b();
        localBundle2 = localBundle1;
        return localBundle2;
        String str9 = b(str1);
        if ((str9 == null) || (str9.length() == 0))
        {
          localBundle1.putString("action_resp_code", "10019");
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      String str10 = f();
      if ((str10 == null) || (str10.length() == 0))
      {
        localBundle1.putString("action_resp_code", "10020");
        continue;
      }
      String str11 = c(str10);
      if ((str11 == null) || (str11.length() == 0))
      {
        localBundle1.putString("action_resp_code", "10019");
        continue;
      }
      String str12 = d(str11);
      if ((str12 == null) || (str12.length() == 0))
      {
        localBundle1.putString("action_resp_code", "10019");
        continue;
      }
      String str13 = g();
      if ((str13 != null) && (str13.length() != 0))
        continue;
      localBundle1.putString("action_resp_code", "10019");
      continue;
      label384: String str3 = f((String)e.get("PIN"));
      if ((str3 == null) || (str3.length() == 0))
      {
        this.f.b();
        localBundle1.putString("action_resp_code", "10019");
        localBundle2 = localBundle1;
        continue;
      }
      if (!e())
      {
        this.f.b();
        localBundle1.putString("action_resp_code", "10019");
        localBundle2 = localBundle1;
        continue;
      }
      StringBuffer localStringBuffer = new StringBuffer();
      a("9F26", localStringBuffer);
      a("9F27", localStringBuffer);
      a("9F10", localStringBuffer);
      a("9F37", localStringBuffer);
      a("9F36", localStringBuffer);
      a("95", localStringBuffer);
      a("9A", localStringBuffer);
      a("9C", localStringBuffer);
      a("9F02", localStringBuffer);
      a("5F2A", localStringBuffer);
      a("82", localStringBuffer);
      a("9F1A", localStringBuffer);
      a("9F03", localStringBuffer);
      a("9F33", localStringBuffer);
      a("9F34", localStringBuffer);
      a("9F35", localStringBuffer);
      a("9F1E", localStringBuffer);
      String str4 = localStringBuffer.toString();
      e.put("DCD", str4);
      if ((e.get("TID") != null) && (e.get("AMT") != null) && (e.get("CUR") != null) && (e.get("AN1") != null) && (e.get("CSN") != null) && (e.get("5F34") != null))
        break;
      this.f.b();
      localBundle1.putString("action_resp_code", "10019");
      localBundle2 = localBundle1;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(d);
    if (e.get("TID") != null)
      localArrayList.add(e.get("TID"));
    if (e.get("AMT") != null)
      localArrayList.add(e.get("AMT"));
    if (e.get("CUR") != null)
      localArrayList.add(e.get("CUR"));
    if (e.get("AN1") != null)
      localArrayList.add(e.get("AN1"));
    e.put("AN1", i.d((String)e.get("5A")));
    if (e.get("CSN") != null)
      localArrayList.add(e.get("CSN"));
    if (e.get("5F34") != null)
      localArrayList.add(e.get("5F34"));
    if (e.get("DCD") != null)
      localArrayList.add(e.get("DCD"));
    Object localObject2 = "";
    Iterator localIterator = localArrayList.iterator();
    while (true)
    {
      while (true)
      {
        if (localIterator.hasNext())
        {
          String str8 = (String)localIterator.next();
          if (str8 == null)
            break label1457;
          localObject3 = (String)localObject2 + str8 + " ";
          break label1461;
        }
        String str5 = g(((String)localObject2).trim());
        if ((str5 == null) || (str5.length() == 0))
        {
          this.f.b();
          localBundle1.putString("action_resp_code", "10019");
          localBundle2 = localBundle1;
          break;
        }
        try
        {
          JSONObject localJSONObject1 = new JSONObject();
          localJSONObject1.put("v", "1.3");
          localJSONObject1.put("cmd", "pay");
          JSONObject localJSONObject2 = new JSONObject();
          localJSONObject1.put("params", localJSONObject2);
          localJSONObject2.put("pay_type", "2");
          localJSONObject2.put("pay_mode", "1");
          localJSONObject2.put("bind", "no");
          localJSONObject2.put("carrier_tp", paramString2);
          localJSONObject2.put("icc_data", e.get("DCD"));
          localJSONObject2.put("csn", e.get("CSN"));
          if (e.get("5F34") != null);
          for (String str6 = (String)e.get("5F34"); ; str6 = "")
          {
            localJSONObject2.put("card_seq_id", str6);
            localJSONObject2.put("submit_time", d);
            localJSONObject2.put("sp_id", "8889");
            localJSONObject2.put("pin", e.get("PIN"));
            localJSONObject2.put("pan", e.get("AN1"));
            localJSONObject2.put("carrier_app_tp", "2");
            if (e.get("ED") != null)
              localJSONObject2.put("expire", e.get("ED"));
            if (e.get("TD2") != null)
              localJSONObject2.put("track2_data", e.get("TD2"));
            String str7 = localJSONObject1.toString();
            localBundle1.putString("action_resp_message", this.g.i(str7));
            this.f.b();
            localBundle2 = localBundle1;
            break;
          }
        }
        catch (JSONException localJSONException)
        {
          this.f.b();
          localBundle1.putString("action_resp_code", "10019");
          localBundle2 = localBundle1;
        }
      }
      break;
      label1457: Object localObject3 = localObject2;
      label1461: localObject2 = localObject3;
    }
  }

  public final String a()
  {
    this.a = this.b;
    return a(new byte[] { 0, -92, 4, 0, 15, -96, 0, 0, 3, 51, 67, 85, 80, 45, 77, 79, 66, 73, 76, 69 });
  }

  public final String a(int paramInt, String paramString)
  {
    this.a = this.b;
    if (Integer.toHexString(paramInt).length() == 1);
    for (String str = "0" + Integer.toHexString(paramInt); ; str = Integer.toHexString(paramInt))
      return a(i.b("80F802" + str + "08" + paramString + "80"));
  }

  public final String a(AppIdentification paramAppIdentification)
  {
    monitorenter;
    try
    {
      String str1 = paramAppIdentification.a();
      d();
      b(str1);
      String str2 = f();
      String str3 = null;
      if (str2 != null)
      {
        int i = str2.length();
        str3 = null;
        if (i != 0)
          break label50;
      }
      while (true)
      {
        return str3;
        label50: String str4 = c(str2);
        str3 = null;
        if (str4 == null)
          continue;
        int j = str4.length();
        str3 = null;
        if (j == 0)
          continue;
        str3 = (String)e.get("5A");
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final String a(String paramString)
  {
    String str = b(paramString);
    this.f.c();
    return a(str, "84");
  }

  public final Bundle b(int paramInt, String paramString)
  {
    monitorenter;
    try
    {
      Bundle localBundle1 = h();
      this.f.a();
      String str1 = a();
      Bundle localBundle2;
      if ((str1 == null) || (str1.length() == 0))
      {
        this.f.b();
        localBundle1.putString("action_resp_code", "10019");
        localBundle2 = localBundle1;
      }
      while (true)
      {
        return localBundle2;
        new StringBuilder(" ************T1=").append(d);
        e.put("PIN", paramString);
        String str2 = f((String)e.get("PIN"));
        if ((str2 == null) || (str2.length() == 0))
        {
          this.f.b();
          localBundle1.putString("action_resp_code", "10019");
          localBundle2 = localBundle1;
          continue;
        }
        new StringBuilder(" ************T2=").append(d);
        String str3 = a(paramInt, d);
        if ((str3 == null) || (str3.length() == 0))
        {
          this.f.b();
          localBundle1.putString("action_resp_code", "10019");
          localBundle2 = localBundle1;
          continue;
        }
        String str4 = g();
        if ((str4 == null) || (str4.length() == 0))
        {
          this.f.b();
          localBundle1.putString("action_resp_code", "10019");
          localBundle2 = localBundle1;
          continue;
        }
        String str5 = i.d(str3.substring(40, 60));
        String str6 = str3.substring(60, 100);
        String str7 = str3.substring(100, 208);
        String str8 = str3.substring(216, 232);
        try
        {
          JSONObject localJSONObject1 = new JSONObject();
          localJSONObject1.put("v", "1.3");
          localJSONObject1.put("cmd", "pay");
          JSONObject localJSONObject2 = new JSONObject();
          localJSONObject1.put("params", localJSONObject2);
          localJSONObject2.put("pay_type", "2");
          localJSONObject2.put("pay_mode", "1");
          localJSONObject2.put("bind", "no");
          localJSONObject2.put("carrier_tp", "1");
          localJSONObject2.put("track2_data", str6);
          localJSONObject2.put("track3_data", str7);
          localJSONObject2.put("csn", e.get("CSN"));
          localJSONObject2.put("submit_time", d);
          localJSONObject2.put("sp_id", "8889");
          localJSONObject2.put("pin", e.get("PIN"));
          localJSONObject2.put("pan", str5);
          localJSONObject2.put("dynamic_key_data", str8);
          localJSONObject2.put("carrier_app_tp", "1");
          String str10 = localJSONObject1.toString();
          str9 = str10;
          new StringBuilder(" ************T3=").append(d);
          localBundle1.putString("action_resp_message", this.g.i(str9));
          this.f.b();
          localBundle2 = localBundle1;
        }
        catch (JSONException localJSONException)
        {
          while (true)
            String str9 = "";
        }
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final ArrayList<b> b()
  {
    this.f.c();
    this.f.a();
    ArrayList localArrayList = this.f.a(this);
    this.f.b();
    return localArrayList;
  }

  public final String c()
  {
    this.a = this.b;
    return a(i.b("80F2000102"));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboctransaction.e
 * JD-Core Version:    0.6.0
 */