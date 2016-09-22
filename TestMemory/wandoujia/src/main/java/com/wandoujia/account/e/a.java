package com.wandoujia.account.e;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.d;
import android.view.LayoutInflater;
import android.view.View;
import com.alipay.android.mini.widget.YearMonthPicker;
import com.alipay.android.mini.widget.j;
import com.wandoujia.base.http.HttpClientWrapper;
import com.wandoujia.base.http.WdjSSLSocketFactory;
import org.apache.http.client.HttpClient;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

public final class a
{
  public YearMonthPicker a;
  private j b = null;
  private String c;
  private String d;

  public a(String paramString, Context paramContext)
  {
    View localView = LayoutInflater.from(paramContext).inflate(d.b("mini_express_year_month_picker", "layout"), null, false);
    this.a = ((YearMonthPicker)localView.findViewById(d.b("datePicker1", "id")));
    this.a.b();
    this.b = new j(paramContext);
    this.b.b(paramString);
    this.b.a(localView);
    this.c = "确定";
    this.d = "取消";
  }

  public static HttpClient a(int paramInt1, int paramInt2)
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpConnectionParams.setStaleCheckingEnabled(localBasicHttpParams, false);
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, paramInt2);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, paramInt1);
    HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, 8192);
    HttpClientParams.setRedirecting(localBasicHttpParams, true);
    SchemeRegistry localSchemeRegistry = new SchemeRegistry();
    localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    try
    {
      localSchemeRegistry.register(new Scheme("https", WdjSSLSocketFactory.getSSLSocketFactory(), 443));
      label82: return HttpClientWrapper.newInstance(new b(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams));
    }
    catch (Exception localException)
    {
      break label82;
    }
  }

  public final void a()
  {
    this.a.a();
  }

  public final void a(DialogInterface.OnClickListener paramOnClickListener)
  {
    this.b.a(this.c, paramOnClickListener);
  }

  public final void b()
  {
    this.b.a();
  }

  public final void b(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2);
  }

  public final void b(DialogInterface.OnClickListener paramOnClickListener)
  {
    this.b.b(this.d, paramOnClickListener);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.e.a
 * JD-Core Version:    0.6.0
 */