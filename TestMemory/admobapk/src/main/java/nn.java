import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public final class nn
{
  private static final Lock a = new ReentrantLock();
  private static nn b;
  private final Lock c = new ReentrantLock();
  private final SharedPreferences d;

  private nn(Context paramContext)
  {
    this.d = paramContext.getSharedPreferences("com.google.android.gms.signin", 0);
  }

  public static nn a(Context paramContext)
  {
    anw.a(paramContext);
    a.lock();
    try
    {
      if (b == null)
        b = new nn(paramContext.getApplicationContext());
      nn localnn = b;
      return localnn;
    }
    finally
    {
      a.unlock();
    }
    throw localObject;
  }

  public final GoogleSignInAccount a(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    String str2;
    do
    {
      return null;
      String str1 = String.valueOf(":");
      str2 = b(0 + String.valueOf("googleSignInAccount").length() + String.valueOf(str1).length() + String.valueOf(paramString).length() + "googleSignInAccount" + str1 + paramString);
    }
    while (str2 == null);
    try
    {
      GoogleSignInAccount localGoogleSignInAccount = GoogleSignInAccount.a(str2);
      return localGoogleSignInAccount;
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  public final String b(String paramString)
  {
    this.c.lock();
    try
    {
      String str = this.d.getString(paramString, null);
      return str;
    }
    finally
    {
      this.c.unlock();
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     nn
 * JD-Core Version:    0.6.0
 */