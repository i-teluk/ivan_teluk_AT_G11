package main.homework.playground.processors;

import main.homework.playground.essence.creatures.Crawlable;
import main.homework.playground.utils.DirectionGenerator;
import main.homework.playground.utils.DistanceGenerator;

public class CrawlableProcessor {
    public void runCrawlable (Crawlable crawlable) {
        String direction = new DirectionGenerator().generateDirection();
        int distance = new DistanceGenerator().generateDistance();
        crawlable.crawl(direction, distance);
    }

    public void runCrawlable (Crawlable crawlable, String direction) {
        int distance = new DistanceGenerator().generateDistance();
        crawlable.crawl(direction, distance);
    }

    public void runCrawlable (Crawlable crawlable, String direction, int distance) {
        crawlable.crawl(direction, distance);
    }
}