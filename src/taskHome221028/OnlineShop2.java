package taskHome221028;

/*
К нам пришел клиент, который хочет разработать онлайн магазин, похожий на Amazon.
Ваша задача реализовать иерархию классов заказов.

В будущем онлайн магазине бывает два типа заказов:

1. Обычные заказы (для клиентов, которые не оплатили подписку)
2. Prime заказы (для клиентов которые оплатили подписку на Prime) -
у таких заказов время доставки быстрее и доставка всегда бесплатно
(то есть аналогично подписки на Amazon).

Попробуйте разрабтать следующую иерархию.
1. Абстрактный класс Order с полями
 - Название товара (строка),
 - Адрес доставки (строка),
 - Стоимость товара (целое или вещественное число),
 - Длительность доставки

Не абстрактным методом
  - Длительность доставки (getDeliveryDays), где возвращается поле длительность доставки,
и абстрактными методами
      - Стоимость товара с доставкой (getPriceWithDelivery),

2. Класс SimpleOrder - наследник от класса Order, в котором нужно задать
 - Длительность доставки - всегда 5 дней,

Реализовать метод getPriceWithDelivery
 - Стоимость товара с доставкой (getPriceWithDelivery) = стоимость товара + 8 евро,

2. Класс PrimeOrder (заказы для клиентов с Prime)
 - Длительность доставки - 3 дня

Реализовать метод getPriceWithDelivery
      - Стоимость товара с доставкой (getPriceWithDelivery) = стоимость товара,

Создать несколько классов с разных типов и разными данными, вывести данные товаров и
методов getDeliveryDays и getPriceWithDelivery.


Дополнительная сложность:
1. Попробуйте создать массив из Order, куда поместить несколько SimpleOrder
и PrimeOrder с разными данными, проитерироваться по нему (любым способом) и
вывести в консоль данные товаров и методов getDeliveryDays и getPriceWithDelivery.

2. Дополнительно к (1) попробуйте вывести так же является данным заказ обычным или
Prime проверяя реальный класс (напоминаю, это можно сделать с помощью getClass или
instanceof - если есть затруднения можно найти код в интернете по этим ключевым словам),

3. Попробуйте дополнительно создать класс Address в котором описать страну,
город, улицу, номер дома в отдельных полях и использовать его вместо строкого поля
address в классе Order. Во всех примерах выше, где нужно выводить данные, постарайтесь
вывести все данные из этого класса (можно использовать toString)
* */
public class OnlineShop2 {
    static abstract class Order {
        protected String productName;
        protected Double valueOfOrder;
        protected int deliveryTime;
        protected Address deliveryAddress;



        public Order(String productName, Double valueOfOrder) {
            this.productName = productName;
//            this.deliveryAddress = new Address(country, city, street, house, apartment);
            this.valueOfOrder = valueOfOrder;
        }

        int getDeliveryDays() {
            return deliveryTime;
        }

        public abstract double getPriceWithDelivery();
    }

    static class SimpleOrder extends Order {
        //protected int deliveryTime = 5;

        public SimpleOrder(String productName, Double valueOfOrder, String country, String city, String street, String house, String apartment) {
            super(productName, valueOfOrder);
            this.deliveryAddress = new Address(country, city, street, house, apartment);
            this.deliveryTime = 5;
        }

        public double getPriceWithDelivery() {
            return valueOfOrder + 8;
        }

        public void getType(){
            System.out.println("It is simple order");
        }

        @Override
        public String toString() {
            return "SimpleOrder{" +
                    "productName='" + productName + '\'' +
                    ", deliveryAddress='" + deliveryAddress + '\'' +
                    ", valueOfOrder=" + valueOfOrder +
                    ", deliveryTime=" + deliveryTime +
                    '}';
        }
    }

    static class PrimeOrder extends Order {
        //private int deliveryTime = 3;

        public PrimeOrder(String productName, Double valueOfOrder, String country, String city, String street, String house, String apartment) {
            super(productName, valueOfOrder);
            this.deliveryAddress = new Address(country, city, street, house, apartment);
            this.deliveryTime = 3;
        }

        public double getPriceWithDelivery() {
            return valueOfOrder;
        }

        public void getType(){
            System.out.println("It is prime order");
        }

        @Override
        public String toString() {
            return "PrimeOrder{" +
                    "productName='" + productName + '\'' +
                    ", deliveryAddress='" + deliveryAddress + '\'' +
                    ", valueOfOrder=" + valueOfOrder +
                    ", deliveryTime=" + deliveryTime +
                    '}';
        }
    }

    static class Address {
        String country;
        String city;
        String street;
        String house;
        String apartment;

        public Address(String country, String city, String street, String house, String apartment) {
            this.country = country;
            this.city = city;
            this.street = street;
            this.house = house;
            this.apartment = apartment;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", house='" + house + '\'' +
                    ", apartment='" + apartment + '\'' +
                    '}';
        }
    }

    public static void main (String[]args){
        PrimeOrder primeOrder01 = new PrimeOrder("iPhone", 1543.00, "Germany",
                "Frankfurt", "Krisbi", "3a", "1b");
        System.out.println(primeOrder01);
        System.out.println(primeOrder01.getDeliveryDays());
        System.out.println(primeOrder01.getPriceWithDelivery());
        System.out.println();
        SimpleOrder simpleOrder01 = new SimpleOrder("case for iPhone", 25.00, "Estonia",
                "Tallinn", "Oismae", "59", "50");
        System.out.println(simpleOrder01);
        System.out.println(simpleOrder01.getDeliveryDays());
        System.out.println(simpleOrder01.getPriceWithDelivery());
        System.out.println();
        PrimeOrder primeOrder02 = new PrimeOrder("iPAD", 700.00, "Germany",
                "Frankfurt", "Krisbi", "3a", "1b");
        System.out.println(primeOrder02);
        System.out.println(primeOrder02.getDeliveryDays());
        System.out.println(primeOrder02.getPriceWithDelivery());
        System.out.println();

        Order[] ourOrders = {primeOrder01, simpleOrder01, primeOrder02};
        double sumOrder = 0.00;
        for (Order ourOrder: ourOrders) {
            sumOrder += ourOrder.getPriceWithDelivery();
        }
        System.out.println("Сумма заказа вместе с доставкой " + sumOrder);
        System.out.println();
        for (int i = 0; i < ourOrders.length; i++) {
            System.out.println(ourOrders[i]);
            System.out.println(ourOrders[i].getDeliveryDays());
            System.out.println(ourOrders[i].getPriceWithDelivery());
            System.out.println();
        }

        for (Order order : ourOrders) {
            System.out.println(order);
            if(order instanceof SimpleOrder) {
                ((SimpleOrder) order).getType();
            } else {
                ((PrimeOrder) order).getType();
            }
        }
    }
}
