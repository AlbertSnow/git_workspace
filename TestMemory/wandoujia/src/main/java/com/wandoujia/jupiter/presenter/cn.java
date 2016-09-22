package com.wandoujia.jupiter.presenter;

import android.text.TextUtils;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class cn extends c
{
  protected final void a(Model paramModel)
  {
    AsyncImageView localAsyncImageView = (AsyncImageView)h().b(2131492889).a();
    List localList = paramModel.b().cover;
    if ((!CollectionUtils.isEmpty(localList)) && (!TextUtils.isEmpty(((Image)localList.get(0)).url)))
    {
      localAsyncImageView.a(((Image)localList.get(0)).url, 2131361864);
      h().b(2131493669).f(0);
    }
    while ((CollectionUtils.isEmpty(paramModel.w())) || (TextUtils.isEmpty(((Image)paramModel.w().get(0)).url)))
    {
      h().b(2131492998).e(2131362145);
      h().b(2131492972).e(2131362127);
      return;
      h().b(2131493669).f(8);
    }
    h().b(2131492998).e(2131362146);
    h().b(2131492972).e(2131362128);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cn
 * JD-Core Version:    0.6.0
 */