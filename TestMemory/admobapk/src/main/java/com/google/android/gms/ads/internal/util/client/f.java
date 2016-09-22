package com.google.android.gms.ads.internal.util.client;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@com.google.android.gms.ads.internal.report.client.a
public final class f
  implements d
{
  private final String a;

  public f()
  {
    this(null);
  }

  public f(String paramString)
  {
    this.a = paramString;
  }

  public final void a(String paramString)
  {
    try
    {
      String str4 = String.valueOf(paramString);
      if (str4.length() != 0)
      {
        str5 = "Pinging URL: ".concat(str4);
        e.b(str5);
        localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      try
      {
        while (true)
        {
          a.a(true, localHttpURLConnection, this.a);
          int i = localHttpURLConnection.getResponseCode();
          if ((i < 200) || (i >= 300))
            e.e(65 + String.valueOf(paramString).length() + "Received non-success response code " + i + " from pinging URL: " + paramString);
          return;
          String str5 = new String("Pinging URL: ");
        }
        localIndexOutOfBoundsException = localIndexOutOfBoundsException;
        String str3 = String.valueOf(localIndexOutOfBoundsException.getMessage());
        e.e(32 + String.valueOf(paramString).length() + String.valueOf(str3).length() + "Error while parsing ping URL: " + paramString + ". " + str3);
        return;
      }
      finally
      {
        HttpURLConnection localHttpURLConnection;
        localHttpURLConnection.disconnect();
      }
    }
    catch (IOException localIOException)
    {
      String str2 = String.valueOf(localIOException.getMessage());
      e.e(27 + String.valueOf(paramString).length() + String.valueOf(str2).length() + "Error while pinging URL: " + paramString + ". " + str2);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      String str1 = String.valueOf(localRuntimeException.getMessage());
      e.e(27 + String.valueOf(paramString).length() + String.valueOf(str1).length() + "Error while pinging URL: " + paramString + ". " + str1);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.client.f
 * JD-Core Version:    0.6.0
 */