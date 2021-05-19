package com.jun.hnu.http;

import com.jun.hnu.IMessageReader;
import com.jun.hnu.IMessageReaderFactory;
import com.jun.hnu.MessageBuffer;

/**
 * Created by jun-HNU on 18-10-2020.
 */
public class HttpMessageReaderFactory implements IMessageReaderFactory {

    public HttpMessageReaderFactory() {
    }

    @Override
    public IMessageReader createMessageReader() {
        return new HttpMessageReader();
    }
}
