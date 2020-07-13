package Demo01ByteStream;

/*
当使用字节流读取中文汉字时，由于字节流每次只能读取一个字节，而
utf-8下，一个中文为3个字节
GBK编码，一个中文为2个字节
也就是说我们无法一次性读取一个中文，就会产生乱码。

因此，我们需要学习字符流。
 */

public class Demo04TroubleOfByteStream {
}
