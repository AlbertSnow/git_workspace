package com.wandoujia.morph.engine;

public enum MoStyleable
{
  static
  {
    TextView = new MoStyleable("TextView", 2);
    TextView_style = new MoStyleable("TextView_style", 3);
    Button = new MoStyleable("Button", 4);
    ImageView = new MoStyleable("ImageView", 5);
    ViewGroup = new MoStyleable("ViewGroup", 6);
    ViewGroup_Layout = new MoStyleable("ViewGroup_Layout", 7);
    ViewGroup_MarginLayout = new MoStyleable("ViewGroup_MarginLayout", 8);
    FrameLayout = new MoStyleable("FrameLayout", 9);
    FrameLayout_Layout = new MoStyleable("FrameLayout_Layout", 10);
    RelativeLayout = new MoStyleable("RelativeLayout", 11);
    RelativeLayout_Layout = new MoStyleable("RelativeLayout_Layout", 12);
    LinearLayout = new MoStyleable("LinearLayout", 13);
    LinearLayout_Layout = new MoStyleable("LinearLayout_Layout", 14);
    ScrollView = new MoStyleable("ScrollView", 15);
    AbsListView = new MoStyleable("AbsListView", 16);
    GridView = new MoStyleable("GridView", 17);
    ListView = new MoStyleable("ListView", 18);
    MoStyleable[] arrayOfMoStyleable = new MoStyleable[19];
    arrayOfMoStyleable[0] = MorphCommonView;
    arrayOfMoStyleable[1] = View;
    arrayOfMoStyleable[2] = TextView;
    arrayOfMoStyleable[3] = TextView_style;
    arrayOfMoStyleable[4] = Button;
    arrayOfMoStyleable[5] = ImageView;
    arrayOfMoStyleable[6] = ViewGroup;
    arrayOfMoStyleable[7] = ViewGroup_Layout;
    arrayOfMoStyleable[8] = ViewGroup_MarginLayout;
    arrayOfMoStyleable[9] = FrameLayout;
    arrayOfMoStyleable[10] = FrameLayout_Layout;
    arrayOfMoStyleable[11] = RelativeLayout;
    arrayOfMoStyleable[12] = RelativeLayout_Layout;
    arrayOfMoStyleable[13] = LinearLayout;
    arrayOfMoStyleable[14] = LinearLayout_Layout;
    arrayOfMoStyleable[15] = ScrollView;
    arrayOfMoStyleable[16] = AbsListView;
    arrayOfMoStyleable[17] = GridView;
    arrayOfMoStyleable[18] = ListView;
    $VALUES = arrayOfMoStyleable;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.engine.MoStyleable
 * JD-Core Version:    0.6.0
 */