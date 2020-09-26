package lesson07;

public class ATM {

    private int banknote20;
    private int banknote50;
    private int banknote100;

    public ATM (int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void addManyToATM (int banknote20, int banknote50, int banknote100) {
        this.banknote20 = this.banknote20 + banknote20;
        this.banknote50 = this.banknote50 + banknote50;
        this.banknote100 = this.banknote100 + banknote100;
    }

    public void getInfoATM () {
        System.out.println("номинал 20$ - " + banknote20 + " штук; \nноминал 50$ - " + banknote50 + " штук; \nноминал 100$ - " + banknote100 + " штук;");
    }

    public void  getMoney(int sum) {
        if (this.banknote20 == 0 & this.banknote50 == 0 & this.banknote100 == 0 || this.banknote20 * 20 + this.banknote50 * 50 + this.banknote100 * 100 < sum)
            System.out.println("В банкомате недостаточно денежных средств.");

            int sum2;
            int sum3;
            String str100;
            String str50;
            String str20;

        for (int count100 = sum/100; count100 >= 0; count100--) {
                if (count100 > this.banknote100)
                    continue;
                sum2 = sum - count100*100;
                // вствить описание строки, создать метод для красивого вывода текста
                if (count100 > 0)
                    str100 = count100 + " купюр(а) по 100$";
                else
                    str100 = "";
                for (int count50 = sum2/50; count50 >= 0 ; count50--) {
                    if (count50 > this.banknote50)
                        continue;
                    sum3 = sum2 - count50*50; //30
                    if (count50 > 0)
                        str50 = count50 + " купюр(а) по 50$";
                    else
                        str50 = "";

                    for (int count20 = sum3/20; count20 >=0 ; count20--) {
                        if (count20 > this.banknote20)
                            continue;

                        if (count20 > 0)
                            str20 = count20 + " купюр(а) по 20$";
                        else
                            str20 = "";

                        if (count100*100+count50*50+ count20 *20 == sum) {
                            System.out.println("count100 = " + count100 + " count = " + count50 + " count20 = " + count20);
                            System.out.printf(str100 + ", " + str50 + ", " +  str20);
                            this.banknote100 -= count100;
                            this.banknote50 -= count50;
                            this.banknote20 -= count20;
                            count20 = 0;
                            count50 = 0;
                            count100 = 0;
                        }
                    }
                }
            }


    }

//    return ;}
//    public int getBanknote20 () {
//        return this.banknote20;
//    }
//    public int getBanknote50 () {
//        return this.banknote50;
//    }
//    public int getBanknote100 () {
//        return this.banknote100;
//    }

}
