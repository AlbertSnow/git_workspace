package com.wandoujia.p4.netcheck.fragment;

import com.wandoujia.p4.netcheck.model.Configs;
import com.wandoujia.p4.netcheck.model.Configs.DownloadUrls;
import com.wandoujia.p4.netcheck.model.Configs.Publics;
import com.wandoujia.p4.netcheck.model.Configs.TestDomain;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NetCheckCheckingFragment$DefaultNetCheckConfig extends Configs
{
  public NetCheckCheckingFragment$DefaultNetCheckConfig()
  {
    String[] arrayOfString1 = { "2G", "3G", "wifi" };
    String[] arrayOfString2 = { "apps.wandoujia.com", "apk.wandoujia.com", "m.wdjcdn.com", "oscar.wandoujia.com", "account.wandoujia.com", "shouji.360tpcdn.com", "gdown.baidu.com", "www.baidu.com", "pay.wandoujia.com", "innerpay.wandoujia.com", "www.360.cn", "soft.sj.91.com", "img.wdjimg.com", "startpage.wandoujia.com" };
    this.testdomain = new Configs.TestDomain();
    this.testdomain.setDomains(Arrays.asList(arrayOfString2));
    this.testdomain.setNetwork(Arrays.asList(arrayOfString1));
    this.ua = "Mozilla/5.0 (Linux; Android 4.1.1; HTC One X Build/JRO03C) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19";
    this.publics = new Configs.Publics();
    this.publics.setNetwork(Arrays.asList(arrayOfString1));
    ArrayList localArrayList1 = new ArrayList();
    localArrayList1.add(Arrays.asList(new String[] { "http://www.baidu.com", "utf-8", "百度一下，你就知道" }));
    localArrayList1.add(Arrays.asList(new String[] { "http://www.qq.com", "gb2312", "腾讯首页" }));
    localArrayList1.add(Arrays.asList(new String[] { "https://account.wandoujia.com/web/login", "utf-8", "用户登录" }));
    localArrayList1.add(Arrays.asList(new String[] { "http://apps.wandoujia.com", "utf-8", "装机必备" }));
    this.publics.setUrls(localArrayList1);
    this.downloadurls = new Configs.DownloadUrls();
    this.downloadurls.setNetwork(Arrays.asList(new String[] { "wifi" }));
    ArrayList localArrayList2 = new ArrayList();
    localArrayList2.add(Arrays.asList(new String[] { "http://apps.wandoujia.com/redirect?url=http%3A%2F%2Fapk.wdjcdn.com%2F9%2F1c%2F239c36d8e7c07788cd8f27f37d8ad1c9.apk&content-type=application", "安卓手电筒" }));
    localArrayList2.add(Arrays.asList(new String[] { "http://m.wdjcdn.com/apk.wdjcdn.com/9/1c/239c36d8e7c07788cd8f27f37d8ad1c9.apk", "安卓手电筒" }));
    localArrayList2.add(Arrays.asList(new String[] { "http://gdown.baidu.com/data/wisegame/197da44d40fa7521/zhongjishoudiantong.apk", "终极手电筒" }));
    localArrayList2.add(Arrays.asList(new String[] { "http://img.wdjimg.com/mms/icon/v1/3/bd/5295ac6a9c6d51e8285690bdbe1b1bd3_256_256.png", "微信LOGO" }));
    this.downloadurls.setUrls(localArrayList2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.fragment.NetCheckCheckingFragment.DefaultNetCheckConfig
 * JD-Core Version:    0.6.0
 */