package com.wandoujia.jupiter.presenter;

import android.text.Html;
import android.widget.TextView;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class da extends c
{
  protected final void a(Model paramModel)
  {
    ApkDetail localApkDetail = (ApkDetail)paramModel.F().apk.get(0);
    TextView localTextView = (TextView)e();
    String str = JupiterApplication.d().getString(2131625007);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = localApkDetail.version_name;
    arrayOfObject[1] = TextUtil.formatSizeInfo(localApkDetail.bytes_.intValue());
    localTextView.setText(Html.fromHtml(String.format(str, arrayOfObject)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.da
 * JD-Core Version:    0.6.0
 */