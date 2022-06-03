package Model;

public class Prisma {
    public int a = 0, t = 0, h = 0;
    public void VolumePrisma(){

        double Volume = (1.0/2*a*t)*h;
        System.out.println("Volume = "+Volume+ " cm^3");
}
}
