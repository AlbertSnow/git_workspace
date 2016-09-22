package com.wandoujia.p4.http.b;

import com.wandoujia.p4.feedback.zendesk.ZendeskModels.AuditsBundle;
import com.wandoujia.p4.http.c.d;

final class r extends d<ZendeskModels.AuditsBundle>
{
  private ZendeskModels.AuditsBundle a(String paramString)
  {
    String str = paramString.replace("public", "public_").replace("{{satisfaction.rating_section}}", "");
    if (str.contains("\"value\":\"closed\""))
      str = str.substring(0, -2 + str.length()) + ",\"isClosed\":true}";
    return (ZendeskModels.AuditsBundle)super.process(str);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.b.r
 * JD-Core Version:    0.6.0
 */