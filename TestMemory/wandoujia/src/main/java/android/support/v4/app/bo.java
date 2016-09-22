package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;

public final class bo
  implements Iterable<Intent>
{
  private final ArrayList<Intent> a = new ArrayList();
  private final Context b;

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      new br();
      return;
    }
    new bq();
  }

  private bo(Context paramContext)
  {
    this.b = paramContext;
  }

  private bo a(ComponentName paramComponentName)
  {
    int i = this.a.size();
    try
    {
      Intent localIntent;
      for (Object localObject = ao.a(this.b, paramComponentName); localObject != null; localObject = localIntent)
      {
        this.a.add(i, localObject);
        localIntent = ao.a(this.b, ((Intent)localObject).getComponent());
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new IllegalArgumentException(localNameNotFoundException);
    }
    return (bo)this;
  }

  public static bo a(Context paramContext)
  {
    return new bo(paramContext);
  }

  public final bo a(Activity paramActivity)
  {
    boolean bool = paramActivity instanceof bp;
    Intent localIntent1 = null;
    if (bool)
      localIntent1 = ((bp)paramActivity).a();
    if (localIntent1 == null);
    for (Intent localIntent2 = ao.a(paramActivity); ; localIntent2 = localIntent1)
    {
      if (localIntent2 != null)
      {
        ComponentName localComponentName = localIntent2.getComponent();
        if (localComponentName == null)
          localComponentName = localIntent2.resolveActivity(this.b.getPackageManager());
        a(localComponentName);
        this.a.add(localIntent2);
      }
      return this;
    }
  }

  public final void a()
  {
    int i = 1;
    if (this.a.isEmpty())
      throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    Intent[] arrayOfIntent = (Intent[])this.a.toArray(new Intent[this.a.size()]);
    arrayOfIntent[0] = new Intent(arrayOfIntent[0]).addFlags(268484608);
    Context localContext = this.b;
    int j = Build.VERSION.SDK_INT;
    if (j >= 16)
      localContext.startActivities(arrayOfIntent, null);
    while (true)
    {
      if (i == 0)
      {
        Intent localIntent = new Intent(arrayOfIntent[(-1 + arrayOfIntent.length)]);
        localIntent.addFlags(268435456);
        this.b.startActivity(localIntent);
      }
      return;
      if (j >= 11)
      {
        localContext.startActivities(arrayOfIntent);
        continue;
      }
      i = 0;
    }
  }

  public final Iterator<Intent> iterator()
  {
    return this.a.iterator();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.bo
 * JD-Core Version:    0.6.0
 */