package main.homework.playground.runners;

import main.homework.playground.essence.creatures.*;
import main.homework.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {
    public static void main(String[] str) {
        CrawlableProcessor crawlable = new CrawlableProcessor();

        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";
            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };

        crawlable.runCrawlable(crawlableCrocodile);
        crawlable.runCrawlable(crawlableBeetle);
        // crawlable.runCrawlable(vertebrataCrocodile);
        // crawlable.runCrawlable(insectBeetle);
        // Объекты vertebrataCrocodile и insectBeetle созданы через родительские классы, которые не имплементят интерфейс Crawlable.
        // Через ссылку типа родительского класса методы интерфейса будут недоступны, даже если они реализованы в дочернем классе.
        crawlable.runCrawlable(aCrocodile);
        crawlable.runCrawlable(aBeetle);
        crawlable.runCrawlable(anonymousCrawlable);
        crawlable.runCrawlable(aCrocodile, "NOWHERE");
        crawlable.runCrawlable(crawlableBeetle, "LEFT");
        crawlable.runCrawlable(aCrocodile, "BACK", 37);

        crawlable.runCrawlable(new Crawlable() {
            String name = "Random";
            public String getName() {
                return "";
            }
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %s units\n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        }, "DOWN", 37);
    }
}