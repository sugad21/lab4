package edu.up.cs371.epp.photofunpattern;

import android.graphics.Bitmap;

/**
 *  class PhotoFilter is the abstract filter parent class. Its default behavior
 *  is the leave an image unchanged.
 *
 *  @author Edward C. Epp
 *  @version November 2017
 *  https://github.com/edcepp/PhotoFunPattern
 */
public abstract class PhotoFilter {

    /*
    * constrain This method does not permit an RGB color value to over or under
    * saturate. It maintains values between 0 and 255 inclusive.
    *
    * @param inPixel is an integer input color component value that may be out
    *                of range
    * @return a new color component in range
    */
    protected int constrain(int color) {
        if (color > 255)
            return 255;
        else if (color < 0)
            return 0;
        else
            return color;
    }

    /*
    * tranformPixel This is the default transform method. It leaves the pixel
    * unchanged. It implements a copy image function.
    *
    * @param inPixel is a 32 bit pixel that contains RGB color values
    * @return a new Pixel in which unchanged color components
    */
    protected int transformPixel (int inPixel, int p0,int p1, int p2, int p3, int p5, int p6, int p7, int p8){
        return inPixel;
    }

    /*
    * apply This method visits every pixel in the input image. It applies a
    * transform to each pixel.
    *
    * @param inBmp is the original image
    * @return a new image in which each pixel has been transformed
    */
    public Bitmap apply(Bitmap inBmp) {
        int width = inBmp.getWidth();
        int height = inBmp.getHeight();
        int p0 =0 , p1 = 0 , p2 = 0 , p3 =0 , p5 = 0 , p6 = 0, p7 = 0, p8 = 0 ;

        Bitmap newBmp = Bitmap.createBitmap(width, height, inBmp.getConfig());

        for (int w = 0; w < width; w++) {
            for (int h = 0; h < height; h++) {
                int inPixel = inBmp.getPixel(w,h);
//                if(w == 0 && h ==0) {
//                    p0 = 0;
//                }
//                else{
//                     p0 = inBmp.getPixel(w - 1, h - 1);
//                }
//                if(h == 0) {
//                    p1 = 0;
//                }
//                else{
//                     p1 = inBmp.getPixel(w, h - 1);
//                }
//                if(h == 0 && w == width-1){
//                    p2 = 0;
//                }
//                else{
//                     p2 = inBmp.getPixel(w+1, h-1);
//                }
//                if(w==0){
//                     p3 = 0;
//                }
//                else {
//                     p3 = inBmp.getPixel(w - 1, h);
//                }
//                if(w == width-1){
//                     p5 = 0;
//                }
//                else{
//                     p5 = inBmp.getPixel(w+1,h);
//                }
//                if(w==0 && h == height -1){
//                     p6 = 0;
//                }
//                else {
//                    p6 = inBmp.getPixel(w - 1, h + 1);
//                }
//                if(h ==height-1){
//                     p7=0;
//                }
//                else {
//                     p7 = inBmp.getPixel(w, h + 1);
//                }
//                if(w == width -1 && h == height -1){
//                     p8 = 0;
//                }
//                else {
//                    p8 = inBmp.getPixel(w + 1, h + 1);
//                }
                int outPixel = transformPixel(inPixel, p0,p1, p2, p3, p5,p6, p7, p8);
                newBmp.setPixel(w, h, outPixel);
            }
        }
        return newBmp;
    }
}
