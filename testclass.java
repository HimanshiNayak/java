
//using constructors to get the values
public class testclass{
    private float len;
    private float width;
    private float height;
    testclass(float l,float w,float h){
len=l;
width=w;
height= h;
    }
    public float getl(){
        return len;
    }
    public float getw(){
        return width; 
      }
    public float geth(){
        return height;
    }

// public class testclass {
   public static void main(String[ ] args){
    testclass testclass1 = new testclass(5,7,9); 
System.out.printf("The height of testclass is :%.1f , width :%.1f, height:%.1f",testclass1.getl(),testclass1.getw() ,testclass1.geth());
   }
}

