
import java.util.*;

public class quiz3 {
    public static void main(String[] args) {
        int presensi;
        String nilaiHuruf;
        double nilaiAngka, mK;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Mata kuliah ((1) Pemrograman Dasar; (2) Algoritma dan Struktur Data; (3) Jaringan Komputer)!");
        mK = input.nextDouble();
        System.out.println("Masukkan Nilai Angka");
        nilaiAngka = input.nextDouble();
        if (mK == 1) {
            if (nilaiAngka > 80 && nilaiAngka <= 100) {
                nilaiHuruf = "A";
            } else {
                if (nilaiAngka > 75 && nilaiAngka <= 80) {
                    nilaiHuruf = "B+";
                } else {
                    if (nilaiAngka > 69 && nilaiAngka <= 75) {
                        nilaiHuruf = "B";
                    } else {
                        if (nilaiAngka > 60 && nilaiAngka <= 69) {
                            nilaiHuruf = "C+";
                        } else {
                            if (nilaiAngka > 55 && nilaiAngka <= 60) {
                                nilaiHuruf = "C";
                            } else {
                                if (nilaiAngka > 50 && nilaiAngka <= 55) {
                                    nilaiHuruf = "D+";
                                } else {
                                    if (nilaiAngka > 44 && nilaiAngka <= 50) {
                                        nilaiHuruf = "D";
                                    } else {
                                        nilaiHuruf = "E";
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!nilaiHuruf.equals("D+") || !nilaiHuruf.equals("D") || !nilaiHuruf.equals("E")) {
                System.out.println("Nilai mata kuliah Pemrograman Dasar adalah " + nilaiHuruf + ", selamat Anda lulus.");
            } else {
                System.out.println("Nilai mata kuliah Pemrograman Dasar adalah " + nilaiHuruf + ", maaf Anda tidak lulus, silakan mengulang kembali.");
            }
        } else {
            if (mK == 2) {
                if (nilaiAngka > 80 && nilaiAngka <= 100) {
                    nilaiHuruf = "A";
                } else {
                    if (nilaiAngka > 75 && nilaiAngka <= 80) {
                        nilaiHuruf = "B+";
                    } else {
                        if (nilaiAngka > 69 && nilaiAngka <= 75) {
                            nilaiHuruf = "B";
                        } else {
                            if (nilaiAngka > 60 && nilaiAngka <= 69) {
                                nilaiHuruf = "C+";
                            } else {
                                if (nilaiAngka > 55 && nilaiAngka <= 60) {
                                    nilaiHuruf = "C";
                                } else {
                                    if (nilaiAngka > 50 && nilaiAngka <= 55) {
                                        nilaiHuruf = "D+";
                                    } else {
                                        if (nilaiAngka > 44 && nilaiAngka <= 50) {
                                            nilaiHuruf = "D";
                                        } else {
                                            nilaiHuruf = "E";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (!nilaiHuruf.equals("D+") || !nilaiHuruf.equals("D") || !nilaiHuruf.equals("E")) {
                    System.out.println("Nilai mata kuliah Algoritma dan Struktur Data adalah " + nilaiHuruf + ", selamat Anda lulus.");
                } else {
                    System.out.println("Nilai mata kuliah Algoritma dan Struktur Data adalah " + nilaiHuruf + ", maaf Anda tidak lulus, silakan mengulang kembali.");
                }
            } else {
                if (mK == 3) {
                    if (nilaiAngka > 80 && nilaiAngka <= 100) {
                        nilaiHuruf = "A";
                    } else {
                        if (nilaiAngka > 75 && nilaiAngka <= 80) {
                            nilaiHuruf = "B+";
                        } else {
                            if (nilaiAngka > 69 && nilaiAngka <= 75) {
                                nilaiHuruf = "B";
                            } else {
                                if (nilaiAngka > 60 && nilaiAngka <= 69) {
                                    nilaiHuruf = "C+";
                                } else {
                                    if (nilaiAngka > 55 && nilaiAngka <= 60) {
                                        nilaiHuruf = "C";
                                    } else {
                                        if (nilaiAngka > 50 && nilaiAngka <= 55) {
                                            nilaiHuruf = "D+";
                                        } else {
                                            if (nilaiAngka > 44 && nilaiAngka <= 50) {
                                                nilaiHuruf = "D";
                                            } else {
                                                nilaiHuruf = "E";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!nilaiHuruf.equals("D+") || !nilaiHuruf.equals("D") || !nilaiHuruf.equals("E")) {
                        System.out.println("Nilai mata kuliah Jaringan Komputer adalah " + nilaiHuruf + ", selamat Anda lulus.");
                    } else {
                        System.out.println("Nilai mata kuliah Jaringan Komputer adalah " + nilaiHuruf + ", maaf Anda tidak lulus, silakan mengulang kembali.");
                    }
                }
            }
        }
    }
}

