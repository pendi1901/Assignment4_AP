public class Clone {
    class Cloner implements Cloneable{
        int a;
        int  b;
        Cloner c = new Cloner();
        public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }
    }
}
