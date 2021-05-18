package com.jun.hnu;

/**
 * Created by jun-HNU on 16-10-2020.
 */
public interface IMessageProcessor {

    public void process(Message message, WriteProxy writeProxy);

}
