package org.javaturk.oopj.for__;


import java.util.List;

public class ForDongusu {
     static class Ogrenci {
        Ogrenci(int sira,
        String ad,
        String  soyad,
                String sinif){
            this.sira= sira;
            this.ad=ad;
            this.soyad=soyad;
            this.sinif=sinif;
        }
        int sira;
        String ad;
        String  soyad;
        String sinif;
    }

    public static void main(String[] args) {
        /*
        -------------------------------------------
        | Sıra    | Ad          | Soyad   | Sınıf |
        -------------------------------------------
        | 1       | Abdulgaffar | Rambo   |  11-A |
        -------------------------------------------
        | 12      | Yusuf       | Ertekın |  10-C |
        -------------------------------------------
        | 3       | Bunyamın    | Ertekın |  8-Y  |
        -------------------------------------------
         */
        var ogrenciler = List.of(
                new Ogrenci(1, "Abdulgaffar56556556", "Rambo", "11-A"),
                new Ogrenci(12, "Yusuf", "Ertekin", "10-C"),
                new Ogrenci(3, "Bunyamin", "Ertekin", "8-Y")
        );
        for (var ogrenci:ogrenciler){
            System.out.println(ogrenci.sira + " "+ogrenci.ad+ " "+ogrenci.soyad+ " "+ogrenci.sinif);
        }
        System.out.println("\n#################\n");
        for (int i = 0; i < ogrenciler.size(); i++) {
            var ogrenci=ogrenciler.get(i);
            System.out.println(ogrenci.sira + " "+ogrenci.ad+ " "+ogrenci.soyad+ " "+ogrenci.sinif);
        }
        System.out.println("\n#################\n");
        for (int i = 0; i < ogrenciler.size(); i++) {
            System.out.println("-------------------------------------------");
            var ogrenci = ogrenciler.get(i);
            switch (ogrenci.sira){
                case 1:
                    System.out.println("| "+ogrenci.sira +"       | "+ogrenci.ad+ " | "+ogrenci.soyad+"   | "+ogrenci.sinif+" |");
                break;

                case 12:     System.out.println("| "+ogrenci.sira +"      | "+ogrenci.ad+"       | "+ogrenci.soyad+" | "+ogrenci.sinif+" |");
                break;

                case 3:      System.out.println("| "+ogrenci.sira +"       | "+ogrenci.ad+"    | "+ogrenci.soyad+" | "+ogrenci.sinif+"  |");
                break;

            }
        }
        System.out.println("\n#################\n");
        for (int i = 0; i < ogrenciler.size(); i++) {
            var ogrenci=ogrenciler.get(i);
            System.out.println("-------------------------------------------");
            if (ogrenci.sira==1)
                System.out.println("| "+ogrenci.sira +"       | "+ogrenci.ad+ " | "+ogrenci.soyad+"   | "+ogrenci.sinif+" |");

            if (ogrenci.sira==12)
                System.out.println("| "+ogrenci.sira +"      | "+ogrenci.ad+"       | "+ogrenci.soyad+" | "+ogrenci.sinif+" |");

            if (ogrenci.sira==3)
                System.out.println("| "+ogrenci.sira +"       | "+ogrenci.ad+"    | "+ogrenci.soyad+" | "+ogrenci.sinif+"  |");
        }
        System.out.println("\n################################################################################\n");
        for (int i = 0; i < ogrenciler.size(); i++) {
            System.out.println("-------------------------------------------");
            var ogrenci = ogrenciler.get(i);
            switch (ogrenci.sira){
                case 1:
                    System.out.println(String.format("%1s %1s %7s %4s %5s %1s %3s %2s","|",ogrenci.sira , "|", ogrenci.ad, "|", ogrenci.soyad,"|",ogrenci.sinif,"|"));                    break;

                case 12:        System.out.println(String.format("%1s %1s %7s %4s %5s %1s %3s %2s","|",ogrenci.sira , "|", ogrenci.ad, "|", ogrenci.soyad,"|",ogrenci.sinif,"|"));
                    break;

                case 3:      System.out.println(String.format("%1s %1s %7s %4s %5s %1s %3s %2s","|",ogrenci.sira , "|", ogrenci.ad, "|", ogrenci.soyad,"|",ogrenci.sinif,"|"));
                    break;

            }
        }
        System.out.println("\n#################\n");
        for (int i = 0; i < ogrenciler.size(); i++) {
            System.out.println("-------------------------------------------");
            var ogrenci=ogrenciler.get(i);
            System.out.println(String.format("%-1s %-7s %-1s %-20s %-1s %-7s %-1s %-1s %-1s " ,"|",ogrenci.sira ,"|", ogrenci.ad, "|", ogrenci.soyad,"|",ogrenci.sinif,"|"));
        }
        var kemal = "Kemal";
        long numara1 = 1;
        var numara2 = 5;
        var numara3 =  numara1;
    }

}
