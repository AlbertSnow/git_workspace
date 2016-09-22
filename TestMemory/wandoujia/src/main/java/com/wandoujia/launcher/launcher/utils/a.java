package com.wandoujia.launcher.launcher.utils;

import java.util.ArrayList;
import java.util.List;

public final class a
{
  private static final List<String> a = new ArrayList();
  private static final List<String> b = new ArrayList();
  private static final List<String> c = new ArrayList();
  private static final List<String> d = new ArrayList();
  private static final List<String> e = new ArrayList();

  static
  {
    a.add("com.sonyericsson.home");
    a.add("com.htc.launcher");
    a.add("com.huaqin.launcherEx");
    a.add("com.ty.launcher");
    a.add("com.motorola.blur.home");
    a.add("com.yulong.android.launcher2");
    a.add("com.huawei.launcher2");
    a.add("com.lenovo.launcher");
    b.add("HS-U8");
    b.add("LNV-Lenovo_A560e");
    b.add("Lenovo A228t");
    b.add("GT-I9003");
    b.add("HTC Desire S");
    c.add("com.miui.home");
    d.add("HS-U8");
    d.add("M353");
    e.add("cn.ninegame.gameb");
    e.add("com.appcate.gameking.gamecenter");
    e.add("cn.ninegame.game2");
    e.add("cn.ninegame.game5");
    e.add("cn.ninegame.game8");
    e.add("com.gametui.activity");
    e.add("com.cooee.gamecenter");
    e.add("com.leo.fc");
    e.add("com.sz.games.hall");
    e.add("com.example.top173");
    e.add("com.androidemu.leo");
    e.add("chinagames.gamehall");
    e.add("com.k7k7.androider");
    e.add("com.pingan.gamehall");
    e.add("cn.mbga.portal");
    e.add("com.xiaoao.lobby.ndplatform");
    e.add("cn.domob.app.gamecenter");
    e.add("com.laizi.hall");
    e.add("com.xiaoao.lobby");
    e.add("com.lexun.game");
    e.add("com.qike.mobile.gamehall");
    e.add("com.idreamsky.hiledou");
    e.add("com.oplay.android");
    e.add("cn.vszone.gamebox");
    e.add("cn.kwgame.gg1");
    e.add("com.sogou.gamecenter");
    e.add("com.egame");
    e.add("com.nd.assistance");
  }

  public static boolean a(String paramString)
  {
    return b.contains(paramString);
  }

  public static boolean b(String paramString)
  {
    return a.contains(paramString);
  }

  public static boolean c(String paramString)
  {
    return e.contains(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.utils.a
 * JD-Core Version:    0.6.0
 */