package com.wandoujia.gamepacket;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import com.wandoujia.api.proto.ExtensionPack;
import java.util.List;

public final class s
{
  private Context a;
  private Dialog b;
  private v c;
  private w d;

  public s(Context paramContext, List<ExtensionPack> paramList, v paramv)
  {
    this.a = paramContext;
    this.c = paramv;
    this.d = new w(this, paramList);
  }

  public final Dialog a()
  {
    View localView = LayoutInflater.from(this.a).inflate(R.layout.game_packet_gpu_select_view, null);
    ((ListView)localView.findViewById(R.id.extension_listview)).setAdapter(this.d);
    b localb = new b(this.a);
    localb.a(this.a.getString(R.string.download_gamepacket_title));
    localb.a(localView);
    localb.a(this.a.getString(R.string.confirm), new t(this));
    localb.b(this.a.getString(R.string.cancel), new u());
    this.b = localb.a();
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.s
 * JD-Core Version:    0.6.0
 */