package com.example.shapes;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;

public class Triangle extends Figure {
    public Point a;
    public Point b;
    public Point c;

    Triangle(String color, Point a, Point b, Point c){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void draw(Canvas canvas, Paint paint){
        if (a != null) {
            paint.setColor(Color.parseColor(this.color));

            Path path = new Path();
            path.moveTo(a.x, a.y);
            path.lineTo(b.x, b.y);
            path.lineTo(c.x, c.y);
            path.lineTo(a.x, a.y);

            canvas.drawPath(path, paint);
        }
    }
}