package com.jun.hnu;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/**
 * Created by jun-HNU on 16-10-2020.
 */
public interface IMessageReader {

    public void init(MessageBuffer readMessageBuffer);

    public void read(Socket socket, ByteBuffer byteBuffer) throws IOException;

    public List<Message> getMessages();



}
