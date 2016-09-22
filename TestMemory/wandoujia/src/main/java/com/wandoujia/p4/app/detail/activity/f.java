package com.wandoujia.p4.app.detail.activity;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.wandoujia.entities.app.IAppLiteInfo.AppType;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.utils.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

final class f
  implements View.OnClickListener
{
  f(ReportActivity paramReportActivity)
  {
  }

  public final void onClick(View paramView)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ReportActivity.a(this.a).iterator();
    while (localIterator.hasNext())
    {
      g localg = (g)localIterator.next();
      if (!localg.c())
        continue;
      localArrayList.add(String.valueOf(localg.a()));
    }
    if ((localArrayList.isEmpty()) && (TextUtils.isEmpty(ReportActivity.b(this.a).getText())))
    {
      p.a(this.a, this.a.getString(2131624264), p.b).a();
      return;
    }
    if (!TextUtils.isEmpty(ReportActivity.b(this.a).getText()))
      localArrayList.add(ReportActivity.b(this.a).getText().toString());
    ReportActivity.SubmitForm localSubmitForm = new ReportActivity.SubmitForm(null);
    localSubmitForm.account = "wandoujia";
    localSubmitForm.packagename = ReportActivity.c(this.a).title;
    localSubmitForm.filemd5 = ReportActivity.c(this.a).md5;
    localSubmitForm.vcode = String.valueOf(ReportActivity.c(this.a).vc);
    localSubmitForm.clientip = "192.168.0.1";
    if (IAppLiteInfo.AppType.APP.toString().equals(ReportActivity.c(this.a).appType));
    for (int i = 6; ; i = 8)
    {
      localSubmitForm.appchannel = String.valueOf(i);
      localSubmitForm.descr = TextUtils.join(",", localArrayList);
      localSubmitForm.reporttime = a.a(new Date(), "yyyy-MM-dd HH:mm:ss");
      new j(this.a, 0).execute(new ReportActivity.SubmitForm[] { localSubmitForm });
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.activity.f
 * JD-Core Version:    0.6.0
 */