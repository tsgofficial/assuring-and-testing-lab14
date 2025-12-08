# Conflict Шийдвэрлэлт

## Conflict-ийн Дэлгэрэнгүй

`release/v1.0.0`-ийг `develop` руу нэгтгэхэд `./src/test/java/lab14/DivisionTest.java` дээр merge conflict гарсан. Conflict нь `DivisionTest` класс дотор 10 дугаар мөрний коммент дээр байсан.

## Шийдвэрлэлтийн Алхмууд

1. Онцлогын салбарт `git merge release/v1.0.0` ажиллуулсан.

2. `DivisionTest.java` дээрх conflict-ийг тодорхойлсон.

3. Файлыг засварлаж, хоёр салбарын комментийг нэгтгэсэн.

4. `git add .` ажиллуулсан.

5. `git commit` ажиллуулж merge-ийг дуусгасан.

6. Салбарыг push хийж, PR үүсгэсэн.
