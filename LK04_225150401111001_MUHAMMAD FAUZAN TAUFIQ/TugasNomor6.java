import java.util.Scanner;

public class TugasNomor6 {
    public static void main(String[] args) {
        int januari, februari, maret, april, mei, juni, juli, agustus, september, oktober, november, desember;
        int hariKe, tanggal, addHari, totalHari, sisa;
        String bulan;

        Scanner input = new Scanner(System.in);

        januari = 31;
        februari = 28;
        maret = 31;
        april = 30;
        mei = 31;
        juni = 30;
        juli = 31;
        agustus = 31;
        september = 30;
        oktober = 31;
        november = 30;
        desember = 31;

        System.out.print("Masukan tanggal : ");
        tanggal = input.nextInt();
        input.nextLine();

        System.out.print("Masukan bulan : ");
        bulan = input.nextLine();

        hariKe = 0;

        switch (bulan) {
            case "Januari":
                break;
            case "Februari":
                hariKe = januari;
                break;
            case "Maret":
                hariKe = januari + februari;
                break;
            case "April":
                hariKe = januari + februari + maret;
                break;
            case "Mei":
                hariKe = januari + februari + maret + april;
                break;
            case "Juni":
                hariKe = januari + februari + maret + april + mei;
                break;
            case "Juli":
                hariKe = januari + februari + maret + april + mei + juni;
                break;
            case "Agustus":
                hariKe = januari + februari + maret + april + mei + juni + juli;
                break;
            case "September":
                hariKe = januari + februari + maret + april + mei + juni + juli + agustus;
                break;
            case "Oktober":
                hariKe = januari + februari + maret + april + mei + juni + juli + agustus + september;
                break;
            case "November":
                hariKe = januari + februari + maret + april + mei + juni + juli + agustus + september + oktober;
                break;
            case "Desember":
                hariKe = januari + februari + maret + april + mei + juni + juli + agustus + september + oktober
                        + november;
                break;
            default:
                System.out.println("Error!!");
        }

        hariKe = hariKe + tanggal;

        System.out.print("Masukan Hari : ");
        addHari = input.nextInt();

        totalHari = hariKe + addHari;
        sisa = totalHari % 365;

        if (sisa > januari) {
            sisa = sisa - januari;
            if (sisa > februari) {
                sisa = sisa - februari;
                if (sisa > maret) {
                    sisa = sisa - maret;
                    if (sisa > april) {
                        sisa = sisa - april;
                        if (sisa > mei) {
                            sisa = sisa - mei;
                            if (sisa > juni) {
                                sisa = sisa - juni;
                                if (sisa > juli) {
                                    sisa = sisa - juli;
                                    if (sisa > agustus) {
                                        sisa = sisa - agustus;
                                        if (sisa > september) {
                                            sisa = sisa - september;
                                            if (sisa > oktober) {
                                                sisa = sisa - oktober;
                                                if (sisa > november) {
                                                    sisa = sisa - november;
                                                    if (sisa > desember) {
                                                        sisa = sisa - desember;
                                                    } else {
                                                        System.out.println("Bulan : Desember ");
                                                        System.out.println("Tanggal : " + sisa);
                                                    }
                                                } else {
                                                    System.out.println("Bulan : November ");
                                                    System.out.println("Tanggal : " + sisa);
                                                }
                                            } else {
                                                System.out.println("Bulan : Oktober ");
                                                System.out.println("Tanggal : " + sisa);
                                            }
                                        } else {
                                            System.out.println("Bulan : September ");
                                            System.out.println("Tanggal : " + sisa);
                                        }
                                    } else {
                                        System.out.println("Bulan : Agustus ");
                                        System.out.println("Tanggal : " + sisa);
                                    }
                                } else {
                                    System.out.println("Bulan : Juli ");
                                    System.out.println("Tanggal : " + sisa);
                                }
                            } else {
                                System.out.println("Bulan : Juni ");
                                System.out.println("Tanggal : " + sisa);
                            }
                        } else {
                            System.out.println("Bulan : Mei ");
                            System.out.println("Tanggal : " + sisa);
                        }
                    } else {
                        System.out.println("Bulan : April ");
                        System.out.println("Tanggal : " + sisa);
                    }
                } else {
                    System.out.println("Bulan : Maret ");
                    System.out.println("Tanggal : " + sisa);
                }
            } else {
                System.out.println("Bulan : Februari ");
                System.out.println("Tanggal : " + sisa);
            }
        } else {
            System.out.println("Bulan : Januari ");
            System.out.println("Tanggal : " + sisa);
        }
        input.close();
    }
}