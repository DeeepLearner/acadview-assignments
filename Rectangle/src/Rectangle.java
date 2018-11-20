public class Rectangle
{
	int length;
	int width;
	 void setData(int l,int w)
	{
		length=l;
		width=w;
	}
	int area()
	{
		int rectarea = length*width;
	return rectarea;
	}
}
  class RectangleArea
  {
	public static void main(String[] args)
	{
		Rectangle newrect=new  Rectangle();
		newrect.setData(4,5);
		int result=newrect.area();
	
	 System.out.println("The Area of Rectangular is : "+result);
}
  }
  
