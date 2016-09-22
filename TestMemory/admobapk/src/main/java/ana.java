import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;

public final class ana
{
  private static final Uri a;

  static
  {
    Uri localUri = Uri.parse("http://plus.google.com/");
    a = localUri;
    localUri.buildUpon().appendPath("circles").appendPath("find").build();
  }

  public static Intent a()
  {
    Intent localIntent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
    localIntent.setPackage("com.google.android.wearable.app");
    return localIntent;
  }

  public static Intent a(String paramString)
  {
    Uri localUri = Uri.fromParts("package", paramString, null);
    Intent localIntent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
    localIntent.setData(localUri);
    return localIntent;
  }

  public static Intent a(String paramString1, String paramString2)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    Uri.Builder localBuilder = Uri.parse("market://details").buildUpon().appendQueryParameter("id", paramString1);
    if (!TextUtils.isEmpty(paramString2))
      localBuilder.appendQueryParameter("pcampaignid", paramString2);
    localIntent.setData(localBuilder.build());
    localIntent.setPackage("com.android.vending");
    localIntent.addFlags(524288);
    return localIntent;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ana
 * JD-Core Version:    0.6.0
 */