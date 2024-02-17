public class Main {
    public static void main(String[] args) {
        // Задача №1
        //Объявите переменные типа int, byte, short, long, float, double.
        //Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
        //Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
        byte valByte = 3;
        short valShort = 1500;
        int valInt = - 60000;
        long valLong = 153060120L;
        float valFloat = 1.5f;
        double valDouble = 30.00;
        System.out.println("Значение перемемнной 'valByte' с типом 'byte' равно " + valByte);
        System.out.println("Значение перемемнной 'valShort' с типом 'short' равно " + valShort);
        System.out.println("Значение перемемнной 'valInt' с типом 'int' равно " + valInt);
        System.out.println("Значение перемемнной 'valLong' с типом 'long' равно " + valLong);
        System.out.println("Значение перемемнной 'valFloat' с типом 'float' равно " + valFloat);
        System.out.println("Значение перемемнной 'valDouble' с типом 'double' равно " + valDouble);

        //Задача №2
        // Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
        float oneVariable = 27.12f;
        long twoVariable = 987678965549L;
        float threeVariable = 2.786f;
        short fouVariable = 569;
        int fiveVariable = -159;
        short sixVariable = 27897;
        byte sevenVariable = 67;

        // Задача №3
        //Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        //У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
        //Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        //Для объявления переменных не используйте тип var.
        short classroomLiudmilaPavlovna = 23;
        short classroomAnnaSergeevna = 27;
        short classroomEkaterinaAndreevna = 30;
        int totalPaperSheets = 480;
        int paperSheets = totalPaperSheets/(classroomLiudmilaPavlovna+classroomAnnaSergeevna+classroomEkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + paperSheets + " листов бумаги");

        //Задача №4
        //Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
        //за 20 минут, в сутки, за 3 дня, за 1 месяц?
        //Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
        //Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        //Для объявления переменных не используйте тип var.
        // присвоим значению bottleValue 8, это количество изготовленных бутылок за 1 минуту
        byte bottleValue = 8;
        int time = 1;
        //производительность за 20 минут
        time = time*20;
        int productivityTwentyMinutes = time * bottleValue;
        //производительность за сутки (1 час = 60 мин, в сутках 24 часа)
        time = 60*24;
        int productivityOneDay = time * bottleValue;
        //производительность за 3 дня (24 часа = 1440 минут)
        time = 1440*3;
        int productivityThreeDays = time * bottleValue;
        //производительность за 1 месяц (будем считать месяц равным 30 дням, так как обратное не указано в задаче)
        time = 1440*30;
        int productivityOneMonth = time * bottleValue;
        System.out.println("За 20 минут машина произвела " + productivityTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivityOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivityThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + productivityOneMonth + " штук бутылок");

        //Задача №5
        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой
        // и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        //Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
        //Для объявления переменных не используйте тип var.
        byte totalPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        //общее количество банок для 1 класса
        int classroomPaint = whitePaint + brownPaint;
        //количество классов
        int classroomValue = totalPaint/classroomPaint;
        //считаем краску
        int totalWhitePaint = classroomValue*2;
        int totalBrownPaint = classroomValue*4;
        System.out.println("В школе, где " + classroomValue + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        //Задача №6
        //Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        //Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        //
        // Бананы — 5 штук (1 банан — 80 грамм).
        // Молоко — 200 мл (100 мл = 105 грамм).
        // Мороженое-пломбир — 2 брикета по 100 грамм.
        // Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        //Смешать всё в блендере — и готово.
        //
        //Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
        //Результат в граммах и килограммах напечатайте в консоль.
        //Важное условие: если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом),
        //то нужно умножать количество единиц на вес в граммах. Например, если в рецепте указано, что нужно
        //добавить 5 бананов по 80 грамм, то нужно количество бананов (5) умножить на вес одного (80 грамм), а не считать самим общую сумму граммов.
        short weightBanana = 80;
        short weightMilk = 105;
        short weightIcecream = 100;
        short weightEggs = 70;
        int weightBreakfastGrams = (5 * weightBanana) + (2 * weightMilk) + (2 * weightIcecream) + (4 * weightEggs);
        //в 1 грамме = 0,001 киллограмм или 1000 грамм в 1 киллограмме
        float weightBreakfastKilos = (float) weightBreakfastGrams / 1000;
        System.out.println("Вес спортзавтрака = " + weightBreakfastGrams + " грамм или " + weightBreakfastKilos + " киллограмм");

        //Задача №7
        //Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
        //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько —
        // если каждый день будет худеть на 500 грамм.
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        //Результаты всех подсчетов выведите в консоль.
        short sportsmanWeightLine = 7;
        short loseDayWeightMin = 250;
        short loseDayWeightMax = 500;
        //приведем значения веса к граммам: в 1 киллограмме - 1000 грамм
        int totalDaysMin = sportsmanWeightLine * 1000 / loseDayWeightMin;
        int totalDaysMax = sportsmanWeightLine * 1000 / loseDayWeightMax;
        int midWeight = (loseDayWeightMax+loseDayWeightMin)/2;
        int totalMidDays = sportsmanWeightLine * 1000 / midWeight;
        int midDays = (totalDaysMax + totalDaysMin) / 2;
        System.out.println("В среднем " + totalMidDays + " дней");
        System.out.println("Для сброса " + sportsmanWeightLine + " киллограмм, при потере веса " + loseDayWeightMin + " грамм в день, потребуется " + totalDaysMin + " дней");
        System.out.println("Для сброса " + sportsmanWeightLine + " киллограмм, при потере веса " + loseDayWeightMax + " грамм в день, потребуется " + totalDaysMax + " дней");

        //Задача №8
        //Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        // В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        // Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        // Каждый год повышение составляет 10% от текущей зарплаты.
        //К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        //
        //Маша получает 67 760 рублей в месяц.
        //Денис получает 83 690 рублей в месяц.
        //Кристина получает 76 230 рублей в месяц.
        //Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать
        //разницу между годовым доходом с нынешней зарплатой и после повышения.
        //
        //Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        //Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        byte highKoeff = 10;
        //увеличиваем зарплату на 10% от текущей (
        int salaryMashaHigh = salaryMasha + ((salaryMasha*highKoeff)/100);
        int salaryDenisHigh = salaryDenis + ((salaryDenis*highKoeff)/100);
        int salaryKristinaHigh = salaryKristina + ((salaryKristina*highKoeff)/100);
        //считаем зарплаты за год до повышения (1 год = 12 месяцев)
        int yearSalaryMasha = salaryMasha * 12;
        int yearSalaryDenis = salaryDenis * 12;
        int yearSalaryKristina = salaryKristina * 12;
        //считаем зарплату после повышения
        int yearSalaryMashaHigh = salaryMashaHigh * 12;
        int yearSalaryDenisHigh = salaryDenisHigh * 12;
        int yearSalaryKristinaHigh = salaryKristinaHigh * 12;
        //считаем разницу
        int yearDiffMasha = yearSalaryMashaHigh - yearSalaryMasha;
        int yearDiffDenis = yearSalaryDenisHigh - yearSalaryDenis;
        int yearDiffKristina = yearSalaryKristinaHigh - yearSalaryKristina;
        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + yearDiffMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + yearDiffDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristina + " рублей. Годовой доход вырос на " + yearDiffKristina + " рублей");
    }
}