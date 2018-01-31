package com.cisdi.base.util;


/**
 * 主要工具
 * 
 * @author xiangjz
 * 
 */
public class CaptureUtil {/*
	//利用这三个类分别获取摄像头驱动，和获取摄像头内的图像流，获取到的图像流是一个swing的component组件类

	public static player player = null;
	private capturedeviceinfo di = null;
	private medialocator ml = null;

	//文档中提供的驱动写法，为何这么写我也不知：）

	string str1 = "vfw:logitech usb video camera:0";
	string str2 = "vfw:microsoft wdm image capture (win32):0";
	di = capturedevicemanager.getdevice(str2);
	ml = di.getlocator();
	try
	{
	　player = manager.createrealizedplayer(ml);
	　player.start();
	　component comp;
	　if ((comp = player.getvisualcomponent()) != null)
	　{
	　　add(comp, borderlayout.north);
	　}
	}
	catch (exception e)
	{
	　e.printstacktrace();
	}

	　　接下来就是点击拍照，获取摄像头内的当前图像。

	　　代码也是很简单：

	private jbutton capture;
	private buffer buf = null;
	private buffertoimage btoi = null;
	private imagepanel imgpanel = null;
	private image img = null;
	private imagepanel imgpanel = null;

	jcomponent c = (jcomponent) e.getsource();
	if (c == capture)//如果按下的是拍照按钮
	{
	　framegrabbingcontrol fgc =(framegrabbingcontrol) 　player.getcontrol("javax.media.control.framegrabbingcontrol");
	　buf = fgc.grabframe(); // 获取当前祯并存入buffer类
	　btoi = new buffertoimage((videoformat) buf.getformat());
	　img = btoi.createimage(buf); // show the image
	　imgpanel.setimage(img);
	}

	　　保存图像的就不多说了，以下为示例代码

	bufferedimage bi = (bufferedimage) createimage(imgwidth, imgheight);
	graphics2d g2 = bi.creategraphics();
	g2.drawimage(img, null, null);
	fileoutputstream out = null;
	try
	{
	　out = new fileoutputstream(s);
	}
	catch (java.io.filenotfoundexception io)
	{
	　system.out.println("file not found");
	}

	jpegimageencoder encoder = jpegcodec.createjpegencoder(out);
	jpegencodeparam param = encoder.getdefaultjpegencodeparam(bi);
	param.setquality(1f, false);//不压缩图像
	encoder.setjpegencodeparam(param);
	try
	{
	　encoder.encode(bi);
	　out.close();
	}
	catch (java.io.ioexception io)
	{
	　system.out.println("ioexception");
	}
*/}