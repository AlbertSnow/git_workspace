package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.zzw;
import java.net.URI;
import java.net.URISyntaxException;

@zzhb
public class zzjy extends WebViewClient
{
  private final String zzOl = zzaR(paramString);
  private boolean zzOm = false;
  private final zzjp zzpD;
  private final zzgo zzGs;

  public zzjy(zzgo paramzzgo, zzjp paramzzjp, String paramString)
  {
    this.zzpD = paramzzjp;
    this.zzGs = paramzzgo;
  }

  public void onLoadResource(WebView view, String url)
  {
    zzin.zzaI("JavascriptAdWebViewClient::onLoadResource: " + url);
    if (!zzaQ(url))
      this.zzpD.zzhU().onLoadResource(this.zzpD.getWebView(), url);
  }

  public void onPageFinished(WebView view, String url)
  {
    zzin.zzaI("JavascriptAdWebViewClient::onPageFinished: " + url);
    if (!this.zzOm)
    {
      this.zzGs.zzge();
      this.zzOm = true;
    }
  }

  public boolean shouldOverrideUrlLoading(WebView view, String url)
  {
    zzin.zzaI("JavascriptAdWebViewClient::shouldOverrideUrlLoading: " + url);
    if (zzaQ(url))
    {
      zzin.zzaI("shouldOverrideUrlLoading: received passback url");
      return true;
    }
    return this.zzpD.zzhU().shouldOverrideUrlLoading(this.zzpD.getWebView(), url);
  }

  protected boolean zzaQ(String paramString)
  {
    paramString = zzaR(paramString);
    if (TextUtils.isEmpty(paramString))
      return false;
    try
    {
      URI localURI1 = new URI(paramString);
      if ("passback".equals(localURI1.getScheme()))
      {
        zzin.zzaI("Passback received");
        this.zzGs.zzgf();
        return true;
      }
      if (!TextUtils.isEmpty(this.zzOl))
      {
        URI localURI2 = new URI(this.zzOl);
        String str1 = localURI2.getHost();
        String str2 = localURI1.getHost();
        String str3 = localURI2.getPath();
        String str4 = localURI1.getPath();
        if ((zzw.equal(str1, str2)) && (zzw.equal(str3, str4)))
        {
          zzin.zzaI("Passback received");
          this.zzGs.zzgf();
          return true;
        }
      }
    }
    catch (URISyntaxException localURISyntaxException)
    {
      zzin.e(localURISyntaxException.getMessage());
    }
    return false;
  }

  private String zzaR(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return paramString;
    try
    {
      if (paramString.endsWith("/"))
        return paramString.substring(0, paramString.length() - 1);
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      zzin.e(localIndexOutOfBoundsException.getMessage());
    }
    return paramString;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjy
 * JD-Core Version:    0.6.0
 */