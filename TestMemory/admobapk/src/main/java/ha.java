import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.view.MotionEvent;

public final class ha
{
  public static final String[] d = { "/aclk", "/pcs/click" };
  public String a = "googleads.g.doubleclick.net";
  public String b = "/pagead/ads";
  public String[] c = { ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com" };
  public gv e;
  private String f = "ad.doubleclick.net";

  public ha(gv paramgv)
  {
    this.e = paramgv;
  }

  private boolean c(Uri paramUri)
  {
    if (paramUri == null)
      throw new NullPointerException();
    try
    {
      boolean bool = paramUri.getHost().equals(this.f);
      return bool;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return false;
  }

  public final Uri a(Uri paramUri, Context paramContext)
  {
    try
    {
      Uri localUri = a(paramUri, paramContext, paramUri.getQueryParameter("ai"), true);
      return localUri;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
    }
    throw new hb("Provided Uri is not in a valid state");
  }

  public final Uri a(Uri paramUri, Context paramContext, String paramString, boolean paramBoolean)
  {
    boolean bool;
    try
    {
      bool = c(paramUri);
      if (bool)
      {
        if (!paramUri.toString().contains("dc_ms="))
          break label65;
        throw new hb("Parameter already exists: dc_ms");
      }
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      throw new hb("Provided Uri is not in a valid state");
    }
    if (paramUri.getQueryParameter("ms") != null)
      throw new hb("Query parameter already exists: ms");
    label65: String str1;
    if (paramBoolean)
      str1 = this.e.a(paramContext, paramString);
    while (bool)
    {
      String str2 = paramUri.toString();
      int i = str2.indexOf(";adurl");
      if (i != -1)
      {
        return Uri.parse(str2.substring(0, i + 1) + "dc_ms" + "=" + str1 + ";" + str2.substring(i + 1));
        str1 = this.e.a(paramContext);
        continue;
      }
      String str3 = paramUri.getEncodedPath();
      int j = str2.indexOf(str3);
      return Uri.parse(str2.substring(0, j + str3.length()) + ";" + "dc_ms" + "=" + str1 + ";" + str2.substring(j + str3.length()));
    }
    String str4 = paramUri.toString();
    int k = str4.indexOf("&adurl");
    if (k == -1)
      k = str4.indexOf("?adurl");
    if (k != -1)
      return Uri.parse(str4.substring(0, k + 1) + "ms" + "=" + str1 + "&" + str4.substring(k + 1));
    Uri localUri = paramUri.buildUpon().appendQueryParameter("ms", str1).build();
    return localUri;
  }

  public final void a(MotionEvent paramMotionEvent)
  {
    this.e.a(paramMotionEvent);
  }

  public final boolean a(Uri paramUri)
  {
    if (paramUri == null)
      throw new NullPointerException();
    try
    {
      boolean bool1 = paramUri.getHost().equals(this.a);
      int i = 0;
      if (bool1)
      {
        boolean bool2 = paramUri.getPath().equals(this.b);
        i = 0;
        if (bool2)
          i = 1;
      }
      return i;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return false;
  }

  public final boolean b(Uri paramUri)
  {
    if (paramUri == null)
      throw new NullPointerException();
    try
    {
      String str = paramUri.getHost();
      String[] arrayOfString = this.c;
      int i = arrayOfString.length;
      for (int j = 0; ; j++)
      {
        int k = 0;
        if (j < i)
        {
          boolean bool = str.endsWith(arrayOfString[j]);
          if (!bool)
            continue;
          k = 1;
        }
        return k;
      }
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ha
 * JD-Core Version:    0.6.0
 */