package homework221005;


class Motorcycle {
    public void GoesAsMotorcycle(){
        System.out.println("GoesAsMotorcycle");
    }
}

class Chopper extends Motorcycle  {
    public void GoesAsChopper(){
        System.out.println("GoesAsChopper");
    }
}

class Enduro extends Motorcycle {
    public void GoesAsEnduro(){
        System.out.println("GoesAsEnduro");
    }
}

class  Harley extends Chopper {
    public void GoesAsHarley(){
    }
}

class Ktm extends Enduro {
    public void GoesAsKtm(){
    }
}

class Main {
    public static void main(String[] args) {
        Object obj = new Object();
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.GoesAsMotorcycle();
        Ktm ktm = (Ktm) motorcycle;
        ktm.GoesAsKtm();
        ktm.GoesAsMotorcycle();
        ktm.GoesAsEnduro();


    }


}

