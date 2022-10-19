public class Square implements Geometric {
   
    private int side;

    Square() {}
    Square(int side) 
    {
        this.side = side;
    }

    public void setSide(int side) 
    {
       this.side =side;
    }

    public int getArea()
    {
        
        return this.side * this.side;
    }
}


