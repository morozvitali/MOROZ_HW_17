# MOROZ_HW_17
ДЗ 17. Узагальнення

1. Створити метод toList. Метод приймає на вхід масив і перетворює їх у список. Колекція зберігає такий самий тип даних, як і вхідний масив. 

Після перетворення необхідно повернути щойно створений список.

2. Скриньки-фрукти

2.1 Створити базовий тип Fruit.

2.2 Створити типи Apple, Orange які продають тип Fruit.

2.3. Створити тип Box. У коробку можна складати фрукти. Однак, в одну коробку не можна скласти фрукти одного типу. 

Наприклад: яблука з апельсинами буде неприпустимою комбінацією.

2.4. Реалізувати метод додавання фрукта (1 од.) до коробки.

2.5. Реалізувати метод додавання фруктів (множ.) у коробку.

2.6 Реалізувати метод getWeight(). Метод вираховує вагу коробки на підставі ваги одного фрукта та його кількості.

Вага: яблука – 1.0F, апельсина – 1.5F.

2.7 У класі Box реалізувати метод compare. Метод робить порівняння поточної коробки з переданою як параметр.

Повертати true - якщо їх ваги рівні, інакше - false

ВАЖЛИВО! Можна порівнювати коробки, що містять різні фрукти. Так, коробки з яблуками можна порівняти з коробками з апельсинами і так далі.

2.8 Реалізувати метод merge. Метод виконує пересип з переданої коробки як параметр, в поточну.  

Однак варто враховувати, що в одну коробку не можна скласти фрукти різного типу.
