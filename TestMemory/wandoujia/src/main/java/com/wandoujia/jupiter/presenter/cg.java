package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.anim.ChangeAnimType;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadInfo.Status;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.k;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.StatefulButton;
import java.util.List;

final class cg
  implements View.OnClickListener
{
  cg(cf paramcf, StatefulButton paramStatefulButton, Model paramModel)
  {
  }

  public final void onClick(View paramView)
  {
    if (!NetworkUtil.isNetworkConnected(this.c.f()));
    do
    {
      do
      {
        return;
        if (TextUtils.equals(this.a.getText(), paramView.getContext().getString(2131624960)))
          break;
      }
      while (!TextUtils.equals(this.a.getText(), paramView.getContext().getString(2131625555)));
      com.wandoujia.online_config.c.a();
    }
    while (!ConfigStorage.a("enable_upgrade_guess", true));
    DownloadManager localDownloadManager = (DownloadManager)i.k().a("download");
    Model localModel1 = this.b;
    DownloadInfo localDownloadInfo = localDownloadManager.a(localModel1.F().package_name);
    if (!CollectionUtils.isEmpty(localModel1.F().apk));
    for (int i = ((ApkDetail)localModel1.F().apk.get(0)).version_code.intValue(); ; i = 0)
    {
      int j;
      label184: int k;
      Model localModel2;
      if ((localDownloadInfo != null) && (localDownloadInfo.c.isSucceed()) && (FileUtil.exists(localDownloadInfo.d.a.e)) && (localDownloadInfo.n >= i))
      {
        j = 1;
        if ((j != 0) || (this.c.i() == null))
          break label495;
        k = -1;
        if (this.c.i().c() == null)
          break label529;
        if (!this.c.i().N())
          break label497;
        k = b.a(this.c.j().a(), this.c.i());
        localModel2 = this.c.i();
      }
      while (true)
      {
        if ((k < 0) || (this.c.j().a() == null) || (localModel2 == null))
          break label584;
        View localView = android.support.v4.app.d.d(this.c.e());
        if (localView != null)
          localView.setTag(2131492884, ChangeAnimType.FLIP_LEFT);
        com.wandoujia.ripple_framework.model.d locald = localModel2.Q();
        locald.a(2);
        locald.a(this.c.i().F().package_name);
        Model localModel3 = this.c.i();
        Entity.Builder localBuilder = new Entity.Builder(localModel3.b());
        String str1 = JupiterApplication.e().getString(2131624895);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localModel3.n();
        String str2 = String.format(str1, arrayOfObject);
        localBuilder.template_type(TemplateTypeEnum.TemplateType.SECTION_GUESS).description(str2);
        locald.a(new Model(localBuilder.build()));
        locald.b().a(2131492900, localModel2);
        locald.b(localView.getHeight());
        this.c.j().a().a(k, localModel2);
        this.a.c(cf.a(this.c));
        cf.b(this.c);
        return;
        j = 0;
        break label184;
        label495: break;
        label497: localModel2 = this.c.i().c();
        k = b.a(this.c.j().a(), localModel2);
        continue;
        label529: boolean bool = CollectionUtils.isEmpty(this.c.i().B());
        localModel2 = null;
        if (!bool)
          continue;
        k = b.a(this.c.j().a(), this.c.i());
        localModel2 = this.c.i();
      }
      label584: break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cg
 * JD-Core Version:    0.6.0
 */