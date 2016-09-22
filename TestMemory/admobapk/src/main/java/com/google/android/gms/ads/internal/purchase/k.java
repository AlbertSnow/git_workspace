package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import org.json.JSONException;
import org.json.JSONObject;

@a
public final class k
{
  public static int a(Intent paramIntent)
  {
    if (paramIntent == null)
      return 5;
    Object localObject = paramIntent.getExtras().get("RESPONSE_CODE");
    if (localObject == null)
    {
      c.e("Intent with no response code, assuming OK (known issue)");
      return 0;
    }
    if ((localObject instanceof Integer))
      return ((Integer)localObject).intValue();
    if ((localObject instanceof Long))
      return (int)((Long)localObject).longValue();
    String str1 = String.valueOf(localObject.getClass().getName());
    if (str1.length() != 0);
    for (String str2 = "Unexpected type for intent response code. ".concat(str1); ; str2 = new String("Unexpected type for intent response code. "))
    {
      c.e(str2);
      return 5;
    }
  }

  public static int a(Bundle paramBundle)
  {
    Object localObject = paramBundle.get("RESPONSE_CODE");
    if (localObject == null)
    {
      c.e("Bundle with null response code, assuming OK (known issue)");
      return 0;
    }
    if ((localObject instanceof Integer))
      return ((Integer)localObject).intValue();
    if ((localObject instanceof Long))
      return (int)((Long)localObject).longValue();
    String str1 = String.valueOf(localObject.getClass().getName());
    if (str1.length() != 0);
    for (String str2 = "Unexpected type for intent response code. ".concat(str1); ; str2 = new String("Unexpected type for intent response code. "))
    {
      c.e(str2);
      return 5;
    }
  }

  public static String a(String paramString)
  {
    if (paramString == null)
      return null;
    try
    {
      String str = new JSONObject(paramString).getString("developerPayload");
      return str;
    }
    catch (JSONException localJSONException)
    {
      c.e("Fail to parse purchase data");
    }
    return null;
  }

  public static String b(Intent paramIntent)
  {
    if (paramIntent == null)
      return null;
    return paramIntent.getStringExtra("INAPP_PURCHASE_DATA");
  }

  public static String b(String paramString)
  {
    if (paramString == null)
      return null;
    try
    {
      String str = new JSONObject(paramString).getString("purchaseToken");
      return str;
    }
    catch (JSONException localJSONException)
    {
      c.e("Fail to parse purchase data");
    }
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.k
 * JD-Core Version:    0.6.0
 */