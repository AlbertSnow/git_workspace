package com.wandoujia.p4.http.request;

import android.text.TextUtils;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.StringUtil;
import com.wandoujia.p4.http.request.a.b;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import java.util.List;

public final class g extends b
{
  private String a;
  private boolean b = true;

  protected final OptionFields a()
  {
    return OptionFields.DARK_KNOWLEDGE;
  }

  public final g a(List<String> paramList)
  {
    if (!CollectionUtils.isEmpty(paramList))
      this.a = StringUtil.join(paramList, ",");
    return this;
  }

  public final g b()
  {
    this.b = false;
    return this;
  }

  protected final String getUrl()
  {
    return "http://apps.wandoujia.com/api/v3/knowledges";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (!TextUtils.isEmpty(this.a))
      paramParams.put("packageNames", this.a);
    paramParams.put("onlyInstalled", String.valueOf(this.b));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.g
 * JD-Core Version:    0.6.0
 */