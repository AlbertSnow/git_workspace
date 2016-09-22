import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;

public final class aml
{
  public static String a(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    default:
      Log.e("GoogleApiAvailability", 33 + "Unexpected error code " + paramInt);
    case 4:
    case 6:
      return null;
    case 1:
      return localResources.getString(mb.common_google_play_services_install_title);
    case 3:
      return localResources.getString(mb.common_google_play_services_enable_title);
    case 18:
      return localResources.getString(mb.common_google_play_services_updating_title);
    case 2:
    case 42:
      return localResources.getString(mb.common_google_play_services_update_title);
    case 9:
      Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
      return localResources.getString(mb.common_google_play_services_unsupported_title);
    case 7:
      Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
      return localResources.getString(mb.common_google_play_services_network_error_title);
    case 8:
      Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
      return null;
    case 10:
      Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
      return null;
    case 5:
      Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
      return localResources.getString(mb.common_google_play_services_invalid_account_title);
    case 11:
      Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
      return null;
    case 16:
      Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
      return null;
    case 17:
      Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
      return localResources.getString(mb.common_google_play_services_sign_in_failed_title);
    case 20:
    }
    Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
    return localResources.getString(mb.common_google_play_services_restricted_profile_title);
  }

  public static String a(Context paramContext, int paramInt, String paramString)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    default:
      return localResources.getString(mb.common_google_play_services_unknown_issue, new Object[] { paramString });
    case 1:
      boolean bool1;
      if (localResources == null)
      {
        bool1 = false;
        if (bool1)
          return localResources.getString(mb.common_google_play_services_install_text_tablet, new Object[] { paramString });
      }
      else
      {
        int i;
        boolean bool3;
        if (aoo.a == null)
        {
          if ((0xF & localResources.getConfiguration().screenLayout) <= 3)
            break label269;
          i = 1;
          if ((!aoq.a(11)) || (i == 0))
          {
            if (aoo.b == null)
            {
              Configuration localConfiguration = localResources.getConfiguration();
              if ((!aoq.a(13)) || ((0xF & localConfiguration.screenLayout) > 3) || (localConfiguration.smallestScreenWidthDp < 600))
                break label275;
              bool3 = true;
              aoo.b = Boolean.valueOf(bool3);
            }
            if (!aoo.b.booleanValue())
              break label281;
          }
        }
        for (boolean bool2 = true; ; bool2 = false)
        {
          aoo.a = Boolean.valueOf(bool2);
          bool1 = aoo.a.booleanValue();
          break;
          i = 0;
          break label171;
          bool3 = false;
          break label230;
        }
      }
      return localResources.getString(mb.common_google_play_services_install_text_phone, new Object[] { paramString });
    case 3:
      return localResources.getString(mb.common_google_play_services_enable_text, new Object[] { paramString });
    case 18:
      return localResources.getString(mb.common_google_play_services_updating_text, new Object[] { paramString });
    case 2:
      return localResources.getString(mb.common_google_play_services_update_text, new Object[] { paramString });
    case 42:
      return localResources.getString(mb.common_google_play_services_wear_update_text);
    case 9:
      return localResources.getString(mb.common_google_play_services_unsupported_text, new Object[] { paramString });
    case 7:
      return localResources.getString(mb.common_google_play_services_network_error_text);
    case 5:
      return localResources.getString(mb.common_google_play_services_invalid_account_text);
    case 16:
      label269: label275: label281: return localResources.getString(mb.common_google_play_services_api_unavailable_text, new Object[] { paramString });
    case 17:
      label171: label230: return localResources.getString(mb.common_google_play_services_sign_in_failed_text);
    case 20:
    }
    return localResources.getString(mb.common_google_play_services_restricted_profile_text);
  }

  public static String b(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    default:
      return localResources.getString(17039370);
    case 1:
      return localResources.getString(mb.common_google_play_services_install_button);
    case 3:
      return localResources.getString(mb.common_google_play_services_enable_button);
    case 2:
    }
    return localResources.getString(mb.common_google_play_services_update_button);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aml
 * JD-Core Version:    0.6.0
 */