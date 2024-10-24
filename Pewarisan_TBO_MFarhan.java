package pewarisan_tbo_mfarhan;

public class Pewarisan_TBO_MFarhan {
  public static void main(String[] args) {
    Transportasi.rodadua("Motor");
    Transportasi.rodaempat("Mobil");
    Transportasi.rel("Kereta Api");

    Transportasi transportasi = new Transportasi();
    Transportasi.air("perahu");

    Penumpang penumpang = new Penumpang("Jaki", "garut", "kereta api", 18);

    System.out.println(penumpang.nama);
    System.out.println(penumpang.tujuan);
    System.out.println(penumpang.jenisTransportasi);
    System.out.println(penumpang.umur);
  }
}