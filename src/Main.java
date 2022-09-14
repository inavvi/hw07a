public class Main {
    public static void main(String[] args) {

        //Задание 1
        var salary=29000;
        var total=0;
        var m=1;
        for (; total<2459000; m++) {
            total=total+total/100;
            total=total+salary;
        }
        System.out.println("Месяц "+m+" сумма накоплений равна "+total+"рублей");

        //Задание 2
        var a=1;
        while (a<=10) {
            System.out.println(a);
            a++;
        }
        var b=10;
        for (; b>0; b--) {
            System.out.println(b);
        }

        //Задание 3
        var pTotal=12_000_000;
        var index=0;
        var growth=17-8;
        for (var i=1; i<=10; i++) {
            index=pTotal/1000;
            pTotal=pTotal+index*growth;
            System.out.println("Год "+i+" численность населения составляет "+pTotal);
        }

        //Задание 4
        var totalC=15000;
        int month=0;
        while (totalC<=12000_000) {
            totalC=totalC+totalC/100*7;
            month=month+1;
            System.out.println("Месяц "+month+" сумма вклада "+totalC);
        }

        //Задание 5
        var totalCb=15000;
        var amonth=0;
        while (totalCb<=12000_000) {
            amonth = amonth + 1;
            totalCb = totalCb + totalCb / 100 * 7;
            if (amonth % 6 == 0) {
                System.out.println("Месяц " + amonth + " сумма вклада " + totalCb);
            }
        }

        //Задание 6
        var totalCd=15000;
        var totalMonth=12*9;
        for (var mon=1; mon<=totalMonth; mon++) {
            totalCd = totalCd + totalCd / 100 * 7;
            if (mon % 6 == 0) {
                System.out.println("Месяц " + mon + " сумма вклада " + totalCd);
            }
        }

        //Задание 7
        var date=1;
        var friday=3;
        for (; date<=31; date++) {
            if (date==friday) {
                friday=friday+7;
                System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет.");
            }
        }

        //Задание 8
        var ago=2022-200;
        var after=2022+100;
        var year=0;
        for (var o=0; year<=after; o++) {
            year=year+79;
            if (year>=ago && year<=after) {
                System.out.println("Комету можно увидеть в " + year + " году.");
            }
        }

        //Задание 9
        var number=2;
        var totale=0;
        for (var indexa=1; indexa<=10; indexa++) {
            totale=number*indexa;
            System.out.println(+number+"*" + indexa + "="+totale);
        }
    }
}