public class Month
{
   private static String[] month = {"Jan", "Feb", "March", "April", "May", "June","July", "Aug", "Sept", "Oct", "Nov", "Dec"};
   
   public static String getMonthNum(int MonthNum)
   {
      return month[MonthNum-1];
   }
}