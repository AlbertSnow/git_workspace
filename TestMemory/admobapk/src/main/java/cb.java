import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.RemoteInput;

final class cb
{
  public static void a(Notification.Builder paramBuilder, cg paramcg)
  {
    Notification.Action.Builder localBuilder = new Notification.Action.Builder(paramcg.a(), paramcg.b(), paramcg.c());
    if (paramcg.e() != null)
    {
      RemoteInput[] arrayOfRemoteInput = cn.a(paramcg.e());
      int i = arrayOfRemoteInput.length;
      for (int j = 0; j < i; j++)
        localBuilder.addRemoteInput(arrayOfRemoteInput[j]);
    }
    if (paramcg.d() != null)
      localBuilder.addExtras(paramcg.d());
    paramBuilder.addAction(localBuilder.build());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     cb
 * JD-Core Version:    0.6.0
 */