import java.util.Scanner;
public class Main {
    public static void main(String[] args) {





        //variables HW1





        System.out.println();
        System.out.println("1 задание");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        System.out.println();
        System.out.println();
        System.out.println("2 задание");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        System.out.println();
        System.out.println();
        System.out.println("3 задание");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        System.out.println();
        System.out.println();
        System.out.println("4 задание");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        System.out.println();
        System.out.println();
        System.out.println("5 задание");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


        System.out.println();
        System.out.println();
        System.out.println("6 задание");
        var firstWeight = 78.2;
        var secondWeight = 82.7;
        var bothWeights = firstWeight + secondWeight;
        System.out.println("вес обоих боксеров: " + bothWeights + "кг");
        var weightDif = Math.abs(firstWeight - secondWeight);
        System.out.println("разница между весами боксеров: " + weightDif + "кг");


        System.out.println();
        System.out.println();
        System.out.println("7 задание");
        System.out.println("первый способ:");
        var maxWeight = Math.max(firstWeight, secondWeight);
        var minWeight = Math.min(firstWeight, secondWeight);
        var fWeightDif = maxWeight - minWeight;
        System.out.println(fWeightDif);

        System.out.println("второй способ:");
        var sWeightDif = maxWeight % minWeight;
        System.out.println(sWeightDif);


        System.out.println();
        System.out.println();
        System.out.println("8 задание");
        var hoursOfOperation = 640;
        var oneEmpHoursOfOperation = 8;
        var numOfEmp = hoursOfOperation / oneEmpHoursOfOperation;
        System.out.println("1: Всего работников в компании — " + numOfEmp + " человек.");
        numOfEmp = numOfEmp + 94;
        hoursOfOperation = hoursOfOperation + numOfEmp * 8;
        System.out.println("2: Если в компании работает " + numOfEmp + " человек, то всего " + hoursOfOperation + " часов работы может быть поделено между сотрудниками.");










        //variables HW2





        System.out.println();
        System.out.println("1-ое задание");
        byte one = 1;
        short two = 2;
        int three = 3;
        long four = 4;
        float five = 5;
        double six = 6;
        System.out.println("Значение переменной one с типом byte равно" + one);
        System.out.println("Значение переменной two с типом short равно" + two);
        System.out.println("Значение переменной three с типом int равно" + three);
        System.out.println("Значение переменной four с типом float равно" + four);
        System.out.println("Значение переменной five с типом float равно" + five);
        System.out.println("Значение переменной six с типом double равно" + six);


        System.out.println();
        System.out.println("2-ое задание");
        float a = 27.12F;
        long b = 987678965549L;
        float c = 2.786F;
        short d = -159;
        int e = 27897;
        byte f = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);


        System.out.println();
        System.out.println("3-ее задание");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short paper1 = 480;
        int sum = lp + as + ea;
        int pTOP = paper1/sum;
        System.out.println("На каждого ученика рассчитано " + pTOP + " листов бумаги");


        System.out.println();
        System.out.println("4-ое задание");
        byte prodO = 16;
        int prodT = prodO/2;
        int prodA = prodT*20;
        int prodB = prodT*60*24;
        int prodC = prodB*3;
        int prodD = prodC*30;
        System.out.println("За 20 минут машина произвела " +prodA+ " штук бутылок");
        System.out.println("За сутки машина произвела " +prodB+ " штук бутылок");
        System.out.println("За 3 дня машина произвела " +prodC+ " штук бутылок");
        System.out.println("За месяц машина произвела " +prodD+ " штук бутылок");


        System.out.println();
        System.out.println("5-ое задание");
        byte sch = 120;
        int scho = sch/6;
        int schoO = scho*4;
        int schoT = scho*2;
        System.out.println("В школе, где " +scho+ " классов, нужно " +schoT+ " банок белой краски и " +schoO+ " банок коричневой краски");


        System.out.println();
        System.out.println("6-ое задание");
        short bananas = 5*80;
        short milk = 105*2;
        short iceCream = 2*100;
        short eggs = 4*70;
        int weight6 = bananas+milk+iceCream+eggs;
        float weightKilo = weight6/1000F;
        System.out.println("Весь спортивного завтрака "+weight6+" грамм или "+weightKilo+" килограмм");


        System.out.println();
        System.out.println("7-ое задание");
        int weight7 = 7*1000;
        short min = 250;
        short max = 500;
        int timeIf250 = weight7/min;
        int timeIf500 = weight7/max;
        int averageLoss = (min+max)/2;
        int averageTime = weight7/averageLoss;
        System.out.println("если спорстмен будет терять 250 грамм в день, то у него уйдет на это "+timeIf250+" дней");
        System.out.println("если спорстмен будет терять 500 грамм в день, то у него уйдет на это "+timeIf500+" дней");
        System.out.println(averageTime+" дней в среднем понадоюится");


        System.out.println();
        System.out.println("8-ое задание");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float mashaInc = masha*1.1F;
        float denisInc = denis*1.1F;
        float kristinaInc = kristina*1.1F;
        int yearSalaryMasha = masha*12;
        int yearSalaryDenis = denis*12;
        int yearSalaryKristina = kristina*12;
        float yearSalaryMashaInc = mashaInc*12F;
        float yearSalaryDenisInc = denisInc*12F;
        float yearSalaryKristinaInc = kristinaInc*12F;
        float difMasha = yearSalaryMashaInc-yearSalaryMasha;
        float difDenis = yearSalaryDenisInc-yearSalaryDenis;
        float difKristina = yearSalaryKristinaInc-yearSalaryKristina;
        System.out.println("Маша теперь получает "+mashaInc+" рублей. Годовой доход вырос на "+difMasha+" рублей");
        System.out.println("Денис теперь получает "+denisInc+" рублей. Годовой доход вырос на "+difDenis+" рублей");
        System.out.println("Кристина теперь получает "+kristinaInc+" рублей. Годовой доход вырос на "+difKristina+" рублей");










        //conditional operator HW3





        //task 1
        System.out.println();
        System.out.println("Задание 1");
        System.out.println("Введите возраст человека:");
        Scanner console = new Scanner(System.in);
        int age1 = console.nextInt();
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен "+age1+", то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен "+age1+", то он не достиг совершеннолетия, нужно немного подождать");
        }


        //task 2
        System.out.println();
        System.out.println("Задание 2");
        System.out.println("Сколько сегодня градусов по цельсию?");
        double temperature = console.nextDouble();
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }


        //task 3
        System.out.println();
        System.out.println("Задание 3");
        System.out.println("Введите скорость, с которой ехал водитель: ");
        int speed = console.nextInt();
        if (speed>60){
            System.out.println("Если скорость "+speed+", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость "+speed+", то можно ездить спокойно");
        }


        //task 4
        System.out.println();
        System.out.println("Задание 4");
        System.out.println("Введите возраст человека: ");
        int age4 = console.nextInt();
        boolean timeToGoToWork = age4 >= 24;
        boolean yourPlaceAtTheUniversity = age4 >= 18 && age4 <24;
        boolean haveToGoToSchool = age4 >= 7 && age4 < 18;
        boolean youAreInKindergarden = age4 >=2 && age4 <= 6;
        if (timeToGoToWork){
            System.out.println("Если возраст человека равен "+age4+", то ему нужно ходить на работу");
        } else if (yourPlaceAtTheUniversity) {
            System.out.println("Если возраст человека равен "+age4+", то ему нужно ходить в университет");
        } else if (haveToGoToSchool) {
            System.out.println("Если возраст человека равен "+age4+", то ему нужно ходить в школу");
        } else if (youAreInKindergarden) {
            System.out.println("Если возраст человека равен "+age4+", то ему нужно ходить в детский сад");
        }


        //task 5
        System.out.println();
        System.out.println("Задание 5");
        System.out.println("Введите возраст ребенка: ");
        int age5 = console.nextInt();
        boolean needEscort = age5>=5 && age5<14;
        if (age5<5) {
            System.out.println("Если возраст ребенка равен "+age5+", то ему нельзя кататься на аттракционе");
        } else if (needEscort) {
            System.out.println("Если возраст ребенка равен "+age5+", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен "+age5+", то ему можно кататься на аттракционе без сопровождения взрослого");
        }


        //task 6
        System.out.println();
        System.out.println("Задание 6");
        System.out.println("Введите количество пассажиров: ");
        int places = 102;
        int seating = 60;
        int standingPlaces = places - seating;
        int passengers = console.nextByte();
        if (passengers>=seating && passengers<places){
            places = places-passengers;
            System.out.println("В вагоне "+places+" свободных стоячих мест");
        } else if (passengers<seating) {
            seating = seating - passengers;
            System.out.println("В вагоне "+standingPlaces+" свободных стоячих мест и "+seating+" свободных сидячих мест");
        } else {
            System.out.println("В вагоне смободных мест нет");
        }


        //task 7
        System.out.println();
        System.out.println("Задание 7");
        System.out.println("Введите 3 различных числа, нажимая ENTER после каждого написаного числа: ");
        double one1 = console.nextDouble();
        double two2 = console.nextDouble();
        double three3 = console.nextDouble();
        if (one1>two2 && one1>three3){
            System.out.println("Наибольшим числом является "+one1);
        } else if (two2>one1 && two2>three3){
            System.out.println("Наибольшим числом является "+two2);
        } else if (three3>two2 && three3>one1) {
            System.out.println("Наибольшим числом является "+three3);
        }










        //conditional operator HW4





        //task 1
        System.out.println("Задание 1");
        System.out.println("Введите 0, если у Ваша операционная система - iOS; 1, если Android.");
        char clientOS = (char) console.nextInt();
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Вы ввели не ту цифру");
        }


        //task 2
        System.out.println();
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        System.out.println("Введите год выпуска вашего телефона:");
        int yearOfRealize = console.nextInt();
        System.out.println("Введите 0, если у Ваша операционная система - iOS; 1, если Android.");
        int clientOS2 = console.nextInt();
        if (yearOfRealize<clientDeviceYear && clientOS2==0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (yearOfRealize<clientDeviceYear && clientOS2==1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (yearOfRealize>=clientDeviceYear && clientOS2==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (yearOfRealize>=clientDeviceYear && clientOS2==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Вы ввели что-то не так, введите, пожалуйста, данные корректно");
        }


        //task3
        System.out.println();
        System.out.println("Задание 3");
        System.out.println("Введите интересующий Вас год");
        int year = console.nextInt();
        if (year%4==0){
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Этот год не является високосным");
        }


        //task4
        System.out.println();
        System.out.println("Задание 4");
        System.out.println("Введите дистанцию до клиента");
        int deliveryDistance = console.nextInt();
        int deliveryTime = 0;
        if (deliveryDistance<=20){
            deliveryTime =deliveryTime +1;
            System.out.println("для доставки потребуется дней: "+ deliveryTime);
        } else if (deliveryDistance<=60) {
            deliveryTime =deliveryTime +2;
            System.out.println("для доставки потребуется дней: "+ deliveryTime);
        } else if (deliveryDistance<=100){
            deliveryTime =deliveryTime +3;
            System.out.println("для доставки потребуется дней: "+ deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }


        //task 5
        System.out.println();
        System.out.println("Задание 5");
        System.out.println("Введите номер месяца");
        char monthNumber = (char) console.nextInt();
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
                break;
        }










        //cycles HW5





        //task 1
        System.out.println("Задание 1");
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        //task 2
        System.out.println();
        System.out.println("Задание 2");
        for (int j=10; j>=1; j=j-1){
            System.out.println(j);
        }

        //task 3
        System.out.println();
        System.out.println("Задание 3");
        for (int h = 2; h<=17; h=h+2){
            System.out.println(h);
        }

        //task 4
        System.out.println();
        System.out.println("Задание 4");
        for (int y = 10; y>=-10; y--){
            System.out.println(y);
        }

        //task 5
        System.out.println();
        System.out.println("Задание 5");
        for (int ee = 1904; ee<=2096; ee++){
            System.out.println(ee);
        }

        //task 6
        System.out.println();
        System.out.println("Задание 6");
        for (int s = 7; s<=98; s=s+7){
            System.out.println(s);
        }

        //task 7
        System.out.println();
        System.out.println("Задание 7");
        for (int aa = 1; aa<=512; aa=aa*2){
            System.out.println(aa);
        }

        //task 8
        System.out.println();
        System.out.println("Задание 8");
        int salary = 29000;
        for (int m=1; m<=12; m++){
            salary = salary+29000;
            System.out.println("В "+m+" месяце, сумма накоплений равна "+salary);
        }

        //task 9
        System.out.println();
        System.out.println("Задание 9");
        double salary2 = 29000;
        for (int mo=1; mo<=11; mo++){
            salary2 = salary2+29000;
            System.out.println("В "+mo+" месяце, сумма накоплений равна "+salary2);
        }
        salary2=(salary2+12*29000)*1.12;
        System.out.println("В 12 месяце, сумма накоплений равна "+salary2);


        //task10
        System.out.println();
        System.out.println("Задание 10");
        for(int count = 1; count<=10; count++){
            System.out.println(count*2);
        }
    }
}