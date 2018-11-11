public class Box
{
   private int width;
   private int height;
   private int depth;
   
   public Box(int w, int h, int d)
   {
      width = w;
      height = h;
      depth = d;
   }
   
   public int getHeight()
   {
      return height;
   }
   
   public int getWidth()
   {
      return width;
   }

   public int getDepth()
   {
      return depth;
   }

   public int CalcVolume()
   {
      return height * width * depth;
   }

}