package com.google.myanimation.view;

import android.graphics.Path;

/**
 * Created by Administrator on 2016/7/7.
 */
public class StarShape {
    private StarVertex mVertex1;
    private StarVertex mVertex2;
    private StarVertex mVertex3;
    private StarVertex mVertex4;
    private StarVertex mVertex5;
    private Path path1;
    private Path path2;
    private Path path3;
    private Path mBounderPath;

    private int mRadius;

    public StarShape(int radius){
        if (radius < 0){
            throw new IllegalArgumentException("The star radius can't be smaller than 0");
        }
        mRadius = radius;
        init();
        initData();
    }

    private void init(){
        mVertex1 = new StarVertex();
        mVertex2 = new StarVertex();
        mVertex3 = new StarVertex();
        mVertex4 = new StarVertex();
        mVertex5 = new StarVertex();

        path1 = new  Path();
        path2 = new  Path();
        path3 = new  Path();
        mBounderPath = new Path();
    }

    private void initData(){
        mVertex1.setXY(0, -mRadius);
        mVertex2.setXY(-mRadius * Math.sin(0.4 * Math.PI), -mRadius * Math.cos(0.4 * Math.PI));
        mVertex3.setXY(-mRadius * Math.sin(Math.PI/5), mRadius * Math.cos(Math.PI/5));
        mVertex4.setXY(mRadius * Math.sin(Math.PI/5), mRadius * Math.cos(Math.PI/5));
        mVertex5.setXY(mRadius * Math.sin(0.4 * Math.PI), -mRadius * Math.cos(0.4 * Math.PI));

        path1.reset();
        path1.moveTo(mVertex1.x, mVertex1.y);
        path1.lineTo(mVertex3.x, mVertex3.y);
        path1.lineTo(mVertex5.x, mVertex5.y);
        path1.lineTo(0, 0);

        path2.reset();
        path2.moveTo(mVertex2.x, mVertex2.y);
        path2.lineTo(mVertex4.x, mVertex4.y);
        path2.lineTo(mVertex1.x, mVertex1.y);
        path2.lineTo(0, 0);

        path3.reset();
        path3.moveTo(mVertex2.x, mVertex2.y);
        path3.lineTo(mVertex5.x, mVertex5.y);
        path3.lineTo(0, 0);

        mBounderPath.reset();
        mBounderPath.op(path1, Path.Op.UNION);
        mBounderPath.op(path2, Path.Op.UNION);
        mBounderPath.op(path3, Path.Op.UNION);
//        mBounderPath.reset();
//        mBounderPath.moveTo(mvertex);
    }

    public void setRadius(int radius){
        if (radius >= 0 && mRadius != radius){
            mRadius = radius;
            initData();
        }
    }

    public Path getStarPath(){
        return mBounderPath;
    }

    public int getRadius() {
        return mRadius;
    }

    /**
     * @param index 0-4,0是Y轴上的点，然后逆时针增序
     */
    public StarVertex getVertex(int index){
        StarVertex vertex;
        switch (index){
            case 0:
                vertex = mVertex1;
                break;
            case 1:
                vertex = mVertex2;
                break;
            case 2:
                vertex = mVertex3;
                break;
            case 3:
                vertex = mVertex4;
                break;
            case 4:
                vertex = mVertex5;
                break;
            default:
                throw new IllegalArgumentException("index>=0 || index <=4, the real params index "+index);
        }
        return vertex;
    }
}
