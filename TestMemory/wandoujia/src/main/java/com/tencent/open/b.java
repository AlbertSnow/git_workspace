package com.tencent.open;

import android.content.Context;
import android.os.SystemClock;
import com.tencent.open.b.f;
import com.tencent.tauth.d;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

final class b
  implements com.tencent.tauth.b
{
  private String a;
  private String b;

  public b(Context paramContext, String paramString1, String paramString2)
  {
    new WeakReference(paramContext);
    this.a = paramString1;
    this.b = paramString2;
  }

  public final void a(d paramd)
  {
    if (paramd.b != null);
    for (String str = paramd.b + this.b; ; str = this.b)
    {
      f.a().a(this.a + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, paramd.a, str);
      return;
    }
  }

  public final void a(Object paramObject)
  {
    JSONObject localJSONObject = (JSONObject)paramObject;
    f.a().a(this.a + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, localJSONObject.optInt("ret", -6), this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.b
 * JD-Core Version:    0.6.0
 */