public class Main {
    public static void main(String[] args) {


        byte potato = 100;
        System.out.println(" значение переменной potato с типом byte равно " +potato);
        short eggs = 1000;
        System.out.println(" значение переменной eggs с типом short равно " +eggs);
        int onion = 10000;
        System.out.println("значение переменной onion с типом int равно " +onion);
        long tomato = 100000;
        System.out.println("значение переменной tomato c типом long равно " +tomato);
        float sugar = 3.75f;
        System.out.println("значение переменной sugar c типом float равно " +sugar);
        double coarseMeal = 5.757;
        System.out.print("значение переменной coarseMeal с типом double равно "  +coarseMeal);


        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.print(c);
        short d = 569;
        System.out.print(d);
        short e = -159;
        System.out.print(e);
        short f = 27897;
        System.out.print(f);
        byte g = 67;
        System.out.print(g);

        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int totalUnit = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int paperUnit = 480 / totalUnit;
        System.out.print(" на каждого ученика рассчитано " +paperUnit+ " листов бумаги");


        byte bottleMakerTwoMinutes = 16;
        int oneMinutes = bottleMakerTwoMinutes / 2 ;
        int twentyMinutes = oneMinutes * 20;
        System.out.println(" за 20 минут машина произвела " + twentyMinutes+ " бутылок ");
        int oneDay = oneMinutes * 24 * 60;
        System.out.println(" за сутки машина произвела " + oneDay+ " бутылок");
        int threeDays = oneDay * 3;
        System.out.println(" за 3 дня машина произвела " + threeDays+ " бутылок");
        int oneMonth = oneDay * 30;
        System.out.println(" за один месяц машина произвела " + oneMonth+ " бутылок");


        byte totalPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int oneClassQuantity = whitePaint + brownPaint;
        int totalClass = totalPaint / oneClassQuantity;
        int totalWhitePaint = whitePaint * totalClass;
        int totalBrownPaint = brownPaint * totalClass;
        System.out.println("в школе, где " + totalClass + " классов, нужно " +totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");


        short bananaPart = 80 * 5;
        short milkPart = 105 * 2;
        short iceCream = 100 * 2;
        short eggPart = 70 * 4;
        int totalWeight = bananaPart + milkPart + iceCream + eggPart;
        float totalKg = totalWeight / 1000f;
        System.out.println(" вес спортзавтрака составляет " + totalWeight+ " грамм");
        System.out.println(" вес спортзавтрака составляет " + totalKg+ " килограмм");



        short longWay = 7000 / 250;
        short shortWay = 7000 / 500;
        int averageWay = (longWay + shortWay)/2;
        System.out.println(" при простой диете потребуется на похудение " +longWay+ " дней");
        System.out.println(" при жесткой диете потребуется на похудение " +shortWay+ " дней");
        System.out.println(" в среднем потребуется " + averageWay+ " день");

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float mashaNew = mashaSalary + (mashaSalary * 0.1f);
        float denisNew = denisSalary + (denisSalary * 0.1f);
        float kristinaNew = kristinaSalary + (kristinaSalary * 0.1f);
        float mashaYear = (mashaSalary * 0.1f) * 12;
        float denisYear = (denisSalary * 0.1f) * 12;
        float kristinaYear = (kristinaSalary * 0.1f) * 12;
        float totalYear = mashaYear + denisYear + kristinaYear;
        System.out.println(" маша теперь получает " + mashaNew+ " рублей. Годовой доход вырос на " + mashaYear+ " рублей");
        System.out.println(" денис теперь получает " + denisNew+ " рублей. Годовой доход вырос на " + denisYear+ " рублей");
        System.out.println(" кристина теперь получает " + kristinaNew+ " рублей. Годовой доход вырос на " +kristinaYear+ " рублей");
        System.out.println(" общая разница в годовом доходе составляет " + totalYear + " рублей");






    }}