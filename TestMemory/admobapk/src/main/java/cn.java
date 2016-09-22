import android.app.RemoteInput;
import android.app.RemoteInput.Builder;

final class cn
{
  static RemoteInput[] a(cp[] paramArrayOfcp)
  {
    if (paramArrayOfcp == null)
      return null;
    RemoteInput[] arrayOfRemoteInput = new RemoteInput[paramArrayOfcp.length];
    for (int i = 0; i < paramArrayOfcp.length; i++)
    {
      cp localcp = paramArrayOfcp[i];
      arrayOfRemoteInput[i] = new RemoteInput.Builder(localcp.a()).setLabel(localcp.b()).setChoices(localcp.c()).setAllowFreeFormInput(localcp.d()).addExtras(localcp.e()).build();
    }
    return arrayOfRemoteInput;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     cn
 * JD-Core Version:    0.6.0
 */