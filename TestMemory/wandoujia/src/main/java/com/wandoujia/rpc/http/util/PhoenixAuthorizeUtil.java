package com.wandoujia.rpc.http.util;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.wandoujia.base.utils.CipherUtil;
import com.wandoujia.base.utils.MD5Utils;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import java.io.IOException;

public class PhoenixAuthorizeUtil
{
  private static final String PARAM_ID = "id";
  private static final String PARAM_TIMESTAMP = "timestamp";
  private static final String PARAM_TOKEN = "token";

  public static String appendAuthorizeParam(String paramString, Context paramContext)
  {
    long l = System.currentTimeMillis();
    Uri.Builder localBuilder = Uri.parse(paramString).buildUpon();
    localBuilder.appendQueryParameter("id", CipherUtil.getAndroidId(paramContext.getApplicationContext()));
    localBuilder.appendQueryParameter("token", generateToken(l, paramContext));
    localBuilder.appendQueryParameter("timestamp", String.valueOf(l));
    return localBuilder.toString();
  }

  public static void appendAuthorizeParams(AbstractHttpRequestBuilder.Params paramParams, Context paramContext)
  {
    long l = System.currentTimeMillis();
    paramParams.put("id", CipherUtil.getAndroidId(paramContext.getApplicationContext()), false);
    paramParams.put("token", generateToken(l, paramContext), false);
    paramParams.put("timestamp", String.valueOf(l), false);
  }

  public static String generateToken(long paramLong, Context paramContext)
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(CipherUtil.getAndroidId(paramContext.getApplicationContext()));
      localStringBuilder.append(CipherUtil.getAuthKey(paramContext.getApplicationContext()));
      localStringBuilder.append(paramLong);
      String str = MD5Utils.md5Digest(localStringBuilder.toString());
      return str;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      return null;
    }
    catch (IOException localIOException)
    {
      label52: break label52;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.util.PhoenixAuthorizeUtil
 * JD-Core Version:    0.6.0
 */