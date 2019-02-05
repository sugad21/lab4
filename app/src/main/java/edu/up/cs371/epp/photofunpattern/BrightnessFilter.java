package edu.up.cs371.epp.photofunpattern;

import android.graphics.Color;

/**
 *  class BrightFilter changes the image manipulation behavior of its parent
 *  PhotoFilter to increase an image brightness by value of 100.
 *
 *  @author Edward C. Epp
 *  @version November 2017
 *  https://github.com/edcepp/PhotoFunPattern
 */

public class BrightnessFilter extends PhotoFilter {

    private final int ADJUSTMENT = 100;

    /*
    * tranformPixel This method overrides the transformPixel in the parent
    * class. It adds 100 to each RGB color component. The maxium value of each
    * component is limited to 255
    *
    * @param inPixel is a 32 bit pixel that contains RGB color values
    * @return a new Pixel in which each of the RGB components has been increased
    */
    public int transformPixel(int inPixel, int p0, int p1, int p2, int p3, int p5, int p6, int p7, int p8) {
/**
        int red = constrain(Color.red(inPixel) + ADJUSTMENT);
        int green = constrain(Color.green(inPixel) + ADJUSTMENT);
        int blue = constrain(Color.blue(inPixel) + ADJUSTMENT);
        int outPixel = Color.argb(Color.alpha(inPixel), red, green, blue);
 */
/**
    int p4 = (inPixel * -2);
     p0 = inPixel;
     p1 = inPixel;
     p2 = (inPixel * -1);
     p3 = inPixel;
     p5 = (inPixel * -1);
     p6 = inPixel;
     p7 = inPixel;
     p8 = (inPixel * -1);
    int P4 = ( p0 + p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8 ) / 9 ;
*/

        int red = constrain(Color.red(inPixel) + ADJUSTMENT);
        int green = constrain(Color.green(inPixel) + ADJUSTMENT);
        int blue = constrain(Color.blue(inPixel) + ADJUSTMENT);
        int outPixel = Color.argb(Color.alpha(inPixel), red, green, blue);
        return outPixel;
    }

}
