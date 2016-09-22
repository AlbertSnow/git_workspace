package com.google.android.gms.ads.internal.mraid;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.provider.CalendarContract.Events;
import com.google.android.gms.ads.internal.util.y;

public final class b
  implements DialogInterface.OnClickListener
{
  public b(a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    a locala = this.a;
    Intent localIntent = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
    localIntent.putExtra("title", locala.b);
    localIntent.putExtra("eventLocation", locala.f);
    localIntent.putExtra("description", locala.e);
    if (locala.c > -1L)
      localIntent.putExtra("beginTime", locala.c);
    if (locala.d > -1L)
      localIntent.putExtra("endTime", locala.d);
    localIntent.setFlags(268435456);
    y.a(this.a.a, localIntent);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mraid.b
 * JD-Core Version:    0.6.0
 */