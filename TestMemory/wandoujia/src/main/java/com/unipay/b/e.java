package com.unipay.b;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;

public final class e
{
  public String a = "errorCode";
  public String b = "errorMessage";
  public String c = "errorNotice";
  public String d = "errorAdv";
  private String e = "errormsg";
  private String f = "error_msg.db";
  private Context g;
  private c h;
  private b i;

  public e(Context paramContext)
  {
    this.g = paramContext;
    this.i = new b(this.g);
  }

  public final void a()
  {
    SQLiteDatabase localSQLiteDatabase = this.h.getWritableDatabase();
    localSQLiteDatabase.delete(this.e, null, null);
    localSQLiteDatabase.close();
  }

  public final void a(ArrayList<a> paramArrayList)
  {
    SQLiteDatabase localSQLiteDatabase = this.h.getWritableDatabase();
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put(this.a, Integer.valueOf(((a)paramArrayList.get(j)).c()));
      localContentValues.put(this.b, ((a)paramArrayList.get(j)).d());
      localContentValues.put(this.c, ((a)paramArrayList.get(j)).b());
      localContentValues.put(this.d, ((a)paramArrayList.get(j)).a());
      localSQLiteDatabase.insert(this.e, this.b, localContentValues);
    }
    localSQLiteDatabase.close();
  }

  public final void a(boolean paramBoolean)
  {
    if (this.g.getSharedPreferences("databaseSettings", 0).getBoolean("isInited", false))
      this.h = new c(this, this.g);
    while (true)
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)this.g.getSystemService("connectivity")).getActiveNetworkInfo();
      int j;
      label70: b localb;
      if (localNetworkInfo != null)
        if (localNetworkInfo.isAvailable())
        {
          j = 1;
          if ((j != 0) && (paramBoolean))
            localb = this.i;
        }
      try
      {
        new d(localb).start();
        return;
        this.h = new c(this, this.g);
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(new a(0, "支付成功", "支付成功，稍后您将收到提示短信", "无"));
        localArrayList.add(new a(1001, "订购用户不存在", "您的通信账户无法完成支付", "使用其他支付方式"));
        localArrayList.add(new a(1002, "订购用户状态被停止", "您的通信账户无法完成支付", "使用其他支付方式"));
        localArrayList.add(new a(1003, "订购用户欠费，预付费用户计费失败", "您的通信账户余额可能不足", "查看手机帐号余额是否足够，进行充值;:;使用其他方式进行支付"));
        localArrayList.add(new a(1004, "订购用户在黑名单", "您的通信账户无法完成支付", "使用其他支付方式"));
        localArrayList.add(new a(1005, "无效用户，用户不再当前平台终", "您的通信账户无法完成支付", "使用其他支付方式"));
        localArrayList.add(new a(1006, "此业务能力已被屏蔽", "您的通信账户无法完成支付", "使用其他支付方式"));
        localArrayList.add(new a(1007, "用户无法屏蔽/恢复业务能力", "您的通信账户无法完成支付", "使用其他支付方式"));
        localArrayList.add(new a(1099, "其他错误", "暂时无法完成支付", "重新进行支付"));
        localArrayList.add(new a(10001, "用户不存在", "暂时无法完成支付", "重新进行支付"));
        localArrayList.add(new a(10002, "开发者不支持VAC", "暂时无法完成支付", "重新进行支付"));
        localArrayList.add(new a(10003, "业务不存在", "暂时无法完成支付", "重新进行支付"));
        localArrayList.add(new a(10004, "业务状态不正常", "暂时无法完成支付", "重新进行支付"));
        localArrayList.add(new a(10005, "渠道代码错误", "您使用的游戏有更新，需要重新安装才能完成支付", "从联通沃商店重新下载游戏包进行支付"));
        localArrayList.add(new a(10007, "超时当月限额", "您的通信账户支付超过当月限额", "使用其他支付方式"));
        localArrayList.add(new a(10008, "超过当日限额", "您的通信账户支付超过当日限额", "使用其他支付方式，或者明天再进行支付。"));
        localArrayList.add(new a(10009, "任务不存在(内部异常)", "支付服务暂时不可用", "使用其他支付方式，或稍后再试"));
        localArrayList.add(new a(10010, "数据库操作失败(内部异常)", "支付服务暂时不可用", "使用其他支付方式，或稍后再试"));
        localArrayList.add(new a(10011, "业务不属于该CP", "您使用的游戏有更新，需要重新安装才能完成支付", "从联通沃商店重新下载游戏包进行支付"));
        localArrayList.add(new a(10012, "重复激活", "支付成功", ""));
        localArrayList.add(new a(1104, "用户不存在", "您的通信账户暂时无法完成支付", "使用其他支付方式，或者重新支付"));
        localArrayList.add(new a(1105, "用户状态不正常", "您的通信账户暂时无法完成支付", "使用其他支付方式，或者重新支付"));
        localArrayList.add(new a(3100, "用户不是一个预付费用户", "您的通信账户暂时无法完成支付", "使用其他支付方式，或者重新支付"));
        localArrayList.add(new a(3101, "用户余额不足", "您的通信账户暂时无法完成支付", "查看手机账号余额是否足够，进行充值;:;使用其他方式进行支付"));
        localArrayList.add(new a(3102, "压缩余额失败", "您的通信账户暂时无法完成支付", "查看手机账号余额是否足够，进行充值;:;使用其他方式进行支付"));
        localArrayList.add(new a(3103, "没有需要的计费信息", "暂时无法完成支付", "重新进行支付"));
        localArrayList.add(new a(3104, "写CDR失败", "暂时无法完成支付", "重新进行支付"));
        localArrayList.add(new a(3108, "等候SCP响应失败", "暂时无法完成支付", "重新进行支付"));
        a();
        a(localArrayList);
        SharedPreferences.Editor localEditor = this.g.getSharedPreferences("databaseSettings", 0).edit();
        localEditor.putBoolean("isInited", true);
        localEditor.commit();
        continue;
        j = 0;
        break label70;
        j = 0;
      }
      catch (Exception localException)
      {
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.b.e
 * JD-Core Version:    0.6.0
 */