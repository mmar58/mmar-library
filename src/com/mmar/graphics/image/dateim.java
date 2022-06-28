package com.mmar.graphics.image;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Paint;
import com.mmar.fm;
import com.mmar.util.util;
import android.graphics.Color;
import java.util.Date;
public class dateim
{Canvas can;
Bitmap b;
int daycolor,monthcolor,yearcolor,backColor;
	public dateim(){
		b=Bitmap.createBitmap(295,130,Bitmap.Config.ARGB_8888);
		can=new Canvas(b);
		daycolor=Color.WHITE;
		monthcolor=Color.WHITE;
		yearcolor=Color.WHITE;
		backColor=Color.argb(205,58,140,146);
	}
	public Bitmap getbitmapaStyle1(){
		can.drawColor(backColor);
		Date d=new Date();
		Paint p=new Paint();
		util.setPaintStyleBold(p);
		p.setTextSize(40);
		p.setColor(daycolor);
		can.drawText(fm.day[d.getDay()],90,45,p);
		int year=d.getYear()+1900;
		can.drawText(d.getDate()+" "+fm.month[d.getMonth()]+" , "+year,20,100,p);
		return b;
	}
}
