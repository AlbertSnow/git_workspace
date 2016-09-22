package com.alipay.android.app.util;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.d;
import android.util.DisplayMetrics;
import java.util.HashMap;

public final class a
{
  private static final HashMap a = new HashMap();
  private static final HashMap b = new HashMap();
  private static final HashMap c = new HashMap();
  private static final HashMap d = new HashMap();

  static
  {
    a.put("left", Integer.valueOf(19));
    a.put("center", Integer.valueOf(17));
    a.put("right", Integer.valueOf(21));
    a.put("top", Integer.valueOf(49));
    a.put("middle", Integer.valueOf(17));
    a.put("bottom", Integer.valueOf(81));
    b.put("small", Float.valueOf(14.0F));
    b.put("medium", Float.valueOf(16.0F));
    b.put("large", Float.valueOf(19.0F));
    b.put("huge", Float.valueOf(19.0F));
    c.put("italic", Integer.valueOf(2));
    c.put("bold", Integer.valueOf(1));
    c.put("normal", Integer.valueOf(0));
    c.put("bold_italic", Integer.valueOf(3));
    d.put("success", Integer.valueOf(d.e("msp_success")));
    d.put("error", Integer.valueOf(d.e("msp_error")));
    d.put("block", Integer.valueOf(d.e("msp_block")));
    d.put("info", Integer.valueOf(d.e("msp_info")));
    d.put("question", Integer.valueOf(d.e("msp_question")));
    d.put("warning", Integer.valueOf(d.e("msp_warning")));
    d.put("waiting", Integer.valueOf(d.e("msp_waiting")));
    d.put("newicon", Integer.valueOf(d.e("msp_newicon")));
    d.put("success_small", Integer.valueOf(d.e("msp_success_small")));
    d.put("error_small", Integer.valueOf(d.e("msp_error_small")));
    d.put("block_small", Integer.valueOf(d.e("msp_block_small")));
    d.put("info_small", Integer.valueOf(d.e("msp_info_small")));
    d.put("question_small", Integer.valueOf(d.e("msp_question_small")));
    d.put("warning_small", Integer.valueOf(d.e("msp_warning_small")));
    d.put("waiting_small", Integer.valueOf(d.e("msp_waiting_small")));
    d.put("newicon_small", Integer.valueOf(d.e("msp_newicon_small")));
    d.put("shield", Integer.valueOf(d.e("msp_shield")));
    d.put("card", Integer.valueOf(d.e("msp_nopass")));
    d.put("bg_checkbox", Integer.valueOf(d.e("msp_ui_bg_checkbox")));
    d.put("bg_button_arrow", Integer.valueOf(d.e("msp_ui_button_submit")));
    d.put("bg_button_confirm", Integer.valueOf(d.e("msp_ui_button_confirm")));
    d.put("bg_panel", Integer.valueOf(d.e("msp_bg_panel")));
    d.put("_panel_blank", Integer.valueOf(d.e("msp_bg_panel")));
    d.put("discount", Integer.valueOf(d.e("msp_discount")));
    d.put("bg_button_confirm_small", Integer.valueOf(d.e("msp_bg_button_confirm_small")));
    d.put("robot", Integer.valueOf(d.e("")));
    d.put("bg_button_secondary", Integer.valueOf(d.e("msp_ui_sec_button")));
    d.put("idlesse", Integer.valueOf(d.e("msp_idlesse_group")));
    d.put("bung", Integer.valueOf(d.e("msp_block_group")));
    d.put("busy", Integer.valueOf(d.e("msp_busy_group")));
    d.put("refresh", Integer.valueOf(d.e("msp_refresh")));
  }

  public static int a(Context paramContext, float paramFloat)
  {
    if (paramContext != null);
    for (Resources localResources = paramContext.getResources(); ; localResources = Resources.getSystem())
      return (int)(paramFloat * localResources.getDisplayMetrics().density);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.util.a
 * JD-Core Version:    0.6.0
 */