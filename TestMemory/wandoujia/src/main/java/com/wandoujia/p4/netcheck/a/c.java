package com.wandoujia.p4.netcheck.a;

import com.wandoujia.rpc.http.delegate.ApiDelegate;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.params.HttpParams;

public final class c
  implements ApiDelegate<String, Exception>
{
  public final HttpUriRequest getHttpRequest()
  {
    HttpGet localHttpGet = new HttpGet("http://ns.pb.cachecn.net/fast_tools/fetch_ldns_diag_client.php");
    localHttpGet.getParams().setIntParameter("http.socket.timeout", 5000);
    localHttpGet.getParams().setIntParameter("http.connection.timeout", 5000);
    return localHttpGet;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.a.c
 * JD-Core Version:    0.6.0
 */