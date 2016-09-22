package com.wandoujia.p4.app.controller;

import android.os.Handler;
import android.text.TextUtils;
import com.wandoujia.entities.app.comment.PostResponse;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.http.b.ad;
import com.wandoujia.p4.http.b.af;
import com.wandoujia.p4.http.request.i;
import com.wandoujia.p4.http.request.j;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;

final class f
  implements Runnable
{
  f(AppCommenter paramAppCommenter)
  {
  }

  public final void run()
  {
    if (AppCommenter.b(this.a) != null);
    try
    {
      af localaf = new af();
      ((j)localaf.getRequestBuilder()).a(AppCommenter.d(this.a)).c("phone").b(AppCommenter.b(this.a).name()).a(AppCommenter.c(this.a)).setAttachDefaultCookie(true);
      com.wandoujia.p4.a.b().execute(localaf);
      try
      {
        label79: ad localad = new ad();
        ((i)localad.getRequestBuilder()).d("phone").b(AppCommenter.d(this.a)).c(AppCommenter.f(this.a)).a((int)AppCommenter.c(this.a)).a(AppCommenter.e(this.a)).setAttachDefaultCookie(true);
        localPostResponse = (PostResponse)com.wandoujia.p4.a.b().execute(localad);
        if (localPostResponse != null)
        {
          if (localPostResponse.getErrorCode() == -2)
          {
            AppCommenter.g(this.a);
            return;
          }
          if (localPostResponse.getErrorCode() != 0)
            break label320;
          AppCommenter.a(this.a, localPostResponse.getComment());
          if (AppCommenter.h(this.a) == null)
            return;
          h localh2 = (h)AppCommenter.h(this.a).get();
          if (localh2 == null)
            return;
          localh2.a();
          return;
        }
      }
      catch (Exception localException)
      {
        PostResponse localPostResponse;
        Object localObject = null;
        AppCommenter localAppCommenter = this.a;
        if (TextUtils.isEmpty((CharSequence)localObject))
        {
          int j = p.b;
          com.wandoujia.p4.a.d().post(new d(localAppCommenter, j));
        }
        while (true)
        {
          h localh1 = (h)AppCommenter.h(this.a).get();
          if (localh1 == null)
            return;
          localh1.a(AppCommenter.e(this.a), AppCommenter.b(this.a));
          return;
          label320: String str = localPostResponse.getErrorMsg();
          localObject = str;
          break;
          int i = p.b;
          com.wandoujia.p4.a.d().post(new e(localAppCommenter, (String)localObject, i));
        }
      }
    }
    catch (ExecutionException localExecutionException)
    {
      break label79;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.controller.f
 * JD-Core Version:    0.6.0
 */