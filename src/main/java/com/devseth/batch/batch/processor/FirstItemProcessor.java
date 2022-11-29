package com.devseth.batch.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class FirstItemProcessor implements ItemProcessor<Integer,Long> {
    @Override
    public Long process(Integer item) throws Exception {
        System.out.println("inside Item Processor ");
        return Long.valueOf(item + 20);
    }
}
