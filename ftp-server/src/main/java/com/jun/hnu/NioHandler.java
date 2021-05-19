package com.jun.hnu;
 
import java.nio.channels.SelectionKey;
 
public interface NioHandler {
	void execute(SelectionKey key);
}