package com.wandoujia.morph.engine;

public enum MoWidgetType
{
  static
  {
    TextView = new MoWidgetType("TextView", 2);
    Button = new MoWidgetType("Button", 3);
    ImageView = new MoWidgetType("ImageView", 4);
    ViewGroup = new MoWidgetType("ViewGroup", 5);
    FrameLayout = new MoWidgetType("FrameLayout", 6);
    RelativeLayout = new MoWidgetType("RelativeLayout", 7);
    LinearLayout = new MoWidgetType("LinearLayout", 8);
    ScrollView = new MoWidgetType("ScrollView", 9);
    AbsListView = new MoWidgetType("AbsListView", 10);
    GridView = new MoWidgetType("GridView", 11);
    ListView = new MoWidgetType("ListView", 12);
    MoWidgetType[] arrayOfMoWidgetType = new MoWidgetType[13];
    arrayOfMoWidgetType[0] = MorphCommonView;
    arrayOfMoWidgetType[1] = View;
    arrayOfMoWidgetType[2] = TextView;
    arrayOfMoWidgetType[3] = Button;
    arrayOfMoWidgetType[4] = ImageView;
    arrayOfMoWidgetType[5] = ViewGroup;
    arrayOfMoWidgetType[6] = FrameLayout;
    arrayOfMoWidgetType[7] = RelativeLayout;
    arrayOfMoWidgetType[8] = LinearLayout;
    arrayOfMoWidgetType[9] = ScrollView;
    arrayOfMoWidgetType[10] = AbsListView;
    arrayOfMoWidgetType[11] = GridView;
    arrayOfMoWidgetType[12] = ListView;
    $VALUES = arrayOfMoWidgetType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.engine.MoWidgetType
 * JD-Core Version:    0.6.0
 */