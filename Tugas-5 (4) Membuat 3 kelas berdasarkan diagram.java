interface Robot{
        void setNama(String nama);
        void setTahun(int tahun);
        void displayData();

}


interface Doraemon{

    void sayDora();
    void displayKantongAjaib();
}


class DoraMini implements Robot,Doraemon
{
    String nama;
    string pemilik;
    int tahun;

    public string getPemilik(){
        this.pemilik =pemilik;
    }

    public void setPemilik(string pemilik){
        this.pemilik = pemilik;
    }

    @Override
    public void setNama(String nama)
    {


        System.out.println("nama "+nama);
    }


     @Override
    public void setTahun(int tahun)
    {


        System.out.println("tahun "+tahun);
    }

     @Override
    public void displayData()
    {
        // TODO: Implement this method

        System.out.println("a");
    }


    @Override

    public void sayDora()
    {
        // TODO: Implement this method

        System.out.println("Hallo, saya Dora Mini");
    }


    @Override

    public void displayKantongAjaib()
    {
        // TODO: Implement this method

        System.out.println("Saya juga seperti Doraemon yang memiliki kantung ajaib");
    }


}

public class Main implements Doraemon, Robot
{

    @Override

    public void setNama(String nama)
    {
        // TODO: Implement this method
        System.out.println("My name is "+nama);
    }

    @Override

    public void sayDora()
    {
        // TODO: Implement this method

        System.out.println("Hallo, saya Dora Mini");
    }

    @Override

    public void displayKantongAjaib()
    {
        // TODO: Implement this method

        System.out.println("Saya juga seperti Doraemon yang memiliki kantung ajaib");
    }


}
